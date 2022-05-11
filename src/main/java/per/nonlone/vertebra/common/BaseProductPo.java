package per.nonlone.vertebra.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 基础商品Po
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseProductPo extends BasePo{

    private String appId;

    private String sellerId;

    private String storeId;


}
