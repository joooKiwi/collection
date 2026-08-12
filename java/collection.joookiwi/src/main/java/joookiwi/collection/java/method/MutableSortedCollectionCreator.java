package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableSortedCollection;
import joookiwi.collection.java.extended.MutableSortedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableSortedCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableSortedCollectionCreator() { throw new ImpossibleConstructionException("The utility class “MutableSortedCollectionCreator” cannot be constructed.", MutableSortedCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableSortedCollection<T> MutableSortedCollection() { return new ArrayAsMutableSortedCollection<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedCollection<T> MutableSortedCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableSortedCollection.toMutableSortedCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedCollection<T> MutableSortedCollection(final @Nullable CollectionHolder<? extends T> values) { return ToMutableSortedCollection.toMutableSortedCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSortedCollection<T> MutableSortedCollection(final T @Nullable @Unmodifiable [] values) { return ToMutableSortedCollection.toMutableSortedCollection(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableSortedCollection<T> MutableSortedCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableSortedCollection<>();
        if (values.isEmpty())
            return new ArrayAsMutableSortedCollection<>();
        return new ArrayAsMutableSortedCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
