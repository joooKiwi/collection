package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface FloatIterator
        extends PrimitiveIterator<Float, FloatConsumer>,
                ImmutableListIterator<Float> {

    @Override boolean hasNext();

    @Override default Float next() { return nextFloat(); }

    float nextFloat();


    @Override boolean hasPrevious();

    @Override default Float previous() { return previousFloat(); }

    float previousFloat();


    @Override default void forEachRemaining(final Consumer<? super Float> action) {
        while (hasNext())
            action.accept(nextFloat());
    }

    @Override default void forEachRemaining(final FloatConsumer action) {
        while (hasNext())
            action.accept(nextFloat());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a FloatIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Float value) { throw new UnsupportedMethodException("The method “add” is not supported in a FloatIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Float value) { throw new UnsupportedMethodException("The method “set” is not supported in a FloatIterator."); }

}
