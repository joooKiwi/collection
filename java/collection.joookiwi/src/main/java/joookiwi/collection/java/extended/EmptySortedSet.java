package joookiwi.collection.java.extended;

import java.util.Comparator;
import java.util.SortedSet;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// An [ImmutableSortedSet] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
@Singleton
@NotNullByDefault
public class EmptySortedSet<T extends @Nullable Object>
        extends EmptySequencedSet<T>
        implements ImmutableSortedSet<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySortedSet<?> __instance;

    protected EmptySortedSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySortedSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptySortedSet<T>) instance;
        synchronized (EmptySortedSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptySortedSet<T>) instance2;
            return (EmptySortedSet<T>) (__instance = new EmptySortedSet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public final @NotNull T first() { return getFirst(); }

    @Contract(ALWAYS_FAIL_0) @Override public final @NotNull T last() { return getLast(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_FAIL_2) @Override public ImmutableSortedSet<T> subSet(final T from, final T to) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_1) @Override public ImmutableSortedSet<T> headSet(final T to) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_1) @Override public ImmutableSortedSet<T> tailSet(final T from) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySortedSet<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable Comparator<? super T> comparator() { return null; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySortedSet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
