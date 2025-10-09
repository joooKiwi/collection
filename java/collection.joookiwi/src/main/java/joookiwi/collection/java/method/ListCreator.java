package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableList;
import joookiwi.collection.java.extended.EmptyList;
import joookiwi.collection.java.extended.ImmutableList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private ListCreator() { throw new ImpossibleConstructionException("The utility class “ListCreator” cannot be constructed.", ListCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyList] instance
    public static <T extends @Nullable Object> EmptyList<T> List() { return EmptyList.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableList<T> List(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToList.toList(values); }

    public static <T extends @Nullable Object> ImmutableList<T> List(final @Nullable CollectionHolder<? extends T> values) { return ToList.toList(values); }

    public static <T extends @Nullable Object> ImmutableList<T> List(final T @Nullable @Unmodifiable [] values) { return ToList.toList(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableList<T> List(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyList.getInstance();
        if (values.isEmpty())
            return EmptyList.getInstance();
        return new ArrayAsImmutableList<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
