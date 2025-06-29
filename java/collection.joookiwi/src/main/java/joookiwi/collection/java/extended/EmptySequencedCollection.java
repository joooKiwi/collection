package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// An [ImmutableSequencedCollection] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
@Singleton
@NotNullByDefault
public class EmptySequencedCollection<T extends @Nullable Object>
        extends EmptyCollection<T>
        implements ImmutableSequencedCollection<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequencedCollection<?> __instance;

    protected EmptySequencedCollection() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySequencedCollection<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptySequencedCollection<T>) instance;
        synchronized (EmptySequencedCollection.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptySequencedCollection<T>) instance2;
            return (EmptySequencedCollection<T>) (__instance = new EmptySequencedCollection<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public T getFirst() { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public T getLast() { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySequencedCollection<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySequencedCollection<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
