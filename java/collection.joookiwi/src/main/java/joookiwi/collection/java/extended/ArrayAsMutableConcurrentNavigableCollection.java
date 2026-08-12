package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [MutableConcurrentNavigableCollection].
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
/// @see ReversedArrayAsMutableConcurrentNavigableCollection
@NotNullByDefault
public class ArrayAsMutableConcurrentNavigableCollection<T extends @Nullable Object>
        extends AbstractArrayAsMutableConcurrentNavigableCollection<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;
    private final @Nullable Comparator<? super T> __comparator;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [MutableConcurrentNavigableCollection] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableConcurrentNavigableCollection() {
        super();
        __reference = emptyArray();
        __comparator = null;
    }

    /// Create an instance of a [MutableConcurrentNavigableCollection] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param comparator The [Comparator] to use on its comparisons
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableConcurrentNavigableCollection(final @Nullable Comparator<? super T> comparator) {
        super();
        __reference = emptyArray();
        __comparator = comparator;
    }

    /// Create an instance of an [MutableConcurrentNavigableCollection] from the `reference`
    /// using its natural ordering to compare its values
    ///
    /// @param reference The array to be the internal structure
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableConcurrentNavigableCollection(final T[] reference) {
        super();
        __comparator = null;
        __reference = reference;
    }

    /// Create an instance of an [MutableConcurrentNavigableCollection] from the `reference`
    /// using a `comparator` to compare its values
    ///
    /// @param reference The array to be the internal structure
    /// @implNote If the `comparator` is `null`, then use a [Comparable] type on [T] to avoid [ClassCastException]
    public ArrayAsMutableConcurrentNavigableCollection(final T[] reference, final @Nullable Comparator<? super T> comparator) {
        super();
        __comparator = comparator;
        __reference = reference;
    }

    //#endregion -------------------- Constructors --------------------
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
    @Override public ArrayAsMutableConcurrentNavigableCollection<T> clone() { return (ArrayAsMutableConcurrentNavigableCollection<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
