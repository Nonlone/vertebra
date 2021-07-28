package per.nonlone.vertebra.product.po;

import lombok.Data;
import per.nonlone.vertebra.common.BasePo;
import per.nonlone.vertebra.product.constant.AttributeProperty;
import per.nonlone.vertebra.product.constant.AttributeValueType;

@Data
public class AttributePo extends BasePo {

    private Long id;

    private String appId;

    private String name;

    private AttributeProperty property;

    private String code;

    private AttributeValueType valueType;

    private String valueCheckExpression;


}
