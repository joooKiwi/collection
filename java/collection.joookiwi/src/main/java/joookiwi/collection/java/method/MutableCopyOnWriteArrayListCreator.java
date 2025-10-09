package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableCopyOnWriteArrayList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableCopyOnWriteArrayListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableCopyOnWriteArrayListCreator() { throw new ImpossibleConstructionException("The utility class “MutableCopyOnWriteArrayListCreator” cannot be constructed.", MutableCopyOnWriteArrayListCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableCopyOnWriteArrayList<T> MutableCopyOnWriteArrayList() { return new MutableCopyOnWriteArrayList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCopyOnWriteArrayList<T> MutableCopyOnWriteArrayList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCopyOnWriteArrayList<T> MutableCopyOnWriteArrayList(final @Nullable CollectionHolder<? extends T> values) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCopyOnWriteArrayList<T> MutableCopyOnWriteArrayList(final T @Nullable @Unmodifiable [] values) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCopyOnWriteArrayList<T> MutableCopyOnWriteArrayList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableCopyOnWriteArrayList<>();
        if (values.isEmpty())
            return new MutableCopyOnWriteArrayList<>();
        return new MutableCopyOnWriteArrayList<>(values);
    }

    //#endregion -------------------- values --------------------

}
