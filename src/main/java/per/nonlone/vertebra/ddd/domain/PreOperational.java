package per.nonlone.vertebra.ddd.domain;

import java.util.function.Function;

/**
 * 操作前置的
 */
public interface PreOperational<T> extends Function<T,T> {
}
