package per.nonlone.vertebra.product.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BaseProductPo;

@Data
@EqualsAndHashCode(callSuper = true)
public class VariantSaleAttributeValuePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long variantId;

    private String productAttributeId;

    private String productAttributeValueId;

}
