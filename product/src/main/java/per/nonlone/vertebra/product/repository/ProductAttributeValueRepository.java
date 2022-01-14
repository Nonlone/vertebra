package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.ProductAttributeValueMapper;
import per.nonlone.vertebra.product.po.ProductAttributeValuePo;

@Repository
public class ProductAttributeValueRepository extends AbstractProductRepository<ProductAttributeValueMapper, ProductAttributeValuePo> {
}
