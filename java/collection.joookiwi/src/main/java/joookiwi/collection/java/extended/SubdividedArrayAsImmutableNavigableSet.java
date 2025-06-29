package joookiwi.collection.java.extended;

import java.util.Comparator;
import java.util.NavigableSet;

import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a subdivided-[NavigableSet] similar to the [ArrayAsImmutableNavigableSet] in its behaviour.
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
/// @param <SOURCE>    The original source of the instance
///                    (generally a [ArrayAsImmutableNavigableSet], [SubdividedArrayAsImmutableNavigableSet] or [ReversedArrayAsImmutableNavigableSet])
/// @param <SUB_ARRAY> The array that should contain the new reference
/// @see ArrayAsImmutableNavigableSet
/// @see ReversedArrayAsImmutableNavigableSet
@NotNullByDefault
public class SubdividedArrayAsImmutableNavigableSet<T extends @Nullable Object,
        SOURCE extends NavigableSet<? super T>,
        SUB_ARRAY extends SubdividedArray<? extends T>>
        extends AbstractArrayAsImmutableNavigableSet<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUB_ARRAY __subArray;

    private boolean __isInitialized = false;
    private T @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubdividedArrayAsImmutableNavigableSet(final SOURCE source,
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

    /// The internal referenced generated from the [subdivided-array][#_subArray] [source][SubdividedArray#subdividedSource]
    @InitializedOnFirstCall
    @Override protected T[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _subArray().subdividedSource();
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

    @Contract(pure = true)
    @InitializedOnFirstCall
    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;
        return __isEmpty = size() == 0;
    }


    @Override public @Nullable Comparator<? super T> comparator() { return _source().comparator(); }

    @Contract(ALWAYS_NEW_0)
    @Override public SubdividedArrayAsImmutableNavigableSet<T, SOURCE, SUB_ARRAY> clone() { return new SubdividedArrayAsImmutableNavigableSet<>(_source(), _subArray()); }

    //#endregion -------------------- Methods --------------------

}
