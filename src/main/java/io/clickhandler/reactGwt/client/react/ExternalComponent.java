package io.clickhandler.reactGwt.client.react;

import elemental.client.Browser;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Jso;
import io.clickhandler.reactGwt.client.Reflection;
import io.clickhandler.reactGwt.client.dom.DOM;
import jsinterop.annotations.JsIgnore;

import java.util.logging.Logger;


public abstract class ExternalComponent<P> {

    public ExternalComponent() {
    }

    protected abstract ReactClass<P> getReactClass();

    private P keyedProps(P props) {
        if (props == null) {
            props = Jso.create();
        }
//        if (Reflection.get(props, "key") == null) {
//            Reflection.set(props, "key", ChildCounter.get().newKey());
//        }
        return props;
    }

    /*
     * Factory Methods
     */
    public ReactElement createElement() {
        return React.createElement(getReactClass(), keyedProps(getReactClass().getDefaultProps()));
    }

    public ReactElement createElement(Object... children) {
        return React.createElement(getReactClass(), keyedProps(getReactClass().getDefaultProps()), children);
    }

    public ReactElement createElement(P props) {
        return React.createElement(getReactClass(), keyedProps(props));
    }

    public ReactElement createElement(Func.Run1<P> propsCallback) {
        final P props = keyedProps(getReactClass().getDefaultProps());
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        final P props = keyedProps(getReactClass().getDefaultProps());
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(Func.Run2<P, DOM.ChildList> callback) {
        final P props = keyedProps(getReactClass().getDefaultProps());
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

    /*
     * Remove this stuff?
     */
    // needed ?
    protected void initProps(P props) {
    }

    protected P defaultProps() {
        final P props = Jso.create();
        try {
            initProps(props);
            Reflection.assign(props, getReactClass().getDefaultProps());
            applyKey(props); // todo needed?
        } catch (Throwable e) {
            Browser.getWindow().getConsole().log(e);
        }
        return props;
    }

    protected void applyKey(P props) {
        Object key = Reflection.get(props, "key");
        if (key == null) {
            Reflection.set(props, "key", io.clickhandler.reactGwt.client.react.ChildCounter.get().newKey());
        }
    }
}
