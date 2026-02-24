package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedCollection;
import joookiwi.collection.java.extended.EmptySequencedCollection;
import joookiwi.collection.java.extended.ImmutableSequencedCollection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class SequencedCollectionCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private SequencedCollectionCreator() { throw new ImpossibleConstructionException("The utility class “SequencedCollectionCreator” cannot be constructed.", SequencedCollectionCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptySequencedCollection] instance
    public static <T extends @Nullable Object> EmptySequencedCollection<T> SequencedCollection() { return EmptySequencedCollection.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> SequencedCollection(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToSequencedCollection.toSequencedCollection(values); }

    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> SequencedCollection(final @Nullable CollectionHolder<? extends T> values) { return ToSequencedCollection.toSequencedCollection(values); }

    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> SequencedCollection(final T @Nullable @Unmodifiable [] values) { return ToSequencedCollection.toSequencedCollection(values); }

    @SuppressWarnings("unchecked cast")
    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> SequencedCollection(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptySequencedCollection.getInstance();
        if (values.isEmpty())
            return EmptySequencedCollection.getInstance();
        return new ArrayAsImmutableSequencedCollection<>((T[]) values.toArray());
    }

    //#endregion -------------------- values --------------------

}
