package per.nonlone.vertebra.product.po;

import lombok.Data;
import per.nonlone.vertebra.common.BasePo;

@Data
public class AttributeValuePo  extends BasePo {

    private Long id;

    private String appId;

    private String value;

    private String code;
}
