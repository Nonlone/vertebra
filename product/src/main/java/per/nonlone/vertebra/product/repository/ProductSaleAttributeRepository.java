package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.product.mapper.ProductSaleAttributeMapper;
import per.nonlone.vertebra.product.po.ProductSaleAttributePo;

@Repository
public class ProductSaleAttributeRepository extends AbstractRepository<ProductSaleAttributeMapper, ProductSaleAttributePo> {
}
