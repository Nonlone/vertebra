package per.nonlone.vertebra.ddd.operate;

import java.util.function.Function;

/**
 * 操作前置的
 */
public interface PreOperational<T> extends Function<T,T> {
}
