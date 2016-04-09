package io.clickhandler.reactGwt.client.action;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ErrorCallback {
    void run(Throwable e);
}
