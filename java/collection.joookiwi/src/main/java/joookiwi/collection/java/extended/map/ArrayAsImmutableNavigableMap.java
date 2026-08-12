package joookiwi.collection.java.extended.map;

import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public class ArrayAsImmutableNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableNavigableMap<K, V> {

    //#region -------------------- Fields --------------------

    private final joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] __reference;
    private final @Nullable Comparator<? super K> __comparator;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ArrayAsImmutableNavigableMap(joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] reference) {
        __comparator = null;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    public ArrayAsImmutableNavigableMap(joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] reference, final @Nullable Comparator<? super K> comparator) {
        __comparator = comparator;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected joookiwi.collection.java.entry.Entry<? extends K, ? extends V>[] _reference() { return __reference; }

    public @Nullable Comparator<? super K> comparator() { return __comparator; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    //#endregion -------------------- Getter methods --------------------

}
