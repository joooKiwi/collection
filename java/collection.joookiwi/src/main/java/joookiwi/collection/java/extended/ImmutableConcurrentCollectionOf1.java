package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public class ImmutableConcurrentCollectionOf1<T extends @Nullable Object>
        extends ImmutableCollectionOf1<T>
        implements ImmutableConcurrentCollection<T> {

    public ImmutableConcurrentCollectionOf1(final T value) { super(value); }

    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableConcurrentCollectionOf1<T> clone() {
        return (ImmutableConcurrentCollectionOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}
