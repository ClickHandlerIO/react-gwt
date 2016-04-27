package io.clickhandler.reactGwt.client.react;

import io.clickhandler.gwtLumberjack.client.Logger;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Jso;
import io.clickhandler.reactGwt.client.Reflection;
import io.clickhandler.reactGwt.client.dom.DOM;


public abstract class ExternalComponent<P> {

    protected final Logger log = Logger.get(getClass());

    public ExternalComponent() {
    }

    protected abstract ReactClass<P> getReactClass();

    /*
     * Props
     */

    private P createProps() {
        P props = Jso.create();
        if (Reflection.get(getReactClass(), "getDefaultProps") != null) {
            Reflection.assign(props, getReactClass().getDefaultProps());
        }
        applyDefaults(props);
        return props;
    }


    protected void applyDefaults(P props) {
        log.trace("applyDefaults(props)", props);
        // Allows a place for subclasses to set defaults
    }

    /*
     * Factory Methods
     */

    public ReactElement createElement() {
        log.trace("createElement()");
        return React.createElement(getReactClass(), createProps());
    }

    public ReactElement createElement(String key) {
        log.trace("createElement(key)", key);
        P props = createProps();
        if (key != null) {
            Reflection.set(props, "key", key);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Object... children) {
        log.trace("createElement(children)", children);
        return React.createElement(getReactClass(), createProps(), children);
    }

    public ReactElement createElement(String key, Object... children) {
        log.trace("createElement(key, children)", key, children);
        P props = createProps();
        if (key != null) {
            Reflection.set(props, "key", key);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(P props) {
        log.trace("createElement(props)", props);
        if (props == null) {
            props = Jso.create();
        }
        Reflection.assign(props, createProps());
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback) {
        log.trace("createElement(propsCallback)");
        final P props = createProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        log.trace("createElement(propsCallback, children)", children);
        final P props = createProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(Func.Run2<P, DOM.ChildList> callback) {
        log.trace("createElement(Run2<props, children>)");
        final P props = createProps();
        final DOM.ChildList childList = new DOM.ChildList();
        if (callback != null) {
            callback.run(props, childList);
        }
        return React.createElement(getReactClass(), props, childList.toArray());
    }

    // Shorthand syntax

    public ReactElement $() {
        return createElement();
    }

    public ReactElement $(String key) {
        return createElement(key);
    }

    public ReactElement $(Object... children) {
        return createElement(children);
    }

    public ReactElement $(String key, Object... children) {
        return createElement(key, children);
    }

    public ReactElement $(P props) {
        return createElement(props);
    }

    public ReactElement $(Func.Run1<P> propsCallback) {
        return createElement(propsCallback);
    }

    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        return createElement(propsCallback, children);
    }

    public ReactElement $(Func.Run2<P, DOM.ChildList> callback) {
        return createElement(callback);
    }
}
