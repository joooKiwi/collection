package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableTransferQueue;
import joookiwi.collection.java.extended.MutableTransferQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableTransferQueueCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableTransferQueueCreator() { throw new ImpossibleConstructionException("The utility class “MutableTransferQueueCreator” cannot be constructed.", MutableTransferQueueCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T> MutableTransferQueue<T> MutableTransferQueue() { return new ArrayAsMutableTransferQueue<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableTransferQueue<T> MutableTransferQueue(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableTransferQueue.toMutableTransferQueue(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableTransferQueue<T> MutableTransferQueue(final @Nullable CollectionHolder<? extends T> values) { return ToMutableTransferQueue.toMutableTransferQueue(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableTransferQueue<T> MutableTransferQueue(final T @Nullable @Unmodifiable [] values) { return ToMutableTransferQueue.toMutableTransferQueue(values); }

    @SuppressWarnings("unchecked cast")
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableTransferQueue<T> MutableTransferQueue(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableTransferQueue<>();
        if (values.isEmpty())
            return new ArrayAsMutableTransferQueue<>();
        return new ArrayAsMutableTransferQueue<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
