package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptyNavigableSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A definition of an immutable [NavigableSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsNavigableSet
/// @see SubArrayAsNavigableSet
/// @see ReversedArrayAsNavigableSet
@NotNullByDefault
public abstract class AbstractArrayAsNavigableSet<T extends @Nullable Object>
        extends AbstractArrayAsSortedSet<T>
        implements NavigableSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsNavigableSet() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    protected int _indexFromHashCodeLowerOrEqual(final T value) { return _indexFromHashCodeLowerOrEqual(value, _reference(), size()); }
    protected int _indexFromHashCodeLowerOrEqual(final T value, final T @Unmodifiable [] reference) { return _indexFromHashCodeLowerOrEqual(value, reference, size()); }
    protected int _indexFromHashCodeLowerOrEqual(final T value, final T @Unmodifiable [] reference, final int size) {
        var index = size;
        while (--index >= 0)
            if (_compare(value, reference[index]) <= 0)
                return index + 1;
        return index + 1;
    }

    protected int _indexFromHashCodeLower(final T value) { return _indexFromHashCodeLower(value, _reference(), size()); }
    protected int _indexFromHashCodeLower(final T value, final T @Unmodifiable [] reference) { return _indexFromHashCodeLower(value, reference, size()); }
    protected int _indexFromHashCodeLower(final T value, final T @Unmodifiable [] reference, final int size) {
        var index = size;
        while (--index >= 0)
            if (_compare(value, reference[index]) < 0)
                return index + 1;
        return index + 1;
    }

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public @Nullable T floor(final T value) { // ≼ than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var size = size();
        final var indexFound = _indexFromHashCodeLowerOrEqual(value, reference, size);
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    @Override public @Nullable T lower(final T value) { // < than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var size = size();
        final var indexFound = _indexFromHashCodeLower(value, reference, size);
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    @Override public @Nullable T ceiling(final T value) { // ≽ than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var indexFound = _indexFromHashCodeHigherOrEqual(value, reference);
        if (indexFound == 0)
            return null;
        return reference[indexFound - 1];
    }

    @Override public @Nullable T higher(final T value) { // > than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var indexFound = _indexFromHashCodeHigher(value, reference);
        if (indexFound == 0)
            return null;
        return reference[indexFound - 1];
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Subset methods --------------------

    @Override public @UnmodifiableView NavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) {
        if (!contains(from))
            if (!contains(to))
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) do not exist in the NavigableSet.");
            else
                throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");
        if (!contains(to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");

        final var size = size();
        final var reference = _reference();
        if (fromIsInclusive)
            if (toIsInclusive)
                return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), _indexFromHashCodeHigherOrEqual(to, reference, size)));
            else
                return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), _indexFromHashCodeHigher(to, reference, size)));
        if (toIsInclusive)
            return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size), _indexFromHashCodeHigherOrEqual(to, reference, size)));
        return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size), _indexFromHashCodeHigher(to, reference, size)));
    }

    @Override public @UnmodifiableView NavigableSet<T> headSet(final T to, final boolean isInclusive) {
        if (!contains(to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");

        final var reference = _reference();
        if (isInclusive)
            return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, 0, _indexFromHashCodeHigherOrEqual(to, reference)));
        return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, 0, _indexFromHashCodeHigher(to, reference)));
    }

    @Override public @UnmodifiableView NavigableSet<T> tailSet(final T from, final boolean isInclusive) {
        if (!contains(from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");

        final var size = size();
        final var reference = _reference();
        if (isInclusive)
            return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), size - 1));
        return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size), size - 1));
    }

    //#endregion -------------------- Subset methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Override public @UnmodifiableView NavigableSet<T> reversed() {
        if (isEmpty())
            return emptyNavigableSet();
        return new ReversedArrayAsNavigableSet<>(this, new ReversedArray<>(_reference()));
    }

    @Contract(pure = true)
    @Override public @UnmodifiableView NavigableSet<T> descendingSet() { return reversed(); }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public Iterator<T> descendingIterator() { return new ReversedArrayAsIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------

    @Override public abstract AbstractArrayAsNavigableSet<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable NavigableSet."); }

    /// Fail to add a `value` to the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to add a `value` to the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable NavigableSet."); }

    /// Fail to add the `values` in the current [instance][NavigableSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable NavigableSet."); }


    /// Fail to clear the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable NavigableSet."); }


    /// Fail to remove a `value` in the current [instance][NavigableSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable NavigableSet."); }

    /// Fail to remove the first value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to retrieve and remove the first value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to remove the last value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable NavigableSet."); }

    /// Fail to retrieve and remove the last value in the current [instance][NavigableSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable NavigableSet."); }

    /// Fail to remove the `values` in the current [instance][NavigableSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable NavigableSet."); }

    /// Fail to remove anything to the current [instance][NavigableSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable NavigableSet."); }

    /// Fail to keep the `values` in the current [instance][NavigableSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable NavigableSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
