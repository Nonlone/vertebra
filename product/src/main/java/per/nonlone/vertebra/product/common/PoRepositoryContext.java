package per.nonlone.vertebra.product.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import per.nonlone.vertebra.common.AbstractRepository;
import per.nonlone.vertebra.common.BasePo;

@Component
public class PoRepositoryContext {

    private Map<Class<? extends BasePo>,AbstractRepository<? extends BaseMapper<?>, ? extends BasePo>> mapper = new HashMap<>();

    public <M extends BaseMapper<T>, T extends BasePo> void add(Class<T> poClass, AbstractRepository<M,T> repository){
        this.mapper.put(poClass,repository);
    }

    public void seal(){
        this.mapper = Collections.unmodifiableMap(this.mapper);
    }


}
