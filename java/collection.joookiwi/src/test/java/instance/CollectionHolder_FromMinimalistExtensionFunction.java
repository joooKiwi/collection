package instance;

import joookiwi.collection.java.MinimalistCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static org.junit.jupiter.api.Assertions.fail;

/// A class to exclusively test the extension methods for a [MinimalistCollectionHolder]
///
/// @param <T> The type
@NotNullByDefault
public final class CollectionHolder_FromMinimalistExtensionFunction<T extends @Nullable Object>
        extends AbstractMinimalistCollectionHolderForTest<T, CollectionHolder_FromMinimalistExtensionFunction<T>> {

    /// Tell that the instance is **not** of the type `null`
    public static final boolean IS_NULL = false;
    /// Tell that the instance is **not** of the type [MinimalistCollectionHolder] directly
    public static final boolean IS_MINIMALIST = true;
    /// Tell that the instance is based on the extension methods directly
    public static final boolean IS_EXTENSION = true;
    /// Tell that the instance is a **not** viewer instance
    public static final boolean IS_VIEWER = false;
    /// The simplified named to be used in the test “ParameterizedTest” or “ParameterizedClass”
    public static final String SIMPLIFIED_NAME = "minimalist extension";

    public CollectionHolder_FromMinimalistExtensionFunction(final T @Unmodifiable [] array) { super(array); }


    @Contract(ALWAYS_FAIL_0) @Override public int getAmountOfCall() { return fail("The getter method “amountOfCall” was not expected to be called on an extension function only test instance."); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return array.length; }

    @Override public T get(final int index) {
        if (index < 0)
            throw new RuntimeException("The method “get” was not expected to be called with a negative index");
        if (index >= array.length)
            throw new RuntimeException("The method “get” was not expected to be called with a negative index");
        return array[index];
    }

}
