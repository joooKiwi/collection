package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_FAIRNESS;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_QUEUE_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.method.ToCollection.toCollection;

/// A mutable behaviour of a [ArrayBlockingQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayBlockingQueue<T>
        extends ArrayBlockingQueue<T>
        implements Cloneable {

    @Serial private static final long serialVersionUID = 8962938998127785606L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity of [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY]
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableArrayBlockingQueue() { super(DEFAULT_QUEUE_CAPACITY, DEFAULT_FAIRNESS); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- capacity --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) byte capacity) { super(capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) @Nullable Byte capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) short capacity) { super(capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) @Nullable Short capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) int capacity) { super(capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) @Nullable Integer capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS); }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- capacity, isFair --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) byte capacity,
                                     final boolean isFair) { super(capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) @Nullable Byte capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) @Nullable Byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) short capacity,
                                     final boolean isFair) { super(capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) short capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) @Nullable Short capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) @Nullable Short capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) int capacity,
                                     final boolean isFair) { super(capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) int capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) @Nullable Integer capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) @Nullable Integer capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }

    //#endregion -------------------- capacity, isFair --------------------
    //#region -------------------- isFair --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity of [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY]
    /// and the fairness received
    public MutableArrayBlockingQueue(final boolean isFair) { super(DEFAULT_QUEUE_CAPACITY, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity of [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY]
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableArrayBlockingQueue(final @Nullable Boolean isFair) { super(DEFAULT_QUEUE_CAPACITY, isFair == null ? DEFAULT_FAIRNESS : isFair); }

    //#endregion -------------------- isFair --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length == 0 ? DEFAULT_QUEUE_CAPACITY : values.length, DEFAULT_FAIRNESS, toCollection(values));
    }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.isEmpty() ? DEFAULT_QUEUE_CAPACITY : values.size(), DEFAULT_FAIRNESS, values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, capacity --------------------

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final byte capacity) { super(capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Byte capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final short capacity) { super(capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Short capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final int capacity) { super(capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Integer capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS, toCollection(values)); }


    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final byte capacity) { super(capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Byte capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final short capacity) { super(capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Short capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final int capacity) { super(capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Integer capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, DEFAULT_FAIRNESS, values); }

    //#endregion -------------------- values, capacity --------------------
    //#region -------------------- values, capacity, isFair --------------------

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final byte capacity,
                                     final boolean isFair) { super(capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final
                                     @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Byte capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final short capacity,
                                     final boolean isFair) { super(capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final short capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Short capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Short capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final int capacity,
                                     final boolean isFair) { super(capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final int capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Integer capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Integer capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }


    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final byte capacity,
                                     final boolean isFair) { super(capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Byte capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final short capacity,
                                     final boolean isFair) { super(capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final short capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Short capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Short capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final int capacity,
                                     final boolean isFair) { super(capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final int capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Integer capacity,
                                     final boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Integer capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    //#endregion -------------------- values, capacity, isFair --------------------
    //#region -------------------- values, isFair --------------------

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the fairness received
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final boolean isFair) { super(values.length == 0 ? DEFAULT_QUEUE_CAPACITY : values.length, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Boolean isFair) { super(values.length == 0 ? DEFAULT_QUEUE_CAPACITY : values.length, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }


    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the fairness received
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final boolean isFair) { super(values.isEmpty() ? DEFAULT_QUEUE_CAPACITY : values.size(), isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is empty)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Boolean isFair) { super(values.isEmpty() ? DEFAULT_QUEUE_CAPACITY : values.size(), isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    //#endregion -------------------- values, isFair --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableArrayBlockingQueue<T> clone() {
        try {
            return (MutableArrayBlockingQueue<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Methods --------------------


}
