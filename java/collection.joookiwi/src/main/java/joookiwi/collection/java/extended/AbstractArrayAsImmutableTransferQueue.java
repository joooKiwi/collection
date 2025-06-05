package joookiwi.collection.java.extended;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;

/// A definition of an immutable [TransferQueue] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableTransferQueue
@NotNullByDefault
public abstract class AbstractArrayAsImmutableTransferQueue<T>
        extends AbstractArrayAsImmutableBlockingQueue<T>
        implements TransferQueue<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableTransferQueue() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public abstract AbstractArrayAsImmutableTransferQueue<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to transfer the `value` to a consumer in the current [instance][TransferQueue]
    ///
    /// @param value The (_never used_) value to transfer
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void transfer(final @Nullable T value) { throw new UnsupportedMethodException("The method “transfer” is not supported in an immutable TransferQueue."); }

    /// Fail to transfer the `value` to a consumer in the current [instance][TransferQueue]
    ///
    /// @param value The (_never used_) value to transfer
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean tryTransfer(final @Nullable T value) { throw new UnsupportedMethodException("The method “tryTransfer” is not supported in an immutable TransferQueue."); }

    /// Fail to transfer the `value` to a consumer in the current [instance][TransferQueue]
    ///
    /// @param value The (_never used_) value to transfer
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override public boolean tryTransfer(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedMethodException("The method “tryTransfer” is not supported in an immutable TransferQueue."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
