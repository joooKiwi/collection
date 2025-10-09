package joookiwi.collection.java.method;

import org.jetbrains.annotations.Unmodifiable;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableLinkedList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class MutableLinkedListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableLinkedListCreator() { throw new ImpossibleConstructionException("The utility class “MutableLinkedListCreator” cannot be constructed.", MutableLinkedListCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableLinkedList<T> MutableLinkedList() { return new MutableLinkedList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedList<T> MutableLinkedList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableLinkedList.toMutableLinkedList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedList<T> MutableLinkedList(final @Nullable CollectionHolder<? extends T> values) { return ToMutableLinkedList.toMutableLinkedList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedList<T> MutableLinkedList(final T @Nullable @Unmodifiable [] values) { return ToMutableLinkedList.toMutableLinkedList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableLinkedList<T> MutableLinkedList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableLinkedList<>();
        if (values.isEmpty())
            return new MutableLinkedList<>();
        return new MutableLinkedList<>(values);
    }

    //#endregion -------------------- values --------------------

}
