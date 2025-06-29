package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
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

@NotNullByDefault
public interface ImmutableBlockingQueue<T>
        extends ImmutableQueue<T>,
                BlockingQueue<T> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    @Override int remainingCapacity();

    //#endregion -------------------- Size methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][ImmutableBlockingQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable BlockingQueue."); }

    /// Fail to add the `values` in the current [instance][ImmutableBlockingQueue]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable BlockingQueue."); }


    /// Fail to add a `value` to the current [instance][ImmutableBlockingQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean offer(final @Nullable T value) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable BlockingQueue."); }

    /// Fail to add a `value` to the current [instance][ImmutableBlockingQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Override default boolean offer(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable BlockingQueue."); }


    /// Fail to remove and retrieve the head of the current [instance][ImmutableBlockingQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable BlockingQueue."); }

    /// Fail to remove and retrieve the head of the current [instance][ImmutableBlockingQueue]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable T poll(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable BlockingQueue."); }


    /// Fail to add a `value` to the current [instance][ImmutableBlockingQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void put(final @Nullable T value) { throw new UnsupportedMethodException("The method “put” is not supported in an immutable BlockingQueue."); }


    /// Fail to remove and retrieve the head of the current [instance][ImmutableBlockingQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T take() { throw new UnsupportedMethodException("The method “take” is not supported in an immutable BlockingQueue."); }


    /// Fail to clear the current [instance][ImmutableBlockingQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable BlockingQueue."); }


    /// Fail to remove the head of the current [instance][ImmutableBlockingQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable BlockingQueue."); }

    /// Fail to remove a `value` in the current [instance][ImmutableBlockingQueue]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable BlockingQueue."); }

    /// Fail to remove the `values` in the current [instance][ImmutableBlockingQueue]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable BlockingQueue."); }

    /// Fail to remove anything to the current [instance][ImmutableBlockingQueue]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable BlockingQueue."); }


    /// Fail to keep the `values` in the current [instance][ImmutableBlockingQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable BlockingQueue."); }


    /// Fail to transfer the `values` from the current [instance][ImmutableBlockingQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default int drainTo(final @Nullable @Unmodifiable Collection<? super @Nullable T> values) { throw new UnsupportedMethodException("The method “drainTo” is not supported in an immutable BlockingQueue."); }

    /// Fail to transfer the `values` from the current [instance][ImmutableBlockingQueue]
    ///
    /// @param values  The (_never used_) values to keep
    /// @param maximum The (_never used_) maximum of elements to transfer
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default int drainTo(final @Nullable @Unmodifiable Collection<? super @Nullable T> values, final int maximum) { throw new UnsupportedMethodException("The method “drainTo” is not supported in an immutable BlockingQueue."); }

    //#endregion -------------------- Unsupported methods --------------------

}
