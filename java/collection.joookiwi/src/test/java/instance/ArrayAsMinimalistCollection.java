package instance;

import joookiwi.collection.java.AbstractMinimalistCollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static org.junit.jupiter.api.Assertions.fail;

/// A [joookiwi.collection.java.MinimalistCollectionHolder] having the functionality of an array
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

}
