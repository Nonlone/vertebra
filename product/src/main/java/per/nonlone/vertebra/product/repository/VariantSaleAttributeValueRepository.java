package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.VariantSaleAttributeValueMapper;
import per.nonlone.vertebra.product.po.VariantSaleAttributeValuePo;

@Repository
public class VariantSaleAttributeValueRepository extends AbstractProductRepository<VariantSaleAttributeValueMapper, VariantSaleAttributeValuePo> {
}
