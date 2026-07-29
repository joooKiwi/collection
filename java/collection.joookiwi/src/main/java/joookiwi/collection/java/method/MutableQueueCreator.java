package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableQueue;
import joookiwi.collection.java.extended.MutableQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class MutableQueueCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableQueueCreator() { throw new ImpossibleConstructionException("The utility class “MutableQueueCreator” cannot be constructed.", MutableQueueCreator.class); }

    //#region -------------------- ∅ --------------------

    public static <T extends @Nullable Object> MutableQueue<T> MutableQueue() { return new ArrayAsMutableQueue<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> MutableQueue<T> MutableQueue(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableQueue.toMutableQueue(values); }

    public static <T extends @Nullable Object> MutableQueue<T> MutableQueue(final @Nullable CollectionHolder<? extends T> values) { return ToMutableQueue.toMutableQueue(values); }

    public static <T extends @Nullable Object> MutableQueue<T> MutableQueue(final T @Nullable @Unmodifiable [] values) { return ToMutableQueue.toMutableQueue(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableQueue<T> MutableQueue(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableQueue<>();
        if (values.isEmpty())
            return new ArrayAsMutableQueue<>();
        return new ArrayAsMutableQueue<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
