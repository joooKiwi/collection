package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyArrayList;
import joookiwi.collection.java.extended.ImmutableArrayList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ArrayListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private ArrayListCreator() { throw new ImpossibleConstructionException("The utility class “ArrayListCreator” cannot be constructed.", ArrayListCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// An [EmptyArrayList] instance
    public static <T extends @Nullable Object> EmptyArrayList<T> ArrayList() { return EmptyArrayList.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableArrayList<T> ArrayList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToArrayList.toArrayList(values); }

    public static <T extends @Nullable Object> ImmutableArrayList<T> ArrayList(final @Nullable CollectionHolder<? extends T> values) { return ToArrayList.toArrayList(values); }

    public static <T extends @Nullable Object> ImmutableArrayList<T> ArrayList(final T @Nullable @Unmodifiable [] values) { return ToArrayList.toArrayList(values); }

    public static <T extends @Nullable Object> ImmutableArrayList<T> ArrayList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyArrayList.getInstance();
        if (values.isEmpty())
            return EmptyArrayList.getInstance();
        return new ImmutableArrayList<>(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Facade methods --------------------

}
