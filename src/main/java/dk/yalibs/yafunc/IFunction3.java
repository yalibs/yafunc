package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with a return value and 3 arguments.
 * @param <R> type of return value
 * @param <T1> type of the first argument
 * @param <T2> type of the second argument
 * @param <T3> type of the third argument
 */
@FunctionalInterface
public interface IFunction3<R, T1, T2, T3> {
    /**
     * The function to run.
     * @param t1 first argument
     * @param t2 second argument
     * @param t3 third argument
     * @return some value of type R
     */
    R run(T1 t1, T2 t2, T3 t3);
}

