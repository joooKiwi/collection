package joookiwi.collection.java.method;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2;

public final class HasOne
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasOne() { throw new ImpossibleConstructionException("The utility class “HasOne” cannot be constructed.", HasOne.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- iterator --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Iterator<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Iterator<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- iterator --------------------
    //#region -------------------- list iterator --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ListIterator<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ListIterator<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- list iterator --------------------
    //#region -------------------- spliterator --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Spliterator<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Spliterator<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- spliterator --------------------
    //#region -------------------- enumeration --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Enumeration<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Enumeration<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- enumeration --------------------

    //#region -------------------- iterable --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Iterable<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<?>)
            return __hasOne(collection, (CollectionHolder<?>) values);
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        if (values instanceof Collection<?>)
            return __hasOne(collection, (Collection<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Iterable<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<?>)
            return __hasOne(collection, (CollectionHolder<?>) values);
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        if (values instanceof Collection<?>)
            return __hasOne(collection, (Collection<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- iterable --------------------

    //#region -------------------- minimalist collection holder --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable MinimalistCollectionHolder<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<?>)
            return __hasOne(collection, (CollectionHolder<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable MinimalistCollectionHolder<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<?>)
            return __hasOne(collection, (CollectionHolder<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- minimalist collection holder --------------------
    //#region -------------------- collection holder --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable CollectionHolder<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable CollectionHolder<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- collection holder --------------------

    //#region -------------------- collection --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Collection<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Collection<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- collection --------------------
    //#region -------------------- sequenced collection --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SequencedCollection<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SequencedCollection<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- sequenced collection --------------------

    //#region -------------------- list --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable List<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable List<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- list --------------------
    //#region -------------------- array list --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ArrayList<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ArrayList<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- array list --------------------
    //#region -------------------- copy on write array list --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArrayList<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArrayList<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- copy on write array list --------------------
    //#region -------------------- linked list --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedList<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedList<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- linked list --------------------
    //#region -------------------- vector --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Vector<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Vector<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- vector --------------------

    //#region -------------------- set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Set<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Set<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- set --------------------
    //#region -------------------- sequenced set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SequencedSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SequencedSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- sequenced set --------------------
    //#region -------------------- sorted set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SortedSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SortedSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- sorted set --------------------
    //#region -------------------- navigable set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable NavigableSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable NavigableSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- navigable set --------------------
    //#region -------------------- concurrent skip list set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentSkipListSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentSkipListSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- concurrent skip list set --------------------
    //#region -------------------- copy on write array set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArraySet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArraySet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- copy on write array set --------------------
    //#region -------------------- enum set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Enum<T>> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable EnumSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Enum<T>> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable EnumSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- enum set --------------------
    //#region -------------------- hash set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable HashSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable HashSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- hash set --------------------
    //#region -------------------- linked hash set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedHashSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedHashSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- linked hash set --------------------
    //#region -------------------- tree set --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable TreeSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable TreeSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- tree set --------------------

    //#region -------------------- queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Queue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Queue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- queue --------------------
    //#region -------------------- blocking queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable BlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable BlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- blocking queue --------------------
    //#region -------------------- transfer queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable TransferQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable TransferQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- transfer queue --------------------
    //#region -------------------- array blocking queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ArrayBlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ArrayBlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- array blocking queue --------------------
    //#region -------------------- concurrent linked queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- concurrent linked queue --------------------
    //#region -------------------- delay queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Delayed> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable DelayQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Delayed> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable DelayQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- delay queue --------------------
    //#region -------------------- linked blocking queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- linked blocking queue --------------------
    //#region -------------------- linked transfer queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedTransferQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedTransferQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- linked transfer queue --------------------
    //#region -------------------- priority blocking queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable PriorityBlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable PriorityBlockingQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- priority blocking queue --------------------
    //#region -------------------- priority queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable PriorityQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable PriorityQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- priority queue --------------------
    //#region -------------------- synchronous queue --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SynchronousQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SynchronousQueue<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- synchronous queue --------------------

    //#region -------------------- deque --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Deque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Deque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- deque --------------------
    //#region -------------------- blocking deque --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable BlockingDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable BlockingDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- blocking deque --------------------
    //#region -------------------- array deque --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ArrayDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ArrayDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- array deque --------------------
    //#region -------------------- concurrent linked deque --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- concurrent linked deque --------------------
    //#region -------------------- linked blocking deque --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingDeque<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- linked blocking deque --------------------
    //#region -------------------- stack --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Stack<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Stack<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- stack --------------------

    //#region -------------------- array --------------------

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Object @Nullable @Unmodifiable [] values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /**
     * Tell whenever at least one value exist in the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param values     The values to compare
     */
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Object @Nullable @Unmodifiable [] values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- array --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (iterator) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Iterator<?> values) {
        if (!values.hasNext())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Iterator<?> values) {
        if (!values.hasNext())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), values);
    }

    //#endregion -------------------- Core methods (iterator) --------------------
    //#region -------------------- Core methods (spliterator) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Spliterator<?> values) {
        if (values.estimateSize() == 0L)
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Spliterator<?> values) {
        if (values.estimateSize() == 0L)
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), values);
    }

    //#endregion -------------------- Core methods (spliterator) --------------------
    //#region -------------------- Core methods (enumeration) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Enumeration<?> values) {
        if (!values.hasMoreElements())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Enumeration<?> values) {
        if (!values.hasMoreElements())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), values);
    }

    //#endregion -------------------- Core methods (enumeration) --------------------

    //#region -------------------- Core methods (iterable) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Iterable<?> values) {
        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, iterator);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Iterable<?> values) {
        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), iterator);
    }

    //#endregion -------------------- Core methods (iterable) --------------------

    //#region -------------------- Core methods (minimalist collection holder) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull MinimalistCollectionHolder<?> values) {
        final var valuesSize = values.size();
        if (valuesSize == 0)
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromNotIterator(collection, size, values, valuesSize);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull MinimalistCollectionHolder<?> values) {
        final var valuesSize = values.size();
        if (valuesSize == 0)
            return true;
        if (collection.isEmpty())
            return false;
        return __fromNotIterator(collection, collection.size(), values, valuesSize);
    }

    //#endregion -------------------- Core methods (minimalist collection holder) --------------------
    //#region -------------------- Core methods (collection holder) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull CollectionHolder<?> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        if (values instanceof RandomAccess)
            return __fromNotIterator(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull CollectionHolder<?> values) {
        if (values.isEmpty())
            return true;
        if (collection.isEmpty())
            return false;
        if (values instanceof RandomAccess)
            return __fromNotIterator(collection, collection.size(), values, values.size());
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    //#endregion -------------------- Core methods (collection holder) --------------------

    //#region -------------------- Core methods (collection) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Collection<?> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Collection<?> values) {
        if (values.isEmpty())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    //#endregion -------------------- Core methods (collection) --------------------

    //#region -------------------- Core methods (list) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull List<?> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        if (values instanceof RandomAccess)
            return __fromNotIterator(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull List<?> values) {
        if (values.isEmpty())
            return true;
        if (collection.isEmpty())
            return false;
        if (values instanceof RandomAccess)
            return __fromNotIterator(collection, collection.size(), values, values.size());
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    //#endregion -------------------- Core methods (list) --------------------

    //#region -------------------- Core methods (array) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @Nullable Object @NotNull @Unmodifiable [] values) {
        final var valuesSize = values.length;
        if (valuesSize == 0)
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromNotIterator(collection, size, values, valuesSize);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @Nullable Object @NotNull @Unmodifiable [] values) {
        final var valuesSize = values.length;
        if (valuesSize == 0)
            return true;
        if (collection.isEmpty())
            return false;
        return __fromNotIterator(collection, collection.size(), values, valuesSize);
    }

    //#endregion -------------------- Core methods (array) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    //README: The iterator always has at least one element

    private static boolean __fromIterator(final @NotNull MinimalistCollectionHolder<?> collection,
                                          final int size,
                                          final @NotNull Iterator<?> values) {
        while (values.hasNext()) {
            final var value = values.next();
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }

    private static <U> boolean __fromIterator(final @NotNull MinimalistCollectionHolder<?> collection,
                                              final int size,
                                              final @NotNull Spliterator<U> values) {
        final var valueReturned = new AtomicBoolean(false);
        final var action = (Consumer<? super U>) it -> {
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), it)) {
                    valueReturned.set(true);
                    return;
                }
        };
        while (true)
            if (!values.tryAdvance(action))
                return valueReturned.get();
    }

    private static boolean __fromIterator(final @NotNull MinimalistCollectionHolder<?> collection,
                                          final int size,
                                          final @NotNull Enumeration<?> values) {
        while (values.hasMoreElements()) {
            final var value = values.nextElement();
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }


    private static boolean __fromNotIterator(@NotNull MinimalistCollectionHolder<?> collection,
                                             int size,
                                             @NotNull MinimalistCollectionHolder<?> values,
                                             int valuesSize) {
        var valuesIndex = -1;
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }

    private static boolean __fromNotIterator(final @NotNull MinimalistCollectionHolder<?> collection,
                                             final int size,
                                             final @NotNull List<?> values,
                                             final int valuesSize) {
        var valuesIndex = -1;
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }

    private static boolean __fromNotIterator(final @NotNull MinimalistCollectionHolder<?> collection,
                                             final int size,
                                             final @Nullable Object @NotNull @Unmodifiable [] values,
                                             final int valuesSize) {
        var valuesIndex = -1;
        while (++valuesIndex < valuesSize) {
            final var value = values[valuesIndex];
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
