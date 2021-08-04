package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.product.mapper.AttributeValueMapper;
import per.nonlone.vertebra.product.po.AttributeValuePo;

@Repository
public class AttributeValueRepository extends AbstractRepository<AttributeValueMapper, AttributeValuePo> {
}
