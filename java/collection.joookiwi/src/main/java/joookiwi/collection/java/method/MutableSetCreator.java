package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableSet;
import joookiwi.collection.java.extended.MutableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableSetCreator” cannot be constructed.", MutableSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableSet<T> MutableSet() { return new ArrayAsMutableSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSet<T> MutableSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableSet.toMutableSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSet<T> MutableSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableSet.toMutableSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSet<T> MutableSet(final T @Nullable @Unmodifiable [] values) { return ToMutableSet.toMutableSet(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableSet<T> MutableSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableSet<>();
        if (values.isEmpty())
            return new ArrayAsMutableSet<>();
        return new ArrayAsMutableSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
