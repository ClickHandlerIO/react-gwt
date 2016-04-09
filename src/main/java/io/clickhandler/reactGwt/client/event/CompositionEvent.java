package io.clickhandler.reactGwt.client.event;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface CompositionEvent extends SyntheticEvent {
    @JsProperty
    String getData();
}
