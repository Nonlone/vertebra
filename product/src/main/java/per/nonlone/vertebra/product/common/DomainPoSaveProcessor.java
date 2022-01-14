package per.nonlone.vertebra.product.common;

import per.nonlone.vertebra.common.BasePo;

public interface DomainPoSaveProcessor<T extends BasePo,K> extends DomainPoProcessor<T> {

    K save(T t, PersistExecutor persistExecutor);

}
