package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.stack.ArrayAsImmutableBlockingDeque;
import joookiwi.collection.java.extended.stack.EmptyBlockingDeque;
import joookiwi.collection.java.extended.stack.ImmutableBlockingDeque;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class BlockingDequeCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private BlockingDequeCreator() { throw new ImpossibleConstructionException("The utility class “BlockingDequeCreator” cannot be constructed.", BlockingDequeCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyBlockingDeque] instance
    public static <T> EmptyBlockingDeque<T> BlockingDeque() { return EmptyBlockingDeque.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T> ImmutableBlockingDeque<T> BlockingDeque(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToBlockingDeque.toBlockingDeque(values); }

    public static <T> ImmutableBlockingDeque<T> BlockingDeque(final @Nullable CollectionHolder<? extends T> values) { return ToBlockingDeque.toBlockingDeque(values); }

    public static <T> ImmutableBlockingDeque<T> BlockingDeque(final T @Nullable @Unmodifiable [] values) { return ToBlockingDeque.toBlockingDeque(values); }

    @SuppressWarnings("unchecked cast")
    public static <T> ImmutableBlockingDeque<T> BlockingDeque(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyBlockingDeque.getInstance();
        if (values.isEmpty())
            return EmptyBlockingDeque.getInstance();
        return new ArrayAsImmutableBlockingDeque<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
