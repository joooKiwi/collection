package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.method.ToCollection.toCollection;

/// A mutable behaviour of a [ConcurrentLinkedQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableConcurrentLinkedQueue<T>
        extends ConcurrentLinkedQueue<T>
        implements Cloneable {

    @Serial private static final long serialVersionUID = 7578604098380306253L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [ConcurrentLinkedQueue] that starts empty
    public MutableConcurrentLinkedQueue() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ConcurrentLinkedQueue]
    /// that starts with the `values` received
    public MutableConcurrentLinkedQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(toCollection(values)); }

    /// Create a mutable instance of [ConcurrentLinkedQueue]
    /// that starts with the `values` received
    public MutableConcurrentLinkedQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableConcurrentLinkedQueue<T> clone() {
        try {
            return (MutableConcurrentLinkedQueue<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Methods --------------------

}
