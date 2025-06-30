package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A bare-bone implementation of a [java Collection][java.util.Collection]
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
@NotNullByDefault
public class ArrayAsImmutableCollection<T extends @Nullable Object>
        extends AbstractArrayAsImmutableCollection<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance of a [java.util.Collection] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    /// @see java.util.Collections#unmodifiableCollection(java.util.Collection) Collections.unmodifiableCollection(Collection&#60T&#62)
    public ArrayAsImmutableCollection(final T[] reference) {
        super();
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Override public ArrayAsImmutableCollection<T> clone() { return (ArrayAsImmutableCollection<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
