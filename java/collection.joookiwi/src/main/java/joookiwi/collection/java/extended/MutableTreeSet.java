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
import joookiwi.collection.java.extended.iterator.IteratorAsMutableIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A mutable behaviour of a [TreeSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableTreeSet<T extends @Nullable Object>
        extends TreeSet<T>
        implements MutableNavigableSet<T> {

    @Serial private static final long serialVersionUID = -9097323660582491226L;

    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [MutableTreeSet]
    ///
    /// @param <T> The type
    @NotNullByDefault
    private static final class MutableTreeSetView<T extends @Nullable Object>
            extends MutableTreeSet<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 2543764608729054512L;

        private final NavigableSet<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public MutableTreeSetView(final NavigableSet<T> reference) {
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


        @Contract(mutates = "this")
        @Override public @Nullable T pollFirst() { return __reference.pollFirst(); }

        @Contract(mutates = "this")
        @Override public @Nullable T pollLast() { return __reference.pollLast(); }


        @Contract(pure = true)
        @Override public T getFirst() { return __reference.getFirst(); }

        @Contract(pure = true)
        @Override public T first() { return __reference.first(); }


        @Contract(pure = true)
        @Override public T getLast() { return __reference.getLast(); }

        @Contract(pure = true)
        @Override public T last() { return __reference.last(); }

        //#endregion -------------------- Get methods --------------------
        //#region -------------------- Add methods --------------------

        @Contract(mutates = "this")
        @Override public boolean add(final T value) { return __reference.add(value); }

        @Contract(mutates = "this")
        @Override public void addFirst(final T value) { __reference.addFirst(value); }

        @Contract(mutates = "this")
        @Override public void addLast(final T value) { __reference.addLast(value); }


        @Contract(mutates = "this")
        @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return __reference.addAll(values); }

        //#endregion -------------------- Add methods --------------------
        //#region -------------------- Remove methods --------------------

        @Contract(mutates = "this")
        @Override public T removeFirst() { return __reference.removeFirst(); }

        @Contract(mutates = "this")
        @Override public T removeLast() { return __reference.removeLast(); }


        @Contract(mutates = "this")
        @Override public boolean remove(final @Nullable Object value) { return __reference.remove(value); }


        @Contract(mutates = "this")
        @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return __reference.removeAll(values); }


        @Contract(mutates = "this")
        @Override public boolean removeIf(final Predicate<? super T> filter) { return __reference.removeIf(filter); }

        //#endregion -------------------- Remove methods --------------------
        //#region -------------------- Retain methods --------------------

        @Contract(mutates = "this")
        @Override public boolean retainAll(final Collection<?> values) { return __reference.retainAll(values); }

        //#endregion -------------------- Retain methods --------------------
        //#region -------------------- Clear methods --------------------

        @Contract(mutates = "this")
        @Override public void clear() { super.clear(); }

        //#endregion -------------------- Clear methods --------------------
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
        @Override public MutableTreeSetView<T> subSet(final T from, final T to) { return new MutableTreeSetView<>(__reference.subSet(from, true, to, false)); }

        @Contract(ALWAYS_NEW_4)
        @Override public MutableTreeSetView<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return new MutableTreeSetView<>(__reference.subSet(from, fromIsInclusive, to, toIsInclusive)); }


        @Contract(ALWAYS_NEW_1)
        @Override public MutableTreeSetView<T> headSet(final T to) { return new MutableTreeSetView<>(__reference.headSet(to, false)); }

        @Contract(ALWAYS_NEW_2)
        @Override public MutableTreeSetView<T> headSet(final T to, final boolean isInclusive) { return new MutableTreeSetView<>(__reference.headSet(to, isInclusive)); }


        @Contract(ALWAYS_NEW_1)
        @Override public MutableTreeSetView<T> tailSet(final T from) { return new MutableTreeSetView<>(__reference.tailSet(from, true)); }

        @Contract(ALWAYS_NEW_2)
        @Override public MutableTreeSetView<T> tailSet(final T from, final boolean isInclusive) { return new MutableTreeSetView<>(__reference.tailSet(from, isInclusive)); }

        //#endregion -------------------- As subdivided methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableTreeSetView<T> reversed() { return new MutableTreeSetView<>(__reference.descendingSet()); }

        @Contract(ALWAYS_NEW_0)
        @Override public MutableTreeSetView<T> descendingSet() { return new MutableTreeSetView<>(__reference.descendingSet()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(__reference.iterator()); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Spliterator<T> spliterator() { return __reference.spliterator(); }


        @Contract(ALWAYS_NEW_0)
        @Override public MutableIterator<T> descendingIterator() { return new IteratorAsMutableIterator<>(__reference.descendingIterator()); }

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

        @MustBeInvokedByOverriders
        @Contract(ALWAYS_NEW_0)
        @Override public MutableTreeSetView<T> clone() { return (MutableTreeSetView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [TreeSet] that starts empty
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet() { super((Comparator<? super T>) null); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Nullable Comparator<? super T> comparator) { super(comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super((Comparator<? super T>) null);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super((Comparator<? super T>) null);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][OrderableCollection#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<T> values) {
        super(values.comparator());
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<T> values) {
        super(values.comparator());
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][PriorityBlockingQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityBlockingQueue<T> values) {
        super(values.comparator());
        if (values.isEmpty())
            return;
        addAll(values);
    }

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][PriorityQueue#comparator()]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable PriorityQueue<T> values) {
        super(values.comparator());
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                          final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [TreeSet]
    /// ordered according to the `comparator` received
    ///
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                          final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Comparator methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return super.comparator(); }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public @Nullable T lower(final T value) { return super.lower(value); }

    @Override public @Nullable T floor(final T value) { return super.floor(value); }

    @Override public @Nullable T ceiling(final T value) { return super.ceiling(value); }

    @Override public @Nullable T higher(final T value) { return super.higher(value); }


    @Contract(mutates = "this")
    @Override public @Nullable T pollFirst() { return super.pollFirst(); }

    @Contract(mutates = "this")
    @Override public @Nullable T pollLast() { return super.pollLast(); }


    @Override public T getFirst() { return super.first(); }

    @Override public T first() { return super.first(); }


    @Override public T getLast() { return super.last(); }

    @Override public T last() { return super.last(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) { super.addLast(value); }


    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return super.addAll(values); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T removeFirst() { return super.removeFirst(); }

    @Contract(mutates = "this")
    @Override public T removeLast() { return super.removeLast(); }


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
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_NEW_2)
    @Override public MutableTreeSet<T> subSet(final T from, final T to) { return new MutableTreeSetView<>(super.subSet(from, true, to, false)); }

    @Contract(ALWAYS_NEW_4)
    @Override public MutableTreeSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return new MutableTreeSetView<>(super.subSet(from, fromIsInclusive, to, toIsInclusive)); }


    @Contract(ALWAYS_NEW_1)
    @Override public MutableTreeSet<T> headSet(final T to) { return new MutableTreeSetView<>(super.headSet(to, false)); }

    @Contract(ALWAYS_NEW_2)
    @Override public MutableTreeSet<T> headSet(final T to, final boolean isInclusive) { return new MutableTreeSetView<>(super.headSet(to, isInclusive)); }


    @Contract(ALWAYS_NEW_1)
    @Override public MutableTreeSet<T> tailSet(final T from) { return new MutableTreeSetView<>(super.tailSet(from, true)); }

    @Contract(ALWAYS_NEW_2)
    @Override public MutableTreeSet<T> tailSet(final T from, final boolean isInclusive) { return new MutableTreeSetView<>(super.tailSet(from, isInclusive)); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableTreeSet<T> reversed() { return new MutableTreeSetView<>(super.reversed()); }

    @Contract(ALWAYS_NEW_0)
    @Override public MutableTreeSet<T> descendingSet() { return new MutableTreeSetView<>(super.descendingSet()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> descendingIterator() { return new IteratorAsMutableIterator<>(super.descendingIterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

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
    @Contract(ALWAYS_NEW_0)
    @Override public MutableTreeSet<T> clone() {
        try {
            return (MutableTreeSet<T>) super.clone();
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

    //#endregion -------------------- Methods --------------------

}
