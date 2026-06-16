package joookiwi.collection.java;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An instance of [CollectionHolder] with only a single value from its `constructor`
///
/// @param <T> The type
/// @see LazyCollectionHolderOf1
/// @see ArrayOf1AsCollectionHolder
@NotNullByDefault
public class CollectionHolderOf1<T extends @Nullable Object>
        extends AbstractCollectionHolderOf1<T> {

    private final T __value;
    private final boolean __hasNull;
    private final boolean __hasNoNulls;

    public CollectionHolderOf1(final T value) {
        super();
        __hasNoNulls = !(__hasNull = (__value = value) == null);
    }

    /// The internal value passed through the `constructor`
    @Override public T value() { return __value; }

    @Override public boolean hasNull() { return __hasNull; }

    @Override public boolean hasNoNulls() { return __hasNoNulls; }


    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public CollectionHolderOf1<T> clone() { return (CollectionHolderOf1<T>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public CollectionHolderOf1<T> shallowClone() { return clone(); }
//
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public CollectionHolderOf1<T> deepClone() { return new CollectionHolderOf1<>(CloneInvokator.getInstance().cloneIfCloneable(value())); }

}
