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

    private P getProps() {
        P props = Reflection.get(getReactClass(), "getDefaultProps") != null ? getReactClass().getDefaultProps() : Jso.create();
        // todo apply key?
        return props;
    }

    /*protected void applyKey(P props) {
        log.trace("applyKey(props)", props);
        Object key = Reflection.get(props, "key");
        if (key == null) {
            Reflection.set(props, "key", io.clickhandler.reactGwt.client.react.ChildCounter.get().newKey());
        }
    }*/

    /*
     * Factory Methods
     */

    public ReactElement createElement() {
        log.trace("createElement()");
        return React.createElement(getReactClass(), getProps());
    }

    public ReactElement createElement(Object... children) {
        log.trace("createElement(children)", children);
        return React.createElement(getReactClass(), getProps(), children);
    }

    public ReactElement createElement(P props) {
        log.trace("createElement(props)", props);
        if (props == null) {
            props = Jso.create();
        }
        Reflection.assign(props, getProps());
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback) {
        log.trace("createElement(propsCallback)", propsCallback);
        final P props = getProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        log.trace("createElement(propsCallback, children)", propsCallback, children);
        final P props = getProps();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(Func.Run2<P, DOM.ChildList> callback) {
        log.trace("createElement(Run2<props, children>)", callback);
        final P props = getProps();
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

    public ReactElement $(Object... children) {
        return createElement(children);
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
