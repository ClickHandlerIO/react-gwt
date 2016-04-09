package io.clickhandler.reactGwt.client.react;

/**
 *
 */
public abstract class StaticComponent extends Component<BaseProps, Object> {
    @Override
    protected ReactElement render(ReactComponent<BaseProps, Object> $this, BaseProps props, Object state) {
        return render($this, props);
    }

    protected abstract ReactElement render(ReactComponent<BaseProps, Object> $this, BaseProps props);
}
