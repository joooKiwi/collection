package joookiwi.collection.java;

import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.IndexNotFoundException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.extended.ArrayAsMutableBlockingDeque;
import joookiwi.collection.java.extended.ArrayAsMutableBlockingQueue;
import joookiwi.collection.java.extended.ArrayAsMutableCollection;
import joookiwi.collection.java.extended.ArrayAsMutableDeque;
import joookiwi.collection.java.extended.ArrayAsMutableQueue;
import joookiwi.collection.java.extended.ArrayAsMutableSequencedCollection;
import joookiwi.collection.java.extended.ArrayAsMutableTransferQueue;
import joookiwi.collection.java.extended.ImmutableArrayBlockingQueueOf1;
import joookiwi.collection.java.extended.ImmutableArrayDequeOf1;
import joookiwi.collection.java.extended.ImmutableBlockingDequeOf1;
import joookiwi.collection.java.extended.ImmutableBlockingQueueOf1;
import joookiwi.collection.java.extended.ImmutableCollectionOf1;
import joookiwi.collection.java.extended.ImmutableConcurrentLinkedDequeOf1;
import joookiwi.collection.java.extended.ImmutableConcurrentLinkedQueueOf1;
import joookiwi.collection.java.extended.ImmutableDelayQueueOf1;
import joookiwi.collection.java.extended.ImmutableDequeOf1;
import joookiwi.collection.java.extended.ImmutableLinkedBlockingDequeOf1;
import joookiwi.collection.java.extended.ImmutableLinkedBlockingQueueOf1;
import joookiwi.collection.java.extended.ImmutableLinkedTransferQueueOf1;
import joookiwi.collection.java.extended.ImmutablePriorityBlockingQueueOf1;
import joookiwi.collection.java.extended.ImmutablePriorityQueueOf1;
import joookiwi.collection.java.extended.ImmutableQueueOf1;
import joookiwi.collection.java.extended.ImmutableSequencedCollectionOf1;
import joookiwi.collection.java.extended.ImmutableStackOf1;
import joookiwi.collection.java.extended.ImmutableSynchronousQueueOf1;
import joookiwi.collection.java.extended.ImmutableTransferQueueOf1;
import joookiwi.collection.java.extended.MutableArrayBlockingQueue;
import joookiwi.collection.java.extended.MutableArrayDeque;
import joookiwi.collection.java.extended.MutableBlockingDeque;
import joookiwi.collection.java.extended.MutableBlockingQueue;
import joookiwi.collection.java.extended.MutableCollection;
import joookiwi.collection.java.extended.MutableConcurrentLinkedDeque;
import joookiwi.collection.java.extended.MutableConcurrentLinkedQueue;
import joookiwi.collection.java.extended.MutableDelayQueue;
import joookiwi.collection.java.extended.MutableDeque;
import joookiwi.collection.java.extended.MutableLinkedBlockingDeque;
import joookiwi.collection.java.extended.MutableLinkedBlockingQueue;
import joookiwi.collection.java.extended.MutableLinkedTransferQueue;
import joookiwi.collection.java.extended.MutablePriorityBlockingQueue;
import joookiwi.collection.java.extended.MutablePriorityQueue;
import joookiwi.collection.java.extended.MutableQueue;
import joookiwi.collection.java.extended.MutableSequencedCollection;
import joookiwi.collection.java.extended.MutableStack;
import joookiwi.collection.java.extended.MutableSynchronousQueue;
import joookiwi.collection.java.extended.MutableTransferQueue;
import joookiwi.collection.java.extended.list.ArrayAsMutableList;
import joookiwi.collection.java.extended.list.ImmutableArrayListOf1;
import joookiwi.collection.java.extended.list.ImmutableCopyOnWriteArrayListOf1;
import joookiwi.collection.java.extended.list.ImmutableLinkedListOf1;
import joookiwi.collection.java.extended.list.ImmutableListOf1;
import joookiwi.collection.java.extended.list.ImmutableVectorOf1;
import joookiwi.collection.java.extended.list.MutableArrayList;
import joookiwi.collection.java.extended.list.MutableCopyOnWriteArrayList;
import joookiwi.collection.java.extended.list.MutableLinkedList;
import joookiwi.collection.java.extended.list.MutableList;
import joookiwi.collection.java.extended.list.MutableVector;
import joookiwi.collection.java.extended.map.ImmutableConcurrentHashMap;
import joookiwi.collection.java.extended.map.ImmutableConcurrentMap;
import joookiwi.collection.java.extended.map.ImmutableConcurrentNavigableMap;
import joookiwi.collection.java.extended.map.ImmutableConcurrentSkipListMap;
import joookiwi.collection.java.extended.map.ImmutableEnumMap;
import joookiwi.collection.java.extended.map.ImmutableHashMap;
import joookiwi.collection.java.extended.map.ImmutableHashtable;
import joookiwi.collection.java.extended.map.ImmutableIdentityHashMap;
import joookiwi.collection.java.extended.map.ImmutableLinkedHashMap;
import joookiwi.collection.java.extended.map.ImmutableMap;
import joookiwi.collection.java.extended.map.ImmutableNavigableMap;
import joookiwi.collection.java.extended.map.ImmutableSequencedMap;
import joookiwi.collection.java.extended.map.ImmutableSortedMap;
import joookiwi.collection.java.extended.map.ImmutableTreeMap;
import joookiwi.collection.java.extended.map.ImmutableWeakHashMap;
import joookiwi.collection.java.extended.map.MutableConcurrentHashMap;
import joookiwi.collection.java.extended.map.MutableConcurrentMap;
import joookiwi.collection.java.extended.map.MutableConcurrentNavigableMap;
import joookiwi.collection.java.extended.map.MutableConcurrentSkipListMap;
import joookiwi.collection.java.extended.map.MutableEnumMap;
import joookiwi.collection.java.extended.map.MutableHashMap;
import joookiwi.collection.java.extended.map.MutableHashtable;
import joookiwi.collection.java.extended.map.MutableIdentityHashMap;
import joookiwi.collection.java.extended.map.MutableLinkedHashMap;
import joookiwi.collection.java.extended.map.MutableMap;
import joookiwi.collection.java.extended.map.MutableNavigableMap;
import joookiwi.collection.java.extended.map.MutableSequencedMap;
import joookiwi.collection.java.extended.map.MutableSortedMap;
import joookiwi.collection.java.extended.map.MutableTreeMap;
import joookiwi.collection.java.extended.map.MutableWeakHashMap;
import joookiwi.collection.java.extended.set.ArrayAsMutableNavigableSet;
import joookiwi.collection.java.extended.set.ArrayAsMutableSequencedSet;
import joookiwi.collection.java.extended.set.ArrayAsMutableSet;
import joookiwi.collection.java.extended.set.ArrayAsMutableSortedSet;
import joookiwi.collection.java.extended.set.ImmutableConcurrentSkipListSetOf1;
import joookiwi.collection.java.extended.set.ImmutableCopyOnWriteArraySetOf1;
import joookiwi.collection.java.extended.set.ImmutableHashSetOf1;
import joookiwi.collection.java.extended.set.ImmutableLinkedHashSetOf1;
import joookiwi.collection.java.extended.set.ImmutableNavigableSetOf1;
import joookiwi.collection.java.extended.set.ImmutableSequencedSetOf1;
import joookiwi.collection.java.extended.set.ImmutableSetOf1;
import joookiwi.collection.java.extended.set.ImmutableSortedSetOf1;
import joookiwi.collection.java.extended.set.ImmutableTreeSetOf1;
import joookiwi.collection.java.extended.set.MutableConcurrentSkipListSet;
import joookiwi.collection.java.extended.set.MutableCopyOnWriteArraySet;
import joookiwi.collection.java.extended.set.MutableHashSet;
import joookiwi.collection.java.extended.set.MutableLinkedHashSet;
import joookiwi.collection.java.extended.set.MutableNavigableSet;
import joookiwi.collection.java.extended.set.MutableSequencedSet;
import joookiwi.collection.java.extended.set.MutableSet;
import joookiwi.collection.java.extended.set.MutableSortedSet;
import joookiwi.collection.java.extended.set.MutableTreeSet;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import joookiwi.collection.java.optional.EmptyOptional;
import joookiwi.collection.java.optional.Optional;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.String.valueOf;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_POSTFIX_STRING;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_PREFIX_STRING;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_TRUNCATED_STRING;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_1;
import static joookiwi.collection.java.NumericConstants.ZERO_INT;
import static joookiwi.collection.java.helper.NumberComparator.max;
import static joookiwi.collection.java.method.ArrayCreator.Array;
import static joookiwi.collection.java.method.ArrayCreator.sizedArray;
import static joookiwi.collection.java.method.AsString.asLocaleLowerCaseString;
import static joookiwi.collection.java.method.AsString.asLocaleString;
import static joookiwi.collection.java.method.AsString.asLocaleUpperCaseString;
import static joookiwi.collection.java.method.AsString.asLowerCaseString;
import static joookiwi.collection.java.method.AsString.asString;
import static joookiwi.collection.java.method.AsString.asUpperCaseString;

/// A [CollectionHolder] having a single value.
/// No state or reference is held in this instance.
///
/// Most of the methods are being optimized for a single value comparison
/// instead of using the extension function.
///
/// @param <T> The type
/// @see AbstractCollectionHolder
/// @see AbstractCollectionHolderOf2
/// @see CollectionHolderOf1
/// @see LazyCollectionHolderOf1
/// @see ArrayOf1AsCollectionHolder
@NotNullByDefault
public abstract class AbstractCollectionHolderOf1<T extends @Nullable Object>
        extends AbstractUnimplementedCollectionHolder<T>
        implements ClassWith1Value<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractCollectionHolderOf1() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Validate methods (private) --------------------

    /// Validate that the `value` is the same or [Object#equals] to the `instanceValue`
    ///
    /// @param instanceValue The [#value] (_it is to not recall the method unnecessarily_)
    /// @param value         The value to compare
    private static <T extends @Nullable Object> boolean __equals(final T instanceValue, final T value) {
        if (instanceValue == null)
            return value == null;
        if (instanceValue == value)
            return true;
        return instanceValue.equals(value);
    }

    /// Validate that the `value` is the same or [Object#equals] to the internal [#value]
    ///
    /// @param value The value to compare
    private boolean __equals(final T value) {
        final var instanceValue = value();
        if (instanceValue == null)
            return value == null;
        if (instanceValue == value)
            return true;
        return instanceValue.equals(value);
    }


    /// Validate that the value is either 0 or -1
    ///
    /// @param index The value to compare
    /// @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
    private static void __validateIndex(final int index) {
        if (index == 0)
            return;
        if (index == -1)
            return;
        if (index > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (1).", index);
        if (index == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is the size of the collection (1).", index);
        throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” (“" + index + 1 + "” after calculation) is under 0.", index);
    }


    /// Validate if the value is either `null`, 0 or -1
    ///
    /// @param from The value to validate
    /// @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
    private static void __validateStartingIndex(final int from) {
        if (from == 0)
            return;
        if (from == -1)
            return;

        if (from > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” is over the collection size “1”.", from);
        if (from == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” is the collection size “1”.", from);
        throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” (“" + from + 1 + "” after calculation) is under 0.", from);
    }

    /// Validate if the value is either `null`, 0 or -1
    ///
    /// @param from The value to validate
    /// @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
    private static void __validateStartingIndex(final @Nullable Integer from) {
        if (from == null)
            return;

        if (from == 0)
            return;
        if (from == -1)
            return;

        if (from > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” is over the collection size “1”.", from);
        if (from == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” is the collection size “1”.", from);
        throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” (“" + from + 1 + "” after calculation) is under 0.", from);
    }


    /// Validate if the value is either `null`, 0 or -1
    ///
    /// @param to The value to validate
    /// @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
    private static void __validateEndingIndex(final int to) {
        if (to == 0)
            return;
        if (to == -1)
            return;

        if (to > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” is over the collection size “1”.", to);
        if (to == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” is the collection size “1”.", to);
        throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” (“" + to + 1 + "” after calculation) is under 0.", to);
    }

    /// Validate if the value is either `null`, 0 or -1
    ///
    /// @param to The value to validate
    /// @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
    private static void __validateEndingIndex(final @Nullable Integer to) {
        if (to == null)
            return;
        if (to == 0)
            return;
        if (to == -1)
            return;

        if (to > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” is over the collection size “1”.", to);
        if (to == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” is the collection size “1”.", to);
        throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” (“" + to + 1 + "” after calculation) is under 0.", to);
    }


    /// Get the last possible index as either 0 or 1
    ///
    /// @param limit The limit to trimmed (if applicable)
    private static @Range(from = 0, to = 1) int __getLastIndex(final int limit) {
        if (limit >= 1)
            return 1;
        if (limit < -1)
            return 0;
        return 1;
    }


    /// Tell if the value is either 0 or -1
    ///
    /// @param value The value to compare
    private static boolean __isIndexValid(final int value) {
        if (value == 0)
            return true;
        return value == -1;
    }

    /// Tell if the value is either `null`, 0 or -1
    ///
    /// @param value The value to compare
    private static boolean __isIndexValid(final @Nullable Integer value) {
        if (value == null)
            return true;
        if (value == 0)
            return true;
        return value == -1;
    }


    @SuppressWarnings("unchecked cast")
    private static <T extends @Nullable Object> T[] __newArrayOfType(final T value, final int newSize) {
        if (value == null)
            return sizedArray(newSize);
        return Array((Class<? extends T>) value.getClass(), newSize);
    }

    //#endregion -------------------- Validate methods (private) --------------------

    //#region -------------------- Reference methods --------------------

    /// The only value of the current instance 
    @Override public abstract T value();

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 1, to = 1) int size() { return 1; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean isEmpty() { return false; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean isNotEmpty() { return true; }

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasExactly1Element() { return true; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost1Element() { return true; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean hasAtLeast2Elements() { return false; }
    @Contract(ALWAYS_FALSE_0) @Override public boolean hasExactly2Elements() { return false; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost2Elements() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(final int index) {
        if (index == 0)
            return value();
        if (index == -1)
            return value();
        if (index > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (1).", index);
        if (index == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is the size of the collection (1).", index);
        throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” (" + index + 1 + " after calculation) is under 0.", index);
    }

    @Override public final T getFirst() { return value(); }

    @Override public final T getLast() { return value(); }


    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) {
        if (index == 0)
            return value();
        if (index == -1)
            return value();
        return defaultValue.apply(index);
    }

    @Override public T getOrElse(final int index, final Supplier<? extends T> defaultValue) {
        if (index == 0)
            return value();
        if (index == -1)
            return value();
        return defaultValue.get();
    }

    @Override public T getFirstOrElse(final Supplier<? extends T> defaultValue) { return value(); }

    @Override public T getLastOrElse(final Supplier<? extends T> defaultValue) { return value(); }


    @Override public final @Nullable T getOrNull(final int index) {
        if (index == 0)
            return value();
        if (index == -1)
            return value();
        return null;
    }

    @Override public final T getFirstOrNull() { return value(); }

    @Override public final T getLastOrNull() { return value(); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value, 0))
            return value;
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 1);
    }

    @Override public T findFirst(final Predicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value))
            return value;
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 1);
    }

    @Override public T findFirst(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 1);
    }


    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value, 0))
            return value;
        return null;
    }

    @Override public @Nullable T findFirstOrNull(final Predicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value))
            return value;
        return null;
    }

    @Override public @Nullable T findFirstOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        return null;
    }


    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(0, value))
            return value;
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 1);
    }

    @Override public T findFirstIndexed(final IntPredicate predicate) {
        if (predicate.test(0))
            return value();
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 1);
    }

    @Override public T findFirstIndexed(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 1);
    }


    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(0, value))
            return value;
        return null;
    }

    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate predicate) {
        if (predicate.test(0))
            return value();
        return null;
    }

    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        return null;
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    @Override public T findLast(final ObjIntPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value, 0))
            return value;
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 1);
    }

    @Override public T findLast(final Predicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value))
            return value;
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 1);
    }

    @Override public T findLast(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 1);
    }


    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value, 0))
            return value;
        return null;
    }

    @Override public @Nullable T findLastOrNull(final Predicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(value))
            return value;
        return null;
    }

    @Override public @Nullable T findLastOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        return null;
    }


    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(0, value))
            return value;
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 1);
    }

    @Override public T findLastIndexed(final IntPredicate predicate) {
        if (predicate.test(0))
            return value();
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 1);
    }

    @Override public T findLastIndexed(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 1);
    }


    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) {
        final var value = value();
        if (predicate.test(0, value))
            return value;
        return null;
    }

    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate predicate) {
        if (predicate.test(0))
            return value();
        return null;
    }

    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return value();
        return null;
    }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element) {
        if (__equals(element))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }


    @Override public final @Range(from = 0, to = 0) int firstIndexOf(final T element, final int from) {
        __validateStartingIndex(from);
        return firstIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int firstIndexOf(final T element, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return firstIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int firstIndexOf(final T element, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return firstIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int firstIndexOf(final T element, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return firstIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int firstIndexOf(final T element, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return firstIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int firstIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return firstIndexOf(element);
    }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element) {
        if (__equals(element))
            return ZERO_INT;
        return null;
    }


    @Override public final @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final int from) {
        if (!__isIndexValid(from))
            return null;
        return firstIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from) {
        if (!__isIndexValid(from))
            return null;
        return firstIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final int from, final int to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return firstIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final int from, final @Nullable Integer to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return firstIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return firstIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return firstIndexOfOrNull(element);
    }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element) {
        if (__equals(element))
            return ZERO_INT;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }


    @Override public final @Range(from = 0, to = 0) int lastIndexOf(final T element, final int from) {
        __validateStartingIndex(from);
        return lastIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int lastIndexOf(final T element, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return lastIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int lastIndexOf(final T element, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return lastIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int lastIndexOf(final T element, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return lastIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int lastIndexOf(final T element, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return lastIndexOf(element);
    }

    @Override public final @Range(from = 0, to = 0) int lastIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return lastIndexOf(element);
    }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element) {
        if (__equals(element))
            return ZERO_INT;
        return null;
    }


    @Override public final @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final int from) {
        if (!__isIndexValid(from))
            return null;
        return lastIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from) {
        if (!__isIndexValid(from))
            return null;
        return lastIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final int from, final int to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return lastIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final int from, final @Nullable Integer to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return lastIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return lastIndexOfOrNull(element);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        if (!__isIndexValid(from))
            return null;
        if (!__isIndexValid(to))
            return null;
        return lastIndexOfOrNull(element);
    }

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate) {
        if (predicate.test(value(), 0))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate) {
        if (predicate.test(value()))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }


    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirst(predicate);
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate) {
        if (predicate.test(value(), 0))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate) {
        if (predicate.test(value()))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return ZERO_INT;
        return null;
    }


    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstOrNull(predicate);
    }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate) {
        if (predicate.test(0, value()))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate) {
        if (predicate.test(0))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }


    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexed(predicate);
    }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) {
        if (predicate.test(0, value()))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate) {
        if (predicate.test(0))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return ZERO_INT;
        return null;
    }


    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfFirstIndexedOrNull(predicate);
    }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate) {
        if (predicate.test(value(), 0))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate) {
        if (predicate.test(value()))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }


    @Override public final @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLast(predicate);
    }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate) {
        if (predicate.test(value(), 0))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate) {
        if (predicate.test(value()))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return ZERO_INT;
        return null;
    }


    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastOrNull(predicate);
    }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate) {
        if (predicate.test(0, value()))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate) {
        if (predicate.test(0))
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }

    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return 0;
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1);
    }


    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    @Override public final @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexed(predicate);
    }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate) {
        if (predicate.test(0, value()))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate) {
        if (predicate.test(0))
            return ZERO_INT;
        return null;
    }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate) {
        if (predicate.getAsBoolean())
            return ZERO_INT;
        return null;
    }


    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final int from) {
        __validateStartingIndex(from);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        __validateStartingIndex(from);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    @Override public final @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return indexOfLastIndexedOrNull(predicate);
    }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return predicate.test(value(), 0); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return predicate.test(value()); }
    @Override public boolean all(final BooleanSupplier            predicate) { return predicate.getAsBoolean(); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return true;
        return predicate.test(value(), 0);
    }

    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    @Override public boolean any(final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return true;
        return predicate.test(value());
    }

    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    @Override public boolean any(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return true;
        return predicate.getAsBoolean();
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return false;
        return !predicate.test(value(), 0);
    }

    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    @Override public boolean none(final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return false;
        return !predicate.test(value());
    }

    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    @Override public boolean none(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return false;
        return !predicate.getAsBoolean();
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has ‥ --------------------

    @Override public boolean hasNull() {
        return value() == null;
    }

    @Override public boolean hasNoNulls() {
        return value() != null;
    }


    @Contract(ALWAYS_FALSE_0) @Override public boolean hasDuplicate() {
        return false;
    }

    @Contract(ALWAYS_TRUE_0) @Override public boolean hasNoDuplicates() {
        return true;
    }

    //#endregion -------------------- Has ‥ --------------------

    //#region -------------------- Has --------------------

    @Override public boolean has(final T value) { return __equals(value); }

    @Override public boolean hasNot(final T value) { return !__equals(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    @Override public boolean hasOne(final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return true;
        if (!values.hasNext())
            return true;

        final var value = value();
        while (values.hasNext())
            if (__equals(value, values.next()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return true;
        if (!values.hasNext())
            return true;

        final var value = value();
        while (values.hasNext())
            if (__equals(value, values.next()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return true;

        final var value = value();
        final var isEqual = new AtomicBoolean();
        final Consumer<T> isEqualAction = it -> isEqual.set(__equals(value, it));
        var canContinue = true;
        while (canContinue || isEqual.get())
            canContinue = values.tryAdvance(isEqualAction);
        return isEqual.get();
    }

    @Override public boolean hasOne(final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return true;
        if (!values.hasMoreElements())
            return true;

        final var value = value();
        while (values.hasMoreElements())
            if (__equals(value, values.nextElement()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return true;

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;

        final var value = value();
        while (iterator.hasNext())
            if (__equals(value, iterator.next()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return true;

        final var size = values.size();
        if (size == 0)
            return true;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (__equals(value, values.get(index)))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return true;
        if (values.isEmpty())
            return true;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (__equals(value, values.get(index)))
                    return true;
            return false;
        }

        final var iterator = values.toIterator();
        while (iterator.hasNext())
            if (__equals(value, iterator.nextValue()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return true;
        if (values.isEmpty())
            return true;

        final var value = value();
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList instanceof RandomAccess) {
                final var size = values.size();
                var index = -1;
                while (++index < size)
                    if (__equals(value, valuesAsList.get(index)))
                        return true;
                return false;
            }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (__equals(value, iterator.next()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return true;
        if (values.isEmpty())
            return true;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (__equals(value, values.get(index)))
                    return true;
            return false;
        }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (__equals(value, iterator.next()))
                return true;
        return false;
    }

    @Override public boolean hasOne(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return true;

        final var size = values.length;
        if (size == 0)
            return true;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (__equals(value, values[index]))
                return true;
        return false;
    }

    @Override public final boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return hasOne((Collection<? extends T>) values); }
    @Override public final boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                 values) { return hasOne((Collection<? extends T>) values); }
    @Override public final boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return hasOne((Collection<? extends T>) values); }
    @Override public final boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return hasOne((Collection<? extends T>) values); }
    @Override public final boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return hasOne((Collection<? extends T>) values); }
    @Override public final boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>               values) { return hasOne((Collection<? extends T>) values); }
    @Override public final boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>               values) { return hasOne((Collection<? extends T>) values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;

        final var value = value();
        while (values.hasNext())
            if (__equals(value, values.next()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;

        final var value = value();
        while (values.hasNext())
            if (__equals(value, values.next()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return false;

        final var value = value();
        final var isEqual = new AtomicBoolean();
        final Consumer<T> isEqualAction = it -> isEqual.set(__equals(value, it));
        var canContinue = true;
        while (canContinue || isEqual.get())
            canContinue = values.tryAdvance(isEqualAction);
        return !isEqual.get();
    }

    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasMoreElements())
            return false;

        final var value = value();
        while (values.hasMoreElements())
            if (__equals(value, values.nextElement()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return false;

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return false;

        final var value = value();
        while (iterator.hasNext())
            if (__equals(value, iterator.next()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return false;

        final var size = values.size();
        if (size == 0)
            return false;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (__equals(value, values.get(index)))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (__equals(value, values.get(index)))
                    return false;
            return true;
        }

        final var iterator = values.toIterator();
        while (iterator.hasNext())
            if (__equals(value, iterator.nextValue()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;

        final var value = value();
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList instanceof RandomAccess) {
                final var size = values.size();
                var index = -1;
                while (++index < size)
                    if (__equals(value, valuesAsList.get(index)))
                        return false;
                return true;
            }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (__equals(value, iterator.next()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (__equals(value, values.get(index)))
                    return false;
            return true;
        }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (__equals(value, iterator.next()))
                return false;
        return true;
    }

    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return false;

        final var size = values.length;
        if (size == 0)
            return false;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (__equals(value, values[index]))
                return false;
        return true;
    }

    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return hasNotOne((Collection<? extends T>) values); }
    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                 values) { return hasNotOne((Collection<? extends T>) values); }
    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return hasNotOne((Collection<? extends T>) values); }
    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return hasNotOne((Collection<? extends T>) values); }
    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return hasNotOne((Collection<? extends T>) values); }
    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>               values) { return hasNotOne((Collection<? extends T>) values); }
    @Override public final boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>               values) { return hasNotOne((Collection<? extends T>) values); }


    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    @Override public boolean hasAll(final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return true;
        if (!values.hasNext())
            return true;

        final var value = value();
        while (values.hasNext())
            if (!__equals(value, values.next()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return true;
        if (!values.hasNext())
            return true;

        final var value = value();
        while (values.hasNext())
            if (!__equals(value, values.next()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return true;

        final var value = value();
        final var isEqual = new AtomicBoolean(true);
        final Consumer<T> isEqualAction = it -> isEqual.set(isEqual.get() && __equals(value, it));
        var canContinue = true;
        while (canContinue || !isEqual.get())
            canContinue = values.tryAdvance(isEqualAction);
        return !isEqual.get();
    }

    @Override public boolean hasAll(final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return true;
        if (!values.hasMoreElements())
            return true;

        final var value = value();
        while (values.hasMoreElements())
            if (!__equals(value, values.nextElement()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return true;

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return true;

        final var value = value();
        while (iterator.hasNext())
            if (!__equals(value, iterator.next()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return true;

        final var size = values.size();
        if (size == 0)
            return true;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (!__equals(value, values.get(index)))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return true;
        if (values.isEmpty())
            return true;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (!__equals(value, values.get(index)))
                    return false;
            return true;
        }

        final var iterator = values.toIterator();
        while (iterator.hasNext())
            if (!__equals(value, iterator.nextValue()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return true;
        if (values.isEmpty())
            return true;

        final var value = value();
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList instanceof RandomAccess) {
                final var size = values.size();
                var index = -1;
                while (++index < size)
                    if (!__equals(value, valuesAsList.get(index)))
                        return false;
                return true;
            }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (!__equals(value, iterator.next()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return true;
        if (values.isEmpty())
            return true;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (!__equals(value, values.get(index)))
                    return false;
            return true;
        }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (!__equals(value, iterator.next()))
                return false;
        return true;
    }

    @Override public boolean hasAll(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return true;

        final var size = values.length;
        if (size == 0)
            return true;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (!__equals(value, values[index]))
                return false;
        return true;
    }

    @Override public final boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return hasAll((Collection<? extends T>) values); }
    @Override public final boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                 values) { return hasAll((Collection<? extends T>) values); }
    @Override public final boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return hasAll((Collection<? extends T>) values); }
    @Override public final boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return hasAll((Collection<? extends T>) values); }
    @Override public final boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return hasAll((Collection<? extends T>) values); }
    @Override public final boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>               values) { return hasAll((Collection<? extends T>) values); }
    @Override public final boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>               values) { return hasAll((Collection<? extends T>) values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;

        final var value = value();
        while (values.hasNext())
            if (!__equals(value, values.next()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasNext())
            return false;

        final var value = value();
        while (values.hasNext())
            if (!__equals(value, values.next()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T> values) {
        if (values == null)
            return false;

        final var value = value();
        final var isEqual = new AtomicBoolean(false);
        final Consumer<T> isEqualAction = it -> isEqual.set(isEqual.get() || !__equals(value, it));
        var canContinue = true;
        while (canContinue || !isEqual.get())
            canContinue = values.tryAdvance(isEqualAction);
        return !isEqual.get();
    }

    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T> values) {
        if (values == null)
            return false;
        if (!values.hasMoreElements())
            return false;

        final var value = value();
        while (values.hasMoreElements())
            if (!__equals(value, values.nextElement()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T> values) {
        if (values == null)
            return false;

        final var iterator = values.iterator();
        if (!iterator.hasNext())
            return false;

        final var value = value();
        while (iterator.hasNext())
            if (!__equals(value, iterator.next()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return false;

        final var size = values.size();
        if (size == 0)
            return false;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (!__equals(value, values.get(index)))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (!__equals(value, values.get(index)))
                    return true;
            return false;
        }

        final var iterator = values.toIterator();
        while (iterator.hasNext())
            if (!__equals(value, iterator.nextValue()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;

        final var value = value();
        if (values instanceof List<? extends T> valuesAsList)
            if (valuesAsList instanceof RandomAccess) {
                final var size = values.size();
                var index = -1;
                while (++index < size)
                    if (!__equals(value, valuesAsList.get(index)))
                        return true;
                return false;
            }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (!__equals(value, iterator.next()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T> values) {
        if (values == null)
            return false;
        if (values.isEmpty())
            return false;

        final var value = value();
        if (values instanceof RandomAccess) {
            final var size = values.size();
            var index = -1;
            while (++index < size)
                if (!__equals(value, values.get(index)))
                    return true;
            return false;
        }

        final var iterator = values.iterator();
        while (iterator.hasNext())
            if (!__equals(value, iterator.next()))
                return true;
        return false;
    }

    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return false;

        final var size = values.length;
        if (size == 0)
            return false;

        final var value = value();
        var index = -1;
        while (++index < size)
            if (!__equals(value, values[index]))
                return true;
        return false;
    }

    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return hasNotAll((Collection<? extends T>) values); }
    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                 values) { return hasNotAll((Collection<? extends T>) values); }
    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return hasNotAll((Collection<? extends T>) values); }
    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return hasNotAll((Collection<? extends T>) values); }
    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return hasNotAll((Collection<? extends T>) values); }
    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>               values) { return hasNotAll((Collection<? extends T>) values); }
    @Override public final boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>               values) { return hasNotAll((Collection<? extends T>) values); }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<@NotNull T> requireNoNulls() {
        if (this.hasNull())
            throw new NullPointerException("Forbidden null value. The current collection contains null values.");
        return this;
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value, 0))
            return EmptyOptional.getInstance();
        return new Optional<>(value);
    }); }

    @Override public CollectionHolder<T> filter(final Predicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value))
            return EmptyOptional.getInstance();
        return new Optional<>(value);
    }); }

    @Override public CollectionHolder<T> filter(final BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? EmptyOptional.getInstance() : new Optional<>(value())); }


    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(0, value))
            return EmptyOptional.getInstance();
        return new Optional<>(value);
    }); }

    @Override public CollectionHolder<T> filterIndexed(final IntPredicate predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.test(0) ? EmptyOptional.getInstance() : new Optional<>(value())); }

    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? EmptyOptional.getInstance() : new Optional<>(value())); }


    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value, 0))
            return new Optional<>(value);
        return EmptyOptional.getInstance();
    }); }

    @Override public CollectionHolder<T> filterNot(final Predicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value))
            return new Optional<>(value);
        return EmptyOptional.getInstance();
    }); }

    @Override public CollectionHolder<T> filterNot(final BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? new Optional<>(value()) : EmptyOptional.getInstance()); }


    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(0, value))
            return new Optional<>(value);
        return EmptyOptional.getInstance();
    }); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.test(0) ? new Optional<>(value()) : EmptyOptional.getInstance()); }

    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? new Optional<>(value()) : EmptyOptional.getInstance()); }


    @Override public CollectionHolder<@NotNull T> filterNotNull() {
        if (hasNull())
            return EmptyCollectionHolder.getInstance();
        return this;
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer> indices) {
        if (indices.hasNext())
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var newSize = 0;
            while (indices.hasNext()) {
                __validateIndex(indices.next());
                newSize++;
            }

            final var newArray = __newArrayOfType(value, newSize);
            var index = newSize;
            while (index-- > 0)
                newArray[index] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt indices) {
        if (indices.hasNext())
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var newSize = 0;
            while (indices.hasNext()) {
                __validateIndex(indices.nextInt());
                newSize++;
            }

            final var newArray = __newArrayOfType(value, newSize);
            var index = newSize;
            while (index-- > 0)
                newArray[index] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer> indices) {
        if (indices.estimateSize() == 0L)
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var newSize = 0;
            while (indices.tryAdvance(AbstractCollectionHolderOf1::__validateIndex))
                newSize++;

            final var newArray = __newArrayOfType(value, newSize);
            var index = newSize;
            while (index-- > 0)
                newArray[index] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final Spliterator.OfInt indices) {
        if (indices.estimateSize() == 0L)
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var newSize = 0;
            while (indices.tryAdvance((IntConsumer) AbstractCollectionHolderOf1::__validateIndex))
                newSize++;

            final var newArray = __newArrayOfType(value, newSize);
            var index = newSize;
            while (--index > 0)
                newArray[index] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer> indices) {
        if (indices.hasMoreElements())
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var newSize = 0;
            while (indices.hasMoreElements()) {
                __validateIndex(indices.nextElement());
                newSize++;
            }

            final var newArray = __newArrayOfType(value, newSize);
            var index = newSize;
            while (--index > 0)
                newArray[index] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer> indices) { return new GenericCollectionHolder<>(() -> {
        final var value = value();
        final var iterator = indices.iterator();
        var newSize = 0;
        while (iterator.hasNext()) {
            __validateIndex(iterator.next());
            newSize++;
        }

        final var newArray = __newArrayOfType(value, newSize);
        var index = newSize;
        while (--index > 0)
            newArray[index] = value;
        return newArray;
    }); }

    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer> indices) {
        final var indicesSize = indices.size();
        if (indicesSize == 0)
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var index1 = -1;
            while (index1++ < indicesSize)
                __validateIndex(indices.get(index1));

            final var newArray = __newArrayOfType(value, indicesSize);
            var index2 = indicesSize;
            while (--index2 > 0)
                newArray[index2] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer> indices) {
        if (indices.isEmpty())
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            final var indicesSize = indices.size();
            if (indices instanceof RandomAccess) {
                // We will retrieve the values by index (since it is more effective)
                var index1 = -1;
                while (index1++ < indicesSize)
                    __validateIndex(indices.get(index1));
            } else {
                // We will retrieve the values by iterator (by default)
                final var iterator = indices.toIterator();
                var index2 = -1;
                while (index2++ < indicesSize)
                    __validateIndex(iterator.nextValue());
            }

            final var newArray = __newArrayOfType(value, indicesSize);
            var index3 = indicesSize;
            while (--index3 > 0)
                newArray[index3] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final @Unmodifiable Collection<? extends Integer> indices) {
        if (indices.isEmpty())
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            final var indicesSize = indices.size();
            final var iterator = indices.iterator();
            var index1 = -1;
            while (index1++ < indicesSize)
                __validateIndex(iterator.next());

            final var newArray = __newArrayOfType(value, indicesSize);
            var index2 = indicesSize;
            while (--index2 > 0)
                newArray[index2] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer> indices) {
        if (indices.isEmpty())
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            final var indicesSize = indices.size();
            if (indices instanceof RandomAccess) {
                // We will retrieve the values by index (since it is more effective)
                var index1 = -1;
                while (index1++ < indicesSize)
                    __validateIndex(indices.get(index1));
            } else {
                // We will retrieve the values by iterator (by default)
                final var iterator = indices.iterator();
                var index2 = -1;
                while (index2++ < indicesSize)
                    __validateIndex(iterator.next());
            }

            final var newArray = __newArrayOfType(value, indicesSize);
            var index3 = indicesSize;
            while (--index3 > 0)
                newArray[index3] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final int @Unmodifiable [] indices) {
        final var indicesSize = indices.length;
        if (indicesSize == 0)
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var index1 = -1;
            while (index1++ < indicesSize)
                __validateIndex(indices[index1]);

            final var newArray = __newArrayOfType(value, indicesSize);
            var index2 = indicesSize;
            while (--index2 > 0)
                newArray[index2] = value;
            return newArray;
        });
    }

    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable [] indices) {
        final var indicesSize = indices.length;
        if (indicesSize == 0)
            return EmptyCollectionHolder.getInstance();

        return new GenericCollectionHolder<>(() -> {
            final var value = value();
            var index1 = -1;
            while (index1++ < indicesSize)
                __validateIndex(indices[index1]);

            final var newArray = __newArrayOfType(value, indicesSize);
            var index2 = indicesSize;
            while (--index2 > 0)
                newArray[index2] = value;
            return newArray;
        });
    }

    @Override public final CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return slice((Iterator<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return slice((Iterator<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return slice((Spliterator<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable SequencedCollection<? extends Integer>                 indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return slice((Collection<? extends Integer>) indices); }
    @Override public final CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return slice((Collection<? extends Integer>) indices); }


    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<T> slice() { return this; }

    @Contract(ALWAYS_THIS_1) @Override public final CollectionHolder<T> slice(final int from) {
        __validateStartingIndex(from);
        return slice();
    }

    @Contract(ALWAYS_THIS_1) @Override public final CollectionHolder<T> slice(final @Nullable Integer from) {
        __validateStartingIndex(from);
        return slice();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> slice(final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return slice();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> slice(final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return slice();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> slice(final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return slice();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> slice(final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return slice();
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(final int n) {
        if (n == 0)
            return EmptyCollectionHolder.getInstance();
        if (n == 1)
            return this;
        if (n > 1)
            return this;
        if (n == -1)
            return this;
        return EmptyCollectionHolder.getInstance();
    }

    @Override public final CollectionHolder<T> take(final Integer n) { return take(n.intValue()); }


    @Override public CollectionHolder<T> takeWhile(ObjIntPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value, 0))
            return new Optional<>(value);
        return EmptyOptional.getInstance();
    }); }

    @Override public CollectionHolder<T> takeWhile(Predicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value))
            return new Optional<>(value);
        return EmptyOptional.getInstance();
    }); }

    @Override public CollectionHolder<T> takeWhile(BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? new Optional<>(value()) : EmptyOptional.getInstance()); }


    @Override public CollectionHolder<T> takeWhileIndexed(IntObjPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(0, value))
            return new Optional<>(value);
        return EmptyOptional.getInstance();
    }); }

    @Override public CollectionHolder<T> takeWhileIndexed(IntPredicate predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.test(0) ? new Optional<>(value()) : EmptyOptional.getInstance()); }

    @Override public CollectionHolder<T> takeWhileIndexed(BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? new Optional<>(value()) : EmptyOptional.getInstance()); }


    @Override public final CollectionHolder<T> takeLast(final int n) { return take(n); }
    @Override public final CollectionHolder<T> takeLast(final Integer n) { return take(n); }

    @Override public final CollectionHolder<T> takeLastWhile(ObjIntPredicate<? super T> predicate) { return takeWhile(predicate); }
    @Override public final CollectionHolder<T> takeLastWhile(Predicate<? super T>       predicate) { return takeWhile(predicate); }
    @Override public final CollectionHolder<T> takeLastWhile(BooleanSupplier            predicate) { return takeWhile(predicate); }

    @Override public final CollectionHolder<T> takeLastWhileIndexed(IntObjPredicate<? super T> predicate) { return takeWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> takeLastWhileIndexed(IntPredicate               predicate) { return takeWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> takeLastWhileIndexed(BooleanSupplier            predicate) { return takeWhileIndexed(predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(final int n) {
        if (n == 0)
            return this;
        if (n == 1)
            return EmptyCollectionHolder.getInstance();
        if (n > 1)
            return EmptyCollectionHolder.getInstance();
        if (n == -1)
            return EmptyCollectionHolder.getInstance();
        return this;
    }

    @Override public final CollectionHolder<T> drop(final Integer n) { return drop(n.intValue()); }


    @Override public CollectionHolder<T> dropWhile(ObjIntPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value, 0))
            return EmptyOptional.getInstance();
        return new Optional<>(value);
    }); }

    @Override public CollectionHolder<T> dropWhile(Predicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(value))
            return EmptyOptional.getInstance();
        return new Optional<>(value);
    }); }

    @Override public CollectionHolder<T> dropWhile(BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? EmptyOptional.getInstance() : new Optional<>(value())); }


    @Override public CollectionHolder<T> dropWhileIndexed(IntObjPredicate<? super T> predicate) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var value = value();
        if (predicate.test(0, value))
            return EmptyOptional.getInstance();
        return new Optional<>(value);
    }); }

    @Override public CollectionHolder<T> dropWhileIndexed(IntPredicate predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.test(0) ? EmptyOptional.getInstance() : new Optional<>(value())); }

    @Override public CollectionHolder<T> dropWhileIndexed(BooleanSupplier predicate) { return new LazyCollectionHolderOf0Or1<>(() -> predicate.getAsBoolean() ? EmptyOptional.getInstance() : new Optional<>(value())); }


    @Override public final CollectionHolder<T> dropLast(final int n) { return drop(n); }
    @Override public final CollectionHolder<T> dropLast(final Integer n) { return drop(n); }

    @Override public final CollectionHolder<T> dropLastWhile(ObjIntPredicate<? super T> predicate) { return dropWhile(predicate); }
    @Override public final CollectionHolder<T> dropLastWhile(Predicate<? super T>       predicate) { return dropWhile(predicate); }
    @Override public final CollectionHolder<T> dropLastWhile(BooleanSupplier            predicate) { return dropWhile(predicate); }

    @Override public final CollectionHolder<T> dropLastWhileIndexed(IntObjPredicate<? super T> predicate) { return dropWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> dropLastWhileIndexed(IntPredicate               predicate) { return dropWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> dropLastWhileIndexed(BooleanSupplier            predicate) { return dropWhileIndexed(predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> transform) { return new LazyCollectionHolderOf1<>(() -> transform.apply(value(), 0)); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       transform) { return new LazyCollectionHolderOf1<>(() -> transform.apply(value())); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  transform) { return new LazyCollectionHolderOf1<>(transform::get); }


    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> transform) { return new LazyCollectionHolderOf1<>(() -> transform.apply(0, value())); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               transform) { return new LazyCollectionHolderOf1<>(() -> transform.apply(0)); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  transform) { return new LazyCollectionHolderOf1<>(transform::get); }


    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends U> transform) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var newValue = transform.apply(value(), 0);
        if (newValue == null)
            return EmptyOptional.getInstance();
        return new Optional<>(newValue);
    }); }

    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends U> transform) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var newValue = transform.apply(value());
        if (newValue == null)
            return EmptyOptional.getInstance();
        return new Optional<>(newValue);
    }); }

    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends U> transform) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var newValue = transform.get();
        if (newValue == null)
            return EmptyOptional.getInstance();
        return new Optional<>(newValue);
    }); }


    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends U> transform) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var newValue = transform.apply(0, value());
        if (newValue == null)
            return EmptyOptional.getInstance();
        return new Optional<>(newValue);
    }); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends U> transform) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var newValue = transform.apply(0);
        if (newValue == null)
            return EmptyOptional.getInstance();
        return new Optional<>(newValue);
    }); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends U> transform) { return new LazyCollectionHolderOf0Or1<>(() -> {
        final var newValue = transform.get();
        if (newValue == null)
            return EmptyOptional.getInstance();
        return new Optional<>(newValue);
    }); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { action.accept(value(), 0); }
    @Override public void forEach(final Consumer<? super T>       action) { action.accept(value()); }
    @Override public void forEach(final Runnable                  action) { action.run(); }

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { action.accept(0, value()); }
    @Override public void forEachIndexed(final IntConsumer               action) { action.accept(0); }
    @Override public void forEachIndexed(final Runnable                  action) { action.run(); }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolderOf1<T> onEach(final ObjIntConsumer<? super T> action) {
        action.accept(value(), 0);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolderOf1<T> onEach(final Consumer<? super T> action) {
        action.accept(value());
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolderOf1<T> onEach(final Runnable action) {
        action.run();
        return this;
    }


    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolderOf1<T> onEachIndexed(final IntObjConsumer<? super T> action) {
        action.accept(0, value());
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolderOf1<T> onEachIndexed(final IntConsumer action) {
        action.accept(0);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolderOf1<T> onEachIndexed(final Runnable action) {
        action.run();
        return this;
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<T> toReverse() { return this; }

    @Contract(ALWAYS_THIS_1) @Override public final CollectionHolder<T> toReverse(final int from) {
        __validateStartingIndex(from);
        return toReverse();
    }

    @Contract(ALWAYS_THIS_1) @Override public final CollectionHolder<T> toReverse(final @Nullable Integer from) {
        __validateStartingIndex(from);
        return toReverse();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> toReverse(final int from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return toReverse();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> toReverse(final int from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return toReverse();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> toReverse(final @Nullable Integer from, final int to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return toReverse();
    }

    @Contract(ALWAYS_THIS_2) @Override public final CollectionHolder<T> toReverse(final @Nullable Integer from, final @Nullable Integer to) {
        __validateStartingIndex(from);
        __validateEndingIndex(to);
        return toReverse();
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    @Override public CollectionIteratorOf1<T> toIterator() { return new CollectionIteratorOf1<>(value()); }
    @Override public Spliterator<T> toSpliterator() { throw new RuntimeException(); /*TODO: Create a SpliteratorOf1 instance */ }

    //#endregion -------------------- To iterator --------------------

    //#region -------------------- To array --------------------

    @Override public                              T[] toArray(                                                      ) { return Array(value()); }
    @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return Array(transform.apply(value(), 0)); }
    @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return Array(transform.apply(value())); }
    @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return Array(transform.get()); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableCollectionOf1<T> toCollection(                                                      ) { return new ImmutableCollectionOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableCollectionOf1<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableCollectionOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableCollectionOf1<U> toCollection(final Function<? super T, ? extends U>       transform) { return new ImmutableCollectionOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableCollectionOf1<U> toCollection(final Supplier<? extends U>                  transform) { return new ImmutableCollectionOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return new ArrayAsMutableCollection<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableCollection<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableCollection<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return new ArrayAsMutableCollection<>(Array(transform.get())); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableSequencedCollectionOf1<T> toSequencedCollection(                                                      ) { return new ImmutableSequencedCollectionOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollectionOf1<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableSequencedCollectionOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollectionOf1<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return new ImmutableSequencedCollectionOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollectionOf1<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return new ImmutableSequencedCollectionOf1<>(transform.get()); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return new ArrayAsMutableSequencedCollection<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableSequencedCollection<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableSequencedCollection<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return new ArrayAsMutableSequencedCollection<>(Array(transform.get())); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableListOf1<T> toList(                                                      ) { return new ImmutableListOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableListOf1<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableListOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableListOf1<U> toList(final Function<? super T, ? extends U>       transform) { return new ImmutableListOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableListOf1<U> toList(final Supplier<? extends U>                  transform) { return new ImmutableListOf1<>(transform.get()); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableList<T> toMutableList(                                                      ) { return new ArrayAsMutableList<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableList<>(Array(transform.apply(value(), 0)));     }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableList<>(Array(transform.apply(value())));     }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return new ArrayAsMutableList<>(Array(transform.get()));     }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableArrayListOf1<T> toArrayList(                                                      ) { return new ImmutableArrayListOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableArrayListOf1<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableArrayListOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableArrayListOf1<U> toArrayList(final Function<? super T, ? extends U>       transform) { return new ImmutableArrayListOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableArrayListOf1<U> toArrayList(final Supplier<? extends U>                  transform) { return new ImmutableArrayListOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableArrayList<T> toMutableArrayList() {
        final var newList = new MutableArrayList<T>(1);
        newList.set(0, value());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newList = new MutableArrayList<U>(1);
        newList.set(0, transform.apply(value(), 0));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final Function<? super T, ? extends U> transform) {
        final var newList = new MutableArrayList<U>(1);
        newList.set(0, transform.apply(value()));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final Supplier<? extends U> transform) {
        final var newList = new MutableArrayList<U>(1);
        newList.set(0, transform.get());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public MutableArrayList<T> toMutableArrayList(final int initialCapacity) {
        final var newList = new MutableArrayList<T>(max(initialCapacity, 1));
        newList.set(0, value());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newList = new MutableArrayList<U>(max(initialCapacity, 1));
        newList.set(0, transform.apply(value(), 0));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Function<? super T, ? extends U> transform) {
        final var newList = new MutableArrayList<U>(max(initialCapacity, 1));
        newList.set(0, transform.apply(value()));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Supplier<? extends U> transform) {
        final var newList = new MutableArrayList<U>(max(initialCapacity, 1));
        newList.set(0, transform.get());
        return newList;
    }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public final MutableArrayList<T> toMutableArrayList(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return toMutableArrayList();
        return toMutableArrayList(initialCapacity.intValue());
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableArrayList(transform);
        return toMutableArrayList(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableArrayList(transform);
        return toMutableArrayList(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutableArrayList(transform);
        return toMutableArrayList(initialCapacity.intValue(), transform);
    }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableCopyOnWriteArrayListOf1<T> toCopyOnWriteArrayList(                                                      ) { return new ImmutableCopyOnWriteArrayListOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayListOf1<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableCopyOnWriteArrayListOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayListOf1<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return new ImmutableCopyOnWriteArrayListOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayListOf1<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return new ImmutableCopyOnWriteArrayListOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList() {
        final var newList = new MutableCopyOnWriteArrayList<T>();
        newList.set(0, value());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newList = new MutableCopyOnWriteArrayList<U>();
        newList.set(0, transform.apply(value(), 0));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U> transform) {
        final var newList = new MutableCopyOnWriteArrayList<U>();
        newList.set(0, transform.apply(value()));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U> transform) {
        final var newList = new MutableCopyOnWriteArrayList<U>();
        newList.set(0, transform.get());
        return newList;
    }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableLinkedListOf1<T> toLinkedList(                                                      ) { return new ImmutableLinkedListOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedListOf1<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableLinkedListOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedListOf1<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return new ImmutableLinkedListOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedListOf1<U> toLinkedList(final Supplier<? extends U>                  transform) { return new ImmutableLinkedListOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableLinkedList<T> toMutableLinkedList() {
        final var newList = new MutableLinkedList<T>();
        newList.set(0, value());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newList = new MutableLinkedList<U>();
        newList.set(0, transform.apply(value(), 0));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U> transform) {
        final var newList = new MutableLinkedList<U>();
        newList.set(0, transform.apply(value()));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U> transform) {
        final var newList = new MutableLinkedList<U>();
        newList.set(0, transform.get());
        return newList;
    }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableVectorOf1<T> toVector(                                                      ) { return new ImmutableVectorOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableVectorOf1<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableVectorOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableVectorOf1<U> toVector(final Function<? super T, ? extends U>       transform) { return new ImmutableVectorOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableVectorOf1<U> toVector(final Supplier<? extends U>                  transform) { return new ImmutableVectorOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableVector<T> toMutableVector() {
        final var newList = new MutableVector<T>(1);
        newList.set(0, value());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newList = new MutableVector<U>(1);
        newList.set(0, transform.apply(value(), 0));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final Function<? super T, ? extends U> transform) {
        final var newList = new MutableVector<U>(1);
        newList.set(0, transform.apply(value()));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final Supplier<? extends U> transform) {
        final var newList = new MutableVector<U>(1);
        newList.set(0, transform.get());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public MutableVector<T> toMutableVector(final int initialCapacity) {
        final var newList = new MutableVector<T>(max(initialCapacity, 1));
        newList.set(0, value());
        return newList;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newList = new MutableVector<U>(max(initialCapacity, 1));
        newList.set(0, transform.apply(value(), 0));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Function<? super T, ? extends U> transform) {
        final var newList = new MutableVector<U>(max(initialCapacity, 1));
        newList.set(0, transform.apply(value()));
        return newList;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Supplier<? extends U> transform) {
        final var newList = new MutableVector<U>(max(initialCapacity, 1));
        newList.set(0, transform.get());
        return newList;
    }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public final MutableVector<T> toMutableVector(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return toMutableVector();
        return toMutableVector(initialCapacity.intValue());
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableVector(transform);
        return toMutableVector(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableVector(transform);
        return toMutableVector(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutableVector(transform);
        return toMutableVector(initialCapacity.intValue(), transform);
    }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableSetOf1<T> toSet(                                                      ) { return new ImmutableSetOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSetOf1<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSetOf1<U> toSet(final Function<? super T, ? extends U>       transform) { return new ImmutableSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSetOf1<U> toSet(final Supplier<? extends U>                  transform) { return new ImmutableSetOf1<>(transform.get()); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return new ArrayAsMutableSet<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableSet<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableSet<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return new ArrayAsMutableSet<>(Array(transform.get())); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableSequencedSetOf1<T> toSequencedSet(                                                      ) { return new ImmutableSequencedSetOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSetOf1<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableSequencedSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSetOf1<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return new ImmutableSequencedSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSetOf1<U> toSequencedSet(final Supplier<? extends U>                  transform) { return new ImmutableSequencedSetOf1<>(transform.get()); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return new ArrayAsMutableSequencedSet<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableSequencedSet<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableSequencedSet<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return new ArrayAsMutableSequencedSet<>(Array(transform.get())); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableSortedSetOf1<T> toSortedSet(                                                      ) { return new ImmutableSortedSetOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSetOf1<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableSortedSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSetOf1<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return new ImmutableSortedSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSetOf1<U> toSortedSet(final Supplier<? extends U>                  transform) { return new ImmutableSortedSetOf1<>(transform.get()); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return new ArrayAsMutableSortedSet<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableSortedSet<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableSortedSet<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return new ArrayAsMutableSortedSet<>(Array(transform.get())); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableNavigableSetOf1<T> toNavigableSet(                                                      ) { return new ImmutableNavigableSetOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSetOf1<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableNavigableSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSetOf1<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return new ImmutableNavigableSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSetOf1<U> toNavigableSet(final Supplier<? extends U>                  transform) { return new ImmutableNavigableSetOf1<>(transform.get()); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return new ArrayAsMutableNavigableSet<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableNavigableSet<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableNavigableSet<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return new ArrayAsMutableNavigableSet<>(Array(transform.get())); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSetOf1<U> toConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableConcurrentSkipListSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSetOf1<U> toConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return new ImmutableConcurrentSkipListSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSetOf1<U> toConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return new ImmutableConcurrentSkipListSetOf1<>(transform.get()); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSetOf1<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableConcurrentSkipListSetOf1<>(transform.apply(value(), 0), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSetOf1<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return new ImmutableConcurrentSkipListSetOf1<>(transform.apply(value()), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSetOf1<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return new ImmutableConcurrentSkipListSetOf1<>(transform.get(), comparator); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableConcurrentSkipListSet<U>();
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableConcurrentSkipListSet<U>();
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Supplier<? extends U> transform) {
        final var newSet = new MutableConcurrentSkipListSet<U>();
        newSet.add(transform.get());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableConcurrentSkipListSet<U>(comparator);
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableConcurrentSkipListSet<U>(comparator);
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        final var newSet = new MutableConcurrentSkipListSet<U>(comparator);
        newSet.add(transform.get());
        return newSet;
    }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableCopyOnWriteArraySetOf1<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableCopyOnWriteArraySetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableCopyOnWriteArraySetOf1<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return new ImmutableCopyOnWriteArraySetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableCopyOnWriteArraySetOf1<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return new ImmutableCopyOnWriteArraySetOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableCopyOnWriteArraySet<U>();
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableCopyOnWriteArraySet<U>();
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U> transform) {
        final var newSet = new MutableCopyOnWriteArraySet<U>();
        newSet.add(transform.get());
        return newSet;
    }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final ObjIntFunction<? super T, ? extends U> transform) { return EnumSet.of(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Function<? super T, ? extends U>       transform) { return EnumSet.of(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Supplier<? extends U>                  transform) { return EnumSet.of(transform.get()); }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = EnumSet.noneOf(clazz);
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U> transform) {
        final var newSet = EnumSet.noneOf(clazz);
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U> transform) {
        final var newSet = EnumSet.noneOf(clazz);
        newSet.add(transform.get());
        return newSet;
    }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableHashSetOf1<T> toHashSet(                                                                              ) { return new ImmutableHashSetOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(                        final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableHashSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(                        final Function<? super T, ? extends U>       transform) { return new ImmutableHashSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(                        final Supplier<? extends U>                  transform) { return new ImmutableHashSetOf1<>(transform.get()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              ImmutableHashSetOf1<T> toHashSet(final float loadFactor                                                        ) { return new ImmutableHashSetOf1<>(value(), loadFactor); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableHashSetOf1<>(transform.apply(value(), 0), loadFactor); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(final float loadFactor, final Function<? super T, ? extends U>       transform) { return new ImmutableHashSetOf1<>(transform.apply(value()), loadFactor); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(final float loadFactor, final Supplier<? extends U>                  transform) { return new ImmutableHashSetOf1<>(transform.get(), loadFactor); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public final ImmutableHashSetOf1<T> toHashSet(final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return toHashSet();
        return toHashSet(loadFactor.floatValue());
    }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public final <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) {
        if (loadFactor == null)
            return toHashSet(transform);
        return toHashSet(loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public final <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(final @Nullable Float loadFactor, final Function<? super T, ? extends U> transform) {
        if (loadFactor == null)
            return toHashSet(transform);
        return toHashSet(loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public final <U extends @Nullable Object> ImmutableHashSetOf1<U> toHashSet(final @Nullable Float loadFactor, final Supplier<? extends U> transform) {
        if (loadFactor == null)
            return toHashSet(transform);
        return toHashSet(loadFactor.floatValue(), transform);
    }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableHashSet<T> toMutableHashSet() {
        final var newSet = new MutableHashSet<T>(1);
        newSet.add(value());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(1);
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(1);
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Supplier<? extends U> transform) {
        final var newSet = new MutableHashSet<U>(1);
        newSet.add(transform.get());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public MutableHashSet<T> toMutableHashSet(final int initialCapacity) {
        final var newSet = new MutableHashSet<T>(max(initialCapacity, 1));
        newSet.add(value());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1));
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1));
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final Supplier<? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1));
        newSet.add(transform.get());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public MutableHashSet<T> toMutableHashSet(final int initialCapacity, final float loadFactor) {
        final var newSet = new MutableHashSet<T>(max(initialCapacity, 1), loadFactor);
        newSet.add(value());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor) {
        final var newSet = new MutableHashSet<T>(max(initialCapacity, 1), loadFactor);
        newSet.add(value());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1), loadFactor);
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final float loadFactor, final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1), loadFactor);
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final float loadFactor, final Supplier<? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1), loadFactor);
        newSet.add(transform.get());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1), loadFactor);
        newSet.add(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor, final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1), loadFactor);
        newSet.add(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor, final Supplier<? extends U> transform) {
        final var newSet = new MutableHashSet<U>(max(initialCapacity, 1), loadFactor);
        newSet.add(transform.get());
        return newSet;
    }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public final MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return toMutableHashSet();
        return toMutableHashSet(initialCapacity.intValue());
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableHashSet(transform);
        return toMutableHashSet(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableHashSet(transform);
        return toMutableHashSet(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutableHashSet(transform);
        return toMutableHashSet(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final MutableHashSet<T> toMutableHashSet(final int initialCapacity, final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity);
        return toMutableHashSet(initialCapacity, loadFactor.floatValue());
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor) {
        if (loadFactor == null)
            if (initialCapacity == null)
                return toMutableHashSet();
            else
                return toMutableHashSet(initialCapacity.intValue());
        if (initialCapacity == null)
            return toMutableHashSet(null, loadFactor.floatValue());
        return toMutableHashSet(initialCapacity.intValue(), loadFactor.floatValue());
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) {
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity, transform);
        return toMutableHashSet(initialCapacity, loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U> transform) {
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity, transform);
        return toMutableHashSet(initialCapacity, loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U> transform) {
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity, transform);
        return toMutableHashSet(initialCapacity, loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return toMutableHashSet(transform);
            else
                return toMutableHashSet(null, loadFactor.floatValue(), transform);
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity.intValue(), transform);
        return toMutableHashSet(initialCapacity.intValue(), loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return toMutableHashSet(transform);
            else
                return toMutableHashSet(null, loadFactor.floatValue(), transform);
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity.intValue(), transform);
        return toMutableHashSet(initialCapacity.intValue(), loadFactor.floatValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            if (loadFactor == null)
                return toMutableHashSet(transform);
            else
                return toMutableHashSet(null, loadFactor.floatValue(), transform);
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity.intValue(), transform);
        return toMutableHashSet(initialCapacity.intValue(), loadFactor.floatValue(), transform);
    }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableLinkedHashSetOf1<T> toLinkedHashSet(                                                      ) { return new ImmutableLinkedHashSetOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSetOf1<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableLinkedHashSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSetOf1<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return new ImmutableLinkedHashSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSetOf1<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return new ImmutableLinkedHashSetOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableLinkedHashSet<T> toMutableLinkedHashSet() {
        final var newSet = new MutableLinkedHashSet<T>(1);
        newSet.addFirst(value());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableLinkedHashSet<U>(1);
        newSet.addFirst(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableLinkedHashSet<U>(1);
        newSet.addFirst(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U> transform) {
        final var newSet = new MutableLinkedHashSet<U>(1);
        newSet.addFirst(transform.get());
        return newSet;
    }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSetOf1<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableTreeSetOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSetOf1<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return new ImmutableTreeSetOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSetOf1<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return new ImmutableTreeSetOf1<>(transform.get()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             ImmutableTreeSetOf1<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return new ImmutableTreeSetOf1<>(value(), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSetOf1<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableTreeSetOf1<>(transform.apply(value(), 0), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSetOf1<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return new ImmutableTreeSetOf1<>(transform.apply(value()), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSetOf1<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return new ImmutableTreeSetOf1<>(transform.get(), comparator); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableTreeSet<U>();
        newSet.addFirst(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableTreeSet<U>();
        newSet.addFirst(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(final Supplier<? extends U> transform) {
        final var newSet = new MutableTreeSet<U>();
        newSet.addFirst(transform.get());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator) {
        final var newSet = new MutableTreeSet<T>(comparator);
        newSet.addFirst(value());
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newSet = new MutableTreeSet<U>(comparator);
        newSet.addFirst(transform.apply(value(), 0));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        final var newSet = new MutableTreeSet<U>(comparator);
        newSet.addFirst(transform.apply(value()));
        return newSet;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends @Nullable Object> MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        final var newSet = new MutableTreeSet<U>(comparator);
        newSet.addFirst(transform.get());
        return newSet;
    }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Override public                              ImmutableQueueOf1<T> toQueue(                                                      ) { return new ImmutableQueueOf1<>(value()); }
    @Override public <U extends @Nullable Object> ImmutableQueueOf1<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U extends @Nullable Object> ImmutableQueueOf1<U> toQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableQueueOf1<>(transform.apply(value())); }
    @Override public <U extends @Nullable Object> ImmutableQueueOf1<U> toQueue(final Supplier<? extends U>                  transform) { return new ImmutableQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return new ArrayAsMutableQueue<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableQueue<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableQueue<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return new ArrayAsMutableQueue<>(Array(transform.get())); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Override public <U> ImmutableBlockingQueueOf1<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableBlockingQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableBlockingQueueOf1<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableBlockingQueueOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableBlockingQueueOf1<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return new ImmutableBlockingQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableBlockingQueue<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableBlockingQueue<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return new ArrayAsMutableBlockingQueue<>(Array(transform.get())); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Override public <U> ImmutableTransferQueueOf1<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableTransferQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableTransferQueueOf1<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableTransferQueueOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableTransferQueueOf1<U> toTransferQueue(final Supplier<? extends U>                  transform) { return new ImmutableTransferQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableTransferQueue<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableTransferQueue<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return new ArrayAsMutableTransferQueue<>(Array(transform.get())); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueueOf1<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableArrayBlockingQueueOf1<>(transform.apply(value(), 0)); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueueOf1<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableArrayBlockingQueueOf1<>(transform.apply(value())); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueueOf1<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return new ImmutableArrayBlockingQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>();
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>();
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>();
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(capacity);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(capacity);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final Supplier<? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(capacity);
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(capacity, isFair);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final boolean isFair, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(capacity, isFair);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final boolean isFair, final Supplier<? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(capacity, isFair);
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(isFair);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final boolean isFair, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(isFair);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final boolean isFair, final Supplier<? extends U> transform) {
        final var newQueue = new MutableArrayBlockingQueue<U>(isFair);
        newQueue.add(transform.get());
        return newQueue;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableArrayBlockingQueue(transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final Function<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableArrayBlockingQueue(transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final Supplier<? extends U> transform) {
        if (capacity == null)
            return toMutableArrayBlockingQueue(transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableArrayBlockingQueue(isFair, transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), isFair, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final boolean isFair, final Function<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableArrayBlockingQueue(isFair, transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), isFair, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final boolean isFair, final Supplier<? extends U> transform) {
        if (capacity == null)
            return toMutableArrayBlockingQueue(isFair, transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), isFair, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        if (isFair == null)
            return toMutableArrayBlockingQueue(capacity, transform);
        return toMutableArrayBlockingQueue(capacity, isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final @Nullable Boolean isFair, final Function<? super T, ? extends U> transform) {
        if (isFair == null)
            return toMutableArrayBlockingQueue(capacity, transform);
        return toMutableArrayBlockingQueue(capacity, isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int capacity, final @Nullable Boolean isFair, final Supplier<? extends U> transform) {
        if (isFair == null)
            return toMutableArrayBlockingQueue(capacity, transform);
        return toMutableArrayBlockingQueue(capacity, isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        if (isFair == null)
            if (capacity == null)
                return toMutableArrayBlockingQueue(transform);
            else
                return toMutableArrayBlockingQueue(capacity.intValue(), transform);
        if (capacity == null)
            return toMutableArrayBlockingQueue(isFair.booleanValue(), transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final @Nullable Boolean isFair, final Function<? super T, ? extends U> transform) {
        if (isFair == null)
            if (capacity == null)
                return toMutableArrayBlockingQueue(transform);
            else
                return toMutableArrayBlockingQueue(capacity.intValue(), transform);
        if (capacity == null)
            return toMutableArrayBlockingQueue(isFair.booleanValue(), transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final @Nullable Boolean isFair, final Supplier<? extends U> transform) {
        if (isFair == null)
            if (capacity == null)
                return toMutableArrayBlockingQueue(transform);
            else
                return toMutableArrayBlockingQueue(capacity.intValue(), transform);
        if (capacity == null)
            return toMutableArrayBlockingQueue(isFair.booleanValue(), transform);
        return toMutableArrayBlockingQueue(capacity.intValue(), isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        if (isFair == null)
            return toMutableArrayBlockingQueue(transform);
        return toMutableArrayBlockingQueue(isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Boolean isFair, final Function<? super T, ? extends U> transform) {
        if (isFair == null)
            return toMutableArrayBlockingQueue(transform);
        return toMutableArrayBlockingQueue(isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Boolean isFair, final Supplier<? extends U> transform) {
        if (isFair == null)
            return toMutableArrayBlockingQueue(transform);
        return toMutableArrayBlockingQueue(isFair.booleanValue(), transform);
    }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Override public <U> ImmutableConcurrentLinkedQueueOf1<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableConcurrentLinkedQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableConcurrentLinkedQueueOf1<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableConcurrentLinkedQueueOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableConcurrentLinkedQueueOf1<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return new ImmutableConcurrentLinkedQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableConcurrentLinkedQueue<U>();
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableConcurrentLinkedQueue<U>();
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutableConcurrentLinkedQueue<U>();
        newQueue.add(transform.get());
        return newQueue;
    }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Override public <U extends Delayed> ImmutableDelayQueueOf1<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableDelayQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U extends Delayed> ImmutableDelayQueueOf1<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableDelayQueueOf1<>(transform.apply(value())); }
    @Override public <U extends Delayed> ImmutableDelayQueueOf1<U> toDelayQueue(final Supplier<? extends U>                  transform) { return new ImmutableDelayQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableDelayQueue<U>();
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableDelayQueue<U>();
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutableDelayQueue<U>();
        newQueue.add(transform.get());
        return newQueue;
    }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Override public <U> ImmutableLinkedBlockingQueueOf1<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableLinkedBlockingQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableLinkedBlockingQueueOf1<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableLinkedBlockingQueueOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableLinkedBlockingQueueOf1<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return new ImmutableLinkedBlockingQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableLinkedBlockingQueue<U>();
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableLinkedBlockingQueue<U>();
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutableLinkedBlockingQueue<U>();
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final int capacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableLinkedBlockingQueue<U>(capacity);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final int capacity, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableLinkedBlockingQueue<U>(capacity);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final int capacity, final Supplier<? extends U> transform) {
        final var newQueue = new MutableLinkedBlockingQueue<U>(capacity);
        newQueue.add(transform.get());
        return newQueue;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable Integer capacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableLinkedBlockingQueue(transform);
        return toMutableLinkedBlockingQueue(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable Integer capacity, final Function<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableLinkedBlockingQueue(transform);
        return toMutableLinkedBlockingQueue(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable Integer capacity, final Supplier<? extends U> transform) {
        if (capacity == null)
            return toMutableLinkedBlockingQueue(transform);
        return toMutableLinkedBlockingQueue(capacity.intValue(), transform);
    }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Override public <U> ImmutableLinkedTransferQueueOf1<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableLinkedTransferQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableLinkedTransferQueueOf1<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableLinkedTransferQueueOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableLinkedTransferQueueOf1<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return new ImmutableLinkedTransferQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableLinkedTransferQueue<U>();
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableLinkedTransferQueue<U>();
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutableLinkedTransferQueue<U>();
        newQueue.add(transform.get());
        return newQueue;
    }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueueOf1<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutablePriorityBlockingQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueueOf1<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return new ImmutablePriorityBlockingQueueOf1<>(transform.apply(value())); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueueOf1<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return new ImmutablePriorityBlockingQueueOf1<>(transform.get()); }
    @Override public <U>                               ImmutablePriorityBlockingQueueOf1<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutablePriorityBlockingQueueOf1<>(transform.apply(value(), 0), comparator); }
    @Override public <U>                               ImmutablePriorityBlockingQueueOf1<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return new ImmutablePriorityBlockingQueueOf1<>(transform.apply(value()), comparator); }
    @Override public <U>                               ImmutablePriorityBlockingQueueOf1<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return new ImmutablePriorityBlockingQueueOf1<>(transform.get(), comparator); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(1);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(1);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(1);
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(1, comparator);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(1, comparator);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(1, comparator);
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(max(initialCapacity, 1));
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(max(initialCapacity, 1));
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(max(initialCapacity, 1));
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(max(initialCapacity, 1), comparator);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(max(initialCapacity, 1), comparator);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityBlockingQueue<U>(max(initialCapacity, 1), comparator);
        newQueue.add(transform.get());
        return newQueue;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityBlockingQueue(transform);
        return toMutablePriorityBlockingQueue(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityBlockingQueue(transform);
        return toMutablePriorityBlockingQueue(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityBlockingQueue(transform);
        return toMutablePriorityBlockingQueue(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityBlockingQueue(comparator, transform);
        return toMutablePriorityBlockingQueue(initialCapacity.intValue(), comparator, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityBlockingQueue(comparator, transform);
        return toMutablePriorityBlockingQueue(initialCapacity.intValue(), comparator, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityBlockingQueue(comparator, transform);
        return toMutablePriorityBlockingQueue(initialCapacity.intValue(), comparator, transform);
    }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueueOf1<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutablePriorityQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueueOf1<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return new ImmutablePriorityQueueOf1<>(transform.apply(value())); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueueOf1<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return new ImmutablePriorityQueueOf1<>(transform.get()); }
    @Override public <U>                               ImmutablePriorityQueueOf1<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutablePriorityQueueOf1<>(transform.apply(value(), 0), comparator); }
    @Override public <U>                               ImmutablePriorityQueueOf1<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return new ImmutablePriorityQueueOf1<>(transform.apply(value()), comparator); }
    @Override public <U>                               ImmutablePriorityQueueOf1<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return new ImmutablePriorityQueueOf1<>(transform.get(), comparator); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(1);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(1);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(1);
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutablePriorityQueue<U> toMutablePriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(1, comparator);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutablePriorityQueue<U> toMutablePriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(1, comparator);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutablePriorityQueue<U> toMutablePriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(1, comparator);
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(max(initialCapacity, 1));
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(max(initialCapacity, 1));
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(max(initialCapacity, 1));
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(max(initialCapacity, 1), comparator);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(max(initialCapacity, 1), comparator);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public <U> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        final var newQueue = new MutablePriorityQueue<U>(max(initialCapacity, 1), comparator);
        newQueue.add(transform.get());
        return newQueue;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityQueue(transform);
        return toMutablePriorityQueue(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityQueue(transform);
        return toMutablePriorityQueue(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityQueue(transform);
        return toMutablePriorityQueue(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityQueue(comparator, transform);
        return toMutablePriorityQueue(initialCapacity.intValue(), comparator, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityQueue(comparator, transform);
        return toMutablePriorityQueue(initialCapacity.intValue(), comparator, transform);
    }

    @Contract(value = ALWAYS_NEW_3, pure = true)
    @Override public final <U> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutablePriorityQueue(comparator, transform);
        return toMutablePriorityQueue(initialCapacity.intValue(), comparator, transform);
    }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Override public <U> ImmutableSynchronousQueueOf1<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableSynchronousQueueOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableSynchronousQueueOf1<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return new ImmutableSynchronousQueueOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableSynchronousQueueOf1<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return new ImmutableSynchronousQueueOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableSynchronousQueue<U>();
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableSynchronousQueue<U>();
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final Supplier<? extends U> transform) {
        final var newQueue = new MutableSynchronousQueue<U>();
        newQueue.add(transform.get());
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newQueue = new MutableSynchronousQueue<U>(isFair);
        newQueue.add(transform.apply(value(), 0));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U> transform) {
        final var newQueue = new MutableSynchronousQueue<U>(isFair);
        newQueue.add(transform.apply(value()));
        return newQueue;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U> transform) {
        final var newQueue = new MutableSynchronousQueue<U>(isFair);
        newQueue.add(transform.get());
        return newQueue;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) {
        if (isFair == null)
            return toMutableSynchronousQueue(transform);
        return toMutableSynchronousQueue(isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable Boolean isFair, final Function<? super T, ? extends U> transform) {
        if (isFair == null)
            return toMutableSynchronousQueue(transform);
        return toMutableSynchronousQueue(isFair.booleanValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable Boolean isFair, final Supplier<? extends U> transform) {
        if (isFair == null)
            return toMutableSynchronousQueue(transform);
        return toMutableSynchronousQueue(isFair.booleanValue(), transform);
    }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Override public                              ImmutableDequeOf1<T> toDeque(                                                      ) { return new ImmutableDequeOf1<>(value()); }
    @Override public <U extends @Nullable Object> ImmutableDequeOf1<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableDequeOf1<>(transform.apply(value(), 0)); }
    @Override public <U extends @Nullable Object> ImmutableDequeOf1<U> toDeque(final Function<? super T, ? extends U>       transform) { return new ImmutableDequeOf1<>(transform.apply(value())); }
    @Override public <U extends @Nullable Object> ImmutableDequeOf1<U> toDeque(final Supplier<? extends U>                  transform) { return new ImmutableDequeOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return new ArrayAsMutableDeque<>(Array(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableDeque<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableDeque<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return new ArrayAsMutableDeque<>(Array(transform.get())); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Override public <U> ImmutableBlockingDequeOf1<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableBlockingDequeOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableBlockingDequeOf1<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return new ImmutableBlockingDequeOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableBlockingDequeOf1<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return new ImmutableBlockingDequeOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ArrayAsMutableBlockingDeque<>(Array(transform.apply(value(), 0))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return new ArrayAsMutableBlockingDeque<>(Array(transform.apply(value()))); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return new ArrayAsMutableBlockingDeque<>(Array(transform.get())); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Override public <U> ImmutableArrayDequeOf1<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableArrayDequeOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableArrayDequeOf1<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return new ImmutableArrayDequeOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableArrayDequeOf1<U> toArrayDeque(final Supplier<? extends U>                  transform) { return new ImmutableArrayDequeOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newStack = new MutableArrayDeque<U>(1);
        newStack.add(transform.apply(value(), 0));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Function<? super T, ? extends U> transform) {
        final var newStack = new MutableArrayDeque<U>(1);
        newStack.add(transform.apply(value()));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Supplier<? extends U> transform) {
        final var newStack = new MutableArrayDeque<U>(1);
        newStack.add(transform.get());
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newStack = new MutableArrayDeque<U>(max(initialCapacity, 1));
        newStack.add(transform.apply(value(), 0));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Function<? super T, ? extends U> transform) {
        final var newStack = new MutableArrayDeque<U>(max(initialCapacity, 1));
        newStack.add(transform.apply(value()));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Supplier<? extends U> transform) {
        final var newStack = new MutableArrayDeque<U>(max(initialCapacity, 1));
        newStack.add(transform.get());
        return newStack;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayDeque<U> toMutableArrayDeque(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableArrayDeque(transform);
        return toMutableArrayDeque(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayDeque<U> toMutableArrayDeque(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U> transform) {
        if (initialCapacity == null)
            return toMutableArrayDeque(transform);
        return toMutableArrayDeque(initialCapacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableArrayDeque<U> toMutableArrayDeque(final @Nullable Integer initialCapacity, final Supplier<? extends U> transform) {
        if (initialCapacity == null)
            return toMutableArrayDeque(transform);
        return toMutableArrayDeque(initialCapacity.intValue(), transform);
    }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Override public <U> ImmutableConcurrentLinkedDequeOf1<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableConcurrentLinkedDequeOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableConcurrentLinkedDequeOf1<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return new ImmutableConcurrentLinkedDequeOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableConcurrentLinkedDequeOf1<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return new ImmutableConcurrentLinkedDequeOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newStack = new MutableConcurrentLinkedDeque<U>();
        newStack.add(transform.apply(value(), 0));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U> transform) {
        final var newStack = new MutableConcurrentLinkedDeque<U>();
        newStack.add(transform.apply(value()));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U> transform) {
        final var newStack = new MutableConcurrentLinkedDeque<U>();
        newStack.add(transform.get());
        return newStack;
    }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Override public <U> ImmutableLinkedBlockingDequeOf1<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableLinkedBlockingDequeOf1<>(transform.apply(value(), 0)); }
    @Override public <U> ImmutableLinkedBlockingDequeOf1<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return new ImmutableLinkedBlockingDequeOf1<>(transform.apply(value())); }
    @Override public <U> ImmutableLinkedBlockingDequeOf1<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return new ImmutableLinkedBlockingDequeOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newStack = new MutableLinkedBlockingDeque<U>();
        newStack.add(transform.apply(value(), 0));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final Function<? super T, ? extends U> transform) {
        final var newStack = new MutableLinkedBlockingDeque<U>();
        newStack.add(transform.apply(value()));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final Supplier<? extends U> transform) {
        final var newStack = new MutableLinkedBlockingDeque<U>();
        newStack.add(transform.get());
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final int capacity, final ObjIntFunction<? super T, ? extends U> transform) {
        final var newStack = new MutableLinkedBlockingDeque<U>(capacity);
        newStack.add(transform.apply(value(), 0));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final int capacity, final Function<? super T, ? extends U> transform) {
        final var newStack = new MutableLinkedBlockingDeque<U>(capacity);
        newStack.add(transform.apply(value()));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final int capacity, final Supplier<? extends U> transform) {
        final var newStack = new MutableLinkedBlockingDeque<U>(capacity);
        newStack.add(transform.get());
        return newStack;
    }


    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Nullable Integer capacity, final ObjIntFunction<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableLinkedBlockingDeque(transform);
        return toMutableLinkedBlockingDeque(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Nullable Integer capacity, final Function<? super T, ? extends U> transform) {
        if (capacity == null)
            return toMutableLinkedBlockingDeque(transform);
        return toMutableLinkedBlockingDeque(capacity.intValue(), transform);
    }

    @Contract(value = ALWAYS_NEW_2, pure = true)
    @Override public final <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Nullable Integer capacity, final Supplier<? extends U> transform) {
        if (capacity == null)
            return toMutableLinkedBlockingDeque(transform);
        return toMutableLinkedBlockingDeque(capacity.intValue(), transform);
    }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              ImmutableStackOf1<T> toStack(                                                      ) { return new ImmutableStackOf1<>(value()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableStackOf1<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return new ImmutableStackOf1<>(transform.apply(value(), 0)); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableStackOf1<U> toStack(final Function<? super T, ? extends U>       transform) { return new ImmutableStackOf1<>(transform.apply(value())); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> ImmutableStackOf1<U> toStack(final Supplier<? extends U>                  transform) { return new ImmutableStackOf1<>(transform.get()); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableStack<T> toMutableStack() {
        final var newStack = new MutableStack<T>();
        newStack.set(0, value());
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) {
        final var newStack = new MutableStack<U>();
        newStack.set(0, transform.apply(value(), 0));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U> transform) {
        final var newStack = new MutableStack<U>();
        newStack.set(0, transform.apply(value()));
        return newStack;
    }

    @Contract(value = ALWAYS_NEW_1, pure = true)
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U> transform) {
        final var newStack = new MutableStack<U>();
        newStack.set(0, transform.get());
        return newStack;
    }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    @Override public ImmutableMap<Integer, T> toMap() { throw new RuntimeException("TODO: Implements the toMap method"); }

    @Override public MutableMap<Integer, T> toMutableMap() { throw new RuntimeException("TODO: Implements the toMutableMap method"); }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To sequenced map --------------------

    @Override public ImmutableSequencedMap<Integer, T> toSequencedMap() { throw new RuntimeException("TODO: Implements the toSequencedMap method"); }

    @Override public MutableSequencedMap<Integer, T> toMutableSequencedMap() { throw new RuntimeException("TODO: Implements the toMutableSequencedMap method"); }

    //#endregion -------------------- To sequenced map --------------------
    //#region -------------------- To sorted map --------------------

    @Override public ImmutableSortedMap<Integer, T> toSortedMap() { throw new RuntimeException("TODO: Implements the toSortedMap method"); }

    @Override public MutableSortedMap<Integer, T> toMutableSortedMap() { throw new RuntimeException("TODO: Implements the toMutableSortedMap method"); }

    //#endregion -------------------- To sorted map --------------------
    //#region -------------------- To navigable map --------------------

    @Override public ImmutableNavigableMap<Integer, T> toNavigableMap() { throw new RuntimeException("TODO: Implements the toNavigableMap method"); }

    @Override public MutableNavigableMap<Integer, T> toMutableNavigableMap() { throw new RuntimeException("TODO: Implements the toMutableNavigableMap method"); }

    //#endregion -------------------- To navigable map --------------------
    //#region -------------------- To concurrent map --------------------

    @Override public ImmutableConcurrentMap<Integer, T> toConcurrentMap() { throw new RuntimeException("TODO: Implements the toConcurrentMap method"); }

    @Override public MutableConcurrentMap<Integer, T> toMutableConcurrentMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentMap method"); }

    //#endregion -------------------- To concurrent map --------------------
    //#region -------------------- To concurrent navigable map --------------------

    @Override public ImmutableConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements the toConcurrentNavigableMap method"); }

    @Override public MutableConcurrentNavigableMap<Integer, T> toMutableConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentNavigableMap method"); }

    //#endregion -------------------- To concurrent navigable map --------------------
    //#region -------------------- To concurrent hash map --------------------

    @Override public ImmutableConcurrentHashMap<Integer, T> toConcurrentHashMap() { throw new RuntimeException("TODO: Implements the toConcurrentHashMap method"); }

    @Override public MutableConcurrentHashMap<Integer, T> toMutableConcurrentHashMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentHashMap method"); }

    //#endregion -------------------- To concurrent hash map --------------------
    //#region -------------------- To concurrent skip list map --------------------

    @Override public ImmutableConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements the toConcurrentSkipListMap method"); }

    @Override public MutableConcurrentSkipListMap<Integer, T> toMutableConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentSkipListMap method"); }

    //#endregion -------------------- To concurrent skip list map --------------------
    //#region -------------------- To enum map --------------------

    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                       transform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Function<? super T, Entry<K, V>>                                                             transform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Supplier<Entry<K, V>>                                                                        transform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> ImmutableEnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }

    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                       transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Function<? super T, Entry<K, V>>                                                             transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Function<? super T, K>                 keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Function<? super T, K>                 keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Function<? super T, K>                 keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Supplier<Entry<K, V>>                                                                        transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Supplier<K>                            keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Supplier<K>                            keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V extends @Nullable Object> MutableEnumMap<K, V> toMutableEnumMap(final Supplier<K>                            keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }

    //#endregion -------------------- To enum map --------------------
    //#region -------------------- To hash map --------------------

    @Override public ImmutableHashMap<Integer, T> toHashMap() { throw new RuntimeException("TODO: Implements the toHashMap method"); }

    @Override public MutableHashMap<Integer, T> toMutableHashMap() { throw new RuntimeException("TODO: Implements the toMutableHashMap method"); }

    //#endregion -------------------- To hash map --------------------
    //#region -------------------- To hashtable --------------------

    @Override public ImmutableHashtable<Integer, T> toHashtable() { throw new RuntimeException("TODO: Implements the toHashtable method"); }

    @Override public MutableHashtable<Integer, T> toMutableHashtable() { throw new RuntimeException("TODO: Implements the toMutableHashtable method"); }

    //#endregion -------------------- To hashtable --------------------
    //#region -------------------- To identity hash map --------------------

    @Override public ImmutableIdentityHashMap<Integer, T> toIdentityHashMap() { throw new RuntimeException("TODO: Implements the toIdentityHashMap method"); }

    @Override public MutableIdentityHashMap<Integer, T> toMutableIdentityHashMap() { throw new RuntimeException("TODO: Implements the toMutableIdentityHashMap method"); }

    //#endregion -------------------- To identity hash map --------------------
    //#region -------------------- To linked hash map --------------------

    @Override public ImmutableLinkedHashMap<Integer, T> toLinkedHashMap() { throw new RuntimeException("TODO: Implements the toLinkedHashMap method"); }

    @Override public MutableLinkedHashMap<Integer, T> toMutableLinkedHashMap() { throw new RuntimeException("TODO: Implements the toMutableLinkedHashMap method"); }

    //#endregion -------------------- To linked hash map --------------------
    //#region -------------------- To tree map --------------------

    @Override public ImmutableTreeMap<Integer, T> toTreeMap() { throw new RuntimeException("TODO: Implements the toTreeMap method"); }

    @Override public MutableTreeMap<Integer, T> toMutableTreeMap() { throw new RuntimeException("TODO: Implements the toMutableTreeMap method"); }

    //#endregion -------------------- To tree map --------------------
    //#region -------------------- To weak hash map --------------------

    @Override public ImmutableWeakHashMap<Integer, T> toWeakHashMap() { throw new RuntimeException("TODO: Implements the toWeakHashMap method"); }

    @Override public MutableWeakHashMap<Integer, T> toMutableWeakHashMap() { throw new RuntimeException("TODO: Implements the toMutableWeakHashMap method"); }

    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return '[' + asString(value()) + ']'; }

    @Override public String toLocaleString(                             ) { return '[' + asLocaleString(value()) + ']'; }
    @Override public String toLocaleString(final @Nullable Locale locale) { return '[' + asLocaleString(value(), locale) + ']'; }

    @Override public String toLowerCaseString() { return '[' + asLowerCaseString(value()) + ']'; }

    @Override public String toLocaleLowerCaseString(                             ) { return '[' + asLocaleLowerCaseString(value()) + ']'; }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return '[' + asLocaleLowerCaseString(value(), locale) + ']'; }

    @Override public String toUpperCaseString() { return '[' + asUpperCaseString(value()) + ']'; }

    @Override public String toLocaleUpperCaseString(                             ) { return '[' + asLocaleUpperCaseString(value()) + ']'; }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return '[' + asLocaleUpperCaseString(value(), locale) + ']'; }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    protected String _joinToString_core(final String prefix, final String postfix) {
        return prefix + value() + postfix;
    }

    protected String _joinToString_truncated(final String prefix, final String postfix, final String truncated) {
        return prefix + truncated + postfix;
    }

    protected String _joinToString_transform(final String prefix, final String postfix, final ObjIntFunction<? super T, String> transform) {
        return prefix + transform.apply(value(), 0) + postfix;
    }

    protected String _joinToString_transform(final String prefix, final String postfix, final Function<? super T, String> transform) {
        return prefix + transform.apply(value()) + postfix;
    }

    protected String _joinToString_transform(final String prefix, final String postfix, final Supplier<String> transform) {
        return prefix + transform.get() + postfix;
    }

    //#region -------------------- Join to string ∅ --------------------

    @Override public final String joinToString() { return _joinToString_core(DEFAULT_JOIN_PREFIX_STRING, DEFAULT_JOIN_POSTFIX_STRING); }

    //#endregion -------------------- Join to string ∅ --------------------
    //#region -------------------- Join to string (separator) --------------------

    @Override public final String joinToString(final @Nullable String    separator) { return _joinToString_core(DEFAULT_JOIN_PREFIX_STRING, DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final @Nullable Character separator) { return _joinToString_core(DEFAULT_JOIN_PREFIX_STRING, DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final char                separator) { return _joinToString_core(DEFAULT_JOIN_PREFIX_STRING, DEFAULT_JOIN_POSTFIX_STRING); }

    //#endregion -------------------- Join to string (separator) --------------------
    //#region -------------------- Join to string (separator, prefix) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix) { return _joinToString_core(valueOf(prefix),                                                 DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix) { return _joinToString_core(valueOf(prefix),                                                 DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), DEFAULT_JOIN_POSTFIX_STRING); }
    @Override public final String joinToString(final char                separator, final char                prefix) { return _joinToString_core(valueOf(prefix),                                                 DEFAULT_JOIN_POSTFIX_STRING); }

    //#endregion -------------------- Join to string (separator, prefix) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            valueOf(postfix)); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), valueOf(postfix)); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix) { return _joinToString_core(valueOf(prefix),                                                 postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix) { return _joinToString_core(valueOf(prefix),                                                 postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix) { return _joinToString_core(valueOf(prefix),                                                 valueOf(postfix)); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            valueOf(postfix)); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), valueOf(postfix)); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix) { return _joinToString_core(valueOf(prefix),                                                 postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix) { return _joinToString_core(valueOf(prefix),                                                 postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix) { return _joinToString_core(valueOf(prefix),                                                 valueOf(postfix)); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix,            valueOf(postfix)); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix) { return _joinToString_core(prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString(), valueOf(postfix)); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix) { return _joinToString_core(valueOf(prefix),                                                 postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix) { return _joinToString_core(valueOf(prefix),                                                 postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString()); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix) { return _joinToString_core(valueOf(prefix),                                                 valueOf(postfix)); }

    //#endregion -------------------- Join to string (separator, prefix, postfix) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, DEFAULT_JOIN_TRUNCATED_STRING);
        return _joinToString_core(prefix2, postfix2);
    }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_core(prefix2, postfix2);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (limit == null)
            return _joinToString_core(prefix2, postfix2);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_core(prefix2, postfix2);
    }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T, int) → string) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable ObjIntFunction<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T, int) → string) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T) → string) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Function<? super T, String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T) → string) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform () → string) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix;
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = prefix == null ? DEFAULT_JOIN_PREFIX_STRING : prefix.toString();
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix;
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = postfix == null ? DEFAULT_JOIN_POSTFIX_STRING : postfix.toString();
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final int limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        if (transform == null)
            return _joinToString_core(prefix2, postfix2);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated);
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, truncated == null ? DEFAULT_JOIN_TRUNCATED_STRING : truncated.toString());
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated, final @Nullable Supplier<String> transform) {
        final var prefix2 = valueOf(prefix);
        final var postfix2 = valueOf(postfix);
        if (transform == null)
            if (limit == null)
                return _joinToString_core(prefix2, postfix2);
            else if (__getLastIndex(limit) == 0)
                return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
            else
                return _joinToString_core(prefix2, postfix2);
        if (limit == null)
            return _joinToString_transform(prefix2, postfix2, transform);
        if (__getLastIndex(limit) == 0)
            return _joinToString_truncated(prefix2, postfix2, valueOf(truncated));
        return _joinToString_transform(prefix2, postfix2, transform);
    }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform () → string) --------------------

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    //#region -------------------- Equals --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof MinimalistCollectionHolder<?> otherConverted)) //Quick check without a lot of boilerplate methods to validate for the instanceof
            return false;
        if (otherConverted.size() != 1)
            return false;
        if (other instanceof CollectionHolder<?> otherConverted2)
            return Objects.deepEquals(value(), otherConverted2.getFirst());
        return Objects.deepEquals(value(), otherConverted.get(0));
    }

    //#endregion -------------------- Equals --------------------

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractCollectionHolderOf1<T> clone() {
        return (AbstractCollectionHolderOf1<T>) super.clone();
    }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public abstract AbstractOf1CollectionHolderOf1<T> shallowClone();
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public abstract AbstractOf1CollectionHolderOf1<T> deepClone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
