package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Comparator;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableTreeSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class MutableTreeSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableTreeSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableTreeSetCreator” cannot be constructed.", MutableTreeSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Comparable<? super T>> MutableTreeSet<T> MutableTreeSet() { return new MutableTreeSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableTreeSet<T> MutableTreeSet(final Comparator<? super T> comparator) { return new MutableTreeSet<>(comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> MutableTreeSet<T> MutableTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableTreeSet.toMutableTreeSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> MutableTreeSet<T> MutableTreeSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableTreeSet.toMutableTreeSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> MutableTreeSet<T> MutableTreeSet(final T @Nullable @Unmodifiable [] values) { return ToMutableTreeSet.toMutableTreeSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Comparable<? super T>> MutableTreeSet<T> MutableTreeSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableTreeSet<>();
        if (values.isEmpty())
            return new MutableTreeSet<>();
        return new MutableTreeSet<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableTreeSet<T> MutableTreeSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                final Comparator<? super T> comparator) { return ToMutableTreeSet.toMutableTreeSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableTreeSet<T> MutableTreeSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                final Comparator<? super T> comparator) { return ToMutableTreeSet.toMutableTreeSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableTreeSet<T> MutableTreeSet(final T @Nullable @Unmodifiable [] values,
                                                                                final Comparator<? super T> comparator) { return ToMutableTreeSet.toMutableTreeSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> MutableTreeSet<T> MutableTreeSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                final Comparator<? super T> comparator) {
        if (values == null)
            return new MutableTreeSet<>(comparator);
        if (values.isEmpty())
            return new MutableTreeSet<>(comparator);
        return new MutableTreeSet<>(values, comparator);
    }

    //#endregion -------------------- values, comparator --------------------

}
