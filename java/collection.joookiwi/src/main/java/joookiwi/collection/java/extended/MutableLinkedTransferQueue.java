package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.LinkedTransferQueue;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.method.ToList.toList;

/// A mutable behaviour of a [LinkedTransferQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedTransferQueue<T>
        extends LinkedTransferQueue<T> {

    @Serial private static final long serialVersionUID = 8305870909582435719L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [LinkedTransferQueue] that starts empty
    public MutableLinkedTransferQueue() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedTransferQueue]
    /// that starts with the `values` received
    public MutableLinkedTransferQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(toList(values)); }

    /// Create a mutable instance of [LinkedTransferQueue]
    /// that starts with the `values` received
    public MutableLinkedTransferQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

}
