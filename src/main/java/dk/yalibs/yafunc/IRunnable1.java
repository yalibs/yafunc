package dk.yalibs.yafunc;

/**
 * A functional interface similar to {@link Runnable} but with an argument.
 *
 * Example usage:
 * <pre>
 * {@code
 * Runnable1<String> r = (String argument) -> System.out.println(argument);
 * r.run("Hello World")
 * }
 * </pre>
 *
 * @param <T1> type of the function argument
 */
@FunctionalInterface
public interface IRunnable1<T1> {
    /**
     * The function to run.
     * @param t1 first argument
     */
    void run(T1 t1);
}

