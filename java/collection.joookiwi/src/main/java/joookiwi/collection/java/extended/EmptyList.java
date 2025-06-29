package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.List;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// An [ImmutableList] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see java.util.Collections#emptyList
/// @see joookiwi.collection.java.CollectionConstants#emptyList
@Singleton
@NotNullByDefault
public class EmptyList<T extends @Nullable Object>
        extends EmptySequencedCollection<T>
        implements ImmutableList<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyList<?> __instance;

    protected EmptyList() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyList<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyList<T>) instance;
        synchronized (EmptyList.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyList<T>) instance2;
            return (EmptyList<T>) (__instance = new EmptyList<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_1, pure = true) @Override public T get(final int index) { throw new EmptyCollectionException(null, index); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int indexOf(@Nullable Object value) { return -1; }

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int lastIndexOf(@Nullable Object value) { return -1; }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- As subdivided --------------------

    @Contract(value = ALWAYS_FAIL_2, pure = true) @Override public EmptyList<T> subList(final int from, final int to) { throw new EmptyCollectionException(); }

    //#endregion -------------------- As subdivided --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyList<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public EmptyIterator<T> listIterator() { return emptyIterator(); }

    @Override public EmptyIterator<T> listIterator(final int index) { return emptyIterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof List<?>))
            return false;
        return ((Collection<?>) other).isEmpty();
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyList<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
