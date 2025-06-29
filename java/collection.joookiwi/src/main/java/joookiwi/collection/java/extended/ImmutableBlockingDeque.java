package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;

@NotNullByDefault
public interface ImmutableBlockingDeque<T>
        extends ImmutableBlockingQueue<T>,
                ImmutableDeque<T>,
                BlockingDeque<T> {

    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the start of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void push(final @Nullable T value) { throw new UnsupportedMethodException("The method “push” is not supported in an immutable BlockingDeque."); }


    /// Fail to add a `value` to the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the start of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the end of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable BlockingDeque."); }

    /// Fail to add the `values` in the current [instance][BlockingDeque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable BlockingDeque."); }


    /// Fail to add a `value` to the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offer(final @Nullable T value) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default boolean offer(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the start of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offerFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “offerFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the start of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default boolean offerFirst(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “offerFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the end of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offerLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “offerLast” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the end of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default boolean offerLast(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “offerLast” is not supported in an immutable BlockingDeque."); }


    /// Fail to remove and retrieve the head of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the head of the current [instance][BlockingDeque]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default T poll(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the first value of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pollFirst() { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the first value of the current [instance][BlockingDeque]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default T pollFirst(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the last value of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pollLast() { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the last value of the current [instance][BlockingDeque]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default T pollLast(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable BlockingDeque."); }


    /// Fail to add a `value` to the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void put(final @Nullable T value) { throw new UnsupportedMethodException("The method “put” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the start of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void putFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “putFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to add a `value` to the end of the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void putLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “putLast” is not supported in an immutable BlockingDeque."); }


    /// Fail to remove and retrieve the head of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T take() { throw new UnsupportedMethodException("The method “take” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the first value of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T takeFirst() { throw new UnsupportedMethodException("The method “takeFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove and retrieve the last value of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T takeLast() { throw new UnsupportedMethodException("The method “takeLast” is not supported in an immutable BlockingDeque."); }


    /// Fail to clear the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable BlockingDeque."); }


    /// Fail to remove the first value in the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T pop() { throw new UnsupportedMethodException("The method “pop” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove the head of the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove a `value` in the current [instance][BlockingDeque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove the first value in the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove the first occurrence found in the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeFirstOccurrence” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove the last value in the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove the last occurrence found in the current [instance][BlockingDeque]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeLastOccurrence” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove the `values` in the current [instance][BlockingDeque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable BlockingDeque."); }

    /// Fail to remove anything to the current [instance][BlockingDeque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable BlockingDeque."); }


    /// Fail to keep the `values` in the current [instance][BlockingDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable BlockingDeque."); }


    /// Fail to transfer the `values` from the current [instance][BlockingDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default int drainTo(final @Nullable @Unmodifiable Collection<? super @Nullable T> values) { throw new UnsupportedMethodException("The method “drainTo” is not supported in an immutable BlockingDeque."); }

    /// Fail to transfer the `values` from the current [instance][BlockingDeque]
    ///
    /// @param values  The (_never used_) values to keep
    /// @param maximum The (_never used_) maximum of elements to transfer
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default int drainTo(final @Nullable @Unmodifiable Collection<? super @Nullable T> values, int maximum) { throw new UnsupportedMethodException("The method “drainTo” is not supported in an immutable BlockingDeque."); }

    //#endregion -------------------- Unsupported methods --------------------

}
