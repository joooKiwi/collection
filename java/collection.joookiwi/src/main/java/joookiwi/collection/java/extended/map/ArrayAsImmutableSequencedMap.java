package joookiwi.collection.java.extended.map;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public class ArrayAsImmutableSequencedMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableSequencedMap<K, V> {

    //#region -------------------- Fields --------------------

    private final joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] __reference;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ArrayAsImmutableSequencedMap(joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] reference) {
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] _reference() { return __reference; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    //#endregion -------------------- Getter methods --------------------

}
