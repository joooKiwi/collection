package joookiwi.collection.java.extended.iterator;

import java.util.ListIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A [ListIterator] adaptation to the [immutable][org.jetbrains.annotations.Unmodifiable] behaviour.
///
/// @param <T> The type
@NotNullByDefault
public class ArrayAsImmutableListIterator<T extends @Nullable Object>
        extends AbstractArrayAsImmutableListIterator<T> {

    //#region -------------------- Fields --------------------

    /// The starting index that the [ListIterator] will start at
    protected static final int INITIAL_CURRENT_INDEX = 0;

    private final T[] __reference;
    private final @Range(from = 0, to = MAX_INT_VALUE) int __size;
    private @Range(from = 0, to = MAX_INT_VALUE) int __currentIndex;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ArrayAsImmutableListIterator(final T[] reference, final @Range(from = 0, to = MAX_INT_VALUE) int currentIndex) {
        super();
        __size = (__reference = reference).length;
        __currentIndex = currentIndex;}

    public ArrayAsImmutableListIterator(final T[] reference) { this(reference, INITIAL_CURRENT_INDEX); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter / setter methods --------------------

    @Contract(pure = true)
    protected @Override T[] _array() { return _reference(); }

    /// The array passed through the constructor
    @Contract(pure = true)
    protected T[] _reference() { return __reference; }

    @Contract(pure = true)
    protected @Override @Range(from = 0, to = MAX_INT_VALUE) int _size() { return __size; }

    @Contract(pure = true)
    protected @Override @Range(from = 0, to = MAX_INT_VALUE) int _currentIndex() { return __currentIndex; }

    @Contract(mutates = "this")
    protected @Override void _currentIndex(final @Range(from = 0, to = MAX_INT_VALUE) int value) { __currentIndex = value; }

    //#endregion -------------------- Getter / setter methods --------------------

}
