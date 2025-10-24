package instance;

import java.util.Arrays;
import java.util.ListIterator;
import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [ListIterator] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaListIterator<T extends @Nullable Object>
        implements ListIterator<T> {

    public final T[] array;
    public @Nullable ListIterator<T> reference;

    public ArrayAsJavaListIterator(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public ListIterator<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = Arrays.asList(array).listIterator();
    }

    @Override public boolean hasNext() { return get().hasNext(); }
    @Override public T next() { return get().next(); }
    @Override public boolean hasPrevious() { return get().hasPrevious(); }
    @Override public T previous() { return get().previous(); }
    @Override public int nextIndex() { return get().nextIndex(); }
    @Override public int previousIndex() { return get().previousIndex(); }
    @Override public void remove() { get().remove(); }
    @Override public void set(final T value) { get().set(value); }
    @Override public void add(final T value) { get().add(value); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaListIterator<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

}
