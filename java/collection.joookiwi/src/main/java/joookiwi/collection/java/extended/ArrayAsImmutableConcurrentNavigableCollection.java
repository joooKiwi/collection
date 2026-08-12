package joookiwi.collection.java.extended;

import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A bare-bone implementation of an [ImmutableConcurrentNavigableCollection].
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see ReversedArrayAsImmutableConcurrentNavigableCollection
@NotNullByDefault
public class ArrayAsImmutableConcurrentNavigableCollection<T extends @Nullable Object>
        extends AbstractArrayAsImmutableConcurrentNavigableCollection<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;
    private final @Nullable Comparator<? super T> __comparator;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of an [ImmutableConcurrentNavigableCollection] from the `reference`
    /// using its natural ordering to compare its values
    ///
    /// @param reference The array to be the internal structure
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsImmutableConcurrentNavigableCollection(final T[] reference) {
        super();
        __comparator = null;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    /// Create an instance of an [ImmutableConcurrentNavigableCollection] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param reference The array to be the internal structure
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsImmutableConcurrentNavigableCollection(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        super();
        __comparator = comparator;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    @Contract(pure = true)
    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsImmutableConcurrentNavigableCollection<T> clone() { return (ArrayAsImmutableConcurrentNavigableCollection<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
