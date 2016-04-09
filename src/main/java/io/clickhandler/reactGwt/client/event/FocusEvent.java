package io.clickhandler.reactGwt.client.event;

import elemental.events.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface FocusEvent extends SyntheticEvent {
    @JsProperty
    EventTarget getRelatedTarget();
}
