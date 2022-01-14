package per.nonlone.vertebra.product.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import per.nonlone.vertebra.common.BaseDomain;
import per.nonlone.vertebra.common.DomainType;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductDomain extends BaseDomain {

    public ProductDomain() {
        super(DomainType.PRODUCT);
    }

    private Long productId;


}