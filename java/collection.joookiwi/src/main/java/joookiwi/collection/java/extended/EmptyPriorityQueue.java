package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import joookiwi.collection.java.extended.stream.EmptyParallelStream;
import joookiwi.collection.java.extended.stream.EmptySequentialStream;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CollectionConstants.emptyParallelStream;
import static joookiwi.collection.java.CollectionConstants.emptyStream;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A [Singleton] implementation of the [java.util.PriorityQueue],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see joookiwi.collection.java.CollectionConstants#emptyPriorityQueue
@Singleton
@NotNullByDefault
public class EmptyPriorityQueue<T>
        extends ImmutablePriorityQueue<T> {

    @Serial private static final long serialVersionUID = 5014405748644523030L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyPriorityQueue<?> __instance;

    protected EmptyPriorityQueue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyPriorityQueue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyPriorityQueue<T>) instance;
        synchronized (EmptyPriorityQueue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyPriorityQueue<T>) instance2;
            return (EmptyPriorityQueue<T>) (__instance = new EmptyPriorityQueue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T element() { throw new NoSuchElementException("No element could be found in an empty PriorityBlockingQueue."); }

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable T peek() { return null; }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(value = ALWAYS_FALSE_1, pure = true) @Override public boolean contains(final @Nullable Object value) { return false; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean containsAll(final @Nullable @Unmodifiable Collection<?> values) {
        if (values == null)
            return false;
        return values.isEmpty();
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Contract(pure = true) @Override public void forEach(final @Nullable Consumer<? super T> action) {}

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(pure = true) @Override public EmptyIterator<T> iterator() { return emptyIterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true) @Override public EmptySequentialStream<T> stream() { return emptyStream(); }

    @Contract(pure = true) @Override public EmptyParallelStream<T> parallelStream() { return emptyParallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              Object[] toArray(                                ) { return new Object[0]; }
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
    //#region -------------------- Comparator methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable Comparator<? super T> comparator() { return null; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyPriorityQueue<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- Serializable methods --------------------

    @Serial
    private Object readResolve() { return getInstance(); }

    //#endregion -------------------- Serializable methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true) @Override public String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
