package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableSortedSet;
import joookiwi.collection.java.extended.MutableSortedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableSortedSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableSortedSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableSortedSetCreator” cannot be constructed.", MutableSortedSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableSortedSet<T> MutableSortedSet() { return new ArrayAsMutableSortedSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedSet<T> MutableSortedSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableSortedSet.toMutableSortedSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedSet<T> MutableSortedSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableSortedSet.toMutableSortedSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedSet<T> MutableSortedSet(final T @Nullable @Unmodifiable [] values) { return ToMutableSortedSet.toMutableSortedSet(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableSortedSet<T> MutableSortedSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableSortedSet<>();
        if (values.isEmpty())
            return new ArrayAsMutableSortedSet<>();
        return new ArrayAsMutableSortedSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
