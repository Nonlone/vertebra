package per.nonlone.vertebra.product.po;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Currency;

import cn.hutool.core.math.Money;
import lombok.Data;
import per.nonlone.vertebra.common.BaseProductPo;
import per.nonlone.vertebra.product.constant.BrandType;
import per.nonlone.vertebra.product.constant.DescriptionType;
import per.nonlone.vertebra.product.constant.ProductType;

/**
 * 商品类
 */
@Data
public class ProductPo extends BaseProductPo {

    private Long id;

    private String title;

    private String subTitle;

    private Long categoryId;

    private ProductType type;

    private String customType;

    private boolean shelves;

    private LocalDateTime upTime;

    private LocalDateTime downTime;

    private BrandType brand_type;

    private Long brand;

    private DescriptionType descriptionType;

    private BigDecimal showPrice;

    private Currency currency;

}
