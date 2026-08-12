package joookiwi.collection.java;

import java.lang.ref.WeakReference;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import joookiwi.collection.java.callback.IntObjConsumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;

/// An instance of [CollectionHolder] adapted from an `array` having 2 values inside.
///
/// Note that the values is directly retrieved from the array and it is kept
///
/// @param <T> The type
/// @see ArrayAsCollectionHolder
/// @see CollectionHolderOf2
/// @see LazyCollectionHolderOf2
@NotNullByDefault
public class ArrayOf2AsCollectionHolder<T extends @Nullable Object>
        extends AbstractCollectionHolderOf2<T, T, T> {

    private final WeakReference<T @Unmodifiable []> __reference;
    private final T __value1;
    private final T __value2;
    private final boolean __hasNull;
    private final boolean __hasNoNulls;
    private @Nullable Boolean __hasDuplicate;
    private @Nullable Boolean __hasNoDuplicates;

    public ArrayOf2AsCollectionHolder(final T @Unmodifiable [] reference) {
        super();
        if (reference.length != 2)
            throw new IllegalArgumentException("The array received in the " + getClass().getSimpleName() + " cannot have a different size than 2.");
        __reference = new WeakReference<>(reference);
        final var value1 = __value1 = reference[0];
        final var value2 = __value2 = reference[1];
        __hasNoNulls = !(__hasNull = (value1 == null || value2 == null));
    }

    /// The internal value passed through the `constructor` in the [#_reference] first field
    @Override public T value1() { return __value1; }

    /// The internal value passed through the `constructor` in the [#_reference] first field
    @Override public T value2() { return __value2; }

    /// The internal referenced passed through the `constructor`.
    ///
    /// It returns `null` if the reference has been garbage-collected by the **JVM**
    protected T @Nullable @Unmodifiable [] _reference() { return __reference.get(); }

    @Override public boolean hasNull() { return __hasNull; }

    @Override public boolean hasNoNulls() { return __hasNoNulls; }

    @Override public boolean hasDuplicate() { return __hasDuplicate == null ? __hasDuplicate = super.hasDuplicate() : __hasDuplicate; }

    @Override public boolean hasNoDuplicates() { return __hasNoDuplicates == null ? __hasNoDuplicates = super.hasDuplicate() : __hasNoDuplicates; }

    @Contract(ALWAYS_THIS_1) @Override public ArrayOf2AsCollectionHolder<T> onEach(final ObjIntConsumer<? super T> action) { return (ArrayOf2AsCollectionHolder<T>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf2AsCollectionHolder<T> onEach(final Consumer<? super T>       action) { return (ArrayOf2AsCollectionHolder<T>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf2AsCollectionHolder<T> onEach(final Runnable                  action) { return (ArrayOf2AsCollectionHolder<T>) super.onEach(action); }

    @Contract(ALWAYS_THIS_1) @Override public ArrayOf2AsCollectionHolder<T> onEachIndexed(final IntObjConsumer<? super T> action) { return (ArrayOf2AsCollectionHolder<T>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf2AsCollectionHolder<T> onEachIndexed(final IntConsumer               action) { return (ArrayOf2AsCollectionHolder<T>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf2AsCollectionHolder<T> onEachIndexed(final Runnable                  action) { return (ArrayOf2AsCollectionHolder<T>) super.onEachIndexed(action); }



    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayOf2AsCollectionHolder<T> clone() { return (ArrayOf2AsCollectionHolder<T>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public ArrayOf2AsCollectionHolder<T> shallowClone() { return clone(); }
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public ArrayOf2AsCollectionHolder<T> deepClone() { return new ArrayOf1AsCollectionHolder<>(CloneInvokator.getInstance().clone(_reference())); }

}
