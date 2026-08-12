package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableNavigableCollection;
import joookiwi.collection.java.extended.EmptyNavigableCollection;
import joookiwi.collection.java.extended.ImmutableNavigableCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class NavigableCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private NavigableCollectionCreator() { throw new ImpossibleConstructionException("The utility class “NavigableCollectionCreator” cannot be constructed.", NavigableCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyNavigableCollection] instance
    public static <T extends @Nullable Object> EmptyNavigableCollection<T> NavigableCollection() { return EmptyNavigableCollection.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableNavigableCollection<T> NavigableCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToNavigableCollection.toNavigableCollection(values); }

    public static <T extends @Nullable Object> ImmutableNavigableCollection<T> NavigableCollection(final @Nullable CollectionHolder<? extends T> values) { return ToNavigableCollection.toNavigableCollection(values); }

    public static <T extends @Nullable Object> ImmutableNavigableCollection<T> NavigableCollection(final T @Nullable @Unmodifiable [] values) { return ToNavigableCollection.toNavigableCollection(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableNavigableCollection<T> NavigableCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyNavigableCollection.getInstance();
        if (values.isEmpty())
            return EmptyNavigableCollection.getInstance();
        return new ArrayAsImmutableNavigableCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
