package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;

@NotNullByDefault
public class ArrayAsMutableList<T extends @Nullable Object>
        extends AbstractArrayAsMutableList<T> {

    //#region -------------------- Fields --------------------

    private T[] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ArrayAsMutableList() {
        super();
        __reference = emptyArray();
    }

    public ArrayAsMutableList(final T[] reference) {
        super();
        __reference = reference;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter / setter methods --------------------

    /// The changeable internal reference passed through the constructor or mutated from its setter
    @Contract(pure = true)
    @Override protected T[] _reference() { return __reference; }

    @Contract(mutates = "this")
    @Override protected void _reference(final T[] value) { __reference = value; }

    //#endregion -------------------- Getter / setter methods --------------------
    //#region -------------------- Methods --------------------

    @MustBeInvokedByOverriders
    @Override public ArrayAsMutableList<T> clone() { return (ArrayAsMutableList<T>) super.clone(); }

    //#endregion -------------------- Methods --------------------

}
