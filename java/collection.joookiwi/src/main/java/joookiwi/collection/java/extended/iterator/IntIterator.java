package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface IntIterator
        extends PrimitiveIterator.OfInt,
                ImmutableListIterator<Integer> {

    @Override boolean hasNext();

    @Override default Integer next() { return nextInt(); }

    @Override int nextInt();


    @Override boolean hasPrevious();

    @Override default Integer previous() { return previousInt(); }

    int previousInt();


    @Override default void forEachRemaining(final Consumer<? super Integer> action) {
        while (hasNext())
            action.accept(nextInt());
    }

    @Override default void forEachRemaining(final IntConsumer action) {
        while (hasNext())
            action.accept(nextInt());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an IntIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Integer value) { throw new UnsupportedMethodException("The method “add” is not supported in a BooleanIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Integer value) { throw new UnsupportedMethodException("The method “set” is not supported in a BooleanIterator."); }

}
