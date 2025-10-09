package joookiwi.collection.java.method;

import java.util.Collection;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyLinkedList;
import joookiwi.collection.java.extended.ImmutableLinkedList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class LinkedListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private LinkedListCreator() { throw new ImpossibleConstructionException("The utility class “LinkedListCreator” cannot be constructed.", LinkedListCreator.class); }

    //#region -------------------- ∅ --------------------

    /// An [EmptyLinkedList] instance
    public static <T extends @Nullable Object> EmptyLinkedList<T> LinkedList() { return EmptyLinkedList.getInstance(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    public static <T extends @Nullable Object> ImmutableLinkedList<T> LinkedList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToLinkedList.toLinkedList(values); }

    public static <T extends @Nullable Object> ImmutableLinkedList<T> LinkedList(final @Nullable CollectionHolder<? extends T> values) { return ToLinkedList.toLinkedList(values); }

    public static <T extends @Nullable Object> ImmutableLinkedList<T> LinkedList(final T @Nullable @Unmodifiable [] values) { return ToLinkedList.toLinkedList(values); }

    public static <T extends @Nullable Object> ImmutableLinkedList<T> LinkedList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyLinkedList.getInstance();
        if (values.isEmpty())
            return EmptyLinkedList.getInstance();
        return new ImmutableLinkedList<>(values);
    }

    //#endregion -------------------- values --------------------

}
