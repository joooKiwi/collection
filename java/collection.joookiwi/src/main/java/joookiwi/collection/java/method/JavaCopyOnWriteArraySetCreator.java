package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
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
public final class JavaCopyOnWriteArraySetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaCopyOnWriteArraySetCreator() { throw new ImpossibleConstructionException("The utility class “JavaCopyOnWriteArraySetCreator” cannot be constructed.", JavaCopyOnWriteArraySetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T> CopyOnWriteArraySet<T> JavaCopyOnWriteArraySet() { return new CopyOnWriteArraySet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> CopyOnWriteArraySet<T> JavaCopyOnWriteArraySet(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new CopyOnWriteArraySet<>();

        final var size = values.size();
        if (size == 0)
            return new CopyOnWriteArraySet<>(); // We do not keep the empty array any longer.

        final var newInstance = new CopyOnWriteArraySet<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T> CopyOnWriteArraySet<T> JavaCopyOnWriteArraySet(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return new CopyOnWriteArraySet<>();
        return new CopyOnWriteArraySet<>(values.toCollection());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T> CopyOnWriteArraySet<T> JavaCopyOnWriteArraySet(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new CopyOnWriteArraySet<>();

        final var size = values.length;
        if (size == 0)
            return new CopyOnWriteArraySet<>(); // We do not keep the empty array any longer.

        final var newInstance = new CopyOnWriteArraySet<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T> CopyOnWriteArraySet<T> JavaCopyOnWriteArraySet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new CopyOnWriteArraySet<>();
        if (values.isEmpty())
            return new CopyOnWriteArraySet<>();
        return new CopyOnWriteArraySet<>(values);
    }

    //#endregion -------------------- values --------------------

}
