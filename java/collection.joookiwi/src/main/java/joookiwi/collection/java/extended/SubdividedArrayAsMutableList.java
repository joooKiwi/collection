package joookiwi.collection.java.extended;

import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a subdivided-[MutableList] similar to the [ArrayAsMutableList] in its behaviour.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>                The type
/// @param <SOURCE>           The original source of the instance
///                           (generally a [ArrayAsImmutableList], [SubdividedArrayAsMutableList] or [ReversedArrayAsMutableList])
/// @param <SUBDIVIDED_ARRAY> The array that should contain the new reference
/// @see ArrayAsMutableList
/// @see ReversedArrayAsMutableList
@Experimental
@NotNullByDefault
public class SubdividedArrayAsMutableList<T extends @Nullable Object,
        SOURCE extends MutableList<? super T>,
        SUBDIVIDED_ARRAY extends SubdividedMutableArray<T>>
        extends AbstractArrayAsMutableList<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUBDIVIDED_ARRAY __subdividedArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubdividedArrayAsMutableList(final SOURCE source,
                                        final SUBDIVIDED_ARRAY subdividedArray) {
        super();
        __source = source;
        __subdividedArray = subdividedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [SubdividedArray] passed through the constructor
    @Contract(pure = true)
    protected SUBDIVIDED_ARRAY _subdividedArray() { return __subdividedArray; }

    @Override protected T[] _reference() { return _subdividedArray().subdividedSource(); }

    @Contract(mutates = "this")
    @Override protected void _reference(final T @Unmodifiable [] value) { _subdividedArray().subdividedSource(value); }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return _subdividedArray().source().length; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public SubdividedArrayAsMutableList<T, SOURCE, SUBDIVIDED_ARRAY> clone() { return (SubdividedArrayAsMutableList<T, SOURCE, SUBDIVIDED_ARRAY>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
