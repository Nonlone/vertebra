package per.nonlone.vertebra.ddd.operate;

/**
 * 操作后置的
 */
public interface AfterWriteOperational<T> {

    /**
     * 后置执行方法
     * @param t
     * @return
     */
    default T after(T t){
        return t;
    }
}
