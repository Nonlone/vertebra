package per.nonlone.vertebra.ddd.operate;

/**
 * 操作前置的
 */
public interface BeforeWriteOperational<T>  {

    /**
     * 前置执行方法
     * @param t
     * @return
     */
    default T before(T t){
        return t;
    }

}
