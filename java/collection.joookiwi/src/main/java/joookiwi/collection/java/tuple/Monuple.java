package joookiwi.collection.java.tuple;

import joookiwi.collection.java.CollectionHolderOf1;
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
public class Monuple<T extends @Nullable Object>
        extends AbstractTuple<T>
        implements Tuple<T> {

    //#region -------------------- Fields --------------------

    private final T __value1;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public Monuple(final T value) {
        super();
        __value1 = value;
    }

    //#endregion -------------------- Constructor --------------------

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
    //#region -------------------- Conversion methods --------------------

    @Override public CollectionHolderOf1<T> toCollection() { return new CollectionHolderOf1<>(value1()); }

    @Override public String toString() { return "Monuple (" + asString(value1()) + ')'; }

    //#endregion -------------------- Conversion methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public Monuple<T> clone() { return (Monuple<T>) super.clone(); }

}
