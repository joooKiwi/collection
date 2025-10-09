package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableSet;
import joookiwi.collection.java.extended.EmptySet;
import joookiwi.collection.java.extended.ImmutableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class SetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private SetCreator() { throw new ImpossibleConstructionException("The utility class “SetCreator” cannot be constructed.", SetCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptySet] instance
    public static <T extends @Nullable Object> EmptySet<T> Set() { return EmptySet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableSet<T> Set(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToSet.toSet(values); }

    public static <T extends @Nullable Object> ImmutableSet<T> Set(final @Nullable CollectionHolder<? extends T> values) { return ToSet.toSet(values); }

    public static <T extends @Nullable Object> ImmutableSet<T> Set(final T @Nullable @Unmodifiable [] values) { return ToSet.toSet(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableSet<T> Set(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptySet.getInstance();
        if (values.isEmpty())
            return EmptySet.getInstance();
        return new ArrayAsImmutableSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
