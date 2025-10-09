package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyCopyOnWriteArrayList;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArrayList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class CopyOnWriteArrayListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private CopyOnWriteArrayListCreator() { throw new ImpossibleConstructionException("The utility class “CopyOnWriteArrayListCreator” cannot be constructed.", CopyOnWriteArrayListCreator.class); }

    //#region -------------------- Copy on write array list ∅ --------------------

    /// An [EmptyCopyOnWriteArrayList] instance
    public static <T extends @Nullable Object> EmptyCopyOnWriteArrayList<T> CopyOnWriteArrayList() { return EmptyCopyOnWriteArrayList.getInstance(); }

    //#endregion -------------------- Copy on write array list ∅ --------------------
    //#region -------------------- Copy on write array list (values) --------------------

    public static <T extends @Nullable Object> ImmutableCopyOnWriteArrayList<T> CopyOnWriteArrayList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(values); }

    public static <T extends @Nullable Object> ImmutableCopyOnWriteArrayList<T> CopyOnWriteArrayList(final @Nullable CollectionHolder<? extends T> values) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(values); }

    public static <T extends @Nullable Object> ImmutableCopyOnWriteArrayList<T> CopyOnWriteArrayList(final T @Nullable @Unmodifiable [] values) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(values); }

    public static <T extends @Nullable Object> ImmutableCopyOnWriteArrayList<T> CopyOnWriteArrayList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyCopyOnWriteArrayList.getInstance();
        if (values.isEmpty())
            return EmptyCopyOnWriteArrayList.getInstance();
        return new ImmutableCopyOnWriteArrayList<>(values);
    }

    //#endregion -------------------- Copy on write array list (values) --------------------

}
