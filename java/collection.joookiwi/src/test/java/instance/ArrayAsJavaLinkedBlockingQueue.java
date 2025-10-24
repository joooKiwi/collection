package instance;

import java.io.Serial;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A Java [LinkedBlockingQueue] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaLinkedBlockingQueue<T>
        extends LinkedBlockingQueue<T> {

    @Serial private static final long serialVersionUID = -8578236125426013880L;
    public final T[] array;
    public @Nullable LinkedBlockingQueue<T> reference;

    public ArrayAsJavaLinkedBlockingQueue(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public LinkedBlockingQueue<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = new LinkedBlockingQueue<>(Arrays.asList(array));
    }

    //#region -------------------- Methods --------------------

    @Override public int size() { return get().size(); }
    @Override public int remainingCapacity() { return get().remainingCapacity(); }
    @Override public boolean isEmpty() { return get().isEmpty(); }

    @Override public T peek() { return get().peek(); }
    @Override public T element() { return get().element(); }

    @Override public boolean offer(final T value) { return get().offer(value); }
    @Override public boolean offer(final T value, final long timeout, final TimeUnit unit) throws InterruptedException { return get().offer(value, timeout, unit); }

    @Override public void put(final T value) throws InterruptedException { get().put(value); }

    @Override public boolean contains(final Object value) { return get().contains(value); }
    @Override public boolean containsAll(final Collection<?> values) { return get().containsAll(values); }

    @Override public boolean add(final T value) { return get().add(value); }
    @Override public boolean addAll(final Collection<? extends T> values) { return get().addAll(values); }

    @Override public T remove() { return get().remove(); }
    @Override public boolean remove(final Object value) { return get().remove(value); }
    @Override public boolean removeAll(final Collection<?> values) { return get().removeAll(values); }
    @Override public boolean removeIf(final Predicate<? super T> filter) { return get().removeIf(filter); }

    @Override public T take() throws InterruptedException { return get().take(); }

    @Override public T poll() { return get().poll(); }
    @Override public @Nullable T poll(final long timeout, final TimeUnit unit) throws InterruptedException { return get().poll(timeout, unit); }

    @Override public boolean retainAll(final Collection<?> values) { return get().retainAll(values); }

    @Override public void clear() { get().clear(); }

    @Override public void forEach(final Consumer<? super T> action) { get().forEach(action); }

    @Override public Iterator<T> iterator() { return get().iterator(); }
    @Override public Spliterator<T> spliterator() { return get().spliterator(); }

    @Override public Stream<T> stream() { return get().stream(); }
    @Override public Stream<T> parallelStream() { return get().parallelStream(); }

    @Override public Object[] toArray() { return get().toArray(); }
    @Override public <U> U[] toArray(final U[] newArray) { return get().toArray(newArray); }
    @Override public <U> U[] toArray(final IntFunction<U[]> generator) { return get().toArray(generator); }

    @Override public int drainTo(final Collection<? super T> source) { return get().drainTo(source); }
    @Override public int drainTo(final Collection<? super T> source, final int maximum) { return get().drainTo(source, maximum); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaLinkedBlockingQueue<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

    //#endregion -------------------- Methods --------------------

}
