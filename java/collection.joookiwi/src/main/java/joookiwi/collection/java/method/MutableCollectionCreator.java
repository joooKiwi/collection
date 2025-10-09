package joookiwi.collection.java.method;

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

import java.util.Collection;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableCollectionCreator() { throw new ImpossibleConstructionException("The utility class “MutableCollectionCreator” cannot be constructed.", MutableCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection() {
        return new ArrayAsMutableCollection<>();
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableCollection.toMutableCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection(final @Nullable CollectionHolder<? extends T> values) { return ToMutableCollection.toMutableCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection(final T @Nullable @Unmodifiable [] values) { return ToMutableCollection.toMutableCollection(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableCollection<T> MutableCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableCollection<>();
        if (values.isEmpty())
            return new ArrayAsMutableCollection<>();
        return new ArrayAsMutableCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
