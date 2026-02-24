package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedSet;
import joookiwi.collection.java.extended.EmptySequencedSet;
import joookiwi.collection.java.extended.ImmutableSequencedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class SequencedSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private SequencedSetCreator() { throw new ImpossibleConstructionException("The utility class “SequencedSetCreator” cannot be constructed.", SequencedSetCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptySequencedSet] instance
    public static <T extends @Nullable Object> EmptySequencedSet<T> SequencedSet() { return EmptySequencedSet.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableSequencedSet<T> SequencedSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToSequencedSet.toSequencedSet(values); }

    public static <T extends @Nullable Object> ImmutableSequencedSet<T> SequencedSet(final @Nullable CollectionHolder<? extends T> values) { return ToSequencedSet.toSequencedSet(values); }

    public static <T extends @Nullable Object> ImmutableSequencedSet<T> SequencedSet(final T @Nullable @Unmodifiable [] values) { return ToSequencedSet.toSequencedSet(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableSequencedSet<T> SequencedSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptySequencedSet.getInstance();
        if (values.isEmpty())
            return EmptySequencedSet.getInstance();
        return new ArrayAsImmutableSequencedSet<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
