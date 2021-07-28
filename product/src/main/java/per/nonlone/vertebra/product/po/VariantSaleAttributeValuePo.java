package per.nonlone.vertebra.product.po;

import lombok.Data;
import per.nonlone.vertebra.common.BaseProductPo;

@Data
public class VariantSaleAttributeValuePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long variantId;

    private String productAttributeId;

    private String productAttributeValueId;

}
