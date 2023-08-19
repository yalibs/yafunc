package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with 5 arguments.
 * @param <T1> type of the first argument
 * @param <T2> type of the second argument
 * @param <T3> type of the third argument
 * @param <T4> type of the fourth argument
 * @param <T5> type of the fifth argument
 */
@FunctionalInterface
public interface IRunnable5<T1,T2,T3,T4,T5> {
    /**
     * The function to run
     * @param t1 first argument
     * @param t2 second argument
     * @param t3 second argument
     * @param t4 second argument
     * @param t5 second argument
     */
    void run(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);
}

