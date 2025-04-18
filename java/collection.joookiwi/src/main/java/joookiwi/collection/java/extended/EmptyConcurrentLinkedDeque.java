package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CollectionConstants.emptyParallelStream;
import static joookiwi.collection.java.CollectionConstants.emptySpliterator;
import static joookiwi.collection.java.CollectionConstants.emptyStream;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A [Singleton] implementation of the [ConcurrentLinkedDeque],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see joookiwi.collection.java.CollectionConstants#emptyConcurrentLinkedDeque
@Singleton
@NotNullByDefault
public class EmptyConcurrentLinkedDeque<T>
        extends ImmutableConcurrentLinkedDeque<T>
        implements Cloneable {

    @Serial private static final long serialVersionUID = -2856675658236218735L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentLinkedDeque<?> __instance;

    protected EmptyConcurrentLinkedDeque() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyConcurrentLinkedDeque<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyConcurrentLinkedDeque<T>) instance;
        synchronized (EmptyConcurrentLinkedDeque.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyConcurrentLinkedDeque<T>) instance2;
            return (EmptyConcurrentLinkedDeque<T>) (__instance = new EmptyConcurrentLinkedDeque<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true)
    @Override public @Nullable T peek() { return null; }

    @Contract(value = ALWAYS_NULL_0, pure = true)
    @Override public @Nullable T peekFirst() { return null; }

    @Contract(value = ALWAYS_NULL_0, pure = true)
    @Override public @Nullable T peekLast() { return null; }

    @Contract(value = ALWAYS_FAIL_0, pure = true)
    @Override public T element() { throw new NoSuchElementException("No element could be found in an empty ConcurrentLinkedDeque."); }

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

    @Contract(pure = true) @Override public Iterator<T>    iterator(          ) { return emptyIterator(); }
    @Contract(pure = true) @Override public Iterator<T>    descendingIterator() { return emptyIterator(); }
    @Contract(pure = true) @Override public Spliterator<T> spliterator(       ) { return emptySpliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public     Object[] toArray(                                ) { return new Object[0]; }
    @Contract(value = ALWAYS_1ST_1, pure = true) @Override public <U> U[]      toArray(final U[]                  array) { return array; }
    @Contract(pure = true)                       @Override public <U> U[]      toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true) @Override public Stream<T> stream() { return emptyStream(); }

    @Contract(pure = true) @Override public Stream<T> parallelStream() { return emptyParallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public @Unmodifiable ConcurrentLinkedDeque<T> reversed() { return this; }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- Equals methods --------------------

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

    //#endregion -------------------- Equals methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentLinkedDeque<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true) @Override public String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
