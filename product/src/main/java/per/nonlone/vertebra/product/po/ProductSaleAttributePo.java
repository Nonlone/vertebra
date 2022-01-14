package per.nonlone.vertebra.product.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BaseProductPo;
import per.nonlone.vertebra.product.constant.AttributeProperty;

/**
 * 商品销售属性，用于区分不同 variant 的值的名称
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductSaleAttributePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long attributeId;

    private String name;

    private String code;

    private AttributeProperty property;

}
