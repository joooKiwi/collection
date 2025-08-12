package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.annotation.Alias;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// An **iterator value** declaration to have
/// the core functionalities on a collection and an outside [IteratorValue]
///
/// @param <T> The type
/// @see CollectionIteratorValue
/// @see OutsideIteratorValue
@NotNullByDefault
public interface IteratorValue<T extends @Nullable Object> {

    /// Tell that the [iterator value][IteratorValue] could be able to progress
    boolean isDone();

    /// Tell that the [iterator value][IteratorValue] could be able to progress
    @Alias("isDone") boolean done();

    /// Tell that the [iterator value][IteratorValue] could not be able to progress
    boolean isNotDone();


    /// The value to retrieve by the iterator
    T value();

}
