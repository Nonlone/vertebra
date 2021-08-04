package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.product.mapper.VariantAttributeValueMapper;
import per.nonlone.vertebra.product.po.VariantAttributeValuePo;

@Repository
public class VariantAttributeValueRepository extends AbstractRepository<VariantAttributeValueMapper, VariantAttributeValuePo> {
}
