package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with a return value.
 *
 * Example usage:
 * <pre>
 * {@code
 * IFunction<String> f = () -> return "Hello World";
 * System.out.println(f.run());
 * }
 * </pre>
 * @param <R> type of return value
 */
@FunctionalInterface
public interface IFunction<R> {
    /**
     * The function to run.
     * @return some value of type R
     */
    R run();
}

