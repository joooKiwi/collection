package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface BooleanIterator
        extends PrimitiveIterator<Boolean, BooleanConsumer>,
                ImmutableListIterator<Boolean> {

    @Override boolean hasPrevious();

    @Override default Boolean previous() { return previousBoolean(); }

    boolean previousBoolean();


    @Override boolean hasNext();

    @Override default Boolean next() { return nextBoolean(); }

    boolean nextBoolean();


    @Override default void forEachRemaining(final Consumer<? super Boolean> action) {
        while (hasNext())
            action.accept(nextBoolean());
    }

    @Override default void forEachRemaining(final BooleanConsumer action) {
        while (hasNext())
            action.accept(nextBoolean());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a BooleanIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Boolean value) { throw new UnsupportedMethodException("The method “add” is not supported in a BooleanIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Boolean value) { throw new UnsupportedMethodException("The method “set” is not supported in a BooleanIterator."); }

}
