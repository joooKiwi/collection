package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
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
public final class JavaCopyOnWriteArrayListCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaCopyOnWriteArrayListCreator() { throw new ImpossibleConstructionException("The utility class “JavaCopyOnWriteArrayListCreator” cannot be constructed.", JavaCopyOnWriteArrayListCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> CopyOnWriteArrayList<T> JavaCopyOnWriteArrayList() { return new CopyOnWriteArrayList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> CopyOnWriteArrayList<T> JavaCopyOnWriteArrayList(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new CopyOnWriteArrayList<>();

        final var size = values.size();
        if (size == 0)
            return new CopyOnWriteArrayList<>(); // We do not keep the empty array any longer.

        @SuppressWarnings("unchecked cast") final var newInstance = (T[]) new Object[size];
        var index = -1;
        while (++index < size)
            newInstance[index] = values.get(index);
        return new CopyOnWriteArrayList<>(newInstance);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> CopyOnWriteArrayList<T> JavaCopyOnWriteArrayList(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return new CopyOnWriteArrayList<>();
        return new CopyOnWriteArrayList<>(values.toArray());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> CopyOnWriteArrayList<T> JavaCopyOnWriteArrayList(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new CopyOnWriteArrayList<>();

        final var size = values.length;
        if (size == 0)
            return new CopyOnWriteArrayList<>(); // We do not keep the empty array any longer.
        return new CopyOnWriteArrayList<>(values);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> CopyOnWriteArrayList<T> JavaCopyOnWriteArrayList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new CopyOnWriteArrayList<>();
        if (values.isEmpty())
            return new CopyOnWriteArrayList<>();
        return new CopyOnWriteArrayList<>(values);
    }

    //#endregion -------------------- values --------------------

}
