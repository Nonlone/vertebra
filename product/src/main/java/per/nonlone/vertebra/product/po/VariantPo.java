package per.nonlone.vertebra.product.po;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BaseProductPo;

/**
 * 商品变体，为具体某个销售规格下的商品
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VariantPo extends BaseProductPo {

    private Long id;

    private Long productId;

    private boolean shelves;

    private LocalDateTime upTime;

    private LocalDateTime downTime;

    private BigDecimal price;

}
