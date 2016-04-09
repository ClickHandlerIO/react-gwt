package io.clickhandler.reactGwt.client.dom;

import elemental.dom.Element;
import elemental.html.*;
import io.clickhandler.reactGwt.client.Func;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public interface DOM {
    static <T> HTMLProps<T> props(String tagName) {
        final HTMLProps<T> props = new HTMLProps<>();

        props.key(io.clickhandler.reactGwt.client.react.ChildCounter.get().newKey());

        return props;
    }

    static Object[] toObjectArray(List<Object> list) {
        Object[] params = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            params[i] = list.get(i);
        }
        return params;
    }

    static io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, String value) {
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props(tagName),
            value
        );
    }

    static io.clickhandler.reactGwt.client.react.ReactElement create(String tagName) {
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props(tagName)
        );
    }

    static io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, Object... children) {
//        if (children != null)
//            Try.silent(() -> Reflection.set(children, "key", ChildCounter.get().newKey()));
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props(tagName),
            children
        );
    }

    static <E extends Element> io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, Func.Run1<HTMLProps<E>> callback, String html) {
        final HTMLProps props = props(tagName);
        callback.run(props);
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props,
            html
        );
    }

    static <E extends Element> io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, Func.Run1<HTMLProps<E>> callback) {
        final HTMLProps<E> props = props(tagName);
        callback.run(props);
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props
        );
    }

    static <E extends Element> io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, Func.Run1<HTMLProps<E>> callback, Object... children) {
        final HTMLProps<E> props = props(tagName);
        callback.run(props);
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props,
            children
        );
    }

    static <E extends Element> io.clickhandler.reactGwt.client.react.ReactElement create(String tagName,
                                                                                    Func.Run1<HTMLProps<E>> callback,
                                                                                    Func.Run1<ChildList> childrenCallback) {
        final HTMLProps<E> props = props(tagName);
        callback.run(props);
        final ChildList components = new ChildList();
        childrenCallback.run(components);

//        switch (components.list.size()) {
//            case 0:
//                return React.createElement(tagName, props);
//            case 1:
//                return React.createElement(tagName, props, components.list.get(0));
//            default:
//                return React.createElement(ta)
//        }

        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props,
            components.toArray()
        );
    }

    static io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, HTMLProps props, String html) {
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props,
            html
        );
    }

    static io.clickhandler.reactGwt.client.react.ReactElement create(String tagName, HTMLProps props, io.clickhandler.reactGwt.client.react.ReactElement... components) {
        return io.clickhandler.reactGwt.client.react.React.createElement(
            tagName,
            props,
            components
        );
    }

    static <P extends io.clickhandler.reactGwt.client.react.BaseProps, S> io.clickhandler.reactGwt.client.react.ReactElement el(io.clickhandler.reactGwt.client.react.ReactComponent component, P props, Object... children) {
        return io.clickhandler.reactGwt.client.react.React.createElement(component, props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a() {
        return create("a");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(String value) {
        return create("a", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(Object... children) {
        return create("a", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback, String html) {
        return create("a", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(HTMLProps<AnchorElement> props) {
        return create("a", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(HTMLProps<AnchorElement> props, String html) {
        return create("a", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(HTMLProps<AnchorElement> props, Object... children) {
        return create("a", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("a", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback) {
        return create("a", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement a(Func.Run1<HTMLProps<AnchorElement>> callback, Object... children) {
        return create("a", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr() {
        return create("abbr");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(String value) {
        return create("abbr", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(Object... children) {
        return create("abbr", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback, String html) {
        return create("abbr", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(HTMLProps<AnchorElement> props) {
        return create("abbr", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(HTMLProps<AnchorElement> props, String html) {
        return create("abbr", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(HTMLProps<AnchorElement> props, Object... children) {
        return create("abbr", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("abbr", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback) {
        return create("abbr", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement abbr(Func.Run1<HTMLProps<AnchorElement>> callback, Object... children) {
        return create("abbr", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address() {
        return create("address");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(String value) {
        return create("address", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(Object... children) {
        return create("address", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("address", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(HTMLProps<Element> props) {
        return create("address", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(HTMLProps<Element> props, String html) {
        return create("address", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(HTMLProps<Element> props, Object... children) {
        return create("address", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("address", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(Func.Run1<HTMLProps<Element>> callback) {
        return create("address", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement address(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("address", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area() {
        return create("area");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(String value) {
        return create("area", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(Object... children) {
        return create("area", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback, String html) {
        return create("area", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(HTMLProps<AreaElement> props) {
        return create("area", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(HTMLProps<AreaElement> props, String html) {
        return create("area", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(HTMLProps<AreaElement> props, Object... children) {
        return create("area", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("area", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback) {
        return create("area", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement area(Func.Run1<HTMLProps<AreaElement>> callback, Object... children) {
        return create("area", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article() {
        return create("article");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(String value) {
        return create("article", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(Object... children) {
        return create("article", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("article", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(HTMLProps<Element> props) {
        return create("article", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(HTMLProps<Element> props, String html) {
        return create("article", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(HTMLProps<Element> props, Object... children) {
        return create("article", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("article", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(Func.Run1<HTMLProps<Element>> callback) {
        return create("article", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement article(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("article", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside() {
        return create("aside");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(String value) {
        return create("aside", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(Object... children) {
        return create("aside", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("aside", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(HTMLProps<Element> props) {
        return create("aside", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(HTMLProps<Element> props, String html) {
        return create("aside", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(HTMLProps<Element> props, Object... children) {
        return create("aside", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("aside", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(Func.Run1<HTMLProps<Element>> callback) {
        return create("aside", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement aside(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("aside", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio() {
        return create("audio");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(String value) {
        return create("audio", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(Object... children) {
        return create("audio", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback, String html) {
        return create("audio", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(HTMLProps<AudioElement> props) {
        return create("audio", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(HTMLProps<AudioElement> props, String html) {
        return create("audio", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(HTMLProps<AudioElement> props, Object... children) {
        return create("audio", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("audio", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback) {
        return create("audio", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement audio(Func.Run1<HTMLProps<AudioElement>> callback, Object... children) {
        return create("audio", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b() {
        return create("b");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(String value) {
        return create("b", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(Object... children) {
        return create("b", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("b", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(HTMLProps<Element> props) {
        return create("b", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(HTMLProps<Element> props, String html) {
        return create("b", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(HTMLProps<Element> props, Object... children) {
        return create("b", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("b", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(Func.Run1<HTMLProps<Element>> callback) {
        return create("b", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement b(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("b", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base() {
        return create("base");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(String value) {
        return create("base", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(Object... children) {
        return create("base", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback, String html) {
        return create("base", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(HTMLProps<BaseElement> props) {
        return create("base", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(HTMLProps<BaseElement> props, String html) {
        return create("base", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(HTMLProps<BaseElement> props, Object... children) {
        return create("base", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("base", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback) {
        return create("base", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement base(Func.Run1<HTMLProps<BaseElement>> callback, Object... children) {
        return create("base", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi() {
        return create("bdi");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(String value) {
        return create("bdi", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(Object... children) {
        return create("bdi", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("bdi", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(HTMLProps<Element> props) {
        return create("bdi", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(HTMLProps<Element> props, String html) {
        return create("bdi", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(HTMLProps<Element> props, Object... children) {
        return create("bdi", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("bdi", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(Func.Run1<HTMLProps<Element>> callback) {
        return create("bdi", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdi(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("bdi", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo() {
        return create("bdo");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(String value) {
        return create("bdo", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(Object... children) {
        return create("bdo", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("bdo", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(HTMLProps<Element> props) {
        return create("bdo", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(HTMLProps<Element> props, String html) {
        return create("bdo", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(HTMLProps<Element> props, Object... children) {
        return create("bdo", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("bdo", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(Func.Run1<HTMLProps<Element>> callback) {
        return create("bdo", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement bdo(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("bdo", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big() {
        return create("big");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(String value) {
        return create("big", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(Object... children) {
        return create("big", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("big", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(HTMLProps<Element> props) {
        return create("big", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(HTMLProps<Element> props, String html) {
        return create("big", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(HTMLProps<Element> props, Object... children) {
        return create("big", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("big", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(Func.Run1<HTMLProps<Element>> callback) {
        return create("big", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement big(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("big", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote() {
        return create("blockquote");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(String value) {
        return create("blockquote", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(Object... children) {
        return create("blockquote", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("blockquote", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(HTMLProps<Element> props) {
        return create("blockquote", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(HTMLProps<Element> props, String html) {
        return create("blockquote", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(HTMLProps<Element> props, Object... children) {
        return create("blockquote", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("blockquote", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback) {
        return create("blockquote", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement blockquote(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("blockquote", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body() {
        return create("body");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(String value) {
        return create("body", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(Object... children) {
        return create("body", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback, String html) {
        return create("body", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(HTMLProps<BodyElement> props) {
        return create("body", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(HTMLProps<BodyElement> props, String html) {
        return create("body", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(HTMLProps<BodyElement> props, Object... children) {
        return create("body", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("body", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback) {
        return create("body", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement body(Func.Run1<HTMLProps<BodyElement>> callback, Object... children) {
        return create("body", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br() {
        return create("br");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(String value) {
        return create("br", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(Object... children) {
        return create("br", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(Func.Run1<HTMLProps<BRElement>> callback, String html) {
        return create("br", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(HTMLProps<BRElement> props) {
        return create("br", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(HTMLProps<BRElement> props, String html) {
        return create("br", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(HTMLProps<BRElement> props, Object... children) {
        return create("br", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(Func.Run1<HTMLProps<BRElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("br", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(Func.Run1<HTMLProps<BRElement>> callback) {
        return create("br", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement br(Func.Run1<HTMLProps<BRElement>> callback, Object... children) {
        return create("br", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button() {
        return create("button");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(String value) {
        return create("button", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(Object... children) {
        return create("button", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback, String html) {
        return create("button", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(HTMLProps<ButtonElement> props) {
        return create("button", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(HTMLProps<ButtonElement> props, String html) {
        return create("button", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(HTMLProps<ButtonElement> props, Object... children) {
        return create("button", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("button", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback) {
        return create("button", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement button(Func.Run1<HTMLProps<ButtonElement>> callback, Object... children) {
        return create("button", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas() {
        return create("canvas");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(String value) {
        return create("canvas", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(Object... children) {
        return create("canvas", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback, String html) {
        return create("canvas", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(HTMLProps<CanvasElement> props) {
        return create("canvas", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(HTMLProps<CanvasElement> props, String html) {
        return create("canvas", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(HTMLProps<CanvasElement> props, Object... children) {
        return create("canvas", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("canvas", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback) {
        return create("canvas", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement canvas(Func.Run1<HTMLProps<CanvasElement>> callback, Object... children) {
        return create("canvas", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption() {
        return create("caption");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(String value) {
        return create("caption", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(Object... children) {
        return create("caption", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback, String html) {
        return create("caption", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(HTMLProps<TableCaptionElement> props) {
        return create("caption", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(HTMLProps<TableCaptionElement> props, String html) {
        return create("caption", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(HTMLProps<TableCaptionElement> props, Object... children) {
        return create("caption", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("caption", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback) {
        return create("caption", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement caption(Func.Run1<HTMLProps<TableCaptionElement>> callback, Object... children) {
        return create("caption", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite() {
        return create("cite");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(String value) {
        return create("cite", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(Object... children) {
        return create("cite", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("cite", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(HTMLProps<Element> props) {
        return create("cite", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(HTMLProps<Element> props, String html) {
        return create("cite", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(HTMLProps<Element> props, Object... children) {
        return create("cite", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("cite", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(Func.Run1<HTMLProps<Element>> callback) {
        return create("cite", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement cite(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("cite", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code() {
        return create("code");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(String value) {
        return create("code", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(Object... children) {
        return create("code", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("code", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(HTMLProps<Element> props) {
        return create("code", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(HTMLProps<Element> props, String html) {
        return create("code", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(HTMLProps<Element> props, Object... children) {
        return create("code", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("code", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(Func.Run1<HTMLProps<Element>> callback) {
        return create("code", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement code(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("code", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col() {
        return create("col");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(String value) {
        return create("col", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(Object... children) {
        return create("col", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback, String html) {
        return create("col", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(HTMLProps<TableColElement> props) {
        return create("col", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(HTMLProps<TableColElement> props, String html) {
        return create("col", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(HTMLProps<TableColElement> props, Object... children) {
        return create("col", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("col", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback) {
        return create("col", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement col(Func.Run1<HTMLProps<TableColElement>> callback, Object... children) {
        return create("col", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup() {
        return create("colgroup");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(String value) {
        return create("colgroup", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(Object... children) {
        return create("colgroup", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("colgroup", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(HTMLProps<Element> props) {
        return create("colgroup", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(HTMLProps<Element> props, String html) {
        return create("colgroup", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(HTMLProps<Element> props, Object... children) {
        return create("colgroup", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("colgroup", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback) {
        return create("colgroup", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement colgroup(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("colgroup", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data() {
        return create("data");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(String value) {
        return create("data", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(Object... children) {
        return create("data", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("data", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(HTMLProps<Element> props) {
        return create("data", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(HTMLProps<Element> props, String html) {
        return create("data", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(HTMLProps<Element> props, Object... children) {
        return create("data", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("data", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(Func.Run1<HTMLProps<Element>> callback) {
        return create("data", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement data(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("data", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist() {
        return create("datalist");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(String value) {
        return create("datalist", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(Object... children) {
        return create("datalist", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("datalist", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(HTMLProps<Element> props) {
        return create("datalist", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(HTMLProps<Element> props, String html) {
        return create("datalist", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(HTMLProps<Element> props, Object... children) {
        return create("datalist", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("datalist", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(Func.Run1<HTMLProps<Element>> callback) {
        return create("datalist", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement datalist(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("datalist", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd() {
        return create("dd");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(String value) {
        return create("dd", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(Object... children) {
        return create("dd", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dd", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(HTMLProps<Element> props) {
        return create("dd", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(HTMLProps<Element> props, String html) {
        return create("dd", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(HTMLProps<Element> props, Object... children) {
        return create("dd", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dd", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(Func.Run1<HTMLProps<Element>> callback) {
        return create("dd", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dd(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dd", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del() {
        return create("del");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(String value) {
        return create("del", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(Object... children) {
        return create("del", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("del", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(HTMLProps<Element> props) {
        return create("del", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(HTMLProps<Element> props, String html) {
        return create("del", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(HTMLProps<Element> props, Object... children) {
        return create("del", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("del", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(Func.Run1<HTMLProps<Element>> callback) {
        return create("del", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement del(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("del", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details() {
        return create("details");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(String value) {
        return create("details", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(Object... children) {
        return create("details", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback, String html) {
        return create("details", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(HTMLProps<DetailsElement> props) {
        return create("details", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(HTMLProps<DetailsElement> props, String html) {
        return create("details", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(HTMLProps<DetailsElement> props, Object... children) {
        return create("details", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("details", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback) {
        return create("details", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement details(Func.Run1<HTMLProps<DetailsElement>> callback, Object... children) {
        return create("details", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn() {
        return create("dfn");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(String value) {
        return create("dfn", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(Object... children) {
        return create("dfn", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dfn", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(HTMLProps<Element> props) {
        return create("dfn", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(HTMLProps<Element> props, String html) {
        return create("dfn", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(HTMLProps<Element> props, Object... children) {
        return create("dfn", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dfn", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(Func.Run1<HTMLProps<Element>> callback) {
        return create("dfn", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dfn(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dfn", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog() {
        return create("dialog");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(String value) {
        return create("dialog", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(Object... children) {
        return create("dialog", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dialog", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(HTMLProps<Element> props) {
        return create("dialog", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(HTMLProps<Element> props, String html) {
        return create("dialog", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(HTMLProps<Element> props, Object... children) {
        return create("dialog", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dialog", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(Func.Run1<HTMLProps<Element>> callback) {
        return create("dialog", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dialog(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dialog", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div() {
        return create("div");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(String value) {
        return create("div", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(Object... children) {
        return create("div", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(Func.Run1<HTMLProps<DivElement>> callback, String html) {
        return create("div", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(HTMLProps<DivElement> props) {
        return create("div", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(HTMLProps<DivElement> props, String html) {
        return create("div", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(HTMLProps<DivElement> props, Object... children) {
        return create("div", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(Func.Run1<HTMLProps<DivElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("div", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(Func.Run1<HTMLProps<DivElement>> callback) {
        return create("div", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement div(Func.Run1<HTMLProps<DivElement>> callback, Object... children) {
        return create("div", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl() {
        return create("dl");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(String value) {
        return create("dl", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(Object... children) {
        return create("dl", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback, String html) {
        return create("dl", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(HTMLProps<DListElement> props) {
        return create("dl", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(HTMLProps<DListElement> props, String html) {
        return create("dl", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(HTMLProps<DListElement> props, Object... children) {
        return create("dl", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dl", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback) {
        return create("dl", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dl(Func.Run1<HTMLProps<DListElement>> callback, Object... children) {
        return create("dl", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt() {
        return create("dt");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(String value) {
        return create("dt", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(Object... children) {
        return create("dt", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("dt", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(HTMLProps<Element> props) {
        return create("dt", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(HTMLProps<Element> props, String html) {
        return create("dt", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(HTMLProps<Element> props, Object... children) {
        return create("dt", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("dt", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(Func.Run1<HTMLProps<Element>> callback) {
        return create("dt", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement dt(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("dt", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em() {
        return create("em");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(String value) {
        return create("em", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(Object... children) {
        return create("em", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("em", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(HTMLProps<Element> props) {
        return create("em", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(HTMLProps<Element> props, String html) {
        return create("em", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(HTMLProps<Element> props, Object... children) {
        return create("em", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("em", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(Func.Run1<HTMLProps<Element>> callback) {
        return create("em", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement em(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("em", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed() {
        return create("embed");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(String value) {
        return create("embed", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(Object... children) {
        return create("embed", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback, String html) {
        return create("embed", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(HTMLProps<EmbedElement> props) {
        return create("embed", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(HTMLProps<EmbedElement> props, String html) {
        return create("embed", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(HTMLProps<EmbedElement> props, Object... children) {
        return create("embed", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("embed", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback) {
        return create("embed", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement embed(Func.Run1<HTMLProps<EmbedElement>> callback, Object... children) {
        return create("embed", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset() {
        return create("fieldset");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(String value) {
        return create("fieldset", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(Object... children) {
        return create("fieldset", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback, String html) {
        return create("fieldset", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(HTMLProps<FieldSetElement> props) {
        return create("fieldset", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(HTMLProps<FieldSetElement> props, String html) {
        return create("fieldset", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(HTMLProps<FieldSetElement> props, Object... children) {
        return create("fieldset", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("fieldset", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback) {
        return create("fieldset", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement fieldset(Func.Run1<HTMLProps<FieldSetElement>> callback, Object... children) {
        return create("fieldset", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption() {
        return create("figcaption");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(String value) {
        return create("figcaption", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(Object... children) {
        return create("figcaption", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("figcaption", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(HTMLProps<Element> props) {
        return create("figcaption", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(HTMLProps<Element> props, String html) {
        return create("figcaption", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(HTMLProps<Element> props, Object... children) {
        return create("figcaption", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("figcaption", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback) {
        return create("figcaption", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figcaption(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("figcaption", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure() {
        return create("figure");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(String value) {
        return create("figure", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(Object... children) {
        return create("figure", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("figure", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(HTMLProps<Element> props) {
        return create("figure", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(HTMLProps<Element> props, String html) {
        return create("figure", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(HTMLProps<Element> props, Object... children) {
        return create("figure", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("figure", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(Func.Run1<HTMLProps<Element>> callback) {
        return create("figure", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement figure(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("figure", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer() {
        return create("footer");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(String value) {
        return create("footer", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(Object... children) {
        return create("footer", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("footer", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(HTMLProps<Element> props) {
        return create("footer", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(HTMLProps<Element> props, String html) {
        return create("footer", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(HTMLProps<Element> props, Object... children) {
        return create("footer", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("footer", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(Func.Run1<HTMLProps<Element>> callback) {
        return create("footer", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement footer(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("footer", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form() {
        return create("form");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(String value) {
        return create("form", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(Object... children) {
        return create("form", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(Func.Run1<HTMLProps<FormElement>> callback, String html) {
        return create("form", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(HTMLProps<FormElement> props) {
        return create("form", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(HTMLProps<FormElement> props, String html) {
        return create("form", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(HTMLProps<FormElement> props, Object... children) {
        return create("form", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(Func.Run1<HTMLProps<FormElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("form", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(Func.Run1<HTMLProps<FormElement>> callback) {
        return create("form", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement form(Func.Run1<HTMLProps<FormElement>> callback, Object... children) {
        return create("form", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1() {
        return create("h1");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(String value) {
        return create("h1", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(Object... children) {
        return create("h1", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h1", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(HTMLProps<HeadingElement> props) {
        return create("h1", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(HTMLProps<HeadingElement> props, String html) {
        return create("h1", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(HTMLProps<HeadingElement> props, Object... children) {
        return create("h1", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h1", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h1", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h1(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h1", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2() {
        return create("h2");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(String value) {
        return create("h2", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(Object... children) {
        return create("h2", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h2", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(HTMLProps<HeadingElement> props) {
        return create("h2", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(HTMLProps<HeadingElement> props, String html) {
        return create("h2", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(HTMLProps<HeadingElement> props, Object... children) {
        return create("h2", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h2", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h2", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h2(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h2", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3() {
        return create("h3");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(String value) {
        return create("h3", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(Object... children) {
        return create("h3", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h3", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(HTMLProps<HeadingElement> props) {
        return create("h3", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(HTMLProps<HeadingElement> props, String html) {
        return create("h3", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(HTMLProps<HeadingElement> props, Object... children) {
        return create("h3", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h3", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h3", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h3(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h3", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4() {
        return create("h4");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(String value) {
        return create("h4", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(Object... children) {
        return create("h4", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h4", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(HTMLProps<HeadingElement> props) {
        return create("h4", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(HTMLProps<HeadingElement> props, String html) {
        return create("h4", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(HTMLProps<HeadingElement> props, Object... children) {
        return create("h4", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h4", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h4", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h4(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h4", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5() {
        return create("h5");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(String value) {
        return create("h5", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(Object... children) {
        return create("h5", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h5", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(HTMLProps<HeadingElement> props) {
        return create("h5", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(HTMLProps<HeadingElement> props, String html) {
        return create("h5", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(HTMLProps<HeadingElement> props, Object... children) {
        return create("h5", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h5", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h5", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h5(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h5", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6() {
        return create("h6");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(String value) {
        return create("h6", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(Object... children) {
        return create("h6", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback, String html) {
        return create("h6", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(HTMLProps<HeadingElement> props) {
        return create("h6", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(HTMLProps<HeadingElement> props, String html) {
        return create("h6", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(HTMLProps<HeadingElement> props, Object... children) {
        return create("h6", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("h6", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback) {
        return create("h6", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement h6(Func.Run1<HTMLProps<HeadingElement>> callback, Object... children) {
        return create("h6", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head() {
        return create("head");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(String value) {
        return create("head", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(Object... children) {
        return create("head", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback, String html) {
        return create("head", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(HTMLProps<HeadElement> props) {
        return create("head", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(HTMLProps<HeadElement> props, String html) {
        return create("head", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(HTMLProps<HeadElement> props, Object... children) {
        return create("head", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("head", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback) {
        return create("head", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement head(Func.Run1<HTMLProps<HeadElement>> callback, Object... children) {
        return create("head", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header() {
        return create("header");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(String value) {
        return create("header", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(Object... children) {
        return create("header", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("header", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(HTMLProps<Element> props) {
        return create("header", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(HTMLProps<Element> props, String html) {
        return create("header", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(HTMLProps<Element> props, Object... children) {
        return create("header", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("header", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(Func.Run1<HTMLProps<Element>> callback) {
        return create("header", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement header(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("header", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr() {
        return create("hr");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(String value) {
        return create("hr", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(Object... children) {
        return create("hr", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback, String html) {
        return create("hr", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(HTMLProps<HRElement> props) {
        return create("hr", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(HTMLProps<HRElement> props, String html) {
        return create("hr", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(HTMLProps<HRElement> props, Object... children) {
        return create("hr", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("hr", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback) {
        return create("hr", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement hr(Func.Run1<HTMLProps<HRElement>> callback, Object... children) {
        return create("hr", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html() {
        return create("html");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(String value) {
        return create("html", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(Object... children) {
        return create("html", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback, String html) {
        return create("html", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(HTMLProps<HtmlElement> props) {
        return create("html", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(HTMLProps<HtmlElement> props, String html) {
        return create("html", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(HTMLProps<HtmlElement> props, Object... children) {
        return create("html", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("html", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback) {
        return create("html", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement html(Func.Run1<HTMLProps<HtmlElement>> callback, Object... children) {
        return create("html", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i() {
        return create("i");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(String value) {
        return create("i", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(Object... children) {
        return create("i", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("i", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(HTMLProps<Element> props) {
        return create("i", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(HTMLProps<Element> props, String html) {
        return create("i", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(HTMLProps<Element> props, Object... children) {
        return create("i", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("i", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(Func.Run1<HTMLProps<Element>> callback) {
        return create("i", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement i(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("i", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe() {
        return create("iframe");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(String value) {
        return create("iframe", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(Object... children) {
        return create("iframe", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback, String html) {
        return create("iframe", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(HTMLProps<IFrameElement> props) {
        return create("iframe", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(HTMLProps<IFrameElement> props, String html) {
        return create("iframe", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(HTMLProps<IFrameElement> props, Object... children) {
        return create("iframe", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("iframe", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback) {
        return create("iframe", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement iframe(Func.Run1<HTMLProps<IFrameElement>> callback, Object... children) {
        return create("iframe", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img() {
        return create("img");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(String value) {
        return create("img", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(Object... children) {
        return create("img", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback, String html) {
        return create("img", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(HTMLProps<ImageElement> props) {
        return create("img", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(HTMLProps<ImageElement> props, String html) {
        return create("img", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(HTMLProps<ImageElement> props, Object... children) {
        return create("img", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("img", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback) {
        return create("img", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement img(Func.Run1<HTMLProps<ImageElement>> callback, Object... children) {
        return create("img", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input() {
        return create("input");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(String value) {
        return create("input", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(Object... children) {
        return create("input", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(Func.Run1<HTMLProps<InputElement>> callback, String html) {
        return create("input", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(HTMLProps<InputElement> props) {
        return create("input", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(HTMLProps<InputElement> props, String html) {
        return create("input", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(HTMLProps<InputElement> props, Object... children) {
        return create("input", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(Func.Run1<HTMLProps<InputElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("input", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(Func.Run1<HTMLProps<InputElement>> callback) {
        return create("input", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement input(Func.Run1<HTMLProps<InputElement>> callback, Object... children) {
        return create("input", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins() {
        return create("ins");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(String value) {
        return create("ins", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(Object... children) {
        return create("ins", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("ins", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(HTMLProps<Element> props) {
        return create("ins", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(HTMLProps<Element> props, String html) {
        return create("ins", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(HTMLProps<Element> props, Object... children) {
        return create("ins", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ins", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(Func.Run1<HTMLProps<Element>> callback) {
        return create("ins", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ins(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("ins", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd() {
        return create("kbd");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(String value) {
        return create("kbd", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(Object... children) {
        return create("kbd", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("kbd", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(HTMLProps<Element> props) {
        return create("kbd", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(HTMLProps<Element> props, String html) {
        return create("kbd", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(HTMLProps<Element> props, Object... children) {
        return create("kbd", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("kbd", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(Func.Run1<HTMLProps<Element>> callback) {
        return create("kbd", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement kbd(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("kbd", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen() {
        return create("keygen");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(String value) {
        return create("keygen", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(Object... children) {
        return create("keygen", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback, String html) {
        return create("keygen", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(HTMLProps<KeygenElement> props) {
        return create("keygen", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(HTMLProps<KeygenElement> props, String html) {
        return create("keygen", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(HTMLProps<KeygenElement> props, Object... children) {
        return create("keygen", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("keygen", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback) {
        return create("keygen", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement keygen(Func.Run1<HTMLProps<KeygenElement>> callback, Object... children) {
        return create("keygen", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label() {
        return create("label");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(String value) {
        return create("label", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(Object... children) {
        return create("label", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback, String html) {
        return create("label", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(HTMLProps<LabelElement> props) {
        return create("label", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(HTMLProps<LabelElement> props, String html) {
        return create("label", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(HTMLProps<LabelElement> props, Object... children) {
        return create("label", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("label", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback) {
        return create("label", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement label(Func.Run1<HTMLProps<LabelElement>> callback, Object... children) {
        return create("label", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend() {
        return create("legend");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(String value) {
        return create("legend", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(Object... children) {
        return create("legend", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback, String html) {
        return create("legend", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(HTMLProps<LegendElement> props) {
        return create("legend", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(HTMLProps<LegendElement> props, String html) {
        return create("legend", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(HTMLProps<LegendElement> props, Object... children) {
        return create("legend", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("legend", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback) {
        return create("legend", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement legend(Func.Run1<HTMLProps<LegendElement>> callback, Object... children) {
        return create("legend", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li() {
        return create("li");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(String value) {
        return create("li", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(Object... children) {
        return create("li", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(Func.Run1<HTMLProps<LIElement>> callback, String html) {
        return create("li", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(HTMLProps<LIElement> props) {
        return create("li", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(HTMLProps<LIElement> props, String html) {
        return create("li", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(HTMLProps<LIElement> props, Object... children) {
        return create("li", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(Func.Run1<HTMLProps<LIElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("li", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(Func.Run1<HTMLProps<LIElement>> callback) {
        return create("li", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement li(Func.Run1<HTMLProps<LIElement>> callback, Object... children) {
        return create("li", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link() {
        return create("link");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(String value) {
        return create("link", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(Object... children) {
        return create("link", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback, String html) {
        return create("link", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(HTMLProps<LinkElement> props) {
        return create("link", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(HTMLProps<LinkElement> props, String html) {
        return create("link", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(HTMLProps<LinkElement> props, Object... children) {
        return create("link", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("link", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback) {
        return create("link", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement link(Func.Run1<HTMLProps<LinkElement>> callback, Object... children) {
        return create("link", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main() {
        return create("main");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(String value) {
        return create("main", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(Object... children) {
        return create("main", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("main", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(HTMLProps<Element> props) {
        return create("main", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(HTMLProps<Element> props, String html) {
        return create("main", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(HTMLProps<Element> props, Object... children) {
        return create("main", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("main", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(Func.Run1<HTMLProps<Element>> callback) {
        return create("main", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement main(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("main", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map() {
        return create("map");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(String value) {
        return create("map", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(Object... children) {
        return create("map", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(Func.Run1<HTMLProps<MapElement>> callback, String html) {
        return create("map", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(HTMLProps<MapElement> props) {
        return create("map", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(HTMLProps<MapElement> props, String html) {
        return create("map", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(HTMLProps<MapElement> props, Object... children) {
        return create("map", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(Func.Run1<HTMLProps<MapElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("map", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(Func.Run1<HTMLProps<MapElement>> callback) {
        return create("map", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement map(Func.Run1<HTMLProps<MapElement>> callback, Object... children) {
        return create("map", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark() {
        return create("mark");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(String value) {
        return create("mark", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(Object... children) {
        return create("mark", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback, String html) {
        return create("mark", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(HTMLProps<MapElement> props) {
        return create("mark", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(HTMLProps<MapElement> props, String html) {
        return create("mark", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(HTMLProps<MapElement> props, Object... children) {
        return create("mark", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("mark", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback) {
        return create("mark", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement mark(Func.Run1<HTMLProps<MapElement>> callback, Object... children) {
        return create("mark", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu() {
        return create("menu");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(String value) {
        return create("menu", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(Object... children) {
        return create("menu", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback, String html) {
        return create("menu", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(HTMLProps<MenuElement> props) {
        return create("menu", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(HTMLProps<MenuElement> props, String html) {
        return create("menu", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(HTMLProps<MenuElement> props, Object... children) {
        return create("menu", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("menu", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback) {
        return create("menu", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menu(Func.Run1<HTMLProps<MenuElement>> callback, Object... children) {
        return create("menu", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem() {
        return create("menuitem");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(String value) {
        return create("menuitem", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(Object... children) {
        return create("menuitem", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("menuitem", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(HTMLProps<Element> props) {
        return create("menuitem", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(HTMLProps<Element> props, String html) {
        return create("menuitem", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(HTMLProps<Element> props, Object... children) {
        return create("menuitem", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("menuitem", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback) {
        return create("menuitem", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement menuitem(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("menuitem", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta() {
        return create("meta");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(String value) {
        return create("meta", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(Object... children) {
        return create("meta", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback, String html) {
        return create("meta", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(HTMLProps<MetaElement> props) {
        return create("meta", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(HTMLProps<MetaElement> props, String html) {
        return create("meta", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(HTMLProps<MetaElement> props, Object... children) {
        return create("meta", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("meta", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback) {
        return create("meta", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meta(Func.Run1<HTMLProps<MetaElement>> callback, Object... children) {
        return create("meta", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter() {
        return create("meter");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(String value) {
        return create("meter", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(Object... children) {
        return create("meter", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback, String html) {
        return create("meter", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(HTMLProps<MeterElement> props) {
        return create("meter", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(HTMLProps<MeterElement> props, String html) {
        return create("meter", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(HTMLProps<MeterElement> props, Object... children) {
        return create("meter", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("meter", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback) {
        return create("meter", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement meter(Func.Run1<HTMLProps<MeterElement>> callback, Object... children) {
        return create("meter", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav() {
        return create("nav");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(String value) {
        return create("nav", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(Object... children) {
        return create("nav", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("nav", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(HTMLProps<Element> props) {
        return create("nav", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(HTMLProps<Element> props, String html) {
        return create("nav", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(HTMLProps<Element> props, Object... children) {
        return create("nav", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("nav", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(Func.Run1<HTMLProps<Element>> callback) {
        return create("nav", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement nav(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("nav", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript() {
        return create("noscript");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(String value) {
        return create("noscript", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(Object... children) {
        return create("noscript", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("noscript", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(HTMLProps<Element> props) {
        return create("noscript", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(HTMLProps<Element> props, String html) {
        return create("noscript", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(HTMLProps<Element> props, Object... children) {
        return create("noscript", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("noscript", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(Func.Run1<HTMLProps<Element>> callback) {
        return create("noscript", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement noscript(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("noscript", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object() {
        return create("object");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(String value) {
        return create("object", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(Object... children) {
        return create("object", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback, String html) {
        return create("object", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(HTMLProps<ObjectElement> props) {
        return create("object", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(HTMLProps<ObjectElement> props, String html) {
        return create("object", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(HTMLProps<ObjectElement> props, Object... children) {
        return create("object", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("object", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback) {
        return create("object", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement object(Func.Run1<HTMLProps<ObjectElement>> callback, Object... children) {
        return create("object", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol() {
        return create("ol");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(String value) {
        return create("ol", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(Object... children) {
        return create("ol", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback, String html) {
        return create("ol", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(HTMLProps<OListElement> props) {
        return create("ol", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(HTMLProps<OListElement> props, String html) {
        return create("ol", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(HTMLProps<OListElement> props, Object... children) {
        return create("ol", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ol", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback) {
        return create("ol", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ol(Func.Run1<HTMLProps<OListElement>> callback, Object... children) {
        return create("ol", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup() {
        return create("optgroup");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(String value) {
        return create("optgroup", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(Object... children) {
        return create("optgroup", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback, String html) {
        return create("optgroup", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(HTMLProps<OptGroupElement> props) {
        return create("optgroup", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(HTMLProps<OptGroupElement> props, String html) {
        return create("optgroup", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(HTMLProps<OptGroupElement> props, Object... children) {
        return create("optgroup", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("optgroup", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback) {
        return create("optgroup", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement optgroup(Func.Run1<HTMLProps<OptGroupElement>> callback, Object... children) {
        return create("optgroup", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option() {
        return create("option");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(String value) {
        return create("option", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(Object... children) {
        return create("option", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback, String html) {
        return create("option", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(HTMLProps<OptionElement> props) {
        return create("option", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(HTMLProps<OptionElement> props, String html) {
        return create("option", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(HTMLProps<OptionElement> props, Object... children) {
        return create("option", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("option", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback) {
        return create("option", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement option(Func.Run1<HTMLProps<OptionElement>> callback, Object... children) {
        return create("option", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output() {
        return create("output");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(String value) {
        return create("output", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(Object... children) {
        return create("output", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback, String html) {
        return create("output", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(HTMLProps<OutputElement> props) {
        return create("output", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(HTMLProps<OutputElement> props, String html) {
        return create("output", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(HTMLProps<OutputElement> props, Object... children) {
        return create("output", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("output", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback) {
        return create("output", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement output(Func.Run1<HTMLProps<OutputElement>> callback, Object... children) {
        return create("output", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p() {
        return create("p");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(String value) {
        return create("p", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(Object... children) {
        return create("p", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback, String html) {
        return create("p", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(HTMLProps<ParagraphElement> props) {
        return create("p", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(HTMLProps<ParagraphElement> props, String html) {
        return create("p", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(HTMLProps<ParagraphElement> props, Object... children) {
        return create("p", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("p", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback) {
        return create("p", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement p(Func.Run1<HTMLProps<ParagraphElement>> callback, Object... children) {
        return create("p", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param() {
        return create("param");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(String value) {
        return create("param", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(Object... children) {
        return create("param", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback, String html) {
        return create("param", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(HTMLProps<ParamElement> props) {
        return create("param", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(HTMLProps<ParamElement> props, String html) {
        return create("param", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(HTMLProps<ParamElement> props, Object... children) {
        return create("param", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("param", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback) {
        return create("param", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement param(Func.Run1<HTMLProps<ParamElement>> callback, Object... children) {
        return create("param", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture() {
        return create("picture");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(String value) {
        return create("picture", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(Object... children) {
        return create("picture", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("picture", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(HTMLProps<Element> props) {
        return create("picture", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(HTMLProps<Element> props, String html) {
        return create("picture", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(HTMLProps<Element> props, Object... children) {
        return create("picture", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("picture", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(Func.Run1<HTMLProps<Element>> callback) {
        return create("picture", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement picture(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("picture", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre() {
        return create("pre");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(String value) {
        return create("pre", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(Object... children) {
        return create("pre", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback, String html) {
        return create("pre", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(HTMLProps<PreElement> props) {
        return create("pre", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(HTMLProps<PreElement> props, String html) {
        return create("pre", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(HTMLProps<PreElement> props, Object... children) {
        return create("pre", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("pre", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback) {
        return create("pre", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement pre(Func.Run1<HTMLProps<PreElement>> callback, Object... children) {
        return create("pre", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress() {
        return create("progress");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(String value) {
        return create("progress", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(Object... children) {
        return create("progress", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback, String html) {
        return create("progress", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(HTMLProps<ProgressElement> props) {
        return create("progress", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(HTMLProps<ProgressElement> props, String html) {
        return create("progress", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(HTMLProps<ProgressElement> props, Object... children) {
        return create("progress", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("progress", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback) {
        return create("progress", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement progress(Func.Run1<HTMLProps<ProgressElement>> callback, Object... children) {
        return create("progress", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q() {
        return create("q");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(String value) {
        return create("q", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(Object... children) {
        return create("q", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback, String html) {
        return create("q", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(HTMLProps<QuoteElement> props) {
        return create("q", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(HTMLProps<QuoteElement> props, String html) {
        return create("q", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(HTMLProps<QuoteElement> props, Object... children) {
        return create("q", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("q", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback) {
        return create("q", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement q(Func.Run1<HTMLProps<QuoteElement>> callback, Object... children) {
        return create("q", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp() {
        return create("rp");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(String value) {
        return create("rp", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(Object... children) {
        return create("rp", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("rp", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(HTMLProps<Element> props) {
        return create("rp", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(HTMLProps<Element> props, String html) {
        return create("rp", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(HTMLProps<Element> props, Object... children) {
        return create("rp", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("rp", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(Func.Run1<HTMLProps<Element>> callback) {
        return create("rp", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rp(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("rp", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt() {
        return create("rt");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(String value) {
        return create("rt", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(Object... children) {
        return create("rt", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("rt", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(HTMLProps<Element> props) {
        return create("rt", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(HTMLProps<Element> props, String html) {
        return create("rt", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(HTMLProps<Element> props, Object... children) {
        return create("rt", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("rt", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(Func.Run1<HTMLProps<Element>> callback) {
        return create("rt", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement rt(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("rt", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby() {
        return create("ruby");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(String value) {
        return create("ruby", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(Object... children) {
        return create("ruby", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("ruby", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(HTMLProps<Element> props) {
        return create("ruby", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(HTMLProps<Element> props, String html) {
        return create("ruby", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(HTMLProps<Element> props, Object... children) {
        return create("ruby", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ruby", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(Func.Run1<HTMLProps<Element>> callback) {
        return create("ruby", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ruby(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("ruby", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s() {
        return create("s");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(String value) {
        return create("s", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(Object... children) {
        return create("s", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("s", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(HTMLProps<Element> props) {
        return create("s", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(HTMLProps<Element> props, String html) {
        return create("s", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(HTMLProps<Element> props, Object... children) {
        return create("s", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("s", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(Func.Run1<HTMLProps<Element>> callback) {
        return create("s", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement s(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("s", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp() {
        return create("samp");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(String value) {
        return create("samp", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(Object... children) {
        return create("samp", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("samp", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(HTMLProps<Element> props) {
        return create("samp", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(HTMLProps<Element> props, String html) {
        return create("samp", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(HTMLProps<Element> props, Object... children) {
        return create("samp", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("samp", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(Func.Run1<HTMLProps<Element>> callback) {
        return create("samp", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement samp(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("samp", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script() {
        return create("script");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(String value) {
        return create("script", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(Object... children) {
        return create("script", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback, String html) {
        return create("script", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(HTMLProps<ScriptElement> props) {
        return create("script", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(HTMLProps<ScriptElement> props, String html) {
        return create("script", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(HTMLProps<ScriptElement> props, Object... children) {
        return create("script", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("script", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback) {
        return create("script", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement script(Func.Run1<HTMLProps<ScriptElement>> callback, Object... children) {
        return create("script", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section() {
        return create("section");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(String value) {
        return create("section", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(Object... children) {
        return create("section", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback, String html) {
        return create("section", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(HTMLProps<TableSectionElement> props) {
        return create("section", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(HTMLProps<TableSectionElement> props, String html) {
        return create("section", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(HTMLProps<TableSectionElement> props, Object... children) {
        return create("section", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("section", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback) {
        return create("section", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement section(Func.Run1<HTMLProps<TableSectionElement>> callback, Object... children) {
        return create("section", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select() {
        return create("select");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(String value) {
        return create("select", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(Object... children) {
        return create("select", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback, String html) {
        return create("select", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(HTMLProps<SelectElement> props) {
        return create("select", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(HTMLProps<SelectElement> props, String html) {
        return create("select", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(HTMLProps<SelectElement> props, Object... children) {
        return create("select", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("select", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback) {
        return create("select", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement select(Func.Run1<HTMLProps<SelectElement>> callback, Object... children) {
        return create("select", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small() {
        return create("small");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(String value) {
        return create("small", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(Object... children) {
        return create("small", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("small", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(HTMLProps<Element> props) {
        return create("small", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(HTMLProps<Element> props, String html) {
        return create("small", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(HTMLProps<Element> props, Object... children) {
        return create("small", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("small", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(Func.Run1<HTMLProps<Element>> callback) {
        return create("small", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement small(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("small", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source() {
        return create("source");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(String value) {
        return create("source", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(Object... children) {
        return create("source", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback, String html) {
        return create("source", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(HTMLProps<SourceElement> props) {
        return create("source", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(HTMLProps<SourceElement> props, String html) {
        return create("source", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(HTMLProps<SourceElement> props, Object... children) {
        return create("source", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("source", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback) {
        return create("source", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement source(Func.Run1<HTMLProps<SourceElement>> callback, Object... children) {
        return create("source", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span() {
        return create("span");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(String value) {
        return create("span", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(Object... children) {
        return create("span", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback, String html) {
        return create("span", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(HTMLProps<SpanElement> props) {
        return create("span", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(HTMLProps<SpanElement> props, String html) {
        return create("span", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(HTMLProps<SpanElement> props, Object... children) {
        return create("span", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("span", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback) {
        return create("span", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement span(Func.Run1<HTMLProps<SpanElement>> callback, Object... children) {
        return create("span", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong() {
        return create("strong");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(String value) {
        return create("strong", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(Object... children) {
        return create("strong", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("strong", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(HTMLProps<Element> props) {
        return create("strong", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(HTMLProps<Element> props, String html) {
        return create("strong", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(HTMLProps<Element> props, Object... children) {
        return create("strong", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("strong", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(Func.Run1<HTMLProps<Element>> callback) {
        return create("strong", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement strong(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("strong", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style() {
        return create("style");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(String value) {
        return create("style", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(Object... children) {
        return create("style", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback, String html) {
        return create("style", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(HTMLProps<StyleElement> props) {
        return create("style", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(HTMLProps<StyleElement> props, String html) {
        return create("style", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(HTMLProps<StyleElement> props, Object... children) {
        return create("style", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("style", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback) {
        return create("style", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement style(Func.Run1<HTMLProps<StyleElement>> callback, Object... children) {
        return create("style", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub() {
        return create("sub");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(String value) {
        return create("sub", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(Object... children) {
        return create("sub", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("sub", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(HTMLProps<Element> props) {
        return create("sub", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(HTMLProps<Element> props, String html) {
        return create("sub", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(HTMLProps<Element> props, Object... children) {
        return create("sub", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("sub", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(Func.Run1<HTMLProps<Element>> callback) {
        return create("sub", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sub(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("sub", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary() {
        return create("summary");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(String value) {
        return create("summary", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(Object... children) {
        return create("summary", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("summary", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(HTMLProps<Element> props) {
        return create("summary", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(HTMLProps<Element> props, String html) {
        return create("summary", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(HTMLProps<Element> props, Object... children) {
        return create("summary", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("summary", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(Func.Run1<HTMLProps<Element>> callback) {
        return create("summary", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement summary(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("summary", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup() {
        return create("sup");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(String value) {
        return create("sup", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(Object... children) {
        return create("sup", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("sup", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(HTMLProps<Element> props) {
        return create("sup", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(HTMLProps<Element> props, String html) {
        return create("sup", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(HTMLProps<Element> props, Object... children) {
        return create("sup", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("sup", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(Func.Run1<HTMLProps<Element>> callback) {
        return create("sup", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement sup(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("sup", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table() {
        return create("table");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(String value) {
        return create("table", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(Object... children) {
        return create("table", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(Func.Run1<HTMLProps<TableElement>> callback, String html) {
        return create("table", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(HTMLProps<TableElement> props) {
        return create("table", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(HTMLProps<TableElement> props, String html) {
        return create("table", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(HTMLProps<TableElement> props, Object... children) {
        return create("table", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(Func.Run1<HTMLProps<TableElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("table", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(Func.Run1<HTMLProps<TableElement>> callback) {
        return create("table", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement table(Func.Run1<HTMLProps<TableElement>> callback, Object... children) {
        return create("table", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody() {
        return create("tbody");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(String value) {
        return create("tbody", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(Object... children) {
        return create("tbody", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback, String html) {
        return create("tbody", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(HTMLProps<TableSectionElement> props) {
        return create("tbody", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(HTMLProps<TableSectionElement> props, String html) {
        return create("tbody", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(HTMLProps<TableSectionElement> props, Object... children) {
        return create("tbody", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("tbody", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback) {
        return create("tbody", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tbody(Func.Run1<HTMLProps<TableSectionElement>> callback, Object... children) {
        return create("tbody", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td() {
        return create("td");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(String value) {
        return create("td", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(Object... children) {
        return create("td", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback, String html) {
        return create("td", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(HTMLProps<TableCellElement> props) {
        return create("td", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(HTMLProps<TableCellElement> props, String html) {
        return create("td", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(HTMLProps<TableCellElement> props, Object... children) {
        return create("td", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("td", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback) {
        return create("td", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement td(Func.Run1<HTMLProps<TableCellElement>> callback, Object... children) {
        return create("td", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea() {
        return create("textarea");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(String value) {
        return create("textarea", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(Object... children) {
        return create("textarea", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback, String html) {
        return create("textarea", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(HTMLProps<TextAreaElement> props) {
        return create("textarea", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(HTMLProps<TextAreaElement> props, String html) {
        return create("textarea", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(HTMLProps<TextAreaElement> props, Object... children) {
        return create("textarea", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("textarea", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback) {
        return create("textarea", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement textarea(Func.Run1<HTMLProps<TextAreaElement>> callback, Object... children) {
        return create("textarea", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot() {
        return create("tfoot");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(String value) {
        return create("tfoot", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(Object... children) {
        return create("tfoot", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("tfoot", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(HTMLProps<Element> props) {
        return create("tfoot", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(HTMLProps<Element> props, String html) {
        return create("tfoot", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(HTMLProps<Element> props, Object... children) {
        return create("tfoot", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("tfoot", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback) {
        return create("tfoot", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tfoot(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("tfoot", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th() {
        return create("th");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(String value) {
        return create("th", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(Object... children) {
        return create("th", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback, String html) {
        return create("th", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(HTMLProps<TableCellElement> props) {
        return create("th", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(HTMLProps<TableCellElement> props, String html) {
        return create("th", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(HTMLProps<TableCellElement> props, Object... children) {
        return create("th", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("th", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback) {
        return create("th", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement th(Func.Run1<HTMLProps<TableCellElement>> callback, Object... children) {
        return create("th", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead() {
        return create("thead");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(String value) {
        return create("thead", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(Object... children) {
        return create("thead", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback, String html) {
        return create("thead", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(HTMLProps<TableSectionElement> props) {
        return create("thead", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(HTMLProps<TableSectionElement> props, String html) {
        return create("thead", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(HTMLProps<TableSectionElement> props, Object... children) {
        return create("thead", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("thead", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback) {
        return create("thead", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement thead(Func.Run1<HTMLProps<TableSectionElement>> callback, Object... children) {
        return create("thead", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time() {
        return create("time");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(String value) {
        return create("time", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(Object... children) {
        return create("time", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("time", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(HTMLProps<Element> props) {
        return create("time", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(HTMLProps<Element> props, String html) {
        return create("time", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(HTMLProps<Element> props, Object... children) {
        return create("time", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("time", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(Func.Run1<HTMLProps<Element>> callback) {
        return create("time", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement time(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("time", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title() {
        return create("title");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(String value) {
        return create("title", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(Object... children) {
        return create("title", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback, String html) {
        return create("title", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(HTMLProps<TitleElement> props) {
        return create("title", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(HTMLProps<TitleElement> props, String html) {
        return create("title", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(HTMLProps<TitleElement> props, Object... children) {
        return create("title", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("title", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback) {
        return create("title", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement title(Func.Run1<HTMLProps<TitleElement>> callback, Object... children) {
        return create("title", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr() {
        return create("tr");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(String value) {
        return create("tr", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(Object... children) {
        return create("tr", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback, String html) {
        return create("tr", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(HTMLProps<TableRowElement> props) {
        return create("tr", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(HTMLProps<TableRowElement> props, String html) {
        return create("tr", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(HTMLProps<TableRowElement> props, Object... children) {
        return create("tr", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("tr", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback) {
        return create("tr", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement tr(Func.Run1<HTMLProps<TableRowElement>> callback, Object... children) {
        return create("tr", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track() {
        return create("track");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(String value) {
        return create("track", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(Object... children) {
        return create("track", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback, String html) {
        return create("track", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(HTMLProps<TrackElement> props) {
        return create("track", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(HTMLProps<TrackElement> props, String html) {
        return create("track", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(HTMLProps<TrackElement> props, Object... children) {
        return create("track", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("track", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback) {
        return create("track", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement track(Func.Run1<HTMLProps<TrackElement>> callback, Object... children) {
        return create("track", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u() {
        return create("u");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(String value) {
        return create("u", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(Object... children) {
        return create("u", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("u", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(HTMLProps<Element> props) {
        return create("u", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(HTMLProps<Element> props, String html) {
        return create("u", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(HTMLProps<Element> props, Object... children) {
        return create("u", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("u", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(Func.Run1<HTMLProps<Element>> callback) {
        return create("u", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement u(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("u", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul() {
        return create("ul");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(String value) {
        return create("ul", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(Object... children) {
        return create("ul", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback, String html) {
        return create("ul", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(HTMLProps<UListElement> props) {
        return create("ul", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(HTMLProps<UListElement> props, String html) {
        return create("ul", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(HTMLProps<UListElement> props, Object... children) {
        return create("ul", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("ul", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback) {
        return create("ul", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement ul(Func.Run1<HTMLProps<UListElement>> callback, Object... children) {
        return create("ul", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var() {
        return create("var");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(String value) {
        return create("var", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(Object... children) {
        return create("var", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("var", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(HTMLProps<Element> props) {
        return create("var", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(HTMLProps<Element> props, String html) {
        return create("var", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(HTMLProps<Element> props, Object... children) {
        return create("var", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("var", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(Func.Run1<HTMLProps<Element>> callback) {
        return create("var", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement var(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("var", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video() {
        return create("video");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(String value) {
        return create("video", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(Object... children) {
        return create("video", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback, String html) {
        return create("video", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(HTMLProps<VideoElement> props) {
        return create("video", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(HTMLProps<VideoElement> props, String html) {
        return create("video", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(HTMLProps<VideoElement> props, Object... children) {
        return create("video", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("video", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback) {
        return create("video", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement video(Func.Run1<HTMLProps<VideoElement>> callback, Object... children) {
        return create("video", callback, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr() {
        return create("wbr");
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(String value) {
        return create("wbr", value);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(Object... children) {
        return create("wbr", children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(Func.Run1<HTMLProps<Element>> callback, String html) {
        return create("wbr", callback, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(HTMLProps<Element> props) {
        return create("wbr", props);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(HTMLProps<Element> props, String html) {
        return create("wbr", props, html);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(HTMLProps<Element> props, Object... children) {
        return create("wbr", props, children);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(Func.Run1<HTMLProps<Element>> callback, Func.Run1<ChildList> childrenCallback) {
        return create("wbr", callback, childrenCallback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(Func.Run1<HTMLProps<Element>> callback) {
        return create("wbr", callback);
    }

    static io.clickhandler.reactGwt.client.react.ReactElement wbr(Func.Run1<HTMLProps<Element>> callback, Object... children) {
        return create("wbr", callback, children);
    }

    class ChildList {
        private ArrayList<Object> list = new ArrayList<>();

        public ArrayList<Object> getList() {
            return list;
        }

        public Object[] toArray() {
            return toObjectArray(list);
        }

        public ChildList add(Number... nums) {
            if (nums == null) {
                return this;
            }
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            return this;
        }

        public ChildList add(String... children) {
            if (children == null) {
                return this;
            }
            for (int i = 0; i < children.length; i++) {
                list.add(children[i]);
            }
            return this;
        }

        public ChildList add(io.clickhandler.reactGwt.client.react.ReactElement... children) {
            if (children == null) {
                return this;
            }
            for (int i = 0; i < children.length; i++) {
                list.add(children[i]);
            }
            return this;
        }
    }
}
