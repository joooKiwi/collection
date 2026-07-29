package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableBlockingQueue;
import joookiwi.collection.java.extended.EmptyBlockingQueue;
import joookiwi.collection.java.extended.ImmutableBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class BlockingQueueCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private BlockingQueueCreator() { throw new ImpossibleConstructionException("The utility class “BlockingQueueCreator” cannot be constructed.", BlockingQueueCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyBlockingQueue] instance
    public static <T> EmptyBlockingQueue<T> BlockingQueue() { return EmptyBlockingQueue.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T> ImmutableBlockingQueue<T> BlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToBlockingQueue.toBlockingQueue(values); }

    public static <T> ImmutableBlockingQueue<T> BlockingQueue(final @Nullable CollectionHolder<? extends T> values) { return ToBlockingQueue.toBlockingQueue(values); }

    public static <T> ImmutableBlockingQueue<T> BlockingQueue(final T @Nullable @Unmodifiable [] values) { return ToBlockingQueue.toBlockingQueue(values); }

    @SuppressWarnings("unchecked cast")
    public static <T> ImmutableBlockingQueue<T> BlockingQueue(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyBlockingQueue.getInstance();
        if (values.isEmpty())
            return EmptyBlockingQueue.getInstance();
        return new ArrayAsImmutableBlockingQueue<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
