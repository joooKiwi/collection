package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public class ArrayAsMutableList<T extends @Nullable Object>
        extends AbstractArrayAsMutableList<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    /// Create an instance of a [MutableList] from an [empty array][joookiwi.collection.java.CollectionConstants#emptyArray]
    public ArrayAsMutableList() {
        super();
        __reference = emptyArray();
    }

    /// Create an instance of a [MutableList] from the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsMutableList(final T[] reference) {
        super();
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
    @Override public ArrayAsMutableList<T> clone() { return (ArrayAsMutableList<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
