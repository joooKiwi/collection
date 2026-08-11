package joookiwi.collection.java.extended.set;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.EmptyConcurrentCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableConcurrentSet] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyConcurrentSet
@NotNullByDefault
public class EmptyConcurrentSet<T extends @Nullable Object>
        extends EmptySet<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentSet<?> __instance;

    protected EmptyConcurrentSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyConcurrentSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyConcurrentSet<T>) instance;
        synchronized (EmptyConcurrentSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyConcurrentSet<T>) instance2;
            return (EmptyConcurrentSet<T>) (__instance = new EmptyConcurrentSet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentSet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
