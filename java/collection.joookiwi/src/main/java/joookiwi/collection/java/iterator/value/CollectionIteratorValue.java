package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.Alias;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [iterator value][IteratorValue] made to retrieve a [#value] from a [#collection] using its [#index]
///
/// @see GenericCollectionIteratorValue
public interface CollectionIteratorValue<T extends @Nullable Object>
        extends IteratorValue<T> {

    /// The [collection][MinimalistCollectionHolder] to use in the [get value][#value]
    MinimalistCollectionHolder<? extends T> collection();


    /// The index to retrieve in the [#collection] by the [get value][#value]
    @Range(from = 0, to = MAX_INT_VALUE) int index();


    /// Tell that the [iterator value][CollectionIteratorValue] is able to progress (_at the moment of its creation_)
    @Contract(ALWAYS_FALSE_0) boolean isDone();

    /// Tell that the [iterator value][CollectionIteratorValue] is able to progress (_at the moment of its creation_)
    @Alias("isDone") @Contract(ALWAYS_FALSE_0) boolean done();

    /// Tell that the [iterator value][CollectionIteratorValue] is **not** able to progress (_at the moment of its creation_)
    @Contract(ALWAYS_TRUE_0) boolean isNotDone();

}
