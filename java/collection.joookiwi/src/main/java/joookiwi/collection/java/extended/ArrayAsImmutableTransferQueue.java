package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A bare-bone implementation of a [java TransferQueue][java.util.concurrent.TransferQueue]
/// with the [immutability][org.jetbrains.annotations.Unmodifiable] in place.
///
/// Note that `null` is **not** permitted in this instance
/// due to the [java.util.concurrent.TransferQueue] declaration.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
@NotNullByDefault
public class ArrayAsImmutableTransferQueue<T>
        extends AbstractArrayAsImmutableTransferQueue<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance of a [java.util.concurrent.TransferQueue] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsImmutableTransferQueue(final T[] reference) {
        super();
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean hasWaitingConsumer() { return false; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int getWaitingConsumerCount() { return 0; }

    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsImmutableTransferQueue<T> clone() { return new ArrayAsImmutableTransferQueue<>(_reference().clone()); }

    //#endregion -------------------- Methods --------------------

}
