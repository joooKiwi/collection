package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface ByteIterator
        extends PrimitiveIterator<Byte, ByteConsumer>,
                ImmutableListIterator<Byte> {

    @Override boolean hasNext();

    @Override default Byte next() { return nextByte(); }

    byte nextByte();


    @Override boolean hasPrevious();

    @Override default Byte previous() { return previousByte(); }

    byte previousByte();


    @Override default void forEachRemaining(final Consumer<? super Byte> action) {
        while (hasNext())
            action.accept(nextByte());
    }

    @Override default void forEachRemaining(final ByteConsumer action) {
        while (hasNext())
            action.accept(nextByte());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a ByteIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Byte value) { throw new UnsupportedMethodException("The method “add” is not supported in a ByteIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Byte value) { throw new UnsupportedMethodException("The method “set” is not supported in a ByteIterator."); }

}
