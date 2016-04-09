package io.clickhandler.reactGwt.client.action;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface RequestCallback<T> {
    void run(T request);
}
