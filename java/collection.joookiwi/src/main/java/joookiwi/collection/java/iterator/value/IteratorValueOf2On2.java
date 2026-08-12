package joookiwi.collection.java.iterator.value;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

/// An implementation of an [InsideIteratorValue] with only the 2<sup>nd</sup> value out of 2
/// if a [CollectionIterator][joookiwi.collection.java.iterator.CollectionIterator]
///
/// @param <T> The element type
@NotNullByDefault
public class IteratorValueOf2On2<T extends @Nullable Object>
        extends AbstractIteratorValue<T>
        implements InsideIteratorValue<T> {

    private final T __value;

    public IteratorValueOf2On2(final T value) {
        super();
        __value = value;
    }

    @Contract(pure = true)
    @Override public @Range(from = 1, to = 1) int index() { return 1; }

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean isDone() { return false; }

    @Contract(value = ALWAYS_TRUE_0, pure = true)
    @Override public boolean isNotDone() { return true; }

    @Contract(pure = true)
    @Override public T value() { return __value; }

}
