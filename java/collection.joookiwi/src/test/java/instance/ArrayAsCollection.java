package instance;

import java.util.Arrays;
import joookiwi.collection.java.AbstractCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static org.junit.jupiter.api.Assertions.fail;

/// A [CollectionHolder][joookiwi.collection.java.CollectionHolder]
/// having the functionality of an array
/// without handling negative indexes in the [#get] method
///
/// @param <T> The type
@NotNullByDefault
public final class ArrayAsCollection<T extends @Nullable Object>
        extends AbstractCollectionHolder<T> {

    public final T[] array;
    public final int size;

    public ArrayAsCollection(final T[] array) {
        super();
        size = (this.array = array).length;
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return size; }

    @Override public T get(final int index) {
        if (index < 0) {
            fail("The method “get” was attempting to retrieve with a negative index (“" + index + "”)");
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “get” call if the index was not present in the array.");
        }
        if (index >= size) {
            fail("The method “get” was attempting to retrieve with an invalid index (“" + index + "”)");
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “get” call if the index was not present in the array.");
        }
        return array[index];
    }

    @Override public String toString() { return "ArrayAsCollection " + Arrays.toString(array); }

    @Contract(ALWAYS_FAIL_0) @Override public int hashCode() { throw new RuntimeException("The method “hashCode” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_1) @Override public boolean equals(final @Nullable Object other) { throw new RuntimeException("The method “equals” was not expected to be called in a test."); }

    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsCollection<T> clone() { throw new RuntimeException("The method “clone” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsCollection<T> shallowClone() { throw new RuntimeException("The method “shallowClone” was not expected to be called in a test."); }
    @Contract(ALWAYS_FAIL_0) @Override public ArrayAsCollection<T> deepClone() { throw new RuntimeException("The method “deepClone” was not expected to be called in a test."); }

}
