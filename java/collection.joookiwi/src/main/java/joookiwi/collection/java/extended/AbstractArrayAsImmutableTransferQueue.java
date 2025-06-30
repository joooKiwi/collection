package joookiwi.collection.java.extended;

import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;

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
    @Override public AbstractArrayAsImmutableTransferQueue<T> clone() { return (AbstractArrayAsImmutableTransferQueue<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
