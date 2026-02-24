package instance;

import java.io.Serial;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedDeque;
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

/// A Java [ConcurrentLinkedDeque] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaConcurrentLinkedDeque<T>
        extends ConcurrentLinkedDeque<T> {

    @Serial private static final long serialVersionUID = 39745013082575618L;
    public final T[] array;
    public @Nullable ConcurrentLinkedDeque<T> reference;

    public ArrayAsJavaConcurrentLinkedDeque(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public ConcurrentLinkedDeque<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = new ConcurrentLinkedDeque<>(Arrays.asList(array));
    }

    //#region -------------------- Methods --------------------

    @Override public int size() { return get().size(); }
    @Override public boolean isEmpty() { return get().isEmpty(); }

    @Override public T peek() { return get().peek(); }
    @Override public T peekFirst() { return get().peekFirst(); }
    @Override public T peekLast() { return get().peekLast(); }
    @Override public T element() { return get().element(); }
    @Override public T getFirst() { return get().getFirst(); }
    @Override public T getLast() { return get().getLast(); }

    @Override public boolean offer(final T value) { return get().offer(value); }
    @Override public boolean offerFirst(final T value) { return get().offerFirst(value); }
    @Override public boolean offerLast(final T value) { return get().offerLast(value); }

    @Override public boolean contains(final Object value) { return get().contains(value); }
    @Override public boolean containsAll(final Collection<?> values) { return get().containsAll(values); }

    @Override public boolean add(final T value) { return get().add(value); }
    @Override public void addFirst(final T value) { get().addFirst(value); }
    @Override public void addLast(final T value) { get().addLast(value); }
    @Override public boolean addAll(final Collection<? extends T> values) { return get().addAll(values); }

    @Override public void push(final T value) { get().push(value); }

    @Override public T remove() { return get().remove(); }
    @Override public T removeFirst() { return get().removeFirst(); }
    @Override public T removeLast() { return get().removeLast(); }
    @Override public boolean remove(final Object value) { return get().remove(value); }
    @Override public boolean removeFirstOccurrence(final Object value) { return get().removeFirstOccurrence(value); }
    @Override public boolean removeLastOccurrence(final Object value) { return get().removeLastOccurrence(value); }
    @Override public boolean removeAll(final Collection<?> values) { return get().removeAll(values); }
    @Override public boolean removeIf(final Predicate<? super T> filter) { return get().removeIf(filter); }

    @Override public T poll() { return get().poll(); }
    @Override public T pollFirst() { return get().pollFirst(); }
    @Override public T pollLast() { return get().pollLast(); }

    @Override public T pop() { return get().pop(); }

    @Override public boolean retainAll(final Collection<?> values) { return get().retainAll(values); }

    @Override public void clear() { get().clear(); }

    @Override public void forEach(final Consumer<? super T> action) { get().forEach(action); }

    @Override public Iterator<T> iterator() { return get().iterator(); }
    @Override public Iterator<T> descendingIterator() { return get().descendingIterator(); }
    @Override public Spliterator<T> spliterator() { return get().spliterator(); }

    @Override public Stream<T> stream() { return get().stream(); }
    @Override public Stream<T> parallelStream() { return get().parallelStream(); }

    @Override public Deque<T> reversed() { return get().reversed(); }

    @Override public Object[] toArray() { return get().toArray(); }
    @Override public <U> U[] toArray(final U[] newArray) { return get().toArray(newArray); }
    @Override public <U> U[] toArray(final IntFunction<U[]> generator) { return get().toArray(generator); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaConcurrentLinkedDeque<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

    //#endregion -------------------- Methods --------------------

}
