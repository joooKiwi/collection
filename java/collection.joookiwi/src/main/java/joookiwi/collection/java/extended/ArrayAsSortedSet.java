package joookiwi.collection.java.extended;

import java.util.Comparator;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A bare-bone implementation of a [java SortedSet][java.util.SortedSet]
/// with the [immutability][org.jetbrains.annotations.Unmodifiable] in place.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see SubArrayAsSortedSet
/// @see ReversedArrayAsSortedSet
@NotNullByDefault
public class ArrayAsSortedSet<T extends @Nullable Object>
        extends AbstractArrayAsSortedSet<T> {

    //#region -------------------- Fields --------------------

    private final T[] __reference;
    private final @Nullable Comparator<? super T> __comparator;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [java.util.SortedSet] from the `reference`
    /// using its natural ordering to compare its values
    ///
    /// @param reference The array to be the internal structure
    /// @throws RuntimeException   A duplicate value exists in the `reference`
    /// @throws RuntimeException   A value was not ordered in the `reference`
    /// @throws ClassCastException At least one value was not [Comparable]
    /// @see java.util.Collections#unmodifiableSortedSet(java.util.SortedSet) Collections.unmodifiableSortedSet(SortedSet&#60T&#62)
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsSortedSet(final T[] reference) {
        super();
        _validateValues(reference);
        __comparator = null;
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        _hashCode = 0; }

    /// Create an instance of a [java.util.SortedSet] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param reference  The array to be the internal structure
    /// @param comparator The [Comparator] to use on its comparisons
    /// @throws RuntimeException   A duplicate value exists in the `reference`
    /// @throws RuntimeException   A value was not ordered in the `reference`
    /// @throws ClassCastException If the `comparator` was `null`, at least one value was not [Comparable]
    /// @see java.util.Collections#unmodifiableSortedSet(java.util.SortedSet) Collections.unmodifiableSortedSet(SortedSet&#60T&#62)
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsSortedSet(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        super();
        _validateValues(reference, comparator);
        __comparator = comparator;
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

    @Contract(pure = true)
    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    @Override public ArrayAsSortedSet<T> clone() { return new ArrayAsSortedSet<>(_reference().clone(), comparator()); }

    //#endregion -------------------- Methods --------------------

}
