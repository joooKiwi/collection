package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A definition of an [ImmutableTransferQueue] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableTransferQueue
@NotNullByDefault
public abstract class AbstractArrayAsImmutableTransferQueue<T>
        extends AbstractArrayAsImmutableBlockingQueue<T>
        implements ImmutableTransferQueue<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableTransferQueue() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableTransferQueue<T> clone() { return (AbstractArrayAsImmutableTransferQueue<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
