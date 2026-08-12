package joookiwi.collection.java.extended.set;

import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [MutableConcurrentSet]
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
@NotNullByDefault
public class ArrayAsMutableConcurrentSet<T extends @Nullable Object>
        extends AbstractArrayAsMutableConcurrentSet<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [MutableConcurrentSet] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableConcurrentSet() {
        super();
        __reference = emptyArray();
    }

    /// Create an instance of a [MutableConcurrentSet] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    /// @throws RuntimeException A duplicate value exists in the `reference`
    public ArrayAsMutableConcurrentSet(final T[] reference) {
        super();
        _validateValues(reference);
        __reference = reference;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsMutableConcurrentSet<T> clone() { return (ArrayAsMutableConcurrentSet<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
