package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableList;
import joookiwi.collection.java.extended.MutableList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableListCreator() { throw new ImpossibleConstructionException("The utility class “MutableListCreator” cannot be constructed.", MutableListCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableList<T> MutableList() { return new ArrayAsMutableList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableList<T> MutableList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableList.toMutableList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableList<T> MutableList(final @Nullable CollectionHolder<? extends T> values) { return ToMutableList.toMutableList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableList<T> MutableList(final T @Nullable @Unmodifiable [] values) { return ToMutableList.toMutableList(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableList<T> MutableList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableList<>();
        if (values.isEmpty())
            return new ArrayAsMutableList<>();
        return new ArrayAsMutableList<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
