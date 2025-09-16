package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Deque;
import java.util.Spliterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
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
import static joookiwi.collection.java.NumericConstants.MAX_BYTE_VALUE_AS_LONG;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE_AS_LONG;
import static joookiwi.collection.java.NumericConstants.MAX_SHORT_VALUE_AS_LONG;
import static joookiwi.collection.java.method.ToCollection.toCollection;

/// An mutable behaviour of a [LinkedBlockingDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedBlockingDeque<T>
        extends LinkedBlockingDeque<T>
        implements MutableBlockingDeque<T> {

    @Serial private static final long serialVersionUID = -8038291843928745343L;

    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [MutableLinkedBlockingDeque]
    ///
    /// @param <T> The type
    @NotNullByDefault
    private static final class MutableLinkedBlockingDequeView<T>
            extends MutableLinkedBlockingDeque<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = -4828067477967650297L;

        private final Deque<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public MutableLinkedBlockingDequeView(final Deque<T> reference) {
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
        @Override public MutableLinkedBlockingDequeView<T> reversed() { return new MutableLinkedBlockingDequeView<>(__reference.reversed()); }

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
        @Override public MutableLinkedBlockingDequeView<T> clone() { return (MutableLinkedBlockingDequeView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity of 1
    public MutableLinkedBlockingDeque() {
        super(MAX_INT_VALUE);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- capacity --------------------

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) byte capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_BYTE_VALUE_AS_LONG) @Nullable Byte capacity) { super(capacity == null ? MAX_INT_VALUE : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) short capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_SHORT_VALUE_AS_LONG) @Nullable Short capacity) { super(capacity == null ? MAX_INT_VALUE : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) int capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingDeque]
    /// with a capacity received (or [Integer#MAX_VALUE] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE_AS_LONG) @Nullable Integer capacity) { super(capacity == null ? MAX_INT_VALUE : capacity); }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedBlockingDeque]
    /// with a capacity of [Integer#MAX_VALUE]
    public MutableLinkedBlockingDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(MAX_INT_VALUE);
        if (values.length == 0)
            return;
        addAll(toCollection(values));
    }

    /// Create a mutable instance of [LinkedBlockingDeque]
    /// with a capacity of [Integer#MAX_VALUE]
    public MutableLinkedBlockingDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(MAX_INT_VALUE);
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int remainingCapacity() { return super.remainingCapacity(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T getFirst() { return super.getFirst(); }

    @Override public T getLast() { return super.getLast(); }


    @Override public T element() { return super.element(); }


    @Override public @Nullable T peek() { return super.peek(); }

    @Override public @Nullable T peekFirst() { return super.peekFirst(); }

    @Override public @Nullable T peekLast() { return super.peekLast(); }


    @Contract(mutates = "this")
    @Override public T take() throws InterruptedException { return super.take(); }

    @Contract(mutates = "this")
    @Override public T takeFirst() throws InterruptedException { return super.takeFirst(); }

    @Contract(mutates = "this")
    @Override public T takeLast() throws InterruptedException { return super.takeLast(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) { super.addLast(value); }


    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends @Nullable T> values) { return super.addAll(values); }


    @Contract(mutates = "this")
    @Override public boolean offer(final T value) { return super.offer(value); }

    @Contract(mutates = "this")
    @Override public boolean offerFirst(final T value) { return super.offerFirst(value); }

    @Contract(mutates = "this")
    @Override public boolean offerLast(final T value) { return super.offerLast(value); }


    @Contract(mutates = "this")
    @Override public boolean offer(final T value, final long timeout, final TimeUnit unit) throws InterruptedException { return super.offer(value, timeout, unit); }

    @Contract(mutates = "this")
    @Override public boolean offerFirst(final T value, final long timeout, final TimeUnit unit) throws InterruptedException { return super.offerFirst(value, timeout, unit); }

    @Contract(mutates = "this")
    @Override public boolean offerLast(final T value, final long timeout, final TimeUnit unit) throws InterruptedException { return super.offerLast(value, timeout, unit); }


    @Contract(mutates = "this")
    @Override public void put(final T value) throws InterruptedException { super.put(value); }

    @Contract(mutates = "this")
    @Override public void putFirst(final T value) throws InterruptedException { super.putFirst(value); }

    @Contract(mutates = "this")
    @Override public void putLast(final T value) throws InterruptedException { super.putLast(value); }


    @Contract(mutates = "this")
    @Override public void push(final T value) {super.push(value); }

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
    @Override public @Nullable T poll(final long timeout, final TimeUnit unit) throws InterruptedException { return super.poll(timeout, unit); }

    @Contract(mutates = "this")
    @Override public @Nullable T pollFirst(final long timeout, final TimeUnit unit) throws InterruptedException { return super.pollFirst(timeout, unit); }

    @Contract(mutates = "this")
    @Override public @Nullable T pollLast(final long timeout, final TimeUnit unit) throws InterruptedException { return super.pollLast(timeout, unit); }


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
    @Override public MutableLinkedBlockingDeque<T> reversed() { return new MutableLinkedBlockingDequeView<>(super.reversed()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> descendingIterator() { return new IteratorAsMutableIterator<>(super.descendingIterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Drain to methods --------------------

    @Contract(mutates = "this")
    @Override public int drainTo(final Collection<? super T> source) { return super.drainTo(source); }

    @Contract(mutates = "this")
    @Override public int drainTo(final Collection<? super T> source, final int maximum) { return super.drainTo(source, maximum); }

    //#endregion -------------------- Drain to methods --------------------
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
    @Override public MutableLinkedBlockingDeque<T> clone() {
        try {
            return (MutableLinkedBlockingDeque<T>) super.clone();
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
