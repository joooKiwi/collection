package joookiwi.collection.java.extended.iterator;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A definition of an immutable [java.util.ListIterator] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableListIterator
@NotNullByDefault
public abstract class AbstractArrayAsImmutableListIterator<T extends @Nullable Object>
        extends AbstractArrayAsImmutableIterator<T>
        implements ImmutableListIterator<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableListIterator() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int nextIndex() { return _currentIndex(); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int previousIndex() { return _currentIndex() - 1; }
    @Override public boolean hasPrevious() { return _currentIndex() != 0; }

    @Contract(mutates = "this")
    @Override public T previous() {
        final var newIndex = _currentIndex() - 1;
        _currentIndex(newIndex);
        return _get(newIndex);
    }

    //#endregion -------------------- Methods --------------------

}
