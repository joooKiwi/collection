package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableNavigableCollection;
import joookiwi.collection.java.extended.MutableNavigableCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableNavigableCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableNavigableCollectionCreator() { throw new ImpossibleConstructionException("The utility class “MutableNavigableCollectionCreator” cannot be constructed.", MutableNavigableCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableNavigableCollection<T> MutableNavigableCollection() { return new ArrayAsMutableNavigableCollection<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableNavigableCollection<T> MutableNavigableCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableNavigableCollection.toMutableNavigableCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableNavigableCollection<T> MutableNavigableCollection(final @Nullable CollectionHolder<? extends T> values) { return ToMutableNavigableCollection.toMutableNavigableCollection(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableNavigableCollection<T> MutableNavigableCollection(final T @Nullable @Unmodifiable [] values) { return ToMutableNavigableCollection.toMutableNavigableCollection(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableNavigableCollection<T> MutableNavigableCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableNavigableCollection<>();
        if (values.isEmpty())
            return new ArrayAsMutableNavigableCollection<>();
        return new ArrayAsMutableNavigableCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
