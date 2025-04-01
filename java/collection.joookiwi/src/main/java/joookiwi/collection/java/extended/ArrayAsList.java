package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import joookiwi.collection.java.method.FirstIndexOfOrNull;
import joookiwi.collection.java.method.LastIndexOfOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A bare-bone implementation of a [java List][List]
/// with the [immutability][Unmodifiable] in place.
/// During its creation, it <u>implies</u> that the array received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
@NotNullByDefault
public class ArrayAsList<T extends @Nullable Object>
        extends ArrayAsSequencedCollection<T>
        implements List<T>,
        RandomAccess {

    //#region -------------------- Constructor --------------------

    /// Create an instance similar to {@link List#of(Object[])},
    /// but allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsList(final T[] reference) { super(reference); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public T get(int index) {
        final var size = size();
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").");
        return _reference()[index];
    }

    @Override public @Range(from = -1, to = MAX_VALUE) int indexOf(final @Nullable Object value) {
        final var index = FirstIndexOfOrNull.firstIndexOfOrNull(_reference(), value);
        if (index == null)
            return -1;
        return index;
    }

    @Override public @Range(from = -1, to = MAX_VALUE) int lastIndexOf(final @Nullable Object value) {
        final var index = LastIndexOfOrNull.lastIndexOfOrNull(_reference(), value);
        if (index == null)
            return -1;
        return index;
    }


    @Override public ListIterator<T> listIterator() { return new ArrayAsListIterator<>(_reference()); }

    @Override public ListIterator<T> listIterator(final int index) { return new ArrayAsListIterator<>(_reference(), index); }


    @Override public List<T> subList(final int from, final int to) {
        if (isEmpty())
            return emptyList();
        if (from == to)
            return emptyList();

        final var reference = _reference();
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[to - from];
        var index = from - 1;
        while (++index <= to)
            newArray[index] = reference[index];
        return new ArrayAsList<>(newArray);
    }

    @Override public List<T> reversed() {
        if (isEmpty())
            return emptyList();

        final var reference = _reference();
        final var size = size();
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = reference[index];
        return new ArrayAsList<>(newArray);
    }


    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof List<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to set the `value` at the `index` specified
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T set(final int index, final T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [ArrayAsList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable List."); }

    /// Fail to add the `values` in the current [ArrayAsList]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable List."); }

    /// Fail to remove a `value` in the current [ArrayAsList]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable List."); }

    /// Fail to replace any value in the current [ArrayAsList]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<T> operator) { throw new UnsupportedOperationException("The method “replaceAll” is not supported in an immutable List."); }


    /// Fail to sort the current [ArrayAsList]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { throw new UnsupportedOperationException("The method “sort” is not supported in an immutable List."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}

