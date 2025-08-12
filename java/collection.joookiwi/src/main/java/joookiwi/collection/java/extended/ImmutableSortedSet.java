package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Predicate;
import joookiwi.collection.java.annotation.Alias;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public interface ImmutableSortedSet<T extends @Nullable Object>
        extends ImmutableSequencedSet<T>,
                SortedSet<T>,
                OrderableCollection<T> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    /// Get the first element in the current [instance][ImmutableSortedSet]
    ///
    /// @throws NoElementFoundInCollectionException The current instance is empty
    /// @see java.util.SequencedCollection#getFirst()
    /// @see java.util.List#getFirst()
    /// @see java.util.SequencedSet#getFirst()
    /// @see java.util.SortedSet#getFirst()
    /// @see java.util.NavigableSet#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @Override T getFirst();

    @Alias("getFirst")
    @Override T first();


    /// Get the last element in the current [instance][ImmutableSortedSet]
    ///
    /// @throws NoSuchElementException The current instance is empty
    /// @see java.util.SequencedSet#getLast()
    /// @see java.util.List#getLast()
    /// @see java.util.SequencedSet#getLast()
    /// @see java.util.SortedSet#getLast()
    /// @see java.util.NavigableSet#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @Override T getLast();

    @Alias("getLast")
    @Override T last();

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override Spliterator<T> spliterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- As subdivided methods --------------------

    // README: By default, “from” is inclusive and “to” is exclusive

    @Override ImmutableSortedSet<T> subSet(T from, T to);

    @Override ImmutableSortedSet<T> headSet(T to);

    @Override ImmutableSortedSet<T> tailSet(T from);

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][ImmutableSortedSet]
    ///
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.SortedSet#reversed()
    /// @see java.util.NavigableSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override ImmutableSortedSet<T> reversed();

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Override @Nullable Comparator<? super T> comparator();

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override ImmutableSortedSet<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable SortedSet."); }

    /// Fail to add the `values` in the current [instance][SortedSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable SortedSet."); }


    /// Fail to clear the current [instance][SortedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable SortedSet."); }


    /// Fail to remove a `value` in the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable SortedSet."); }

    /// Fail to remove the first value in the current [instance][SortedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable SortedSet."); }

    /// Fail to remove the last value in the current [instance][SortedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable SortedSet."); }

    /// Fail to remove the `values` in the current [instance][SortedSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable SortedSet."); }

    /// Fail to remove anything to the current [instance][SortedSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable SortedSet."); }

    /// Fail to keep the `values` in the current [instance][SortedSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable SortedSet."); }

    //#endregion -------------------- Unsupported methods --------------------

}
