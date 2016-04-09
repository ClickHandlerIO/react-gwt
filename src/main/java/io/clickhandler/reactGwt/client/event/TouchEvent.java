package io.clickhandler.reactGwt.client.event;

import elemental.events.TouchList;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(isNative = true)
public interface TouchEvent extends SyntheticEvent {
    boolean isAltKey();

    TouchList getChangedTouches();

    boolean isCtrlKey();

    boolean getModifierState(String key);

    boolean isMetaKey();

    boolean isShiftKey();

    TouchList getTargetTouches();

    TouchList getTouches();
}
