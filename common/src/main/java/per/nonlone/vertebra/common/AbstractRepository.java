package per.nonlone.vertebra.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 公共 ORM 储存
 * @param <M>
 * @param <T>
 */
public abstract class AbstractRepository<M extends BaseMapper<T>, T extends BasePo> extends ServiceImpl<M,T> {



}
