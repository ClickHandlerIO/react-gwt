package io.clickhandler.reactGwt.client.react;

import com.google.web.bindery.event.shared.HandlerRegistration;
import io.clickhandler.reactGwt.client.action.AbstractAction;
import io.clickhandler.reactGwt.client.action.ActionCall;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Provider;

/**
 * Internal React Component class.
 */
@JsType(isNative = true)
public interface ReactComponent<P, S> {
    @JsProperty(name = React.BUS)
    io.clickhandler.reactGwt.client.BusDelegate getBus();

    @JsProperty
    P getProps();

    @JsProperty
    S getState();

    @JsOverlay
    default S state() {
        return getState();
    }

    /**
     * @param state
     */
    @JsMethod
    void setState(S state);

    /**
     * @param state
     */
    @JsMethod
    void setState(S state, io.clickhandler.reactGwt.client.Func.Run callback);

    @JsMethod
    void replaceState(S state);

    @JsMethod
    void replaceState(S state, io.clickhandler.reactGwt.client.Func.Run callback);

    @JsMethod
    void forceUpdate();

    @JsMethod
    void forceUpdate(io.clickhandler.reactGwt.client.Func.Run callback);


    @JsOverlay
    default void cleanup() {
        final io.clickhandler.reactGwt.client.BusDelegate bus = getBus();
        if (bus != null) {
            bus.clear();
        }
    }

    @JsOverlay
    default <H extends AbstractAction<IN, OUT>, IN, OUT> ActionCall<IN, OUT> dispatch(Provider<H> action) {
        return ActionCall.create(getBus(), action);
    }

    @JsOverlay
    default <T> T ref(Ref<T> ref) {
        return ref.get(this);
    }

    @JsOverlay
    default <T> void setRef(Ref<T> ref, T value) {
        ref.set(this, value);
    }

    @JsOverlay
    default <T> T getProperty(String name) {
        return io.clickhandler.reactGwt.client.Reflection.get(this, name);
    }

    @JsOverlay
    default void setState(io.clickhandler.reactGwt.client.Func.Run1<S> stateCallback) {
        final S state = io.clickhandler.reactGwt.client.Jso.create();
        if (stateCallback != null) {
            stateCallback.run(state);
        }
        setState(state);
    }

    /**
     * @param eventClass
     * @param callback
     * @param <T>
     * @return
     */
    @JsOverlay
    default <T> HandlerRegistration subscribe(Class<T> eventClass, io.clickhandler.reactGwt.client.EventCallback<T> callback) {
        return register(getBus().subscribe(eventClass, callback));
    }

    /**
     * @param named
     * @param callback
     * @param <T>
     * @return
     */
    @JsOverlay
    default <T> HandlerRegistration subscribe(io.clickhandler.reactGwt.client.Bus.TypeName<T> named, io.clickhandler.reactGwt.client.EventCallback<T> callback) {
        return register(getBus().subscribe(named, callback));
    }

    /**
     * @param name
     * @param callback
     * @param <T>
     * @return
     */
    @JsOverlay
    default <T> HandlerRegistration subscribe(String name, io.clickhandler.reactGwt.client.EventCallback<T> callback) {
        return register(getBus().subscribe(name, callback));
    }

    /**
     * @param registration
     * @return
     */
    @JsOverlay
    default HandlerRegistration register(HandlerRegistration registration) {
        return getBus().register(registration);
    }

    /**
     * @param event
     * @param <T>
     */
    @JsOverlay
    default <T> void publish(T event) {
        getBus().publish(event);
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    @JsOverlay
    default <T> void publish(io.clickhandler.reactGwt.client.Bus.TypeName<T> name, T event) {
        getBus().publish(name, event);
    }

    /**
     * @param name
     * @param event
     * @param <T>
     */
    @JsOverlay
    default <T> void publish(String name, T event) {
        getBus().publish(name, event);
    }
}
