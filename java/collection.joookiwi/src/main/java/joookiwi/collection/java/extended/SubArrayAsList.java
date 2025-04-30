package joookiwi.collection.java.extended;

import java.util.List;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static java.lang.Integer.MAX_VALUE;

/// An implementation of a subdivided-[List] similar to the [ArrayAsList] in its behaviour.
/// During its creation, it <u>implies</u> that the [SUB_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>         The type
/// @param <SUB_ARRAY> The array that should contain the new reference
/// @param <SOURCE>    The original source of the instance
///                    (generally a [ArrayAsList], [SubArrayAsList] or [ReversedArrayAsList])
/// @see ArrayAsList
/// @see ReversedArrayAsList
@NotNullByDefault
public class SubArrayAsList<T extends @Nullable Object,
        SOURCE extends List<? super T>,
        SUB_ARRAY extends SubArray<? extends T>>
        extends AbstractArrayAsList<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUB_ARRAY __subArray;

    private boolean __isInitialized = false;
    private T @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubArrayAsList(final SOURCE source,
                          final SUB_ARRAY subArray) {
        super();
        __source = source;
        __subArray = subArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The source passed through the constructor
    protected SOURCE _source() { return __source; }

    /// The [SubArray] passed through the constructor
    protected SUB_ARRAY _subArray() { return __subArray; }

    /// The internal referenced generated from the [sub-array][#_subArray] [source][SubArray#subSource]
    protected T[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _subArray().subSource();
        __isInitialized = true;
        return reference;
    }


    @Override public @Range(from = 0, to = MAX_VALUE) int size() {
        if (__isInitialized)
            return __size;
        return __size = _reference().length;
    }

    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;
        return __isEmpty = size() == 0;
    }

    @Override public SubArrayAsList<T, SOURCE, SUB_ARRAY> clone() { return new SubArrayAsList<>(_source(), _subArray()); }

    //#endregion -------------------- Methods --------------------

}
