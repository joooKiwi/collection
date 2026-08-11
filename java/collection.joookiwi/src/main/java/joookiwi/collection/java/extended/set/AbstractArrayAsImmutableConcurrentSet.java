package joookiwi.collection.java.extended.set;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableConcurrentSet<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSet<T> {

    protected AbstractArrayAsImmutableConcurrentSet() { super(); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableConcurrentSet<T> clone() { return (AbstractArrayAsImmutableConcurrentSet<T>) super.clone(); }

}
