package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Deque;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public interface ImmutableDeque<T extends @Nullable Object>
        extends ImmutableSequencedCollection<T>,
                ImmutableQueue<T>,
                Deque<T>,
                BasicStack<T> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Override @Nullable T peekFirst();

    @Override @Nullable T peekLast();

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][ImmutableDeque]
    ///
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override ImmutableDeque<T> reversed();

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override ImmutableIterator<T> descendingIterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override ImmutableDeque<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the start of the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void push(final @Nullable T value) { throw new UnsupportedMethodException("The method “push” is not supported in an immutable Deque."); }


    /// Fail to add a `value` to the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the start of the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the end of the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable Deque."); }

    /// Fail to add the `values` in the current [instance][ImmutableDeque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable Deque."); }


    /// Fail to add a `value` to the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offer(final @Nullable T value) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the start of the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offerFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “offerFirst” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the end of the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offerLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “offerLast” is not supported in an immutable Deque."); }


    /// Fail to remove and retrieve the head of the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the first value of the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pollFirst() { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the last value of the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pollLast() { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable Deque."); }


    /// Fail to clear the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable Deque."); }


    /// Fail to remove the first value in the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pop() { throw new UnsupportedMethodException("The method “pop” is not supported in an immutable Deque."); }


    /// Fail to remove the head of the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Deque."); }

    /// Fail to remove a `value` in the current [instance][ImmutableDeque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Deque."); }

    /// Fail to remove the first value in the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable Deque."); }

    /// Fail to remove the first occurrence found in the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeFirstOccurrence” is not supported in an immutable Deque."); }

    /// Fail to remove the last value in the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable Deque."); }

    /// Fail to remove the last occurrence found in the current [instance][ImmutableDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeLastOccurrence” is not supported in an immutable Deque."); }

    /// Fail to remove the `values` in the current [instance][ImmutableDeque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable Deque."); }


    /// Fail to remove anything to the current [instance][ImmutableDeque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable Deque."); }


    /// Fail to keep the `values` in the current [instance][ImmutableDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable Deque."); }

    //#endregion -------------------- Unsupported methods --------------------

}
