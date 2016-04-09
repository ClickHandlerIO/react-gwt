package io.clickhandler.reactGwt.client.form;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import io.clickhandler.reactGwt.client.event.ValueChangeHandler;

import java.util.ArrayList;

/**
 *
 */
@JsType
public class FormField<T> {
    private boolean required;
    private boolean focused;
    private boolean valid;
    private boolean submitted;

    private boolean trySubmitOnLeave;

    private Form form;
    private String key;
    private T value;
    private DisplayState displayState;
    private String message;

    private ArrayList<ValueChangeHandler<T>> changeHandlers;
    private ArrayList<FormField> dependentFields;

    public FormField() {
    }

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {

        this.value = value;
    }

    public void clear() {
        if (dependentFields == null) {
            return;
        }
        for (FormField field : dependentFields) {
            field.clear();
        }
    }

    protected void validate() {

    }

    public void setValid(boolean valid) {
        this.valid = valid;
        if (!valid) {
            displayState = DisplayState.ERROR;
        }
    }

    enum DisplayState {
        NORMAL,
        ERROR,
        SUCCESS,;
    }

    @JsFunction
    interface ValidityUpdatedCallback {
        void changed(boolean from, boolean to);
    }
}
