package per.nonlone.vertebra.ddd.context;

import java.util.HashMap;
import java.util.Map;

import per.nonlone.vertebra.ddd.exception.DomainRegistException;

public class DomainContext {

    private static final Map<String,Class<?>> CONTEXT = new HashMap<>();


    public static synchronized void registerDomain(String domainType,Class<?> clazz){
        if(CONTEXT.containsKey(domainType)){
            Class<?> existClazz = CONTEXT.get(domainType);
           throw new DomainRegistException(String.format("domainType:%s is exist, map to class:%s , duplicate class:%",domainType,existClazz.getName(),clazz.getName()));
        }
        CONTEXT.put(domainType,clazz);
    }


}
