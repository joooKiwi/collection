package joookiwi.collection.java.extended.iterator;

import joookiwi.collection.java.extended.UtilityForMutableArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Iterator;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public class ArrayAsMutableIterator<T extends @Nullable Object>
        extends AbstractArrayAsMutableIterator<T> {

    //#region -------------------- Fields --------------------

    /// The starting index that the [MutableIterator] will start at
    protected static final int INITIAL_CURRENT_INDEX = 0;

    private T[] __reference;
    private @Range(from = 0, to = MAX_INT_VALUE) int __currentIndex;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ArrayAsMutableIterator(final T[] reference, final int currentIndex) {
        super();
        __reference = reference;
        __currentIndex = currentIndex;
    }

    public ArrayAsMutableIterator(final T[] reference) { this(reference, INITIAL_CURRENT_INDEX); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter / setter methods --------------------

    @Contract(pure = true)
    @Override protected T[] _array() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _array(final T[] value) { __reference = value; }

    @Override protected @Range(from = 0, to = MAX_INT_VALUE) int _size() { return _array().length; }

    @Contract(pure = true)
    protected @Override @Range(from = 0, to = MAX_INT_VALUE) int _currentIndex() { return __currentIndex; }

    @Contract(mutates = "this")
    protected @Override void _currentIndex(final @Range(from = 0, to = MAX_INT_VALUE) int value) { __currentIndex = value; }

    //#endregion -------------------- Getter / setter methods --------------------

}
