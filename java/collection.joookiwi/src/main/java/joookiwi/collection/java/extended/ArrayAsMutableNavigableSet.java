package joookiwi.collection.java.extended;

import java.util.Comparator;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [java NavigableSet][java.util.NavigableSet]
/// with the mutability in place.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see SubdividedArrayAsMutableNavigableSet
/// @see ReversedArrayAsMutableNavigableSet
@NotNullByDefault
public class ArrayAsMutableNavigableSet<T extends @Nullable Object>
        extends AbstractArrayAsMutableNavigableSet<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;
    private final @Nullable Comparator<? super T> __comparator;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [MutableNavigableSet] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableNavigableSet() {
        super();
        __reference = emptyArray();
        __comparator = null;
    }

    /// Create an instance of a [MutableNavigableSet] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param comparator The [Comparator] to use on its comparisons
    /// @throws ClassCastException If the `comparator` was `null`, at least one value was not [Comparable]
    /// @see java.util.Collections#unmodifiableNavigableSet(java.util.NavigableSet) Collections.unmodifiableNavigableSet(NavigableSet&#60T&#62)
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableNavigableSet(final @Nullable Comparator<? super T> comparator) {
        super();
        __reference = emptyArray();
        __comparator = comparator;
    }

    /// Create an instance of a [MutableNavigableSet] from the `reference`
    /// using its natural ordering to compare its values
    ///
    /// @param reference The array to be the internal structure
    /// @throws RuntimeException   A duplicate value exists in the `reference`
    /// @throws RuntimeException   A value was not ordered in the `reference`
    /// @throws ClassCastException At least one value was not [Comparable]
    /// @see java.util.Collections#unmodifiableNavigableSet(java.util.NavigableSet) Collections.unmodifiableNavigableSet(NavigableSet&#60T&#62)
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableNavigableSet(final T[] reference) {
        super();
        _validateValues(reference);
        __reference = reference;
        __comparator = null;
    }

    /// Create an instance of a [MutableNavigableSet] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param reference  The array to be the internal structure
    /// @param comparator The [Comparator] to use on its comparisons
    /// @throws RuntimeException   A duplicate value exists in the `reference`
    /// @throws RuntimeException   A value was not ordered in the `reference`
    /// @throws ClassCastException If the `comparator` was `null`, at least one value was not [Comparable]
    /// @see java.util.Collections#unmodifiableNavigableSet(java.util.NavigableSet) Collections.unmodifiableNavigableSet(NavigableSet&#60T&#62)
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableNavigableSet(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        super();
        _validateValues(reference, comparator);
        __reference = reference;
        __comparator = comparator;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    @Contract(pure = true)
    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsMutableNavigableSet<T> clone() { return (ArrayAsMutableNavigableSet<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
