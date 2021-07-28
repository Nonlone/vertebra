package per.nonlone.vertebra.product.factory;

import per.nonlone.vertebra.common.BasePo;
import per.nonlone.vertebra.common.BaseRequest;

/**
 * 领域模型工厂
 */
public interface BaseEntityFactory {

    <T extends BasePo,K extends BaseRequest> T buildEntity(BaseRequest request);

}
