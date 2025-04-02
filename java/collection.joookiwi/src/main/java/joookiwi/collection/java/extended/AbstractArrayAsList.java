package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.method.FirstIndexOfOrNull;
import joookiwi.collection.java.method.LastIndexOfOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

/// A definition of an immutable [List] to have a common ancestor.
/// This class is similar to [java.util.AbstractList] or [java.util.AbstractSequentialList] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsList
/// @see SubArrayAsList
/// @see ReversedArrayAsList
@NotNullByDefault
public abstract class AbstractArrayAsList<T extends @Nullable Object>
        extends AbstractArrayAsSequencedCollection<T>
        implements List<T>,
        RandomAccess {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsList() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    /// Get the element at the specified `index` in the current [instance][List]
    ///
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The current [instance][List] [is empty][#isEmpty]
    /// @throws IndexOutOfBoundsException The `index` is under zero or over the [size][#size]
    /// @see List#get(int)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/at">Javascript ReadonlyArray.at(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html">Kotlin get(index)</a>
    @Override public T get(int index) {
        if (isEmpty())
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        final var size = size();
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return _reference()[index];
    }

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return The first index associated to the `element` or `-1` is nothing was found
    /// @see List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">Javascript ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @Override public @Range(from = -1, to = MAX_VALUE) int indexOf(final @Nullable Object element) {
        final var index = FirstIndexOfOrNull.firstIndexOfOrNull(_reference(), element);
        if (index == null)
            return -1;
        return index;
    }

    /// Get the **last** occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return The last index associated to the `element` or `-1` is nothing was found
    /// @see List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">Javascript ReadonlyArray.lastIndexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, from?, to?)</a>
    @Override public @Range(from = -1, to = MAX_VALUE) int lastIndexOf(final @Nullable Object element) {
        final var index = LastIndexOfOrNull.lastIndexOfOrNull(_reference(), element);
        if (index == null)
            return -1;
        return index;
    }


    @Override public ListIterator<T> listIterator() { return new ArrayAsListIterator<>(_reference()); }

    @Override public ListIterator<T> listIterator(final int index) { return new ArrayAsListIterator<>(_reference(), index); }


    /// Gibe a subdivided-array of the current [instance][List] between both indexes (`from` and `to`)
    ///
    /// @param from The starting index (inclusive)
    /// @param to   The ending index (exclusive)
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException `to` is before `from` with a [InvalidIndexRangeException] as the cause
    @Override public @UnmodifiableView List<T> subList(final int from, final int to) {
        if (from < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” cannot be under 0.", from);
        if (to > size())
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” cannot be over the size of the collection (" + size() + ").", to);
        if (from > to) {
            final var message = "Invalid index range. The ending index “" + to + "” is over the starting index “" + from + "”.";
            throw new IndexOutOfBoundsException(message, (Number) null, new InvalidIndexRangeException(message, from, to));
        }
        if (isEmpty())
            return emptyList();
        if (from == to)
            return emptyList();
        return new SubArrayAsList<>(this, new SubArray<>(_reference(), from, to));
    }

    /// Give a reversed-view of the current [instance][List]
    ///
    /// @see java.util.SequencedCollection#reversed()
    /// @see List#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override public @UnmodifiableView List<T> reversed() {
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

    /// Fail to add a `value` to the current [instance][List]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable List."); }

    /// Fail to add the `values` in the current [instance][List]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable List."); }

    /// Fail to remove a `value` in the current [instance][List]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable List."); }

    /// Fail to replace any value in the current [instance][List]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<T> operator) { throw new UnsupportedOperationException("The method “replaceAll” is not supported in an immutable List."); }


    /// Fail to sort the current [instance][List]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { throw new UnsupportedOperationException("The method “sort” is not supported in an immutable List."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
