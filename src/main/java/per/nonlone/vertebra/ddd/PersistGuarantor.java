package per.nonlone.vertebra.ddd;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 提供持久化保证的能力
 */
public interface PersistGuarantor<T> extends Function<Function<T,T>,Function<T,T>> {
}
