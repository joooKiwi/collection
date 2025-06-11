package joookiwi.collection.java.extended.iterator;

import java.util.ListIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A definition of an immutable [java.util.ListIterator] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableListIterator
@NotNullByDefault
public abstract class AbstractArrayAsImmutableListIterator<T extends @Nullable Object>
        extends AbstractArrayAsImmutableIterator<T>
        implements ListIterator<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableListIterator() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int nextIndex() { return _currentIndex(); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int previousIndex() { return _currentIndex() - 1; }
    @Override public boolean hasPrevious() { return _currentIndex() != 0; }

    @Contract(mutates = "this")
    @Override public T previous() {
        final var newIndex = _currentIndex() - 1;
        _currentIndex(newIndex);
        return _get(newIndex);
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    @Contract(ALWAYS_FAIL_1)
    @Override public void set(final T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable ListIterator."); }

    @Contract(ALWAYS_FAIL_1)
    @Override public void add(final T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ListIterator."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
