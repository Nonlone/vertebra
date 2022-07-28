package per.nonlone.vertebra.ddd.operate;

/**
 * 领域操作
 * @param <T>
 */
public interface Operate<T> extends PreOperational<T>,PostOperational<T>,WrapOperational<T> {
}
