package joookiwi.collection.java.extended;

import java.util.Comparator;
import java.util.SortedSet;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a reversed-order [SortedSet] similar to the [ArrayAsSortedSet] in its behaviour.
/// During its creation, it <u>implies</u> that the [REVERSED_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>               The type
/// @param <SOURCE>          The original source of the instance
///                          (generally a [ArrayAsSortedSet], [SubArrayAsSortedSet] or [ReversedArrayAsSortedSet])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsSortedSet
/// @see SubArrayAsSortedSet
@NotNullByDefault
public class ReversedArrayAsSortedSet<T extends @Nullable Object,
        SOURCE extends SortedSet<? super T>,
        REVERSED_ARRAY extends ReversedArray<? extends T>>
        extends AbstractArrayAsSortedSet<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    private boolean __isInitialized = false;
    private T @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsSortedSet(final SOURCE source,
                                    final REVERSED_ARRAY reversedArray) {
        super();
        __source = source;
        __reversedArray = reversedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The source passed through the constructor
    protected SOURCE _source() { return __source; }

    /// The [ReversedArray] passed through the constructor
    protected REVERSED_ARRAY _reversedArray() { return __reversedArray; }

    /// The internal referenced generated from the [reversed-array][#_reversedArray] [source][ReversedArray#reversedSource]
    protected T[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _reversedArray().reversedSource();
        __isInitialized = true;
        return reference;
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() {
        if (__isInitialized)
            return __size;
        return __size = _reference().length;
    }

    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;
        return __isEmpty = size() == 0;
    }

    @Override public @Nullable Comparator<? super T> comparator() { return _source().comparator(); }

    @Override public ReversedArrayAsSortedSet<T, SOURCE, REVERSED_ARRAY> clone() { return new ReversedArrayAsSortedSet<>(_source(), _reversedArray()); }

    //#endregion -------------------- Methods --------------------

}
