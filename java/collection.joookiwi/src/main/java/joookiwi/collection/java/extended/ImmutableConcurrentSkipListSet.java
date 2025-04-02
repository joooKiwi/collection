package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [immutable-like][Unmodifiable] behaviour of a [ConcurrentSkipListSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableConcurrentSkipListSet<T>
        extends ConcurrentSkipListSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -4751923563154012949L;

    private boolean __isInitialized = false;
    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableConcurrentSkipListSet() {
        super();
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableConcurrentSkipListSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (__isEmpty = size == 0) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<T> values) {
        super(values.comparator());
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// ordered according to the `comparator` received
    public ImmutableConcurrentSkipListSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                                          final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        final var size = values.length;
        if (__isEmpty = size == 0) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// ordered according to the `comparator` received
    public ImmutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                          final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [ConcurrentSkipListSet]
    /// ordered according to the `comparator` received
    public ImmutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values,
                                          final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public int size() {
        if (__isInitialized)
            return __size;

        final var value = __size = super.size();
        __isEmpty = value == 0;
        __isInitialized = true;
        return value;
    }

    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;

        final var value = __isEmpty = (__size = super.size()) == 0;
        __isInitialized = true;
        return value;
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to add a `value` in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to add a `value` in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to add the `values` in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable ConcurrentSkipListSet."); }


    /// Fail to clear the current [ImmutableConcurrentSkipListSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable ConcurrentSkipListSet."); }


    /// Fail to remove a `value` in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to remove the first value in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to remove the last value in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to remove the `values` in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to remove anything to the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable ConcurrentSkipListSet."); }


    /// Fail to keep the `values` in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable ConcurrentSkipListSet."); }


    /// Fail to retrieve and remove the first value in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable ConcurrentSkipListSet."); }

    /// Fail to retrieve and remove the last value in the current [ImmutableConcurrentSkipListSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable ConcurrentSkipListSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
