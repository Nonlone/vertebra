package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.AttributeValueMapper;
import per.nonlone.vertebra.product.po.AttributeValuePo;

@Repository
public class AttributeValueRepository extends AbstractProductRepository<AttributeValueMapper, AttributeValuePo> {
}
