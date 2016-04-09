package io.clickhandler.reactGwt.client.form;

import jsinterop.annotations.JsType;
import io.clickhandler.reactGwt.client.Func;

import java.util.ArrayList;

/**
 *
 */
@JsType
public class Form {
    private final ArrayList<FormField> fields = new ArrayList<>();
    public Func.Run1<FormChangedEvent> onChange;

    public Form() {
        init(this);
    }

    public static native void init(Form model) /*-{
        for (var p in model) {
            if (model.hasOwnProperty(p)) {
                var f = model[p];
                f.form = model;
                f.key = p;
            }
        }
    }-*/;

    public <T> FormField<T> add(FormField<T> field) {
        this.fields.add(field);
        return field;
    }

    public static enum State {
        NON_SUBMIT,
        SUBMIT,;
    }
}
