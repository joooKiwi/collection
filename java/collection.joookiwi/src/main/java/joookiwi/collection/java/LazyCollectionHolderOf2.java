package joookiwi.collection.java;

import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.tuple.Couple;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;

/// An instance of [CollectionHolder] with only 2 values from its `constructor`
///
/// @param <T>  The type
/// @param <T1> The 1<sup>st</sup> type
/// @param <T2> The 2<sup>nd</sup> type
/// @see LazyCollectionHolderOf2
/// @see ArrayOf2AsCollectionHolder
@NotNullByDefault
public class LazyCollectionHolderOf2<T extends @Nullable Object,
        T1 extends T,
        T2 extends T>
        extends AbstractCollectionHolderOf2<T, T1, T2> {

    //#region -------------------- Fields --------------------

    private static final Supplier<?> FAIL_CALLBACK = () -> { throw new RuntimeException("This callback is never supposed to be called normally."); };

    private Supplier<? extends Couple<T, ? extends T1, ? extends T2>> __lateValues;
    private @Nullable Couple<T, ? extends T1, ? extends T2> __values;
    private @Nullable T1 __value1;
    private boolean __isValue1Initialized;
    private @Nullable T2 __value2;
    private boolean __isValue2Initialized;

    private @Nullable Boolean __hasNull;
    private @Nullable Boolean __hasNoNulls;
    private @Nullable Boolean __hasDuplicate;
    private @Nullable Boolean __hasNoDuplicates;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public LazyCollectionHolderOf2(final Supplier<? extends Couple<T, ? extends T1, ? extends T2>> lateValues) {
        super();
        __lateValues = lateValues;
        __isValue1Initialized = __isValue2Initialized = false;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The internal 1<sup>st</sup> value (out of 2) passed through the `constructor`
    @Override public T1 value1() {
        if (__isValue1Initialized)
            return __value1;

        // The second value can never initialize the "values" since it does set the "value1" by setting its "value2
        final var value = __value1 = (__values = __lateValues.get()).value1();
        __isValue1Initialized = true;
        return value;
    }

    /// The internal 2<sup>nd</sup> value (out of 2) passed through the `constructor`
    @SuppressWarnings("unchecked cast")
    @Override public T2 value2() {
        if (__isValue2Initialized)
            return __value2;

        if (__isValue1Initialized) {
            // We just initialize the "value2" and unset everything else.
            // And the "values" are expected to be initialized
            final var value = __value2 = __values.value2();
            __lateValues = (Supplier<? extends Couple<T, ? extends T1, ? extends T2>>) FAIL_CALLBACK; // We do not need the callback anymore once the value has been retrieved
            __values = null;
            __isValue2Initialized = true;
            return value;
        }

        // We initialize "value1" and "value2" and then unset everything else
        final var values = __lateValues.get();
        __value1 = values.value1();
        final var value = __value2 = values.value2();
        __isValue1Initialized = __isValue2Initialized = true;
        __lateValues = (Supplier<? extends Couple<T, ? extends T1, ? extends T2>>) FAIL_CALLBACK; // We do not need the callback anymore once the value has been retrieved
        return value;
    }

    @Override public boolean hasNull() { return __hasNull == null ? __hasNull = super.hasNull() : __hasNull; }

    @Override public boolean hasNoNulls() { return __hasNoNulls == null ? __hasNoNulls = super.hasNull() : __hasNoNulls; }

    @Override public boolean hasDuplicate() { return __hasDuplicate == null ? __hasDuplicate = super.hasDuplicate() : __hasDuplicate; }

    @Override public boolean hasNoDuplicates() { return __hasNoDuplicates == null ? __hasNoDuplicates = super.hasDuplicate() : __hasNoDuplicates; }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf2<T, T1, T2> onEach(final ObjIntConsumer<? super T> action) { return (LazyCollectionHolderOf2<T, T1, T2>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf2<T, T1, T2> onEach(final Consumer<? super T>       action) { return (LazyCollectionHolderOf2<T, T1, T2>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf2<T, T1, T2> onEach(final Runnable                  action) { return (LazyCollectionHolderOf2<T, T1, T2>) super.onEach(action); }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf2<T, T1, T2> onEachIndexed(final IntObjConsumer<? super T> action) { return (LazyCollectionHolderOf2<T, T1, T2>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf2<T, T1, T2> onEachIndexed(final IntConsumer               action) { return (LazyCollectionHolderOf2<T, T1, T2>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf2<T, T1, T2> onEachIndexed(final Runnable                  action) { return (LazyCollectionHolderOf2<T, T1, T2>) super.onEachIndexed(action); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public LazyCollectionHolderOf2<T, T1, T2> clone() { return (LazyCollectionHolderOf2<T, T1, T2>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public CollectionHolderOf2<T, T1, T2> shallowClone() { return clone(); }
//
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public CollectionHolderOf2<T, T1, T2> deepClone() {
//        final var cloneInvokator = CloneInvokator.getInstance();
//        return new CollectionHolderOf2<>(cloneInvokator.cloneIfCloneable(value1()), cloneInvokator.cloneIfCloneable(value2()));
//    }

    //#endregion -------------------- Methods --------------------

}
