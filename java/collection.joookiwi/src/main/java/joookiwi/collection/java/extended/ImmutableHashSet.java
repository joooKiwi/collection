package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_INITIAL_CAPACITY;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_LOAD_FACTOR;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_LOAD_FACTOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [immutable-like][Unmodifiable] behaviour of a [HashSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableHashSet<T extends @Nullable Object>
        extends HashSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -6000078544787341424L;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#of()])
    /// with a load factor of [1][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    /// and a capacity of [0][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_INITIAL_CAPACITY]
    public ImmutableHashSet() { super(DEFAULT_EMPTY_INITIAL_CAPACITY, DEFAULT_EMPTY_LOAD_FACTOR); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR]
    /// and the capacity is the `values.length`
    public ImmutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length);
        final var size = values.length;
        if (size == 0)
            return;
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
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, loadFactor --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public ImmutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final float loadFactor) {
        super(values.length, loadFactor);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to {@link java.util.Set#of(Object[])})
    /// with the capacity of the `values.length`
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public ImmutableHashSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final @Nullable Float loadFactor) {
        super(values.length, loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }


    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#copyOf(Collection)])
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final float loadFactor) {
        super(values.size(), loadFactor);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [HashSet]
    /// (similar to [java.util.Set#copyOf(Collection)])
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and the `loadFactor` received (_or [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_LOAD_FACTOR] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `loadFactor` was negative
    public ImmutableHashSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Nullable Float loadFactor) {
        super(values.size(), loadFactor == null ? DEFAULT_LOAD_FACTOR : loadFactor);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, loadFactor --------------------

    //#endregion -------------------- Constructors --------------------
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
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable HashSet."); }


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

}
