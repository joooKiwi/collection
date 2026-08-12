package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface ShortIterator
        extends PrimitiveIterator<Short, ShortConsumer>,
                ImmutableListIterator<Short> {

    @Override boolean hasNext();

    @Override default Short next() { return nextShort(); }

    short nextShort();


    @Override boolean hasPrevious();

    @Override default Short previous() { return previousShort(); }

    short previousShort();


    @Override default void forEachRemaining(final Consumer<? super Short> action) {
        while (hasNext())
            action.accept(nextShort());
    }

    @Override default void forEachRemaining(final ShortConsumer action) {
        while (hasNext())
            action.accept(nextShort());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a ShortIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Short value) { throw new UnsupportedMethodException("The method “add” is not supported in a BooleanIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Short value) { throw new UnsupportedMethodException("The method “set” is not supported in a BooleanIterator."); }

}
