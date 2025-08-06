package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A bare-bone implementation of a [java Collection][java.util.Collection]
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
public class ArrayAsMutableCollection<T extends @Nullable Object>
        extends AbstractArrayAsMutableCollection<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance of a [java.util.Collection] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsMutableCollection(final T[] reference) {
        super();
        __reference = reference;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The changeable internal reference passed through the constructor and mutated from its setter
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    /// Change the internal reference to do afterward more collection operations
    ///
    /// @param value The new array
    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsMutableCollection<T> clone() { return (ArrayAsMutableCollection<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
