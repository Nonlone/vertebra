package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.product.common.AbstractProductRepository;
import per.nonlone.vertebra.product.mapper.ProductSaleAttributeMapper;
import per.nonlone.vertebra.product.po.ProductSaleAttributePo;

@Repository
public class ProductSaleAttributeRepository extends AbstractProductRepository<ProductSaleAttributeMapper, ProductSaleAttributePo> {
}
