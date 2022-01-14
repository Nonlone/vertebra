package per.nonlone.vertebra.product.common;

import per.nonlone.vertebra.common.BasePo;

public interface DomainPoDeleteProcessor<T,K extends BasePo> extends DomainPoProcessor<K> {

    boolean delete(T t, PersistExecutor persistExecutor);

}
