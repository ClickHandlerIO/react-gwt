package io.clickhandler.reactGwt.client.util;

import com.google.gwt.core.client.GWT;

/**
 *
 */
public class Is {
    public static boolean devMode() {
        return ((SuperDevModeIndicator) GWT.create(SuperDevModeIndicator.class)).isSuperDevMode();
    }
}
