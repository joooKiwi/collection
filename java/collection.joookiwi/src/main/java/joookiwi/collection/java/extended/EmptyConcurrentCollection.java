package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// An [ImmutableConcurrentCollection] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyConcurrentCollection
@Singleton
@NotNullByDefault
public class EmptyConcurrentCollection<T extends @Nullable Object>
        extends EmptyCollection<T>
        implements ImmutableConcurrentCollection<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentCollection<?> __instance;

    protected EmptyConcurrentCollection() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyConcurrentCollection<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyConcurrentCollection<T>) instance;
        synchronized (EmptyConcurrentCollection.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyConcurrentCollection<T>) instance2;
            return (EmptyConcurrentCollection<T>) (__instance = new EmptyConcurrentCollection<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentCollection<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
