package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_ONLY_2ND_NULL_THEN_FALSE_2;

@NotNullByDefault
public final class HasNotAll
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasNotAll() { throw new ImpossibleConstructionException("The utility class “HasNotAll” cannot be constructed.", HasNotAll.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- iterator --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    //#endregion -------------------- iterator --------------------
    //#region -------------------- list iterator --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    //#endregion -------------------- list iterator --------------------
    //#region -------------------- spliterator --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return false;
        if (values.estimateSize() == 0L)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return false;
        if (values.estimateSize() == 0L)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return false;
        if (values.estimateSize() == 0L)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    //#endregion -------------------- spliterator --------------------
    //#region -------------------- enumeration --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasMoreElements())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasMoreElements())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasMoreElements())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    //#endregion -------------------- enumeration --------------------

    //#region -------------------- iterable --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return false;
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsCollectionHolder);
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsList);
        if (values instanceof Collection<? extends T> valuesAsCollection)
            if (valuesAsCollection.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, values.iterator());

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, iterator);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return false;
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsCollectionHolder);
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsList);
        if (values instanceof Collection<? extends T> valuesAsCollection)
            if (valuesAsCollection.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, values.iterator());

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, iterator);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return false;
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsCollectionHolder);
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsList);
        if (values instanceof Collection<? extends T> valuesAsCollection)
            if (valuesAsCollection.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, values.iterator());

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, iterator);
    }

    //#endregion -------------------- iterable --------------------

    //#region -------------------- minimalist collection holder --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsCollectionHolder);

        final var valuesSize = values.size();
        if (valuesSize == 0)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values, valuesSize);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsCollectionHolder);

        final var valuesSize = values.size();
        if (valuesSize == 0)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values, valuesSize);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values instanceof CollectionHolder<? extends T> valuesAsCollectionHolder)
            if (valuesAsCollectionHolder.isEmpty())
                return false;
            else if (collection == null)
                return true;
            else
                return __validate(collection, valuesAsCollectionHolder);

        final var valuesSize = values.size();
        if (valuesSize == 0)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values, valuesSize);
    }

    //#endregion -------------------- minimalist collection holder --------------------
    //#region -------------------- collection holder --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    //#endregion -------------------- collection holder --------------------

    //#region -------------------- collection --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<? extends T>)
            return __validate(collection, (List<? extends T>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<? extends T>)
            return __validate(collection, (List<? extends T>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<? extends T>)
            return __validate(collection, (List<? extends T>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- collection --------------------
    //#region -------------------- sequenced collection --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable SequencedCollection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<? extends T>)
            return __validate(collection, (List<? extends T>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable SequencedCollection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<? extends T>)
            return __validate(collection, (List<? extends T>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable SequencedCollection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<? extends T>)
            return __validate(collection, (List<? extends T>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- sequenced collection --------------------

    //#region -------------------- list --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values);
    }

    //#endregion -------------------- list --------------------

    //#region -------------------- set --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Set<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Set<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable Set<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- set --------------------
    //#region -------------------- sequenced set --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable SequencedSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable SequencedSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable SequencedSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- sequenced set --------------------
    //#region -------------------- sorted set --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable SortedSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable SortedSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable SortedSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- sorted set --------------------
    //#region -------------------- navigable set --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable NavigableSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable NavigableSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable NavigableSet<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- navigable set --------------------

    //#region -------------------- queue --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Queue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Queue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable Queue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- queue --------------------
    //#region -------------------- blocking queue --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                        final @Nullable @Unmodifiable BlockingQueue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                        final @Nullable @Unmodifiable BlockingQueue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                        final @Nullable @Unmodifiable BlockingQueue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- blocking queue --------------------
    //#region -------------------- transfer queue --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                        final @Nullable @Unmodifiable TransferQueue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                        final @Nullable @Unmodifiable TransferQueue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                        final @Nullable @Unmodifiable TransferQueue<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- transfer queue --------------------

    //#region -------------------- deque --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Deque<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final @Nullable @Unmodifiable Deque<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final @Nullable @Unmodifiable Deque<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- deque --------------------
    //#region -------------------- blocking deque --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                        final @Nullable @Unmodifiable BlockingDeque<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                        final @Nullable @Unmodifiable BlockingDeque<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                        final @Nullable @Unmodifiable BlockingDeque<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;
        if (collection == null)
            return true;
        if (values instanceof List<?>)
            return __validate(collection, (List<?>) values);
        return __validate(collection, values.iterator());
    }

    //#endregion -------------------- blocking deque --------------------

    //#region -------------------- array --------------------

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                 final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return false;

        final var valuesSize = values.length;
        if (valuesSize == 0)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values, valuesSize);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final @Nullable CollectionHolder<? extends T> collection,
                                                                 final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return false;

        final var valuesSize = values.length;
        if (valuesSize == 0)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values, valuesSize);
    }

    /// Tell that not a single item in the `values` the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param values     The values to compare
    /// @param <T>        The `collection` type
    @ExtensionFunction
    @Contract(IF_ONLY_2ND_NULL_THEN_FALSE_2)
    public static <T extends @Nullable Object> boolean hasNotAll(final T @Nullable @Unmodifiable [] collection,
                                                                 final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return false;

        final var valuesSize = values.length;
        if (valuesSize == 0)
            return false;
        if (collection == null)
            return true;
        return __validate(collection, values, valuesSize);
    }

    //#endregion -------------------- array --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- Core methods (iterator) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final Iterator<? extends T> values) {
        final var size = collection.size();
        if (size == 0)
            return true;
        return __fromIterator(collection, size, values);
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final Iterator<? extends T> values) {
        if (collection.isEmpty())
            return true;
        return __fromIterator(collection, collection.size(), values);
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final Iterator<? extends T> values) {
        final var size = collection.length;
        if (size == 0)
            return true;
        return __fromIterator(collection, size, values);
    }

    //#endregion -------------------- Core methods (iterator) --------------------
    //#region -------------------- Core methods (spliterator) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final Spliterator<? extends T> values) {
        final var size = collection.size();
        if (size == 0)
            return true;
        return __fromSpliterator(collection, size, values);
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final Spliterator<? extends T> values) {
        if (collection.isEmpty())
            return true;
        return __fromSpliterator(collection, collection.size(), values);
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final Spliterator<? extends T> values) {
        final var size = collection.length;
        if (size == 0)
            return true;
        return __fromSpliterator(collection, size, values);
    }

    //#endregion -------------------- Core methods (spliterator) --------------------
    //#region -------------------- Core methods (enumeration) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final Enumeration<? extends T> values) {
        final var size = collection.size();
        if (size == 0)
            return true;
        return __fromEnumeration(collection, size, values);
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final Enumeration<? extends T> values) {
        if (collection.isEmpty())
            return true;
        return __fromEnumeration(collection, collection.size(), values);
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final Enumeration<? extends T> values) {
        final var size = collection.length;
        if (size == 0)
            return true;
        return __fromEnumeration(collection, size, values);
    }

    //#endregion -------------------- Core methods (enumeration) --------------------

    //#region -------------------- Core methods (minimalist collection holder) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final MinimalistCollectionHolder<? extends T> values,
                                                                   final int valuesSize) {
        final var size = collection.size();
        if (size == 0)
            return true;
        return __fromMinimalistCollectionHolder(collection, size, values, valuesSize);
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final MinimalistCollectionHolder<? extends T> values,
                                                                   final int valuesSize) {
        if (collection.isEmpty())
            return true;
        return __fromMinimalistCollectionHolder(collection, collection.size(), values, valuesSize);
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final MinimalistCollectionHolder<? extends T> values,
                                                                   final int valuesSize) {
        final var size = collection.length;
        if (size == 0)
            return true;
        return __fromMinimalistCollectionHolder(collection, size, values, valuesSize);
    }

    //#endregion -------------------- Core methods (minimalist collection holder) --------------------
    //#region -------------------- Core methods (collection holder) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final CollectionHolder<? extends T> values) {
        final var size = collection.size();
        if (size == 0)
            return true;
        if (values instanceof RandomAccess)
            return __fromMinimalistCollectionHolder(collection, size, values, values.size());
        return __fromIterator(collection, size, values.toIterator());
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final CollectionHolder<? extends T> values) {
        if (collection.isEmpty())
            return true;
        if (values instanceof RandomAccess)
            return __fromMinimalistCollectionHolder(collection, collection.size(), values, values.size());
        return __fromIterator(collection, collection.size(), values.toIterator());
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final CollectionHolder<? extends T> values) {
        final var size = collection.length;
        if (size == 0)
            return true;
        if (values instanceof RandomAccess)
            return __fromMinimalistCollectionHolder(collection, size, values, values.size());
        return __fromIterator(collection, size, values.toIterator());
    }

    //#endregion -------------------- Core methods (collection holder) --------------------

    //#region -------------------- Core methods (list) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final @Unmodifiable List<? extends T> values) {
        final var size = collection.size();
        if (size == 0)
            return true;
        if (values instanceof RandomAccess)
            return __fromList(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final @Unmodifiable List<? extends T> values) {
        if (collection.isEmpty())
            return true;
        if (values instanceof RandomAccess)
            return __fromList(collection, collection.size(), values, values.size());
        return __fromIterator(collection, collection.size(), values.iterator());
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final @Unmodifiable List<? extends T> values) {
        final var size = collection.length;
        if (size == 0)
            return true;
        if (values instanceof RandomAccess)
            return __fromList(collection, size, values, values.size());
        return __fromIterator(collection, size, values.iterator());
    }

    //#endregion -------------------- Core methods (list) --------------------

    //#region -------------------- Core methods (array) --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final T @Unmodifiable [] values,
                                                                   final int valuesSize) {
        final var size = collection.size();
        if (size == 0)
            return true;
        return __fromArray(collection, size, values, valuesSize);
    }

    private static <T extends @Nullable Object> boolean __validate(final CollectionHolder<? extends T> collection,
                                                                   final T @Unmodifiable [] values,
                                                                   final int valuesSize) {
        if (collection.isEmpty())
            return true;
        return __fromArray(collection, collection.size(), values, valuesSize);
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final T @Unmodifiable [] values,
                                                                   final int valuesSize) {
        final var size = collection.length;
        if (size == 0)
            return true;
        return __fromArray(collection, size, values, valuesSize);
    }

    //#endregion -------------------- Core methods (array) --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    //README: The iterator always has at least one element

    private static <T extends @Nullable Object> boolean __fromIterator(final MinimalistCollectionHolder<? extends T> collection,
                                                                       final int size,
                                                                       final Iterator<? extends T> values) {
        valueLoop:
        while (values.hasNext()) {
            final var value = values.next();
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection.get(index), value))
                    continue valueLoop;
            return true;
        }
        return false;
    }

    private static <T extends @Nullable Object> boolean __fromIterator(final T @Unmodifiable [] collection,
                                                                       final int size,
                                                                       final Iterator<? extends T> values) {
        valueLoop:
        while (values.hasNext()) {
            final var value = values.next();
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection[index], value))
                    continue valueLoop;
            return true;
        }
        return false;
    }


    private static <T extends @Nullable Object> boolean __fromSpliterator(final MinimalistCollectionHolder<? extends T> collection,
                                                                          final int size,
                                                                          final Spliterator<? extends T> values) {
        final var valueReturned = new AtomicBoolean(false);
        final Consumer<T> action = it -> {
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection.get(index), it))
                    return;
            valueReturned.set(true);
        };
        while (!valueReturned.get())
            if (!values.tryAdvance(action))
                return false;
        return true;
    }

    private static <T extends @Nullable Object> boolean __fromSpliterator(final T @Unmodifiable [] collection,
                                                                          final int size,
                                                                          final Spliterator<? extends T> values) {
        final var valueReturned = new AtomicBoolean(false);
        final Consumer<T> action = it -> {
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection[index], it))
                    return;
            valueReturned.set(true);
        };
        while (!valueReturned.get())
            if (!values.tryAdvance(action))
                return false;
        return true;
    }


    private static <T extends @Nullable Object> boolean __fromEnumeration(final MinimalistCollectionHolder<? extends T> collection,
                                                                          final int size,
                                                                          final Enumeration<? extends T> values) {
        valueLoop:
        while (values.hasMoreElements()) {
            final var value = values.nextElement();
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection.get(index), value))
                    continue valueLoop;
            return true;
        }
        return false;
    }

    private static <T extends @Nullable Object> boolean __fromEnumeration(final T @Unmodifiable [] collection,
                                                                          final int size,
                                                                          final Enumeration<? extends T> values) {
        valueLoop:
        while (values.hasMoreElements()) {
            final var value = values.nextElement();
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection[index], value))
                    continue valueLoop;
            return true;
        }
        return false;
    }


    private static <T extends @Nullable Object> boolean __fromMinimalistCollectionHolder(final MinimalistCollectionHolder<? extends T> collection,
                                                                                         final int size,
                                                                                         final MinimalistCollectionHolder<? extends T> values,
                                                                                         final int valuesSize) {
        var valuesIndex = -1;
        valueLoop:
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection.get(index), value))
                    continue valueLoop;
            return true;
        }
        return false;
    }

    private static <T extends @Nullable Object> boolean __fromMinimalistCollectionHolder(final T @Unmodifiable [] collection,
                                                                                         final int size,
                                                                                         final MinimalistCollectionHolder<? extends T> values,
                                                                                         final int valuesSize) {
        var valuesIndex = -1;
        valueLoop:
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection[index], value))
                    continue valueLoop;
            return true;
        }
        return false;
    }


    private static <T extends @Nullable Object> boolean __fromList(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final int size,
                                                                   final @Unmodifiable List<? extends T> values,
                                                                   final int valuesSize) {
        var valuesIndex = -1;
        valueLoop:
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection.get(index), value))
                    continue valueLoop;
            return true;
        }
        return false;
    }

    private static <T extends @Nullable Object> boolean __fromList(final T @Unmodifiable [] collection,
                                                                   final int size,
                                                                   final @Unmodifiable List<? extends T> values,
                                                                   final int valuesSize) {
        var valuesIndex = -1;
        valueLoop:
        while (++valuesIndex < valuesSize) {
            final var value = values.get(valuesIndex);
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection[index], value))
                    continue valueLoop;
            return true;
        }
        return false;
    }


    private static <T extends @Nullable Object> boolean __fromArray(final MinimalistCollectionHolder<? extends T> collection,
                                                                    final int size,
                                                                    final T @Unmodifiable [] values,
                                                                    final int valuesSize) {
        var valuesIndex = -1;
        valueLoop:
        while (++valuesIndex < valuesSize) {
            final var value = values[valuesIndex];
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection.get(index), value))
                    continue valueLoop;
            return true;
        }
        return false;
    }

    private static <T extends @Nullable Object> boolean __fromArray(final T @Unmodifiable [] collection,
                                                                    final int size,
                                                                    final T @Unmodifiable [] values,
                                                                    final int valuesSize) {
        var valuesIndex = -1;
        valueLoop:
        while (++valuesIndex < valuesSize) {
            final var value = values[valuesIndex];
            var index = -1;
            while (++index < size)
                if (Objects.equals(collection[index], value))
                    continue valueLoop;
            return true;
        }
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
