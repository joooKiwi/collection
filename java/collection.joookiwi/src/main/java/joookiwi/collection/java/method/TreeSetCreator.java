package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.EmptyTreeSet;
import joookiwi.collection.java.extended.ImmutableTreeSet;
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
public final class TreeSetCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private TreeSetCreator() { throw new ImpossibleConstructionException("The utility class “TreeSetCreator” cannot be constructed.", TreeSetCreator.class); }

    //#region -------------------- Tree set ∅ --------------------

    /// An [EmptyTreeSet] instance
    public static <T extends @Nullable Object> EmptyTreeSet<T> TreeSet() { return EmptyTreeSet.getInstance(); }

    //#endregion -------------------- Tree set ∅ --------------------
    //#region -------------------- Tree set (comparator) --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> TreeSet(final Comparator<? super T> comparator) { return new ImmutableTreeSet<>(comparator); }

    //#endregion -------------------- Tree set (comparator) --------------------
    //#region -------------------- Tree set (values) --------------------

    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> TreeSet(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToTreeSet.toTreeSet(values); }

    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> TreeSet(final @Nullable CollectionHolder<? extends T> values) { return ToTreeSet.toTreeSet(values); }

    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> TreeSet(final T @Nullable @Unmodifiable [] values) { return ToTreeSet.toTreeSet(values); }

    public static <T extends @Nullable Comparable<? super T>> ImmutableTreeSet<T> TreeSet(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return EmptyTreeSet.getInstance();
        if (values.isEmpty())
            return EmptyTreeSet.getInstance();
        return new ImmutableTreeSet<>(values);
    }

    //#endregion -------------------- Tree set (values) --------------------
    //#region -------------------- Tree set (values, comparator) --------------------

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> TreeSet(final @Nullable MinimalistCollectionHolder<? extends T> values,
                                                                           final Comparator<? super T> comparator) { return ToTreeSet.toTreeSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> TreeSet(final @Nullable CollectionHolder<? extends T> values,
                                                                           final Comparator<? super T> comparator) { return ToTreeSet.toTreeSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> TreeSet(final T @Nullable @Unmodifiable [] values,
                                                                           final Comparator<? super T> comparator) { return ToTreeSet.toTreeSet(values, comparator); }

    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> ImmutableTreeSet<T> TreeSet(final @Nullable @Unmodifiable Collection<? extends T> values,
                                                                           final Comparator<? super T> comparator) {
        if (values == null)
            return new ImmutableTreeSet<>(comparator);
        if (values.isEmpty())
            return new ImmutableTreeSet<>(comparator);
        return new ImmutableTreeSet<>(values);
    }

    //#endregion -------------------- Tree set (values, comparator) --------------------

}
