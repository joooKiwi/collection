package joookiwi.collection.java.extended;

import java.util.Comparator;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableSortedCollection] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptySortedCollection
@Singleton
@NotNullByDefault
public class EmptySortedCollection<T extends @Nullable Object>
        extends EmptySequencedCollection<T>
        implements ImmutableSortedCollection<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySortedCollection<?> __instance;

    protected EmptySortedCollection() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySortedCollection<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptySortedCollection<T>) instance;
        synchronized (EmptySortedCollection.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptySortedCollection<T>) instance2;
            return (EmptySortedCollection<T>) (__instance = new EmptySortedCollection<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySortedCollection<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable Comparator<? super T> comparator() { return null; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySortedCollection<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
