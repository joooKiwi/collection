package joookiwi.collection.java;

import joookiwi.collection.java.callback.IntObjConsumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

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
public class CollectionHolderOf2<T extends @Nullable Object,
        T1 extends T,
        T2 extends T>
        extends AbstractCollectionHolderOf2<T, T1, T2> {

    private final T1 __value1;
    private final T2 __value2;
    private @Nullable Boolean __hasNull;
    private @Nullable Boolean __hasNoNulls;
    private @Nullable Boolean __hasDuplicate;
    private @Nullable Boolean __hasNoDuplicates;

    public CollectionHolderOf2(final T1 value1, final T2 value2) {
        super();
        __value1 = value1;
        __value2 = value2;
    }

    /// The internal 1<sup>st</sup> value (out of 2) passed through the `constructor`
    @Override public T1 value1() { return __value1; }

    /// The internal 2<sup>nd</sup> value (out of 2) passed through the `constructor`
    @Override public T2 value2() { return __value2; }

    @Override public boolean hasNull() { return __hasNull == null ? __hasNull = super.hasNull() : __hasNull; }

    @Override public boolean hasNoNulls() { return __hasNoNulls == null ? __hasNoNulls = super.hasNull() : __hasNoNulls; }

    @Override public boolean hasDuplicate() { return __hasDuplicate == null ? __hasDuplicate = super.hasDuplicate() : __hasDuplicate; }

    @Override public boolean hasNoDuplicates() { return __hasNoDuplicates == null ? __hasNoDuplicates = super.hasDuplicate() : __hasNoDuplicates; }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolderOf2<T, T1, T2> onEach(final ObjIntConsumer<? super T> action) { return (CollectionHolderOf2<T, T1, T2>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public CollectionHolderOf2<T, T1, T2> onEach(final Consumer<? super T>       action) { return (CollectionHolderOf2<T, T1, T2>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public CollectionHolderOf2<T, T1, T2> onEach(final Runnable                  action) { return (CollectionHolderOf2<T, T1, T2>) super.onEach(action); }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolderOf2<T, T1, T2> onEachIndexed(final IntObjConsumer<? super T> action) { return (CollectionHolderOf2<T, T1, T2>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public CollectionHolderOf2<T, T1, T2> onEachIndexed(final IntConsumer               action) { return (CollectionHolderOf2<T, T1, T2>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public CollectionHolderOf2<T, T1, T2> onEachIndexed(final Runnable                  action) { return (CollectionHolderOf2<T, T1, T2>) super.onEachIndexed(action); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public CollectionHolderOf2<T, T1, T2> clone() { return (CollectionHolderOf2<T, T1, T2>) super.clone(); }

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

}
