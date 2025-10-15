package joookiwi.collection.java;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TransferQueue;
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
import joookiwi.collection.java.extended.ImmutableArrayBlockingQueue;
import joookiwi.collection.java.extended.ImmutableArrayDeque;
import joookiwi.collection.java.extended.ImmutableArrayList;
import joookiwi.collection.java.extended.ImmutableBlockingDeque;
import joookiwi.collection.java.extended.ImmutableBlockingQueue;
import joookiwi.collection.java.extended.ImmutableCollection;
import joookiwi.collection.java.extended.ImmutableConcurrentLinkedDeque;
import joookiwi.collection.java.extended.ImmutableConcurrentLinkedQueue;
import joookiwi.collection.java.extended.ImmutableConcurrentSkipListSet;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArrayList;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArraySet;
import joookiwi.collection.java.extended.ImmutableDelayQueue;
import joookiwi.collection.java.extended.ImmutableDeque;
import joookiwi.collection.java.extended.ImmutableHashSet;
import joookiwi.collection.java.extended.ImmutableLinkedBlockingDeque;
import joookiwi.collection.java.extended.ImmutableLinkedBlockingQueue;
import joookiwi.collection.java.extended.ImmutableLinkedHashSet;
import joookiwi.collection.java.extended.ImmutableLinkedList;
import joookiwi.collection.java.extended.ImmutableLinkedTransferQueue;
import joookiwi.collection.java.extended.ImmutableList;
import joookiwi.collection.java.extended.ImmutableNavigableSet;
import joookiwi.collection.java.extended.ImmutablePriorityBlockingQueue;
import joookiwi.collection.java.extended.ImmutablePriorityQueue;
import joookiwi.collection.java.extended.ImmutableQueue;
import joookiwi.collection.java.extended.ImmutableSequencedCollection;
import joookiwi.collection.java.extended.ImmutableSequencedSet;
import joookiwi.collection.java.extended.ImmutableSet;
import joookiwi.collection.java.extended.ImmutableSortedSet;
import joookiwi.collection.java.extended.ImmutableStack;
import joookiwi.collection.java.extended.ImmutableSynchronousQueue;
import joookiwi.collection.java.extended.ImmutableTransferQueue;
import joookiwi.collection.java.extended.ImmutableTreeSet;
import joookiwi.collection.java.extended.ImmutableVector;
import joookiwi.collection.java.extended.MutableArrayBlockingQueue;
import joookiwi.collection.java.extended.MutableArrayDeque;
import joookiwi.collection.java.extended.MutableArrayList;
import joookiwi.collection.java.extended.MutableBlockingDeque;
import joookiwi.collection.java.extended.MutableBlockingQueue;
import joookiwi.collection.java.extended.MutableCollection;
import joookiwi.collection.java.extended.MutableConcurrentLinkedDeque;
import joookiwi.collection.java.extended.MutableConcurrentLinkedQueue;
import joookiwi.collection.java.extended.MutableConcurrentSkipListSet;
import joookiwi.collection.java.extended.MutableCopyOnWriteArrayList;
import joookiwi.collection.java.extended.MutableCopyOnWriteArraySet;
import joookiwi.collection.java.extended.MutableDelayQueue;
import joookiwi.collection.java.extended.MutableDeque;
import joookiwi.collection.java.extended.MutableHashSet;
import joookiwi.collection.java.extended.MutableLinkedBlockingDeque;
import joookiwi.collection.java.extended.MutableLinkedBlockingQueue;
import joookiwi.collection.java.extended.MutableLinkedHashSet;
import joookiwi.collection.java.extended.MutableLinkedList;
import joookiwi.collection.java.extended.MutableLinkedTransferQueue;
import joookiwi.collection.java.extended.MutableList;
import joookiwi.collection.java.extended.MutableNavigableSet;
import joookiwi.collection.java.extended.MutablePriorityBlockingQueue;
import joookiwi.collection.java.extended.MutablePriorityQueue;
import joookiwi.collection.java.extended.MutableQueue;
import joookiwi.collection.java.extended.MutableSequencedCollection;
import joookiwi.collection.java.extended.MutableSequencedSet;
import joookiwi.collection.java.extended.MutableSet;
import joookiwi.collection.java.extended.MutableSortedSet;
import joookiwi.collection.java.extended.MutableStack;
import joookiwi.collection.java.extended.MutableSynchronousQueue;
import joookiwi.collection.java.extended.MutableTransferQueue;
import joookiwi.collection.java.extended.MutableTreeSet;
import joookiwi.collection.java.extended.MutableVector;
import joookiwi.collection.java.iterator.CollectionIterator;
import joookiwi.collection.java.method.All;
import joookiwi.collection.java.method.Any;
import joookiwi.collection.java.method.Drop;
import joookiwi.collection.java.method.DropLast;
import joookiwi.collection.java.method.DropLastWhile;
import joookiwi.collection.java.method.DropLastWhileIndexed;
import joookiwi.collection.java.method.DropWhile;
import joookiwi.collection.java.method.DropWhileIndexed;
import joookiwi.collection.java.method.Filter;
import joookiwi.collection.java.method.FilterIndexed;
import joookiwi.collection.java.method.FilterNotIndexed;
import joookiwi.collection.java.method.FilterNot;
import joookiwi.collection.java.method.FilterNotNull;
import joookiwi.collection.java.method.FindFirst;
import joookiwi.collection.java.method.FindFirstIndexed;
import joookiwi.collection.java.method.FindFirstIndexedOrNull;
import joookiwi.collection.java.method.FindFirstOrNull;
import joookiwi.collection.java.method.FindLast;
import joookiwi.collection.java.method.FindLastIndexed;
import joookiwi.collection.java.method.FindLastIndexedOrNull;
import joookiwi.collection.java.method.FindLastOrNull;
import joookiwi.collection.java.method.FirstIndexOf;
import joookiwi.collection.java.method.FirstIndexOfOrNull;
import joookiwi.collection.java.method.ForEach;
import joookiwi.collection.java.method.ForEachIndexed;
import joookiwi.collection.java.method.GetFirst;
import joookiwi.collection.java.method.GetFirstOrElse;
import joookiwi.collection.java.method.GetFirstOrNull;
import joookiwi.collection.java.method.GetLast;
import joookiwi.collection.java.method.GetLastOrElse;
import joookiwi.collection.java.method.GetLastOrNull;
import joookiwi.collection.java.method.GetOrElse;
import joookiwi.collection.java.method.GetOrNull;
import joookiwi.collection.java.method.Has;
import joookiwi.collection.java.method.HasDuplicate;
import joookiwi.collection.java.method.HasNoDuplicates;
import joookiwi.collection.java.method.HasNoNulls;
import joookiwi.collection.java.method.HasNot;
import joookiwi.collection.java.method.HasNotAll;
import joookiwi.collection.java.method.HasNotAll;
import joookiwi.collection.java.method.HasNotOne;
import joookiwi.collection.java.method.HasNull;
import joookiwi.collection.java.method.HasAll;
import joookiwi.collection.java.method.HasOne;
import joookiwi.collection.java.method.JoinToString;
import joookiwi.collection.java.method.IndexOfFirst;
import joookiwi.collection.java.method.IndexOfFirstIndexed;
import joookiwi.collection.java.method.IndexOfFirstIndexedOrNull;
import joookiwi.collection.java.method.IndexOfFirstOrNull;
import joookiwi.collection.java.method.IndexOfLast;
import joookiwi.collection.java.method.IndexOfLastIndexed;
import joookiwi.collection.java.method.IndexOfLastIndexedOrNull;
import joookiwi.collection.java.method.IndexOfLastOrNull;
import joookiwi.collection.java.method.IsEmpty;
import joookiwi.collection.java.method.IsNotEmpty;
import joookiwi.collection.java.method.LastIndexOf;
import joookiwi.collection.java.method.LastIndexOfOrNull;
import joookiwi.collection.java.method.MapIndexed;
import joookiwi.collection.java.method.MapNotNull;
import joookiwi.collection.java.method.MapNotNullIndexed;
import joookiwi.collection.java.method.None;
import joookiwi.collection.java.method.OnEach;
import joookiwi.collection.java.method.OnEachIndexed;
import joookiwi.collection.java.method.RequireNoNulls;
import joookiwi.collection.java.method.Slice;
import joookiwi.collection.java.method.Take;
import joookiwi.collection.java.method.TakeLast;
import joookiwi.collection.java.method.TakeLastWhile;
import joookiwi.collection.java.method.TakeLastWhileIndexed;
import joookiwi.collection.java.method.TakeWhile;
import joookiwi.collection.java.method.TakeWhileIndexed;
import joookiwi.collection.java.method.ToArray;
import joookiwi.collection.java.method.ToArrayBlockingQueue;
import joookiwi.collection.java.method.ToArrayDeque;
import joookiwi.collection.java.method.ToArrayList;
import joookiwi.collection.java.method.ToBlockingDeque;
import joookiwi.collection.java.method.ToBlockingQueue;
import joookiwi.collection.java.method.ToCollection;
import joookiwi.collection.java.method.ToConcurrentLinkedDeque;
import joookiwi.collection.java.method.ToConcurrentLinkedQueue;
import joookiwi.collection.java.method.ToConcurrentSkipListSet;
import joookiwi.collection.java.method.ToCopyOnWriteArrayList;
import joookiwi.collection.java.method.ToCopyOnWriteArraySet;
import joookiwi.collection.java.method.ToDelayQueue;
import joookiwi.collection.java.method.ToDeque;
import joookiwi.collection.java.method.ToHashSet;
import joookiwi.collection.java.method.ToIterator;
import joookiwi.collection.java.method.ToLinkedBlockingDeque;
import joookiwi.collection.java.method.ToLinkedBlockingQueue;
import joookiwi.collection.java.method.ToLinkedHashSet;
import joookiwi.collection.java.method.ToLinkedList;
import joookiwi.collection.java.method.ToLinkedTransferQueue;
import joookiwi.collection.java.method.ToList;
import joookiwi.collection.java.method.ToLocaleLowerCaseString;
import joookiwi.collection.java.method.ToLocaleString;
import joookiwi.collection.java.method.ToLocaleUpperCaseString;
import joookiwi.collection.java.method.ToLowerCaseString;
import joookiwi.collection.java.method.ToMap;
import joookiwi.collection.java.method.ToMutableArrayBlockingQueue;
import joookiwi.collection.java.method.ToMutableArrayDeque;
import joookiwi.collection.java.method.ToMutableArrayList;
import joookiwi.collection.java.method.ToMutableBlockingDeque;
import joookiwi.collection.java.method.ToMutableBlockingQueue;
import joookiwi.collection.java.method.ToMutableCollection;
import joookiwi.collection.java.method.ToMutableConcurrentLinkedDeque;
import joookiwi.collection.java.method.ToMutableConcurrentLinkedQueue;
import joookiwi.collection.java.method.ToMutableConcurrentSkipListSet;
import joookiwi.collection.java.method.ToMutableCopyOnWriteArrayList;
import joookiwi.collection.java.method.ToMutableCopyOnWriteArraySet;
import joookiwi.collection.java.method.ToMutableDelayQueue;
import joookiwi.collection.java.method.ToMutableDeque;
import joookiwi.collection.java.method.ToMutableEnumSet;
import joookiwi.collection.java.method.ToMutableHashSet;
import joookiwi.collection.java.method.ToMutableLinkedBlockingDeque;
import joookiwi.collection.java.method.ToMutableLinkedBlockingQueue;
import joookiwi.collection.java.method.ToMutableLinkedHashSet;
import joookiwi.collection.java.method.ToMutableLinkedList;
import joookiwi.collection.java.method.ToMutableLinkedTransferQueue;
import joookiwi.collection.java.method.ToMutableList;
import joookiwi.collection.java.method.ToMutablePriorityBlockingQueue;
import joookiwi.collection.java.method.ToMutablePriorityQueue;
import joookiwi.collection.java.method.ToMutableQueue;
import joookiwi.collection.java.method.ToMutableSequencedCollection;
import joookiwi.collection.java.method.ToMutableSequencedSet;
import joookiwi.collection.java.method.ToMutableSet;
import joookiwi.collection.java.method.ToMutableSortedSet;
import joookiwi.collection.java.method.ToMutableStack;
import joookiwi.collection.java.method.ToMutableSynchronousQueue;
import joookiwi.collection.java.method.ToMutableTransferQueue;
import joookiwi.collection.java.method.ToMutableTreeSet;
import joookiwi.collection.java.method.ToMutableVector;
import joookiwi.collection.java.method.ToNavigableSet;
import joookiwi.collection.java.method.ToPriorityBlockingQueue;
import joookiwi.collection.java.method.ToPriorityQueue;
import joookiwi.collection.java.method.ToQueue;
import joookiwi.collection.java.method.ToReverse;
import joookiwi.collection.java.method.ToSequencedCollection;
import joookiwi.collection.java.method.ToSequencedSet;
import joookiwi.collection.java.method.ToSet;
import joookiwi.collection.java.method.ToSortedSet;
import joookiwi.collection.java.method.ToSpliterator;
import joookiwi.collection.java.method.ToStack;
import joookiwi.collection.java.method.ToString;
import joookiwi.collection.java.method.ToSynchronousQueue;
import joookiwi.collection.java.method.ToTransferQueue;
import joookiwi.collection.java.method.ToTreeSet;
import joookiwi.collection.java.method.ToUpperCaseString;
import joookiwi.collection.java.method.ToVector;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.String.valueOf;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.NULL_INT;

/// A definition of a [CollectionHolder] to have a common ancestor.
/// No state or reference is held in this instance.
/// It only uses the extension function for the method implementation
///
/// @param <T> The type
/// @see EmptyCollectionHolder
/// @see GenericCollectionHolder
/// @see CollectionViewer
@NotNullByDefault
public abstract class AbstractCollectionHolder<T extends @Nullable Object>
        extends AbstractMinimalistCollectionHolder<T>
        implements CollectionHolder<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractCollectionHolder() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int length() { return size(); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int count() { return size(); }

    @Override public boolean isEmpty() { return IsEmpty.isEmpty(this); }
    @Override public boolean isNotEmpty() { return IsNotEmpty.isNotEmpty(this); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public final T at(final int index) { return get(index); }

    @Override public final T elementAt(final int index) { return get(index); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    @Override public T getFirst() { return GetFirst.getFirst(this); }

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    @Override public T getLast() { return GetLast.getLast(this); }

    //#endregion -------------------- Get last --------------------

    //#region -------------------- Get or else --------------------

    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return GetOrElse.getOrElse(this, index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return GetOrElse.getOrElse(this, index, defaultValue); }

    @Override public final T atOrElse(final int index, final IntFunction<? extends T> defaultValue) { return getOrElse(index, defaultValue); }
    @Override public final T atOrElse(final int index, final Supplier<? extends T>    defaultValue) { return getOrElse(index, defaultValue); }

    @Override public final T elementAtOrElse(final int index, final IntFunction<? extends T> defaultValue) { return getOrElse(index, defaultValue); }
    @Override public final T elementAtOrElse(final int index, final Supplier<? extends T>    defaultValue) { return getOrElse(index, defaultValue); }

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get first or else --------------------

    @Override public T getFirstOrElse(final Supplier<? extends T> defaultValue) { return GetFirstOrElse.getFirstOrElse(this, defaultValue); }

    //#endregion -------------------- Get first or else --------------------
    //#region -------------------- Get last or else --------------------

    @Override public T getLastOrElse(final Supplier<? extends T> defaultValue) { return GetLastOrElse.getLastOrElse(this, defaultValue); }

    //#endregion -------------------- Get last or else --------------------

    //#region -------------------- Get or null --------------------

    @Override public @Nullable T getOrNull(final int index) { return GetOrNull.getOrNull(this, index); }

    @Override public final @Nullable T atOrNull(final int index) { return getOrNull(index); }

    @Override public final @Nullable T elementAtOrNull(final int index) { return getOrNull(index); }

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    @Override public @Nullable T getFirstOrNull() { return GetFirstOrNull.getFirstOrNull(this); }

    //#endregion -------------------- Get first or null --------------------
    //#region -------------------- Get last or null --------------------

    @Override public @Nullable T getLastOrNull() { return GetLastOrNull.getLastOrNull(this); }

    //#endregion -------------------- Get last or null --------------------

    //#region -------------------- First --------------------

    @Override public final T first() { return getFirst(); }

    @Override public final T first(final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return getFirst();
        return findFirst(predicate);
    }

    @Override public final T first(final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return getFirst();
        return findFirst(predicate);
    }

    @Override public final T first(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getFirst();
        return findFirst(predicate);
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- First indexed --------------------

    @Override public final T firstIndexed() { return getFirst(); }

    @Override public final T firstIndexed(final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return getFirst();
        return findFirstIndexed(predicate);
    }

    @Override public final T firstIndexed(final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return getFirst();
        return findFirstIndexed(predicate);
    }

    @Override public final T firstIndexed(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getFirst();
        return findFirstIndexed(predicate);
    }

    //#endregion -------------------- First indexed --------------------
    //#region -------------------- First or null --------------------

    @Override public final @Nullable T firstOrNull() { return getFirstOrNull(); }

    @Override public final @Nullable T firstOrNull(final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return getFirstOrNull();
        return findFirstOrNull(predicate);
    }

    @Override public final @Nullable T firstOrNull(final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return getFirstOrNull();
        return findFirstOrNull(predicate);
    }

    @Override public final @Nullable T firstOrNull(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getFirstOrNull();
        return findFirstOrNull(predicate);
    }

    //#endregion -------------------- First or null --------------------
    //#region -------------------- First indexed or null --------------------

    @Override public final @Nullable T firstIndexedOrNull() { return getFirstOrNull(); }

    @Override public final @Nullable T firstIndexedOrNull(final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return getFirstOrNull();
        return findFirstIndexedOrNull(predicate);
    }

    @Override public final @Nullable T firstIndexedOrNull(final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return getFirstOrNull();
        return findFirstIndexedOrNull(predicate);
    }

    @Override public final @Nullable T firstIndexedOrNull(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getFirstOrNull();
        return findFirstIndexedOrNull(predicate);
    }

    //#endregion -------------------- First indexed or null --------------------

    //#region -------------------- Last --------------------

    @Override public final T last() { return getLast(); }

    @Override public final T last(final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return getLast();
        return findLast(predicate);
    }

    @Override public final T last(final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return getLast();
        return findLast(predicate);
    }

    @Override public final T last(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getLast();
        return findLast(predicate);
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last indexed --------------------

    @Override public final T lastIndexed() { return getLast(); }

    @Override public final T lastIndexed(final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return getLast();
        return findLastIndexed(predicate);
    }

    @Override public final T lastIndexed(final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return getLast();
        return findLastIndexed(predicate);
    }

    @Override public final T lastIndexed(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getLast();
        return findLastIndexed(predicate);
    }

    //#endregion -------------------- Last indexed --------------------
    //#region -------------------- Last or null --------------------

    @Override public final @Nullable T lastOrNull() { return getLastOrNull(); }

    @Override public final @Nullable T lastOrNull(final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return getLastOrNull();
        return findLastOrNull(predicate);
    }

    @Override public final @Nullable T lastOrNull(final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return getLastOrNull();
        return findLastOrNull(predicate);
    }

    @Override public final @Nullable T lastOrNull(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getLastOrNull();
        return findLastOrNull(predicate);
    }

    //#endregion -------------------- Last or null --------------------
    //#region -------------------- Last indexed or null --------------------

    @Override public final @Nullable T lastIndexedOrNull() { return getLastOrNull(); }

    @Override public final @Nullable T lastIndexedOrNull(final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return getLastOrNull();
        return findLastIndexedOrNull(predicate);
    }

    @Override public final @Nullable T lastIndexedOrNull(final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return getLastOrNull();
        return findLastIndexedOrNull(predicate);
    }

    @Override public final @Nullable T lastIndexedOrNull(final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return getLastOrNull();
        return findLastIndexedOrNull(predicate);
    }

    //#endregion -------------------- Last indexed or null --------------------

    //#region -------------------- Find first --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(this, predicate); }
    @Override public T findFirst(final Predicate<? super T>       predicate) { return FindFirst.findFirst(this, predicate); }
    @Override public T findFirst(final BooleanSupplier            predicate) { return FindFirst.findFirst(this, predicate); }

    @Override public final T find(final ObjIntPredicate<? super T> predicate) { return findFirst(predicate); }
    @Override public final T find(final Predicate<? super T>       predicate) { return findFirst(predicate); }
    @Override public final T find(final BooleanSupplier            predicate) { return findFirst(predicate); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first indexed --------------------

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return FindFirstIndexed.findFirstIndexed(this, predicate); }
    @Override public T findFirstIndexed(final IntPredicate               predicate) { return FindFirstIndexed.findFirstIndexed(this, predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return FindFirstIndexed.findFirstIndexed(this, predicate); }

    @Override public final T findIndexed(final IntObjPredicate<? super T> predicate) { return findFirstIndexed(predicate); }
    @Override public final T findIndexed(final IntPredicate               predicate) { return findFirstIndexed(predicate); }
    @Override public final T findIndexed(final BooleanSupplier            predicate) { return findFirstIndexed(predicate); }

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first or null --------------------

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return FindFirstOrNull.findFirstOrNull(this, predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return FindFirstOrNull.findFirstOrNull(this, predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return FindFirstOrNull.findFirstOrNull(this, predicate); }

    @Override public final @Nullable T findOrNull(final ObjIntPredicate<? super T> predicate) { return findFirstOrNull(predicate); }
    @Override public final @Nullable T findOrNull(final Predicate<? super T>       predicate) { return findFirstOrNull(predicate); }
    @Override public final @Nullable T findOrNull(final BooleanSupplier            predicate) { return findFirstOrNull(predicate); }

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed or null --------------------

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(this, predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(this, predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(this, predicate); }

    @Override public final @Nullable T findIndexedOrNull(final IntObjPredicate<? super T> predicate) { return findFirstIndexedOrNull(predicate); }
    @Override public final @Nullable T findIndexedOrNull(final IntPredicate               predicate) { return findFirstIndexedOrNull(predicate); }
    @Override public final @Nullable T findIndexedOrNull(final BooleanSupplier            predicate) { return findFirstIndexedOrNull(predicate); }

    //#endregion -------------------- Find first indexed or null --------------------

    //#region -------------------- Find last --------------------

    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return FindLast.findLast(this, predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return FindLast.findLast(this, predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return FindLast.findLast(this, predicate); }

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last indexed --------------------

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return FindLastIndexed.findLastIndexed(this, predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return FindLastIndexed.findLastIndexed(this, predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return FindLastIndexed.findLastIndexed(this, predicate); }

    //#endregion -------------------- Find last indexed --------------------
    //#region -------------------- Find last or null --------------------

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return FindLastOrNull.findLastOrNull(this, predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return FindLastOrNull.findLastOrNull(this, predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return FindLastOrNull.findLastOrNull(this, predicate); }

    //#endregion -------------------- Find last or null --------------------
    //#region -------------------- Find last indexed or null --------------------

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(this, predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(this, predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(this, predicate); }

    //#endregion -------------------- Find last indexed or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element                                            ) { return FirstIndexOf.firstIndexOf(this, element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from              ) { return FirstIndexOf.firstIndexOf(this, element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from, final int to) { return FirstIndexOf.firstIndexOf(this, element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final @Nullable Integer from, final int to) { return FirstIndexOf.firstIndexOf(this, element, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final @Nullable Integer from) {
        if (from == null)
            return firstIndexOf(element);
        return firstIndexOf(element, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int from, final @Nullable Integer to) {
        if (to == null)
            return firstIndexOf(element, from);
        return firstIndexOf(element, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return firstIndexOf(element);
            else
                return firstIndexOf(element, NULL_INT, to.intValue());
        if (to == null)
            return firstIndexOf(element, from.intValue());
        return firstIndexOf(element, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element                                                          ) { return firstIndexOf(element); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final int               from                            ) { return firstIndexOf(element, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final @Nullable Integer from                            ) { return firstIndexOf(element, from); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final int               from, final int               to) { return firstIndexOf(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final @Nullable Integer from, final int               to) { return firstIndexOf(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final int               from, final @Nullable Integer to) { return firstIndexOf(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return firstIndexOf(element, from, to); }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element                                            ) { return FirstIndexOfOrNull.firstIndexOfOrNull(this, element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from              ) { return FirstIndexOfOrNull.firstIndexOfOrNull(this, element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(this, element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(this, element, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from) {
        if (from == null)
            return firstIndexOfOrNull(element);
        return firstIndexOfOrNull(element, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int from, final @Nullable Integer to) {
        if (to == null)
            return firstIndexOfOrNull(element, from);
        return firstIndexOfOrNull(element, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return firstIndexOfOrNull(element);
            else
                return firstIndexOfOrNull(element, NULL_INT, to.intValue());
        if (to == null)
            return firstIndexOfOrNull(element, from.intValue());
        return firstIndexOfOrNull(element, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element                                                          ) { return firstIndexOfOrNull(element); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final int               from                            ) { return firstIndexOfOrNull(element, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final @Nullable Integer from                            ) { return firstIndexOfOrNull(element, from); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final int               from, final int               to) { return firstIndexOfOrNull(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return firstIndexOfOrNull(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return firstIndexOfOrNull(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return firstIndexOfOrNull(element, from, to); }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element                                            ) { return LastIndexOf.lastIndexOf(this, element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from              ) { return LastIndexOf.lastIndexOf(this, element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from, final int to) { return LastIndexOf.lastIndexOf(this, element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final @Nullable Integer from, final int to) { return LastIndexOf.lastIndexOf(this, element, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final @Nullable Integer from) {
        if (from == null)
            return lastIndexOf(element);
        return lastIndexOf(element, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int from, final @Nullable Integer to) {
        if (to == null)
            return lastIndexOf(element, from);
        return lastIndexOf(element, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return lastIndexOf(element);
            else
                return lastIndexOf(element, NULL_INT, to.intValue());
        if (to == null)
            return lastIndexOf(element, from.intValue());
        return lastIndexOf(element, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element                                            ) { return LastIndexOfOrNull.lastIndexOfOrNull(this, element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from              ) { return LastIndexOfOrNull.lastIndexOfOrNull(this, element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int to) { return LastIndexOfOrNull.lastIndexOfOrNull(this, element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return LastIndexOfOrNull.lastIndexOfOrNull(this, element, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from) {
        if (from == null)
            return lastIndexOfOrNull(element);
        return lastIndexOfOrNull(element, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int from, final @Nullable Integer to) {
        if (to == null)
            return lastIndexOfOrNull(element, from);
        return lastIndexOfOrNull(element, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return lastIndexOfOrNull(element);
            else
                return lastIndexOfOrNull(element, NULL_INT, to.intValue());
        if (to == null)
            return lastIndexOfOrNull(element, from.intValue());
        return lastIndexOfOrNull(element, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfFirst.indexOfFirst(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate                                            ) { return IndexOfFirst.indexOfFirst(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate                                            ) { return IndexOfFirst.indexOfFirst(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirst(predicate);
        return indexOfFirst(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirst(predicate, from);
        return indexOfFirst(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirst(predicate);
            else
                return indexOfFirst(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirst(predicate, from.intValue());
        return indexOfFirst(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirst(predicate);
        return indexOfFirst(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirst(predicate, from);
        return indexOfFirst(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirst(predicate);
            else
                return indexOfFirst(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirst(predicate, from.intValue());
        return indexOfFirst(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirst(predicate);
        return indexOfFirst(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirst(predicate, from);
        return indexOfFirst(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirst(predicate);
            else
                return indexOfFirst(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirst(predicate, from.intValue());
        return indexOfFirst(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstOrNull(predicate);
        return indexOfFirstOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstOrNull(predicate, from);
        return indexOfFirstOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstOrNull(predicate);
            else
                return indexOfFirstOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstOrNull(predicate, from.intValue());
        return indexOfFirstOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstOrNull(predicate);
        return indexOfFirstOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstOrNull(predicate, from);
        return indexOfFirstOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstOrNull(predicate);
            else
                return indexOfFirstOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstOrNull(predicate, from.intValue());
        return indexOfFirstOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstOrNull(predicate);
        return indexOfFirstOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstOrNull(predicate, from);
        return indexOfFirstOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstOrNull(predicate);
            else
                return indexOfFirstOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstOrNull(predicate, from.intValue());
        return indexOfFirstOrNull(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstIndexed(predicate);
        return indexOfFirstIndexed(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstIndexed(predicate, from);
        return indexOfFirstIndexed(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstIndexed(predicate);
            else
                return indexOfFirstIndexed(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstIndexed(predicate, from.intValue());
        return indexOfFirstIndexed(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstIndexed(predicate);
        return indexOfFirstIndexed(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstIndexed(predicate, from);
        return indexOfFirstIndexed(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstIndexed(predicate);
            else
                return indexOfFirstIndexed(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstIndexed(predicate, from.intValue());
        return indexOfFirstIndexed(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstIndexed(predicate);
        return indexOfFirstIndexed(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstIndexed(predicate, from);
        return indexOfFirstIndexed(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstIndexed(predicate);
            else
                return indexOfFirstIndexed(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstIndexed(predicate, from.intValue());
        return indexOfFirstIndexed(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstIndexedOrNull(predicate);
        return indexOfFirstIndexedOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstIndexedOrNull(predicate, from);
        return indexOfFirstIndexedOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstIndexedOrNull(predicate);
            else
                return indexOfFirstIndexedOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstIndexedOrNull(predicate, from.intValue());
        return indexOfFirstIndexedOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstIndexedOrNull(predicate);
        return indexOfFirstIndexedOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstIndexedOrNull(predicate, from);
        return indexOfFirstIndexedOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstIndexedOrNull(predicate);
            else
                return indexOfFirstIndexedOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstIndexedOrNull(predicate, from.intValue());
        return indexOfFirstIndexedOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfFirstIndexedOrNull(predicate);
        return indexOfFirstIndexedOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfFirstIndexedOrNull(predicate, from);
        return indexOfFirstIndexedOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfFirstIndexedOrNull(predicate);
            else
                return indexOfFirstIndexedOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfFirstIndexedOrNull(predicate, from.intValue());
        return indexOfFirstIndexedOrNull(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfLast.indexOfLast(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate                                            ) { return IndexOfLast.indexOfLast(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate                                            ) { return IndexOfLast.indexOfLast(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfLast.indexOfLast(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfLast.indexOfLast(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLast.indexOfLast(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLast(predicate);
        return indexOfLast(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLast(predicate, from);
        return indexOfLast(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLast(predicate);
            else
                return indexOfLast(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLast(predicate, from.intValue());
        return indexOfLast(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLast(predicate);
        return indexOfLast(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLast(predicate, from);
        return indexOfLast(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLast(predicate);
            else
                return indexOfLast(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLast(predicate, from.intValue());
        return indexOfLast(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLast(predicate);
        return indexOfLast(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLast(predicate, from);
        return indexOfLast(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLast(predicate);
            else
                return indexOfLast(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLast(predicate, from.intValue());
        return indexOfLast(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastOrNull(predicate);
        return indexOfLastOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastOrNull(predicate, from);
        return indexOfLastOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastOrNull(predicate);
            else
                return indexOfLastOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastOrNull(predicate, from.intValue());
        return indexOfLastOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastOrNull(predicate);
        return indexOfLastOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastOrNull(predicate, from);
        return indexOfLastOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastOrNull(predicate);
            else
                return indexOfLastOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastOrNull(predicate, from.intValue());
        return indexOfLastOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastOrNull(predicate);
        return indexOfLastOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastOrNull(predicate, from);
        return indexOfLastOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastOrNull(predicate);
            else
                return indexOfLastOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastOrNull(predicate, from.intValue());
        return indexOfLastOrNull(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastIndexed(predicate);
        return indexOfLastIndexed(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastIndexed(predicate, from);
        return indexOfLastIndexed(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastIndexed(predicate);
            else
                return indexOfLastIndexed(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastIndexed(predicate, from.intValue());
        return indexOfLastIndexed(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastIndexed(predicate);
        return indexOfLastIndexed(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastIndexed(predicate, from);
        return indexOfLastIndexed(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastIndexed(predicate);
            else
                return indexOfLastIndexed(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastIndexed(predicate, from.intValue());
        return indexOfLastIndexed(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastIndexed(predicate);
        return indexOfLastIndexed(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastIndexed(predicate, from);
        return indexOfLastIndexed(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastIndexed(predicate);
            else
                return indexOfLastIndexed(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastIndexed(predicate, from.intValue());
        return indexOfLastIndexed(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(this, predicate, from, to); }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastIndexedOrNull(predicate);
        return indexOfLastIndexedOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastIndexedOrNull(predicate, from);
        return indexOfLastIndexedOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastIndexedOrNull(predicate);
            else
                return indexOfLastIndexedOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastIndexedOrNull(predicate, from.intValue());
        return indexOfLastIndexedOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastIndexedOrNull(predicate);
        return indexOfLastIndexedOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastIndexedOrNull(predicate, from);
        return indexOfLastIndexedOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastIndexedOrNull(predicate);
            else
                return indexOfLastIndexedOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastIndexedOrNull(predicate, from.intValue());
        return indexOfLastIndexedOrNull(predicate, from.intValue(), to.intValue());
    }


    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from) {
        if (from == null)
            return indexOfLastIndexedOrNull(predicate);
        return indexOfLastIndexedOrNull(predicate, from.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final int from, final @Nullable Integer to) {
        if (to == null)
            return indexOfLastIndexedOrNull(predicate, from);
        return indexOfLastIndexedOrNull(predicate, from, to.intValue());
    }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier predicate, final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return indexOfLastIndexedOrNull(predicate);
            else
                return indexOfLastIndexedOrNull(predicate, NULL_INT, to.intValue());
        if (to == null)
            return indexOfLastIndexedOrNull(predicate, from.intValue());
        return indexOfLastIndexedOrNull(predicate, from.intValue(), to.intValue());
    }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return All.all(this, predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return All.all(this, predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return All.all(this, predicate); }

    @Override public final boolean every(final ObjIntPredicate<? super T> predicate) { return all(predicate); }
    @Override public final boolean every(final Predicate<? super T>       predicate) { return all(predicate); }
    @Override public final boolean every(final BooleanSupplier            predicate) { return all(predicate); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Override public final boolean any() { return isNotEmpty(); }

    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return Any.any(this, predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return Any.any(this, predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return Any.any(this, predicate); }


    @Override public final boolean some() { return isNotEmpty(); }

    @Override public final boolean some(final @Nullable ObjIntPredicate<? super T> predicate) { return any(predicate); }
    @Override public final boolean some(final @Nullable Predicate<? super T>       predicate) { return any(predicate); }
    @Override public final boolean some(final @Nullable BooleanSupplier            predicate) { return any(predicate); }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Override public final boolean none() { return isEmpty(); }

    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return None.none(this, predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return None.none(this, predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return None.none(this, predicate); }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    @Override public boolean hasNull() { return HasNull.hasNull(this); }

    @Override public final boolean includesNull() { return hasNull(); }

    @Override public final boolean containsNull() { return hasNull(); }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Override public boolean hasNoNulls() { return HasNoNulls.hasNoNulls(this); }

    @Override public final boolean includesNoNulls() { return hasNoNulls(); }

    @Override public final boolean containsNoNulls() { return hasNoNulls(); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Override public boolean hasDuplicate() { return HasDuplicate.hasDuplicate(this); }

    @Override public final boolean includesDuplicate() { return hasDuplicate(); }

    @Override public final boolean containsDuplicate() { return hasDuplicate(); }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Override public boolean hasNoDuplicates() { return HasNoDuplicates.hasNoDuplicates(this); }

    @Override public final boolean includesNoDuplicates() { return hasNoDuplicates(); }

    @Override public final boolean containsNoDuplicates() { return hasNoDuplicates(); }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    @Override public boolean has(final T value) { return Has.has(this, value); }

    @Override public final boolean includes(final T value) { return has(value); }

    @Override public final boolean contains(final T value) { return  has(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    @Override public boolean hasNot(final T value) { return HasNot.hasNot(this, value); }

    @Override public final boolean includesNot(final T value) { return hasNot(value); }

    @Override public final boolean containsNot(final T value) { return  hasNot(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                            values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                        values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                         values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                         values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                            values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return HasOne.hasOne(this, values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                               values) { return HasOne.hasOne(this, values); }

    @Override public final boolean includesOne(final @Nullable Iterator<? extends T>                            values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable ListIterator<? extends T>                        values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable Spliterator<? extends T>                         values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable Enumeration<? extends T>                         values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable Iterable<? extends T>                            values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable CollectionHolder<? extends T>                    values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasOne(values); }
    @Override public final boolean includesOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasOne(values); }
    @Override public final boolean includesOne(final T @Nullable @Unmodifiable []                               values) { return hasOne(values); }

    @Override public final boolean containsOne(final @Nullable Iterator<? extends T>                            values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable ListIterator<? extends T>                        values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable Spliterator<? extends T>                         values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable Enumeration<? extends T>                         values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable Iterable<? extends T>                            values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable CollectionHolder<? extends T>                    values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasOne(values); }
    @Override public final boolean containsOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasOne(values); }
    @Override public final boolean containsOne(final T @Nullable @Unmodifiable []                               values) { return hasOne(values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                            values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                        values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                         values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                         values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                            values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return HasNotOne.hasNotOne(this, values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                               values) { return HasNotOne.hasNotOne(this, values); }

    @Override public final boolean includesNotOne(final @Nullable Iterator<? extends T>                            values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable ListIterator<? extends T>                        values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable Spliterator<? extends T>                         values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable Enumeration<? extends T>                         values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable Iterable<? extends T>                            values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasNotOne(values); }
    @Override public final boolean includesNotOne(final T @Nullable @Unmodifiable []                               values) { return hasNotOne(values); }

    @Override public final boolean containsNotOne(final @Nullable Iterator<? extends T>                            values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable ListIterator<? extends T>                        values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable Spliterator<? extends T>                         values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable Enumeration<? extends T>                         values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable Iterable<? extends T>                            values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final T @Nullable @Unmodifiable []                               values) { return hasNotOne(values); }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                                 values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                             values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                              values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                              values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                                 values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>               values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                         values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>                 values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>        values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                       values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                        values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>               values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>                  values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>               values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>                      values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>              values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable TransferQueue<? extends T>              values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>                      values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>              values) { return HasAll.hasAll(this, values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                                    values) { return HasAll.hasAll(this, values); }

    @Override public final boolean includesAll(final @Nullable Iterator<? extends T>                            values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable ListIterator<? extends T>                        values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable Spliterator<? extends T>                         values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable Enumeration<? extends T>                         values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable Iterable<? extends T>                            values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable CollectionHolder<? extends T>                    values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasAll(values); }
    @Override public final boolean includesAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasAll(values); }
    @Override public final boolean includesAll(final T @Nullable @Unmodifiable []                               values) { return hasAll(values); }

    @Override public final boolean containsAll(final @Nullable Iterator<? extends T>                            values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable ListIterator<? extends T>                        values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable Spliterator<? extends T>                         values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable Enumeration<? extends T>                         values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable Iterable<? extends T>                            values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable CollectionHolder<? extends T>                    values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasAll(values); }
    @Override public final boolean containsAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasAll(values); }
    @Override public final boolean containsAll(final T @Nullable @Unmodifiable []                               values) { return hasAll(values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                                 values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                             values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                              values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                              values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                                 values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>               values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                         values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>                 values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>        values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                       values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                        values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>               values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>                  values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>               values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>                      values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>              values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable TransferQueue<? extends T>              values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>                      values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>              values) { return HasNotAll.hasNotAll(this, values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                                    values) { return HasNotAll.hasNotAll(this, values); }

    @Override public final boolean includesNotAll(final @Nullable Iterator<? extends T>                            values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable ListIterator<? extends T>                        values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable Spliterator<? extends T>                         values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable Enumeration<? extends T>                         values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable Iterable<? extends T>                            values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable CollectionHolder<? extends T>                    values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasNotAll(values); }
    @Override public final boolean includesNotAll(final T @Nullable @Unmodifiable []                               values) { return hasNotAll(values); }

    @Override public final boolean containsNotAll(final @Nullable Iterator<? extends T>                            values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable ListIterator<? extends T>                        values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable Spliterator<? extends T>                         values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable Enumeration<? extends T>                         values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable Iterable<? extends T>                            values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable CollectionHolder<? extends T>                    values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final T @Nullable @Unmodifiable []                               values) { return hasNotAll(values); }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<T> requireNoNulls() { return RequireNoNulls.requireNoNulls(this); }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
//    //#region -------------------- Accumulation methods --------------------
//
//    //#region -------------------- Reduce --------------------
//
//    @Override public <R extends @Nullable Object> R reduce(final ObjIntAccumulator<? super T, R> operation) { return Reduce.reduce(this, operation); }
//    @Override public <R extends @Nullable Object> R reduce(final ObjAccumulator<? super T, R>    operation) { return Reduce.reduce(this, operation); }
//    @Override public <R extends @Nullable Object> R reduce(final UnaryOperator<R>                operation) { return Reduce.reduce(this, operation); }
//    @Override public <R extends @Nullable Object> R reduce(final Supplier<? extends R>           operation) { return Reduce.reduce(this, operation); }
//
//    @Override public final <R extends @Nullable Object> R reduce(final ObjIntAccumulator<? super T, R> operation, final R initial) { return fold(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduce(final ObjAccumulator<? super T, R>    operation, final R initial) { return fold(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduce(final UnaryOperator<R>                operation, final R initial) { return fold(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduce(final Supplier<? extends R>           operation, final R initial) { return fold(initial, operation); }
//
//    //#endregion -------------------- Reduce --------------------
//    //#region -------------------- Reduce or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final ObjIntAccumulator<? super T, R> operation) { return ReduceOrNull.reduceOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final ObjAccumulator<? super T, R>    operation) { return ReduceOrNull.reduceOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final UnaryOperator<R>                operation) { return ReduceOrNull.reduceOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final Supplier<? extends R>           operation) { return ReduceOrNull.reduceOrNull(this, operation); }
//
//    //#endregion -------------------- Reduce or null --------------------
//    //#region -------------------- Reduce indexed --------------------
//
//    @Override public <R extends @Nullable Object> R reduceIndexed(final IntObjAccumulator<? super T, R> operation) { return ReduceIndexed.reduceIndexed(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final IntAccumulator<R>               operation) { return ReduceIndexed.reduceIndexed(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final UnaryOperator<R>                operation) { return ReduceIndexed.reduceIndexed(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final Supplier<? extends R>           operation) { return ReduceIndexed.reduceIndexed(this, operation); }
//
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final IntObjAccumulator<? super T, R> operation, final R initial) { return foldIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final IntAccumulator<R>               operation, final R initial) { return foldIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final UnaryOperator<R>                operation, final R initial) { return foldIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final Supplier<? extends R>           operation, final R initial) { return foldIndexed(initial, operation); }
//
//    //#endregion -------------------- Reduce indexed --------------------
//    //#region -------------------- Reduce indexed or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final IntObjAccumulator<? super T, R> operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final IntAccumulator<R>               operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final UnaryOperator<R>                operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final Supplier<? extends R>           operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(this, operation); }
//
//    //#endregion -------------------- Reduce indexed or null --------------------
//
//    //#region -------------------- Reduce right --------------------
//
//    @Override public <R extends @Nullable Object> R reduceRight(final ObjIntAccumulator<? super T, R> operation) { return ReduceRight.reduceRight(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final ObjAccumulator<? super T, R>    operation) { return ReduceRight.reduceRight(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final UnaryOperator<R>                operation) { return ReduceRight.reduceRight(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final Supplier<? extends R>           operation) { return ReduceRight.reduceRight(this, operation); }
//
//    @Override public final <R extends @Nullable Object> R reduceRight(final ObjIntAccumulator<? super T, R> operation, final R initial) { return foldRight(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRight(final ObjAccumulator<? super T, R>    operation, final R initial) { return foldRight(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRight(final UnaryOperator<R>                operation, final R initial) { return foldRight(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRight(final Supplier<? extends R>           operation, final R initial) { return foldRight(initial, operation); }
//
//    //#endregion -------------------- Reduce right --------------------
//    //#region -------------------- Reduce right or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final ObjIntAccumulator<? super T, R> operation) { return ReduceRightOrNull.reduceRightOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final ObjAccumulator<? super T, R>    operation) { return ReduceRightOrNull.reduceRightOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final UnaryOperator<R>                operation) { return ReduceRightOrNull.reduceRightOrNull(this, operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final Supplier<? extends R>           operation) { return ReduceRightOrNull.reduceRightOrNull(this, operation); }
//
//    //#endregion -------------------- Reduce right or null --------------------
//    //#region -------------------- Reduce right indexed --------------------
//
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final IntObjAccumulator<? super T, R> operation) { return ReduceRightIndexed.reduceRightIndexed(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final IntAccumulator<R>               operation) { return ReduceRightIndexed.reduceRightIndexed(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final UnaryOperator<R>                operation) { return ReduceRightIndexed.reduceRightIndexed(this, operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final Supplier<? extends R>           operation) { return ReduceRightIndexed.reduceRightIndexed(this, operation); }
//
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final IntObjAccumulator<? super T, R> operation, final R initial) { return foldRightIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final IntAccumulator<R>               operation, final R initial) { return foldRightIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final UnaryOperator<R>                operation, final R initial) { return foldRightIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final Supplier<? extends R>           operation, final R initial) { return foldRightIndexed(initial, operation); }
//
//    //#endregion -------------------- Reduce right indexed --------------------
//    //#region -------------------- Reduce right indexed or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final IntObjAccumulator<? super T, R> operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final IntAccumulator<R>               operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final UnaryOperator<R>                operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final Supplier<? extends R>           operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(); }
//
//    //#endregion -------------------- Reduce right indexed or null --------------------
//
//    //#region -------------------- Fold --------------------
//
//    @Override public <R extends @Nullable Object> R fold(final R initial, final ObjIntAccumulator<? super T, R> operation) { return Fold.fold(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final ObjAccumulator<? super T, R>    operation) { return Fold.fold(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final UnaryOperator<R>                operation) { return Fold.fold(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final Supplier<? extends R>           operation) { return Fold.fold(this, initial, operation); }
//
//    //#endregion -------------------- Fold --------------------
//    //#region -------------------- Fold indexed --------------------
//
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final IntObjAccumulator<? super T, R> operation) { return FoldIndexed.foldIndexed(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final IntAccumulator<R>               operation) { return FoldIndexed.foldIndexed(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final UnaryOperator<R>                operation) { return FoldIndexed.foldIndexed(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final Supplier<? extends R>           operation) { return FoldIndexed.foldIndexed(this, initial, operation); }
//
//    //#endregion -------------------- Fold indexed --------------------
//
//    //#region -------------------- Fold right --------------------
//
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final ObjIntAccumulator<? super T, R> operation) { return FoldRight.foldRight(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final ObjAccumulator<? super T, R>    operation) { return FoldRight.foldRight(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final UnaryOperator<R>                operation) { return FoldRight.foldRight(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final Supplier<? extends R>           operation) { return FoldRight.foldRight(this, initial, operation); }
//
//    //#endregion -------------------- Fold right --------------------
//    //#region -------------------- Fold right indexed --------------------
//
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final IntObjAccumulator<? super T, R> operation) { return FoldRightIndexed.foldRightIndexed(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final IntAccumulator<R>               operation) { return FoldRightIndexed.foldRightIndexed(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final UnaryOperator<R>                operation) { return FoldRightIndexed.foldRightIndexed(this, initial, operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final Supplier<? extends R>           operation) { return FoldRightIndexed.foldRightIndexed(this, initial, operation); }
//
//    //#endregion -------------------- Fold right indexed --------------------
//
//    //#endregion -------------------- Accumulation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return Filter.filter(this, predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T>       predicate) { return Filter.filter(this, predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier            predicate) { return Filter.filter(this, predicate); }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return FilterIndexed.filterIndexed(this, predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate               predicate) { return FilterIndexed.filterIndexed(this, predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier            predicate) { return FilterIndexed.filterIndexed(this, predicate); }

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return FilterNot.filterNot(this, predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T>       predicate) { return FilterNot.filterNot(this, predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier            predicate) { return FilterNot.filterNot(this, predicate); }

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return FilterNotIndexed.filterNotIndexed(this, predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate               predicate) { return FilterNotIndexed.filterNotIndexed(this, predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier            predicate) { return FilterNotIndexed.filterNotIndexed(this, predicate); }

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    @Override public CollectionHolder<@NotNull T> filterNotNull() { return FilterNotNull.filterNotNull(this); }

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    //#region -------------------- Slice (indice) --------------------

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer>                                  indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Collection<? extends Integer>                                        indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final SequencedCollection<? extends Integer>                               indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return Slice.slice(this, indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return Slice.slice(this, indices); }

    //#endregion -------------------- Slice (indice) --------------------
    //#region -------------------- Slice (from, to) --------------------

    @Override public CollectionHolder<T> slice(                            ) { return Slice.slice(this); }
    @Override public CollectionHolder<T> slice(final int from              ) { return Slice.slice(this, from); }
    @Override public CollectionHolder<T> slice(final int from, final int to) { return Slice.slice(this, from, to); }

    @Override public final CollectionHolder<T> slice(final @Nullable Integer from) {
        if (from == null)
            return slice();
        return slice(from.intValue());
    }

    @Override public final CollectionHolder<T> slice(final int from, final @Nullable Integer to) {
        if (to == null)
            return slice(from);
        return slice(from, to.intValue());
    }

    @Override public final CollectionHolder<T> slice(final @Nullable Integer from, final int to) {
        if (from == null)
            return slice(0, to);
        return slice(from.intValue(), to);
    }

    @Override public final CollectionHolder<T> slice(final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return slice();
            else
                return slice(0, to.intValue());
        if (to == null)
            return slice(from.intValue());
        return slice(from.intValue(), to.intValue());
    }

    //#endregion -------------------- Slice (from, to) --------------------

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    @Override public       CollectionHolder<T> take(int     n) { return Take.take(this, n); }
    @Override public final CollectionHolder<T> take(Integer n) { return take(n.intValue()); }

    @Override public final CollectionHolder<T> limit(int     n) { return take(n); }
    @Override public final CollectionHolder<T> limit(Integer n) { return take(n); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    @Override public CollectionHolder<T> takeWhile(ObjIntPredicate<? super T> predicate) { return TakeWhile.takeWhile(this, predicate); }
    @Override public CollectionHolder<T> takeWhile(Predicate<? super T>       predicate) { return TakeWhile.takeWhile(this, predicate); }
    @Override public CollectionHolder<T> takeWhile(BooleanSupplier            predicate) { return TakeWhile.takeWhile(this, predicate); }

    @Override public final CollectionHolder<T> limitWhile(ObjIntPredicate<? super T> predicate) { return takeWhile(predicate); }
    @Override public final CollectionHolder<T> limitWhile(Predicate<? super T>       predicate) { return takeWhile(predicate); }
    @Override public final CollectionHolder<T> limitWhile(BooleanSupplier            predicate) { return takeWhile(predicate); }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    @Override public CollectionHolder<T> takeWhileIndexed(IntObjPredicate<? super T> predicate) { return TakeWhileIndexed.takeWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(IntPredicate               predicate) { return TakeWhileIndexed.takeWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(BooleanSupplier            predicate) { return TakeWhileIndexed.takeWhileIndexed(this, predicate); }

    @Override public final CollectionHolder<T> limitWhileIndexed(IntObjPredicate<? super T> predicate) { return takeWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitWhileIndexed(IntPredicate               predicate) { return takeWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitWhileIndexed(BooleanSupplier            predicate) { return takeWhileIndexed(predicate); }

    //#endregion -------------------- Take while indexed --------------------
    //#region -------------------- Take last --------------------

    @Override public       CollectionHolder<T> takeLast(int     n) { return TakeLast.takeLast(this, n); }
    @Override public final CollectionHolder<T> takeLast(Integer n) { return takeLast(n.intValue()); }

    @Override public final CollectionHolder<T> limitLast(int     n) { return takeLast(n); }
    @Override public final CollectionHolder<T> limitLast(Integer n) { return takeLast(n); }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    @Override public CollectionHolder<T> takeLastWhile(ObjIntPredicate<? super T> predicate) { return TakeLastWhile.takeLastWhile(this, predicate); }
    @Override public CollectionHolder<T> takeLastWhile(Predicate<? super T>       predicate) { return TakeLastWhile.takeLastWhile(this, predicate); }
    @Override public CollectionHolder<T> takeLastWhile(BooleanSupplier            predicate) { return TakeLastWhile.takeLastWhile(this, predicate); }

    @Override public final CollectionHolder<T> limitLastWhile(ObjIntPredicate<? super T> predicate) { return takeLastWhile(predicate); }
    @Override public final CollectionHolder<T> limitLastWhile(Predicate<? super T>       predicate) { return takeLastWhile(predicate); }
    @Override public final CollectionHolder<T> limitLastWhile(BooleanSupplier            predicate) { return takeLastWhile(predicate); }

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    @Override public CollectionHolder<T> takeLastWhileIndexed(IntObjPredicate<? super T> predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(IntPredicate               predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(BooleanSupplier            predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(this, predicate); }

    @Override public final CollectionHolder<T> limitLastWhileIndexed(IntObjPredicate<? super T> predicate) { return takeLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitLastWhileIndexed(IntPredicate               predicate) { return takeLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitLastWhileIndexed(BooleanSupplier            predicate) { return takeLastWhileIndexed(predicate); }

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    @Override public       CollectionHolder<T> drop(int     n) { return Drop.drop(this, n); }
    @Override public final CollectionHolder<T> drop(Integer n) { return drop(n.intValue()); }

    @Override public final CollectionHolder<T> skip(int     n) { return drop(n); }
    @Override public final CollectionHolder<T> skip(Integer n) { return drop(n); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    @Override public CollectionHolder<T> dropWhile(ObjIntPredicate<? super T> predicate) { return DropWhile.dropWhile(this, predicate); }
    @Override public CollectionHolder<T> dropWhile(Predicate<? super T>       predicate) { return DropWhile.dropWhile(this, predicate); }
    @Override public CollectionHolder<T> dropWhile(BooleanSupplier            predicate) { return DropWhile.dropWhile(this, predicate); }

    @Override public final CollectionHolder<T> skipWhile(ObjIntPredicate<? super T> predicate) { return dropWhile(predicate); }
    @Override public final CollectionHolder<T> skipWhile(Predicate<? super T>       predicate) { return dropWhile(predicate); }
    @Override public final CollectionHolder<T> skipWhile(BooleanSupplier            predicate) { return dropWhile(predicate); }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    @Override public CollectionHolder<T> dropWhileIndexed(IntObjPredicate<? super T> predicate) { return DropWhileIndexed.dropWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(IntPredicate               predicate) { return DropWhileIndexed.dropWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(BooleanSupplier            predicate) { return DropWhileIndexed.dropWhileIndexed(this, predicate); }

    @Override public final CollectionHolder<T> skipWhileIndexed(IntObjPredicate<? super T> predicate) { return dropWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipWhileIndexed(IntPredicate               predicate) { return dropWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipWhileIndexed(BooleanSupplier            predicate) { return dropWhileIndexed(predicate); }

    //#endregion -------------------- Drop while indexed --------------------
    //#region -------------------- Drop last --------------------

    @Override public       CollectionHolder<T> dropLast(int     n) { return DropLast.dropLast(this, n); }
    @Override public final CollectionHolder<T> dropLast(Integer n) { return dropLast(n.intValue()); }

    @Override public final CollectionHolder<T> skipLast(int     n) { return dropLast(n); }
    @Override public final CollectionHolder<T> skipLast(Integer n) { return dropLast(n); }

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop while --------------------

    @Override public CollectionHolder<T> dropLastWhile(ObjIntPredicate<? super T> predicate) { return DropLastWhile.dropLastWhile(this, predicate); }
    @Override public CollectionHolder<T> dropLastWhile(Predicate<? super T>       predicate) { return DropLastWhile.dropLastWhile(this, predicate); }
    @Override public CollectionHolder<T> dropLastWhile(BooleanSupplier            predicate) { return DropLastWhile.dropLastWhile(this, predicate); }

    @Override public final CollectionHolder<T> skipLastWhile(ObjIntPredicate<? super T> predicate) { return dropLastWhile(predicate); }
    @Override public final CollectionHolder<T> skipLastWhile(Predicate<? super T>       predicate) { return dropLastWhile(predicate); }
    @Override public final CollectionHolder<T> skipLastWhile(BooleanSupplier            predicate) { return dropLastWhile(predicate); }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    @Override public CollectionHolder<T> dropLastWhileIndexed(IntObjPredicate<? super T> predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(IntPredicate               predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(this, predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(BooleanSupplier            predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(this, predicate); }

    @Override public final CollectionHolder<T> skipLastWhileIndexed(IntObjPredicate<? super T> predicate) { return dropLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipLastWhileIndexed(IntPredicate               predicate) { return dropLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipLastWhileIndexed(BooleanSupplier            predicate) { return dropLastWhileIndexed(predicate); }

    //#endregion -------------------- Drop while indexed --------------------

    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> action) { return joookiwi.collection.java.method.Map.map(this, action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       action) { return joookiwi.collection.java.method.Map.map(this, action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  action) { return joookiwi.collection.java.method.Map.map(this, action); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> action) { return MapIndexed.mapIndexed(this, action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               action) { return MapIndexed.mapIndexed(this, action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  action) { return MapIndexed.mapIndexed(this, action); }

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends U> transform) { return MapNotNull.mapNotNull(this, transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends U>       transform) { return MapNotNull.mapNotNull(this, transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends U>                  transform) { return MapNotNull.mapNotNull(this, transform); }

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends U> transform) { return MapNotNullIndexed.mapNotNullIndexed(this, transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends U>               transform) { return MapNotNullIndexed.mapNotNullIndexed(this, transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends U>                  transform) { return MapNotNullIndexed.mapNotNullIndexed(this, transform); }

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { ForEach.forEach(this, action); }
    @Override public void forEach(final Consumer<? super T>       action) { ForEach.forEach(this, action); }
    @Override public void forEach(final Runnable                  action) { ForEach.forEach(this, action); }

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { ForEachIndexed.forEachIndexed(this, action); }
    @Override public void forEachIndexed(final IntConsumer               action) { ForEachIndexed.forEachIndexed(this, action); }
    @Override public void forEachIndexed(final Runnable                  action) { ForEachIndexed.forEachIndexed(this, action); }

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEach(final ObjIntConsumer<? super T> action) { return OnEach.onEach(this, action); }
    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEach(final Consumer<? super T>       action) { return OnEach.onEach(this, action); }
    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEach(final Runnable                  action) { return OnEach.onEach(this, action); }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEachIndexed(final IntObjConsumer<? super T> action) { return OnEachIndexed.onEachIndexed(this, action); }
    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEachIndexed(final IntConsumer               action) { return OnEachIndexed.onEachIndexed(this, action); }
    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEachIndexed(final Runnable                  action) { return OnEachIndexed.onEachIndexed(this, action); }

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    @Override public CollectionHolder<T> toReverse(                                          ) { return ToReverse.toReverse(this); }
    @Override public CollectionHolder<T> toReverse(final int               from              ) { return ToReverse.toReverse(this, from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int to) { return ToReverse.toReverse(this, from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int to) { return ToReverse.toReverse(this, from, to); }

    @Override public final CollectionHolder<T> toReverse(final @Nullable Integer from) {
        if (from == null)
            return toReverse();
        return toReverse(from.intValue());
    }

    @Override public final CollectionHolder<T> toReverse(final int from, final @Nullable Integer to) {
        if (to == null)
            return toReverse(from);
        return toReverse(from, to.intValue());
    }

    @Override public final CollectionHolder<T> toReverse(final @Nullable Integer from, final @Nullable Integer to) {
        if (from == null)
            if (to == null)
                return toReverse();
            else
                return toReverse(NULL_INT, to.intValue());
        if (to == null)
            return toReverse(from.intValue());
        return toReverse(from.intValue(), to.intValue());
    }


    @Override public final CollectionHolder<T> toReversed(                                                        ) { return toReverse(); }

    @Override public final CollectionHolder<T> toReversed(final int               from                            ) { return toReverse(from); }
    @Override public final CollectionHolder<T> toReversed(final @Nullable Integer from                            ) { return toReverse(from); }

    @Override public final CollectionHolder<T> toReversed(final int               from, final int               to) { return toReverse(from, to); }
    @Override public final CollectionHolder<T> toReversed(final int               from, final @Nullable Integer to) { return toReverse(from, to); }
    @Override public final CollectionHolder<T> toReversed(final @Nullable Integer from, final int               to) { return toReverse(from, to); }
    @Override public final CollectionHolder<T> toReversed(final @Nullable Integer from, final @Nullable Integer to) { return toReverse(from, to); }


    @Override public final CollectionHolder<T> reversed(                                                        ) { return toReverse(); }

    @Override public final CollectionHolder<T> reversed(final int               from                            ) { return toReverse(from); }
    @Override public final CollectionHolder<T> reversed(final @Nullable Integer from                            ) { return toReverse(from); }

    @Override public final CollectionHolder<T> reversed(final int               from, final int               to) { return toReverse(from, to); }
    @Override public final CollectionHolder<T> reversed(final int               from, final @Nullable Integer to) { return toReverse(from, to); }
    @Override public final CollectionHolder<T> reversed(final @Nullable Integer from, final int               to) { return toReverse(from, to); }
    @Override public final CollectionHolder<T> reversed(final @Nullable Integer from, final @Nullable Integer to) { return toReverse(from, to); }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------

    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    @Override public CollectionIterator<T> toIterator() { return ToIterator.toIterator(this); }
    @Override public Spliterator<T> toSpliterator() { return ToSpliterator.toSpliterator(this); } //return Spliterators.spliterator(iterator(), size(), Spliterator.SIZED & Spliterator.IMMUTABLE); }

    //#endregion -------------------- To iterator --------------------

    //#region -------------------- To array --------------------

    @Override public                              T[] toArray(                                                      ) { return ToArray.toArray(this); }
    @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return ToArray.toArray(this, transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return ToArray.toArray(this, transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return ToArray.toArray(this, transform); }

    @Override public final                              T[] toTypedArray(                                                      ) { return toArray(); }
    @Override public final <U extends @Nullable Object> U[] toTypedArray(final ObjIntFunction<? super T, ? extends U> transform) { return toArray(transform); }
    @Override public final <U extends @Nullable Object> U[] toTypedArray(final Function<? super T, ? extends U>       transform) { return toArray(transform); }
    @Override public final <U extends @Nullable Object> U[] toTypedArray(final Supplier<? extends U>                  transform) { return toArray(transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Override public                              ImmutableCollection<T> toCollection(                                                      ) { return ToCollection.toCollection(this); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToCollection.toCollection(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return ToCollection.toCollection(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return ToCollection.toCollection(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return ToMutableCollection.toMutableCollection(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCollection.toMutableCollection(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return ToMutableCollection.toMutableCollection(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return ToMutableCollection.toMutableCollection(this, transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Override public                              ImmutableSequencedCollection<T> toSequencedCollection(                                                      ) { return ToSequencedCollection.toSequencedCollection(this); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedCollection.toSequencedCollection(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToSequencedCollection.toSequencedCollection(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return ToSequencedCollection.toSequencedCollection(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return ToMutableSequencedCollection.toMutableSequencedCollection(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(this, transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Override public                              ImmutableList<T> toList(                                                      ) { return ToList.toList(this); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return ToList.toList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return ToList.toList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return ToList.toList(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableList<T> toMutableList(                                                      ) { return ToMutableList.toMutableList(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableList.toMutableList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return ToMutableList.toMutableList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return ToMutableList.toMutableList(this, transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Override public                              ImmutableArrayList<T> toArrayList(                                                      ) { return ToArrayList.toArrayList(this); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayList.toArrayList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return ToArrayList.toArrayList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return ToArrayList.toArrayList(this, transform); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                 ) { return ToMutableArrayList.toMutableArrayList(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(final int initialCapacity                                                        ) { return ToMutableArrayList.toMutableArrayList(this, initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(this, initialCapacity, transform); }

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

    @Override public                              ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList(                                                      ) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(this); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(this, transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Override public                              ImmutableLinkedList<T> toLinkedList(                                                      ) { return ToLinkedList.toLinkedList(this); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedList.toLinkedList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return ToLinkedList.toLinkedList(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return ToLinkedList.toLinkedList(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return ToMutableLinkedList.toMutableLinkedList(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedList.toMutableLinkedList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedList.toMutableLinkedList(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return ToMutableLinkedList.toMutableLinkedList(this, transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Override public                              ImmutableVector<T> toVector(                                                      ) { return ToVector.toVector(this); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return ToVector.toVector(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return ToVector.toVector(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return ToVector.toVector(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableVector<T> toMutableVector(                                                                                 ) { return ToMutableVector.toMutableVector(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableVector<T> toMutableVector(final int initialCapacity                                                        ) { return ToMutableVector.toMutableVector(this, initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(this, initialCapacity, transform); }

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

    @Override public                              ImmutableSet<T> toSet(                                                      ) { return ToSet.toSet(this); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSet.toSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return ToSet.toSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return ToSet.toSet(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return ToMutableSet.toMutableSet(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSet.toMutableSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return ToMutableSet.toMutableSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return ToMutableSet.toMutableSet(this, transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Override public                              ImmutableSequencedSet<T> toSequencedSet(                                                      ) { return ToSequencedSet.toSequencedSet(this); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedSet.toSequencedSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return ToSequencedSet.toSequencedSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return ToSequencedSet.toSequencedSet(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return ToMutableSequencedSet.toMutableSequencedSet(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedSet.toMutableSequencedSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return ToMutableSequencedSet.toMutableSequencedSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedSet.toMutableSequencedSet(this, transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Override public                              ImmutableSortedSet<T> toSortedSet(                                                      ) { return ToSortedSet.toSortedSet(this); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSortedSet.toSortedSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return ToSortedSet.toSortedSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return ToSortedSet.toSortedSet(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return ToMutableSortedSet.toMutableSortedSet(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSortedSet.toMutableSortedSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return ToMutableSortedSet.toMutableSortedSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSortedSet.toMutableSortedSet(this, transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Override public                              ImmutableNavigableSet<T> toNavigableSet(                                                      ) { return ToNavigableSet.toNavigableSet(this); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToNavigableSet.toNavigableSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return ToNavigableSet.toNavigableSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return ToNavigableSet.toNavigableSet(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { throw new RuntimeException("TODO: Implements the toMutableNavigableSet method"); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { throw new RuntimeException("TODO: Implements the toMutableNavigableSet method"); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { throw new RuntimeException("TODO: Implements the toMutableNavigableSet method"); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { throw new RuntimeException("TODO: Implements the toMutableNavigableSet method"); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

                                                 @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(this, transform); }
                                                 @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(this, transform); }
                                                 @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(this, comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(this, comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(this, transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(this, transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(this, transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(this, transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(this, clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(this, clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(this, clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(                                                                              ) { return ToHashSet.toHashSet(this); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(this,             transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(this,             transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(this,             transform); }
    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(final float loadFactor                                                        ) { return ToHashSet.toHashSet(this, loadFactor); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(this, loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(this, loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(this, loadFactor, transform); }

    @Contract(pure = true) @Override public final ImmutableHashSet<T> toHashSet(final @Nullable Float loadFactor) {
        if (loadFactor == null)
            return toHashSet();
        return toHashSet(loadFactor.floatValue());
    }

    @Contract(pure = true) @Override public final <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) {
        if (loadFactor == null)
            return toHashSet(transform);
        return toHashSet(loadFactor.floatValue(), transform);
    }

    @Contract(pure = true) @Override public final <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Function<? super T, ? extends U> transform) {
        if (loadFactor == null)
            return toHashSet(transform);
        return toHashSet(loadFactor.floatValue(), transform);
    }

    @Contract(pure = true) @Override public final <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Supplier<? extends U> transform) {
        if (loadFactor == null)
            return toHashSet(transform);
        return toHashSet(loadFactor.floatValue(), transform);
    }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(                                                                                                                       ) { return ToMutableHashSet.toMutableHashSet(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                 final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                 final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity                                                                                ) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                         final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                         final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final float loadFactor                                                        ) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor                                                        ) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float loadFactor, final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float loadFactor, final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor, final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float loadFactor, final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor, transform); }


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
        return ToMutableHashSet.toMutableHashSet(this, initialCapacity, loadFactor);
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
                return toMutableHashSet(NULL_INT, loadFactor.floatValue(), transform);
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
                return toMutableHashSet(NULL_INT, loadFactor.floatValue(), transform);
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
                return toMutableHashSet(NULL_INT, loadFactor.floatValue(), transform);
        if (loadFactor == null)
            return toMutableHashSet(initialCapacity.intValue(), transform);
        return toMutableHashSet(initialCapacity.intValue(), loadFactor.floatValue(), transform);
    }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Override public                              ImmutableLinkedHashSet<T> toLinkedHashSet(                                                      ) { return ToLinkedHashSet.toLinkedHashSet(this); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedHashSet.toLinkedHashSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToLinkedHashSet.toLinkedHashSet(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return ToLinkedHashSet.toLinkedHashSet(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(this, transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(this, transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(this, transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return ToTreeSet.toTreeSet(this, comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(this, comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return ToMutableTreeSet.toMutableTreeSet(this, comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(this, comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Override public                              ImmutableQueue<T> toQueue(                                                      ) { return ToQueue.toQueue(this); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToQueue.toQueue(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return ToQueue.toQueue(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return ToQueue.toQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return ToMutableQueue.toMutableQueue(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableQueue.toMutableQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return ToMutableQueue.toMutableQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return ToMutableQueue.toMutableQueue(this, transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingQueue.toBlockingQueue(this, transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToBlockingQueue.toBlockingQueue(this, transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return ToBlockingQueue.toBlockingQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(this, transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToTransferQueue.toTransferQueue(this, transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return ToTransferQueue.toTransferQueue(this, transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return ToTransferQueue.toTransferQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTransferQueue.toMutableTransferQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableTransferQueue.toMutableTransferQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableTransferQueue.toMutableTransferQueue(this, transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(this, transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(this, transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, capacity, transform); }

    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, capacity, isFair, transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(this, isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(this, transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(this, transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(this, transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToDelayQueue.toDelayQueue(this, transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return ToDelayQueue.toDelayQueue(this, transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return ToDelayQueue.toDelayQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDelayQueue.toMutableDelayQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return ToMutableDelayQueue.toMutableDelayQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return ToMutableDelayQueue.toMutableDelayQueue(this, transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(this, transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(this, transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(this, capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(this, capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(this, capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(this, transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(this, transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(this, transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(this, transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(this, transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(this, transform); }
    @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(this, comparator, transform); }
    @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(this, comparator, transform); }
    @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(this, comparator, transform); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(this, initialCapacity, comparator, transform); }

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

    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(this, transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(this, transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(this, transform); }
    @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(this, comparator, transform); }
    @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(this, comparator, transform); }
    @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(this, comparator, transform); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(this, initialCapacity, comparator, transform); }

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

    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToSynchronousQueue.toSynchronousQueue(this, transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return ToSynchronousQueue.toSynchronousQueue(this, transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return ToSynchronousQueue.toSynchronousQueue(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(this, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(this, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(this, isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Override public                              ImmutableDeque<T> toDeque(                                                      ) { return ToDeque.toDeque(this); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToDeque.toDeque(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return ToDeque.toDeque(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return ToDeque.toDeque(this, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return ToMutableDeque.toMutableDeque(this); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDeque.toMutableDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return ToMutableDeque.toMutableDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return ToMutableDeque.toMutableDeque(this, transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingDeque.toBlockingDeque(this, transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToBlockingDeque.toBlockingDeque(this, transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return ToBlockingDeque.toBlockingDeque(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(this, transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayDeque.toArrayDeque(this, transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return ToArrayDeque.toArrayDeque(this, transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return ToArrayDeque.toArrayDeque(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayDeque.toMutableArrayDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final Function<? super T, ? extends U>       transform) { return ToMutableArrayDeque.toMutableArrayDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final Supplier<? extends U>                  transform) { return ToMutableArrayDeque.toMutableArrayDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayDeque.toMutableArrayDeque(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayDeque.toMutableArrayDeque(this, initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayDeque.toMutableArrayDeque(this, initialCapacity, transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(this, transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(this, transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(this, transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(this, transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(this, transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(this, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(this, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(this, capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(this, capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(this, capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Override public                              ImmutableStack<T> toStack(                                                      ) { return ToStack.toStack(this); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToStack.toStack(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return ToStack.toStack(this, transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return ToStack.toStack(this, transform); }

    @Override public                              MutableStack<T> toMutableStack(                                                      ) { return ToMutableStack.toMutableStack(this); }
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableStack.toMutableStack(this, transform); }
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return ToMutableStack.toMutableStack(this, transform); }
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return ToMutableStack.toMutableStack(this, transform); }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    @Override public @Unmodifiable Map<Integer, T> toMap() { return ToMap.toMap(this); }

    @Override public Map<Integer, T> toMutableMap() { throw new RuntimeException("TODO: Implements the toMutableMap method"); }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To sequenced map --------------------

    @Override public @Unmodifiable SequencedMap<Integer, T> toSequencedMap() { throw new RuntimeException("TODO: Implements the toSequencedMap method"); }

    @Override public SequencedMap<Integer, T> toMutableSequencedMap() { throw new RuntimeException("TODO: Implements the toMutableSequencedMap method"); }

    //#endregion -------------------- To sequenced map --------------------
    //#region -------------------- To sorted map --------------------

    @Override public @Unmodifiable SortedMap<Integer, T> toSortedMap() { throw new RuntimeException("TODO: Implements the toSortedMap method"); }

    @Override public SortedMap<Integer, T> toMutableSortedMap() { throw new RuntimeException("TODO: Implements the toMutableSortedMap method"); }

    //#endregion -------------------- To sorted map --------------------
    //#region -------------------- To navigable map --------------------

    @Override public @Unmodifiable NavigableMap<Integer, T> toNavigableMap() { throw new RuntimeException("TODO: Implements the toNavigableMap method"); }

    @Override public NavigableMap<Integer, T> toMutableNavigableMap() { throw new RuntimeException("TODO: Implements the toMutableNavigableMap method"); }

    //#endregion -------------------- To navigable map --------------------
    //#region -------------------- To concurrent map --------------------

    @Override public @Unmodifiable ConcurrentMap<Integer, T> toConcurrentMap() { throw new RuntimeException("TODO: Implements the toConcurrentMap method"); }

    @Override public ConcurrentMap<Integer, T> toMutableConcurrentMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentMap method"); }

    //#endregion -------------------- To concurrent map --------------------
    //#region -------------------- To concurrent navigable map --------------------

    @Override public @Unmodifiable ConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements the toConcurrentNavigableMap method"); }

    @Override public ConcurrentNavigableMap<Integer, T> toMutableConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentNavigableMap method"); }

    //#endregion -------------------- To concurrent navigable map --------------------
    //#region -------------------- To concurrent hash map --------------------

    @Override public @Unmodifiable ConcurrentHashMap<Integer, T> toConcurrentHashMap() { throw new RuntimeException("TODO: Implements the toConcurrentHashMap method"); }

    @Override public ConcurrentHashMap<Integer, T> toMutableConcurrentHashMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentHashMap method"); }

    //#endregion -------------------- To concurrent hash map --------------------
    //#region -------------------- To concurrent skip list map --------------------

    @Override public @Unmodifiable ConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements the toConcurrentSkipListMap method"); }

    @Override public ConcurrentSkipListMap<Integer, T> toMutableConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentSkipListMap method"); }

    //#endregion -------------------- To concurrent skip list map --------------------
    //#region -------------------- To enum map --------------------

    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                       transform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, Entry<K, V>>                                                             transform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<Entry<K, V>>                                                                        transform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toEnumMap method"); }

    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                       transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K>           keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, Entry<K, V>>                                                             transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>                 keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>                 keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>                 keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<Entry<K, V>>                                                                        transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                            keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                            keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                            keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }

    //#endregion -------------------- To enum map --------------------
    //#region -------------------- To hash map --------------------

    @Override public @Unmodifiable HashMap<Integer, T> toHashMap() { throw new RuntimeException("TODO: Implements the toHashMap method"); }

    @Override public HashMap<Integer, T> toMutableHashMap() { throw new RuntimeException("TODO: Implements the toMutableHashMap method"); }

    //#endregion -------------------- To hash map --------------------
    //#region -------------------- To hashtable --------------------

    @Override public @Unmodifiable Hashtable<Integer, T> toHashtable() { throw new RuntimeException("TODO: Implements the toHashtable method"); }

    @Override public Hashtable<Integer, T> toMutableHashtable() { throw new RuntimeException("TODO: Implements the toMutableHashtable method"); }

    //#endregion -------------------- To hashtable --------------------
    //#region -------------------- To identity hash map --------------------

    @Override public @Unmodifiable IdentityHashMap<Integer, T> toIdentityHashMap() { throw new RuntimeException("TODO: Implements the toIdentityHashMap method"); }

    @Override public IdentityHashMap<Integer, T> toMutableIdentityHashMap() { throw new RuntimeException("TODO: Implements the toMutableIdentityHashMap method"); }

    //#endregion -------------------- To identity hash map --------------------
    //#region -------------------- To linked hash map --------------------

    @Override public @Unmodifiable LinkedHashMap<Integer, T> toLinkedHashMap() { throw new RuntimeException("TODO: Implements the toLinkedHashMap method"); }

    @Override public LinkedHashMap<Integer, T> toMutableLinkedHashMap() { throw new RuntimeException("TODO: Implements the toMutableLinkedHashMap method"); }

    //#endregion -------------------- To linked hash map --------------------
    //#region -------------------- To tree map --------------------

    @Override public @Unmodifiable TreeMap<Integer, T> toTreeMap() { throw new RuntimeException("TODO: Implements the toTreeMap method"); }

    @Override public TreeMap<Integer, T> toMutableTreeMap() { throw new RuntimeException("TODO: Implements the toMutableTreeMap method"); }

    //#endregion -------------------- To tree map --------------------
    //#region -------------------- To weak hash map --------------------

    @Override public @Unmodifiable WeakHashMap<Integer, T> toWeakHashMap() { throw new RuntimeException("TODO: Implements the toWeakHashMap method"); }

    @Override public WeakHashMap<Integer, T> toMutableWeakHashMap() { throw new RuntimeException("TODO: Implements the toMutableWeakHashMap method"); }

    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return ToString.toString(this); }

    @Override public String toLocaleString(                             ) { return ToLocaleString.toLocaleString(this); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return ToLocaleString.toLocaleString(this, locale); }

    @Override public String toLowerCaseString() { return ToLowerCaseString.toLowerCaseString(this); }

    @Override public String toLocaleLowerCaseString(                             ) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(this); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(this, locale); }

    @Override public String toUpperCaseString() { return ToUpperCaseString.toUpperCaseString(this); }

    @Override public String toLocaleUpperCaseString(                             ) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(this); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(this, locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    //#region -------------------- Join to string ∅ --------------------

    @Override public final String joinToString() { return joinToString((String) null, (String) null, (String) null); }

    //#endregion -------------------- Join to string ∅ --------------------
    //#region -------------------- Join to string (separator) --------------------

    @Override public final String joinToString(final @Nullable String    separator) { return joinToString(separator                                      , (String) null, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator) { return joinToString(separator == null ? null : separator.toString(), (String) null, (String) null); }
    @Override public final String joinToString(final char                separator) { return joinToString(valueOf(separator)                             , (String) null, (String) null); }

    //#endregion -------------------- Join to string (separator) --------------------
    //#region -------------------- Join to string (separator, prefix) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix) { return joinToString(separator                                      , prefix                                   , (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix) { return joinToString(separator                                      , valueOf(prefix)                          , (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix) { return joinToString(valueOf(separator)                             , prefix                                   , (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), (String) null); }
    @Override public final String joinToString(final char                separator, final char                prefix) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , (String) null); }

    //#endregion -------------------- Join to string (separator, prefix) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix) --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix) { return JoinToString.joinToString(this, separator, prefix, postfix); }

    //#region -------------------- Final join to string (separator, prefix, postfix) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString()); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           ); }

    //#endregion -------------------- Final join to string (separator, prefix, postfix) --------------------

    //#endregion -------------------- Join to string (separator, prefix, postfix) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int limit) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int limit) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int limit) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int limit) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int limit) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int limit) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int limit) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int limit) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, (String) null); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int limit) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, (String) null); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int limit) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, (String) null); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int limit) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, (String) null); }

    //#region -------------------- Final join to string (separator String, prefix, postfix) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix, postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), (String) null);
    }


    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), (String) null);
    }


    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), (String) null);
    }

    //#endregion -------------------- Final join to string (separator String, prefix, postfix) --------------------
    //#region -------------------- Final join to string (separator Character, prefix, postfix) --------------------

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), (String) null);
    }


    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), (String) null);
    }


    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), (String) null);
    }

    //#endregion -------------------- Final join to string (separator Character, prefix, postfix) --------------------
    //#region -------------------- Final join to string (separator char, prefix, postfix) --------------------

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), (String) null);
    }


    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), (String) null);
    }


    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), (String) null);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), (String) null);
    }

    //#endregion -------------------- Final join to string (separator char, prefix, postfix) --------------------

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated) --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated); }

    //#region -------------------- Final 1-liner join to string (separator, prefix, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int limit, final @Nullable String    truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      ); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int limit, final @Nullable Character truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString()); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int limit, final char                truncated) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             ); }

    //#endregion -------------------- Final 1-liner join to string (separator, prefix, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator String, prefix String, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, prefix, postfix);
        return joinToString(separator, prefix, postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator String, prefix String, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator String, prefix Character, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator, prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator String, prefix Character, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator String, prefix char, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator, valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable String separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator, valueOf(prefix), postfix);
        return joinToString(separator, valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator String, prefix char, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator Character, prefix String, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }


    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix, postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix, postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator Character, prefix String, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator Character, prefix Character, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator Character, prefix Character, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator Character, prefix char, postfix, truncated) --------------------

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final @Nullable Character separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix);
        return joinToString(separator == null ? null : separator.toString(), valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator Character, prefix char, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator char, prefix String, postfix, truncated) --------------------

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix, postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final @Nullable String prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix, postfix);
        return joinToString(valueOf(separator), prefix, postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator char, prefix String, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator char, prefix Character, postfix, truncated) --------------------

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final @Nullable Character prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix);
        return joinToString(valueOf(separator), prefix == null ? null : prefix.toString(), postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator char, prefix Character, postfix, truncated) --------------------
    //#region -------------------- Final join to string (separator char, prefix char, postfix, truncated) --------------------

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable String postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), truncated);
    }


    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final char prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString());
        return joinToString(valueOf(separator), valueOf(prefix), postfix == null ? null : postfix.toString(), limit.intValue(), truncated);
    }


    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable String truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final @Nullable Character truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), truncated == null ? null : truncated.toString());
    }

    @Override public final String joinToString(final char separator, final char prefix, final char postfix, final @Nullable Integer limit, final char truncated) {
        if (limit == null)
            return joinToString(valueOf(separator), valueOf(prefix), postfix);
        return joinToString(valueOf(separator), valueOf(prefix), postfix, limit.intValue(), truncated);
    }

    //#endregion -------------------- Final join to string (separator char, prefix char, postfix, truncated) --------------------

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T, int) → string) --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated, transform); }

    //#region -------------------- Final join to string (separator, prefix, postfix, truncated, transform (T, int) → string) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }

    //#endregion -------------------- Final join to string (separator, prefix, postfix, truncated, transform (T, int) → string) --------------------

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T, int) → string) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T) → string) --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated, transform); }

    //#region -------------------- Final join to string (separator, prefix, postfix, truncated, transform (T) → string) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }

    //#endregion -------------------- Final join to string (separator, prefix, postfix, truncated, transform (T) → string) --------------------

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform (T) → string) --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform () → string) --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(this, separator, prefix, postfix, limit, truncated, transform); }

    //#region -------------------- Final join to string (separator, prefix, postfix, truncated, transform () → string) --------------------

    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator                                      , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(separator == null ? null : separator.toString(), valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix                                   , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , prefix == null ? null : prefix.toString(), valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix                                    , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , postfix == null ? null : postfix.toString(), limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated                                      , transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, truncated == null ? null : truncated.toString(), transform); }
    @Override public final String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return joinToString(valueOf(separator)                             , valueOf(prefix)                          , valueOf(postfix)                           , limit, valueOf(truncated)                             , transform); }

    //#endregion -------------------- Final join to string (separator, prefix, postfix, truncated, transform () → string) --------------------

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncate, transform () → string) --------------------

    //#region -------------------- Join ∅ (alias) methods --------------------

    public final String join() { return joinToString(); }

    //#endregion -------------------- Join ∅ (alias) methods --------------------
    //#region -------------------- Join (alias - separator) methods --------------------

    public final String join(final @Nullable String    separator) { return joinToString(separator); }
    public final String join(final @Nullable Character separator) { return joinToString(separator); }
    public final String join(final char                separator) { return joinToString(separator); }

    //#endregion -------------------- Join (alias - separator) methods --------------------
    //#region -------------------- Join (alias - separator, prefix) methods --------------------

    public final String join(final @Nullable String    separator, final @Nullable String    prefix) { return joinToString(separator, prefix); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix) { return joinToString(separator, prefix); }
    public final String join(final @Nullable String    separator, final char                prefix) { return joinToString(separator, prefix); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix) { return joinToString(separator, prefix); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix) { return joinToString(separator, prefix); }
    public final String join(final @Nullable Character separator, final char                prefix) { return joinToString(separator, prefix); }
    public final String join(final char                separator, final @Nullable String    prefix) { return joinToString(separator, prefix); }
    public final String join(final char                separator, final @Nullable Character prefix) { return joinToString(separator, prefix); }
    public final String join(final char                separator, final char                prefix) { return joinToString(separator, prefix); }

    //#endregion -------------------- Join (alias - separator, prefix) methods --------------------
    //#region -------------------- Join (alias - separator, prefix, postfix) methods --------------------

    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable String    separator, final char                prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final @Nullable Character separator, final char                prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final @Nullable String    prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final @Nullable Character prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final char                prefix, final @Nullable String    postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final char                prefix, final @Nullable Character postfix) { return joinToString(separator, prefix, postfix); }
    public final String join(final char                separator, final char                prefix, final char                postfix) { return joinToString(separator, prefix, postfix); }

    //#endregion -------------------- Join (alias - separator, prefix, postfix) methods --------------------
    //#region -------------------- Join (alias - separator, prefix, postfix, limit) methods --------------------

    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final char                prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final char                prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable String    prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable Character prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final char                prefix, final @Nullable String    postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final char                prefix, final @Nullable Character postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final char                prefix, final char                postfix, int               limit) { return joinToString(separator, prefix, postfix, limit); }
    public final String join(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return joinToString(separator, prefix, postfix, limit); }

    //#endregion -------------------- Join (alias - separator, prefix, postfix, limit) methods --------------------
    //#region -------------------- Join (alias - separator, prefix, postfix, limit, truncated) --------------------

    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated) { return joinToString(separator, prefix, postfix, limit, truncated); }

    //#endregion -------------------- Join (alias - separator, prefix, postfix, limit, truncated) --------------------
    //#region -------------------- Join (alias - separator, prefix, postfix, limit, truncated, transform (T, int) → string) --------------------

    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable ObjIntFunction<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join (alias - separator, prefix, postfix, limit, truncated, transform (T, int) → string) --------------------
    //#region -------------------- Join (alias - separator, prefix, postfix, limit, truncated, transform (T) → string) --------------------

    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Function<? super T, String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join (alias - separator, prefix, postfix, limit, truncated, transform (T) → string) --------------------
    //#region -------------------- Join (alias - separator, prefix, postfix, limit, truncated, transform () → string) --------------------

    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable String       separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final @Nullable Character    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final int               limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String       truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character    truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public final String join(final char                   separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                   truncated, @Nullable Supplier<String> transform) { return joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join (alias - separator, prefix, postfix, limit, truncated, transform () → string) --------------------

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Java methods --------------------

    @Override public final CollectionIterator<T> iterator() { return toIterator(); }

    @Override public final Spliterator<T> spliterator() { return toSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Comparison methods --------------------

    //#region -------------------- Equals --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (this == other)
            return true;

        if (!(other instanceof MinimalistCollectionHolder<?> otherConverted))
            return false;

        if (isEmpty()) {
            if (other instanceof CollectionHolder<?> otherConverted2)
                if (otherConverted2.isEmpty())
                    return true;
            return otherConverted.size() == 0;
        }

        final var size = size();
        if (size != otherConverted.size())
            return false;

        var index = -1;
        while (++index < size) {
            if (Objects.deepEquals(get(index), otherConverted.get(index)))
                continue;
            return false;
        }
        return true;
    }

    //#endregion -------------------- Equals --------------------
    //#region -------------------- Reference equals --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean referenceEquals(final @Nullable Object other) { return this == other; }

    //#endregion -------------------- Reference equals --------------------

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractCollectionHolder<T> clone() {
        try {
            return (AbstractCollectionHolder<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new InternalError("The “clone” method was not expected to be thrown in “" + getClass().getSimpleName() + "”.", exception);
        }
    }

    @MustBeInvokedByOverriders
    @Override public abstract AbstractCollectionHolder<T> shallowClone();

    @MustBeInvokedByOverriders
    @Override public abstract AbstractCollectionHolder<T> deepClone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
