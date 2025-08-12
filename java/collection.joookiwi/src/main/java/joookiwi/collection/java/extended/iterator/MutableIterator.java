package joookiwi.collection.java.extended.iterator;

import java.util.Iterator;
import java.util.function.Consumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface MutableIterator<T extends @Nullable Object>
        extends Iterator<T> {

    /// Tell if the iteration has more elements **after** the current element
    @Override boolean hasNext();

    /// Retrieve the next value in the line
    ///
    /// @throws NoElementFoundInCollectionException Is at the end of the line
    @Contract(mutates = "this")
    @Override T next();

    @Contract(mutates = "this")
    @Override void remove();

    /// Do a certain operation for the rest of the elements in the current [iterator][ImmutableIterator]
    @Contract(mutates = "this")
    @Override void forEachRemaining(Consumer<? super T> operation);

}
