package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Comparator;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableConcurrentSkipListSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class MutableConcurrentSkipListSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableConcurrentSkipListSetCreator() { throw new ImpossibleConstructionException("The utility class “MutableConcurrentSkipListSetCreator” cannot be constructed.", MutableConcurrentSkipListSetCreator.class); }

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends Comparable<? super T>> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet() { return new MutableConcurrentSkipListSet<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- comparator --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final Comparator<? super T> comparator) { return new MutableConcurrentSkipListSet<>(comparator); }

    //#endregion -------------------- comparator --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> values) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final T @Nullable @Unmodifiable [] values) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends Comparable<? super T>> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableConcurrentSkipListSet<>();
        if (values.isEmpty())
            return new MutableConcurrentSkipListSet<>();
        return new MutableConcurrentSkipListSet<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                                   final Comparator<? super T> comparator) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> values,
                                                                                   final Comparator<? super T> comparator) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final T @Nullable @Unmodifiable [] values,
                                                                                   final Comparator<? super T> comparator) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T> MutableConcurrentSkipListSet<T> MutableConcurrentSkipListSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                                   final Comparator<? super T> comparator) {
        if (values == null)
            return new MutableConcurrentSkipListSet<>(comparator);
        if (values.isEmpty())
            return new MutableConcurrentSkipListSet<>(comparator);
        return new MutableConcurrentSkipListSet<>(values, comparator);
    }

    //#endregion -------------------- values, comparator --------------------

}
