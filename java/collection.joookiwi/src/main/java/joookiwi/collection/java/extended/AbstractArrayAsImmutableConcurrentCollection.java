package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableConcurrentCollection<T extends @Nullable Object>
        extends AbstractArrayAsImmutableCollection<T>
        implements ImmutableConcurrentCollection<T> {

    protected AbstractArrayAsImmutableConcurrentCollection() { super(); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableConcurrentCollection<T> clone() { return (AbstractArrayAsImmutableConcurrentCollection<T>) super.clone(); }

}
