package io.clickhandler.reactGwt.client.event;

import elemental.dom.Clipboard;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface DragEvent extends SyntheticEvent {
    @JsProperty
    Clipboard getDataTransfer();
}
