package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.iterator.CollectionIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a [CollectionIteratorValue]
/// with specified [CollectionIterator] (for debugging purpose),
/// a [CollectionHolder] (for debugging purpose)
/// and the [#index] to give the index that the [#value] needs to be retrieved
///
/// @param <T>          The element type
/// @param <COLLECTION> The [CollectionHolder] source
@NotNullByDefault
public class GenericCollectionIteratorValue<T extends @Nullable Object,
        REFERENCE extends CollectionIterator<? extends T>,
        COLLECTION extends CollectionHolder<? extends T>>
        extends AbstractIteratorValue<T>
        implements CollectionIteratorValue<T> {

    private final REFERENCE __iterator;
    private final COLLECTION __collection;
    private final @Range(from = 0, to = MAX_INT_VALUE) int __index;

    public GenericCollectionIteratorValue(final REFERENCE iterator, final COLLECTION collection, final @Range(from = 0, to = MAX_INT_VALUE) int index) {
        super();
        __iterator = iterator;
        __collection = collection;
        __index = index;
    }

    @Contract(pure = true)
    protected REFERENCE _iterator() { return __iterator; }

    @Contract(pure = true)
    @Override public COLLECTION collection() { return __collection; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int index() { return __index; }

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean isDone() { return false; }

    @Contract(value = ALWAYS_TRUE_0, pure = true)
    @Override public boolean isNotDone() { return true; }

    @Override public T value() { return collection().get(index()); }

}
