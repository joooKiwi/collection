package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_QUEUE_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.method.ToList.toList;

/// A mutable behaviour of a [LinkedBlockingQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedBlockingQueue<T>
        extends LinkedBlockingQueue<T>
        implements Cloneable {

    @Serial private static final long serialVersionUID = 332989695274849359L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [LinkedBlockingQueue] that starts empty
    /// with a capacity of [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY]
    public MutableLinkedBlockingQueue() { super(DEFAULT_QUEUE_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- capacity --------------------

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) byte capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) @Nullable Byte capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) short capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) @Nullable Short capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) int capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) @Nullable Integer capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedBlockingQueue]
    /// that starts with the `values` received
    /// and the capacity as [Integer#MAX_VALUE]
    public MutableLinkedBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(toList(values)); }

    /// Create a mutable instance of [LinkedBlockingQueue]
    /// that starts with the `values` received
    /// and the capacity as [Integer#MAX_VALUE]
    public MutableLinkedBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableLinkedBlockingQueue<T> clone() { return new MutableLinkedBlockingQueue<>(this); }

    //#endregion -------------------- Methods --------------------

}
