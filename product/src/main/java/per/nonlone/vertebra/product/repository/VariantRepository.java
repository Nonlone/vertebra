package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.VariantMapper;
import per.nonlone.vertebra.product.po.VariantPo;

@Repository
public class VariantRepository extends AbstractProductRepository<VariantMapper, VariantPo> {
}
