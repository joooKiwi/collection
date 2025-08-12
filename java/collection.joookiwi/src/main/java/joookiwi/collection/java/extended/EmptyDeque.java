package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableDeque] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyDeque
@Singleton
@NotNullByDefault
public class EmptyDeque<T extends @Nullable Object>
        extends EmptySequencedCollection<T>
        implements ImmutableDeque<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyDeque<?> __instance;

    protected EmptyDeque() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyDeque<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyDeque<T>) instance;
        synchronized (EmptyDeque.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyDeque<T>) instance2;
            return (EmptyDeque<T>) (__instance = new EmptyDeque<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T element() { throw new EmptyCollectionException(); }


    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable T peek() { return null; }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public @Nullable T peekFirst() { return null; }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public @Nullable T peekLast() { return null; }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyDeque<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public EmptyIterator<T> descendingIterator() { return emptyIterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyDeque<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
