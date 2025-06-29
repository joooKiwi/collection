package joookiwi.collection.java.extended.iterator;

import java.util.function.Consumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A definition of an [ImmutableIterator] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableIterator
@NotNullByDefault
public abstract class AbstractArrayAsImmutableIterator<T extends @Nullable Object>
        implements ImmutableIterator<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableIterator() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The array to do calculation and retrieval
    protected abstract T[] _array();

    /// The size of the [reference][#_array]
    protected @Range(from = 0, to = MAX_INT_VALUE) int _size() { return _array().length; }

    /// The index where it is at
    protected abstract @Range(from = 0, to = MAX_INT_VALUE) int _currentIndex();

    /// Set the index located
    ///
    /// @param value The index to set
    @Contract(mutates = "this")
    protected abstract void _currentIndex(final @Range(from = 0, to = MAX_INT_VALUE) int value);

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    protected T _get(final int index) {
        final var size = _size();
        if (index > size)
            throw new NoElementFoundInCollectionException("The element retrieved was not existant in the array", new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ")."));
        return _array()[index];
    }

    @Override public boolean hasNext() { return _currentIndex() != _size(); }

    @Contract(mutates = "this")
    @Override public T next() {
        final var index = _currentIndex();
        var next = _get(index);
        _currentIndex(index + 1);
        return next;
    }

    @Contract(mutates = "this")
    @Override public void forEachRemaining(final Consumer<? super T> operation) {
        final var reference = _array();
        final var size = reference.length;
        var index = _currentIndex();
        while (++index < size)
            operation.accept(reference[index]);
        _currentIndex(index);
    }

    //#endregion -------------------- Methods --------------------

}
