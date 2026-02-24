package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Spliterator;
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

import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.helper.NumberComparator.max;

/// A mutable behaviour of a [ArrayDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableArrayDeque<T>
        extends ArrayDeque<T>
        implements MutableDeque<T> {

    @Serial private static final long serialVersionUID = 1836876147989609272L;

    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [MutableArrayDeque]
    ///
    /// @param <T> The type
    @NotNullByDefault
    private static final class MutableArrayDequeView<T>
            extends MutableArrayDeque<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 8727636321217218096L;

        private final Deque<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public MutableArrayDequeView(final Deque<T> reference) {
            super();
            __reference = reference;
        }

        //#endregion -------------------- Constructor --------------------
        //#region -------------------- Methods --------------------

        //#region -------------------- Size methods --------------------

        @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __reference.size(); }

        @Override public boolean isEmpty() { return __reference.isEmpty(); }

        //#endregion -------------------- Size methods --------------------
        //#region -------------------- Get methods --------------------

        @Override public T getFirst() { return __reference.getFirst(); }

        @Override public T getLast() { return __reference.getLast(); }


        @Override public T element() { return __reference.element(); }


        @Override public @Nullable T peek() { return __reference.peek(); }

        @Override public @Nullable T peekFirst() { return __reference.peekFirst(); }

        @Override public @Nullable T peekLast() { return __reference.peekLast(); }

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


        @Override public void push(final T value) { __reference.push(value); }


        @Contract(mutates = "this")
        @Override public boolean offer(final T value) { return __reference.offer(value); }

        @Contract(mutates = "this")
        @Override public boolean offerFirst(final T value) { return __reference.offerFirst(value); }

        @Contract(mutates = "this")
        @Override public boolean offerLast(final T value) { return __reference.offerLast(value); }

        //#endregion -------------------- Add methods --------------------
        //#region -------------------- Remove methods --------------------

        @Contract(mutates = "this")
        @Override public T remove() { return __reference.remove(); }

        @Contract(mutates = "this")
        @Override public T removeFirst() { return __reference.removeFirst(); }

        @Contract(mutates = "this")
        @Override public T removeLast() { return __reference.removeLast(); }


        @Contract(mutates = "this")
        @Override public boolean remove(final @Nullable Object value) { return __reference.remove(value); }

        @Contract(mutates = "this")
        @Override public boolean removeFirstOccurrence(final @Nullable Object value) { return __reference.removeFirstOccurrence(value); }

        @Contract(mutates = "this")
        @Override public boolean removeLastOccurrence(final @Nullable Object value) { return __reference.removeLastOccurrence(value); }


        @Contract(mutates = "this")
        @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return __reference.removeAll(values); }


        @Contract(mutates = "this")
        @Override public boolean removeIf(final Predicate<? super T> filter) { return __reference.removeIf(filter); }


        @Contract(mutates = "this")
        @Override public @Nullable T poll() { return __reference.poll(); }

        @Contract(mutates = "this")
        @Override public @Nullable T pollFirst() { return __reference.pollFirst(); }

        @Contract(mutates = "this")
        @Override public @Nullable T pollLast() { return __reference.pollLast(); }


        @Contract(mutates = "this")
        @Override public T pop() { return __reference.pop(); }

        //#endregion -------------------- Remove methods --------------------
        //#region -------------------- Retain methods --------------------

        @Contract(mutates = "this")
        @Override public boolean retainAll(final Collection<?> values) { return __reference.retainAll(values); }

        //#endregion -------------------- Retain methods --------------------
        //#region -------------------- Clear methods --------------------

        @Contract(mutates = "this")
        @Override public void clear() { __reference.clear(); }

        //#endregion -------------------- Clear methods --------------------
        //#region -------------------- Has methods --------------------

        @Override public boolean contains(final @Nullable Object value) { return __reference.contains(value); }

        @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return __reference.containsAll(values); }

        //#endregion -------------------- Has methods --------------------
        //#region -------------------- For each methods --------------------

        @Override public void forEach(final Consumer<? super T> action) { __reference.forEach(action); }

        //#endregion -------------------- For each methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableArrayDequeView<T> reversed() { return new MutableArrayDequeView<>(__reference.reversed()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(__reference.iterator()); }

        @Contract(ALWAYS_NEW_0)
        @Override public MutableIterator<T> descendingIterator() { return new IteratorAsMutableIterator<>(__reference.descendingIterator()); }

        @Contract(ALWAYS_NEW_0)
        @Override public Spliterator<T> spliterator() { return __reference.spliterator(); }

        //#endregion -------------------- Iterator methods --------------------
        //#region -------------------- To array methods --------------------

        @Override public @Nullable Object[] toArray() { return __reference.toArray(); }

        @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return __reference.toArray(newArray); }

        @Contract(ALWAYS_NEW_1)
        @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return __reference.toArray(generator); }

        //#endregion -------------------- To array methods --------------------
        //#region -------------------- Stream methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public Stream<T> stream() { return __reference.stream(); }

        @Contract(ALWAYS_NEW_0)
        @Override public Stream<T> parallelStream() { return __reference.parallelStream(); }

        //#endregion -------------------- Stream methods --------------------
        //#region -------------------- Clone methods --------------------

        @MustBeInvokedByOverriders
        @Contract(ALWAYS_NEW_0)
        @Override public MutableArrayDequeView<T> clone() { return (MutableArrayDequeView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ArrayDeque]
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    public MutableArrayDeque() { super(DEFAULT_INITIAL_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final byte initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final short initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received
    public MutableArrayDeque(final int initialCapacity) { super(initialCapacity); }

    /// Create a mutable instance of [ArrayDeque]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    public MutableArrayDeque(final @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with an initial capacity as the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        final var size = values.length;
        super(size);
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with an initial capacity as the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, initialCapacity --------------------

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final byte initialCapacity) {
        final var size = values.length;
        super(max(initialCapacity, size));
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final @Nullable Byte initialCapacity) {
        final var size = values.length;
        super(max(initialCapacity, size));
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final short initialCapacity) {
        final var size = values.length;
        super(max(initialCapacity, size));
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final @Nullable Short initialCapacity) {
        final var size = values.length;
        super(max(initialCapacity, size));
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final int initialCapacity) {
        final var size = values.length;
        super(max(initialCapacity, size));
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the `values.length`
    /// (if null provided, then it is the `values.length`)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                             final @Nullable Integer initialCapacity) {
        final var size = values.length;
        super(max(initialCapacity, size));
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            addLast(values[index]);
    }


    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final byte initialCapacity) {
        super(max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Nullable Byte initialCapacity) {
        super(max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final short initialCapacity) {
        super(max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Nullable Short initialCapacity) {
        super(max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final int initialCapacity) {
        super(max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    /// Create a mutable instance of [ArrayDeque]
    /// with the largest value between the `initialCapacity` and the <code>values.[size][Collection#size()]</code>
    /// (if null provided, then it is the <code>values.[size][Collection#size()]</code>)
    public MutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                             final @Nullable Integer initialCapacity) {
        super(max(initialCapacity, values.size()));
        if (values.isEmpty())
            return;
        for (final var value : values)
            addLast(value);
    }

    //#endregion -------------------- values, initialCapacity --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T getFirst() { return super.getFirst(); }

    @Override public T getLast() { return super.getLast(); }


    @Override public T element() { return super.element(); }


    @Override public @Nullable T peek() { return super.peek(); }

    @Override public @Nullable T peekFirst() { return super.peekFirst(); }

    @Override public @Nullable T peekLast() { return super.peekLast(); }

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


    @Override public void push(final T value) { super.push(value); }


    @Contract(mutates = "this")
    @Override public boolean offer(final T value) { return super.offer(value); }

    @Contract(mutates = "this")
    @Override public boolean offerFirst(final T value) { return super.offerFirst(value); }

    @Contract(mutates = "this")
    @Override public boolean offerLast(final T value) { return super.offerLast(value); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T remove() { return super.remove(); }

    @Contract(mutates = "this")
    @Override public T removeFirst() { return super.removeFirst(); }

    @Contract(mutates = "this")
    @Override public T removeLast() { return super.removeLast(); }


    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) { return super.remove(value); }

    @Contract(mutates = "this")
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { return super.removeFirstOccurrence(value); }

    @Contract(mutates = "this")
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { return super.removeLastOccurrence(value); }


    @Contract(mutates = "this")
    @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return super.removeAll(values); }


    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) { return super.removeIf(filter); }


    @Contract(mutates = "this")
    @Override public @Nullable T poll() { return super.poll(); }

    @Contract(mutates = "this")
    @Override public @Nullable T pollFirst() { return super.pollFirst(); }

    @Contract(mutates = "this")
    @Override public @Nullable T pollLast() { return super.pollLast(); }


    @Contract(mutates = "this")
    @Override public T pop() { return super.pop(); }

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

    @Override public boolean containsAll(final @Unmodifiable Collection<? extends @Nullable Object> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableArrayDeque<T> reversed() { return new MutableArrayDequeView<>(super.reversed()); }

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

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableArrayDeque<T> clone() {
        try {
            return (MutableArrayDeque<T>) super.clone();
        } catch (AssertionError error) {
            if (error.getCause() == null) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
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
