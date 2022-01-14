package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.ProductSaleAttributeValueMapper;
import per.nonlone.vertebra.product.po.ProductSaleAttributeValuePo;

@Repository
public class ProductSaleAttributeValueRepository extends AbstractProductRepository<ProductSaleAttributeValueMapper, ProductSaleAttributeValuePo> {
}
