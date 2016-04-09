package io.clickhandler.reactGwt.client.action;

import com.google.web.bindery.event.shared.HandlerRegistration;
import io.clickhandler.reactGwt.client.BusDelegate;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Try;

import javax.inject.Provider;

/**
 * Maintains the lifecycle of a single Action call.
 *
 * @author Clay Molocznik
 */
public class ActionCall<IN, OUT> implements HandlerRegistration {
    HandlerRegistration reg;
    private IN request;
    private io.clickhandler.reactGwt.client.action.ErrorCallback errorCallback;
    private io.clickhandler.reactGwt.client.action.ResponseCallback<OUT> response;
    private Func.Run willSend;
    private io.clickhandler.reactGwt.client.action.AlwaysCallback alwaysCallback;
    private boolean wasDispatched;
    private Func.Run1<IN> dispatch;
    private Func.Run disposedCallback;
    private Provider<IN> requestProvider;
    private int timeoutMillis;
    private boolean disposed;

    ActionCall(Func.Run1<IN> dispatch, Provider<IN> requestProvider) {
        this.dispatch = dispatch;
        this.requestProvider = requestProvider;
    }

    /**
     * @param action
     * @param <H>
     * @param <IN>
     * @param <OUT>
     * @return
     */
    public static <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> create(Provider<H> action) {
        return create(action.get());
    }

    public static <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> create(H action) {
        return create(null, action);
    }

    public static <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> create(BusDelegate bus, Provider<H> action) {
        return create(bus, action.get());
    }

    public static <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> create(BusDelegate bus, H action) {
        final ActionCall<IN, OUT> call = action.build();
        if (bus != null)
            call.reg = bus.register(call);
        return call;
    }

    public int timeoutMillis() {
        return timeoutMillis;
    }

    /**
     * @param timeoutMillis
     * @return
     */
    public ActionCall<IN, OUT> timeoutMillis(int timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
        return this;
    }

    /**
     * @param request
     * @return
     */
    public ActionCall<IN, OUT> request(IN request) {
        this.request = request;
        enqueueSend();
        return this;
    }

    /**
     * @param callback
     * @return
     */
    public ActionCall<IN, OUT> buildRequest(RequestCallback<IN> callback) {
        this.request = requestProvider.get();
        callback.run(this.request);
        enqueueSend();
        return this;
    }

    /**
     * @param callback
     * @return
     */
    public ActionCall<IN, OUT> onResponse(io.clickhandler.reactGwt.client.action.ResponseCallback<OUT> callback) {
        this.response = callback;
        return this;
    }

    /**
     * @param callback
     * @return
     */
    public ActionCall<IN, OUT> willSend(Func.Run callback) {
        this.willSend = callback;
        return this;
    }

    /**
     * @param errorCallback
     * @return
     */
    public ActionCall onError(io.clickhandler.reactGwt.client.action.ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
        return this;
    }

    /**
     * @param alwaysCallback
     * @return
     */
    public ActionCall<IN, OUT> always(io.clickhandler.reactGwt.client.action.AlwaysCallback alwaysCallback) {
        this.alwaysCallback = alwaysCallback;
        return this;
    }

    public ActionCall<IN, OUT> disposed(Func.Run disposedCallback) {
        this.disposedCallback = disposedCallback;
        return this;
    }

    private void enqueueSend() {
        Try.later(this::send);
    }

    void onResponse(OUT response) {
        try {
            if (this.response != null)
                this.response.call(response);
        } catch (Throwable e) {
            failed(e);
        } finally {
            this.response = null;
            always();
        }
    }

    void onError(Throwable e) {
        Try.silent(() -> always());

        try {
            if (errorCallback != null)
                errorCallback.run(e);
        } finally {
            errorCallback = null;
        }
    }

    void always() {
        if (alwaysCallback == null) return;

        try {
            Try.later(() -> alwaysCallback.run(wasDispatched));
        } finally {
            alwaysCallback = null;
            cleanup();
        }
    }

    void failed(Throwable e) {
        try {
            if (errorCallback != null)
                errorCallback.run(e);
        } catch (Throwable e2) {
            // Ignore.
        } finally {
            errorCallback = null;

            // Call always.
            always();
        }
    }

    public ActionCall<IN, OUT> send() {
        if (dispatch != null) {
            try {
                if (willSend != null) {
                    try {
                        willSend.run();
                    } finally {
                        willSend = null;
                    }
                }

                try {
                    dispatch.run(request);
                } finally {
                    dispatch = null;
                    wasDispatched = true;
                }
            } catch (Throwable e) {
                failed(e);
            } finally {
                dispatch = null;
                willSend = null;
            }
        }
        return this;
    }

    public void cleanup() {
        if (disposed) return;
        disposed = true;

        if (reg != null)
            Try.silent(() -> reg.removeHandler());
        reg = null;

        requestProvider = null;
        errorCallback = null;
        dispatch = null;
        willSend = null;

        Try.silent(this::always);

        if (disposedCallback != null)
            Try.silent(disposedCallback);
    }

    @Override
    public void removeHandler() {
        cleanup();
    }
}