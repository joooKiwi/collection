package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableSequencedCollection;
import joookiwi.collection.java.extended.MutableCollection;
import joookiwi.collection.java.extended.MutableSequencedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableSequencedCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableSequencedCollectionCreator() { throw new ImpossibleConstructionException("The utility class “MutableSequencedCollectionCreator” cannot be constructed.", MutableSequencedCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableSequencedCollection<T> MutableSequencedCollection() { return new ArrayAsMutableSequencedCollection<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableSequencedCollection.toMutableSequencedCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection(final @Nullable CollectionHolder<? extends T> values) { return ToMutableSequencedCollection.toMutableSequencedCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSequencedCollection<T> MutableSequencedCollection(final T @Nullable @Unmodifiable [] values) { return ToMutableSequencedCollection.toMutableSequencedCollection(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableSequencedCollection<T> MutableSequencedCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableSequencedCollection<>();
        if (values.isEmpty())
            return new ArrayAsMutableSequencedCollection<>();
        return new ArrayAsMutableSequencedCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
