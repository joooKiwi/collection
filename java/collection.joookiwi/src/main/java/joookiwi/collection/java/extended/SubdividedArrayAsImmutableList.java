package joookiwi.collection.java.extended;

import java.util.List;

import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a subdivided-[List] similar to the [ArrayAsImmutableList] in its behaviour.
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
///                    (generally a [ArrayAsImmutableList], [SubdividedArrayAsImmutableList] or [ReversedArrayAsImmutableList])
/// @see ArrayAsImmutableList
/// @see ReversedArrayAsImmutableList
@NotNullByDefault
public class SubdividedArrayAsImmutableList<T extends @Nullable Object,
        SOURCE extends List<? super T>,
        SUB_ARRAY extends SubdividedArray<? extends T>>
        extends AbstractArrayAsImmutableList<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUB_ARRAY __subArray;

    private boolean __isInitialized = false;
    private T @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubdividedArrayAsImmutableList(final SOURCE source,
                                          final SUB_ARRAY subArray) {
        super();
        __source = source;
        __subArray = subArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [SubdividedArray] passed through the constructor
    @Contract(pure = true)
    protected SUB_ARRAY _subArray() { return __subArray; }

    /// The internal referenced generated from the [sub-array][#_subArray] [source][SubdividedArray#subSource]
    @InitializedOnFirstCall
    @Override protected T[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _subArray().subSource();
        __isInitialized = true;
        return reference;
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @InitializedOnFirstCall
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() {
        if (__isInitialized)
            return __size;
        return __size = _reference().length;
    }

    @InitializedOnFirstCall
    @Contract(pure = true)
    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;
        return __isEmpty = size() == 0;
    }


    @Contract(ALWAYS_NEW_0)
    @Override public SubdividedArrayAsImmutableList<T, SOURCE, SUB_ARRAY> clone() { return new SubdividedArrayAsImmutableList<>(_source(), _subArray()); }

    //#endregion -------------------- Methods --------------------

}
