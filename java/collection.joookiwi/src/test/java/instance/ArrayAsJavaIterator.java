package instance;

import java.util.Arrays;
import java.util.Iterator;
import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [Iterator] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaIterator<T extends @Nullable Object>
        implements Iterator<T> {

    public final T[] array;
    public @Nullable Iterator<T> reference;

    public ArrayAsJavaIterator(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public Iterator<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = Arrays.stream(array).iterator();
    }

    @Override public boolean hasNext() { return get().hasNext(); }
    @Override public T next() { return get().next(); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaIterator<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

}
