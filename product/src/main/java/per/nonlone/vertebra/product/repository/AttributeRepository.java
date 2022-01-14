package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.AttributeMapper;
import per.nonlone.vertebra.product.po.AttributePo;

@Repository
public class AttributeRepository extends AbstractProductRepository<AttributeMapper, AttributePo> {




}
