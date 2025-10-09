package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Spliterator;
import java.util.concurrent.SynchronousQueue;
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

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_FAIRNESS;
import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CollectionConstants.emptyParallelStream;
import static joookiwi.collection.java.CollectionConstants.emptySpliterator;
import static joookiwi.collection.java.CollectionConstants.emptyStream;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

/// A mutable behaviour of a [SynchronousQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableSynchronousQueue<T>
        extends SynchronousQueue<T>
        implements MutableBlockingQueue<T> {

    @Serial private static final long serialVersionUID = 8430677287392716591L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [SynchronousQueue] that starts empty
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableSynchronousQueue() { super(DEFAULT_FAIRNESS); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- isFair --------------------

    /// Create an empty mutable instance of [SynchronousQueue]
    /// and the fairness received
    public MutableSynchronousQueue(final boolean isFair) { super(isFair); }

    /// Create an empty mutable instance of [SynchronousQueue]
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableSynchronousQueue(final @Nullable Boolean isFair) { super(isFair == null ? DEFAULT_FAIRNESS : isFair); }

    //#endregion -------------------- isFair --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(DEFAULT_FAIRNESS);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS]
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(DEFAULT_FAIRNESS);
        if (values.isEmpty())
            return;
        for (final var value : values)
            offer(value);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, isFair --------------------

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                   final boolean isFair) {
        super(isFair);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values,
                                   final @Nullable Boolean isFair) {
        super(isFair == null ? DEFAULT_FAIRNESS : isFair);
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offer(values[index]);
    }


    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                   final boolean isFair) {
        super(isFair);
        if (values.isEmpty())
            return;
        for (final var value : values)
            offer(value);
    }

    /// Create a mutable instance of [SynchronousQueue]
    /// that starts with the `values` received
    /// and the fairness received (or [no fairness][joookiwi.collection.java.CollectionConstants#DEFAULT_FAIRNESS] if it is `null`)
    public MutableSynchronousQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                   final @Nullable Boolean isFair) {
        super(isFair == null ? DEFAULT_FAIRNESS : isFair);
        if (values.isEmpty())
            return;
        for (final var value : values)
            offer(value);
    }

    //#endregion -------------------- values, isFair --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true)
    @Override public boolean isEmpty() { return true; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true)
    @Override public T element() { throw new NoSuchElementException("No element could be found in a SynchronousQueue."); }

    @Contract(value = ALWAYS_NULL_0, pure = true)
    @Override public @Nullable T peek() { return null; }


    @Contract(mutates = "this")
    @Override public @Nullable T poll() { return super.poll(); }

    @Contract(mutates = "this")
    @Override public @Nullable T poll(final long timeout, final TimeUnit unit) throws InterruptedException { return super.poll(timeout, unit); }


    @Contract(mutates = "this")
    @Override public T take() throws InterruptedException { return super.take(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(value = ALWAYS_FALSE_1, pure = true)
    @Override public boolean contains(final @Nullable Object value) { return false; }

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

    @Contract(pure = true)
    @Override public void clear() {}

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T remove() { return super.remove(); }

    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) { return super.remove(value); }

    @Contract(value = ALWAYS_FALSE_1, pure = true)
    @Override public boolean removeAll(final @Unmodifiable Collection<? extends @Nullable Object> values) { return false; }

    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) { return super.removeIf(filter); }//TODO validate if it does anything in a mutable SynchronousQueue

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(value = ALWAYS_FALSE_1, pure = true)
    @Override public boolean retainAll(final @Unmodifiable Collection<? extends @Nullable Object> values) { return false; }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { Objects.requireNonNull(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(emptyIterator()); }

    @Contract(pure = true)
    @Override public Spliterator<T> spliterator() { return emptySpliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Drain to methods --------------------

    @Contract(mutates = "this")
    @Override public int drainTo(final Collection<? super T> source) { return super.drainTo(source); }

    @Contract(mutates = "this")
    @Override public int drainTo(final Collection<? super T> source, final int maximum) { return super.drainTo(source, maximum); }

    //#endregion -------------------- Drain to methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public Object[] toArray() { return new Object[0]; }

    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return super.toArray(newArray); }

    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return super.toArray(generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true)
    @Override public Stream<T> stream() { return emptyStream(); }

    @Contract(pure = true)
    @Override public Stream<T> parallelStream() { return emptyParallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableSynchronousQueue<T> clone() {
        try {
            return (MutableSynchronousQueue<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true)
    @Override public String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
