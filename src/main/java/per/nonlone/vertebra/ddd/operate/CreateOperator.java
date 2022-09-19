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

    private Function<T, T> beforeCreate;

    private Function<T, T> doCreate;

    private Function<T, T> afterCreate;


    protected void setBeforeCreate(Function<T, T> beforeCreate) {
        this.beforeCreate = beforeCreate;
    }

    protected void setDoCreate(Function<T, T> doCreate) {
        this.doCreate = doCreate;
    }

    protected void setAfterCreate(Function<T, T> afterCreate) {
        this.afterCreate = afterCreate;
    }

    /**
     * 构造方法，传入持久化保证策略，内部赋值上 beforeCreate，doCreate，afterCreate 方法
     * @param persistGuarantor
     */
    protected CreateOperator(PersistGuarantor<T> persistGuarantor) {
        this.persistGuarantor = persistGuarantor;
        this.beforeCreate = this::beforeCreate;
        this.doCreate = this::doCreate;
        this.afterCreate = this::afterCreate;
    }
    
    protected CreateOperator() {
        this.persistGuarantor = new DefaultPersistGuarantor<T>();
    }

    public T create(T t) {
        return this.apply(this.persistGuarantor,this.beforeCreate,this.doCreate,this.afterCreate, t);
    }
    
    /**
     * 创建前方案
     * @param t
     * @return
     */
    protected T beforeCreate(T t) {
        return t;
    }

    protected abstract T doCreate(T t);


    protected  T afterCreate(T t){
        return t;
    }

}
