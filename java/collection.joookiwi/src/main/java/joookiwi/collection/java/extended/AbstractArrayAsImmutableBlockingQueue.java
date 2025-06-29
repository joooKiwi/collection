package joookiwi.collection.java.extended;

import org.jetbrains.annotations.NotNullByDefault;

/// A definition of an [ImmutableBlockingQueue] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableBlockingQueue
@NotNullByDefault
public abstract class AbstractArrayAsImmutableBlockingQueue<T>
        extends AbstractArrayAsImmutableQueue<T>
        implements ImmutableBlockingQueue<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableBlockingQueue() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    @Override public abstract AbstractArrayAsImmutableBlockingQueue<T> clone();

    //#endregion -------------------- Methods --------------------

}
