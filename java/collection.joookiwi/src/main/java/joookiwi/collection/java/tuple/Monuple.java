package joookiwi.collection.java.tuple;

import joookiwi.collection.java.CollectionHolderOf1;
import joookiwi.collection.java.method.ArrayCreator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.method.AsString.asString;

/// An instance of [Tuple] with only a single value from its `constructor`
///
/// @param <T> The type
@NotNullByDefault
public class Monuple<T extends @Nullable Object>
        extends AbstractTuple<T>
        implements Tuple<T> {

    //#region -------------------- Fields --------------------

    private final T __value1;

    private T @Nullable [] __array;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public Monuple(final T value) {
        super();
        __value1 = value;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The value passed through the `constructor` held by this instance
    public T value1() { return __value1; }

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 1, to = 1) int size() { return 1; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean isEmpty() { return false; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean isNotEmpty() { return true; }

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasExactly1Element() { return true; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost1Element() { return true; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean hasAtLeast2Elements() { return false; }
    @Contract(ALWAYS_FALSE_0) @Override public boolean hasExactly2Elements() { return false; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost2Elements() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has ‥ --------------------

    @Override public boolean hasNull() {
        return value1() == null;
    }

    @Override public boolean hasNoNulls() {
        return value1() != null;
    }


    @Contract(ALWAYS_FALSE_0) @Override public boolean hasDuplicate() {
        return false;
    }

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasNoDuplicates() {
        return true;
    }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Conversion methods --------------------

    @Override public T[] toArray() {
        final var value = __array;
        if (value != null)
            return value;
        return __array = ArrayCreator.Array(value1());
    }

    @Override public CollectionHolderOf1<T> toCollection() { return new CollectionHolderOf1<>(value1()); }

    @Override public String toString() { return "Monuple (" + asString(value1()) + ')'; }

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Cloneable methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public Monuple<T> clone() { return (Monuple<T>) super.clone(); }

    //#endregion -------------------- Cloneable methods --------------------

    //#endregion -------------------- Methods --------------------

}
