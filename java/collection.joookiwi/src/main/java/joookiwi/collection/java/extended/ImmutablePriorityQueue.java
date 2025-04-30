package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An [immutable-like][Unmodifiable] behaviour of a [PriorityQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutablePriorityQueue<T>
        extends PriorityQueue<T>
        implements OrderableCollection<T>,
                   Cloneable {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -5976385428744770366L;

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
        super(new ArrayAsSortedSet<>(values));
        __isEmpty = (__size = values.length) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(new ImmutableTreeSet<>(values));
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<T> values) {
        super(new ImmutableTreeSet<>(values));
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<T> values) {
        super(new ImmutableTreeSet<>(values));
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<T> values) {
        super(new ImmutableTreeSet<>(values));
        __isEmpty = (__size = values.size()) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<T> values) {
        super(new ImmutableTreeSet<>(values));
        __isEmpty = (__size = values.size()) == 0;
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                                  final @Nullable Comparator<? super T> comparator) {
        super(new ArrayAsSortedSet<>(values, comparator));
        __isEmpty = (__size = values.length) == 0;
    }

    /// Create an [immutable-like][Unmodifiable] instance of [PriorityQueue]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutablePriorityQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                  final @Nullable Comparator<? super T> comparator) {
        super(new ImmutableTreeSet<>(values, comparator));
        __isEmpty = (__size = values.size()) == 0;
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Contract(pure = true)
    @Override public int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public ImmutablePriorityQueue<T> clone() { return new ImmutablePriorityQueue<>(this, comparator()); }

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
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable PriorityQueue."); }

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
