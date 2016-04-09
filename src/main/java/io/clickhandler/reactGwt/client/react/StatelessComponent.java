package io.clickhandler.reactGwt.client.react;

/**
 *
 */
public abstract class StatelessComponent<P> extends Component<P, Object> {
    @Override
    protected ReactElement render(io.clickhandler.reactGwt.client.react.ReactComponent<P, Object> $this, P props, Object state) {
        return render($this, props);
    }

    protected abstract ReactElement render(io.clickhandler.reactGwt.client.react.ReactComponent<P, Object> $this, P props);
}
