package io.clickhandler.reactGwt.client.react;

import elemental.client.Browser;
import elemental.dom.Document;
import elemental.html.Console;
import elemental.html.Window;
import io.clickhandler.reactGwt.client.dom.CSSProps;
import io.clickhandler.reactGwt.client.dom.DOM;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * @param <P>
 * @param <S>
 */
public abstract class Component<P, S> {
    @JsProperty
    protected final Console console = Browser.getWindow().getConsole();
    @JsProperty
    protected final Document document = Browser.getDocument();
    @JsProperty
    protected final Window window = Browser.getWindow();
    @JsProperty(name = "componentDidUpdate")
    public io.clickhandler.reactGwt.client.Func.Run2<P, S> componentDidUpdate = io.clickhandler.reactGwt.client.Func.bind(this::componentDidUpdate0);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Run componentDidMount = io.clickhandler.reactGwt.client.Func.bind(this::componentDidMount0);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Run componentWillUnmount = io.clickhandler.reactGwt.client.Func.bind(this::componentWillUnmount0);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Run1<P> componentWillReceiveProps = io.clickhandler.reactGwt.client.Func.bind(this::componentWillReceiveProps0);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Call<P> getDefaultProps = io.clickhandler.reactGwt.client.Func.bind(this::getDefaultProps);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Run2<P, S> componentWillUpdate = io.clickhandler.reactGwt.client.Func.bind(this::componentWillUpdate0);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Call<S> getInitialState = io.clickhandler.reactGwt.client.Func.bind(this::getInitialState);
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Call2<Boolean, P, S> shouldComponentUpdate = io.clickhandler.reactGwt.client.Func.bind(this::shouldComponentUpdate0);
    @JsProperty(name = "render")
    public io.clickhandler.reactGwt.client.Func.Call<ReactElement> render = io.clickhandler.reactGwt.client.Func.bind(this::render0);

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Defaults
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsProperty
    public String displayName = "";
    @JsProperty
    public ContextTypes contextTypes = new ContextTypes();
    @JsProperty
    public ContextTypes childContextTypes = new ContextTypes();
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Call getChildContext = this::getChildContext;
    @Inject
    io.clickhandler.reactGwt.client.Bus bus;
    @JsProperty
    public io.clickhandler.reactGwt.client.Func.Run componentWillMount = io.clickhandler.reactGwt.client.Func.bind(this::componentWillMount0);

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsProperty
    private Object reactClass;

    public Component() {
        displayName = getDisplayName();
        addContextTypes(contextTypes);
        addChildContextTypes(childContextTypes);
    }

    @JsIgnore
    public static <T> T create() {
        return io.clickhandler.reactGwt.client.Jso.create();
    }

    @JsIgnore
    public static <T> T create(Class<T> cls) {
        return io.clickhandler.reactGwt.client.Jso.create();
    }

    @JsIgnore
    public static <T> T create(Class<T> cls, io.clickhandler.reactGwt.client.Func.Run1<T> callback) {
        return io.clickhandler.reactGwt.client.Jso.create(cls, callback);
    }

    @JsIgnore
    protected CSSProps css() {
        return new CSSProps();
    }

    @JsIgnore
    protected String getDisplayName() {
        return getClass().getSimpleName();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Build Context Types Object.
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsIgnore
    protected void addContextTypes(ContextTypes contextTypes) {
    }

    @JsIgnore
    protected void addChildContextTypes(ContextTypes contextTypes) {
    }

    @JsIgnore
    public P getDefaultProps(ReactComponent<P, S> $this) {
        return createProps();
    }

    @JsIgnore
    public S getInitialState(ReactComponent<P, S> $this) {
        return createState();
    }

    @JsIgnore
    protected native P createProps() /*-{
        return {};
    }-*/;

    @JsIgnore
    protected native S createState() /*-{
        return {};
    }-*/;

    protected native Object getChildContext() /*-{
        return {};
    }-*/;

    /**
     * Invoked before rendering when new props or state are being received.
     * This method is not called for the initial render or when forceUpdate is used.
     * Use this as an opportunity to return false when you're certain that the transition to the new props and state will not require a component update.
     * By default, shouldComponentUpdate always returns true to prevent subtle bugs when state is mutated in place,
     * but if you are careful to always treat state as immutable and to read only from props and state in render()
     * then you can override shouldComponentUpdate with an implementation that compares the old props and state to their replacements.
     * <p/>
     * If performance is a bottleneck, especially with dozens or hundreds of components, use shouldComponentUpdate to speed up your app.
     *
     * @param nextProps the props object that the component will receive
     * @param nextState the state object that the component will receive
     */
    protected boolean shouldComponentUpdate0(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        return shouldComponentUpdate($this, $this.props(), nextProps, nextState, $this.state());
    }

    protected boolean shouldComponentUpdate(ReactComponent<P, S> $this, P curProps, P nextProps, S curState, S nextState) {
        return true;
    }

    /**
     * The render() method is required. When called, it should examine this.props and this.state and return a single child component.
     * This child component can be either a virtual representation of a native DOM component (such as <div /> or React.DOM.div())
     * or another composite component that you've defined yourself.
     * The render() function should be pure, meaning that it does not modify component state, it returns the same result each time it's invoked,
     * and it does not read from or write to the DOM or otherwise interact with the browser (e.g., by using setTimeout).
     * If you need to interact with the browser, perform your work in componentDidMount() or the other lifecycle methods instead.
     * Keeping render() pure makes server rendering more practical and makes components easier to think about.
     */
    @JsIgnore
    protected ReactElement render0(final ReactComponent<P, S> $this) {
        P props = $this.getProps();
        S state = $this.getState();
        io.clickhandler.reactGwt.client.react.ChildCounter.get().scope();
        try {
            if (props != null) {
                // Fix children not having a "key" set.
                Object children = io.clickhandler.reactGwt.client.Reflection.get(props, "children");
                if (children != null) {
                    Object key = io.clickhandler.reactGwt.client.Reflection.get(children, "key");

                    if (key == null) {
                        // Create a new key.
                        key = io.clickhandler.reactGwt.client.react.ChildCounter.get().newKey();
                        // Try to set it on children.
                        io.clickhandler.reactGwt.client.Reflection.set(children, "key", key);

                        // Test that key was set properly.
                        if (io.clickhandler.reactGwt.client.Reflection.get(children, "key") != key) {
                            // Copy to new "children" object.
                            final Object newChildren = new Object();
                            io.clickhandler.reactGwt.client.Reflection.assign(newChildren, children);
                            // Set key.
                            io.clickhandler.reactGwt.client.Reflection.set(newChildren, "key", key);
                            // Set new "children" on props.
                            io.clickhandler.reactGwt.client.Reflection.set(props, "children", newChildren);
                        }
                    }
                }
            }
            return render($this, props, state);
        } finally {
            io.clickhandler.reactGwt.client.react.ChildCounter.get().pop();
        }
    }

    protected abstract ReactElement render(final ReactComponent<P, S> $this, P props, S state);

    private void componentWillMount0(final ReactComponent<P, S> $this) {
        io.clickhandler.reactGwt.client.Reflection.set($this, io.clickhandler.reactGwt.client.react.React.BUS, new io.clickhandler.reactGwt.client.BusDelegate(bus));
        componentWillMount($this, $this.getProps(), $this.getState());
    }

    protected void componentWillMount(final ReactComponent<P, S> $this, P props, S state) {

    }

    private void componentDidMount0(final ReactComponent<P, S> $this) {
        try {
            intakeProps($this, null, $this.props());
        } finally {
            componentDidMount($this, $this.getProps(), $this.getState());
        }
    }

    /**
     * Invoked immediately after rendering occurs.
     * At this point in the lifecycle, the component has a DOM representation which you can access via the rootNode argument or by calling this.getDOMNode().
     * If you want to integrate with other JavaScript frameworks, set timers using setTimeout or setInterval,
     * or send AJAX requests, perform those operations in this method.
     */
    protected void componentDidMount(final ReactComponent<P, S> $this, P props, S state) {
    }

    private void componentWillReceiveProps0(final ReactComponent<P, S> $this, P nextProps) {
        try {
            intakeProps($this, $this.props(), nextProps);
        } finally {
            componentWillReceiveProps($this, $this.props(), nextProps);
        }
    }

    protected void componentWillReceiveProps(final ReactComponent<P, S> $this, P curProps, P nextProps) {

    }

    protected void componentWillUpdate0(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        componentWillUpdate($this, $this.props(), nextProps, $this.state(), nextState);
    }

    protected void componentWillUpdate(ReactComponent<P, S> $this, P curProps, P nextProps, S curState, S nextState) {

    }

    private void componentDidUpdate0(final ReactComponent<P, S> $this, P prevProps, S prevState) {
        componentDidUpdate($this, prevProps, $this.props(), prevState, $this.state());
    }

    protected void componentDidUpdate(final ReactComponent<P, S> $this, P prevProps, P curProps, S prevState, S curState) {
    }

    protected void componentWillUnmount0(final ReactComponent<P, S> $this) {
        try {
            $this.cleanup();
        } finally {
            componentWillUnmount($this);
        }
    }

    protected void componentWillUnmount(final ReactComponent<P, S> $this) {
    }

    protected void intakeProps(ReactComponent<P, S> $this, P curProps, P nextProps) {
    }

    public ReactClass getReactClass() {
        if (reactClass == null) {
            reactClass = io.clickhandler.reactGwt.client.react.React.createClass(this);
        }
        return (ReactClass) reactClass;
    }

    // todo look at getting rid of / renaming this. can be accidentally used instead of $this.props()
    protected P props() {
        // Create Props.
        final P props = createProps();

        // Set key manually.
        Object key = io.clickhandler.reactGwt.client.Reflection.get(props, "key");
        if (key == null) {
            io.clickhandler.reactGwt.client.Reflection.set(props, "key", io.clickhandler.reactGwt.client.react.ChildCounter.get().newKey());
        }

        // Return props.
        return props;
    }

    /**
     * @param children
     * @return
     */
    public ReactElement $(Object... children) {
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props(), children);
    }

    /**
     * @return
     */
    public ReactElement $() {
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props());
    }

    /**
     * @param props
     * @return
     */
    public ReactElement $(P props) {
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props);
    }

    /**
     * @param props
     * @param childCallback
     * @return
     */
    public ReactElement $(P props, io.clickhandler.reactGwt.client.Func.Run1<DOM.ChildList> childCallback) {
        final DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props, childList.toArray());
    }

    /**
     * @param propsCallback
     * @param childCallback
     * @return
     */
    public ReactElement $(io.clickhandler.reactGwt.client.Func.Run1<P> propsCallback, io.clickhandler.reactGwt.client.Func.Run1<DOM.ChildList> childCallback) {
        final P props = props();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        final DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props, childList.toArray());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Factory Methods
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @param callback
     * @return
     */
    public ReactElement $(io.clickhandler.reactGwt.client.Func.Run2<P, DOM.ChildList> callback) {
        final P props = props();
        final DOM.ChildList childList = new DOM.ChildList();
        if (callback != null) {
            callback.run(props, childList);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props, childList.toArray());
    }

    /**
     * @param propsCallback
     * @return
     */
    public ReactElement $(io.clickhandler.reactGwt.client.Func.Run1<P> propsCallback) {
        final P props = props();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props);
    }

    /**
     * @param propsCallback
     * @param children
     * @return
     */
    public ReactElement $(io.clickhandler.reactGwt.client.Func.Run1<P> propsCallback, Object... children) {
        final P props = props();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props, children);
    }

    /**
     * @param childCallback
     * @return
     */
    public ReactElement $$(io.clickhandler.reactGwt.client.Func.Run1<DOM.ChildList> childCallback) {
        final P props = props();
        final DOM.ChildList childList = new DOM.ChildList();
        if (childCallback != null) {
            childCallback.run(childList);
        }
        return io.clickhandler.reactGwt.client.react.React.createElement(getReactClass(), props, childList.toArray());
    }

    @JsType
    public static class ContextTypes {
        @JsIgnore
        public <T> T get(String name) {
            return io.clickhandler.reactGwt.client.Reflection.get(this, name);
        }

        @JsIgnore
        public <T> void set(String name, T value) {
            io.clickhandler.reactGwt.client.Reflection.set(this, name, value);
        }
    }
}
