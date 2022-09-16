package per.nonlone.vertebra.ddd.operate;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 领域操作
 * @param <T>
 */
public interface WriteOperate<T> extends BiFunction<Function<T,T>,T,T> {

}
