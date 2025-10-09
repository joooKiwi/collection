package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
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
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class JavaConcurrentSkipListSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaConcurrentSkipListSetCreator() { throw new ImpossibleConstructionException("The utility class “JavaConcurrentSkipListSetCreator” cannot be constructed.", JavaConcurrentSkipListSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends Comparable<? super T>> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet() { return new ConcurrentSkipListSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final Comparator<? super T> comparator) { return new ConcurrentSkipListSet<>(comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new ConcurrentSkipListSet<>();

        final var size = values.size();
        if (size == 0)
            return new ConcurrentSkipListSet<>();

        final var newInstance = new ConcurrentSkipListSet<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return new ConcurrentSkipListSet<>();
        if (values.isEmpty())
            return new ConcurrentSkipListSet<>();
        return new ConcurrentSkipListSet<>(values.toCollection());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new ConcurrentSkipListSet<>();

        final var size = values.length;
        if (size == 0)
            return new ConcurrentSkipListSet<>();

        final var newInstance = new ConcurrentSkipListSet<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ConcurrentSkipListSet<>();
        if (values.isEmpty())
            return new ConcurrentSkipListSet<>();
        return new ConcurrentSkipListSet<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                         final Comparator<? super T> comparator) {
        if (values == null)
            return new ConcurrentSkipListSet<>(comparator);

        final var size = values.size();
        if (size == 0)
            return new ConcurrentSkipListSet<>(comparator);

        final var newInstance = new ConcurrentSkipListSet<T>(comparator);
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_2)
    public static <T> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> values,
                                                                         final Comparator<? super T> comparator) {
        if (values == null)
            return new ConcurrentSkipListSet<>(comparator);
        if (values.isEmpty())
            return new ConcurrentSkipListSet<>(comparator);

        final var newInstance = new ConcurrentSkipListSet<T>(comparator);
        newInstance.addAll(values.toCollection());
        return newInstance;
    }

    @Contract(ALWAYS_NEW_2)
    public static <T> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final T @Nullable @Unmodifiable [] values,
                                                                         final Comparator<? super T> comparator) {
        if (values == null)
            return new ConcurrentSkipListSet<>(comparator);

        final var size = values.length;
        if (size == 0)
            return new ConcurrentSkipListSet<>(comparator);

        final var newInstance = new ConcurrentSkipListSet<T>(comparator);
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_2)
    public static <T> ConcurrentSkipListSet<T> JavaConcurrentSkipListSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                         final Comparator<? super T> comparator) {
        if (values == null)
            return new ConcurrentSkipListSet<>(comparator);
        if (values.isEmpty())
            return new ConcurrentSkipListSet<>(comparator);

        final var newInstance = new ConcurrentSkipListSet<T>(comparator);
        newInstance.addAll(values);
        return newInstance;
    }

    //#endregion -------------------- values, comparator --------------------

}
