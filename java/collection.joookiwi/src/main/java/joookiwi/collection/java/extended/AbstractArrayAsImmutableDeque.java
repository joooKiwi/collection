package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.method.GetFirstOrNull;
import joookiwi.collection.java.method.GetLastOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A definition of an immutable [Deque] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableDeque
/// @see ReversedArrayAsImmutableDeque
@NotNullByDefault
public abstract class AbstractArrayAsImmutableDeque<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSequencedCollection<T>
        implements Deque<T>,
                   BasicStack<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableDeque() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T element() { return UtilityForArray.getFirst(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peek() { return peekFirst(); }

    @Contract(pure = true)
    @Override public @Nullable T peekFirst() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peekLast() { return GetLastOrNull.getLastOrNull(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public @UnmodifiableView Deque<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public Iterator<T> descendingIterator() { return new ReversedArrayAsIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------

    @Override public abstract AbstractArrayAsImmutableDeque<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the start of the current [instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final @Nullable T value) { throw new UnsupportedMethodException("The method “push” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the start of the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the end of the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable Deque."); }

    /// Fail to add the `values` in the current [Instance][Deque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the start of the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “offerFirst” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the end of the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “offerLast” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the head of the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the first value of the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the last value of the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable Deque."); }


    /// Fail to clear the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable Deque."); }


    /// Fail to remove the first value in the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedMethodException("The method “pop” is not supported in an immutable Deque."); }

    /// Fail to remove the head of the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Deque."); }

    /// Fail to remove a `value` in the current [Instance][Deque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Deque."); }

    /// Fail to remove the first value in the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable Deque."); }

    /// Fail to remove the first occurrence found in the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeFirstOccurrence” is not supported in an immutable Deque."); }

    /// Fail to remove the last value in the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable Deque."); }

    /// Fail to remove the last occurrence found in the current [Instance][Deque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeLastOccurrence” is not supported in an immutable Deque."); }

    /// Fail to remove the `values` in the current [Instance][Deque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable Deque."); }

    /// Fail to remove anything to the current [Instance][Deque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable Deque."); }


    /// Fail to keep the `values` in the current [Instance][Deque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable Deque."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
