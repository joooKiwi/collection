package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

public class EmptyTransferQueue<T>
        extends EmptyBlockingQueue<T>
        implements ImmutableTransferQueue<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyTransferQueue<?> __instance;

    protected EmptyTransferQueue() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyTransferQueue<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyTransferQueue<T>) instance;
        synchronized (EmptyTransferQueue.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyTransferQueue<T>) instance2;
            return (EmptyTransferQueue<T>) (__instance = new EmptyTransferQueue<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Consumer methods --------------------

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasWaitingConsumer() { return false; }

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int getWaitingConsumerCount() { return 0; }

    //#endregion -------------------- Consumer methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyTransferQueue<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
