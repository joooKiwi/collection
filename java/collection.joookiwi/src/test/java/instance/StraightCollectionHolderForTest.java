package instance;

import java.util.function.Consumer;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A [CollectionHolder] that has the minimum utility methods for a test
/// and is watching the amount of time a specific method is being called for the instance
///
///  @param <T>       The type
/// @param <INSTANCE> The current instance
@NotNullByDefault
public interface StraightCollectionHolderForTest<T extends @Nullable Object,
        INSTANCE extends StraightCollectionHolderForTest<T, INSTANCE>>
        extends CollectionHolder<T> {

    /// The amount of time a specific method (as non-aliased method) has been called
    @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall();

    /// Do an action on the current [instance][StraightCollectionHolderForTest]
    /// and return itself afterward
    ///
    /// @param action The action to do
    @Contract(ALWAYS_THIS_1)
    INSTANCE execute(Consumer<INSTANCE> action);

}
