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
    private final @Range(from = 0, to = MAX_INT_VALUE) int __size;
    private @Range(from = 0, to = MAX_INT_VALUE) int __currentIndex;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ReversedArrayAsImmutableIterator(final REVERSED_ARRAY reference, final @Range(from = 0, to = MAX_INT_VALUE) int currentIndex) {
        super();
        __size = (this.__reference = reference).source().length;
        __currentIndex = currentIndex;
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
    protected @Range(from = 0, to = MAX_INT_VALUE) int _currentIndex() { return __currentIndex; }

    @Contract(mutates = "this")
    protected void _currentIndex(final @Range(from = 0, to = MAX_INT_VALUE) int value) { __currentIndex = value; }

    //#endregion -------------------- Getter/setter methods --------------------

}
