package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

/// An [ImmutableBlockingQueue] with no values (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see joookiwi.collection.java.CollectionConstants#emptyBlockingQueue
@Singleton
@NotNullByDefault
public class EmptyBlockingQueue<T>
        extends EmptyQueue<T>
        implements ImmutableBlockingQueue<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyBlockingQueue<?> __instance;

    protected EmptyBlockingQueue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyBlockingQueue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyBlockingQueue<T>) instance;
        synchronized (EmptyBlockingQueue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyBlockingQueue<T>) instance2;
            return (EmptyBlockingQueue<T>) (__instance = new EmptyBlockingQueue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyBlockingQueue<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
