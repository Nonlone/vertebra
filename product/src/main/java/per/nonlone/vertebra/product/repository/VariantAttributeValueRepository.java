package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.VariantAttributeValueMapper;
import per.nonlone.vertebra.product.po.VariantAttributeValuePo;

@Repository
public class VariantAttributeValueRepository extends AbstractProductRepository<VariantAttributeValueMapper, VariantAttributeValuePo> {
}
