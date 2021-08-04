package per.nonlone.vertebra.product.repository;

import org.springframework.stereotype.Repository;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.product.mapper.ProductSaleAttributeValueMapper;
import per.nonlone.vertebra.product.po.ProductSaleAttributeValuePo;

@Repository
public class ProductSaleAttributeValueRepository extends AbstractRepository<ProductSaleAttributeValueMapper, ProductSaleAttributeValuePo> {
}
