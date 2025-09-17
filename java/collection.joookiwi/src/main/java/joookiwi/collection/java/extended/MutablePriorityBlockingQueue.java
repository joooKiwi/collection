package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.IteratorAsMutableIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import joookiwi.collection.java.helper.NumberComparator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.method.ToCollection.toCollection;

/// A mutable behaviour of a [PriorityBlockingQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutablePriorityBlockingQueue<T>
        extends PriorityBlockingQueue<T>
        implements MutableBlockingQueue<T> {

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
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final byte initialCapacity) { super(NumberComparator.getInstance().max(initialCapacity, 1), null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final  @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.byteValue(), 1), null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final short initialCapacity) { super(NumberComparator.getInstance().max(initialCapacity, 1), null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.shortValue(), 1), null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final int initialCapacity) { super(NumberComparator.getInstance().max(initialCapacity, 1), null); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.intValue(), 1), null); }

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
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(NumberComparator.getInstance().max(initialCapacity, 1), comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Nullable Byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.byteValue(), 1), comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(NumberComparator.getInstance().max(initialCapacity, 1), comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Nullable Short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.shortValue(), 1), comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final int initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(NumberComparator.getInstance().max(initialCapacity, 1), comparator); }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : NumberComparator.getInstance().max(initialCapacity.intValue(), 1), comparator); }

    //#endregion -------------------- initialCapacity, comparator --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityBlockingQueue]
    /// with the initial capacity as the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(toCollection(values)); }

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
    //#region -------------------- values, initialCapacity --------------------

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.byteValue(), values.length), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Short initialCapacity) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.shortValue(), values.length), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.intValue(), values.length), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }


    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final byte initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), null);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Byte initialCapacity) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.byteValue(), values.size()), null);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final short initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), null);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Short initialCapacity) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.shortValue(), values.size()), null);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final int initialCapacity) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), null);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Integer initialCapacity) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.intValue(), values.size()), null);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    //#endregion -------------------- values, initialCapacity --------------------
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
            offer(values[index]);
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
            offer(value);
    }

    //#endregion -------------------- values, comparator --------------------
    //#region -------------------- values, initialCapacity, comparator --------------------

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.byteValue(), values.length), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.shortValue(), values.length), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final int initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(initialCapacity, values.length), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                        final @Nullable Integer initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.length, DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.intValue(), values.length), comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }


    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Byte initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.byteValue(), values.size()), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Short initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.shortValue(), values.size()), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final int initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(initialCapacity, values.size()), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [PriorityBlockingQueue]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Integer initialCapacity,
                                        final @Nullable Comparator<? super T> comparator) {
        super(initialCapacity == null ? NumberComparator.getInstance().max(values.size(), DEFAULT_INITIAL_CAPACITY) : NumberComparator.getInstance().max(initialCapacity.intValue(), values.size()), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            offer(value);
    }

    //#endregion -------------------- values, initialCapacity, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public @Range(from = MAX_INT_VALUE, to = MAX_INT_VALUE) int remainingCapacity() { return super.remainingCapacity(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

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
    //#region -------------------- Has methods --------------------

    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends @Nullable T> values) { return super.addAll(values); }


    @Contract(mutates = "this")
    @Override public boolean offer(final T value) { return super.offer(value); }

    @Contract(mutates = "this")
    @Override public boolean offer(final T value, final long timeout, final TimeUnit unit) { return super.offer(value, timeout, unit); }


    @Contract(mutates = "this")
    @Override public void put(final T value) { super.put(value); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { super.clear(); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T remove() { return super.remove(); }

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) { return super.remove(value); }

    @Contract(mutates = "this")
    @Override public boolean removeAll(final @Unmodifiable Collection<? extends @Nullable Object> values) { return super.removeAll(values); }

    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) { return super.removeIf(filter); }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final @Unmodifiable Collection<? extends @Nullable Object> values) { return super.retainAll(values); }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(super.iterator()); }

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
    @Override public MutablePriorityBlockingQueue<T> clone() {
        try {
            return (MutablePriorityBlockingQueue<T>) super.clone();
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
