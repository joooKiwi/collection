package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyCopyOnWriteArraySet;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArraySet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class CopyOnWriteArraySetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private CopyOnWriteArraySetCreator() { throw new ImpossibleConstructionException("The utility class “CopyOnWriteArraySetCreator” cannot be constructed.", CopyOnWriteArraySetCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyCopyOnWriteArraySet] instance
    public static <T> EmptyCopyOnWriteArraySet<T> CopyOnWriteArraySet() { return EmptyCopyOnWriteArraySet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T> ImmutableCopyOnWriteArraySet<T> CopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(values); }

    public static <T> ImmutableCopyOnWriteArraySet<T> CopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> values) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(values); }

    public static <T> ImmutableCopyOnWriteArraySet<T> CopyOnWriteArraySet(final T @Nullable @Unmodifiable [] values) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(values); }

    public static <T> ImmutableCopyOnWriteArraySet<T> CopyOnWriteArraySet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyCopyOnWriteArraySet.getInstance();
        if (values.isEmpty())
            return EmptyCopyOnWriteArraySet.getInstance();
        return new ImmutableCopyOnWriteArraySet<>(values);
    }

    //#endregion -------------------- values --------------------

}
