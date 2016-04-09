package io.clickhandler.reactGwt.client.form;

import io.clickhandler.reactGwt.client.event.SyntheticEvent;

/**
 *
 */
public class FormBinder {
    public static native <T> T merge(T newObj, SyntheticEvent event) /*-{
        var target = event.target;

        if (!target) {
            return null;
        }

        if (!('id' in target)) {
            return null;
        }
        var id = target.id;
        var type = target.type;

        var value = null;

        if (type == "checkbox") {
            value = target.value == 'on' || target.value == true || target.value == 'yes';
        } else {
            value = target.value;
        }

        var obj = {};
        obj[id] = value;
        return Object.assign(newObj, obj);
    }-*/;

    public static native <T> T merge(T newObj, String name, Object val) /*-{
        return Object.assign(newObj, {name: val});
    }-*/;
}
