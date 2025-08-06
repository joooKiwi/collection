package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.IteratorAsImmutableIterator;
import joookiwi.collection.java.helper.NumberComparator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [immutable-like][Unmodifiable] behaviour of a [PriorityQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutablePriorityQueue<T>
        extends PriorityQueue<T>
        implements ImmutableQueue<T>,
                   OrderableCollection<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -5402866038492554146L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue() {
        super(1, null);
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Nullable Comparator<? super T> comparator) {
        super(1, comparator);
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(NumberComparator.getInstance().max(values.length, 1), null);
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values);
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<? extends T> values) {
        super(values);
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values) {
        super(values);
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<? extends T> values) {
        super(values);
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<? extends T> values) {
        super(values);
        __isEmpty = (__size = values.size()) == 0;
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                  final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(values.length, 1), comparator);
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                  final @Nullable Comparator<? super T> comparator) {
        super(NumberComparator.getInstance().max(values.size(), 1), comparator);
        if (__isEmpty = (__size = values.size()) == 0)
            return;

        for (final var value : values)
            super.offer(value);
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T element() { return super.element(); }

    @Override public @Nullable T peek() { return super.peek(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(pure = true)
    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(super.iterator()); }

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
    @Override public ImmutablePriorityQueue<T> clone() {
        try {
            return (ImmutablePriorityQueue<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutablePriorityQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable PriorityQueue."); }

    /// Fail to add the `values` in the current [ImmutablePriorityQueue]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable PriorityQueue."); }


    /// Fail to add a `value` to the current [ImmutablePriorityQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable PriorityQueue."); }


    /// Fail to remove and retrieve the head of the current [ImmutablePriorityQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable PriorityQueue."); }


    /// Fail to clear the current [ImmutablePriorityQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable PriorityQueue."); }


    /// Fail to remove the head of the current [ImmutablePriorityQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable PriorityQueue."); }

    /// Fail to remove a `value` in the current [ImmutablePriorityQueue]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable PriorityQueue."); }

    /// Fail to remove the `values` in the current [ImmutablePriorityQueue]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable PriorityQueue."); }

    /// Fail to remove anything to the current [ImmutablePriorityQueue]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable PriorityQueue."); }


    /// Fail to keep the `values` in the current [ImmutablePriorityQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable PriorityQueue."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
