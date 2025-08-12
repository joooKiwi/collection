package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Set;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// An [ImmutableSet] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see java.util.Collections#emptySet
/// @see joookiwi.collection.java.CollectionConstants#emptySet
@Singleton
@NotNullByDefault
public class EmptySet<T extends @Nullable Object>
        extends EmptyCollection<T>
        implements ImmutableSet<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySet<?> __instance;

    protected EmptySet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptySet<T>) instance;
        synchronized (EmptySet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptySet<T>) instance2;
            return (EmptySet<T>) (__instance = new EmptySet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Set<?>))
            return false;
        return ((Collection<?>) other).isEmpty();
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
