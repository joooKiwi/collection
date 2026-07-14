package joookiwi.collection.java.tuple;

import joookiwi.collection.java.ArrayAsCollectionHolder;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.method.AsString.asString;

@NotNullByDefault
public class Couple<T extends @Nullable Object,
        T1 extends T,
        T2 extends T>
        extends AbstractTuple<T>
        implements Tuple<T> {

    //#region -------------------- Fields --------------------

    private final T1 __value1;
    private final T2 __value2;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public Couple(final T1 value1, final T2 value2) {
        super();
        __value1 = value1;
        __value2 = value2;
    }

    //#endregion -------------------- Constructor --------------------

    public T1 value1() { return __value1; }

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
    //#region -------------------- Conversion methods --------------------

    @Override public CollectionHolder<T> toCollection() { return new ArrayAsCollectionHolder<>((T[]) new Object[]{value1(), value2(),}); }

    @Override public String toString() { return "Couple (" + asString(value1()) + ", " + asString(value2()) + ')'; }

    //#endregion -------------------- Conversion methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public Couple<T, T1, T2> clone() {
        return (Couple<T, T1, T2>) super.clone();
    }

}
