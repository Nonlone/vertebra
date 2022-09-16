package per.nonlone.vertebra.ddd.operate;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

import per.nonlone.vertebra.ddd.PersistGuarantor;

/**
 * 领域写操作抽象类
 * 
 * @param <T>
 */
public abstract class AbstractDomainWriteOperator<T> {


    protected T apply(PersistGuarantor<T> persistGuarantor, Function<T, T> before,
            Function<T, T> after, Function<T, T> doFunction, T t) {
        Function<T, T> function = doFunction;
        if (Objects.nonNull(persistGuarantor)) {
            function = persistGuarantor.apply(doFunction);
        }
        if (Objects.nonNull(before)) {
            function = function.compose(before);
        }
        if (Objects.nonNull(after)) {
            function = function.andThen(after);
        }
        return function.apply(t);
    }



}
