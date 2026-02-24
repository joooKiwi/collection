package instance;

import joookiwi.collection.java.GenericMinimalistCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionViewer;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A class to test the functionality of a [MinimalistCollectionViewer]
/// for both [MinimalistCollectionViewer#size]
/// and [MinimalistCollectionViewer#get]
///
/// The remaining methods are from the extension methods for a [joookiwi.collection.java.MinimalistCollectionHolder]
///
/// @param <T> The type
@NotNullByDefault
public final class CollectionHolder_ByMinimalistViewer<T extends @Nullable Object>
        extends AbstractMinimalistCollectionHolderForTest<T, CollectionHolder_ByMinimalistViewer<T>> {

    /// Tell that the instance is **not** of the type `null`
    public static final boolean IS_NULL = false;
    /// Tell that the instance is of the type [MinimalistCollectionHolder][joookiwi.collection.java.MinimalistCollectionHolder] directly
    public static final boolean IS_MINIMALIST = true;
    /// Tell that the instance is **not** based on the extension methods directly
    public static final boolean IS_EXTENSION = false;
    /// Tell that the instance is a viewer instance
    public static final boolean IS_VIEWER = true;
    /// The simplified named to be used in the test “ParameterizedTest” or “ParameterizedClass”
    public static final String SIMPLIFIED_NAME = "minimalist viewer";

    /// The internal instance that is tested
    public final MinimalistCollectionViewer<T, ArrayAsMinimalistCollection<T>> instance;

    public CollectionHolder_ByMinimalistViewer(final T @Unmodifiable [] array) {
        super(array);
        instance = new MinimalistCollectionViewer<>(new ArrayAsMinimalistCollection<>(array));
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return instance.size(); }

    @Override public T get(final int index) {
        amountOfCall++;
        return instance.get(index);
    }

}
