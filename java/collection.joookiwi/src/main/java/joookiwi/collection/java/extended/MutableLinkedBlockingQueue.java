package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Spliterator;
import java.util.concurrent.LinkedBlockingQueue;
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

import static joookiwi.collection.java.CollectionConstants.DEFAULT_QUEUE_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.method.ToList.toList;

/// A mutable behaviour of a [LinkedBlockingQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedBlockingQueue<T>
        extends LinkedBlockingQueue<T>
        implements MutableBlockingQueue<T> {

    @Serial private static final long serialVersionUID = 7921307743353054221L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [LinkedBlockingQueue] that starts empty
    /// with a capacity of [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY]
    public MutableLinkedBlockingQueue() { super(DEFAULT_QUEUE_CAPACITY); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- capacity --------------------

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) byte capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Byte.MAX_VALUE) @Nullable Byte capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) short capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Short.MAX_VALUE) @Nullable Short capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) int capacity) { super(capacity); }

    /// Create an empty mutable instance of [LinkedBlockingQueue]
    /// with a capacity received (or [32][joookiwi.collection.java.CollectionConstants#DEFAULT_QUEUE_CAPACITY] if it is `null`)
    ///
    /// @throws IllegalArgumentException The capacity was under `1`
    public MutableLinkedBlockingQueue(final @Range(from = 1, to = Integer.MAX_VALUE) @Nullable Integer capacity) { super(capacity == null ? DEFAULT_QUEUE_CAPACITY : capacity); }

    //#endregion -------------------- capacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedBlockingQueue]
    /// that starts with the `values` received
    /// and the capacity as [Integer#MAX_VALUE]
    public MutableLinkedBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(toList(values)); }

    /// Create a mutable instance of [LinkedBlockingQueue]
    /// that starts with the `values` received
    /// and the capacity as [Integer#MAX_VALUE]
    public MutableLinkedBlockingQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int remainingCapacity() { return super.remainingCapacity(); }

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
    @Override public boolean offer(final T value, final long timeout, final TimeUnit unit) throws InterruptedException { return super.offer(value, timeout, unit); }


    @Contract(mutates = "this")
    @Override public void put(final T value) throws InterruptedException { super.put(value); }

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
    @Override public MutableLinkedBlockingQueue<T> clone() {
        try {
            return (MutableLinkedBlockingQueue<T>) super.clone();
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
