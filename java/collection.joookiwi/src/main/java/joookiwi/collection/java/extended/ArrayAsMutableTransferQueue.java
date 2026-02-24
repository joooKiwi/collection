package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [java TransferQueue][java.util.concurrent.TransferQueue]
/// with the mutability in place.
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
public class ArrayAsMutableTransferQueue<T>
        extends AbstractArrayAsMutableTransferQueue<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance of a [MutableTransferQueue] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableTransferQueue() {
        super();
        __reference = emptyArray();
    }

    /// Create an instance of a [MutableTransferQueue] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsMutableTransferQueue(final T[] reference) {
        super();
        __reference = reference;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsMutableTransferQueue<T> clone() { return (ArrayAsMutableTransferQueue<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
