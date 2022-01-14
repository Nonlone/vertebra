package per.nonlone.vertebra.product.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BasePo;
import per.nonlone.vertebra.product.constant.AttributeProperty;
import per.nonlone.vertebra.product.constant.AttributeValueType;

@Data
@EqualsAndHashCode(callSuper = true)
public class AttributePo extends BasePo {

    private Long id;

    private String appId;

    private String name;

    /**
     * 属性类型，标记当前属性是什么类型
     */
    private AttributeProperty property;

    private String code;

    private AttributeValueType valueType;

    private String valueCheckExpression;


}
