package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.queue.ArrayAsImmutableTransferQueue;
import joookiwi.collection.java.extended.queue.EmptyTransferQueue;
import joookiwi.collection.java.extended.queue.ImmutableTransferQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class TransferQueueCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private TransferQueueCreator() { throw new ImpossibleConstructionException("The utility class “TransferQueueCreator” cannot be constructed.", TransferQueueCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyTransferQueue] instance
    public static <T> EmptyTransferQueue<T> TransferQueue() { return EmptyTransferQueue.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T> ImmutableTransferQueue<T> TransferQueue(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToTransferQueue.toTransferQueue(values); }

    public static <T> ImmutableTransferQueue<T> TransferQueue(final @Nullable CollectionHolder<? extends T> values) { return ToTransferQueue.toTransferQueue(values); }

    public static <T> ImmutableTransferQueue<T> TransferQueue(final T @Nullable @Unmodifiable [] values) { return ToTransferQueue.toTransferQueue(values); }

    @SuppressWarnings("unchecked cast")
    public static <T> ImmutableTransferQueue<T> TransferQueue(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyTransferQueue.getInstance();
        if (values.isEmpty())
            return EmptyTransferQueue.getInstance();
        return new ArrayAsImmutableTransferQueue<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
