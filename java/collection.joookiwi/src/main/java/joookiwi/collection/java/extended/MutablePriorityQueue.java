package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.PriorityBlockingQueue;

import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;

/// A mutable behaviour of a [PriorityQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutablePriorityQueue<T>
        extends PriorityQueue<T>
        implements OrderableCollection<T> {

    @Serial private static final long serialVersionUID = -4362057305272414514L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [PriorityQueue] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue() { super(DEFAULT_INITIAL_CAPACITY, null); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) byte initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) short initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) int initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- comparator --------------------

    /// Create a mutable instance of [PriorityQueue] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// ordered according to the `comparator` received
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Nullable Comparator<? super T> comparator) { super(DEFAULT_INITIAL_CAPACITY, comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- initialCapacity, comparator --------------------

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) @Nullable Byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) @Nullable Short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) int initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_VALUE) @Nullable Integer initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    //#endregion -------------------- initialCapacity, comparator --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(new ArrayAsSortedSet<>(values)); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(new ImmutableTreeSet<>(values)); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<? extends T> values) { super(new ImmutableTreeSet<>(values)); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values) { super(new ImmutableTreeSet<>(values)); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<? extends T> values) { super(new ImmutableTreeSet<>(values)); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<? extends T> values) { super(new ImmutableTreeSet<>(values)); }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with the initial capacity as the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Comparator<? super T> comparator) { super(new ArrayAsSortedSet<>(values, comparator)); }

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    /// @throws ClassCastException One element cannot be compared to another element
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Comparator<? super T> comparator) { super(new ImmutableTreeSet<>(values, comparator)); }

    //#endregion -------------------- values, comparator --------------------

}
