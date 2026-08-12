package joookiwi.collection.java.extended.set;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public class ImmutableConcurrentSetOf1<T extends @Nullable Object>
        extends ImmutableSetOf1<T>
        implements ImmutableConcurrentSet<T> {

    public ImmutableConcurrentSetOf1(final T value) { super(value); }

    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableConcurrentSetOf1<T> clone() {
        return (ImmutableConcurrentSetOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}
