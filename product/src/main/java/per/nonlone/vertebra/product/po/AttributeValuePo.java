package per.nonlone.vertebra.product.po;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BasePo;

@Data
@EqualsAndHashCode(callSuper = true)
public class AttributeValuePo  extends BasePo {

    private Long id;

    private String appId;

    private String value;

    private String code;
}
