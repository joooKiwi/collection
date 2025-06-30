package joookiwi.collection.java.extended;

import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;

/// A definition of an [ImmutableBlockingDeque] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableBlockingDeque
@NotNullByDefault
public abstract class AbstractArrayAsImmutableBlockingDeque<T>
        extends AbstractArrayAsImmutableDeque<T>
        implements ImmutableBlockingDeque<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableBlockingDeque() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Override public AbstractArrayAsImmutableBlockingDeque<T> clone() { return (AbstractArrayAsImmutableBlockingDeque<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
