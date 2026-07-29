package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableDeque;
import joookiwi.collection.java.extended.MutableDeque;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableDequeCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableDequeCreator() { throw new ImpossibleConstructionException("The utility class “MutableDequeCreator” cannot be constructed.", MutableDequeCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableDeque<T> MutableDeque() { return new ArrayAsMutableDeque<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableDeque<T> MutableDeque(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableDeque.toMutableDeque(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableDeque<T> MutableDeque(final @Nullable CollectionHolder<? extends T> values) { return ToMutableDeque.toMutableDeque(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableDeque<T> MutableDeque(final T @Nullable @Unmodifiable [] values) { return ToMutableDeque.toMutableDeque(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableDeque<T> MutableDeque(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableDeque<>();
        if (values.isEmpty())
            return new ArrayAsMutableDeque<>();
        return new ArrayAsMutableDeque<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
