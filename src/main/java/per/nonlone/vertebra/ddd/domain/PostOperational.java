package per.nonlone.vertebra.ddd.domain;

import java.util.function.Function;

/**
 * 操作后置的
 */
public interface PostOperational<T> extends Function<T,T> {
}
