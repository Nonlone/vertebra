package per.nonlone.vertebra.ddd;

import java.util.function.Function;

public class DefaultPersistGuarantor<T>  implements PersistGuarantor<T> {


    @Override
    public Function<T,T> apply(final Function<T,T> function) {
        return function;
    }
}
