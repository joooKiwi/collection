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

/// An instance of [CollectionHolder] adapted from an `array` having a lone value inside.
///
/// Note that the value is directly retrieved from the array and it is kept
///
/// @param <T> The type
/// @see ArrayAsCollectionHolder
/// @see CollectionHolderOf1
/// @see LazyCollectionHolderOf1
@NotNullByDefault
public class ArrayOf1AsCollectionHolder<T extends @Nullable Object>
        extends AbstractCollectionHolderOf1<T> {

    private final WeakReference<T @Unmodifiable []> __reference;
    private final T __value;
    private final boolean __hasNull;
    private final boolean __hasNoNulls;

    public ArrayOf1AsCollectionHolder(final T @Unmodifiable [] reference) {
        super();
        if (reference.length != 1)
            throw new IllegalArgumentException("The array received in the " + getClass().getSimpleName() + " cannot have a different size than 1.");
        __reference = new WeakReference<>(reference);
        __hasNoNulls = !(__hasNull = (__value = reference[0]) == null);
    }

    /// The internal value passed through the `constructor` in the [#_reference] first field
    @Override public T value() { return __value; }

    /// The internal referenced passed through the `constructor`.
    ///
    /// It returns `null` if the reference has been garbage-collected by the **JVM**
    protected T @Nullable @Unmodifiable [] _reference() { return __reference.get(); }

    @Override public boolean hasNull() { return __hasNull; }

    @Override public boolean hasNoNulls() { return __hasNoNulls; }

    @Contract(ALWAYS_THIS_1) @Override public ArrayOf1AsCollectionHolder<T> onEach(final ObjIntConsumer<? super T> action) { return (ArrayOf1AsCollectionHolder<T>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf1AsCollectionHolder<T> onEach(final Consumer<? super T>       action) { return (ArrayOf1AsCollectionHolder<T>) super.onEach(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf1AsCollectionHolder<T> onEach(final Runnable                  action) { return (ArrayOf1AsCollectionHolder<T>) super.onEach(action); }

    @Contract(ALWAYS_THIS_1) @Override public ArrayOf1AsCollectionHolder<T> onEachIndexed(final IntObjConsumer<? super T> action) { return (ArrayOf1AsCollectionHolder<T>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf1AsCollectionHolder<T> onEachIndexed(final IntConsumer               action) { return (ArrayOf1AsCollectionHolder<T>) super.onEachIndexed(action); }
    @Contract(ALWAYS_THIS_1) @Override public ArrayOf1AsCollectionHolder<T> onEachIndexed(final Runnable                  action) { return (ArrayOf1AsCollectionHolder<T>) super.onEachIndexed(action); }



    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayOf1AsCollectionHolder<T> clone() { return (ArrayOf1AsCollectionHolder<T>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public ArrayOf1AsCollectionHolder<T> shallowClone() { return clone(); }
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public ArrayOf1AsCollectionHolder<T> deepClone() { return new ArrayOf1AsCollectionHolder<>(CloneInvokator.getInstance().clone(_reference())); }

}
