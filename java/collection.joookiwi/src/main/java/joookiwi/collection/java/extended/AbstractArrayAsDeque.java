package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.method.GetFirst;
import joookiwi.collection.java.method.GetFirstOrNull;
import joookiwi.collection.java.method.GetLastOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptyDeque;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A definition of an immutable [Deque] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsDeque
/// @see ReversedArrayAsDeque
@NotNullByDefault
public abstract class AbstractArrayAsDeque<T extends @Nullable Object>
        extends AbstractArrayAsSequencedCollection<T>
        implements Deque<T>,
                   BasicStack<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsDeque() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T element() {
        if (isEmpty())
            throw new NoSuchElementException(new EmptyCollectionException());
        return GetFirst.getFirst(_reference());
    }

    @Contract(pure = true)
    @Override public @Nullable T peek() { return peekFirst(); }

    @Contract(pure = true)
    @Override public @Nullable T peekFirst() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peekLast() { return GetLastOrNull.getLastOrNull(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Override public @UnmodifiableView Deque<T> reversed() {
        if (isEmpty())
            return emptyDeque();
        return new ReversedArrayAsDeque<>(this, new ReversedArray<>(_reference()));
    }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public Iterator<T> descendingIterator() { return new ReversedArrayAsIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------

    @Override public abstract AbstractArrayAsDeque<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the start of the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final T value) { throw new UnsupportedOperationException("The method “push” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the start of the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the end of the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable Deque."); }

    /// Fail to add the `values` in the current [AbstractArrayAsDeque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final T value) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the start of the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerFirst(final T value) { throw new UnsupportedOperationException("The method “offerFirst” is not supported in an immutable Deque."); }

    /// Fail to add a `value` to the end of the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerLast(final T value) { throw new UnsupportedOperationException("The method “offerLast” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the head of the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the first value of the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable Deque."); }

    /// Fail to remove and retrieve the last value of the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable Deque."); }


    /// Fail to clear the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable Deque."); }


    /// Fail to remove the first value in the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedOperationException("The method “pop” is not supported in an immutable Deque."); }

    /// Fail to remove the head of the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Deque."); }

    /// Fail to remove a `value` in the current [AbstractArrayAsDeque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Deque."); }

    /// Fail to remove the first value in the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable Deque."); }

    /// Fail to remove the first occurrence found in the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeFirstOccurrence” is not supported in an immutable Deque."); }

    /// Fail to remove the last value in the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable Deque."); }

    /// Fail to remove the last occurrence found in the current [AbstractArrayAsDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeLastOccurrence” is not supported in an immutable Deque."); }

    /// Fail to remove the `values` in the current [AbstractArrayAsDeque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable Deque."); }

    /// Fail to remove anything to the current [AbstractArrayAsDeque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable Deque."); }


    /// Fail to keep the `values` in the current [AbstractArrayAsDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable Deque."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
