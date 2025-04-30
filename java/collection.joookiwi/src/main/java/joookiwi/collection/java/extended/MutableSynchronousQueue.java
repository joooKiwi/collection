package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_FAIRNESS;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [SynchronousQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableSynchronousQueue<T>
        extends SynchronousQueue<T>
        implements Cloneable {

    @Serial private static final long serialVersionUID = -3480759734696123616L;
    //#region -------------------- Fields --------------------

    private final boolean __isFair;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [SynchronousQueue] that starts empty
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableSynchronousQueue() {
        super(DEFAULT_FAIRNESS);
        __isFair = DEFAULT_FAIRNESS;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- isFair --------------------

    /// Create an empty mutable instance of [SynchronousQueue]
    /// and the fairness received
    public MutableSynchronousQueue(final boolean isFair) {
        super(isFair);
        __isFair = isFair;
    }

    /// Create an empty mutable instance of [SynchronousQueue]
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableSynchronousQueue(final @Nullable Boolean isFair) {
        super(isFair == null ? DEFAULT_FAIRNESS : isFair);
        __isFair = isFair == null ? DEFAULT_FAIRNESS : isFair;
    }

    //#endregion -------------------- isFair --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(DEFAULT_FAIRNESS);
        __isFair = DEFAULT_FAIRNESS;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(DEFAULT_FAIRNESS);
        __isFair = DEFAULT_FAIRNESS;
        if (values.isEmpty())
            return;
        for (final var value : values)
            super.offer(value);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, isFair --------------------

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                   final boolean isFair) {
        super(isFair);
        __isFair = isFair;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                   final @Nullable Boolean isFair) {
        super(isFair == null ? DEFAULT_FAIRNESS : isFair);
        __isFair = isFair == null ? DEFAULT_FAIRNESS : isFair;
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }


    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                   final boolean isFair) {
        super(isFair);
        __isFair = isFair;
        if (values.isEmpty())
            return;
        for (final var value : values)
            super.offer(value);
    }

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                   final @Nullable Boolean isFair) {
        super(isFair == null ? DEFAULT_FAIRNESS : isFair);
        __isFair = isFair == null ? DEFAULT_FAIRNESS : isFair;
        if (values.isEmpty())
            return;
        for (final var value : values)
            super.offer(value);
    }

    //#endregion -------------------- values, isFair --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableSynchronousQueue<T> clone() { return new MutableSynchronousQueue<>(this, __isFair); }

    //#endregion -------------------- Methods --------------------

}
