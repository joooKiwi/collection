package joookiwi.collection.java.extended.queue;

import java.io.Serial;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A [Singleton] implementation of the [java.util.concurrent.SynchronousQueue],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see joookiwi.collection.java.CollectionConstants#emptySynchronousQueue
@NotNullByDefault
public class EmptySynchronousQueue<T>
        extends ImmutableSynchronousQueue<T> {

    @Serial private static final long serialVersionUID = -5412486029142915238L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySynchronousQueue<?> __instance;

    protected EmptySynchronousQueue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySynchronousQueue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptySynchronousQueue<T>) instance;
        synchronized (EmptySynchronousQueue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptySynchronousQueue<T>) instance2;
            return (EmptySynchronousQueue<T>) (__instance = new EmptySynchronousQueue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Has methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean containsAll(final @Nullable @Unmodifiable Collection<?> values) {
        if (values == null)
            return false;
        return values.isEmpty();
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Contract(pure = true) @Override public void forEach(final @Nullable Consumer<? super T> action) {}

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_1ST_1, pure = true) @Override public <U extends @Nullable Object> U[]      toArray(final U[]               newArray) { return newArray; }
    @Contract(pure = true)                       @Override public <U extends @Nullable Object> U[]      toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int hashCode() { return DEFAULT_EMPTY_HASH_CODE; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Collection<?>))
            return false;
        return ((Collection<?>) other).isEmpty();
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySynchronousQueue<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- Serializable methods --------------------

    @Serial
    private Object readResolve() { return getInstance(); }

    //#endregion -------------------- Serializable methods --------------------

    //#endregion -------------------- Methods --------------------

}
