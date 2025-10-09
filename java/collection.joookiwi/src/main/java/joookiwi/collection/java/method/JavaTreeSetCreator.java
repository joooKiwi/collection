package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
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
public final class JavaTreeSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaTreeSetCreator() { throw new ImpossibleConstructionException("The utility class “JavaTreeSetCreator” cannot be constructed.", JavaTreeSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Comparable<? super T>> TreeSet<T> JavaTreeSet() { return new TreeSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> TreeSet<T> JavaTreeSet(final Comparator<? super T> comparator) { return new TreeSet<>(comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> TreeSet<T> JavaTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new TreeSet<>();

        final var size = values.size();
        if (size == 0)
            return new TreeSet<>();

        final var newInstance = new TreeSet<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> TreeSet<T> JavaTreeSet(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return new TreeSet<>();
        if (values.isEmpty())
            return new TreeSet<>();
        return new TreeSet<>(values.toCollection());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> TreeSet<T> JavaTreeSet(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new TreeSet<>();

        final var size = values.length;
        if (size == 0)
            return new TreeSet<>();

        final var newInstance = new TreeSet<T>();
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> TreeSet<T> JavaTreeSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new TreeSet<>();
        if (values.isEmpty())
            return new TreeSet<>();
        return new TreeSet<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> TreeSet<T> JavaTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                      final Comparator<? super T> comparator) {
        if (values == null)
            return new TreeSet<>(comparator);

        final var size = values.size();
        if (size == 0)
            return new TreeSet<>(comparator);

        final var newInstance = new TreeSet<T>(comparator);
        var index = -1;
        while (++index < size)
            newInstance.add(values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> TreeSet<T> JavaTreeSet(final @Nullable CollectionHolder<? extends T> values,
                                                                      final Comparator<? super T> comparator) {
        if (values == null)
            return new TreeSet<>(comparator);
        if (values.isEmpty())
            return new TreeSet<>(comparator);

        final var newInstance = new TreeSet<T>(comparator);
        newInstance.addAll(values.toCollection());
        return newInstance;
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> TreeSet<T> JavaTreeSet(final T @Nullable @Unmodifiable [] values,
                                                                      final Comparator<? super T> comparator) {
        if (values == null)
            return new TreeSet<>(comparator);

        final var size = values.length;
        if (size == 0)
            return new TreeSet<>(comparator);

        final var newInstance = new TreeSet<T>(comparator);
        var index = -1;
        while (++index < size)
            newInstance.add(values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> TreeSet<T> JavaTreeSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                      final Comparator<? super T> comparator) {
        if (values == null)
            return new TreeSet<>(comparator);
        if (values.isEmpty())
            return new TreeSet<>(comparator);

        final var newInstance = new TreeSet<T>(comparator);
        newInstance.addAll(values);
        return newInstance;
    }

    //#endregion -------------------- values, comparator --------------------

}
