package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A bare-bone implementation of a [java SequencedSet][java.util.SequencedSet]
/// with the [immutability][org.jetbrains.annotations.Unmodifiable] in place.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see ReversedArrayAsSequencedSet
@NotNullByDefault
public class ArrayAsSequencedSet<T extends @Nullable Object>
        extends AbstractArrayAsSequencedSet<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance of a [java.util.SequencedSet] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    /// @throws RuntimeException A duplicate value exists in the `reference`
    /// @see java.util.Collections#unmodifiableSequencedSet(java.util.SequencedSet) Collections.unmodifiableSequencedSet(SequencedSet&#60T&#62)
    public ArrayAsSequencedSet(final T[] reference) {
        super();
        _validateValues(reference);
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The internal reference passed through the constructor
    @Override protected T[] _reference() { return __reference; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    @Override public ArrayAsSequencedSet<T> clone() { return new ArrayAsSequencedSet<>(_reference().clone()); }

    //#endregion -------------------- Methods --------------------

}
