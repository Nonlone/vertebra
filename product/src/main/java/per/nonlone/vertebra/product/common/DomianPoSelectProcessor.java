package per.nonlone.vertebra.product.common;

import per.nonlone.vertebra.common.BasePo;

public interface DomianPoSelectProcessor<T,K extends BasePo> extends DomainPoProcessor<K>{

    K select(T t, PersistExecutor persistExecutor);
}
