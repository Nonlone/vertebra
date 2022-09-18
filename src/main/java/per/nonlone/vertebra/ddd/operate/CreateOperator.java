package per.nonlone.vertebra.ddd.operate;

import java.util.function.Function;
import per.nonlone.vertebra.ddd.DefaultPersistGuarantor;
import per.nonlone.vertebra.ddd.PersistGuarantor;

/**
 * 创建操作器
 * @param <T>
 */
public abstract class CreateOperator<T> extends AbstractDomainWriteOperator<T> {

    private PersistGuarantor<T> persistGuarantor;

    protected CreateOperator(PersistGuarantor<T> persistGuarantor) {
        this.persistGuarantor = persistGuarantor;
    }
    
    protected CreateOperator() {
        this.persistGuarantor = new DefaultPersistGuarantor<T>();
    }

    public T create(T t) {
        return this.apply(this.persistGuarantor,this::beforeCreate,this::doCreate,this::afterCreate, t);
    }
    
    protected T beforeCreate(T t) {
        return t;
    }

    protected abstract T doCreate(T t);


    protected  T afterCreate(T t){
        return t;
    }

}
