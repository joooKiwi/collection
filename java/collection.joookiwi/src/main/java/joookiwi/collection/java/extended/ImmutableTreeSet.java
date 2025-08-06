package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.IteratorAsImmutableIterator;
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
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [immutable-like][Unmodifiable] behaviour of a [TreeSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableTreeSet<T extends @Nullable Object>
        extends TreeSet<T>
        implements ImmutableNavigableSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -9051412633025010323L;

    private boolean __isInitialized = false;
    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [ImmutableTreeSet]
    ///
    /// @param <T> The type
    @NotNullByDefault
    private static final class ImmutableTreeSetView<T extends @Nullable Object>
            extends ImmutableTreeSet<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 9155762050974152209L;

        private final NavigableSet<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public ImmutableTreeSetView(final NavigableSet<T> reference) {
            super();
            __reference = reference;
        }

        //#endregion -------------------- Constructor --------------------
        //#region -------------------- Methods --------------------

        //#region -------------------- Comparator methods --------------------

        @Override public @Nullable Comparator<? super T> comparator() { return __reference.comparator(); }

        //#endregion -------------------- Comparator methods --------------------
        //#region -------------------- Size methods --------------------

        @Contract(pure = true)
        @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __reference.size(); }

        @Contract(pure = true)
        @Override public boolean isEmpty() { return __reference.isEmpty(); }

        //#endregion -------------------- Size methods --------------------
        //#region -------------------- Get methods --------------------

        @Override public @Nullable T lower(final T value) { return __reference.lower(value); }

        @Override public @Nullable T floor(final T value) { return __reference.floor(value); }

        @Override public @Nullable T ceiling(final T value) { return __reference.ceiling(value); }

        @Override public @Nullable T higher(final T value) { return __reference.higher(value); }


        @Contract(pure = true)
        @Override public T getFirst() { return __reference.getFirst(); }

        @Contract(pure = true)
        @Override public T first() { return __reference.first(); }


        @Contract(pure = true)
        @Override public T getLast() { return __reference.getLast(); }

        @Contract(pure = true)
        @Override public T last() { return __reference.last(); }

        //#endregion -------------------- Get methods --------------------
        //#region -------------------- Has methods --------------------

        @Contract(pure = true)
        @Override public boolean contains(final @Nullable Object value) { return __reference.contains(value); }

        @Contract(pure = true)
        @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return __reference.containsAll(values); }

        //#endregion -------------------- Has methods --------------------
        //#region -------------------- For each methods --------------------

        @Override public void forEach(final Consumer<? super T> action) { __reference.forEach(action); }

        //#endregion -------------------- For each methods --------------------
        //#region -------------------- As subdivided methods --------------------

        @Contract(ALWAYS_NEW_2)
        @Override public ImmutableTreeSetView<T> subSet(final T from, final T to) { return new ImmutableTreeSetView<>(__reference.subSet(from, true, to, false)); }

        @Contract(ALWAYS_NEW_4)
        @Override public ImmutableTreeSetView<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return new ImmutableTreeSetView<>(__reference.subSet(from, fromIsInclusive, to, toIsInclusive)); }


        @Contract(ALWAYS_NEW_1)
        @Override public ImmutableTreeSetView<T> headSet(final T to) { return new ImmutableTreeSetView<>(__reference.headSet(to, false)); }

        @Contract(ALWAYS_NEW_2)
        @Override public ImmutableTreeSetView<T> headSet(final T to, final boolean isInclusive) { return new ImmutableTreeSetView<>(__reference.headSet(to, isInclusive)); }


        @Contract(ALWAYS_NEW_1)
        @Override public ImmutableTreeSetView<T> tailSet(final T from) { return new ImmutableTreeSetView<>(__reference.tailSet(from, true)); }

        @Contract(ALWAYS_NEW_2)
        @Override public ImmutableTreeSetView<T> tailSet(final T from, final boolean isInclusive) { return new ImmutableTreeSetView<>(__reference.tailSet(from, isInclusive)); }

        //#endregion -------------------- As subdivided methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableTreeSetView<T> reversed() { return new ImmutableTreeSetView<>(__reference.descendingSet()); }

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableTreeSetView<T> descendingSet() { return new ImmutableTreeSetView<>(__reference.descendingSet()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(__reference.iterator()); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Spliterator<T> spliterator() { return __reference.spliterator(); }


        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> descendingIterator() { return new IteratorAsImmutableIterator<>(__reference.descendingIterator()); }

        //#endregion -------------------- Iterator methods --------------------
        //#region -------------------- To array methods --------------------

        @Contract(pure = true)
        @Override public @Nullable Object[] toArray() { return __reference.toArray(); }

        @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return __reference.toArray(newArray); }

        @Contract(ALWAYS_NEW_1)
        @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return __reference.toArray(generator); }

        //#endregion -------------------- To array methods --------------------
        //#region -------------------- Stream methods --------------------

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Stream<T> stream() { return __reference.stream(); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Stream<T> parallelStream() { return __reference.parallelStream(); }

        //#endregion -------------------- Stream methods --------------------
        //#region -------------------- Clone methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableTreeSetView<T> clone() { return new ImmutableTreeSetView<>(__reference); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet() {
        super((Comparator<? super T>) null);
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        __size = 0;
        __isEmpty = true;
        __isInitialized = true;
    }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super((Comparator<? super T>) null);
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

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super((Comparator<? super T>) null);
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<T> values) {
        super(values.comparator());
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<T> values) {
        super(values.comparator());
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<T> values) {
        super(values.comparator());
        if (__isEmpty = values.isEmpty()) {
            __isInitialized = true;
            __size = 0;
            return;
        }
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<T> values) {
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

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
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

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
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

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() {
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

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public @Nullable T lower(final T value) { return super.lower(value); }

    @Override public @Nullable T floor(final T value) { return super.floor(value); }

    @Override public @Nullable T ceiling(final T value) { return super.ceiling(value); }

    @Override public @Nullable T higher(final T value) { return super.higher(value); }


    @Contract(pure = true)
    @Override public T getFirst() { return super.first(); }

    @Contract(pure = true)
    @Override public T first() { return super.first(); }


    @Contract(pure = true)
    @Override public T getLast() { return super.last(); }

    @Contract(pure = true)
    @Override public T last() { return super.last(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(pure = true)
    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_NEW_2)
    @Override public ImmutableNavigableSet<T> subSet(final T from, final T to) { return new ImmutableTreeSetView<>(super.subSet(from, true, to, false)); }

    @Contract(ALWAYS_NEW_4)
    @Override public ImmutableNavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return new ImmutableTreeSetView<>(super.subSet(from, fromIsInclusive, to, toIsInclusive)); }


    @Contract(ALWAYS_NEW_1)
    @Override public ImmutableNavigableSet<T> headSet(final T to) { return new ImmutableTreeSetView<>(super.headSet(to, false)); }

    @Contract(ALWAYS_NEW_2)
    @Override public ImmutableNavigableSet<T> headSet(final T to, final boolean isInclusive) { return new ImmutableTreeSetView<>(super.headSet(to, isInclusive)); }


    @Contract(ALWAYS_NEW_1)
    @Override public ImmutableNavigableSet<T> tailSet(final T from) { return new ImmutableTreeSetView<>(super.tailSet(from, true)); }

    @Contract(ALWAYS_NEW_2)
    @Override public ImmutableNavigableSet<T> tailSet(final T from, final boolean isInclusive) { return new ImmutableTreeSetView<>(super.tailSet(from, isInclusive)); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableNavigableSet<T> reversed() { return new ImmutableTreeSetView<>(super.descendingSet()); }

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableNavigableSet<T> descendingSet() { return new ImmutableTreeSetView<>(super.descendingSet()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }


    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> descendingIterator() { return new IteratorAsImmutableIterator<>(super.descendingIterator()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Override public @Nullable Object[] toArray() { return super.toArray(); }

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
    @Override public ImmutableTreeSet<T> clone() {
        try {
            return (ImmutableTreeSet<T>) super.clone();
        } catch (InternalError error) {
            if (error.getCause() instanceof CloneNotSupportedException) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable TreeSet."); }

    /// Fail to add a `value` in the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable TreeSet."); }

    /// Fail to add a `value` in the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable TreeSet."); }

    /// Fail to add the `values` in the current [ImmutableTreeSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable TreeSet."); }


    /// Fail to clear the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable TreeSet."); }


    /// Fail to retrieve and remove the first value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable TreeSet."); }

    /// Fail to retrieve and remove the last value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable TreeSet."); }


    /// Fail to remove a `value` in the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable TreeSet."); }

    /// Fail to remove the first value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable TreeSet."); }

    /// Fail to remove the last value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable TreeSet."); }

    /// Fail to remove the `values` in the current [ImmutableTreeSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable TreeSet."); }

    /// Fail to remove anything to the current [ImmutableTreeSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable TreeSet."); }


    /// Fail to keep the `values` in the current [ImmutableTreeSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable TreeSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
