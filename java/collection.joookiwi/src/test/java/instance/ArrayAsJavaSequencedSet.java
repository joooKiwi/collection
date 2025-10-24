package instance;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SequencedSet;
import java.util.Spliterator;
import java.util.TreeSet;
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

/// A Java [SequencedSet] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaSequencedSet<T extends @Nullable Object>
        implements SequencedSet<T> {

    public final T[] array;
    public @Nullable SequencedSet<T> reference;

    public ArrayAsJavaSequencedSet(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public SequencedSet<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = new TreeSet<>(Arrays.asList(array));
    }

    //#region -------------------- Methods --------------------

    @Override public int size() { return get().size(); }
    @Override public boolean isEmpty() { return get().isEmpty(); }

    @Override public T getFirst() { return get().getFirst(); }
    @Override public T getLast() { return get().getLast(); }

    @Override public boolean contains(final Object value) { return get().contains(value); }
    @Override public boolean containsAll(final Collection<?> values) { return get().containsAll(values); }

    @Override public boolean add(final T value) { return get().add(value); }
    @Override public void addFirst(final T value) { get().addFirst(value); }
    @Override public void addLast(final T value) { get().addLast(value); }
    @Override public boolean addAll(final Collection<? extends T> values) { return get().addAll(values); }

    @Override public boolean remove(final Object value) { return get().remove(value); }
    @Override public T removeFirst() { return get().removeFirst(); }
    @Override public T removeLast() { return get().removeLast(); }
    @Override public boolean removeAll(final Collection<?> values) { return get().removeAll(values); }
    @Override public boolean removeIf(final Predicate<? super T> filter) { return get().removeIf(filter); }

    @Override public boolean retainAll(final Collection<?> values) { return get().retainAll(values); }

    @Override public void clear() { get().clear(); }

    @Override public void forEach(final Consumer<? super T> action) { get().forEach(action); }

    @Override public SequencedSet<T> reversed() { return get().reversed(); }

    @Override public Iterator<T> iterator() { return get().iterator(); }
    @Override public Spliterator<T> spliterator() { return get().spliterator(); }

    @Override public Stream<T> stream() { return get().stream(); }
    @Override public Stream<T> parallelStream() { return get().parallelStream(); }

    @Override public Object[] toArray() { return get().toArray(); }
    @Override public <U> U[] toArray(final U[] newArray) { return get().toArray(newArray); }
    @Override public <U> U[] toArray(final IntFunction<U[]> generator) { return get().toArray(generator); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaSequencedSet<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

    //#endregion -------------------- Methods --------------------

}
