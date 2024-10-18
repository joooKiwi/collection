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
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2;

@NotNullByDefault
public final class HasOne
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasOne() { throw new ImpossibleConstructionException("The utility class “HasOne” cannot be constructed.", HasOne.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- iterator --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Iterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Iterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Iterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- iterator --------------------
    //#region -------------------- list iterator --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ListIterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ListIterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ListIterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- list iterator --------------------
    //#region -------------------- spliterator --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Spliterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Spliterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Spliterator<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- spliterator --------------------
    //#region -------------------- enumeration --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Enumeration<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Enumeration<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Enumeration<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- enumeration --------------------

    //#region -------------------- iterable --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Iterable<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<? extends T>)
            return __hasOne(collection, (CollectionHolder<? extends T>) values);
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        if (values instanceof Collection<? extends T>)
            return __hasOne(collection, (Collection<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Iterable<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<? extends T>)
            return __hasOne(collection, (CollectionHolder<? extends T>) values);
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        if (values instanceof Collection<? extends T>)
            return __hasOne(collection, (Collection<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Iterable<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<? extends T>)
            return __hasOne(collection, (CollectionHolder<? extends T>) values);
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        if (values instanceof Collection<? extends T>)
            return __hasOne(collection, (Collection<? extends T>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- iterable --------------------

    //#region -------------------- minimalist collection holder --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<? extends T>)
            return __hasOne(collection, (CollectionHolder<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<? extends T>)
            return __hasOne(collection, (CollectionHolder<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof CollectionHolder<? extends T>)
            return __hasOne(collection, (CollectionHolder<? extends T>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- minimalist collection holder --------------------
    //#region -------------------- collection holder --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable CollectionHolder<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable CollectionHolder<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable CollectionHolder<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- collection holder --------------------

    //#region -------------------- collection --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Collection<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Collection<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Collection<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- collection --------------------
    //#region -------------------- sequenced collection --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SequencedCollection<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SequencedCollection<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable SequencedCollection<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<? extends T>)
            return __hasOne(collection, (List<? extends T>) values);
        return __hasOne(collection, values);
    }

    //#endregion -------------------- sequenced collection --------------------

    //#region -------------------- list --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable List<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable List<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable List<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- list --------------------
    //#region -------------------- array list --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ArrayList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ArrayList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ArrayList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- array list --------------------
    //#region -------------------- copy on write array list --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArrayList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArrayList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable CopyOnWriteArrayList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- copy on write array list --------------------
    //#region -------------------- linked list --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable LinkedList<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- linked list --------------------
    //#region -------------------- vector --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Vector<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Vector<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Vector<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- vector --------------------

    //#region -------------------- set --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Set<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Set<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Set<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SequencedSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SequencedSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable SequencedSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SortedSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SortedSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable SortedSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable NavigableSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable NavigableSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable NavigableSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentSkipListSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentSkipListSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ConcurrentSkipListSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArraySet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable CopyOnWriteArraySet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable CopyOnWriteArraySet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Enum<T>> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable EnumSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Enum<T>> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable EnumSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Enum<T>> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                                     final @Nullable EnumSet<?> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- enum set --------------------
    //#region -------------------- hash set --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable HashSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable HashSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable HashSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedHashSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedHashSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable LinkedHashSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable TreeSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable TreeSet<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable TreeSet<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Queue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Queue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Queue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable BlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable BlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable BlockingQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable TransferQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable TransferQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable TransferQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ArrayBlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ArrayBlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ArrayBlockingQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ConcurrentLinkedQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Delayed> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                     final @Nullable DelayQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Delayed> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                                     final @Nullable DelayQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T extends Delayed> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                                     final @Nullable DelayQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable LinkedBlockingQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedTransferQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedTransferQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable LinkedTransferQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable PriorityBlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable PriorityBlockingQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable PriorityBlockingQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable PriorityQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable PriorityQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable PriorityQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable SynchronousQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable SynchronousQueue<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable SynchronousQueue<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Deque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Deque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Deque<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable BlockingDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable BlockingDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable BlockingDeque<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ArrayDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ArrayDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ArrayDeque<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable ConcurrentLinkedDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable ConcurrentLinkedDeque<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable LinkedBlockingDeque<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        if (values instanceof List<?>)
            return __hasOne(collection, (List<?>) values);
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable LinkedBlockingDeque<? extends T> values) {
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

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable Stack<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable Stack<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable Stack<? extends T> values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    //#endregion -------------------- stack --------------------

    //#region -------------------- array --------------------

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final T @Nullable @Unmodifiable [] values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final @Nullable CollectionHolder<? extends T> collection,
                                     final T @Nullable @Unmodifiable [] values) {
        if (collection == null)
            return false;
        if (values == null)
            return true;
        return __hasOne(collection, values);
    }

    /// Tell that one of the `values` exist in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    @ExtensionFunction
    @Contract(IF_NULL_THEN_FALSE_OR_2ND_NULL_THEN_TRUE_2)
    public static <T> boolean hasOne(final T @Nullable @Unmodifiable [] collection,
                                     final T @Nullable @Unmodifiable [] values) {
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
                                        final @NotNull Iterator<? extends T> values) {
        if (!values.hasNext())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Iterator<? extends T> values) {
        if (!values.hasNext())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), values);
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull Iterator<? extends T> values) {
        if (!values.hasNext())
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values);
    }

    //#endregion -------------------- Core methods (iterator) --------------------
    //#region -------------------- Core methods (spliterator) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Spliterator<? extends T> values) {
        if (values.estimateSize() == 0L)
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromSpliterator(collection, size, values);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Spliterator<? extends T> values) {
        if (values.estimateSize() == 0L)
            return true;
        if (collection.isEmpty())
            return false;
        return __fromSpliterator(collection, collection.size(), values);
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull Spliterator<? extends T> values) {
        if (values.estimateSize() == 0L)
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromSpliterator(collection, size, values);
    }

    //#endregion -------------------- Core methods (spliterator) --------------------
    //#region -------------------- Core methods (enumeration) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Enumeration<? extends T> values) {
        if (!values.hasMoreElements())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromEnumeration(collection, size, values);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Enumeration<? extends T> values) {
        if (!values.hasMoreElements())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromEnumeration(collection, collection.size(), values);
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull Enumeration<? extends T> values) {
        if (!values.hasMoreElements())
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromEnumeration(collection, size, values);
    }

    //#endregion -------------------- Core methods (enumeration) --------------------

    //#region -------------------- Core methods (iterable) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Iterable<? extends T> values) {
        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, iterator);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Iterable<? extends T> values) {
        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), iterator);
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull Iterable<? extends T> values) {
        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromIterator(collection, size, iterator);
    }

    //#endregion -------------------- Core methods (iterable) --------------------

    //#region -------------------- Core methods (minimalist collection holder) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull MinimalistCollectionHolder<? extends T> values) {
        final var valuesSize = values.size();
        if (valuesSize == 0)
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromMinimalistCollectionHolder(collection, size, values, valuesSize);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull MinimalistCollectionHolder<? extends T> values) {
        final var valuesSize = values.size();
        if (valuesSize == 0)
            return true;
        if (collection.isEmpty())
            return false;
        return __fromMinimalistCollectionHolder(collection, collection.size(), values, valuesSize);
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull MinimalistCollectionHolder<? extends T> values) {
        final var valuesSize = values.size();
        if (valuesSize == 0)
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromMinimalistCollectionHolder(collection, size, values, valuesSize);
    }

    //#endregion -------------------- Core methods (minimalist collection holder) --------------------
    //#region -------------------- Core methods (collection holder) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull CollectionHolder<? extends T> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        if (values instanceof RandomAccess)
            return __fromMinimalistCollectionHolder(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull CollectionHolder<? extends T> values) {
        if (values.isEmpty())
            return true;
        if (collection.isEmpty())
            return false;
        if (values instanceof RandomAccess)
            return __fromMinimalistCollectionHolder(collection, collection.size(), values, values.size());
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull CollectionHolder<? extends T> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        if (values instanceof RandomAccess)
            return __fromMinimalistCollectionHolder(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    //#endregion -------------------- Core methods (collection holder) --------------------

    //#region -------------------- Core methods (collection) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull Collection<? extends T> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull Collection<? extends T> values) {
        if (values.isEmpty())
            return true;
        if (collection.isEmpty())
            return false;
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull Collection<? extends T> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromIterator(collection, size, values.iterator());
    }

    //#endregion -------------------- Core methods (collection) --------------------

    //#region -------------------- Core methods (list) --------------------

    private static <T> boolean __hasOne(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                        final @NotNull List<? extends T> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.size();
        if (size == 0)
            return false;
        if (values instanceof RandomAccess)
            return __fromList(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @NotNull List<? extends T> values) {
        if (values.isEmpty())
            return true;
        if (collection.isEmpty())
            return false;
        if (values instanceof RandomAccess)
            return __fromList(collection, collection.size(), values, values.size());
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @NotNull List<? extends T> values) {
        if (values.isEmpty())
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        if (values instanceof RandomAccess)
            return __fromList(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
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
        return __fromArray(collection, size, values, valuesSize);
    }

    private static <T> boolean __hasOne(final @NotNull CollectionHolder<? extends T> collection,
                                        final @Nullable Object @NotNull @Unmodifiable [] values) {
        final var valuesSize = values.length;
        if (valuesSize == 0)
            return true;
        if (collection.isEmpty())
            return false;
        return __fromArray(collection, collection.size(), values, valuesSize);
    }

    private static <T> boolean __hasOne(final T @NotNull @Unmodifiable [] collection,
                                        final @Nullable Object @NotNull @Unmodifiable [] values) {
        final var valuesSize = values.length;
        if (valuesSize == 0)
            return true;

        final var size = collection.length;
        if (size == 0)
            return false;
        return __fromArray(collection, size, values, valuesSize);
    }

    //#endregion -------------------- Core methods (array) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    //README: The iterator always has at least one element

    private static <T> boolean __fromIterator(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                              final int size,
                                              final @NotNull Iterator<? extends T> values) {
        while (values.hasNext()) {
            final var value = values.next();
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }

    private static <T> boolean __fromIterator(final T @NotNull @Unmodifiable [] collection,
                                              final int size,
                                              final @NotNull Iterator<? extends T> values) {
        while (values.hasNext()) {
            final var value = values.next();
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection[index], value))
                    return true;
        }
        return false;
    }


    private static <T> boolean __fromSpliterator(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                 final int size,
                                                 final @NotNull Spliterator<? extends T> values) {
        final var valueReturned = new AtomicBoolean(false);
        final Consumer<T> action = it -> {
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

    private static <T> boolean __fromSpliterator(final T @NotNull @Unmodifiable [] collection,
                                                 final int size,
                                                 final @NotNull Spliterator<? extends T> values) {
        final var valueReturned = new AtomicBoolean(false);
        final Consumer<T> action = it -> {
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection[index], it)) {
                    valueReturned.set(true);
                    return;
                }
        };
        while (true)
            if (!values.tryAdvance(action))
                return valueReturned.get();
    }


    private static <T> boolean __fromEnumeration(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                 final int size,
                                                 final @NotNull Enumeration<? extends T> values) {
        while (values.hasMoreElements()) {
            final var value = values.nextElement();
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection.get(index), value))
                    return true;
        }
        return false;
    }

    private static <T> boolean __fromEnumeration(final T @NotNull @Unmodifiable [] collection,
                                                 final int size,
                                                 final @NotNull Enumeration<? extends T> values) {
        while (values.hasMoreElements()) {
            final var value = values.nextElement();
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection[index], value))
                    return true;
        }
        return false;
    }


    private static <T> boolean __fromMinimalistCollectionHolder(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                final int size,
                                                                final @NotNull MinimalistCollectionHolder<? extends T> values,
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

    private static <T> boolean __fromMinimalistCollectionHolder(final T @NotNull @Unmodifiable [] collection,
                                                                final int size,
                                                                final @NotNull MinimalistCollectionHolder<? extends T> values,
                                                                final int valuesSize) {
        var valuesIndex = -1;
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection[index], value))
                    return true;
        }
        return false;
    }


    private static <T> boolean __fromList(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                          final int size,
                                          final @NotNull List<? extends T> values,
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

    private static <T> boolean __fromList(final T @NotNull @Unmodifiable [] collection,
                                          final int size,
                                          final @NotNull List<? extends T> values,
                                          final int valuesSize) {
        var valuesIndex = -1;
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection[index], value))
                    return true;
        }
        return false;
    }


    private static <T> boolean __fromArray(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                           final int size,
                                           final T @NotNull @Unmodifiable [] values,
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

    private static <T> boolean __fromArray(final T @NotNull @Unmodifiable [] collection,
                                           final int size,
                                           final T @NotNull @Unmodifiable [] values,
                                           final int valuesSize) {
        var valuesIndex = -1;
        while (++valuesIndex < valuesSize) {
            final var value = values[valuesIndex];
            var index = -1;
            while (++index < size)
                if (Objects.deepEquals(collection[index], value))
                    return true;
        }
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
