package per.nonlone.vertebra.ddd.operate;

/**
 * 操作中包裹器
 * @param <T>
 */
public interface WrapWriteOperational<T>  {

    default T beforeInWrap(T t){
        return t;
    }

    default T afterInWrap(T t){
        return t;
    }
    default T doInWrap(T t){
        return t;
    }

    /**
     * 方法入口
     * @param t
     * @return
     */
    default T wrap(T t){
        t = beforeInWrap(t);
        t = doInWrap(t);
        t = afterInWrap(t);
        return t;
    }

}
