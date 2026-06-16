package joookiwi.collection.java.extended;

import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public class ImmutableSetOf1<T extends @Nullable Object>
        extends ImmutableCollectionOf1<T>
        implements ImmutableSet<T> {

    public ImmutableSetOf1(final T value) { super(value); }

    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Set<?> otherConverted))
            return false;
        if (otherConverted.size() != 1)
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableSetOf1<T> clone() {
        return (ImmutableSetOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}
