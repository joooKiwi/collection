package joookiwi.collection.java.extended.set;

import joookiwi.collection.java.extended.ReversedMutableArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Comparator;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An implementation of a reversed-order [MutableConcurrentNavigableSet] similar to the [ArrayAsMutableConcurrentNavigableSet] in its behaviour.
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
///                          (generally a [ArrayAsMutableConcurrentNavigableSet], [SubdividedArrayAsMutableConcurrentNavigableSet] or [ReversedArrayAsMutableConcurrentNavigableSet])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsMutableConcurrentNavigableSet
/// @see SubdividedArrayAsMutableConcurrentNavigableSet
@NotNullByDefault
public class ReversedArrayAsMutableConcurrentNavigableSet<T extends @Nullable Object,
        SOURCE extends MutableConcurrentNavigableSet<? super T>,
        REVERSED_ARRAY extends ReversedMutableArray<T>>
        extends AbstractArrayAsMutableConcurrentNavigableSet<T> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsMutableConcurrentNavigableSet(final SOURCE source,
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

    @Override public @Nullable Comparator<? super T> comparator() { return _source().comparator(); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ReversedArrayAsMutableConcurrentNavigableSet<T, SOURCE, REVERSED_ARRAY> clone() { return (ReversedArrayAsMutableConcurrentNavigableSet<T, SOURCE, REVERSED_ARRAY>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
