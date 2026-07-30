package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableSortedCollection;
import joookiwi.collection.java.extended.EmptySortedCollection;
import joookiwi.collection.java.extended.ImmutableSortedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class SortedCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private SortedCollectionCreator() { throw new ImpossibleConstructionException("The utility class “SortedCollectionCreator” cannot be constructed.", SortedCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptySortedCollection] instance
    public static <T extends @Nullable Object> EmptySortedCollection<T> SortedCollection() { return EmptySortedCollection.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableSortedCollection<T> SortedCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToSortedCollection.toSortedCollection(values); }

    public static <T extends @Nullable Object> ImmutableSortedCollection<T> SortedCollection(final @Nullable CollectionHolder<? extends T> values) { return ToSortedCollection.toSortedCollection(values); }

    public static <T extends @Nullable Object> ImmutableSortedCollection<T> SortedCollection(final T @Nullable @Unmodifiable [] values) { return ToSortedCollection.toSortedCollection(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableSortedCollection<T> SortedCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptySortedCollection.getInstance();
        if (values.isEmpty())
            return EmptySortedCollection.getInstance();
        return new ArrayAsImmutableSortedCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
