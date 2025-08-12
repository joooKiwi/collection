package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.MinimalistCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public class GenericCollectionIteratorValue<T extends @Nullable Object,
        COLLECTION extends MinimalistCollectionHolder<? extends T>>
        extends AbstractIteratorValue<T>
        implements CollectionIteratorValue<T> {

    private final COLLECTION __collection;
    private final @Range(from = 0, to = MAX_INT_VALUE) int __index;

    public GenericCollectionIteratorValue(final COLLECTION collection, final @Range(from = 0, to = MAX_INT_VALUE) int index) {
        super();
        __collection = collection;
        __index = index;
    }

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
