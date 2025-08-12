package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.PriorityBlockingQueue;
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

/// A mutable behaviour of a [PriorityQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutablePriorityQueue<T>
        extends PriorityQueue<T>
        implements MutableQueue<T>,
                   OrderableCollection<T> {

    @Serial private static final long serialVersionUID = -7797349871389737656L;

    //#region -------------------- Constructors --------------------

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
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) byte initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) short initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) int initialCapacity) { super(initialCapacity, null); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, null); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- comparator --------------------

    /// Create a mutable instance of [PriorityQueue] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Nullable Comparator<? super T> comparator) { super(DEFAULT_INITIAL_CAPACITY, comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- initialCapacity, comparator --------------------

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) byte initialCapacity,
                                final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Byte initialCapacity,
                                final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) short initialCapacity,
                                final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Short initialCapacity,
                                final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) int initialCapacity,
                                final @Nullable Comparator<? super T> comparator) { super(initialCapacity, comparator); }

    /// Create a mutable instance of [PriorityQueue]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    /// ordered according to the `comparator` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Range(from = 1, to = MAX_INT_VALUE) @Nullable Integer initialCapacity,
                                final @Nullable Comparator<? super T> comparator) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, comparator); }

    //#endregion -------------------- initialCapacity, comparator --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the `values.length`
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(NumberComparator.getInstance().max(values.length, 1), null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<? extends T> values) { super(values); }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with the initial capacity as the <code>values.[size][Collection#size()]</code>
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with the initial capacity as the `values.length`
    /// ordered according to the `comparator` received
    ///
    /// @throws ClassCastException One element cannot be compared to another element
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(values.length, 1), comparator);
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
    public MutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(values.size(), 1), comparator);
        if (values.isEmpty())
            return;

        for (final var value : values)
            super.offer(value);
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T element() { return super.element(); }

    @Override public @Nullable T peek() { return super.peek(); }

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


    @Contract(mutates = "this")
    @Override public @Nullable T poll() { return super.poll(); }

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

    //#endregion -------------------- Iterator methods --------------------
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
    //#region -------------------- Comparator methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return super.comparator(); }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutablePriorityQueue<T> clone() {
        try {
            return (MutablePriorityQueue<T>) super.clone();
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
