package per.nonlone.vertebra.product.po;

import lombok.Data;
import per.nonlone.vertebra.common.BaseProductPo;
import per.nonlone.vertebra.product.constant.AttributeProperty;

@Data
public class VariantAttributeValuePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long variantId;

    private Long attributeId;

    private String attributeName;

    private String attributeCode;

    private AttributeProperty attributeProperty;

    private Long attributeValueId;

    private String attributeValue;

    private String attributeValueCode;

}
