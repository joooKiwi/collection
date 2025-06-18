package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

/// An implementation of an [OutsideIteratorValue] when it is
/// after the last element of a [CollectionIterator][joookiwi.collection.java.iterator.CollectionIterator]
///
/// @param <T> The type
@Singleton
@NotNullByDefault
public class GenericAfterLastIteratorValue<T extends @Nullable Object>
        extends AbstractIteratorValue<T>
        implements OutsideIteratorValue<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable GenericAfterLastIteratorValue<?> __instance;

    protected GenericAfterLastIteratorValue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> GenericAfterLastIteratorValue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (GenericAfterLastIteratorValue<T>) instance;
        synchronized (GenericAfterLastIteratorValue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (GenericAfterLastIteratorValue<T>) instance2;
            return (GenericAfterLastIteratorValue<T>) (__instance = new GenericAfterLastIteratorValue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_TRUE_0, pure = true)
    @Override public boolean isDone() { return true; }

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean isNotDone() { return false; }

    @Contract(ALWAYS_FAIL_0)
    @Override public T value() { throw new NoElementFoundInCollectionException("No value is expected after the end of the iterator."); }

}
