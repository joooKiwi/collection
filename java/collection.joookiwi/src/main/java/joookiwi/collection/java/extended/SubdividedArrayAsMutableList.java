package joookiwi.collection.java.extended;

import java.util.List;

import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// An implementation of a subdivided-[List] similar to the [ArrayAsMutableList] in its behaviour.
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
///                    (generally a [ArrayAsImmutableList], [SubdividedArrayAsMutableList] or [ReversedArrayAsMutableList])
/// @see ArrayAsMutableList
/// @see ReversedArrayAsMutableList
@NotNullByDefault
public class SubdividedArrayAsMutableList<T extends @Nullable Object,
        SOURCE extends List<? super T>,
        SUB_ARRAY extends SubdividedMutableArray<T>>
        extends AbstractArrayAsMutableList<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUB_ARRAY __subArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubdividedArrayAsMutableList(final SOURCE source,
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

    @Override protected T[] _reference() { return _subArray().subdividedSource(); }

    @Override protected void _reference(final T[] value) { _subArray().subdividedSource(value); }

    //#endregion -------------------- Getter methods --------------------

}
