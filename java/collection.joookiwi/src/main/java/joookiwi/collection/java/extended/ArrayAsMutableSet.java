package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [java Set][java.util.Set]
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
@NotNullByDefault
public class ArrayAsMutableSet<T extends @Nullable Object>
        extends AbstractArrayAsMutableSet<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [MutableSet] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableSet() {
        super();
        __reference = emptyArray();
    }

    /// Create an instance of a [MutableSet] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsMutableSet(final T[] reference) {
        super();
        _validateValues(reference);
        __reference = reference;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The changeable internal reference passed through the constructor or mutated from its setter
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsMutableSet<T> clone() { return (ArrayAsMutableSet<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
