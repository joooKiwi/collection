package joookiwi.collection.java.iterator.value;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

/// An [iterator value][IteratorValue] made to never retrieve a value
/// when it is outside a [CollectionIterator][joookiwi.collection.java.iterator.CollectionIterator] range
///
/// @param <T> The type
/// @see GenericBeforeFirstIteratorValue
/// @see GenericAfterLastIteratorValue
@NotNullByDefault
public interface OutsideIteratorValue<T extends @Nullable Object>
        extends IteratorValue<T>{

    /// Tell that the [iterator value][OutsideIteratorValue] is never able to progress any further
    @Contract(ALWAYS_TRUE_0) @Override boolean isDone();

    /// Tell that the [iterator value][OutsideIteratorValue] is never able to progress any further
    @Contract(ALWAYS_TRUE_0) @Override boolean done();

    /// Tell that the [iterator value][OutsideIteratorValue] is always unable to progress any further
    @Contract(ALWAYS_FALSE_0) @Override boolean isNotDone();


    /// The never returned value
    ///
    /// @throws joookiwi.collection.java.exception.NoElementFoundInCollectionException No value could ever be returned
    @Contract(ALWAYS_FAIL_0) @Override T value();

}
