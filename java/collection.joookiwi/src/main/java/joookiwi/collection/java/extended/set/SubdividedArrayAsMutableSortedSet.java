package joookiwi.collection.java.extended.set;

import java.util.Comparator;

import joookiwi.collection.java.extended.SubdividedArray;
import joookiwi.collection.java.extended.SubdividedMutableArray;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a subdivided-[MutableSortedSet] similar to the [ArrayAsMutableSortedSet] in its behaviour.
/// During its creation, it <u>implies</u> that the [SUBDIVIDED_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>         The type
/// @param <SUBDIVIDED_ARRAY> The array that should contain the new reference
/// @param <SOURCE>    The original source of the instance
///                    (generally a [ArrayAsMutableSortedSet], [SubdividedArrayAsMutableSortedSet] or [ReversedArrayAsMutableSortedSet])
/// @see ArrayAsMutableSortedSet
/// @see ReversedArrayAsMutableSortedSet
@NotNullByDefault
public class SubdividedArrayAsMutableSortedSet<T extends @Nullable Object,
        SOURCE extends MutableSortedSet<? super T>,
        SUBDIVIDED_ARRAY extends SubdividedMutableArray<T>>
        extends AbstractArrayAsMutableSortedSet<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUBDIVIDED_ARRAY __subdividedArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubdividedArrayAsMutableSortedSet(final SOURCE source,
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

    //#region -------------------- Comparator methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return _source().comparator(); }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return _subdividedArray().source().length; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public SubdividedArrayAsMutableSortedSet<T, SOURCE, SUBDIVIDED_ARRAY> clone() { return (SubdividedArrayAsMutableSortedSet<T, SOURCE, SUBDIVIDED_ARRAY>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
