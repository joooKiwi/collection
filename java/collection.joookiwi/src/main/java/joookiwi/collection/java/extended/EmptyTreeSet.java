package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CollectionConstants.emptyNavigableSet;
import static joookiwi.collection.java.CollectionConstants.emptyParallelStream;
import static joookiwi.collection.java.CollectionConstants.emptySpliterator;
import static joookiwi.collection.java.CollectionConstants.emptyStream;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A [Singleton] implementation of the [java.util.TreeSet],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see joookiwi.collection.java.CollectionConstants#emptyConcurrentSkipListSet
@Singleton
@NotNullByDefault
public class EmptyTreeSet<T extends @Nullable Object>
        extends ImmutableTreeSet<T> {

    @Serial private static final long serialVersionUID = -2583644605590223615L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyTreeSet<?> __instance;

    protected EmptyTreeSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyTreeSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyTreeSet<T>) instance;
        synchronized (EmptyTreeSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyTreeSet<T>) instance2;
            return (EmptyTreeSet<T>) (__instance = new EmptyTreeSet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T first() { return getFirst(); }
    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getFirst() { throw new NoSuchElementException("No element could be found in an empty TreeSet."); }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T last() { return getLast(); }
    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getLast() { throw new NoSuchElementException("No element could be found in an empty TreeSet."); }


    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T lower(final @Nullable T value) { return null; }

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T floor(final @Nullable T value) { return null; }

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T ceiling(final @Nullable T value) { return null; }

    @Contract(value = ALWAYS_NULL_1, pure = true) @Override public @Nullable T higher(final @Nullable T value) { return null; }

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

    @Contract(pure = true) @Override public EmptyIterator<T> iterator(          ) { return emptyIterator(); }
    @Contract(pure = true) @Override public Spliterator<T>   spliterator(       ) { return emptySpliterator(); }
    @Contract(pure = true) @Override public EmptyIterator<T> descendingIterator() { return emptyIterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              Object[] toArray(                                ) { return new Object[0]; }
    @Contract(value = ALWAYS_1ST_1, pure = true) @Override public <U extends @Nullable Object> U[]      toArray(final U[]               newArray) { return newArray; }
    @Contract(pure = true)                       @Override public <U extends @Nullable Object> U[]      toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true) @Override public Stream<T> stream() { return emptyStream(); }

    @Contract(pure = true) @Override public Stream<T> parallelStream() { return emptyParallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Subset methods --------------------

    @Override public EmptyNavigableSet<T> subSet(final @Nullable T from, final boolean fromIsInclusive, final @Nullable T to, final boolean toIsInclusive) { return emptyNavigableSet(); }
    @Override public EmptyNavigableSet<T> subSet(final @Nullable T from, final @Nullable T to) { return emptyNavigableSet(); }

    @Override public EmptyNavigableSet<T> headSet(final @Nullable T to, final boolean isInclusive) { return emptyNavigableSet(); }
    @Override public EmptyNavigableSet<T> headSet(final @Nullable T to) { return emptyNavigableSet(); }

    @Override public EmptyNavigableSet<T> tailSet(final @Nullable T from, final boolean isInclusive) { return emptyNavigableSet(); }
    @Override public EmptyNavigableSet<T> tailSet(final @Nullable T from) { return emptyNavigableSet(); }

    @Override public EmptyNavigableSet<T> descendingSet() { return emptyNavigableSet(); }

    //#endregion -------------------- Subset methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyTreeSet<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int hashCode() { return DEFAULT_EMPTY_HASH_CODE; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Set<?>))
            return false;
        return ((Collection<?>) other).isEmpty();
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable Comparator<? super T> comparator() { return null; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyTreeSet<T> clone() { return this; }

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
