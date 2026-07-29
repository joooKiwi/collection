package joookiwi.collection.java.extended.stack;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableBlockingDequeOf1<T>
        extends ImmutableDequeOf1<T>
        implements ImmutableBlockingDeque<T> {

    public ImmutableBlockingDequeOf1(final T value) { super(value); }

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableBlockingDequeOf1] since it would give the same result as a reversed-view
    @Contract(ALWAYS_THIS_0) @Override public ImmutableBlockingDequeOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableBlockingDequeOf1<T> clone() {
        return (ImmutableBlockingDequeOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}
