package io.clickhandler.reactGwt.client.react;

import java.util.Stack;

/**
 * TODO rename / do we need this?
 */
public class ChildCounter {
    private static final ChildCounter instance = new ChildCounter();
    private final Stack<Count> counts = new Stack<>();
    private Count active = null;

    private ChildCounter() {
    }

    public static ChildCounter get() {
        return instance;
    }

    public void scope() {
        active = new Count(0L);
        counts.add(active);
    }

    public void pop() {
        active = counts.pop();
    }

    public String newKey() {
        if (active != null) {
            active.count += 1;
            return String.valueOf(active.count);
        } else {
            return "-1";
        }
    }

    private static class Count {
        long count = 0L;

        public Count(long count) {
            this.count = count;
        }
    }
}
