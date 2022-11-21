package per.nonlone.vertebra.ddd.domain;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import per.nonlone.vertebra.ddd.exception.NullOperatorException;
import per.nonlone.vertebra.ddd.operate.CreateOperator;
import per.nonlone.vertebra.ddd.operate.DeleteOperator;
import per.nonlone.vertebra.ddd.operate.ReadAndFillOperator;
import per.nonlone.vertebra.ddd.operate.SortOperator;
import per.nonlone.vertebra.ddd.operate.UpdateOpertaor;
import per.nonlone.vertebra.ddd.operate.UpdateSelectiveOperator;
import per.nonlone.vertebra.ddd.operate.ValidateOperator;

/**
 * 领域实体
 * @param <T>
 */
public abstract class DomainEntity<T,K extends DomainEntity<T,K>> implements Domanial<T> {

    protected CreateOperator<K> createOperator;

    protected UpdateOpertaor<K> updateOpertaor;

    protected UpdateSelectiveOperator<K> updateSelectiveOperator;

    protected DeleteOperator<K> deleteOperator;

    protected ValidateOperator<K> validateOperator;

    protected SortOperator<K> sortOperator;

    protected ReadAndFillOperator<K> readAndFillOperator;


    
    protected DomainEntity(
            CreateOperator<K> createOperator,
            UpdateOpertaor<K> updateOpertaor,
            UpdateSelectiveOperator<K> updateSelectiveOperator, 
            DeleteOperator<K> deleteOperator
    ) {
        this.createOperator = createOperator;
        this.updateOpertaor = updateOpertaor;
        this.updateSelectiveOperator = updateSelectiveOperator;
        this.deleteOperator = deleteOperator;
    }

    /**
     * 领域创建动作
     * @return
     */
    public K create(){
        // 校验bean
        K k = (K) this;
        if(Objects.isNull(createOperator)){
            throw new NullOperatorException("createOperator is null, class:" + getClass());
        }
        // 执行方法
        Function<K, K> doFunction = createOperator::create;
        //前置处理，栈方式处理，先入后出
        doFunction = doFunction.compose(Optional.<Function<K, K>>ofNullable(sortOperator).orElse(Function.identity()));
        doFunction = doFunction.compose(Optional.<Function<K,K>>ofNullable(validateOperator).orElse(Function.identity()));
        return doFunction.apply(k);
    }

    /**
     * 领域全量更新动作
     * @return
     */
    public K update() {
        return null;
    }

    /**
     * 领域增量更新动作
     * @return
     */
    public K updateSelective(){
        return null;
    }

    /**
     * 领域删除动作
     * @return
     */
    public K delete(){
        return null;
    }


}
