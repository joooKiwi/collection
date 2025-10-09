package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableSortedSet;
import joookiwi.collection.java.extended.EmptySortedSet;
import joookiwi.collection.java.extended.ImmutableSortedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class SortedSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private SortedSetCreator() { throw new ImpossibleConstructionException("The utility class “SortedSetCreator” cannot be constructed.", SortedSetCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptySortedSet] instance
    public static <T extends @Nullable Object> EmptySortedSet<T> SortedSet() { return EmptySortedSet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableSortedSet<T> SortedSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToSortedSet.toSortedSet(values); }

    public static <T extends @Nullable Object> ImmutableSortedSet<T> SortedSet(final @Nullable CollectionHolder<? extends T> values) { return ToSortedSet.toSortedSet(values); }

    public static <T extends @Nullable Object> ImmutableSortedSet<T> SortedSet(final T @Nullable @Unmodifiable [] values) { return ToSortedSet.toSortedSet(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableSortedSet<T> SortedSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptySortedSet.getInstance();
        if (values.isEmpty())
            return EmptySortedSet.getInstance();
        return new ArrayAsImmutableSortedSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
