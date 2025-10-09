package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableCollection;
import joookiwi.collection.java.extended.ArrayAsMutableCollection;
import joookiwi.collection.java.extended.EmptyCollection;
import joookiwi.collection.java.extended.ImmutableCollection;
import joookiwi.collection.java.extended.MutableCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class CollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private CollectionCreator() { throw new ImpossibleConstructionException("The utility class “CollectionCreator” cannot be constructed.", CollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyCollection] instance
    public static <T extends @Nullable Object> EmptyCollection<T> Collection() { return EmptyCollection.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableCollection<T> Collection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToCollection.toCollection(values); }

    public static <T extends @Nullable Object> ImmutableCollection<T> Collection(final @Nullable CollectionHolder<? extends T> values) { return ToCollection.toCollection(values); }

    public static <T extends @Nullable Object> ImmutableCollection<T> Collection(final T @Nullable @Unmodifiable [] values) { return ToCollection.toCollection(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableCollection<T> Collection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyCollection.getInstance();
        if (values.isEmpty())
            return EmptyCollection.getInstance();
        return new ArrayAsImmutableCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
