package per.nonlone.vertebra.ddd.domain;

import java.util.function.Function;
import com.google.common.base.Optional;
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

    protected abstract CreateOperator<K> getCreateOperator();

    protected abstract UpdateOpertaor<K> getUpdateOpertaor();

    protected abstract UpdateSelectiveOperator<K> getUpdateSelectiveOperator();

    protected abstract DeleteOperator<K> getDeleteOperator();

    protected abstract ValidateOperator<K> getValidateOperator();

    protected abstract SortOperator<K> getSortOperator();

    protected abstract ReadAndFillOperator<K> getReadAndFillOperator();

    protected CreateOperator<K> createOperator;

    protected UpdateOpertaor<K> updateOpertaor;

    protected UpdateSelectiveOperator<K> updateSelectiveOperator;

    protected DeleteOperator<K> deleteOperator;

    protected ValidateOperator<K> validateOperator;

    protected SortOperator<K> sortOperator;

    protected ReadAndFillOperator<K> readAndFillOperator;


    /**
     * 领域创建动作
     * @return
     */
    public K create(){
        // 校验bean
        K k = (K)this;
        // 执行方法
        Function<K, K> doFunction = getCreateOperator()::create;
        //前置处理
        // doFunction = doFunction.compose(Optional.<Function<K, K>>of(getSortOperator()).or(Function.identity()));
        // doFunction = doFunction.compose(Optional.<Function<K,K>>of(getValidateOperator()).or(Function.identity()));
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
