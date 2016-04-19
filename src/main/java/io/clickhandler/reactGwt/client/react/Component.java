
import elemental.client.Browser;
import elemental.dom.Document;
import elemental.html.Console;
import elemental.html.Window;
import io.clickhandler.reactGwt.client.*;
import io.clickhandler.reactGwt.client.dom.StyleProps;
import io.clickhandler.reactGwt.client.dom.DOM;
import io.clickhandler.reactGwt.client.react.*;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import javax.inject.Inject;

/**
 * @param <P>
 * @param <S>
 */

@JsType
public abstract class Component<P, S> {
    @JsIgnore
    protected final Console console = Browser.getWindow().getConsole();
    @JsIgnore
    protected final Document document = Browser.getDocument();
    @JsIgnore
    protected final Window window = Browser.getWindow();

    private Object reactClass;

    public Component() {
        displayName = getClass().getSimpleName();

        // todo context stuff needed?
        addContextTypes(contextTypes);
        addChildContextTypes(childContextTypes);
    }

    public ReactClass getReactClass() {
        if (reactClass == null) {
            reactClass = React.createClass(this);
        }
        return (ReactClass) reactClass;
    }

    /*
     * Factory Methods
     */

    public ReactElement createElement() {
        return React.createElement(getReactClass(), Jso.create());
    }

    public ReactElement createElement(Object... children) {
        return React.createElement(getReactClass(), Jso.create(), children);
    }

    public ReactElement createElement(P props) {
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback) {
        final P props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props);
    }

    public ReactElement createElement(Func.Run1<P> propsCallback, Object... children) {
        final P props = Jso.create();
        if (propsCallback != null) {
            propsCallback.run(props);
        }
        return React.createElement(getReactClass(), props, children);
    }

    public ReactElement createElement(Func.Run2<P, DOM.ChildList> callback) {
        final P props = Jso.create();
        final DOM.ChildList childList = new DOM.ChildList();
        if (callback != null) {
            callback.run(props, childList);
        }
        return React.createElement(getReactClass(), props, childList.toArray());
    }

    // Shorthand syntax - todo test out different ideas

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

    public ReactElement _() {
        return createElement();
    }

    public ReactElement _(Object... children) {
        return createElement(children);
    }

    public ReactElement _(P props) {
        return createElement(props);
    }

    public ReactElement _(Func.Run1<P> propsCallback) {
        return createElement(propsCallback);
    }

    public ReactElement _(Func.Run1<P> propsCallback, Object... children) {
        return createElement(propsCallback, children);
    }

    public ReactElement _(Func.Run2<P, DOM.ChildList> callback) {
        return createElement(callback);
    }

    /*
     * Lifecycle
     */

    // Javascript properties

    public Func.Call<P> getDefaultProps = Func.bind(this::getDefaultProps);
    public Func.Call<S> getInitialState = Func.bind(this::getInitialState);
    public Func.Run componentWillMount = Func.bind(this::componentWillMountInternal);
    public Func.Run componentDidMount = Func.bind(this::componentDidMountInternal);
    public Func.Run1<P> componentWillReceiveProps = Func.bind(this::componentWillReceivePropsInternal);
    public Func.Call2<Boolean, P, S> shouldComponentUpdate = Func.bind(this::shouldComponentUpdateInternal);
    public Func.Run2<P, S> componentWillUpdate = Func.bind(this::componentWillUpdateInternal);
    @JsProperty(name = "render")
    public Func.Call<ReactElement> render = Func.bind(this::renderInternal);
    @JsProperty(name = "componentDidUpdate")
    public Func.Run2<P, S> componentDidUpdate = Func.bind(this::componentDidUpdateInternal);
    public Func.Run componentWillUnmount = Func.bind(this::componentWillUnmountInternal);

    // Internal pass through

    @JsIgnore
    private void componentWillMountInternal(final ReactComponent<P, S> $this) {
        Reflection.set($this, React.BUS, new BusDelegate(bus));
        componentWillMount($this);
    }

    @JsIgnore
    private void componentDidMountInternal(final ReactComponent<P, S> $this) {
        try {
            componentDidMount($this);
        } finally {
            intakeProps($this, $this.getProps());
        }
    }

    @JsIgnore
    private void componentWillReceivePropsInternal(final ReactComponent<P, S> $this, P nextProps) {
        try {
            componentWillReceiveProps($this, nextProps);
        } finally {
            intakeProps($this, nextProps);
        }
    }

    @JsIgnore
    protected boolean shouldComponentUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        return shouldComponentUpdate($this, nextProps, nextState);
    }

    @JsIgnore
    protected void componentWillUpdateInternal(final ReactComponent<P, S> $this, P nextProps, S nextState) {
        componentWillUpdate($this, $this.getProps(), nextProps, $this.state(), nextState);
    }

    @JsIgnore
    protected ReactElement renderInternal(final ReactComponent<P, S> $this) {

        // TODO do we need this child key for all components?
        /*P props = $this.getProps();
        ChildCounter.get().scope();*/
//        try {
            /*if (props != null) {
                // Fix children not having a "key" set.
                Object children = Reflection.get(props, "children");
                if (children != null) {
                    Object key = Reflection.get(children, "key");

                    if (key == null) {
                        // Create a new key.
                        key = ChildCounter.get().newKey();
                        // Try to set it on children.
                        Reflection.set(children, "key", key);

                        // Test that key was set properly.
                        if (Reflection.get(children, "key") != key) {
                            // Copy to new "children" object.
                            final Object newChildren = new Object();
                            Reflection.assign(newChildren, children);
                            // Set key.
                            Reflection.set(newChildren, "key", key);
                            // Set new "children" on props.
                            Reflection.set(props, "children", newChildren);
                        }
                    }
                }
            }*/

            return render($this);
        /*} finally {
            ChildCounter.get().pop(); //  needed?
        }*/
    }

    @JsIgnore
    private void componentDidUpdateInternal(final ReactComponent<P, S> $this, P prevProps, S prevState) {
        componentDidUpdate($this, prevProps, $this.getProps(), prevState, $this.state());
    }

    @JsIgnore
    protected void componentWillUnmountInternal(final ReactComponent<P, S> $this) {
        try {
            $this.cleanup();
        } finally {
            componentWillUnmount($this);
        }
    }

    // Methods for subclasses to override

    @JsIgnore
    public P getDefaultProps(ReactComponent<P, S> $this) {
        return Jso.create();
    }

    @JsIgnore
    public S getInitialState(ReactComponent<P, S> $this) {
        return Jso.create();
    }

    @JsIgnore
    protected void componentWillMount(final ReactComponent<P, S> $this) {
    }

    @JsIgnore
    protected void componentDidMount(final ReactComponent<P, S> $this) {
    }

    @JsIgnore
    protected void componentWillReceiveProps(final ReactComponent<P, S> $this, P nextProps) {
    }

    @JsIgnore
    protected boolean shouldComponentUpdate(ReactComponent<P, S> $this, P nextProps, S nextState) {
        return true;
    }

    @JsIgnore
    protected void componentWillUpdate(ReactComponent<P, S> $this, P curProps, P nextProps, S curState, S nextState) {

    }

    @JsIgnore
    protected abstract ReactElement render(final ReactComponent<P, S> $this);

    @JsIgnore
    protected void componentDidUpdate(final ReactComponent<P, S> $this, P prevProps, P curProps, S prevState, S curState) {
    }

    @JsIgnore
    protected void componentWillUnmount(final ReactComponent<P, S> $this) {
    }

    // todo decide if we want this
    @JsIgnore
    protected void intakeProps(ReactComponent<P, S> $this, P nextProps) {
    }












    /*
     * Defaults
     */

    @JsProperty
    public String displayName = "";
    @JsProperty
    public ContextTypes contextTypes = new ContextTypes();
    @JsProperty
    public ContextTypes childContextTypes = new ContextTypes();
    @JsProperty
    public Func.Call getChildContext = this::getChildContext;
    @Inject
    Bus bus;


    ///////////////////////////////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////////////////////////////




    @JsIgnore
    protected StyleProps css() {
        return new StyleProps();
    }














    /*
     * Old / TODO Remove
     */

    // todo look at getting rid of / renaming this. can be accidentally used instead of $this.props()
    // dont think we need to key everything - probably expose the ChildCounter.get().newKey() as a better named utility
    /*private P props() {
        // Create Props.
        final P props = createProps();

        // Set key manually.
        Object key = Reflection.get(props, "key");
        if (key == null) {
            Reflection.set(props, "key", ChildCounter.get().newKey());
        }

        // Return props.
        return props;
    }*/


    /*// No Usages
    @JsIgnore
    public static <T> T create() {
        return Jso.create();
    }

    // No Usages
    @JsIgnore
    public static <T> T create(Class<T> cls) {
        return Jso.create();
    }

    // No Usages
    @JsIgnore
    public static <T> T create(Class<T> cls, Func.Run1<T> callback) {
        return Jso.create(cls, callback);
    }*/

    /*
     * Context
     * TODO look at getting rid of this / what is working or not
     */

    protected native Object getChildContext() /*-{
        return {};
    }-*/;

    @JsIgnore
    protected void addContextTypes(ContextTypes contextTypes) {
    }

    @JsIgnore
    protected void addChildContextTypes(ContextTypes contextTypes) {
    }

    @JsType
    public static class ContextTypes {
        @JsIgnore
        public <T> T get(String name) {
            return Reflection.get(this, name);
        }

        @JsIgnore
        public <T> void set(String name, T value) {
            Reflection.set(this, name, value);
        }
    }
}
