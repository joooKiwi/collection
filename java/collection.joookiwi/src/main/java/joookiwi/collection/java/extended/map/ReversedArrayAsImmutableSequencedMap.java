package joookiwi.collection.java.extended.map;

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

@NotNullByDefault
public class ReversedArrayAsImmutableSequencedMap<K extends @Nullable Object,
        V extends @Nullable Object,
        SOURCE extends ImmutableSequencedMap<K, V>,
        REVERSED_ARRAY extends ReversedArray<Entry<K, V>>>
        extends AbstractArrayAsImmutableSequencedMap<K, V> {

    //#region -------------------- Fields --------------------

    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    private boolean __isInitialized = false;
    private joookiwi.collection.java.entry.Entry<K, V> @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsImmutableSequencedMap(final SOURCE source,
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
    @Override protected joookiwi.collection.java.entry.Entry<K, V>[] _reference() {
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

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ReversedArrayAsImmutableSequencedMap<K, V, SOURCE, REVERSED_ARRAY> clone() { return (ReversedArrayAsImmutableSequencedMap<K, V, SOURCE, REVERSED_ARRAY>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
