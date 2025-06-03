package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

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

    //#region -------------------- Get methods --------------------

    /// Get the element at the specified `index` in the current [instance][List]
    ///
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The current [instance][List] [is empty][#isEmpty]
    /// @throws IndexOutOfBoundsException The `index` is under zero or over the [size][#size]
    /// @see List#get(int)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/at">Javascript ReadonlyArray.at(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html">Kotlin get(index)</a>
    @Contract(pure = true)
    @Override public T get(int index) { return UtilityForArray.get(_reference(), index); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    /// Get the **first** occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return The first index associated to the `element` or `-1` is nothing was found
    /// @see List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/indexOf">Javascript ReadonlyArray.indexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html">Kotlin indexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof">C# IndexOf(item, from?, to?)</a>
    @Override public @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object element) { return UtilityForArray.firstIndexOf(_reference(), element); }

    /// Get the **last** occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return The last index associated to the `element` or `-1` is nothing was found
    /// @see List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">Javascript ReadonlyArray.lastIndexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, from?, to?)</a>
    @Override public @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object element) { return UtilityForArray.lastIndexOf(_reference(), element); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- As subdivided methods --------------------

    /// Gibe a subdivided-array of the current [instance][List] between both indexes (`from` and `to`)
    ///
    /// @param from The starting index (inclusive)
    /// @param to   The ending index (exclusive)
    /// @throws IndexOutOfBoundsException  `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException `to` is before `from` with a [InvalidIndexRangeException] as the cause
    @Override public @UnmodifiableView List<T> subList(final int from, final int to) { return UtilityForArray.asSubdivided(this, _reference(), from, to); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][List]
    ///
    /// @see java.util.SequencedCollection#reversed()
    /// @see List#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override public @UnmodifiableView List<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ListIterator<T> listIterator() { return new ArrayAsListIterator<>(_reference()); }

    @Override public ListIterator<T> listIterator(final int index) { return new ArrayAsListIterator<>(_reference(), index); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Comparison methods --------------------

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

    //#endregion -------------------- Comparison methods --------------------

    @Override public abstract AbstractArrayAsList<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to set the `value` at the `index` specified
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T set(final int index, final @Nullable T value) { throw new UnsupportedMethodException("The method “set” is not supported in an immutable List."); }


    /// Fail to add a `value` to the current [instance][List]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [instance][List]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [instance][List]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [instance][List]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable List."); }

    /// Fail to add the `values` in the current [instance][List]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable List."); }

    /// Fail to add the `values` in the current [instance][List]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable List."); }


    /// Fail to clear the current [instance][List]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable List."); }


    /// Fail to remove a `value` in the current [instance][List]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable List."); }

    /// Fail to remove a `value` in the current [instance][List]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable List."); }

    /// Fail to remove the first value in the current [instance][List]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable List."); }

    /// Fail to remove the last value in the current [instance][List]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable List."); }

    /// Fail to remove the `values` in the current [instance][List]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable List."); }

    /// Fail to remove anything to the current [instance][List]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable List."); }


    /// Fail to replace any value in the current [instance][List]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<@Nullable T> operator) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable List."); }


    /// Fail to keep the `values` in the current [instance][List]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable List."); }


    /// Fail to sort the current [instance][List]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super @Nullable T> comparator) { throw new UnsupportedMethodException("The method “sort” is not supported in an immutable List."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
