package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [DelayQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableDelayQueue<T extends Delayed>
        extends DelayQueue<T>
        implements Cloneable {

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [DelayQueue] that starts empty
    public MutableDelayQueue() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [DelayQueue]
    /// that starts with the `values` received
    public MutableDelayQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create a mutable instance of [DelayQueue]
    /// that starts with the `values` received
    public MutableDelayQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        if (values.isEmpty())
            return;
        for (final T value : values)
            super.offer(value);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableDelayQueue<T> clone() { return new MutableDelayQueue<>(this); }

    //#endregion -------------------- Methods --------------------

}
