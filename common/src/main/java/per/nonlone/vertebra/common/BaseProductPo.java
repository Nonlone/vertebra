package per.nonlone.vertebra.common;

import lombok.Data;

/**
 * 基础商品Po
 */
@Data
public abstract class BaseProductPo extends BasePo{

    private String appId;

    private String sellerId;

    private String storeId;


}
