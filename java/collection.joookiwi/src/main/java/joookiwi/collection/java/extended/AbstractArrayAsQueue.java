package joookiwi.collection.java.extended;

import java.util.Queue;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.method.GetFirstOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A definition of an immutable [Queue] to have a common ancestor.
/// This class is similar to [java.util.AbstractQueue] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsQueue
@NotNullByDefault
public abstract class AbstractArrayAsQueue<T extends @Nullable Object>
        extends AbstractArrayAsCollection<T>
        implements Queue<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsQueue() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T element() { return UtilityForArray.getFirst(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peek() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    //#endregion -------------------- Get methods --------------------

    @Override public abstract AbstractArrayAsQueue<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [AbstractArrayAsQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedMethodException("The method “offer” is not supported in an immutable Queue."); }

    /// Fail to remove and retrieve the head of the current [AbstractArrayAsQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable Queue."); }


    /// Fail to remove the head of the current [AbstractArrayAsQueue]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Queue."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
