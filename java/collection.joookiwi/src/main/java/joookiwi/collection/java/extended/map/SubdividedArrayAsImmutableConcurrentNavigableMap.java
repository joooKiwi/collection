package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.annotation.InitializedOnFirstCall;
import joookiwi.collection.java.entry.Entry;
import joookiwi.collection.java.extended.SubdividedArray;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Comparator;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An implementation of a subdivided-[ImmutableConcurrentNavigableMap] similar to the [ArrayAsImmutableConcurrentNavigableMap] in its behaviour.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <K>                The key type
/// @param <V>                The value type
/// @param <SOURCE>           The original source of the instance
///                           (generally a [ArrayAsImmutableConcurrentNavigableMap], [SubdividedArrayAsImmutableConcurrentNavigableMap] or [ReversedArrayAsImmutableConcurrentNavigableMap])
/// @param <SUBDIVIDED_ARRAY> The array that should contain the new reference
/// @see ArrayAsImmutableConcurrentNavigableMap
/// @see ReversedArrayAsImmutableConcurrentNavigableMap
@NotNullByDefault
public class SubdividedArrayAsImmutableConcurrentNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object,
        SOURCE extends ImmutableConcurrentNavigableMap<? super K, ? super V>,
        SUBDIVIDED_ARRAY extends SubdividedArray<Entry<? extends K, ? extends V>>>
        extends AbstractArrayAsImmutableConcurrentNavigableMap<K, V> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final SUBDIVIDED_ARRAY __subdividedArray;

    private boolean __isInitialized = false;
    private joookiwi.collection.java.entry.Entry<? extends K, ? extends V> @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubdividedArrayAsImmutableConcurrentNavigableMap(final SOURCE source,
                                                            final SUBDIVIDED_ARRAY subdividedArray) {
        super();
        __source = source;
        __subdividedArray = subdividedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The source passed through the constructor
    @Contract(pure = true)
    protected SOURCE _source() { return __source; }

    /// The [SubdividedArray] passed through the constructor
    @Contract(pure = true)
    protected SUBDIVIDED_ARRAY _subdividedArray() { return __subdividedArray; }

    /// The internal referenced generated from the [subdivided-array][#_subdividedArray] [source][SubdividedArray#subdividedSource]
    @InitializedOnFirstCall
    @Override protected joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _subdividedArray().subdividedSource();
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


    @Override public @Nullable Comparator<? super K> comparator() { return _source().comparator(); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public SubdividedArrayAsImmutableConcurrentNavigableMap<K, V, SOURCE, SUBDIVIDED_ARRAY> clone() { return (SubdividedArrayAsImmutableConcurrentNavigableMap<K, V, SOURCE, SUBDIVIDED_ARRAY>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
