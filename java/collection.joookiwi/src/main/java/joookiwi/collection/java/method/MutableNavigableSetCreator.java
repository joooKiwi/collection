package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableNavigableSet;
import joookiwi.collection.java.extended.MutableNavigableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableNavigableSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableNavigableSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableNavigableSetCreator” cannot be constructed.", MutableNavigableSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableNavigableSet<T> MutableNavigableSet() { return new ArrayAsMutableNavigableSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableNavigableSet<T> MutableNavigableSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableNavigableSet.toMutableNavigableSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableNavigableSet<T> MutableNavigableSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableNavigableSet.toMutableNavigableSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableNavigableSet<T> MutableNavigableSet(final T @Nullable @Unmodifiable [] values) { return ToMutableNavigableSet.toMutableNavigableSet(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableNavigableSet<T> MutableNavigableSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableNavigableSet<>();
        if (values.isEmpty())
            return new ArrayAsMutableNavigableSet<>();
        return new ArrayAsMutableNavigableSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
