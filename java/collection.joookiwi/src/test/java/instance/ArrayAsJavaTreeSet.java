package instance;

import java.io.Serial;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A Java [TreeSet] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaTreeSet<T extends @Nullable Object>
        extends TreeSet<T> {

    @Serial private static final long serialVersionUID = -7333702758428270985L;
    public final T[] array;
    public @Nullable TreeSet<T> reference;

    public ArrayAsJavaTreeSet(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public TreeSet<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = new TreeSet<>(Arrays.asList(array));
    }

    //#region -------------------- Methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return get().comparator(); }

    @Override public int size() { return get().size(); }
    @Override public boolean isEmpty() { return get().isEmpty(); }

    @Override public @Nullable T lower(final T value) { return get().lower(value); }
    @Override public @Nullable T floor(final T value) { return get().floor(value); }
    @Override public @Nullable T ceiling(final T value) { return get().ceiling(value); }
    @Override public @Nullable T higher(final T value) { return get().higher(value); }
    @Override public T first() { return get().first(); }
    @Override public T last() { return get().last(); }

    @Override public boolean contains(final Object value) { return get().contains(value); }
    @Override public boolean containsAll(final Collection<?> values) { return get().containsAll(values); }

    @Override public boolean add(final T value) { return get().add(value); }
    @Override public void addFirst(final T value) { get().addFirst(value); }
    @Override public void addLast(final T value) { get().addLast(value); }
    @Override public boolean addAll(final Collection<? extends T> values) { return get().addAll(values); }

    @Override public boolean remove(final Object value) { return get().remove(value); }
    @Override public boolean removeAll(final Collection<?> values) { return get().removeAll(values); }

    @Override public boolean retainAll(final Collection<?> values) { return get().retainAll(values); }

    @Override public @Nullable T pollFirst() { return get().pollFirst(); }
    @Override public @Nullable T pollLast() { return get().pollLast(); }

    @Override public void clear() { get().clear(); }

    @Override public NavigableSet<T> reversed() { return get().reversed(); }
    @Override public NavigableSet<T> descendingSet() { return get().descendingSet(); }

    @Override public SortedSet<T> subSet(final T from, final T to) { return get().subSet(from, to); }
    @Override public NavigableSet<T> subSet(final T from, final boolean isFromInclusive, final T to, final boolean isToInclusive) { return get().subSet(from, isFromInclusive, to, isToInclusive); }
    @Override public SortedSet<T> headSet(final T to) { return get().headSet(to); }
    @Override public NavigableSet<T> headSet(final T to, final boolean isInclusive) { return get().headSet(to, isInclusive); }
    @Override public SortedSet<T> tailSet(final T from) { return get().tailSet(from); }
    @Override public NavigableSet<T> tailSet(final T from, final boolean isInclusive) { return get().tailSet(from, isInclusive); }

    @Override public Iterator<T> iterator() { return get().iterator(); }
    @Override public Iterator<T> descendingIterator() { return get().descendingIterator(); }
    @Override public Spliterator<T> spliterator() { return get().spliterator(); }

    @Override public Object[] toArray() { return get().toArray(); }
    @Override public <U> U[] toArray(final U[] newArray) { return get().toArray(newArray); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaTreeSet<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

    //#endregion -------------------- Methods --------------------

}
