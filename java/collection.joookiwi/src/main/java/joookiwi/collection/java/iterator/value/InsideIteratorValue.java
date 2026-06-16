package joookiwi.collection.java.iterator.value;

import joookiwi.collection.java.annotation.Alias;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

@NotNullByDefault
public interface InsideIteratorValue<T extends @Nullable Object>
        extends IteratorValue<T> {

    /// The index associated to the value
    int index();

    /// Tell that the [iterator value][InsideIteratorValue] is able to progress (_at the moment of its creation_)
    @Contract(ALWAYS_TRUE_0) @Override boolean isDone();

    /// Tell that the [iterator value][InsideIteratorValue] is able to progress (_at the moment of its creation_)
    @Alias("isDone") @Contract(ALWAYS_TRUE_0) @Override default boolean done()  { return isDone(); }

    /// Tell that the [iterator value][InsideIteratorValue] is **not** able to progress (_at the moment of its creation_)
    @Contract(ALWAYS_FALSE_0) @Override boolean isNotDone();

}
