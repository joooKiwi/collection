package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
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
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A [Singleton] implementation of the [java.util.LinkedHashSet],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see java.util.Collections#emptySet
/// @see joookiwi.collection.java.CollectionConstants#emptyHashSet
@Singleton
@NotNullByDefault
public class EmptyLinkedHashSet<T extends @Nullable Object>
        extends ImmutableLinkedHashSet<T> {

    @Serial private static final long serialVersionUID = -4296537754035399243L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyLinkedHashSet<?> __instance;

    protected EmptyLinkedHashSet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyLinkedHashSet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyLinkedHashSet<T>) instance;
        synchronized (EmptyLinkedHashSet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyLinkedHashSet<T>) instance2;
            return (EmptyLinkedHashSet<T>) (__instance = new EmptyLinkedHashSet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getFirst() { throw new NoSuchElementException("No element could be found in an empty LinkedHashSet."); }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getLast() { throw new NoSuchElementException("No element could be found in an empty LinkedHashSet."); }

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

    @Contract(pure = true) @Override public Iterator<T>    iterator(   ) { return emptyIterator(); }
    @Contract(pure = true) @Override public Spliterator<T> spliterator() { return emptySpliterator(); }

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
    //#region -------------------- As reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public @Unmodifiable LinkedHashSet<T> reversed() { return this; }

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
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyLinkedHashSet<T> clone() { return this; }

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
