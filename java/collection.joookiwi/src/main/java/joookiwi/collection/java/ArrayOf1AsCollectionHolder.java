package joookiwi.collection.java;

import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

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
