package per.nonlone.vertebra.product.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.common.BasePo;

public abstract class AbstractProductRepository<M extends BaseMapper<T>, T extends BasePo>  extends AbstractRepository<M,T> implements SmartInitializingSingleton {

    @Autowired
    private PoRepositoryContext poRepositoryContext;

    @Override
    public void afterSingletonsInstantiated() {

        poRepositoryContext.add(getEntityClass(), this);

    }
}
