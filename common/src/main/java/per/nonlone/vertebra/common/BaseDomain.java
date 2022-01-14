package per.nonlone.vertebra.common;

import lombok.Getter;

/**
 * 基础领域类
 */
public abstract class BaseDomain {


    @Getter
    private final DomainType domainType;

    protected BaseDomain(DomainType domainType){
        this.domainType = domainType;
    }

}
