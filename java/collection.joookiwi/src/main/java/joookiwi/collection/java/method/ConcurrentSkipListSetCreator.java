package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Comparator;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyConcurrentSkipListSet;
import joookiwi.collection.java.extended.ImmutableConcurrentSkipListSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;

@NotNullByDefault
public final class ConcurrentSkipListSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private ConcurrentSkipListSetCreator() { throw new ImpossibleConstructionException("The utility class “ConcurrentSkipListSetCreator” cannot be constructed.", ConcurrentSkipListSetCreator.class); }

    //#region -------------------- Concurrent skip list set ∅ --------------------

    /// An [EmptyConcurrentSkipListSet] instance
    public static <T extends Comparable<? super T>> EmptyConcurrentSkipListSet<T> ConcurrentSkipListSet() { return EmptyConcurrentSkipListSet.getInstance(); }

    //#endregion -------------------- Concurrent skip list set ∅ --------------------
    //#region -------------------- Concurrent skip list set (comparator) --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final Comparator<? super T> comparator) { return new ImmutableConcurrentSkipListSet<>(comparator); }

    //#endregion -------------------- Concurrent skip list set (comparator) --------------------
    //#region -------------------- Concurrent skip list set (values) --------------------

    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(values); }

    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> values) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(values); }

    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final T @Nullable @Unmodifiable [] values) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(values); }

    public static <T extends Comparable<? super T>> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyConcurrentSkipListSet.getInstance();
        if (values.isEmpty())
            return EmptyConcurrentSkipListSet.getInstance();
        return new ImmutableConcurrentSkipListSet<>(values);
    }

    //#endregion -------------------- Concurrent skip list set (values) --------------------
    //#region -------------------- Concurrent skip list set (values, comparator) --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                              final Comparator<? super T> comparator) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final @Nullable CollectionHolder<? extends T> values,
                                                                              final Comparator<? super T> comparator) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final T @Nullable @Unmodifiable [] values,
                                                                              final Comparator<? super T> comparator) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T> ImmutableConcurrentSkipListSet<T> ConcurrentSkipListSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                              final Comparator<? super T> comparator) {
        if (values == null)
            return new ImmutableConcurrentSkipListSet<>(comparator);
        if (values.isEmpty())
            return new ImmutableConcurrentSkipListSet<>(comparator);
        return new ImmutableConcurrentSkipListSet<>(values);
    }

    //#endregion -------------------- Concurrent skip list set (values, comparator) --------------------

}
