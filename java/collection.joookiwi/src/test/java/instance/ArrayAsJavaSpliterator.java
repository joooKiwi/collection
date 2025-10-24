package instance;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;
import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [Spliterator] adaptor class from an array
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsJavaSpliterator<T extends @Nullable Object>
        implements Spliterator<T> {

    public final T[] array;
    public @Nullable Spliterator<T> reference;

    public ArrayAsJavaSpliterator(final T[] array) {
        super();
        this.array = array;
    }

    @InitializedOnFirstCall
    public Spliterator<T> get() {
        final var value = reference;
        if (value != null)
            return value;
        return reference = Arrays.spliterator(array);
    }

    @Override public boolean tryAdvance(final Consumer<? super T> action) { return get().tryAdvance(action); }
    @Override public Spliterator<T> trySplit() { return get().trySplit(); }
    @Override public long estimateSize() { return get().estimateSize(); }
    @Override public int characteristics() { return get().characteristics(); }

    @Override public String toString() { return get().toString(); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsJavaSpliterator<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

}
