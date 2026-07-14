package joookiwi.collection.java;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.IntObjConsumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;

/// An instance of [CollectionHolder] with only a single value but lazily retrieved.
///
/// It does retrieve the value only once from the [Supplier] received in its `constructor`.
///
/// @param <T> The type
/// @see CollectionHolderOf1
/// @see ArrayOf1AsCollectionHolder
@NotNullByDefault
public class LazyCollectionHolderOf1<T extends @Nullable Object>
        extends AbstractCollectionHolderOf1<T> {

    //#region -------------------- Fields --------------------

    private static final Supplier<?> FAIL_CALLBACK = () -> { throw new RuntimeException("This callback is never supposed to be called normally."); };

    private Supplier<? extends T> __lateValue;
    private boolean __isValueInitialized;
    private @Nullable T __value;

    private boolean __hasNull;
    private boolean __hasNullInitialized;

    private boolean __hasNoNulls;
    private boolean __hasNoNullsInitialized;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public LazyCollectionHolderOf1(final Supplier<? extends T> lateValue) {
        super();
        __lateValue = lateValue;
        __isValueInitialized = false;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The internal value passed through the `constructor`
    @SuppressWarnings("unchecked cast")
    @Override public T value() {
        if (__isValueInitialized)
            return __value;

        final var value = __value = __lateValue.get();
        __lateValue = (Supplier<? extends T>) FAIL_CALLBACK; // We do not need the callback anymore once the value has been retrieved
        __isValueInitialized = true;
        return value;
    }

    @Override public boolean hasNull() {
        if (__hasNullInitialized)
            return __hasNull;

        final var value = __hasNull = value() == null;
        __hasNullInitialized = true;
        return value;
    }

    @Override public boolean hasNoNulls() {
        if (__hasNoNullsInitialized)
            return __hasNoNulls;

        final var value = __hasNoNulls = value() != null;
        __hasNoNullsInitialized = true;
        return value;
    }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf1<T> onEach(final ObjIntConsumer<? super T> action) { return (LazyCollectionHolderOf1<T>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf1<T> onEach(final Consumer<? super T>       action) { return (LazyCollectionHolderOf1<T>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf1<T> onEach(final Runnable                  action) { return (LazyCollectionHolderOf1<T>) super.onEach(action); }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf1<T> onEachIndexed(final IntObjConsumer<? super T> action) { return (LazyCollectionHolderOf1<T>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf1<T> onEachIndexed(final IntConsumer               action) { return (LazyCollectionHolderOf1<T>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf1<T> onEachIndexed(final Runnable                  action) { return (LazyCollectionHolderOf1<T>) super.onEachIndexed(action); }



    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public LazyCollectionHolderOf1<T> clone() { return (LazyCollectionHolderOf1<T>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public LazyCollectionHolderOf1<T> shallowClone() { return clone(); }
//
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public LazyCollectionHolderOf1<T> deepClone() { return new LazyCollectionHolderOf1<>(() -> CloneInvokator.getInstance().cloneIfCloneable(value())); }

    //#endregion -------------------- Methods --------------------

}
