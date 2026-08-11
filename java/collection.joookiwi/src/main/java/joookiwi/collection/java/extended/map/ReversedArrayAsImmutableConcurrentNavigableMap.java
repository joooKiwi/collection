package joookiwi.collection.java.extended.map;

import java.util.Comparator;
import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import joookiwi.collection.java.entry.Entry;
import joookiwi.collection.java.extended.ReversedArray;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a reversed-order [ImmutableConcurrentNavigableMap] similar to the [ArrayAsImmutableConcurrentNavigableMap] in its behaviour.
/// During its creation, it <u>implies</u> that the [REVERSED_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <K>               The key type
/// @param <V>               The value type
/// @param <SOURCE>          The original source of the instance
///                          (generally a [ArrayAsImmutableConcurrentNavigableMap], [SubdividedArrayAsImmutableConcurrentNavigableMap] or [ReversedArrayAsImmutableConcurrentNavigableMap])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsImmutableConcurrentNavigableMap
/// @see SubdividedArrayAsImmutableNavigableMap
@NotNullByDefault
public class ReversedArrayAsImmutableConcurrentNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object,
        SOURCE extends ImmutableConcurrentNavigableMap<K, V>,
        REVERSED_ARRAY extends ReversedArray<? extends Entry<? extends K, ? extends V>>>
        extends AbstractArrayAsImmutableConcurrentNavigableMap<K, V> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    private boolean __isInitialized = false;
    private joookiwi.collection.java.entry.Entry<? extends K, ? extends V> @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsImmutableConcurrentNavigableMap(final SOURCE source,
                                                          final REVERSED_ARRAY reversedArray) {
        __source = source;
        __reversedArray = reversedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [ReversedArray] passed through the constructor
    @Contract(pure = true)
    protected REVERSED_ARRAY _reversedArray() { return __reversedArray; }

    /// The internal referenced generated from the [reversed-array][#_reversedArray] [source][ReversedArray#reversedSource]
    @InitializedOnFirstCall
    @Override protected joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _reversedArray().reversedSource();
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


    @Override public SOURCE reversed() { return _source(); }


    @Override public @Nullable Comparator<? super K> comparator() { return _source().comparator(); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ReversedArrayAsImmutableConcurrentNavigableMap<K, V, SOURCE, REVERSED_ARRAY> clone() { return (ReversedArrayAsImmutableConcurrentNavigableMap<K, V, SOURCE, REVERSED_ARRAY>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
