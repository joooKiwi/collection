package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.method.ToList.toList;

/// A mutable behaviour of a [ConcurrentLinkedQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableConcurrentLinkedQueue<T>
        extends ConcurrentLinkedQueue<T> {

    @Serial private static final long serialVersionUID = -1757655120966567357L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [ConcurrentLinkedQueue] that starts empty
    public MutableConcurrentLinkedQueue() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ConcurrentLinkedQueue]
    /// that starts with the `values` received
    public MutableConcurrentLinkedQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(toList(values)); }

    /// Create a mutable instance of [ConcurrentLinkedQueue]
    /// that starts with the `values` received
    public MutableConcurrentLinkedQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

}
