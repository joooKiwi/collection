package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface DoubleIterator
        extends PrimitiveIterator.OfDouble,
                ImmutableListIterator<Double> {

    @Override boolean hasNext();

    @Override default Double next() { return nextDouble(); }

    @Override double nextDouble();


    @Override boolean hasPrevious();

    @Override default Double previous() { return previousDouble(); }

    double previousDouble();


    @Override default void forEachRemaining(final Consumer<? super Double> action) {
        while (hasNext())
            action.accept(nextDouble());
    }

    @Override default void forEachRemaining(final DoubleConsumer action) {
        while (hasNext())
            action.accept(nextDouble());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a DoubleIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Double value) { throw new UnsupportedMethodException("The method “add” is not supported in a DoubleIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Double value) { throw new UnsupportedMethodException("The method “set” is not supported in a DoubleIterator."); }

}
