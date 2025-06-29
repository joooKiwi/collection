package joookiwi.collection.java.extended.iterator;

import java.util.ListIterator;
import java.util.function.Consumer;

import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public interface MutableListIterator<T extends @Nullable Object>
        extends MutableIterator<T>,
                ListIterator<T> {

    /// Tell if the iteration has more elements **after** the current element
    @Override boolean hasNext();

    /// Get the index that will be used at a later [#next] call
    ///
    /// @implNote If the value is `0`, then the [iterator][MutableListIterator] has not started its iteration
    @Override @Range(from = 0, to = MAX_INT_VALUE) int nextIndex();

    /// Retrieve the next value in the line
    ///
    /// @throws NoElementFoundInCollectionException Is at the end of the line
    @Contract(mutates = "this")
    @Override T next();


    /// Tell if the iteration has more elements **before** the current element
    @Override boolean hasPrevious();

    /// Get the previous that will be used at a later [#previous] call
    ///
    /// @implNote If the value is `-1`, then the [iterator][MutableListIterator] has not started its iteration
    @Override @Range(from = -1, to = MAX_INT_VALUE - 1) int previousIndex();

    /// Retrieve the previous value in the line
    ///
    /// @throws NoElementFoundInCollectionException Is at the start of the line
    @Contract(mutates = "this")
    @Override T previous();


    @Contract(mutates = "this")
    @Override void remove();

    @Contract(mutates = "this")
    @Override void add(T value);

    @Contract(mutates = "this")
    @Override void set(T value);


    /// Do a certain operation for the rest of the elements in the current [iterator][MutableListIterator]
    @Contract(mutates = "this")
    @Override void forEachRemaining(Consumer<? super T> operation);

}
