package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// An [ImmutableSequencedSet] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
@Singleton
@NotNullByDefault
public class EmptySequencedSet<T extends @Nullable Object>
        extends EmptySet<T>
        implements ImmutableSequencedSet<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequencedSet<?> __instance;

    protected EmptySequencedSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySequencedSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptySequencedSet<T>) instance;
        synchronized (EmptySequencedSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptySequencedSet<T>) instance2;
            return (EmptySequencedSet<T>) (__instance = new EmptySequencedSet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public T getFirst() { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public T getLast() { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySequencedSet<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySequencedSet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
