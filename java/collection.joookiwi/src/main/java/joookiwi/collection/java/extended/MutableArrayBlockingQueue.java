package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Spliterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.IteratorAsMutableIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_FAIRNESS;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_BYTE_VALUE_AS_LONG;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE_AS_LONG;
import static joookiwi.collection.java.NumericConstants.MAX_SHORT_VALUE_AS_LONG;
import static joookiwi.collection.java.method.ToCollection.toCollection;

/// A mutable behaviour of a [ArrayBlockingQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayBlockingQueue<T>
        extends ArrayBlockingQueue<T>
        implements MutableBlockingQueue<T> {

    @Serial private static final long serialVersionUID = 1732737544732607336L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity of [Integer#MAX_VALUE]
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableArrayBlockingQueue() { super(MAX_INT_VALUE, DEFAULT_FAIRNESS); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- capacity --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) byte capacity) { super(capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) @Nullable Byte capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) short capacity) { super(capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) @Nullable Short capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) int capacity) { super(capacity, DEFAULT_FAIRNESS); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) @Nullable Integer capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS); }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- capacity, isFair --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) byte capacity,
                                     final boolean isFair) { super(capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) @Nullable Byte capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) @Nullable Byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) short capacity,
                                     final boolean isFair) { super(capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) short capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) @Nullable Short capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) @Nullable Short capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) int capacity,
                                     final boolean isFair) { super(capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) int capacity,
                                     final @Nullable Boolean isFair) { super(capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }


    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) @Nullable Integer capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) @Nullable Integer capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair); }

    //#endregion -------------------- capacity, isFair --------------------
    //#region -------------------- isFair --------------------

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity of [Integer#MAX_VALUE]
    /// and the fairness received
    public MutableArrayBlockingQueue(final boolean isFair) { super(MAX_INT_VALUE, isFair); }

    /// Create an empty mutable instance of [ArrayBlockingQueue]
    /// with a capacity of [Integer#MAX_VALUE]
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableArrayBlockingQueue(final @Nullable Boolean isFair) { super(MAX_INT_VALUE, isFair == null ? DEFAULT_FAIRNESS : isFair); }

    //#endregion -------------------- isFair --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [Integer#MAX_VALUE] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(MAX_INT_VALUE, DEFAULT_FAIRNESS, toCollection(values));
    }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or [Integer#MAX_VALUE] if it is empty)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(MAX_INT_VALUE, DEFAULT_FAIRNESS, values);
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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Byte capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final short capacity) { super(capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Short capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final int capacity) { super(capacity, DEFAULT_FAIRNESS, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Integer capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS, toCollection(values)); }


    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final byte capacity) { super(capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Byte capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final short capacity) { super(capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Short capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final int capacity) { super(capacity, DEFAULT_FAIRNESS, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Integer capacity) { super(capacity == null ? MAX_INT_VALUE : capacity, DEFAULT_FAIRNESS, values); }

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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final
                                     @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Byte capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Short capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Short capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }

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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Integer capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the `values.length`
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Integer capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }


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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Byte capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Byte capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Short capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Short capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

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
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Integer capacity,
                                     final boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    /// @throws IllegalArgumentException The capacity was under the <code>values.[size][Collection#size()]</code>
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Integer capacity,
                                     final @Nullable Boolean isFair) { super(capacity == null ? MAX_INT_VALUE : capacity, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    //#endregion -------------------- values, capacity, isFair --------------------
    //#region -------------------- values, isFair --------------------

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [Integer#MAX_VALUE] if it is empty)
    /// and the fairness received
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final boolean isFair) { super(MAX_INT_VALUE, isFair, toCollection(values)); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [Integer#MAX_VALUE] if it is empty)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                     final @Nullable Boolean isFair) { super(MAX_INT_VALUE, isFair == null ? DEFAULT_FAIRNESS : isFair, toCollection(values)); }


    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [Integer#MAX_VALUE] if it is empty)
    /// and the fairness received
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final boolean isFair) { super(MAX_INT_VALUE, isFair, values); }

    /// Create a mutable instance of [ArrayBlockingQueue]
    /// with a capacity as the `values.length` (or [Integer#MAX_VALUE] if it is empty)
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableArrayBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                     final @Nullable Boolean isFair) { super(MAX_INT_VALUE, isFair == null ? DEFAULT_FAIRNESS : isFair, values); }

    //#endregion -------------------- values, isFair --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T element() { return super.element(); }

    @Override public @Nullable T peek() { return super.peek(); }


    @Contract(mutates = "this")
    @Override public @Nullable T poll() { return super.poll(); }

    @Contract(mutates = "this")
    @Override public @Nullable T poll(final long timeout, final TimeUnit unit) throws InterruptedException { return super.poll(timeout, unit); }


    @Contract(mutates = "this")
    @Override public T take() throws InterruptedException { return super.take(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return super.addAll(values); }


    @Contract(mutates = "this")
    @Override public void put(final T value) throws InterruptedException { super.put(value); }


    @Contract(mutates = "this")
    @Override public boolean offer(final T value) { return super.offer(value); }

    @Contract(mutates = "this")
    @Override public boolean offer(final T value, final long timeout, final TimeUnit unit) throws InterruptedException { return super.offer(value, timeout, unit); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T remove() { return super.remove(); }

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) { return super.remove(value); }

    @Contract(mutates = "this")
    @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return super.removeAll(values); }


    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) { return super.removeIf(filter); }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final Collection<?> values) { return super.retainAll(values); }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { super.clear(); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Has methods --------------------

    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Drain to methods --------------------

    @Contract(mutates = "this")
    @Override public int drainTo(final Collection<? super T> source) { return super.drainTo(source); }

    @Contract(mutates = "this")
    @Override public int drainTo(final Collection<? super T> source, final int maximum) { return super.drainTo(source, maximum); }

    //#endregion -------------------- Drain to methods --------------------
    //#region -------------------- To array methods --------------------

    @Override public Object[] toArray() { return super.toArray(); }

    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return super.toArray(newArray); }

    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return super.toArray(generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { return super.stream(); }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { return super.parallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Clone methods --------------------

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

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------


}
