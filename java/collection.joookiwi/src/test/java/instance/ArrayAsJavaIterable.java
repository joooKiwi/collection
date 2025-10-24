package instance;

import java.util.Arrays;
import java.util.Iterator;

import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [Iterable] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaIterable<T extends @Nullable Object>
        implements Iterable<T> {

    public final T[] array;
    public @Nullable Iterable<T> reference;

    public ArrayAsJavaIterable(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public Iterable<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = Arrays.asList(array);
    }

    @Override public Iterator<T> iterator() { return get().iterator(); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaIterable<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

}
