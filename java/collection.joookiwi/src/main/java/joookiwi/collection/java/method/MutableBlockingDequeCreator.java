package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableBlockingDeque;
import joookiwi.collection.java.extended.MutableBlockingDeque;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableBlockingDequeCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableBlockingDequeCreator() { throw new ImpossibleConstructionException("The utility class “MutableBlockingDequeCreator” cannot be constructed.", MutableBlockingDequeCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T> MutableBlockingDeque<T> MutableBlockingDeque() { return new ArrayAsMutableBlockingDeque<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableBlockingDeque<T> MutableBlockingDeque(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableBlockingDeque.toMutableBlockingDeque(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableBlockingDeque<T> MutableBlockingDeque(final @Nullable CollectionHolder<? extends T> values) { return ToMutableBlockingDeque.toMutableBlockingDeque(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableBlockingDeque<T> MutableBlockingDeque(final T @Nullable @Unmodifiable [] values) { return ToMutableBlockingDeque.toMutableBlockingDeque(values); }

    @SuppressWarnings("unchecked cast")
    @Contract(ALWAYS_NEW_1)
    public static <T> MutableBlockingDeque<T> MutableBlockingDeque(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableBlockingDeque<>();
        if (values.isEmpty())
            return new ArrayAsMutableBlockingDeque<>();
        return new ArrayAsMutableBlockingDeque<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
