package per.nonlone.vertebra.product.common;

import per.nonlone.vertebra.common.BasePo;

public interface DomainPoUpdateProcessor<T extends BasePo> extends DomainPoProcessor<T>{

    boolean update(T t, PersistExecutor persistExecutor);
}
