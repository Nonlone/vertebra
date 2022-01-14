package per.nonlone.vertebra.product.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BaseProductPo;
import per.nonlone.vertebra.product.constant.AttributeProperty;

/**
 * 商品非销售属性，作用于标记商品和销售无关的属性情况
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProductAttributeValuePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long attributeId;

    private String attributeName;

    private String attributeCode;

    private AttributeProperty attributeProperty;

    private Long attributeValueId;

    private Long attributeValue;

    private Long attributeValueCode;

}
