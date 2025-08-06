package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.HashSet;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.IteratorAsImmutableIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_LOAD_FACTOR;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [immutable-like][Unmodifiable] behaviour of a [HashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableHashSet<T extends @Nullable Object>
        extends HashSet<T>
        implements ImmutableSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -7344297456931727274L;

    private boolean __isInitialized = false;
    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#of()])
    /// with a load factor of [1][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    /// and a capacity of [0][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_INITIAL_CAPACITY]
    public ImmutableHashSet() {
        super(DEFAULT_EMPTY_INITIAL_CAPACITY, DEFAULT_EMPTY_LOAD_FACTOR);
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- loadFactor --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with a `loadFactor` received
    /// and a capacity of [0][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_INITIAL_CAPACITY]
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public ImmutableHashSet(final float loadFactor) {
        super(DEFAULT_EMPTY_INITIAL_CAPACITY, loadFactor);
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with a `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    /// and a capacity of [0][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_INITIAL_CAPACITY]
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public ImmutableHashSet(final @Nullable Float loadFactor) {
        super(DEFAULT_EMPTY_INITIAL_CAPACITY, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    //#endregion -------------------- values, loadFactor --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR]
    /// and the capacity is the `values.length`
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length);
        final var size = values.length;
        if (__isEmpty = size == 0) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#copyOf(Collection)])
    /// with a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR]
    /// and the capacity is the <code>values.[size][Collection#size()]</code>
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size());
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, loadFactor --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                            final float loadFactor) {
        super(values.length, loadFactor);
        final var size = values.length;
        if (__isEmpty = size == 0) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                            final @Nullable Float loadFactor) {
        super(values.length, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        final var size = values.length;
        if (__isEmpty = size == 0) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }


    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#copyOf(Collection)])
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final float loadFactor) {
        super(values.size(), loadFactor);
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#copyOf(Collection)])
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was non-positive or [NaN][Float#NaN]
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Nullable Float loadFactor) {
        super(values.size(), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() {
        if (__isInitialized)
            return __size;

        final var value = __size = super.size();
        __isEmpty = value == 0;
        __isInitialized = true;
        return value;
    }

    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;

        final var value = __isEmpty = (__size = super.size()) == 0;
        __isInitialized = true;
        return value;
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(pure = true)
    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Override public @Nullable Object[] toArray() { return super.toArray(); }

    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return super.toArray(newArray); }

    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return super.toArray(generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { return super.stream(); }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { return super.parallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @Override public ImmutableHashSet<T> clone() {
        try {
            return (ImmutableHashSet<T>) super.clone();
        } catch (InternalError error) {
            if (error.getCause() instanceof CloneNotSupportedException) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutableHashSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable HashSet."); }

    /// Fail to add the `values` in the current [ImmutableHashSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable HashSet."); }


    /// Fail to clear the current [ImmutableHashSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable HashSet."); }


    /// Fail to remove a `value` in the current [ImmutableHashSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable HashSet."); }

    /// Fail to remove the `values` in the current [ImmutableHashSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable HashSet."); }

    /// Fail to remove anything to the current [ImmutableHashSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable HashSet."); }


    /// Fail to keep the `values` in the current [ImmutableHashSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable HashSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
