package joookiwi.collection.java.extended.iterator;

import java.util.ListIterator;
import java.util.function.Consumer;

import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public interface ImmutableListIterator<T extends @Nullable Object>
        extends ImmutableIterator<T>,
                ListIterator<T> {

    /// Tell if the iteration has more elements **after** the current element
    @Override boolean hasNext();

    /// Get the index that will be used at a later [#next] call
    ///
    /// @implNote If the value is `0`, then the [iterator][ImmutableListIterator] has not started its iteration
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
    /// @implNote If the value is `-1`, then the [iterator][ImmutableListIterator] has not started its iteration
    @Override @Range(from = -1, to = MAX_INT_VALUE - 1) int previousIndex();

    /// Retrieve the previous value in the line
    ///
    /// @throws NoElementFoundInCollectionException Is at the start of the line
    @Contract(mutates = "this")
    @Override T previous();


    /// Fail to remove the current value in the [instance][ImmutableIterator]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable ListIterator."); }

    /// Fail to add a `value` for the current [instance][ImmutableIterator] in the list held
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void add(final @Nullable T value) { throw new UnsupportedMethodException("The method “set” is not supported in an immutable ListIterator."); }

    /// Fail to replace the `value` in the current [instance][ImmutableIterator]
    ///
    /// @param value The (_never used_) element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void set(final @Nullable T value) { throw new UnsupportedMethodException("The method “set” is not supported in an immutable ListIterator."); }


    /// Do a certain operation for the rest of the elements in the current [iterator][ImmutableListIterator]
    @Contract(mutates = "this")
    @Override void forEachRemaining(Consumer<? super T> operation);

}
