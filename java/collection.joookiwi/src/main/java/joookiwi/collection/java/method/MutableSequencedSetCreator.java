package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsMutableSequencedSet;
import joookiwi.collection.java.extended.MutableSequencedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableSequencedSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableSequencedSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableSequencedSetCreator” cannot be constructed.", MutableSequencedSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableSequencedSet<T> MutableSequencedSet() { return new ArrayAsMutableSequencedSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSequencedSet<T> MutableSequencedSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableSequencedSet.toMutableSequencedSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSequencedSet<T> MutableSequencedSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableSequencedSet.toMutableSequencedSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableSequencedSet<T> MutableSequencedSet(final T @Nullable @Unmodifiable [] values) { return ToMutableSequencedSet.toMutableSequencedSet(values); }

    @Contract(ALWAYS_NEW_1)
    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> MutableSequencedSet<T> MutableSequencedSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayAsMutableSequencedSet<>();
        if (values.isEmpty())
            return new ArrayAsMutableSequencedSet<>();
        return new ArrayAsMutableSequencedSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
