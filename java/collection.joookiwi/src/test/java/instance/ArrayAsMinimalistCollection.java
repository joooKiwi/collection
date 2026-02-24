package instance;

import java.util.Arrays;
import joookiwi.collection.java.AbstractMinimalistCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static org.junit.jupiter.api.Assertions.fail;

/// A [MinimalistCollectionHolder][joookiwi.collection.java.MinimalistCollectionHolder]
/// having the functionality of an array
/// without handling negative indexes in the [#get] method
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsMinimalistCollection<T extends @Nullable Object>
        extends AbstractMinimalistCollectionHolder<T> {

    public final T[] array;
    public final int size;

    public ArrayAsMinimalistCollection(final T[] array) {
        super();
        size = (this.array = array).length;
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return size; }

    @Override public T get(final int index) {
        if (index < 0)
            return fail("The method “get” was attempting to retrieve with a negative index (“" + index + "”)");
        if (index >= size)
            return fail("The method “get” was attempting to retrieve with an invalid index (“" + index + "”)");
        return array[index];
    }

    @Override public String toString() { return "ArrayAsMinimalistCollection " + Arrays.toString(array); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsMinimalistCollection<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }

}
