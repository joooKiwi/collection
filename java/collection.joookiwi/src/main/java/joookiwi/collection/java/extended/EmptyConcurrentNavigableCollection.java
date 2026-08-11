package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableConcurrentNavigableCollection] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyConcurrentNavigableCollection
@Singleton
@NotNullByDefault
public class EmptyConcurrentNavigableCollection<T extends @Nullable Object>
        extends EmptyNavigableCollection<T>
        implements ImmutableConcurrentNavigableCollection<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentNavigableCollection<?> __instance;

    protected EmptyConcurrentNavigableCollection() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyConcurrentNavigableCollection<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyConcurrentNavigableCollection<T>) instance;
        synchronized (EmptyConcurrentNavigableCollection.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyConcurrentNavigableCollection<T>) instance2;
            return (EmptyConcurrentNavigableCollection<T>) (__instance = new EmptyConcurrentNavigableCollection<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentNavigableCollection<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public EmptyIterator<T> descendingIterator() { return EmptyIterator.getInstance(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentNavigableCollection<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
