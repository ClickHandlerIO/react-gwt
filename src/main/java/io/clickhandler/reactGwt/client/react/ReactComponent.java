package io.clickhandler.reactGwt.client.react;

import com.google.web.bindery.event.shared.HandlerRegistration;
import io.clickhandler.reactGwt.client.*;
import io.clickhandler.reactGwt.client.action.AbstractAction;
import io.clickhandler.reactGwt.client.action.ActionCall;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Provider;


@JsType(isNative = true)
public interface ReactComponent<P, S> {
    @JsProperty(name = React.BUS)
    BusDelegate getBus();

    P getProps();

    S getState();

    @JsOverlay
    default <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> dispatch(Provider<H> action) {
        return ActionCall.create(getBus(), action);
    }

    @JsOverlay
    default <T> T getProperty(String name) {
        return Reflection.get(this, name);
    }

    /*
     * State
     */

    void setState(S state);

    void setState(S state, Func.Run callback);

    @JsOverlay
    default void setState(Func.Run1<S> stateCallback) {
        setState(stateCallback, null);
    }

    @JsOverlay
    default void setState(Func.Run1<S> stateCallback, Func.Run callback) {
        final S state = Jso.create();
        if (stateCallback != null) {
            stateCallback.run(state);
        }
        if (callback != null) {
            setState(state, callback);
        } else {
            setState(state);
        }
    }

    void replaceState(S state);

    void replaceState(S state, Func.Run callback);

    @JsOverlay
    default void replaceState(Func.Run1<S> stateCallback) {
        replaceState(stateCallback, null);
    }

    @JsOverlay
    default void replaceState(Func.Run1<S> stateCallback, Func.Run callback) {
        final S state = Jso.create();
        if (stateCallback != null) {
            stateCallback.run(state);
        }

        if (callback != null) {
            replaceState(state, callback);
        } else {
            replaceState(state);
        }
    }

    void forceUpdate();

    void forceUpdate(Func.Run callback);

    /*
     * Ref
     */

    // todo use this at all?
    @JsOverlay
    default <T> T ref(Ref<T> ref) {
        return ref.get(this);
    }

    // todo use this at all?
    @JsOverlay
    default <T> void setRef(Ref<T> ref, T value) {
        ref.set(this, value);
    }

    /*
     * Event subscribe / publish
     */

    @JsOverlay
    default void eventRegistrationCleanup() {
        final BusDelegate bus = getBus();
        if (bus != null) {
            bus.clear();
        }
    }

    @JsOverlay
    default <T> HandlerRegistration subscribe(Class<T> eventClass, EventCallback<T> callback) {
        return register(getBus().subscribe(eventClass, callback));
    }

    @JsOverlay
    default <T> HandlerRegistration subscribe(Bus.TypeName<T> named, EventCallback<T> callback) {
        return register(getBus().subscribe(named, callback));
    }

    @JsOverlay
    default <T> HandlerRegistration subscribe(String name, EventCallback<T> callback) {
        return register(getBus().subscribe(name, callback));
    }

    @JsOverlay
    default HandlerRegistration register(HandlerRegistration registration) {
        return getBus().register(registration);
    }

    @JsOverlay
    default <T> void publish(T event) {
        getBus().publish(event);
    }

    @JsOverlay
    default <T> void publish(Bus.TypeName<T> name, T event) {
        getBus().publish(name, event);
    }

    @JsOverlay
    default <T> void publish(String name, T event) {
        getBus().publish(name, event);
    }
}
