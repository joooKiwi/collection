package joookiwi.collection.java.extended.queue;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public class ImmutableBlockingQueueOf1<T>
        extends ImmutableQueueOf1<T>
        implements ImmutableBlockingQueue<T> {

    public ImmutableBlockingQueueOf1(final T value) { super(value); }

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableBlockingQueueOf1<T> clone() {
        return (ImmutableBlockingQueueOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}
