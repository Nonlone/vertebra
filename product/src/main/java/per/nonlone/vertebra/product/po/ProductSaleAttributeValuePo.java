package per.nonlone.vertebra.product.po;

import lombok.Data;
import per.nonlone.vertebra.common.BaseProductPo;

@Data
public class ProductSaleAttributeValuePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long attributeValueId;

    private Long productSaleAttributeId;

    private String value;

    private String code;
}
