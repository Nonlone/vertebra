package per.nonlone.vertebra.product.common;

import per.nonlone.vertebra.common.BasePo;

public interface DomainPoProcessor<T> {

    Class<T> getClassOfPo();

}
