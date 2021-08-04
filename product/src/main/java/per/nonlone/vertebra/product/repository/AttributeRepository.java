package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.product.mapper.AttributeMapper;
import per.nonlone.vertebra.product.po.AttributePo;

@Repository
public class AttributeRepository extends AbstractRepository<AttributeMapper, AttributePo> {


}
