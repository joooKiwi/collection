package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// An [ImmutableNavigableSet] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
@Singleton
@NotNullByDefault
public class EmptyNavigableSet<T extends @Nullable Object>
        extends EmptySortedSet<T>
        implements ImmutableNavigableSet<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyNavigableSet<?> __instance;

    protected EmptyNavigableSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyNavigableSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyNavigableSet<T>) instance;
        synchronized (EmptyNavigableSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyNavigableSet<T>) instance2;
            return (EmptyNavigableSet<T>) (__instance = new EmptyNavigableSet<>());
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
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_FAIL_4) @Override public ImmutableNavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_2) @Override public ImmutableNavigableSet<T> headSet(final T to, final boolean isInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_2) @Override public ImmutableNavigableSet<T> tailSet(final T from, final boolean isInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyNavigableSet<T> reversed() { return this; }

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyNavigableSet<T> descendingSet() { return reversed(); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public EmptyIterator<T> descendingIterator() { return emptyIterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyNavigableSet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
