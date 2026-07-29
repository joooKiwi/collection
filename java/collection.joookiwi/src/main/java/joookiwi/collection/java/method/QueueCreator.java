package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableQueue;
import joookiwi.collection.java.extended.EmptyQueue;
import joookiwi.collection.java.extended.ImmutableQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class QueueCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private QueueCreator() { throw new ImpossibleConstructionException("The utility class “QueueCreator” cannot be constructed.", QueueCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyQueue] instance
    public static <T extends @Nullable Object> EmptyQueue<T> Queue() { return EmptyQueue.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableQueue<T> Queue(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToQueue.toQueue(values); }

    public static <T extends @Nullable Object> ImmutableQueue<T> Queue(final @Nullable CollectionHolder<? extends T> values) { return ToQueue.toQueue(values); }

    public static <T extends @Nullable Object> ImmutableQueue<T> Queue(final T @Nullable @Unmodifiable [] values) { return ToQueue.toQueue(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableQueue<T> Queue(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyQueue.getInstance();
        if (values.isEmpty())
            return EmptyQueue.getInstance();
        return new ArrayAsImmutableQueue<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
