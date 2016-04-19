package io.clickhandler.reactGwt.client.react;

import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Jso;
import io.clickhandler.reactGwt.client.Reflection;
import io.clickhandler.reactGwt.client.dom.DOM;

/**
 *
 * @param <P>
 */
public abstract class ExternalComponent<P> {

    public ExternalComponent() {
    }

    protected void initProps(P props) {
    }

    protected abstract ReactClass<P> reactClass();

    protected P defaultProps() {
        final P props = Jso.create();
        try {
            initProps(props);
            Reflection.assign(props, reactClass().getDefaultProps());
            applyKey(props);
        } catch (Throwable e) {
            // Ignore.
        }
        return props;
    }

    protected void applyKey(P props) {
        Object key = Reflection.get(props, "key");
        if (key == null) {
            Reflection.set(props, "key", io.clickhandler.reactGwt.client.react.ChildCounter.get().newKey());
        }
    }

    public ReactElement $() {
        return io.clickhandler.reactGwt.client.react.React.createElement(reactClass(), defaultProps());
    }

    public ReactElement $(Object... children) {
        return io.clickhandler.reactGwt.client.react.React.createElement(reactClass(), defaultProps(), children);
    }

    public ReactElement $(Func.Run1<P> propsCallback) {
        P props = defaultProps();
        if (props == null) props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(reactClass(), props);
    }

    public ReactElement $(Func.Run1<P> propsCallback, Func.Run1<DOM.ChildList> childCallback) {
        P props = defaultProps();
        if (props == null) props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }

        final DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }

        return io.clickhandler.reactGwt.client.react.React.createElement(reactClass(), props, childList.toArray());
    }

    public ReactElement $(Func.Run1<P> propsCallback, Object... children) {
        P props = defaultProps();
        if (props == null) props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(reactClass(), props, children);
    }

    public ReactElement $$(Func.Run1<DOM.ChildList> childCallback) {
        P props = defaultProps();
        if (props == null) props = Jso.create();
        final DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(reactClass(), props, childList.toArray());
    }
}
