package joookiwi.collection.java.extended;

import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [java SequencedSet][java.util.SortedSet]
/// with the mutability in place.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see SubdividedArrayAsMutableSortedSet
/// @see ReversedArrayAsMutableSortedSet
@NotNullByDefault
public class ArrayAsMutableSortedSet<T extends @Nullable Object>
        extends AbstractArrayAsMutableSortedSet<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;
    private final @Nullable Comparator<? super T> __comparator;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [MutableSortedSet] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableSortedSet() {
        super();
        __reference = emptyArray();
        __comparator = null;
    }

    /// Create an instance of a [MutableSortedSet] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param comparator The [Comparator] to use on its comparisons
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableSortedSet(final @Nullable Comparator<? super T> comparator) {
        super();
        __reference = emptyArray();
        __comparator = comparator;
    }

    /// Create an instance of a [MutableSortedSet] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    /// @throws RuntimeException A duplicate value exists in the `reference`
    /// @throws RuntimeException   A value was not ordered in the `reference`
    /// @throws ClassCastException At least one value was not [Comparable]
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableSortedSet(final T[] reference) {
        super();
        _validateValues(reference);
        __reference = reference;
        __comparator = null;
    }

    /// Create an instance of a [MutableSortedSet] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param reference  The array to be the internal structure
    /// @param comparator The [Comparator] to use on its comparisons
    /// @throws RuntimeException   A duplicate value exists in the `reference`
    /// @throws RuntimeException   A value was not ordered in the `reference`
    /// @throws ClassCastException If the `comparator` was `null`, at least one value was not [Comparable]
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableSortedSet(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        super();
        _validateValues(reference, comparator);
        __reference = reference;
        __comparator = comparator;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The changeable internal reference passed through the constructor or mutated from its setter
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    @Contract(pure = true)
    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsMutableSortedSet<T> clone() { return (ArrayAsMutableSortedSet<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
