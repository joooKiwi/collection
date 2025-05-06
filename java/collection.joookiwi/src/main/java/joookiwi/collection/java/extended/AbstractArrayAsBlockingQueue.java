package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;

/// A definition of an immutable [BlockingQueue] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsBlockingQueue
@NotNullByDefault
public abstract class AbstractArrayAsBlockingQueue<T>
        extends AbstractArrayAsQueue<T>
        implements BlockingQueue<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsBlockingQueue() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public abstract AbstractArrayAsBlockingQueue<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [AbstractArrayAsBlockingQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override public boolean offer(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable BlockingQueue."); }

    /// Fail to remove and retrieve the head of the current [AbstractArrayAsBlockingQueue]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T poll(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable BlockingQueue."); }

    /// Fail to add a `value` to the current [AbstractArrayAsBlockingQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void put(final @Nullable T value) { throw new UnsupportedOperationException("The method “put” is not supported in an immutable BlockingQueue."); }


    /// Fail to remove and retrieve the head of the current [AbstractArrayAsBlockingQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T take() { throw new UnsupportedOperationException("The method “take” is not supported in an immutable BlockingQueue."); }


    /// Fail to transfer the `values` from the current [AbstractArrayAsBlockingQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public int drainTo(final @Nullable @Unmodifiable Collection<? super T> values) { throw new UnsupportedOperationException("The method “drainTo” is not supported in an immutable BlockingQueue."); }

    /// Fail to transfer the `values` from the current [AbstractArrayAsBlockingQueue]
    ///
    /// @param values  The (_never used_) values to keep
    /// @param maximum The (_never used_) maximum of elements to transfer
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public int drainTo(final @Nullable @Unmodifiable Collection<? super T> values, int maximum) { throw new UnsupportedOperationException("The method “drainTo” is not supported in an immutable BlockingQueue."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
