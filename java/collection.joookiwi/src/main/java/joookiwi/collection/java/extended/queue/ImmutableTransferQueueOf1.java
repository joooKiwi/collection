package joookiwi.collection.java.extended.queue;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public class ImmutableTransferQueueOf1<T>
        extends ImmutableBlockingQueueOf1<T>
        implements ImmutableTransferQueue<T> {

    public ImmutableTransferQueueOf1(final T value) { super(value); }

    //#region -------------------- Consumer methods --------------------

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean hasWaitingConsumer() { return false; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int getWaitingConsumerCount() { return 0; }

    //#endregion -------------------- Consumer methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableTransferQueueOf1<T> clone() {
        return (ImmutableTransferQueueOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}
