package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with a return value and 1 argument.
 * @param <R> type of return value
 * @param <T1> type of the first argument
 */
@FunctionalInterface
public interface IFunction1<R, T1> {
    /**
     * The function to run.
     * @param t1 first argument
     * @return some value of type R
     */
    R run(T1 t1);
}

