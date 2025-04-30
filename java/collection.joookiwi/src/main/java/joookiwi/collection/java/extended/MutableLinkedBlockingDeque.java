package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingDeque;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_QUEUE_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An mutable behaviour of a [LinkedBlockingDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedBlockingDeque<T>
        extends LinkedBlockingDeque<T>
        implements BasicStack<T>,
                   Cloneable {

    @Serial private static final long serialVersionUID = -2017638086081983516L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity of 1
    public MutableLinkedBlockingDeque() {
        super(1);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- capacity --------------------

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = Byte.MAX_VALUE) byte capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = Byte.MAX_VALUE) @Nullable Byte capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = Short.MAX_VALUE) short capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = Short.MAX_VALUE) @Nullable Short capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = Integer.MAX_VALUE) int capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = Integer.MAX_VALUE) @Nullable Integer capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedBlockingDeque]
    /// with a capacity as the `values.length` (or `1` if it is empty)
    public MutableLinkedBlockingDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length == 0 ? 1 : values.length);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [LinkedBlockingDeque]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or `1` if it is empty)
    public MutableLinkedBlockingDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.isEmpty() ? 1 : values.size());
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(pure = true)
    @Override public T getFirst() { return super.getFirst(); }

    @Contract(pure = true)
    @Override public T getLast() { return super.getLast(); }


    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Override public void addLast(final T value) { super.addLast(value); }


    @Override public synchronized T pop() { return super.pop(); }

    @Override public T removeFirst() { return super.removeFirst(); }

    @Override public T removeLast() { return super.removeLast(); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableLinkedBlockingDeque<T> clone() { return new MutableLinkedBlockingDeque<>(this); }

    //#endregion -------------------- Methods --------------------

}
