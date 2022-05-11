package per.nonlone.vertebra.ddd.domain;

import per.nonlone.vertebra.ddd.context.DomainContext;

public abstract class DomainEntity implements Domanial {

    protected DomainEntity() {
        DomainContext.registerDomain(getDomainType(),getClass());
    }
}
