package joookiwi.collection.java.tuple;

import joookiwi.collection.java.CollectionHolderOf2;
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

/// An instance of [Tuple] with only 2 values from its `constructor`
///
/// @param <T>  The type
/// @param <T1> The 1<sup>st</sup> type
/// @param <T2> The 2<sup>nd</sup> type
@NotNullByDefault
public class Couple<T extends @Nullable Object,
        T1 extends T,
        T2 extends T>
        extends AbstractTuple<T>
        implements Tuple<T> {

    //#region -------------------- Fields --------------------

    private final T1 __value1;
    private final T2 __value2;

    private T @Nullable [] __array;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public Couple(final T1 value1, final T2 value2) {
        super();
        __value1 = value1;
        __value2 = value2;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The 1<sup>st</sup> value passed through the `constructor` held by this instance
    public T1 value1() { return __value1; }

    /// The 2<sup>nd</sup> value passed through the `constructor` held by this instance
    public T2 value2() { return __value2; }

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 2, to = 2) int size() { return 2; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean isEmpty() { return false; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean isNotEmpty() { return true; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean hasExactly1Element() { return false; }
    @Contract(ALWAYS_FALSE_0) @Override public boolean hasAtMost1Element() { return false; }

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtLeast2Elements() { return true; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasExactly2Elements() { return true; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost2Elements() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has ‥ --------------------

    @Override public boolean hasNull() { return value1() == null || value2() == null; }

    @Override public boolean hasNoNulls() { return value1() != null && value2() != null; }


    @Override public boolean hasDuplicate() {
        final var value1 = value1();
        if (value1 == null)
            return value2() == null;

        final var value2 = value2();
        if (value1 == value2)
            return true;
        return value1.equals(value2);
    }

    @Override public boolean hasNoDuplicates() {
        final var value1 = value1();
        if (value1 == null)
            return value2() != null;

        final var value2 = value2();
        if (value1 == value2)
            return false;
        return !value1.equals(value2);
    }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Conversion methods --------------------

    @Override public T[] toArray() {
        final var value = __array;
        if (value != null)
            return value;
        return __array = ArrayCreator.Array(value1(), value2());
    }

    @Override public CollectionHolderOf2<T, T1, T2> toCollection() { return new CollectionHolderOf2<>(value1(), value2()); }

    @Override public String toString() { return "Couple (" + asString(value1()) + ", " + asString(value2()) + ')'; }

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Cloneable methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public Couple<T, T1, T2> clone() {
        return (Couple<T, T1, T2>) super.clone();
    }

    //#endregion -------------------- Cloneable methods --------------------

    //#endregion -------------------- Methods --------------------

}
