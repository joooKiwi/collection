package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

/// An implementation of an [OutsideIteratorValue] whe it is
/// before the first element of a [CollectionIterator][joookiwi.collection.java.iterator.CollectionIterator]
///
/// @param <T> The type
@Singleton
@NotNullByDefault
public class GenericBeforeFirstIteratorValue<T extends @Nullable Object>
        extends AbstractIteratorValue<T>
        implements OutsideIteratorValue<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable GenericBeforeFirstIteratorValue<?> __instance;

    protected GenericBeforeFirstIteratorValue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> GenericBeforeFirstIteratorValue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (GenericBeforeFirstIteratorValue<T>) instance;
        synchronized (GenericBeforeFirstIteratorValue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (GenericBeforeFirstIteratorValue<T>) instance2;
            return (GenericBeforeFirstIteratorValue<T>) (__instance = new GenericBeforeFirstIteratorValue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(ALWAYS_TRUE_0)
    @Override public boolean isDone() { return true; }

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean isNotDone() { return false; }

    @Contract(ALWAYS_FAIL_0)
    @Override public T value() { throw new NoElementFoundInCollectionException("No value is expected before the start of the iterator."); }

}
