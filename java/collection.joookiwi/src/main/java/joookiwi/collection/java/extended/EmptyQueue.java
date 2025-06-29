package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.EmptyCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableQueue] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyQueue
@Singleton
@NotNullByDefault
public class EmptyQueue<T extends @Nullable Object>
        extends EmptyCollection<T>
        implements ImmutableQueue<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyQueue<?> __instance;

    protected EmptyQueue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyQueue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyQueue<T>) instance;
        synchronized (EmptyQueue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyQueue<T>) instance2;
            return (EmptyQueue<T>) (__instance = new EmptyQueue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T element() { throw new EmptyCollectionException(); }

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable T peek() { return null; }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyQueue<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
