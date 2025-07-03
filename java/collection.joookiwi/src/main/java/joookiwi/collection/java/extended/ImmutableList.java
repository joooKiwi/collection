package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.iterator.ImmutableListIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public interface ImmutableList<T extends @Nullable Object>
        extends ImmutableSequencedCollection<T>,
                List<T> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    /// Get the element at the specified `index` in the current [instance][ImmutableList]
    ///
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The current [instance][ImmutableList] [is empty][#isEmpty]
    /// @throws IndexOutOfBoundsException The `index` is under zero or over the [size][#size]
    /// @see List#get(int)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/at">Javascript ReadonlyArray.at(index)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html">Kotlin get(index)</a>
    @Contract(pure = true)
    @Override T get(int index);

    /// Get the first element in the current [instance][ImmutableList]
    ///
    /// @throws NoSuchElementException The current [instance][ImmutableList] [is empty][#isEmpty]
    /// @see List#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @Override T getFirst();

    /// Get the last element in the current [instance][ImmutableList]
    ///
    /// @throws NoSuchElementException The current [instance][ImmutableList] [is empty][#isEmpty]
    /// @see List#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @Override T getLast();

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
    @Override @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object element);

    /// Get the **last** occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return The last index associated to the `element` or `-1` is nothing was found
    /// @see List#indexOf(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/lastIndexOf">Javascript ReadonlyArray.lastIndexOf(element, from?)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-index-of.html">Kotlin lastIndexOf(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof">C# LastIndexOf(item, from?, to?)</a>
    @Override @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object element);

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- As subdivided methods --------------------

    /// Give a subdivided-array of the current [instance][ImmutableList] between both indexes (`from` and `to`)
    ///
    /// @param from The starting index (inclusive)
    /// @param to   The ending index (exclusive)
    /// @throws IndexOutOfBoundsException `from` or `to` are not within a valid range
    /// @throws IndexOutOfBoundsException `to` is before `from` with a [InvalidIndexRangeException] as the cause
    @Override ImmutableList<T> subList(final int from, final int to);

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][ImmutableList]
    ///
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override ImmutableList<T> reversed();

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override Spliterator<T> spliterator();


    @Override ImmutableListIterator<T> listIterator();

    @Override ImmutableListIterator<T> listIterator(final int index);

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override boolean equals(final @Nullable Object other);

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override ImmutableList<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to set the `value` at the `index` specified in the current [instance][ImmutableList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default T set(final int index, final @Nullable T value) { throw new UnsupportedMethodException("The method “set” is not supported in an immutable List."); }


    /// Fail to add a `value` to the current [instance][ImmutableList]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [instance][ImmutableList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default void add(final int index, final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [instance][ImmutableList]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable List."); }

    /// Fail to add a `value` to the current [instance][ImmutableList]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable List."); }

    /// Fail to add the `values` in the current [instance][ImmutableList]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable List."); }

    /// Fail to add the `values` in the current [instance][ImmutableList]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable List."); }


    /// Fail to clear the current [instance][ImmutableList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable List."); }


    /// Fail to remove a `value` in the current [instance][ImmutableList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable List."); }

    /// Fail to remove a `value` in the current [instance][ImmutableList]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default T remove(final int index) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable List."); }

    /// Fail to remove the first value in the current [instance][ImmutableList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable List."); }

    /// Fail to remove the last value in the current [instance][ImmutableList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable List."); }

    /// Fail to remove the `values` in the current [instance][ImmutableList]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable List."); }

    /// Fail to remove anything to the current [instance][ImmutableList]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable List."); }


    /// Fail to replace any value in the current [instance][ImmutableList]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void replaceAll(final @Nullable UnaryOperator<@Nullable T> operator) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable List."); }


    /// Fail to keep the `values` in the current [instance][ImmutableList]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable List."); }


    /// Fail to sort the current [instance][ImmutableList]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void sort(final @Nullable Comparator<? super @Nullable T> comparator) { throw new UnsupportedMethodException("The method “sort” is not supported in an immutable List."); }

    //#endregion -------------------- Unsupported methods --------------------

}
