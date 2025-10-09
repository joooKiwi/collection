package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.EmptyNavigableSet;
import joookiwi.collection.java.extended.ImmutableNavigableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class NavigableSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private NavigableSetCreator() { throw new ImpossibleConstructionException("The utility class “NavigableSetCreator” cannot be constructed.", NavigableSetCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyNavigableSet] instance
    public static <T extends @Nullable Object> EmptyNavigableSet<T> NavigableSet() { return EmptyNavigableSet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableNavigableSet<T> NavigableSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToNavigableSet.toNavigableSet(values); }

    public static <T extends @Nullable Object> ImmutableNavigableSet<T> NavigableSet(final @Nullable CollectionHolder<? extends T> values) { return ToNavigableSet.toNavigableSet(values); }

    public static <T extends @Nullable Object> ImmutableNavigableSet<T> NavigableSet(final T @Nullable @Unmodifiable [] values) { return ToNavigableSet.toNavigableSet(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableNavigableSet<T> NavigableSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyNavigableSet.getInstance();
        if (values.isEmpty())
            return EmptyNavigableSet.getInstance();
        return new ArrayAsImmutableNavigableSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
