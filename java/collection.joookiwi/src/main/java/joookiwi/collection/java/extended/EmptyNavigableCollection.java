package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableNavigableCollection] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyNavigableCollection
@Singleton
@NotNullByDefault
public class EmptyNavigableCollection<T extends @Nullable Object>
        extends EmptySortedCollection<T>
        implements ImmutableNavigableCollection<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyNavigableCollection<?> __instance;

    protected EmptyNavigableCollection() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyNavigableCollection<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyNavigableCollection<T>) instance;
        synchronized (EmptyNavigableCollection.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyNavigableCollection<T>) instance2;
            return (EmptyNavigableCollection<T>) (__instance = new EmptyNavigableCollection<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T floor(final T value) { return null; }

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T lower(final T value) { return null; }

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T ceiling(final T value) { return null; }

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T higher(final T value) { return null; }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyNavigableCollection<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public EmptyIterator<T> descendingIterator() { return EmptyIterator.getInstance(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyNavigableCollection<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
