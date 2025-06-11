package joookiwi.collection.java.extended.iterator;

import joookiwi.collection.java.extended.ReversedArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public class ReversedArrayAsImmutableIterator<T extends @Nullable Object,
        REVERSED_ARRAY extends ReversedArray<? extends T>>
        extends AbstractArrayAsImmutableIterator<T> {

    //#region -------------------- Fields --------------------

    private final REVERSED_ARRAY __reference;
    private final int __size;
    private int __cursor;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ReversedArrayAsImmutableIterator(final REVERSED_ARRAY reference, int cursor) {
        super();
        __size = (this.__reference = reference).source().length;
        __cursor = cursor;
    }

    public ReversedArrayAsImmutableIterator(final REVERSED_ARRAY reference) { this(reference, 0); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter/setter methods --------------------

    @Override protected T[] _array() { return _reference().reversedSource(); }

    /// The [ReversedArray] passed through the constructor
    @Contract(pure = true)
    protected REVERSED_ARRAY _reference() { return __reference; }

    @Contract(pure = true)
    @Override protected @Range(from = 0, to = MAX_INT_VALUE) int _size() { return __size; }

    @Contract(pure = true)
    protected int _currentIndex() { return __cursor; }

    @Contract(mutates = "this")
    protected void _currentIndex(final int value) { __cursor = value; }

    //#endregion -------------------- Getter/setter methods --------------------

}
