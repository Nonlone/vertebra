package per.nonlone.vertebra.product.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BaseProductPo;

/**
 * 商品销售属性值，用于区分不同 variant 的值
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductSaleAttributeValuePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long attributeValueId;

    private Long productSaleAttributeId;

    private String value;

    private String code;
}
