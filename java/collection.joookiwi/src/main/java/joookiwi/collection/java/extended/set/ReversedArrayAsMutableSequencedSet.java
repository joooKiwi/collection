package joookiwi.collection.java.extended.set;

import joookiwi.collection.java.extended.ReversedMutableArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An implementation of a reversed-order [MutableSequencedSet] similar to the [ArrayAsMutableSequencedSet] in its behaviour.
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
///                          (generally a [ArrayAsMutableSequencedSet] or [ReversedArrayAsMutableSequencedSet])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsMutableSequencedSet
@NotNullByDefault
public class ReversedArrayAsMutableSequencedSet<T extends @Nullable Object,
        SOURCE extends MutableSequencedSet<? super T>,
        REVERSED_ARRAY extends ReversedMutableArray<T>>
        extends AbstractArrayAsMutableSequencedSet<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsMutableSequencedSet(final SOURCE source,
                                              final REVERSED_ARRAY reversedArray) {
        __source = source;
        __reversedArray = reversedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [ReversedMutableArray] passed through the constructor
    @Contract(pure = true)
    protected REVERSED_ARRAY _reversedArray() { return __reversedArray; }

    /// The internal referenced given from the [reversed-array][#_reversedArray] [source][ReversedMutableArray#reversedSource()]
    @Contract(ALWAYS_NEW_0)
    @Override protected T[] _reference() { return _reversedArray().reversedSource(); }

    /// Change the internal reference in the [reversed-array][#_reversedArray] [source][ReversedMutableArray#reversedSource(Object\[\])]
    ///
    /// @param value The value to reverse and put in replacement on internal reference
    @Override protected void _reference(final T @Unmodifiable [] value) { _reversedArray().reversedSource(value); }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ReversedArrayAsMutableSequencedSet<T, SOURCE, REVERSED_ARRAY> clone() { return (ReversedArrayAsMutableSequencedSet<T, SOURCE, REVERSED_ARRAY>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
