package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface LongIterator
        extends PrimitiveIterator.OfLong,
                ImmutableListIterator<Long> {

    @Override boolean hasNext();

    @Override default Long next() { return nextLong(); }

    @Override long nextLong();


    @Override boolean hasPrevious();

    @Override default Long previous() { return previousLong(); }

    long previousLong();


    @Override default void forEachRemaining(final Consumer<? super Long> action) {
        while (hasNext())
            action.accept(nextLong());
    }

    @Override default void forEachRemaining(final LongConsumer action) {
        while (hasNext())
            action.accept(nextLong());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a LongIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Long value) { throw new UnsupportedMethodException("The method “add” is not supported in a LongIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Long value) { throw new UnsupportedMethodException("The method “set” is not supported in a LongIterator."); }

}
