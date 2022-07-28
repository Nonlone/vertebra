package per.nonlone.vertebra.ddd.operate;

import java.util.function.Function;

/**
 * 操作中包裹器
 * @param <T>
 */
public interface WrapOperational<T> extends Function<T,T> {
}
