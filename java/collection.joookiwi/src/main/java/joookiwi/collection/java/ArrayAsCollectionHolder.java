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
import java.util.Map;
import java.util.NavigableSet;
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
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionException;
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
import joookiwi.collection.java.helper.HashCodeCreator;
import joookiwi.collection.java.callback.IntObjFunction;
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
import joookiwi.collection.java.method.GetFirstOrNull;
import joookiwi.collection.java.method.GetLast;
import joookiwi.collection.java.method.GetLastOrNull;
import joookiwi.collection.java.method.GetOrElse;
import joookiwi.collection.java.method.GetOrNull;
import joookiwi.collection.java.method.Has;
import joookiwi.collection.java.method.HasDuplicate;
import joookiwi.collection.java.method.HasNoDuplicates;
import joookiwi.collection.java.method.HasNoNulls;
import joookiwi.collection.java.method.HasNot;
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
import joookiwi.collection.java.method.ToMutableNavigableSet;
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

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An `array` while providing all the features of a [CollectionHolder].
///
/// Note that nothing except the `array` is kept in the instance.
///
/// @param <T> The type
/// @see ArrayOf1AsCollectionHolder
/// @see ArrayOf2AsCollectionHolder
@NotNullByDefault
public class ArrayAsCollectionHolder<T extends @Nullable Object>
        extends AbstractCollectionHolder<T>
        implements RandomAccess {

    //#region -------------------- Fields --------------------

    private final T @Unmodifiable [] __reference;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ArrayAsCollectionHolder(final T @Unmodifiable [] reference) {
        __reference = reference;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The internal reference passed through the constructor
    protected T @Unmodifiable [] _reference() { return __reference; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return _reference().length; }

    @Override public boolean isEmpty() { return IsEmpty.isEmpty(_reference()); }

    @Override public boolean isNotEmpty() { return IsNotEmpty.isNotEmpty(_reference()); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(int index) {
        final var size = size();
        if (size == 0)
            throw new EmptyCollectionException(null, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        if (index == size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is the size of the collection (" + size + ").", index);
        if (index >= 0)
            return _reference()[index];

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” (" + indexToRetrieve + " after calculation) is under 0.", index);
        return _reference()[indexToRetrieve];
    }

    @Override public T getFirst() { return GetFirst.getFirst(_reference()); }

    @Override public T getLast() { return GetLast.getLast(_reference()); }


    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return GetOrElse.getOrElse(_reference(), index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return GetOrElse.getOrElse(_reference(), index, defaultValue); }


    @Override public @Nullable T getOrNull(final int index) { return GetOrNull.getOrNull(_reference(), index); }

    @Override public @Nullable T getFirstOrNull() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    @Override public @Nullable T getLastOrNull() { return GetLastOrNull.getLastOrNull(_reference()); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(_reference(), predicate); }
    @Override public T findFirst(final Predicate<? super T>       predicate) { return FindFirst.findFirst(_reference(), predicate); }
    @Override public T findFirst(final BooleanSupplier            predicate) { return FindFirst.findFirst(_reference(), predicate); }

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return FindFirstIndexed.findFirstIndexed(_reference(), predicate); }
    @Override public T findFirstIndexed(final IntPredicate               predicate) { return FindFirstIndexed.findFirstIndexed(_reference(), predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return FindFirstIndexed.findFirstIndexed(_reference(), predicate); }

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return FindFirstOrNull.findFirstOrNull(_reference(), predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return FindFirstOrNull.findFirstOrNull(_reference(), predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return FindFirstOrNull.findFirstOrNull(_reference(), predicate); }

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(_reference(), predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(_reference(), predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(_reference(), predicate); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return FindLast.findLast(_reference(), predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return FindLast.findLast(_reference(), predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return FindLast.findLast(_reference(), predicate); }

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return FindLastIndexed.findLastIndexed(_reference(), predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return FindLastIndexed.findLastIndexed(_reference(), predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return FindLastIndexed.findLastIndexed(_reference(), predicate); }

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return FindLastOrNull.findLastOrNull(_reference(), predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return FindLastOrNull.findLastOrNull(_reference(), predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return FindLastOrNull.findLastOrNull(_reference(), predicate); }

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(_reference(), predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(_reference(), predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(_reference(), predicate); }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element                                            ) { return FirstIndexOf.firstIndexOf(_reference(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from              ) { return FirstIndexOf.firstIndexOf(_reference(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from, final int to) { return FirstIndexOf.firstIndexOf(_reference(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final @Nullable Integer from, final int to) { return FirstIndexOf.firstIndexOf(_reference(), element, from, to); }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element                                            ) { return FirstIndexOfOrNull.firstIndexOfOrNull(_reference(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from              ) { return FirstIndexOfOrNull.firstIndexOfOrNull(_reference(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(_reference(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(_reference(), element, from, to); }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element                                            ) { return LastIndexOf.lastIndexOf(_reference(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from              ) { return LastIndexOf.lastIndexOf(_reference(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from, final int to) { return LastIndexOf.lastIndexOf(_reference(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final @Nullable Integer from, final int to) { return LastIndexOf.lastIndexOf(_reference(), element, from, to); }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element                                            ) { return LastIndexOfOrNull.lastIndexOfOrNull(_reference(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from              ) { return LastIndexOfOrNull.lastIndexOfOrNull(_reference(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int to) { return LastIndexOfOrNull.lastIndexOfOrNull(_reference(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return LastIndexOfOrNull.lastIndexOfOrNull(_reference(), element, from, to); }

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfFirst.indexOfFirst(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate                                            ) { return IndexOfFirst.indexOfFirst(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate                                            ) { return IndexOfFirst.indexOfFirst(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfLast.indexOfLast(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate                                            ) { return IndexOfLast.indexOfLast(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate                                            ) { return IndexOfLast.indexOfLast(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfLast.indexOfLast(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfLast.indexOfLast(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLast.indexOfLast(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_reference(), predicate, from, to); }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return All.all(_reference(), predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return All.all(_reference(), predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return All.all(_reference(), predicate); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return Any.any(_reference(), predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return Any.any(_reference(), predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return Any.any(_reference(), predicate); }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return None.none(_reference(), predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return None.none(_reference(), predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return None.none(_reference(), predicate); }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    @Override public boolean hasNull() { return HasNull.hasNull(_reference()); }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Override public boolean hasNoNulls() { return HasNoNulls.hasNoNulls(_reference()); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Override public boolean hasDuplicate() { return HasDuplicate.hasDuplicate(_reference()); }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Override public boolean hasNoDuplicates() { return HasNoDuplicates.hasNoDuplicates(_reference()); }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    @Override public boolean has(final T value) { return Has.has(_reference(), value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    @Override public boolean hasNot(final T value) { return HasNot.hasNot(_reference(), value); }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                            values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                        values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                         values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                         values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                            values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasOne.hasOne(_reference(), values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                               values) { return HasOne.hasOne(_reference(), values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                            values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                        values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                         values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                         values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                            values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasNotOne.hasNotOne(_reference(), values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                               values) { return HasNotOne.hasNotOne(_reference(), values); }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                                 values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                             values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                              values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                              values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                                 values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>               values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                         values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>                 values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>        values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                       values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                        values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>               values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>                  values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>               values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>                      values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>                      values) { return HasAll.hasAll(_reference(), values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                                    values) { return HasAll.hasAll(_reference(), values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                                 values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                             values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                              values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                              values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                                 values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>               values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                         values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>                 values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>        values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                       values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                        values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>               values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>                  values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>               values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>                      values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>                      values) { return HasNotAll.hasNotAll(_reference(), values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                                    values) { return HasNotAll.hasNotAll(_reference(), values); }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<@NotNull T> requireNoNulls() {
        RequireNoNulls.requireNoNulls(_reference());
        return this;
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
//    //#region -------------------- Accumulation methods --------------------
//
//    //#region -------------------- Reduce --------------------
//
//    @Override public <R extends @Nullable Object> R reduce(final ObjIntAccumulator<? super T, R> operation) { return Reduce.reduce(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduce(final ObjAccumulator<? super T, R>    operation) { return Reduce.reduce(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduce(final UnaryOperator<R>                operation) { return Reduce.reduce(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduce(final Supplier<? extends R>           operation) { return Reduce.reduce(_reference(), operation); }
//
//    //#endregion -------------------- Reduce --------------------
//    //#region -------------------- Reduce or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final ObjIntAccumulator<? super T, R> operation) { return ReduceOrNull.reduceOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final ObjAccumulator<? super T, R>    operation) { return ReduceOrNull.reduceOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final UnaryOperator<R>                operation) { return ReduceOrNull.reduceOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final Supplier<? extends R>           operation) { return ReduceOrNull.reduceOrNull(_reference(), operation); }
//
//    //#endregion -------------------- Reduce or null --------------------
//    //#region -------------------- Reduce indexed --------------------
//
//    @Override public <R extends @Nullable Object> R reduceIndexed(final IntObjAccumulator<? super T, R> operation) { return ReduceIndexed.reduceIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final IntAccumulator<R>               operation) { return ReduceIndexed.reduceIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final UnaryOperator<R>                operation) { return ReduceIndexed.reduceIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final Supplier<? extends R>           operation) { return ReduceIndexed.reduceIndexed(_reference(), operation); }
//
//    //#endregion -------------------- Reduce indexed --------------------
//    //#region -------------------- Reduce indexed or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final IntObjAccumulator<? super T, R> operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final IntAccumulator<R>               operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final UnaryOperator<R>                operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final Supplier<? extends R>           operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_reference(), operation); }
//
//    //#endregion -------------------- Reduce indexed or null --------------------
//
//    //#region -------------------- Reduce right --------------------
//
//    @Override public <R extends @Nullable Object> R reduceRight(final ObjIntAccumulator<? super T, R> operation) { return ReduceRight.reduceRight(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final ObjAccumulator<? super T, R>    operation) { return ReduceRight.reduceRight(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final UnaryOperator<R>                operation) { return ReduceRight.reduceRight(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final Supplier<? extends R>           operation) { return ReduceRight.reduceRight(_reference(), operation); }
//
//    //#endregion -------------------- Reduce right --------------------
//    //#region -------------------- Reduce right or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final ObjIntAccumulator<? super T, R> operation) { return ReduceRightOrNull.reduceRightOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final ObjAccumulator<? super T, R>    operation) { return ReduceRightOrNull.reduceRightOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final UnaryOperator<R>                operation) { return ReduceRightOrNull.reduceRightOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final Supplier<? extends R>           operation) { return ReduceRightOrNull.reduceRightOrNull(_reference(), operation); }
//
//    //#endregion -------------------- Reduce right or null --------------------
//    //#region -------------------- Reduce right indexed --------------------
//
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final IntObjAccumulator<? super T, R> operation) { return ReduceRightIndexed.reduceRightIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final IntAccumulator<R>               operation) { return ReduceRightIndexed.reduceRightIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final UnaryOperator<R>                operation) { return ReduceRightIndexed.reduceRightIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final Supplier<? extends R>           operation) { return ReduceRightIndexed.reduceRightIndexed(_reference(), operation); }
//
//    //#endregion -------------------- Reduce right indexed --------------------
//    //#region -------------------- Reduce right indexed or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final IntObjAccumulator<? super T, R> operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final IntAccumulator<R>               operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final UnaryOperator<R>                operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_reference(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final Supplier<? extends R>           operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_reference(), operation); }
//
//    //#endregion -------------------- Reduce right indexed or null --------------------
//
//    //#region -------------------- Fold --------------------
//
//    @Override public <R extends @Nullable Object> R fold(final R initial, final ObjIntAccumulator<? super T, R> operation) { return Fold.fold(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final ObjAccumulator<? super T, R>    operation) { return Fold.fold(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final UnaryOperator<R>                operation) { return Fold.fold(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final Supplier<? extends R>           operation) { return Fold.fold(_reference(), operation); }
//
//    //#endregion -------------------- Fold --------------------
//    //#region -------------------- Fold indexed --------------------
//
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final IntObjAccumulator<? super T, R> operation) { return FoldIndexed.foldIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final IntAccumulator<R>               operation) { return FoldIndexed.foldIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final UnaryOperator<R>                operation) { return FoldIndexed.foldIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final Supplier<? extends R>           operation) { return FoldIndexed.foldIndexed(_reference(), operation); }
//
//    //#endregion -------------------- Fold indexed --------------------
//
//    //#region -------------------- Fold right --------------------
//
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final ObjIntAccumulator<? super T, R> operation) { return FoldRight.foldRight(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final ObjAccumulator<? super T, R>    operation) { return FoldRight.foldRight(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final UnaryOperator<R>                operation) { return FoldRight.foldRight(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final Supplier<? extends R>           operation) { return FoldRight.foldRight(_reference(), operation); }
//
//    //#endregion -------------------- Fold right --------------------
//    //#region -------------------- Fold right indexed --------------------
//
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final IntObjAccumulator<? super T, R> operation) { return FoldRightIndexed.foldRightIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final IntAccumulator<R>               operation) { return FoldRightIndexed.foldRightIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final UnaryOperator<R>                operation) { return FoldRightIndexed.foldRightIndexed(_reference(), operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final Supplier<? extends R>           operation) { return FoldRightIndexed.foldRightIndexed(_reference(), operation); }
//
//    //#endregion -------------------- Fold right indexed --------------------
//
//    //#endregion -------------------- Accumulation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return Filter.filter(_reference(), predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T>       predicate) { return Filter.filter(_reference(), predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier            predicate) { return Filter.filter(_reference(), predicate); }

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return FilterIndexed.filterIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate               predicate) { return FilterIndexed.filterIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier            predicate) { return FilterIndexed.filterIndexed(_reference(), predicate); }


    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return FilterNot.filterNot(_reference(), predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T>       predicate) { return FilterNot.filterNot(_reference(), predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier            predicate) { return FilterNot.filterNot(_reference(), predicate); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return FilterNotIndexed.filterNotIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate               predicate) { return FilterNotIndexed.filterNotIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier            predicate) { return FilterNotIndexed.filterNotIndexed(_reference(), predicate); }


    @Override public CollectionHolder<@NotNull T> filterNotNull() { return FilterNotNull.filterNotNull(_reference()); }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable CollectionHolder<? extends Integer>                    indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Collection<? extends Integer>                          indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final SequencedCollection<? extends Integer>                               indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return Slice.slice(_reference(), indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return Slice.slice(_reference(), indices); }

    @Override public CollectionHolder<T> slice(                            ) { return Slice.slice(_reference()); }
    @Override public CollectionHolder<T> slice(final int from              ) { return Slice.slice(_reference(), from); }
    @Override public CollectionHolder<T> slice(final int from, final int to) { return Slice.slice(_reference(), from, to); }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(int n) { return Take.take(_reference(), n); }

    @Override public CollectionHolder<T> takeWhile(ObjIntPredicate<? super T> predicate) { return TakeWhile.takeWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> takeWhile(Predicate<? super T>       predicate) { return TakeWhile.takeWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> takeWhile(BooleanSupplier            predicate) { return TakeWhile.takeWhile(_reference(), predicate); }

    @Override public CollectionHolder<T> takeWhileIndexed(IntObjPredicate<? super T> predicate) { return TakeWhileIndexed.takeWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(IntPredicate               predicate) { return TakeWhileIndexed.takeWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(BooleanSupplier            predicate) { return TakeWhileIndexed.takeWhileIndexed(_reference(), predicate); }


    @Override public CollectionHolder<T> takeLast(int n) { return TakeLast.takeLast(_reference(), n); }

    @Override public CollectionHolder<T> takeLastWhile(ObjIntPredicate<? super T> predicate) { return TakeLastWhile.takeLastWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> takeLastWhile(Predicate<? super T>       predicate) { return TakeLastWhile.takeLastWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> takeLastWhile(BooleanSupplier            predicate) { return TakeLastWhile.takeLastWhile(_reference(), predicate); }

    @Override public CollectionHolder<T> takeLastWhileIndexed(IntObjPredicate<? super T> predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(IntPredicate               predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(BooleanSupplier            predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(_reference(), predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(int n) { return Drop.drop(_reference(), n); }

    @Override public CollectionHolder<T> dropWhile(ObjIntPredicate<? super T> predicate) { return DropWhile.dropWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> dropWhile(Predicate<? super T>       predicate) { return DropWhile.dropWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> dropWhile(BooleanSupplier            predicate) { return DropWhile.dropWhile(_reference(), predicate); }

    @Override public CollectionHolder<T> dropWhileIndexed(IntObjPredicate<? super T> predicate) { return DropWhileIndexed.dropWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(IntPredicate               predicate) { return DropWhileIndexed.dropWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(BooleanSupplier            predicate) { return DropWhileIndexed.dropWhileIndexed(_reference(), predicate); }


    @Override public CollectionHolder<T> dropLast(int n) { return DropLast.dropLast(_reference(), n); }

    @Override public CollectionHolder<T> dropLastWhile(ObjIntPredicate<? super T> predicate) { return DropLastWhile.dropLastWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> dropLastWhile(Predicate<? super T>       predicate) { return DropLastWhile.dropLastWhile(_reference(), predicate); }
    @Override public CollectionHolder<T> dropLastWhile(BooleanSupplier            predicate) { return DropLastWhile.dropLastWhile(_reference(), predicate); }

    @Override public CollectionHolder<T> dropLastWhileIndexed(IntObjPredicate<? super T> predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(IntPredicate               predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(_reference(), predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(BooleanSupplier            predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(_reference(), predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> action) { return joookiwi.collection.java.method.Map.map(_reference(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       action) { return joookiwi.collection.java.method.Map.map(_reference(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  action) { return joookiwi.collection.java.method.Map.map(_reference(), action); }

    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> action) { return MapIndexed.mapIndexed(_reference(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               action) { return MapIndexed.mapIndexed(_reference(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  action) { return MapIndexed.mapIndexed(_reference(), action); }


    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends U> transform) { return MapNotNull.mapNotNull(_reference(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends U>       transform) { return MapNotNull.mapNotNull(_reference(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends U>                  transform) { return MapNotNull.mapNotNull(_reference(), transform); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends U> transform) { return MapNotNullIndexed.mapNotNullIndexed(_reference(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends U>               transform) { return MapNotNullIndexed.mapNotNullIndexed(_reference(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends U>                  transform) { return MapNotNullIndexed.mapNotNullIndexed(_reference(), transform); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { ForEach.forEach(_reference(), action); }
    @Override public void forEach(final Consumer<? super T>       action) { ForEach.forEach(_reference(), action); }
    @Override public void forEach(final Runnable                  action) { ForEach.forEach(_reference(), action); }

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { ForEachIndexed.forEachIndexed(_reference(), action); }
    @Override public void forEachIndexed(final IntConsumer               action) { ForEachIndexed.forEachIndexed(_reference(), action); }
    @Override public void forEachIndexed(final Runnable                  action) { ForEachIndexed.forEachIndexed(_reference(), action); }

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEach(final ObjIntConsumer<? super T> action) {
        ForEach.forEach(_reference(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEach(final Consumer<? super T> action) {
        ForEach.forEach(_reference(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEach(final Runnable action) {
        ForEach.forEach(_reference(), action);
        return this;
    }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEachIndexed(final IntObjConsumer<? super T> action) {
        ForEachIndexed.forEachIndexed(_reference(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEachIndexed(final IntConsumer action) {
        ForEachIndexed.forEachIndexed(_reference(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public AbstractCollectionHolder<T> onEachIndexed(final Runnable action) {
        ForEachIndexed.forEachIndexed(_reference(), action);
        return this;
    }


    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    @Override public CollectionHolder<T> toReverse(                                          ) { return ToReverse.toReverse(_reference()); }
    @Override public CollectionHolder<T> toReverse(final int               from              ) { return ToReverse.toReverse(_reference(), from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int to) { return ToReverse.toReverse(_reference(), from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int to) { return ToReverse.toReverse(_reference(), from, to); }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To array --------------------

    @Contract(pure = true) @Override public                              T[] toArray(                                                      ) { return ToArray.toArray(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return ToArray.toArray(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return ToArray.toArray(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return ToArray.toArray(_reference(), transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Contract(pure = true) @Override public                              ImmutableCollection<T> toCollection(                                                      ) { return ToCollection.toCollection(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToCollection.toCollection(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return ToCollection.toCollection(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return ToCollection.toCollection(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return ToMutableCollection.toMutableCollection(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCollection.toMutableCollection(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return ToMutableCollection.toMutableCollection(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return ToMutableCollection.toMutableCollection(_reference(), transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Contract(pure = true) @Override public                              ImmutableSequencedCollection<T> toSequencedCollection(                                                      ) { return ToSequencedCollection.toSequencedCollection(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedCollection.toSequencedCollection(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToSequencedCollection.toSequencedCollection(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return ToSequencedCollection.toSequencedCollection(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return ToMutableSequencedCollection.toMutableSequencedCollection(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(_reference(), transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Contract(pure = true) @Override public                              ImmutableList<T> toList(                                                      ) { return ToList.toList(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return ToList.toList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return ToList.toList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return ToList.toList(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableList<T> toMutableList(                                                      ) { return ToMutableList.toMutableList(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableList.toMutableList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return ToMutableList.toMutableList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return ToMutableList.toMutableList(_reference(), transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Contract(pure = true) @Override public                              ImmutableArrayList<T> toArrayList(                                                      ) { return ToArrayList.toArrayList(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayList.toArrayList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return ToArrayList.toArrayList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return ToArrayList.toArrayList(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                 ) { return ToMutableArrayList.toMutableArrayList(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(final int initialCapacity                                                        ) { return ToMutableArrayList.toMutableArrayList(_reference(), initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(_reference(), initialCapacity, transform); }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

    @Contract(pure = true) @Override public                              ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList(                                                      ) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_reference(), transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Contract(pure = true) @Override public                              ImmutableLinkedList<T> toLinkedList(                                                      ) { return ToLinkedList.toLinkedList(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedList.toLinkedList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return ToLinkedList.toLinkedList(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return ToLinkedList.toLinkedList(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return ToMutableLinkedList.toMutableLinkedList(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedList.toMutableLinkedList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedList.toMutableLinkedList(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return ToMutableLinkedList.toMutableLinkedList(_reference(), transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Contract(pure = true) @Override public                              ImmutableVector<T> toVector(                                                      ) { return ToVector.toVector(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return ToVector.toVector(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return ToVector.toVector(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return ToVector.toVector(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableVector<T> toMutableVector(                                                                                 ) { return ToMutableVector.toMutableVector(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableVector<T> toMutableVector(final int initialCapacity                                                        ) { return ToMutableVector.toMutableVector(_reference(), initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(_reference(), initialCapacity, transform); }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

    @Contract(pure = true) @Override public                              ImmutableSet<T> toSet(                                                      ) { return ToSet.toSet(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSet.toSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return ToSet.toSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return ToSet.toSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return ToMutableSet.toMutableSet(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSet.toMutableSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return ToMutableSet.toMutableSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return ToMutableSet.toMutableSet(_reference(), transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Contract(pure = true) @Override public                              ImmutableSequencedSet<T> toSequencedSet(                                                      ) { return ToSequencedSet.toSequencedSet(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedSet.toSequencedSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return ToSequencedSet.toSequencedSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return ToSequencedSet.toSequencedSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return ToMutableSequencedSet.toMutableSequencedSet(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedSet.toMutableSequencedSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return ToMutableSequencedSet.toMutableSequencedSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedSet.toMutableSequencedSet(_reference(), transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Contract(pure = true) @Override public                              ImmutableSortedSet<T> toSortedSet(                                                      ) { return ToSortedSet.toSortedSet(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSortedSet.toSortedSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return ToSortedSet.toSortedSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return ToSortedSet.toSortedSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return ToMutableSortedSet.toMutableSortedSet(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSortedSet.toMutableSortedSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return ToMutableSortedSet.toMutableSortedSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSortedSet.toMutableSortedSet(_reference(), transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Contract(pure = true) @Override public                              ImmutableNavigableSet<T> toNavigableSet(                                                      ) { return ToNavigableSet.toNavigableSet(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToNavigableSet.toNavigableSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return ToNavigableSet.toNavigableSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return ToNavigableSet.toNavigableSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return ToMutableNavigableSet.toMutableNavigableSet(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableNavigableSet.toMutableNavigableSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return ToMutableNavigableSet.toMutableNavigableSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return ToMutableNavigableSet.toMutableNavigableSet(_reference(), transform); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_reference(), comparator, transform); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_reference(), comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(_reference(), transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(_reference(), clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(_reference(), clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(_reference(), clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(                                                                              ) { return ToHashSet.toHashSet(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(_reference(),             transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(_reference(),             transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(_reference(),             transform); }
    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(final float loadFactor                                                        ) { return ToHashSet.toHashSet(_reference(), loadFactor); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(_reference(), loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(_reference(), loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(_reference(), loadFactor, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(                                                      ) { return ToMutableHashSet.toMutableHashSet(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(_reference(), transform); }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Contract(pure = true) @Override public                              ImmutableLinkedHashSet<T> toLinkedHashSet(                                                      ) { return ToLinkedHashSet.toLinkedHashSet(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedHashSet.toLinkedHashSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return ToLinkedHashSet.toLinkedHashSet(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToLinkedHashSet.toLinkedHashSet(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_reference(), transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(_reference(), transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(_reference(), transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return ToTreeSet.toTreeSet(_reference(), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(_reference(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return ToMutableTreeSet.toMutableTreeSet(_reference(), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(_reference(), comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Contract(pure = true) @Override public                              ImmutableQueue<T> toQueue(                                                      ) { return ToQueue.toQueue(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToQueue.toQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return ToQueue.toQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return ToQueue.toQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return ToMutableQueue.toMutableQueue(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableQueue.toMutableQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return ToMutableQueue.toMutableQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return ToMutableQueue.toMutableQueue(_reference(), transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingQueue.toBlockingQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToBlockingQueue.toBlockingQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return ToBlockingQueue.toBlockingQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(_reference(), transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToTransferQueue.toTransferQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return ToTransferQueue.toTransferQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return ToTransferQueue.toTransferQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTransferQueue.toMutableTransferQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableTransferQueue.toMutableTransferQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableTransferQueue.toMutableTransferQueue(_reference(), transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_reference(), isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(_reference(), transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToDelayQueue.toDelayQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return ToDelayQueue.toDelayQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return ToDelayQueue.toDelayQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDelayQueue.toMutableDelayQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return ToMutableDelayQueue.toMutableDelayQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return ToMutableDelayQueue.toMutableDelayQueue(_reference(), transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_reference(), capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(_reference(), transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_reference(), transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_reference(), transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_reference(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_reference(), initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(_reference(), transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(_reference(), transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(_reference(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_reference(), initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToSynchronousQueue.toSynchronousQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return ToSynchronousQueue.toSynchronousQueue(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return ToSynchronousQueue.toSynchronousQueue(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_reference(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_reference(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_reference(), isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Contract(pure = true) @Override public                              ImmutableDeque<T> toDeque(                                                      ) { return ToDeque.toDeque(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToDeque.toDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return ToDeque.toDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return ToDeque.toDeque(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return ToMutableDeque.toMutableDeque(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDeque.toMutableDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return ToMutableDeque.toMutableDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return ToMutableDeque.toMutableDeque(_reference(), transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingDeque.toBlockingDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToBlockingDeque.toBlockingDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return ToBlockingDeque.toBlockingDeque(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(_reference(), transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayDeque.toArrayDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return ToArrayDeque.toArrayDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return ToArrayDeque.toArrayDeque(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayDeque.toMutableArrayDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Function<? super T, ? extends U>       transform) { return ToMutableArrayDeque.toMutableArrayDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Supplier<? extends U>                  transform) { return ToMutableArrayDeque.toMutableArrayDeque(_reference(), transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(_reference(), transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(_reference(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_reference(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_reference(), capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Contract(pure = true) @Override public                              ImmutableStack<T> toStack(                                                      ) { return ToStack.toStack(_reference()); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToStack.toStack(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return ToStack.toStack(_reference(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return ToStack.toStack(_reference(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableStack<T> toMutableStack(                                                      ) { return ToMutableStack.toMutableStack(_reference()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableStack.toMutableStack(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return ToMutableStack.toMutableStack(_reference(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return ToMutableStack.toMutableStack(_reference(), transform); }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    @Override public @Unmodifiable Map<Integer, T> toMap() { return ToMap.toMap(_reference()); }

//    @Override public Map<Integer, T> toMutableMap() { throw new RuntimeException("TODO: Implements the toMutableMap method"); }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To sequenced map --------------------

//    @Override public @Unmodifiable SequencedMap<Integer, T> toSequencedMap() { return ToSequencedMap.toSequencedMap(_reference()); }

//    @Override public SequencedMap<Integer, T> toMutableSequencedMap() { throw new RuntimeException("TODO: Implements the toMutableSequencedMap method"); }

    //#endregion -------------------- To sequenced map --------------------
    //#region -------------------- To sorted map --------------------

//    @Override public @Unmodifiable SortedMap<Integer, T> toSortedMap() { return ToSortedMap.toSortedMap(_reference()); }

//    @Override public SortedMap<Integer, T> toMutableSortedMap() { throw new RuntimeException("TODO: Implements the toMutableSortedMap method"); }

    //#endregion -------------------- To sorted map --------------------
    //#region -------------------- To navigable map --------------------

//    @Override public @Unmodifiable NavigableMap<Integer, T> toNavigableMap() { return ToNavigableMap.toNavigableMap(_reference()); }

//    @Override public NavigableMap<Integer, T> toMutableNavigableMap() { throw new RuntimeException("TODO: Implements the toMutableNavigableMap method"); }

    //#endregion -------------------- To navigable map --------------------
    //#region -------------------- To concurrent map --------------------

//    @Override public @Unmodifiable ConcurrentMap<Integer, T> toConcurrentMap() { return ToConcurrentMap.toConcurrentMap(_reference()); }

//    @Override public ConcurrentMap<Integer, T> toMutableConcurrentMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentMap method"); }

    //#endregion -------------------- To concurrent map --------------------
    //#region -------------------- To concurrent navigable map --------------------

//    @Override public @Unmodifiable ConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() { return ToConcurrentNavigableMap.toConcurrentNavigableMap(_reference()); }

//    @Override public ConcurrentNavigableMap<Integer, T> toMutableConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentNavigableMap method"); }

    //#endregion -------------------- To concurrent navigable map --------------------
    //#region -------------------- To concurrent hash map --------------------

//    @Override public @Unmodifiable ConcurrentHashMap<Integer, T> toConcurrentHashMap() { return ToConcurrentHashMap.toConcurrentHashMap(_reference()); }

//    @Override public ConcurrentHashMap<Integer, T> toMutableConcurrentHashMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentHashMap method"); }

    //#endregion -------------------- To concurrent hash map --------------------
    //#region -------------------- To concurrent skip list map --------------------

//    @Override public @Unmodifiable ConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() { return ToConcurrentSkipListMap.toConcurrentSkipListMap(_reference()); }

//    @Override public ConcurrentSkipListMap<Integer, T> toMutableConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements the toMutableConcurrentSkipListMap method"); }

    //#endregion -------------------- To concurrent skip list map --------------------
    //#region -------------------- To enum map --------------------

//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                    transform) { return ToEnumMap.toEnumMap(_reference(), transform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, Entry<K, V>>                                                          transform) { return ToEnumMap.toEnumMap(_reference(), transform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<Entry<K, V>>                                                                     transform) { return ToEnumMap.toEnumMap(_reference(), transform); }
//
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>        keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>        keyTransform, final Function<? super T, V>       valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>        keyTransform, final Supplier<V>                  valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>              keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>              keyTransform, final Function<? super T, V>       valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>              keyTransform, final Supplier<V>                  valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                         keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                         keyTransform, final Function<? super T, V>       valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }
//    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                         keyTransform, final Supplier<V>                  valueTransform) { return ToEnumMap.toEnumMap(_reference(), keyTransform, valueTransform); }

//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                             transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, Entry<K, V>>                                                   transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<Entry<K, V>>                                                              transform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K> keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K> keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K> keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>       keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>       keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>       keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                  keyTransform, final ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                  keyTransform, final Function<? super T, V>       valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }
//    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                  keyTransform, final Supplier<V>                  valueTransform) { throw new RuntimeException("TODO: Implements the toMutableEnumMap method"); }

    //#endregion -------------------- To enum map --------------------
    //#region -------------------- To hash map --------------------

//    @Override public @Unmodifiable HashMap<Integer, T> toHashMap() { return ToHashMap.toHashMap(_reference()); }

//    @Override public HashMap<Integer, T> toMutableHashMap() { throw new RuntimeException("TODO: Implements the toMutableHashMap method"); }

    //#endregion -------------------- To hash map --------------------
    //#region -------------------- To hashtable --------------------

//    @Override public @Unmodifiable Hashtable<Integer, T> toHashtable() { return ToHashtable.toHashtable(_reference()); }

//    @Override public Hashtable<Integer, T> toMutableHashtable() { throw new RuntimeException("TODO: Implements the toMutableHashtable method"); }

    //#endregion -------------------- To hashtable --------------------
    //#region -------------------- To identity hash map --------------------

//    @Override public @Unmodifiable IdentityHashMap<Integer, T> toIdentityHashMap() { return ToIdentityHashMap.toIdentityHashMap(_reference()); }

//    @Override public IdentityHashMap<Integer, T> toMutableIdentityHashMap() { throw new RuntimeException("TODO: Implements the toMutableIdentityHashMap method"); }

    //#endregion -------------------- To identity hash map --------------------
    //#region -------------------- To linked hash map --------------------

//    @Override public @Unmodifiable LinkedHashMap<Integer, T> toLinkedHashMap() { return ToLinkedHashMap.toLinkedHashMap(_reference()); }

//    @Override public LinkedHashMap<Integer, T> toMutableLinkedHashMap() { throw new RuntimeException("TODO: Implements the toMutableLinkedHashMap method"); }

    //#endregion -------------------- To linked hash map --------------------
    //#region -------------------- To tree map --------------------

//    @Override public @Unmodifiable TreeMap<Integer, T> toTreeMap() { return ToTreeMap.toTreeMap(_reference()); }

//    @Override public TreeMap<Integer, T> toMutableTreeMap() { throw new RuntimeException("TODO: Implements the toMutableTreeMap method"); }

    //#endregion -------------------- To tree map --------------------
    //#region -------------------- To weak hash map --------------------

//    @Override public @Unmodifiable WeakHashMap<Integer, T> toWeakHashMap() { return ToWeakHashMap.toWeakHashMap(_reference()); }

//    @Override public WeakHashMap<Integer, T> toMutableWeakHashMap() { throw new RuntimeException("TODO: Implements the toMutableWeakHashMap method"); }

    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return ToString.toString(_reference()); }

    @Override public String toLocaleString(                             ) { return ToLocaleString.toLocaleString(_reference()); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return ToLocaleString.toLocaleString(_reference(), locale); }

    @Override public String toLowerCaseString() { return ToLowerCaseString.toLowerCaseString(_reference()); }

    @Override public String toLocaleLowerCaseString(                             ) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(_reference()); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(_reference(), locale); }

    @Override public String toUpperCaseString() { return ToUpperCaseString.toUpperCaseString(_reference()); }

    @Override public String toLocaleUpperCaseString(                             ) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(_reference()); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(_reference(), locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix                                                                                                                              ) { return JoinToString.joinToString(_reference(), separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated                                                             ) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Function<? super T, String>       transform) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String>       transform) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Supplier<String>                  transform) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String>                  transform) { return JoinToString.joinToString(_reference(), separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override public int hashCode() { return HashCodeCreator.getInstance().newHashCode(_reference()); }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ArrayAsCollectionHolder<T> clone() { return (ArrayAsCollectionHolder<T>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public ArrayAsCollectionHolder<T> shallowClone() { return clone(); }
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public ArrayAsCollectionHolder<T> deepClone() {
//        final var cloneInvokator = CloneInvokator.getInstance();
//        final var values = _reference();
//        final var size = values.length;
//        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
//
//        var index = -1;
//        while (++index < size)
//            newArray[index] = cloneInvokator.cloneIfCloneable(values[index]);
//
//        return new ArrayAsCollectionHolder<>(newArray);
//    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
