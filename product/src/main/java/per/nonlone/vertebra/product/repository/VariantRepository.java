package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.product.mapper.VariantMapper;
import per.nonlone.vertebra.product.po.VariantPo;

@Repository
public class VariantRepository extends AbstractRepository<VariantMapper, VariantPo> {
}
