package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.PriorityBlockingQueue;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.helper.NumberComparator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A mutable behaviour of a [PriorityBlockingQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutablePriorityBlockingQueue<T>
        extends PriorityBlockingQueue<T>
        implements OrderableCollection<T>,
                   Cloneable {

    @Serial private static final long serialVersionUID = -8259051370498409838L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [PriorityBlockingQueue] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue() { super(DEFAULT_INITIAL_CAPACITY, null); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) byte initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) short initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- comparator --------------------

    /// Create a mutable instance of [PriorityBlockingQueue] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Nullable Comparator<? super T> comparator) { super(DEFAULT_INITIAL_CAPACITY, comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- initialCapacity, comparator --------------------

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Integer initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    //#endregion -------------------- initialCapacity, comparator --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with the initial capacity as the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            super.offer(value);
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutablePriorityBlockingQueue<T> clone() {
        try {
            return (MutablePriorityBlockingQueue<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Methods --------------------

}
