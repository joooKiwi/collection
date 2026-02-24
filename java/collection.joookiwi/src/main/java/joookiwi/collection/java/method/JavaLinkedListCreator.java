package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.LinkedList;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class JavaLinkedListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaLinkedListCreator() { throw new ImpossibleConstructionException("The utility class “JavaLinkedListCreator” cannot be constructed.", JavaLinkedListCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> LinkedList<T> JavaLinkedList() { return new LinkedList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> LinkedList<T> JavaLinkedList(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new LinkedList<>();

        final var size = values.size();
        if (size == 0)
            return new LinkedList<>(); // We do not keep the empty array any longer.

        final var newInstance = new LinkedList<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> LinkedList<T> JavaLinkedList(final @Nullable CollectionHolder<T> values) {
        if (values == null)
            return new LinkedList<>();
        return new LinkedList<>(values.toCollection());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> LinkedList<T> JavaLinkedList(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new LinkedList<>();

        final var size = values.length;
        if (size == 0)
            return new LinkedList<>(); // We do not keep the empty array any longer.

        final var newInstance = new LinkedList<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> LinkedList<T> JavaLinkedList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new LinkedList<>();
        if (values.isEmpty())
            return new LinkedList<>();
        return new LinkedList<>(values);
    }

    //#endregion -------------------- values --------------------

}
