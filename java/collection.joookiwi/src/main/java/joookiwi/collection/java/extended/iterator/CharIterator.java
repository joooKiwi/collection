package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public interface CharIterator
        extends PrimitiveIterator<Character, CharConsumer>,
                ImmutableListIterator<Character> {

    @Override boolean hasNext();

    @Override default Character next() { return nextChar(); }

    char nextChar();


    @Override boolean hasPrevious();

    @Override default Character previous() { return previousChar(); }

    char previousChar();


    @Override default void forEachRemaining(final Consumer<? super Character> action) {
        while (hasNext())
            action.accept(nextChar());
    }

    @Override default void forEachRemaining(final CharConsumer action) {
        while (hasNext())
            action.accept(nextChar());
    }


    @Contract(ALWAYS_FAIL_0) @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in a CharIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void add(final @Nullable Character value) { throw new UnsupportedMethodException("The method “add” is not supported in a CharIterator."); }

    @Contract(ALWAYS_FAIL_1) @Override default void set(final @Nullable Character value) { throw new UnsupportedMethodException("The method “set” is not supported in a CharIterator."); }

}
