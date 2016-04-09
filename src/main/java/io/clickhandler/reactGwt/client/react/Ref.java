package io.clickhandler.reactGwt.client.react;

import jsinterop.annotations.JsProperty;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactGwt.client.Reflection;

/**
 *
 */
public class Ref<T> {
    private final static String INIT_PROP_NAME = "$$refinit$$";
    private static long id = 0;

    @JsProperty
    final String name;

    public String getName() {
        return name;
    }

    private Ref(String name) {
        this.name = "$$" + name;
    }

    public static <T> Ref<T> make(String name) {
        return new Ref<>(name);
    }

    public static <T> Ref<T> make() {
        return new Ref<>(String.valueOf(id++));
    }

    public void init(ReactComponent $this, Func.Run1<T> callback) {
        final T ref = get($this);
        final Boolean inited = Reflection.get(ref, INIT_PROP_NAME);
        if (inited == null || !inited) {
            Reflection.set(ref, INIT_PROP_NAME, true);
            callback.run(ref);
        }
    }

    public T get(ReactComponent $this) {
        return Reflection.get(Reflection.get($this, "refs"), name);
    }

    public void get(ReactComponent $this, Func.Run1<T> callback) {
        final T ref = get($this);
        if (callback != null && ref != null) {
            callback.run(ref);
        }
    }

    public void set(ReactComponent $this, T value) {
        Reflection.set($this, name, value);
    }
}
