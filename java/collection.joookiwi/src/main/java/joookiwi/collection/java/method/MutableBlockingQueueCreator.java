package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableBlockingQueue;
import joookiwi.collection.java.extended.MutableBlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class MutableBlockingQueueCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableBlockingQueueCreator() { throw new ImpossibleConstructionException("The utility class “MutableBlockingQueueCreator” cannot be constructed.", MutableBlockingQueueCreator.class); }

    //#region -------------------- ∅ --------------------

    public static <T> MutableBlockingQueue<T> MutableBlockingQueue() { return new ArrayAsMutableBlockingQueue<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T> MutableBlockingQueue<T> MutableBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableBlockingQueue.toMutableBlockingQueue(values); }

    public static <T> MutableBlockingQueue<T> MutableBlockingQueue(final @Nullable CollectionHolder<? extends T> values) { return ToMutableBlockingQueue.toMutableBlockingQueue(values); }

    public static <T> MutableBlockingQueue<T> MutableBlockingQueue(final T @Nullable @Unmodifiable [] values) { return ToMutableBlockingQueue.toMutableBlockingQueue(values); }

    @SuppressWarnings("unchecked cast")
    public static <T> MutableBlockingQueue<T> MutableBlockingQueue(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableBlockingQueue<>();
        if (values.isEmpty())
            return new ArrayAsMutableBlockingQueue<>();
        return new ArrayAsMutableBlockingQueue<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
