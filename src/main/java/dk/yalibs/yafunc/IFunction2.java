package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with a return value and 2 arguments.
 * @param <R> type of return value
 * @param <T1> type of the first argument
 * @param <T2> type of the second argument
 */
@FunctionalInterface
public interface IFunction2<R, T1, T2> {
    /**
     * The function to run.
     * @param t1 first argument
     * @param t2 second argument
     * @return some value of type R
     */
    R run(T1 t1, T2 t2);
}

