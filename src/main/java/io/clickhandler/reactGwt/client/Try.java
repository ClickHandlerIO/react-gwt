package io.clickhandler.reactGwt.client;

import com.google.gwt.user.client.Timer;

/**
 *
 */
public class Try {
    /**
     *
     * @param callback
     */
    public static void later(io.clickhandler.reactGwt.client.Func.Run callback) {
        if (callback == null) {
            return;
        }

        new Timer() {
            @Override
            public void run() {
                try {
                    callback.run();
                } catch (Throwable e) {
                    // Ignore.
                }
            }
        }.schedule(0);
    }

    public static void later(int millis, io.clickhandler.reactGwt.client.Func.Run callback) {
        if (callback == null) {
            return;
        }

        new Timer() {
            @Override
            public void run() {
                try {
                    callback.run();
                } catch (Throwable e) {
                    // Ignore.
                }
            }
        }.schedule(millis);
    }

    public static void silent(io.clickhandler.reactGwt.client.Func.Run callback) {
        if (callback == null) {
            return;
        }
        try {
            callback.run();
        } catch (Throwable e) {
            // Ignore.
        }
    }

    public static <A> void silent(io.clickhandler.reactGwt.client.Func.Run1<A> callback, A arg) {
        if (callback == null) {
            return;
        }
        try {
            callback.run(arg);
        } catch (Throwable e) {
            // Ignore.
        }
    }

    public static RunResult run(io.clickhandler.reactGwt.client.Func.Run callback) {
        if (callback == null) {
            return new RunResult(null);
        }
        try {
            callback.run();
            return new RunResult(null);
        } catch (Throwable e) {
            // Ignore.
            return new RunResult(e);
        }
    }

    public static <T> CallResult<T> call(io.clickhandler.reactGwt.client.Func.Call<T> callback) {
        if (callback == null) {
            return new CallResult<>(null, null);
        }
        try {
            return new CallResult<>(callback.call(), null);
        } catch (Throwable e) {
            // Ignore.
            return new CallResult<>(null, e);
        }
    }

    public static class CallResult<T> {
        private final T result;
        private final Throwable e;

        public CallResult() {
            this(null, null);
        }

        public CallResult(T result) {
            this(result, null);
        }

        public CallResult(Throwable e) {
            this(null, e);
        }

        public CallResult(T result, Throwable e) {
            this.result = result;
            this.e = e;
        }

        public CallResult<T> success(io.clickhandler.reactGwt.client.Func.Run1<T> success) {
            if (e == null && success != null) {
                success.run(result);
            }
            return this;
        }

        public CallResult<T> failure(io.clickhandler.reactGwt.client.Func.Run1<Throwable> failure) {
            if (e != null && failure != null) {
                failure.run(e);
            }
            return this;
        }
    }

    public static class RunResult {
        private final Throwable e;

        public RunResult(Throwable e) {
            this.e = e;
        }

        public RunResult success(io.clickhandler.reactGwt.client.Func.Run success) {
            if (e == null && success != null) {
                success.run();
            }
            return this;
        }

        public RunResult failure(io.clickhandler.reactGwt.client.Func.Run1<Throwable> failure) {
            if (e != null && failure != null) {
                failure.run(e);
            }
            return this;
        }
    }
}
