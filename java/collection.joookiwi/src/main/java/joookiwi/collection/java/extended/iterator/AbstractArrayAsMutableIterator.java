package joookiwi.collection.java.extended.iterator;

import java.util.function.Consumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.extended.UtilityForMutableArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A definition of a [MutableIterator] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsMutableIterator
@NotNullByDefault
public abstract class AbstractArrayAsMutableIterator<T extends @Nullable Object>
        implements MutableIterator<T> {

    //#region -------------------- Fields --------------------

    private boolean __nextHasBeenCalled = false;
    private boolean __removeHasBeenCalled = false;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableIterator() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The array to do calculation and retrieval
    protected abstract T[] _array();

    @Contract(mutates = "this")
    protected abstract void _array(final T[] value);

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
        __nextHasBeenCalled = true;
        __removeHasBeenCalled = false;
        return next;
    }

    @Contract(mutates = "this")
    @Override public void remove() {
        if (!__nextHasBeenCalled)
            throw new IllegalStateException("The “next” method has not been called yet.");
        if (__removeHasBeenCalled)
            throw new IllegalStateException("The “remove” method has already been called once.");
        __removeHasBeenCalled = true;
        _array(UtilityForMutableArray.removeAt(_array(), _currentIndex()));
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
