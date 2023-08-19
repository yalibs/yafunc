package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with 2 arguments.
 * @param <T1> type of the first argument
 * @param <T2> type of the second argument
 */
@FunctionalInterface
public interface IRunnable2<T1,T2> {
    /**
     * The function to run
     * @param t1 first argument
     * @param t2 second argument
     */
    void run(T1 t1, T2 t2);
}

