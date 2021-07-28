package per.nonlone.vertebra.product.po;

import lombok.Data;
import per.nonlone.vertebra.common.BaseProductPo;
import per.nonlone.vertebra.product.constant.AttributeProperty;

@Data
public class ProductSaleAttributePo extends BaseProductPo {

    private Long id;

    private Long productId;

    private Long attributeId;

    private String name;

    private String code;

    private AttributeProperty property;

}
