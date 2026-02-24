package instance;

import java.util.function.Consumer;
import java.util.function.Function;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;

/// A [StraightCollectionHolderForTest] that has more utility methods for a test
///
///  @param <T>       The type
/// @param <INSTANCE> The current instance
@NotNullByDefault
public interface CollectionHolderForTest<T extends @Nullable Object,
        INSTANCE extends CollectionHolderForTest<T, INSTANCE>>
        extends StraightCollectionHolderForTest<T, INSTANCE> {

    /// Do an action on the current [instance][CollectionHolderForTest]
    /// while expecting a [IndexOutOfBoundsException] to be thrown
    /// and return itself afterward
    ///
    /// @param action The action to do
    @Contract(ALWAYS_THIS_1)
    @SuppressWarnings("Unchecked cast")
    INSTANCE executeWhileExpectingIndexOutOfBound(final Consumer<INSTANCE> action);

    /// Do an action on the current [instance][CollectionHolderForTest]
    /// while expecting a [InvalidIndexRangeException] to be thrown
    /// and return itself afterward
    ///
    /// @param action The action to do
    @Contract(ALWAYS_THIS_1)
    @SuppressWarnings("Unchecked cast")
    INSTANCE executeWhileExpectingInvalidIndexRange(final Consumer<INSTANCE> action);

    /// Do an action on the current [instance][CollectionHolderForTest]
    /// while expecting a [EmptyCollectionException] to be thrown
    /// and return itself afterward
    ///
    /// @param action The action to do
    @Contract(ALWAYS_THIS_1)
    @SuppressWarnings("Unchecked cast")
    INSTANCE executeWhileExpectingEmptyException(final Consumer<INSTANCE> action);

    /// Do an action on the current [instance][CollectionHolderForTest]
    /// and have the index being present on the returned [collection][CollectionHolder] on the action
    /// and return itself afterward
    ///
    /// @param <U>    The collection (to loop over) type
    /// @param action The action to do
    @Contract(ALWAYS_THIS_1)
    @SuppressWarnings("Unchecked cast")
    <U extends @Nullable Object> INSTANCE executeWhileHavingIndexesOnField(final Function<INSTANCE, ? extends CollectionHolder<? extends U>> action);

    /// Do an action on the current [instance][CollectionHolderForTest]
    /// and have the index being present on the returned [collection][CollectionHolder]
    /// after the action
    ///
    /// @param <U>    The collection (to loop over) type
    /// @param action The action to do
    @SuppressWarnings("Unchecked cast")
    <U extends @Nullable Object> CollectionHolder<U> executeToHaveIndexesOnField(final Function<INSTANCE, ? extends CollectionHolder<U>> action);

}
