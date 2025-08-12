package joookiwi.collection.java.extended.iterator;

import java.util.Iterator;
import java.util.function.Consumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public interface ImmutableIterator<T extends @Nullable Object>
        extends Iterator<T> {

    /// Tell if the iteration has more elements **after** the current element
    @Override boolean hasNext();

    /// Retrieve the next value in the line
    ///
    /// @throws NoElementFoundInCollectionException Is at the end of the line
    @Contract(mutates = "this")
    @Override T next();

    /// Fail to remove the current value in the [instance][ImmutableIterator]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Iterator."); }

    /// Do a certain operation for the rest of the elements in the current [iterator][ImmutableIterator]
    @Contract(mutates = "this")
    @Override void forEachRemaining(Consumer<? super T> operation);

}
