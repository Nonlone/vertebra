package per.nonlone.vertebra.product.common;


import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import per.nonlone.vertebra.common.BasePo;
import per.nonlone.vertebra.common.DomainType;

@Component
public class DomainPoPersistProcessorMap {

    /**
     * 创建器Map
     */
    private Map<DomainType,Map<Class<? extends BasePo>, DomainPoSaveProcessor<? extends BasePo,?>>> saveProcessorMap = new HashMap<>();

    /**
     * 更新器Map
     */
    private Map<DomainType,Map<Class<? extends BasePo>,DomainPoUpdateProcessor<? extends BasePo>>> updateProcessorMap = new HashMap<>();

    /**
     * 初始化SaveProcessor
     * @param domainType
     * @param domainPoSaveProcessor
     * @param <T>
     */
    public <T extends BasePo> void addSaveProcessor(DomainType domainType,DomainPoSaveProcessor<T,?> domainPoSaveProcessor){
        Map<Class<? extends BasePo>, DomainPoSaveProcessor<? extends BasePo,?>> saveMap = saveProcessorMap.get(domainType);
        if(CollectionUtils.isEmpty(saveMap)){
            saveMap = new HashMap<>();
            saveProcessorMap.put(domainType,saveMap);
        }
        saveMap.put(domainPoSaveProcessor.getClassOfPo(),domainPoSaveProcessor);
    }

    /**
     * 获取SaveProcessor
     * @param domainType
     * @param classOfPo
     * @param <T>
     * @return
     */
    public <T extends BasePo> DomainPoSaveProcessor<T,?> getSaveProcessor(DomainType domainType,Class<T> classOfPo){
        Map<Class<? extends BasePo>, DomainPoSaveProcessor<? extends BasePo,?>> saveMap = saveProcessorMap.get(domainType);
        if(CollectionUtils.isEmpty(saveMap)||!saveMap.containsKey(classOfPo)){
            throw new UnsupportedOperationException(StrUtil.format("No such save processor domainType<{}> classOfPo<{}>",domainType,classOfPo));
        }
        return (DomainPoSaveProcessor<T,?>) saveMap.get(classOfPo);
    }


    /**
     * 初始化UpdateProcessor
     * @param domainType
     * @param domainPoUpdateProcessor
     * @param <T>
     */
    public <T extends BasePo> void addUpdateProcessor(DomainType domainType,DomainPoUpdateProcessor<T> domainPoUpdateProcessor){
        Map<Class<? extends BasePo>, DomainPoUpdateProcessor<? extends BasePo>> updateMap = updateProcessorMap.get(domainType);
        if(CollectionUtils.isEmpty(updateMap)){
            updateMap = new HashMap<>();
            updateProcessorMap.put(domainType,updateMap);
        }
        updateMap.put(domainPoUpdateProcessor.getClassOfPo(),domainPoUpdateProcessor);
    }


    /**
     * 获取UpdateProcessor
     * @param domainType
     * @param classOfPo
     * @param <T>
     * @return
     */
    public <T extends BasePo> DomainPoUpdateProcessor<T> getUpdateProcessor(DomainType domainType,Class<T> classOfPo){
        Map<Class<? extends BasePo>, DomainPoUpdateProcessor<? extends BasePo>> updateMap = updateProcessorMap.get(domainType);
        if(CollectionUtils.isEmpty(updateMap)||!updateMap.containsKey(classOfPo)){
            throw new UnsupportedOperationException(StrUtil.format("No such update processor domainType<{}> classOfPo<{}>",domainType,classOfPo));
        }
        return (DomainPoUpdateProcessor<T>) updateMap.get(classOfPo);
    }
}
