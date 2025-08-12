package joookiwi.collection.java.extended.iterator;

import joookiwi.collection.java.extended.UtilityForMutableArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public abstract class AbstractArrayAsMutableListIterator<T extends @Nullable Object>
        extends AbstractArrayAsMutableIterator<T>
        implements MutableListIterator<T> {

    //#region -------------------- Fields --------------------

    private boolean __nextOrPreviousHasBeenCalled = false;
    private boolean __removeHasBeenCalled = false;
    private boolean __addHasBeenCalled = false;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableListIterator() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int nextIndex() { return _currentIndex(); }

    @Contract(mutates = "this")
    @Override public T next() {
        final var index = _currentIndex();
        var next = _get(index);
        _currentIndex(index + 1);
        __nextOrPreviousHasBeenCalled = true;
        __removeHasBeenCalled = false;
        __addHasBeenCalled = false;
        return next;
    }


    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int previousIndex() { return _currentIndex() - 1; }

    @Override public boolean hasPrevious() { return _currentIndex() != 0; }

    @Contract(mutates = "this")
    @Override public T previous() {
        final var newIndex = _currentIndex() - 1;
        _currentIndex(newIndex);
        __nextOrPreviousHasBeenCalled = true;
        __removeHasBeenCalled = false;
        __addHasBeenCalled = false;
        return _get(newIndex);
    }


    @Contract(mutates = "this")
    @Override public void remove() {
        if (!__nextOrPreviousHasBeenCalled)
            throw new IllegalStateException("The “previous” or “next” method has not been called yet.");
        if (__removeHasBeenCalled)
            throw new IllegalStateException("The “remove” method has already been called once.");
        __removeHasBeenCalled = true;
        _array(UtilityForMutableArray.removeAt(_array(), _currentIndex()));
    }

    @Contract(mutates = "this")
    @Override public void set(final T value) {
        if (!__nextOrPreviousHasBeenCalled)
            throw new IllegalStateException("The “previous” or “next” method has not been called yet.");
        if (__removeHasBeenCalled)
            throw new IllegalStateException("The “remove” method has been called before the “set” method.");
        if (__addHasBeenCalled)
            throw new IllegalStateException("The “add” method has been called after the “previous” or “next” method and before the “set” method.");
        UtilityForMutableArray.set(this._array(), _currentIndex(), value);
    }

    @Contract(mutates = "this")
    @Override public void add(final T value) {
        __addHasBeenCalled = true;
        _array(UtilityForMutableArray.add(this._array(), _currentIndex(), value));
    }

    //#endregion -------------------- Methods --------------------

}
