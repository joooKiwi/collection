package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import joookiwi.collection.java.method.IndexOf;
import joookiwi.collection.java.method.LastIndexOf;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CommonContracts.*;

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
        extends ArrayAsCollection<T>
        implements List<T> {

    //#region -------------------- Constructor --------------------

    /// Create an instance similar to {@link java.util.List#of(Object[])},
    /// but allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsList(final T @NotNull @Unmodifiable [] reference) { super(reference); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public T get(int index) {
        final var size = size();
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").");
        return _reference()[index];
    }

    @Override public @Range(from = -1, to = MAX_VALUE) int indexOf(@Nullable Object value) {
        final var index = IndexOf.indexOf(_reference(), value);
        if (index == null)
            return -1;
        return index;
    }

    @Override public @Range(from = -1, to = MAX_VALUE) int lastIndexOf(@Nullable Object value) {
        final var index = LastIndexOf.lastIndexOf(_reference(), value);
        if (index == null)
            return -1;
        return index;
    }


    @Override public @NotNull ListIterator<T> listIterator() { return new ArrayAsListIterator<>(_reference()); }

    @Override public @NotNull ListIterator<T> listIterator(int index) { return new ArrayAsListIterator<>(_reference(), index); }


    @Override public @NotNull List<T> subList(int from, int to) {
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
    @Override public T set(int index, T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [ArrayAsList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(int index, T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable List."); }

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
    @Override public T remove(int index) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable List."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}

