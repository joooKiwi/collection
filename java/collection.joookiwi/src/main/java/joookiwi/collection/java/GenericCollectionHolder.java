package joookiwi.collection.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
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
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PrimitiveIterator;
import java.util.Queue;
import java.util.RandomAccess;
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
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Delayed;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.callback.ArraySupplier;
import joookiwi.collection.java.callback.CollectionHolderSupplier;
import joookiwi.collection.java.callback.CollectionIteratorSupplier;
import joookiwi.collection.java.callback.CollectionSupplier;
import joookiwi.collection.java.callback.DequeSupplier;
import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.callback.IntObjFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.callback.IterableSupplier;
import joookiwi.collection.java.callback.ListSupplier;
import joookiwi.collection.java.callback.MinimalistCollectionHolderSupplier;
import joookiwi.collection.java.callback.MinimalistCollectionIteratorSupplier;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.callback.QueueSupplier;
import joookiwi.collection.java.callback.SetSupplier;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.extended.ArrayAsImmutableCollection;
import joookiwi.collection.java.extended.ArrayAsImmutableDeque;
import joookiwi.collection.java.extended.ArrayAsImmutableList;
import joookiwi.collection.java.extended.ArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.ArrayAsImmutableQueue;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedCollection;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedSet;
import joookiwi.collection.java.extended.ArrayAsImmutableSet;
import joookiwi.collection.java.extended.ArrayAsImmutableSortedSet;
import joookiwi.collection.java.extended.ArrayAsMutableCollection;
import joookiwi.collection.java.extended.ArrayAsMutableDeque;
import joookiwi.collection.java.extended.ArrayAsMutableList;
import joookiwi.collection.java.extended.ArrayAsMutableNavigableSet;
import joookiwi.collection.java.extended.ArrayAsMutableQueue;
import joookiwi.collection.java.extended.ArrayAsMutableSequencedCollection;
import joookiwi.collection.java.extended.ArrayAsMutableSequencedSet;
import joookiwi.collection.java.extended.ArrayAsMutableSet;
import joookiwi.collection.java.extended.ArrayAsMutableSortedSet;
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
import joookiwi.collection.java.extended.JavaArray;
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
import joookiwi.collection.java.extended.OrderableCollection;
import joookiwi.collection.java.extended.BasicStack;
import joookiwi.collection.java.extended.ReversedArray;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableDeque;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableList;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableSequencedCollection;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableSequencedSet;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableSortedSet;
import joookiwi.collection.java.extended.ReversedArrayAsMutableDeque;
import joookiwi.collection.java.extended.ReversedArrayAsMutableList;
import joookiwi.collection.java.extended.ReversedArrayAsMutableNavigableSet;
import joookiwi.collection.java.extended.ReversedArrayAsMutableSequencedCollection;
import joookiwi.collection.java.extended.ReversedArrayAsMutableSequencedSet;
import joookiwi.collection.java.extended.ReversedArrayAsMutableSortedSet;
import joookiwi.collection.java.extended.ReversedMutableArray;
import joookiwi.collection.java.extended.SubdividedArray;
import joookiwi.collection.java.extended.SubdividedArrayAsImmutableList;
import joookiwi.collection.java.extended.SubdividedArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.SubdividedArrayAsImmutableSortedSet;
import joookiwi.collection.java.extended.SubdividedArrayAsMutableList;
import joookiwi.collection.java.extended.SubdividedArrayAsMutableNavigableSet;
import joookiwi.collection.java.extended.SubdividedArrayAsMutableSortedSet;
import joookiwi.collection.java.extended.SubdividedMutableArray;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.ImmutableListIterator;
import joookiwi.collection.java.helper.ArrayCreator;
import joookiwi.collection.java.helper.HashCodeCreator;
import joookiwi.collection.java.iterator.CollectionIterator;
import joookiwi.collection.java.iterator.MinimalistCollectionIterator;
import joookiwi.collection.java.method.All;
import joookiwi.collection.java.method.Any;
import joookiwi.collection.java.method.ArrayListCreator;
import joookiwi.collection.java.method.CollectionCreator;
import joookiwi.collection.java.method.CopyOnWriteArrayListCreator;
import joookiwi.collection.java.method.DequeCreator;
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
import joookiwi.collection.java.method.HashSetCreator;
import joookiwi.collection.java.method.IndexOfFirst;
import joookiwi.collection.java.method.IndexOfFirstIndexed;
import joookiwi.collection.java.method.IndexOfFirstIndexedOrNull;
import joookiwi.collection.java.method.IndexOfFirstOrNull;
import joookiwi.collection.java.method.IndexOfLast;
import joookiwi.collection.java.method.IndexOfLastIndexed;
import joookiwi.collection.java.method.IndexOfLastIndexedOrNull;
import joookiwi.collection.java.method.IndexOfLastOrNull;
import joookiwi.collection.java.method.JoinToString;
import joookiwi.collection.java.method.LastIndexOf;
import joookiwi.collection.java.method.LastIndexOfOrNull;
import joookiwi.collection.java.method.LinkedHashSetCreator;
import joookiwi.collection.java.method.LinkedListCreator;
import joookiwi.collection.java.method.ListCreator;
import joookiwi.collection.java.method.MapIndexed;
import joookiwi.collection.java.method.MapNotNull;
import joookiwi.collection.java.method.MapNotNullIndexed;
import joookiwi.collection.java.method.NavigableSetCreator;
import joookiwi.collection.java.method.None;
import joookiwi.collection.java.method.QueueCreator;
import joookiwi.collection.java.method.SequencedCollectionCreator;
import joookiwi.collection.java.method.SequencedSetCreator;
import joookiwi.collection.java.method.SetCreator;
import joookiwi.collection.java.method.Slice;
import joookiwi.collection.java.method.SortedSetCreator;
import joookiwi.collection.java.method.StackCreator;
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
import joookiwi.collection.java.method.Utility;
import joookiwi.collection.java.method.VectorCreator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.method.ArrayCreator.Array;

/// A [CollectionHolder] having the values eagerly retrieved.
///
/// Meaning that every value is retrieved during the construction,
/// and will never change after the initialization.
///
/// @param <T> The type
/// @see GenericMinimalistCollectionHolder
/// @see CollectionViewer
/// @see EmptyCollectionHolder
@NotNullByDefault
public class GenericCollectionHolder<T extends @Nullable Object>
        extends AbstractCollectionHolder<T>
        implements RandomAccess {

    //#region -------------------- Fields --------------------

    private final int __size;
    private final boolean __isEmpty;
    private final boolean __isNotEmpty;

    //#region -------------------- Index fields --------------------

    /// An `int` index to tell that an index (starting or ending) is not existant
    private static final int INEXISTANT_INDEX = -1;
    private final @Range(from = INEXISTANT_INDEX, to = MAX_INT_VALUE) int __firstIndex;
    private @Nullable Integer __firstIndexOrNull;
    private boolean __isFirstIndexOrNullSet;

    private final @Range(from = INEXISTANT_INDEX, to = MAX_INT_VALUE) int __lastIndex;
    private @Nullable Integer __lastIndexOrNull;
    private boolean __isLastIndexOrNullSet;

    //#endregion -------------------- Index fields --------------------

    private @Nullable Integer __hashCode;

    private final T @Unmodifiable [] __array;

    //#region -------------------- Fields (collection) --------------------

    private @Nullable ImmutableCollection<T> __collection;
    private @Nullable ImmutableSequencedCollection<T> __sequencedCollection;

    //#endregion -------------------- Fields (collection) --------------------
    //#region -------------------- Fields (list) --------------------

    private @Nullable ImmutableList<T> __list;

    private @Nullable ImmutableArrayList<T> __arrayList;
    private @Nullable ImmutableCopyOnWriteArrayList<T> __copyOnWriteArrayList;
    private @Nullable ImmutableLinkedList<T> __linkedList;
    private @Nullable ImmutableVector<T> __vector;

    //#endregion -------------------- Fields (list) --------------------
    //#region -------------------- Fields (set) --------------------

    private @Nullable ImmutableSet<T> __set;
    private @Nullable ImmutableSequencedSet<T> __sequencedSet;
    private @Nullable ImmutableSortedSet<T> __sortedSet;
    private @Nullable ImmutableNavigableSet<T> __navigableSet;

    private @Nullable ImmutableHashSet<T> __hashSet;
    private @Nullable ImmutableLinkedHashSet<T> __linkedHashSet;

    //#endregion -------------------- Fields (set) --------------------
    //#region -------------------- Fields (queue) --------------------

    private @Nullable ImmutableQueue<T> __queue;

    //#endregion -------------------- Fields (queue) --------------------
    //#region -------------------- Fields (stack) --------------------

    private @Nullable ImmutableDeque<T> __deque;

    private @Nullable ImmutableStack<T> __stack;

    //#endregion -------------------- Fields (stack) --------------------
    //#region -------------------- Fields (map) --------------------

    private @Nullable @Unmodifiable Map<Integer, T> __map;
    private @Nullable @Unmodifiable SequencedMap<Integer, T> __sequencedMap;
    private @Nullable @Unmodifiable SortedMap<Integer, T> __sortedMap;
    private @Nullable @Unmodifiable NavigableMap<Integer, T> __navigableMap;
    private @Nullable @Unmodifiable ConcurrentMap<Integer, T> __concurrentMap;
    private @Nullable @Unmodifiable ConcurrentNavigableMap<Integer, T> __concurrentNavigableMap;

    private @Nullable @Unmodifiable ConcurrentHashMap<Integer, T> __concurrentHashMap;
    private @Nullable @Unmodifiable ConcurrentSkipListMap<Integer, T> __concurrentSkipListMap;
    private @Nullable @Unmodifiable HashMap<Integer, T> __hashMap;
    private @Nullable @Unmodifiable Hashtable<Integer, T> __hashtable;
    private @Nullable @Unmodifiable IdentityHashMap<Integer, T> __identityHashMap;
    private @Nullable @Unmodifiable LinkedHashMap<Integer, T> __linkedHashMap;
    private @Nullable @Unmodifiable TreeMap<Integer, T> __treeMap;
    private @Nullable @Unmodifiable WeakHashMap<Integer, T> __weakHashMap;

    //#endregion -------------------- Fields (map) --------------------

    private @Nullable Boolean __hasNull;
    private @Nullable Boolean __hasDuplicate;

    //#endregion -------------------- Fields --------------------

    //#region -------------------- Late-initialize constructor methods --------------------

    //#region -------------------- Late-initialize constructor methods (from set amount of values) --------------------

    private T @Unmodifiable [] __initializeAs0() {
        __hasNull = __hasDuplicate = FALSE;

        __collection = CollectionCreator.Collection();
        __sequencedCollection = SequencedCollectionCreator.SequencedCollection();

        __list = ListCreator.List();
        __arrayList = ArrayListCreator.ArrayList();
        __copyOnWriteArrayList = CopyOnWriteArrayListCreator.CopyOnWriteArrayList();
        __linkedList = LinkedListCreator.LinkedList();
        __vector = VectorCreator.Vector();

        __set = SetCreator.Set();
        __sequencedSet = SequencedSetCreator.SequencedSet();
        __sortedSet = SortedSetCreator.SortedSet();
        __navigableSet = NavigableSetCreator.NavigableSet();
        __hashSet = HashSetCreator.HashSet();
        __linkedHashSet = LinkedHashSetCreator.LinkedHashSet();

        __queue = QueueCreator.Queue();

        __deque = DequeCreator.Deque();
        __stack = StackCreator.Stack();

//        final var creator = joookiwi.collection.java.CollectionCreator.getInstance();
//
//        __map = creator.Map();
//        __sequencedMap = creator.SequencedMap();
//        __sortedMap = creator.SortedMap();
//        __navigableMap = creator.NavigableMap();
//        __concurrentMap = creator.ConcurrentMap();
//        __concurrentNavigableMap = creator.ConcurrentNavigableMap();
//        __concurrentHashMap = creator.ConcurrentHashMap();
//        __concurrentSkipListMap = creator.ConcurrentSkipListMap();
//        __hashMap = creator.HashMap();
//        __hashtable = creator.Hashtable();
//        __identityHashMap = creator.IdentityHashMap();
//        __linkedHashMap = creator.LinkedHashMap();
//        __treeMap = creator.TreeMap();
//        __weakHashMap = creator.WeakHashMap();

        __hashCode = HashCodeCreator.getInstance().newHashCode();
        return Array();
    }

    private T @Unmodifiable [] __initializeAs1(final T value) {
        if (value == null) {
            __hasNull = TRUE;
            __hasDuplicate = FALSE;
            __hashCode = HashCodeCreator.getInstance().newHashCode();
            return Array(value);
        }
        __hasNull = __hasDuplicate = FALSE;
        __hashCode = HashCodeCreator.getInstance().newHashCode(value);
        return Array(value);
    }

    private T @Unmodifiable [] __initializeAs2(final T value1,
                                               final T value2) {
        if (value1 == null) {
            if (value2 == null) {
                __hasDuplicate = __hasNull = TRUE;
                __hashCode = HashCodeCreator.getInstance().newHashCode();
                return Array(value1, value2);
            }

            __hasNull = TRUE;
            __hasDuplicate = FALSE;
            __hashCode = HashCodeCreator.getInstance().newHashCode(value2);
            return Array(value1, value2);
        }

        if (value2 == null) {
            __hasNull = TRUE;
            __hasDuplicate = FALSE;
            __hashCode = HashCodeCreator.getInstance().newHashCode(value1);
            return Array(value1, value2);
        }

        __hasNull = TRUE;
//        __hasDuplicate = _EqualsComparator().compare(value1, value2);
        __hashCode = HashCodeCreator.getInstance().newHashCode(value1, value2);
        return Array(value1, value2);
    }

    //#endregion -------------------- Late-initialize constructor methods (from set amount of values) --------------------
    //#region -------------------- Late-initialize constructor methods (with iterator) --------------------

    private T @Unmodifiable [] __initializeAsUnknownFromIterator(final Iterator<? extends T> values,
                                                                 final T value1,
                                                                 final T value2) {
        final var array = ArrayCreator.getInstance().newArray(values, value1, value2);
        __hashCode = HashCodeCreator.getInstance().newHashCode(array);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknownFromIterator(final MinimalistCollectionIterator<? extends T> values,
                                                                 final T value1,
                                                                 final T value2) {
        final var array = ArrayCreator.getInstance().newArray(values, value1, value2);
        __hashCode = HashCodeCreator.getInstance().newHashCode(array);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknownFromIterator(final Enumeration<? extends T> values,
                                                                 final T value1,
                                                                 final T value2) {
        final var array = ArrayCreator.getInstance().newArray(values, value1, value2);
        __hashCode = HashCodeCreator.getInstance().newHashCode(array);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknownFromIterator(final Spliterator<? extends T> values,
                                                                 final T value1,
                                                                 final T value2,
                                                                 final T value3) {
        final var array = ArrayCreator.getInstance().newArray(values, value1, value2, value3);
        __hashCode = HashCodeCreator.getInstance().newHashCode(array);
        return array;
    }

    //#endregion -------------------- Late-initialize constructor methods (with iterator) --------------------
    //#region -------------------- Late-initialize constructor methods (with size) --------------------

    private T @Unmodifiable [] __initializeAsUnknown(final T @Unmodifiable [] values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(values);
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable Collection<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable SequencedCollection<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknown(final CollectionHolder<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final MinimalistCollectionHolder<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final CollectionIterator<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable List<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable Set<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable SequencedSet<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable Queue<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }


    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable Deque<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    private T @Unmodifiable [] __initializeAsUnknown(final @Unmodifiable BasicStack<? extends T> values,
                                                     final @Range(from = 3, to = MAX_INT_VALUE) int size) {
        final var array = Array(Array(values, size));
        __hashCode = HashCodeCreator.getInstance().newHashCode(array, size);
        return array;
    }

    //#endregion -------------------- Late-initialize constructor methods (with size) --------------------

    //#endregion -------------------- Late-initialize constructor methods --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- Constructor (collection holder) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final CollectionHolderSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) CollectionHolder<? extends T> reference) {
        super();
        if (__isEmpty = reference.isEmpty()) {
            __size = 0;
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        final var size = this.__size = reference.size();
        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.first());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            __array = __initializeAs2(reference.first(), reference.last());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    //#endregion -------------------- Constructor (collection holder) --------------------
    //#region -------------------- Constructor (minimalist collection holder) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final MinimalistCollectionHolderSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MinimalistCollectionHolder<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = true;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.get(0));
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            __array = __initializeAs2(reference.get(0), reference.get(1));
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    //#endregion -------------------- Constructor (minimalist collection holder) --------------------

    //#region -------------------- Constructor (collection iterator) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final CollectionIteratorSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(mutates = "param")
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) CollectionIterator<? extends T> reference) {
        if (__isEmpty = reference.isEmpty()) {
            __size = 0;
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        final var size = __size = reference.size();
        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 0;
            __array = __initializeAs1(reference.nextValue());
            return;
        }

        if (size == 2) {
            __lastIndex = 1;
            __array = __initializeAs2(reference.nextValue(), reference.nextValue());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    //#endregion -------------------- Constructor (collection iterator) --------------------
    //#region -------------------- Constructor (minimalist collection iterator) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final MinimalistCollectionIteratorSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(mutates = "param")
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MinimalistCollectionIterator<? extends T> reference) {
        if (__isEmpty = !(__isNotEmpty = reference.hasNext())) {
            __size = 0;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __firstIndex = 0;
        final var value1 = reference.nextValue();
        if (!reference.hasNext()) {
            __size = 1;
            __lastIndex = 0;
            __array = __initializeAs1(value1);
            return;
        }

        final var value2 = reference.nextValue();
        if (!reference.hasNext()) {
            __size = 2;
            __lastIndex = 1;
            __array = __initializeAs2(value1, value2);
            return;
        }

        __lastIndex = (__size = (__array = __initializeAsUnknownFromIterator(reference, value1, value2)).length) - 1;
    }

    //#endregion -------------------- Constructor (minimalist collection iterator) --------------------

    //#region -------------------- Constructor (iterator) --------------------

    @Contract(mutates = "param")
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Iterator<? extends T> reference) {
        if (__isEmpty = !(__isNotEmpty = reference.hasNext())) {
            __size = 0;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __firstIndex = 0;
        final var value1 = reference.next();
        if (!reference.hasNext()) {
            __size = 1;
            __lastIndex = 0;
            __array = __initializeAs1(value1);
            return;
        }

        final var value2 = reference.next();
        if (!reference.hasNext()) {
            __size = 2;
            __lastIndex = 1;
            __array = __initializeAs2(value1, value2);
            return;
        }

        __lastIndex = (__size = (__array = __initializeAsUnknownFromIterator(reference, value1, value2)).length) - 1;
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableIterator<? extends T> reference) { this((Iterator<? extends T>) reference); }

    //#endregion -------------------- Constructor (iterator) --------------------
    //#region -------------------- Constructor (list iterator) --------------------

    @Contract(mutates = "param")
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ListIterator<? extends T> reference) { this((Iterator<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableListIterator<? extends T> reference) { this((Iterator<? extends T>) reference); }

    //#endregion -------------------- Constructor (list iterator) --------------------
    //#region -------------------- Constructor (enumeration) --------------------

    @Contract(mutates = "param")
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Enumeration<? extends T> reference) {
        if (__isEmpty = !(__isNotEmpty = reference.hasMoreElements())) {
            __size = 0;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __firstIndex = 0;
        final var value1 = reference.nextElement();
        if (!reference.hasMoreElements()) {
            __size = 1;
            __lastIndex = 0;
            __array = __initializeAs1(value1);
            return;
        }

        final var value2 = reference.nextElement();
        if (!reference.hasMoreElements()) {
            __size = 2;
            __lastIndex = 1;
            __array = __initializeAs2(value1, value2);
            return;
        }

        __lastIndex = (__size = (__array = __initializeAsUnknownFromIterator(reference, value1, value2)).length) - 1;
    }

    //#endregion -------------------- Constructor (enumeration) --------------------
    //#region -------------------- Constructor (spliterator) --------------------

    @Contract(mutates = "param")
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Spliterator<? extends T> reference) {
        final AtomicReference<@Nullable T> tempValue = new AtomicReference<>();
        if (__isEmpty = !(__isNotEmpty = reference.tryAdvance(tempValue::set))) {
            __size = 0;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __firstIndex = 0;
        final var value1 = tempValue.get();
        if (!reference.tryAdvance(tempValue::set)) {
            __size = 1;
            __lastIndex = 0;
            __array = __initializeAs1(value1);
            return;
        }

        final var value2 = tempValue.get();
        if (!reference.tryAdvance(tempValue::set)) {
            __size = 2;
            __lastIndex = 1;
            __array = __initializeAs2(value1, value2);
            return;
        }

        __lastIndex = (__size = (__array = __initializeAsUnknownFromIterator(reference, value1, value2, tempValue.get())).length) - 1;
    }

    //#endregion -------------------- Constructor (spliterator) --------------------

    //#region -------------------- Constructor (iterable) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final IterableSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Iterable<? extends T> reference) {
        super();
        final var iterator = reference.iterator();

        if (__isEmpty = !(__isNotEmpty = iterator.hasNext())) {
            __size = 0;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __firstIndex = 0;
        final var value1 = iterator.next();
        if (!iterator.hasNext()) {
            __size = 1;
            __lastIndex = 1;
            __array = __initializeAs1(value1);
            return;
        }

        final var value2 = iterator.next();
        if (!iterator.hasNext()) {
            __size = 2;
            __lastIndex = 2;
            __array = __initializeAs2(value1, value2);
            return;
        }

        final var array = this.__array = __initializeAsUnknownFromIterator(iterator, value1, value2);
        final var size = __size = array.length;
        __lastIndex = size - 1;
    }

    //#endregion -------------------- Constructor (iterable) --------------------

    //#region -------------------- Constructor (collection) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final CollectionSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.iterator().next());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            final var iterator = reference.iterator();
            __array = __initializeAs2(iterator.next(), iterator.next());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }

    //#endregion -------------------- Constructor (collection) --------------------
    //#region -------------------- Constructor (orderable collection) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }

    //#endregion -------------------- Constructor (orderable collection) --------------------
    //#region -------------------- Constructor (sequenced collection) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SequencedCollection<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.getFirst());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            final var iterator = reference.iterator();
            __array = __initializeAs2(iterator.next(), iterator.next());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableSequencedCollection<? extends T> reference) { this((SequencedCollection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableSequencedCollection<? extends T> reference) { this((SequencedCollection<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSequencedCollection<? extends T> reference) { this((SequencedCollection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableSequencedCollection<? extends T, ?, ?> reference) { this((SequencedCollection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableSequencedCollection<? extends T> reference) { this((SequencedCollection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ReversedArrayAsMutableSequencedCollection<? extends T, ?, ?> reference) { this((SequencedCollection<? extends T>) reference); }

    //#endregion -------------------- Constructor (sequenced collection) --------------------

    //#region -------------------- Constructor (list) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ListSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable List<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = true;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.getFirst());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            __array = __initializeAs2(reference.getFirst(), reference.getLast());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableList<? extends T> reference) { this((List<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) SubdividedArrayAsImmutableList<? extends T, ?, ?> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableList<? extends T, ?, ?> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SubdividedArrayAsMutableList<? extends T, ?, ?> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ReversedArrayAsMutableList<? extends T, ?, ?> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (list) --------------------
    //#region -------------------- Constructor (array list) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (array list) --------------------
    //#region -------------------- Constructor (copy on white array list) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable CopyOnWriteArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableCopyOnWriteArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableCopyOnWriteArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (copy on write array list) --------------------
    //#region -------------------- Constructor (linked list) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable LinkedList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableLinkedList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableLinkedList<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (linked list) --------------------
    //#region -------------------- Constructor (vector) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Vector<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableVector<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableVector<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (vector) --------------------

    //#region -------------------- Constructor (set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final SetSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Set<? extends T> reference) {
        super();
        __hasDuplicate = FALSE;
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.iterator().next());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            final var iterator = reference.iterator();
            __array = __initializeAs2(iterator.next(), iterator.next());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableSet<? extends T> reference) { this((Set<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableSet<? extends T> reference) { this((Set<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSet<? extends T> reference) { this((Set<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableSet<? extends T> reference) { this((Set<? extends T>) reference); }

    //#endregion -------------------- Constructor (set) --------------------
    //#region -------------------- Constructor (sequenced set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SequencedSet<? extends T> reference) {
        super();
        __hasDuplicate = FALSE;
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.getFirst());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            final var iterator = reference.iterator();
            __array = __initializeAs2(iterator.next(), iterator.next());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableSequencedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableSequencedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSequencedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableSequencedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableSequencedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ReversedArrayAsMutableSequencedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (sequenced set) --------------------
    //#region -------------------- Constructor (sorted set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableSortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableSortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) SubdividedArrayAsImmutableSortedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableSortedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableSortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SubdividedArrayAsMutableSortedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ReversedArrayAsMutableSortedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (sorted set) --------------------
    //#region -------------------- Constructor (navigable set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable NavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableNavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableNavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableNavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) SubdividedArrayAsImmutableNavigableSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableNavigableSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableNavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SubdividedArrayAsMutableNavigableSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ReversedArrayAsMutableNavigableSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (navigable set) --------------------
    //#region -------------------- Constructor (hash set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable HashSet<? extends T> reference) { this((Set<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableHashSet<? extends T> reference) { this((Set<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableHashSet<? extends T> reference) { this((Set<? extends T>) reference); }

    //#endregion -------------------- Constructor (hash set) --------------------
    //#region -------------------- Constructor (linked hash set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable LinkedHashSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableLinkedHashSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableLinkedHashSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (linked hash set) --------------------
    //#region -------------------- Constructor (tree set) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable TreeSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableTreeSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableTreeSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (tree set) --------------------

    //#region -------------------- Constructor (queue) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final QueueSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Queue<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.element());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableQueue<? extends T> reference) { this((Queue<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableQueue<? extends T> reference) { this((Queue<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableQueue<? extends T> reference) { this((Queue<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableQueue<? extends T> reference) { this((Queue<? extends T>) reference); }

    //#endregion -------------------- Constructor (queue) --------------------

    //#region -------------------- Constructor (deque) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final DequeSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Deque<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.getFirst());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            __array = __initializeAs2(reference.getFirst(), reference.getLast());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableDeque<? extends T> reference) { this((Deque<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableDeque<? extends T> reference) { this((Deque<? extends T>) reference); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableDeque<? extends T> reference) { this((Deque<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableDeque<? extends T, ?, ?> reference) { this((Deque<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayAsMutableDeque<? extends T> reference) { this((Deque<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ReversedArrayAsMutableDeque<? extends T, ?, ?> reference) { this((Deque<? extends T>) reference); }

    //#endregion -------------------- Constructor (deque) --------------------
    //#region -------------------- Constructor (basic stack) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable BasicStack<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = false;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference.getFirst());
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            __array = __initializeAs2(reference.getFirst(), reference.getLast());
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }

    //#endregion -------------------- Constructor (basic stack) --------------------
    //#region -------------------- Constructor (stack) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Stack<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableStack<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable MutableStack<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (stack) --------------------

    //#region -------------------- Constructors (array) --------------------

    @Contract(pure = true)
    public GenericCollectionHolder(final ArraySupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] reference) {
        super();
        final var size = this.__size = reference.length;
        if (__isEmpty = size == 0) {
            __isNotEmpty = false;
            __firstIndex = __lastIndex = INEXISTANT_INDEX;
            __array = __initializeAs0();
            return;
        }

        __isNotEmpty = true;
        __firstIndex = 0;
        if (size == 1) {
            __lastIndex = 1;
            __array = __initializeAs1(reference[0]);
            return;
        }

        if (size == 2) {
            __lastIndex = 2;
            __array = __initializeAs2(reference[0], reference[1]);
            return;
        }

        __lastIndex = size - 1;
        __array = __initializeAsUnknown(reference, size);
    }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, source="param1.getArray", targetIsContainer = true) @Unmodifiable JavaArray<? extends T> reference) { this(reference.getArray()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, source="param1.subdividedSource", targetIsContainer = true) SubdividedArray<? extends T> reference) { this(reference.subdividedSource()); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, source="param1.subdividedSource", targetIsContainer = true) @Unmodifiable SubdividedMutableArray<? extends T> reference) { this(reference.subdividedSource()); }


    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, source="param1.reversedSource", targetIsContainer = true) ReversedArray<? extends T> reference) { this(reference.reversedSource()); }

    @Contract(pure = true)
    public GenericCollectionHolder(final @Flow(sourceIsContainer = true, source="param1.reversedSource", targetIsContainer = true) @Unmodifiable ReversedMutableArray<? extends T> reference) { this(reference.reversedSource()); }

    //#endregion -------------------- Constructors (array) --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter methods --------------------

    /// The `array` stored (from the construction) for the current [collection][GenericCollectionHolder]
    protected T @Unmodifiable [] _array() { return __array; }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @OnlyGivePositiveValue @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Override public boolean isEmpty() { return __isEmpty; }
    @Override public boolean isNotEmpty() { return __isNotEmpty; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(final int index) {
        if (isEmpty())
            throw new EmptyCollectionException(null, index);

        final var size = size();
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        if (index == size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is the size of the collection (" + size + ").", index);
        if (index >= 0)
            return _array()[index];

        final var indexToRetrieve = index + size;
        if (indexToRetrieve < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” (" + indexToRetrieve + " after calculation) is under 0.", index);
        return _array()[indexToRetrieve];
    }

    @Override public T getFirst() { return GetFirst.getFirst(_array()); }

    @Override public T getLast() { return GetLast.getLast(_array()); }


    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return GetOrElse.getOrElse(_array(), index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return GetOrElse.getOrElse(_array(), index, defaultValue); }


    @Override public @Nullable T getOrNull(final int index) { return GetOrNull.getOrNull(_array(), index); }

    @Override public @Nullable T getFirstOrNull() { return GetFirstOrNull.getFirstOrNull(_array()); }

    @Override public @Nullable T getLastOrNull() { return GetLastOrNull.getLastOrNull(_array()); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(_array(), predicate); }
    @Override public T findFirst(final Predicate<? super T>       predicate) { return FindFirst.findFirst(_array(), predicate); }
    @Override public T findFirst(final BooleanSupplier            predicate) { return FindFirst.findFirst(_array(), predicate); }

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return FindFirstIndexed.findFirstIndexed(_array(), predicate); }
    @Override public T findFirstIndexed(final IntPredicate               predicate) { return FindFirstIndexed.findFirstIndexed(_array(), predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return FindFirstIndexed.findFirstIndexed(_array(), predicate); }

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return FindFirstOrNull.findFirstOrNull(_array(), predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return FindFirstOrNull.findFirstOrNull(_array(), predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return FindFirstOrNull.findFirstOrNull(_array(), predicate); }

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(_array(), predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(_array(), predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(_array(), predicate); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return FindLast.findLast(_array(), predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return FindLast.findLast(_array(), predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return FindLast.findLast(_array(), predicate); }

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return FindLastIndexed.findLastIndexed(_array(), predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return FindLastIndexed.findLastIndexed(_array(), predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return FindLastIndexed.findLastIndexed(_array(), predicate); }

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return FindLastOrNull.findLastOrNull(_array(), predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return FindLastOrNull.findLastOrNull(_array(), predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return FindLastOrNull.findLastOrNull(_array(), predicate); }

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(_array(), predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(_array(), predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(_array(), predicate); }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index --------------------

    @OnlyGivePositiveValue public @Range(from = 0, to = MAX_INT_VALUE) int firstIndex() {
        final var value = __firstIndex;
        if (value == INEXISTANT_INDEX)
            throw new IndexOutOfBoundsException("There were no first index present in the collection.", value);
        return value;
    }

    @OnlyGivePositiveValue public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOrNull() {
        if (__isFirstIndexOrNullSet)
            return __firstIndexOrNull;

        __isFirstIndexOrNullSet = true;
        final var value = __firstIndex;
        return __firstIndexOrNull = value == INEXISTANT_INDEX ? null : value;
    }

    //#endregion -------------------- First index --------------------
    //#region -------------------- Last index --------------------

    @OnlyGivePositiveValue public @Range(from = 0, to = MAX_INT_VALUE) int lastIndex() {
        final var value = __lastIndex;
        if (value == INEXISTANT_INDEX)
            throw new IndexOutOfBoundsException("There were no last index present in the collection", value);
        return value;
    }

    @OnlyGivePositiveValue public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOrNull() {
        if (__isLastIndexOrNullSet)
            return __lastIndexOrNull;

        __isLastIndexOrNullSet = true;
        final var value = __lastIndex;
        return __lastIndexOrNull = value == INEXISTANT_INDEX ? null : value;
    }

    //#endregion -------------------- Last index --------------------

    //#region -------------------- First index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element                                            ) { return FirstIndexOf.firstIndexOf(_array(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from              ) { return FirstIndexOf.firstIndexOf(_array(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from, final int to) { return FirstIndexOf.firstIndexOf(_array(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final @Nullable Integer from, final int to) { return FirstIndexOf.firstIndexOf(_array(), element, from, to); }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element                                            ) { return FirstIndexOfOrNull.firstIndexOfOrNull(_array(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from              ) { return FirstIndexOfOrNull.firstIndexOfOrNull(_array(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(_array(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(_array(), element, from, to); }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element                                            ) { return LastIndexOf.lastIndexOf(_array(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from              ) { return LastIndexOf.lastIndexOf(_array(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from, final int to) { return LastIndexOf.lastIndexOf(_array(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final @Nullable Integer from, final int to) { return LastIndexOf.lastIndexOf(_array(), element, from, to); }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element                                            ) { return LastIndexOfOrNull.lastIndexOfOrNull(_array(), element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from              ) { return LastIndexOfOrNull.lastIndexOfOrNull(_array(), element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int to) { return LastIndexOfOrNull.lastIndexOfOrNull(_array(), element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return LastIndexOfOrNull.lastIndexOfOrNull(_array(), element, from, to); }

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfFirst.indexOfFirst(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate                                            ) { return IndexOfFirst.indexOfFirst(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate                                            ) { return IndexOfFirst.indexOfFirst(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirst.indexOfFirst(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirst.indexOfFirst(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirst.indexOfFirst(_array(), predicate, from, to); }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstOrNull.indexOfFirstOrNull(_array(), predicate, from, to); }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate                                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexed.indexOfFirstIndexed(_array(), predicate, from, to); }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(_array(), predicate, from, to); }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfLast.indexOfLast(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate                                            ) { return IndexOfLast.indexOfLast(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate                                            ) { return IndexOfLast.indexOfLast(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfLast.indexOfLast(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfLast.indexOfLast(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLast.indexOfLast(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLast.indexOfLast(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLast.indexOfLast(_array(), predicate, from, to); }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastOrNull.indexOfLastOrNull(_array(), predicate, from, to); }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate                                            ) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexed.indexOfLastIndexed(_array(), predicate, from, to); }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(_array(), predicate, from, to); }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return All.all(_array(), predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return All.all(_array(), predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return All.all(_array(), predicate); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return Any.any(_array(), predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return Any.any(_array(), predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return Any.any(_array(), predicate); }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return None.none(_array(), predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return None.none(_array(), predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return None.none(_array(), predicate); }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    @Override public boolean hasNull() {
        final var value = __hasNull;
        if (value != null)
            return value;
        return __hasNull = HasNull.hasNull(_array());
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Override public boolean hasNoNulls() { return HasNoNulls.hasNoNulls(_array()); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Override public boolean hasDuplicate() {
        final var value = __hasDuplicate;
        if (value != null)
            return value;
        return __hasDuplicate = HasDuplicate.hasDuplicate(_array());
    }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Override public boolean hasNoDuplicates() { return HasNoDuplicates.hasNoDuplicates(_array()); }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    @Override public boolean has(final T value) { return Has.has(_array(), value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    @Override public boolean hasNot(final T value) { return HasNot.hasNot(_array(), value); }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                            values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                        values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                         values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                         values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                            values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return HasOne.hasOne(_array(), values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                               values) { return HasOne.hasOne(_array(), values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                            values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                        values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                         values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                         values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                            values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return HasNotOne.hasNotOne(_array(), values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                               values) { return HasNotOne.hasNotOne(_array(), values); }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                            values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                        values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                         values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                         values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                            values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                    values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return HasAll.hasAll(_array(), values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                               values) { return HasAll.hasAll(_array(), values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                            values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                        values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                         values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                         values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                            values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                    values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return HasNotAll.hasNotAll(_array(), values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                               values) { return HasNotAll.hasNotAll(_array(), values); }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<@NotNull T> requireNoNulls() {
        if (this.isEmpty())
            return this;
        if (this.hasNull())
            throw new NullPointerException("Forbidden null value. The current collection cannot contains a null value.");
        return this;
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
//    //#region -------------------- Accumulation methods --------------------
//
//    //#region -------------------- Reduce --------------------
//
//    @Override public <R extends @Nullable Object> R reduce(final ObjIntAccumulator<? super T, R> operation) { return Reduce.reduce(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduce(final ObjAccumulator<? super T, R>    operation) { return Reduce.reduce(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduce(final UnaryOperator<R>                operation) { return Reduce.reduce(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduce(final Supplier<? extends R>           operation) { return Reduce.reduce(_array(), operation); }
//
//    //#endregion -------------------- Reduce --------------------
//    //#region -------------------- Reduce or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final ObjIntAccumulator<? super T, R> operation) { return ReduceOrNull.reduceOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final ObjAccumulator<? super T, R>    operation) { return ReduceOrNull.reduceOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final UnaryOperator<R>                operation) { return ReduceOrNull.reduceOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceOrNull(final Supplier<? extends R>           operation) { return ReduceOrNull.reduceOrNull(_array(), operation); }
//
//    //#endregion -------------------- Reduce or null --------------------
//    //#region -------------------- Reduce indexed --------------------
//
//    @Override public <R extends @Nullable Object> R reduceIndexed(final IntObjAccumulator<? super T, R> operation) { return ReduceIndexed.reduceIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final IntAccumulator<R>               operation) { return ReduceIndexed.reduceIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final UnaryOperator<R>                operation) { return ReduceIndexed.reduceIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceIndexed(final Supplier<? extends R>           operation) { return ReduceIndexed.reduceIndexed(_array(), operation); }
//
//    //#endregion -------------------- Reduce indexed --------------------
//    //#region -------------------- Reduce indexed or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final IntObjAccumulator<? super T, R> operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final IntAccumulator<R>               operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final UnaryOperator<R>                operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceIndexedOrNull(final Supplier<? extends R>           operation) { return ReduceIndexedOrNull.reduceIndexedOrNull(_array(), operation); }
//
//    //#endregion -------------------- Reduce indexed or null --------------------
//
//    //#region -------------------- Reduce right --------------------
//
//    @Override public <R extends @Nullable Object> R reduceRight(final ObjIntAccumulator<? super T, R> operation) { return ReduceRight.reduceRight(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final ObjAccumulator<? super T, R>    operation) { return ReduceRight.reduceRight(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final UnaryOperator<R>                operation) { return ReduceRight.reduceRight(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRight(final Supplier<? extends R>           operation) { return ReduceRight.reduceRight(_array(), operation); }
//
//    //#endregion -------------------- Reduce right --------------------
//    //#region -------------------- Reduce right or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final ObjIntAccumulator<? super T, R> operation) { return ReduceRightOrNull.reduceRightOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final ObjAccumulator<? super T, R>    operation) { return ReduceRightOrNull.reduceRightOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final UnaryOperator<R>                operation) { return ReduceRightOrNull.reduceRightOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightOrNull(final Supplier<? extends R>           operation) { return ReduceRightOrNull.reduceRightOrNull(_array(), operation); }
//
//    //#endregion -------------------- Reduce right or null --------------------
//    //#region -------------------- Reduce right indexed --------------------
//
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final IntObjAccumulator<? super T, R> operation) { return ReduceRightIndexed.reduceRightIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final IntAccumulator<R>               operation) { return ReduceRightIndexed.reduceRightIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final UnaryOperator<R>                operation) { return ReduceRightIndexed.reduceRightIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R reduceRightIndexed(final Supplier<? extends R>           operation) { return ReduceRightIndexed.reduceRightIndexed(_array(), operation); }
//
//    //#endregion -------------------- Reduce right indexed --------------------
//    //#region -------------------- Reduce right indexed or null --------------------
//
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final IntObjAccumulator<? super T, R> operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final IntAccumulator<R>               operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final UnaryOperator<R>                operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_array(), operation); }
//    @Override public <R extends @Nullable Object> @Nullable R reduceRightIndexedOrNull(final Supplier<? extends R>           operation) { return ReduceRightIndexedOrNull.reduceRightIndexedOrNull(_array(), operation); }
//
//    //#endregion -------------------- Reduce right indexed or null --------------------
//
//    //#region -------------------- Fold --------------------
//
//    @Override public <R extends @Nullable Object> R fold(final R initial, final ObjIntAccumulator<? super T, R> operation) { return Fold.fold(_array(), operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final ObjAccumulator<? super T, R>    operation) { return Fold.fold(_array(), operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final UnaryOperator<R>                operation) { return Fold.fold(_array(), operation); }
//    @Override public <R extends @Nullable Object> R fold(final R initial, final Supplier<? extends R>           operation) { return Fold.fold(_array(), operation); }
//
//    //#endregion -------------------- Fold --------------------
//    //#region -------------------- Fold indexed --------------------
//
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final IntObjAccumulator<? super T, R> operation) { return FoldIndexed.foldIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final IntAccumulator<R>               operation) { return FoldIndexed.foldIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final UnaryOperator<R>                operation) { return FoldIndexed.foldIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldIndexed(final R initial, final Supplier<? extends R>           operation) { return FoldIndexed.foldIndexed(_array(), operation); }
//
//    //#endregion -------------------- Fold indexed --------------------
//
//    //#region -------------------- Fold right --------------------
//
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final ObjIntAccumulator<? super T, R> operation) { return FoldRight.foldRight(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final ObjAccumulator<? super T, R>    operation) { return FoldRight.foldRight(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final UnaryOperator<R>                operation) { return FoldRight.foldRight(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldRight(final R initial, final Supplier<? extends R>           operation) { return FoldRight.foldRight(_array(), operation); }
//
//    //#endregion -------------------- Fold right --------------------
//    //#region -------------------- Fold right indexed --------------------
//
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final IntObjAccumulator<? super T, R> operation) { return FoldRightIndexed.foldRightIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final IntAccumulator<R>               operation) { return FoldRightIndexed.foldRightIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final UnaryOperator<R>                operation) { return FoldRightIndexed.foldRightIndexed(_array(), operation); }
//    @Override public <R extends @Nullable Object> R foldRightIndexed(final R initial, final Supplier<? extends R>           operation) { return FoldRightIndexed.foldRightIndexed(_array(), operation); }
//
//    //#endregion -------------------- Fold right indexed --------------------
//
//    //#endregion -------------------- Accumulation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return Filter.filter(_array(), predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T>       predicate) { return Filter.filter(_array(), predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier            predicate) { return Filter.filter(_array(), predicate); }

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return FilterIndexed.filterIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate               predicate) { return FilterIndexed.filterIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier            predicate) { return FilterIndexed.filterIndexed(_array(), predicate); }


    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return FilterNot.filterNot(_array(), predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T>       predicate) { return FilterNot.filterNot(_array(), predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier            predicate) { return FilterNot.filterNot(_array(), predicate); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return FilterNotIndexed.filterNotIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate               predicate) { return FilterNotIndexed.filterNotIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier            predicate) { return FilterNotIndexed.filterNotIndexed(_array(), predicate); }


    @Override public CollectionHolder<@NotNull T> filterNotNull() {
        if (isEmpty())
            return EmptyCollectionHolder.getInstance();
        if (hasNull())
            return new GenericCollectionHolder<>(() -> {
                final var array = _array();
                final var size = array.length;
                @SuppressWarnings("unchecked cast") final var tempArray = (T[]) new Object[size];
                var amountOfItemsAdded = -1;
                var index = -1;
                while (++index < size) {
                    final var value = array[index];
                    if (value != null)
                        tempArray[++amountOfItemsAdded] = value;
                }
                return Utility.__reduceTo(tempArray, amountOfItemsAdded + 1);
            });
        return this;
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer>                                  indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Collection<? extends Integer>                                        indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final SequencedCollection<? extends Integer>                               indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return Slice.slice(_array(), indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return Slice.slice(_array(), indices); }

    @Override public CollectionHolder<T> slice(                            ) { return Slice.slice(_array()); }
    @Override public CollectionHolder<T> slice(final int from              ) { return Slice.slice(_array(), from); }
    @Override public CollectionHolder<T> slice(final int from, final int to) { return Slice.slice(_array(), from, to); }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(int n) { return Take.take(_array(), n); }

    @Override public CollectionHolder<T> takeWhile(ObjIntPredicate<? super T> predicate) { return TakeWhile.takeWhile(_array(), predicate); }
    @Override public CollectionHolder<T> takeWhile(Predicate<? super T>       predicate) { return TakeWhile.takeWhile(_array(), predicate); }
    @Override public CollectionHolder<T> takeWhile(BooleanSupplier            predicate) { return TakeWhile.takeWhile(_array(), predicate); }

    @Override public CollectionHolder<T> takeWhileIndexed(IntObjPredicate<? super T> predicate) { return TakeWhileIndexed.takeWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(IntPredicate               predicate) { return TakeWhileIndexed.takeWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(BooleanSupplier            predicate) { return TakeWhileIndexed.takeWhileIndexed(_array(), predicate); }


    @Override public CollectionHolder<T> takeLast(int n) { return TakeLast.takeLast(_array(), n); }

    @Override public CollectionHolder<T> takeLastWhile(ObjIntPredicate<? super T> predicate) { return TakeLastWhile.takeLastWhile(_array(), predicate); }
    @Override public CollectionHolder<T> takeLastWhile(Predicate<? super T>       predicate) { return TakeLastWhile.takeLastWhile(_array(), predicate); }
    @Override public CollectionHolder<T> takeLastWhile(BooleanSupplier            predicate) { return TakeLastWhile.takeLastWhile(_array(), predicate); }

    @Override public CollectionHolder<T> takeLastWhileIndexed(IntObjPredicate<? super T> predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(IntPredicate               predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(BooleanSupplier            predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(_array(), predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(int n) { return Drop.drop(_array(), n); }

    @Override public CollectionHolder<T> dropWhile(ObjIntPredicate<? super T> predicate) { return DropWhile.dropWhile(_array(), predicate); }
    @Override public CollectionHolder<T> dropWhile(Predicate<? super T>       predicate) { return DropWhile.dropWhile(_array(), predicate); }
    @Override public CollectionHolder<T> dropWhile(BooleanSupplier            predicate) { return DropWhile.dropWhile(_array(), predicate); }

    @Override public CollectionHolder<T> dropWhileIndexed(IntObjPredicate<? super T> predicate) { return DropWhileIndexed.dropWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(IntPredicate               predicate) { return DropWhileIndexed.dropWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(BooleanSupplier            predicate) { return DropWhileIndexed.dropWhileIndexed(_array(), predicate); }


    @Override public CollectionHolder<T> dropLast(int n) { return DropLast.dropLast(_array(), n); }

    @Override public CollectionHolder<T> dropLastWhile(ObjIntPredicate<? super T> predicate) { return DropLastWhile.dropLastWhile(_array(), predicate); }
    @Override public CollectionHolder<T> dropLastWhile(Predicate<? super T>       predicate) { return DropLastWhile.dropLastWhile(_array(), predicate); }
    @Override public CollectionHolder<T> dropLastWhile(BooleanSupplier            predicate) { return DropLastWhile.dropLastWhile(_array(), predicate); }

    @Override public CollectionHolder<T> dropLastWhileIndexed(IntObjPredicate<? super T> predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(IntPredicate               predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(_array(), predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(BooleanSupplier            predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(_array(), predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> action) { return joookiwi.collection.java.method.Map.map(_array(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       action) { return joookiwi.collection.java.method.Map.map(_array(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  action) { return joookiwi.collection.java.method.Map.map(_array(), action); }

    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> action) { return MapIndexed.mapIndexed(_array(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               action) { return MapIndexed.mapIndexed(_array(), action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  action) { return MapIndexed.mapIndexed(_array(), action); }


    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends U> transform) { return MapNotNull.mapNotNull(_array(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends U>       transform) { return MapNotNull.mapNotNull(_array(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends U>                  transform) { return MapNotNull.mapNotNull(_array(), transform); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends U> transform) { return MapNotNullIndexed.mapNotNullIndexed(_array(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends U>               transform) { return MapNotNullIndexed.mapNotNullIndexed(_array(), transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends U>                  transform) { return MapNotNullIndexed.mapNotNullIndexed(_array(), transform); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { ForEach.forEach(_array(), action); }
    @Override public void forEach(final Consumer<? super T>       action) { ForEach.forEach(_array(), action); }
    @Override public void forEach(final Runnable                  action) { ForEach.forEach(_array(), action); }

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { ForEachIndexed.forEachIndexed(_array(), action); }
    @Override public void forEachIndexed(final IntConsumer               action) { ForEachIndexed.forEachIndexed(_array(), action); }
    @Override public void forEachIndexed(final Runnable                  action) { ForEachIndexed.forEachIndexed(_array(), action); }

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    @Contract(ALWAYS_THIS_1) @Override public GenericCollectionHolder<T> onEach(final ObjIntConsumer<? super T> action) {
        ForEach.forEach(_array(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public GenericCollectionHolder<T> onEach(final Consumer<? super T> action) {
        ForEach.forEach(_array(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public GenericCollectionHolder<T> onEach(final Runnable action) {
        ForEach.forEach(_array(), action);
        return this;
    }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    @Contract(ALWAYS_THIS_1) @Override public GenericCollectionHolder<T> onEachIndexed(final IntObjConsumer<? super T> action) {
        ForEachIndexed.forEachIndexed(_array(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public GenericCollectionHolder<T> onEachIndexed(final IntConsumer action) {
        ForEachIndexed.forEachIndexed(_array(), action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public GenericCollectionHolder<T> onEachIndexed(final Runnable action) {
        ForEachIndexed.forEachIndexed(_array(), action);
        return this;
    }

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    @Override public CollectionHolder<T> toReverse(                                          ) { return ToReverse.toReverse(_array()); }
    @Override public CollectionHolder<T> toReverse(final int               from              ) { return ToReverse.toReverse(_array(), from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int to) { return ToReverse.toReverse(_array(), from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int to) { return ToReverse.toReverse(_array(), from, to); }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To array --------------------

    @Override public T[] toArray() {
        if (isEmpty())
            return _array();
        return ToArray.toArray(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return ToArray.toArray(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return ToArray.toArray(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return ToArray.toArray(_array(), transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Override public ImmutableCollection<T> toCollection() {
        final var value = __collection;
        if (value != null)
            return value;
        return __collection = super.toCollection();
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToCollection.toCollection(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return ToCollection.toCollection(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return ToCollection.toCollection(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return ToMutableCollection.toMutableCollection(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCollection.toMutableCollection(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return ToMutableCollection.toMutableCollection(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return ToMutableCollection.toMutableCollection(_array(), transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Override public ImmutableSequencedCollection<T> toSequencedCollection() {
        final var value = __sequencedCollection;
        if (value != null)
            return value;
        return __sequencedCollection = super.toSequencedCollection();
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedCollection.toSequencedCollection(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToSequencedCollection.toSequencedCollection(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return ToSequencedCollection.toSequencedCollection(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return ToMutableSequencedCollection.toMutableSequencedCollection(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(_array(), transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Override public ImmutableList<T> toList() {
        final var value = __list;
        if (value != null)
            return value;
        return __list = ToList.toList(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return ToList.toList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return ToList.toList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return ToList.toList(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableList<T> toMutableList(                                                      ) { return ToMutableList.toMutableList(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableList.toMutableList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return ToMutableList.toMutableList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return ToMutableList.toMutableList(_array(), transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Override public ImmutableArrayList<T> toArrayList() {
        final var value = __arrayList;
        if (value != null)
            return value;
        return __arrayList = ToArrayList.toArrayList(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayList.toArrayList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return ToArrayList.toArrayList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return ToArrayList.toArrayList(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                 ) { return ToMutableArrayList.toMutableArrayList(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(final int initialCapacity                                                        ) { return ToMutableArrayList.toMutableArrayList(_array(), initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(_array(), initialCapacity, transform); }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

    @Override public ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList() {
        final var value = __copyOnWriteArrayList;
        if (value != null)
            return value;
        return __copyOnWriteArrayList = ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(_array(), transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Override public ImmutableLinkedList<T> toLinkedList() {
        final var value = __linkedList;
        if (value != null)
            return value;
        return __linkedList = ToLinkedList.toLinkedList(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedList.toLinkedList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return ToLinkedList.toLinkedList(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return ToLinkedList.toLinkedList(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return ToMutableLinkedList.toMutableLinkedList(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedList.toMutableLinkedList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedList.toMutableLinkedList(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return ToMutableLinkedList.toMutableLinkedList(_array(), transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Override public ImmutableVector<T> toVector() {
        final var value = __vector;
        if (value != null)
            return value;
        return __vector = ToVector.toVector(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return ToVector.toVector(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return ToVector.toVector(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return ToVector.toVector(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableVector<T> toMutableVector(                                                                                 ) { return ToMutableVector.toMutableVector(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableVector<T> toMutableVector(final int initialCapacity                                                        ) { return ToMutableVector.toMutableVector(_array(), initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(_array(), initialCapacity, transform); }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

    @Override public ImmutableSet<T> toSet() {
        final var value = __set;
        if (value != null)
            return value;
        return __set = ToSet.toSet(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSet.toSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return ToSet.toSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return ToSet.toSet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return ToMutableSet.toMutableSet(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSet.toMutableSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return ToMutableSet.toMutableSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return ToMutableSet.toMutableSet(_array(), transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Override public ImmutableSequencedSet<T> toSequencedSet() {
        final var value = __sequencedSet;
        if (value != null)
            return value;
        return __sequencedSet = ToSequencedSet.toSequencedSet(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedSet.toSequencedSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return ToSequencedSet.toSequencedSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return ToSequencedSet.toSequencedSet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return ToMutableSequencedSet.toMutableSequencedSet(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedSet.toMutableSequencedSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return ToMutableSequencedSet.toMutableSequencedSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedSet.toMutableSequencedSet(_array(), transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Override public ImmutableSortedSet<T> toSortedSet() {
        final var value = __sortedSet;
        if (value != null)
            return value;
        return __sortedSet = ToSortedSet.toSortedSet(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSortedSet.toSortedSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return ToSortedSet.toSortedSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return ToSortedSet.toSortedSet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return ToMutableSortedSet.toMutableSortedSet(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSortedSet.toMutableSortedSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return ToMutableSortedSet.toMutableSortedSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSortedSet.toMutableSortedSet(_array(), transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Override public ImmutableNavigableSet<T> toNavigableSet() {
        final var value = __navigableSet;
        if (value != null)
            return value;
        return __navigableSet = ToNavigableSet.toNavigableSet(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToNavigableSet.toNavigableSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return ToNavigableSet.toNavigableSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return ToNavigableSet.toNavigableSet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return ToMutableNavigableSet.toMutableNavigableSet(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableNavigableSet.toMutableNavigableSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return ToMutableNavigableSet.toMutableNavigableSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return ToMutableNavigableSet.toMutableNavigableSet(_array(), transform); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_array(), transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_array(), transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(_array(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(_array(), comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(_array(), transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(_array(), clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(_array(), clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(_array(), clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Override public ImmutableHashSet<T> toHashSet() {
        final var value = __hashSet;
        if (value != null)
            return value;
        return __hashSet = ToHashSet.toHashSet(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(_array(),             transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(_array(),             transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(_array(),             transform); }
    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(final float loadFactor                                                        ) { return ToHashSet.toHashSet(_array(), loadFactor); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(_array(), loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(_array(), loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(_array(), loadFactor, transform); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(                                                      ) { return ToMutableHashSet.toMutableHashSet(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(_array(), transform); }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Override public ImmutableLinkedHashSet<T> toLinkedHashSet() {
        final var value = __linkedHashSet;
        if (value != null)
            return value;
        return __linkedHashSet = ToLinkedHashSet.toLinkedHashSet(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedHashSet.toLinkedHashSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return ToLinkedHashSet.toLinkedHashSet(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToLinkedHashSet.toLinkedHashSet(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(_array(), transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(_array(), transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(_array(), transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return ToTreeSet.toTreeSet(_array(), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(_array(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return ToMutableTreeSet.toMutableTreeSet(_array(), comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(_array(), comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Override public ImmutableQueue<T> toQueue() {
        final var value = __queue;
        if (value != null)
            return value;
        return __queue = ToQueue.toQueue(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToQueue.toQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return ToQueue.toQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return ToQueue.toQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return ToMutableQueue.toMutableQueue(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableQueue.toMutableQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return ToMutableQueue.toMutableQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return ToMutableQueue.toMutableQueue(_array(), transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingQueue.toBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToBlockingQueue.toBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return ToBlockingQueue.toBlockingQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(_array(), transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToTransferQueue.toTransferQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return ToTransferQueue.toTransferQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return ToTransferQueue.toTransferQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTransferQueue.toMutableTransferQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableTransferQueue.toMutableTransferQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableTransferQueue.toMutableTransferQueue(_array(), transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(_array(), isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(_array(), transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToDelayQueue.toDelayQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return ToDelayQueue.toDelayQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return ToDelayQueue.toDelayQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDelayQueue.toMutableDelayQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return ToMutableDelayQueue.toMutableDelayQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return ToMutableDelayQueue.toMutableDelayQueue(_array(), transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(_array(), capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(_array(), transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_array(), comparator, transform); }
    @Contract(pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_array(), comparator, transform); }
    @Contract(pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(_array(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(_array(), initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(_array(), comparator, transform); }
    @Contract(pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(_array(), comparator, transform); }
    @Contract(pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(_array(), comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(_array(), initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToSynchronousQueue.toSynchronousQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return ToSynchronousQueue.toSynchronousQueue(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return ToSynchronousQueue.toSynchronousQueue(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_array(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_array(), isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(_array(), isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Override public ImmutableDeque<T> toDeque() {
        final var value = __deque;
        if (value != null)
            return value;
        return __deque = ToDeque.toDeque(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToDeque.toDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return ToDeque.toDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return ToDeque.toDeque(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return ToMutableDeque.toMutableDeque(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDeque.toMutableDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return ToMutableDeque.toMutableDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return ToMutableDeque.toMutableDeque(_array(), transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingDeque.toBlockingDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToBlockingDeque.toBlockingDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return ToBlockingDeque.toBlockingDeque(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(_array(), transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayDeque.toArrayDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return ToArrayDeque.toArrayDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return ToArrayDeque.toArrayDeque(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayDeque.toMutableArrayDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Function<? super T, ? extends U>       transform) { return ToMutableArrayDeque.toMutableArrayDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Supplier<? extends U>                  transform) { return ToMutableArrayDeque.toMutableArrayDeque(_array(), transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(_array(), transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(_array(), transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(_array(), transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_array(), transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_array(), capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(_array(), capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Override public ImmutableStack<T> toStack() {
        final var value = __stack;
        if (value != null)
            return value;
        return __stack = ToStack.toStack(_array());
    }

    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToStack.toStack(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return ToStack.toStack(_array(), transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return ToStack.toStack(_array(), transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableStack<T> toMutableStack(                                                      ) { return ToMutableStack.toMutableStack(_array()); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableStack.toMutableStack(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return ToMutableStack.toMutableStack(_array(), transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return ToMutableStack.toMutableStack(_array(), transform); }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    @Override public @Unmodifiable Map<Integer, T> toMap() {
        final var value = __map;
        if (value != null)
            return value;
        return __map = ToMap.toMap(_array());
    }

    //#endregion -------------------- To map --------------------
//    //#region -------------------- To sequenced map --------------------
//
//    @Override public @Unmodifiable SequencedMap<Integer, T> toSequencedMap() {
//        final var value = __sequencedMap;
//        if (value != null)
//            return value;
//        return __sequencedMap = ToSequencedMap.toSequencedMap(_array());
//    }
//
//    //#endregion -------------------- To sequenced map --------------------
//    //#region -------------------- To sorted map --------------------
//
//    @Override public @Unmodifiable SortedMap<Integer, T> toSortedMap() {
//        final var value = __sortedMap;
//        if (value != null)
//            return value;
//        return __sortedMap = ToSortedMap.toSortedMap(_array());
//    }
//
//    //#endregion -------------------- To sorted map --------------------
//    //#region -------------------- To navigable map --------------------
//
//    @Override public @Unmodifiable NavigableMap<Integer, T> toNavigableMap() {
//        final var value = __navigableMap;
//        if (value != null)
//            return value;
//        return __navigableMap = ToNavigableMap.toNavigableMap(_array());
//    }
//
//    //#endregion -------------------- To navigable map --------------------
//    //#region -------------------- To concurrent map --------------------
//
//    @Override public @Unmodifiable ConcurrentMap<Integer, T> toConcurrentMap() {
//        final var value = __concurrentMap;
//        if (value != null)
//            return value;
//        return __concurrentMap = ToConcurrentMap.toConcurrentMap(_array());
//    }
//
//    //#endregion -------------------- To concurrent map --------------------
//    //#region -------------------- To concurrent navigable map --------------------
//
//    @Override public @Unmodifiable ConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() {
//        final var value = __concurrentNavigableMap;
//        if (value != null)
//            return value;
//        return __concurrentNavigableMap = ToConcurrentNavigableMap.toConcurrentNavigableMap(_array());
//    }
//
//    //#endregion -------------------- To concurrent navigable map --------------------
//
//    //#region -------------------- To concurrent hash map --------------------
//
//    @Override public @Unmodifiable ConcurrentHashMap<Integer, T> toConcurrentHashMap() {
//        final var value = __concurrentHashMap;
//        if (value != null)
//            return value;
//        return __concurrentHashMap = ToConcurrentHashMap.toConcurrentHashMap(_array());
//    }
//
//    //#endregion -------------------- To concurrent hash map --------------------
//    //#region -------------------- To concurrent skip list map --------------------
//
//    @Override public @Unmodifiable ConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() {
//        final var value = __concurrentSkipListMap;
//        if (value != null)
//            return value;
//        return __concurrentSkipListMap = ToConcurrentSkipListMap.toConcurrentSkipListMap(_array());
//    }
//
//    //#endregion -------------------- To concurrent skip list map --------------------
//    //#region -------------------- To enum map --------------------
//
//    //#endregion -------------------- To enum map --------------------
//    //#region -------------------- To hash map --------------------
//
//    @Override public @Unmodifiable HashMap<Integer, T> toHashMap() {
//        final var value = __hashMap;
//        if (value != null)
//            return value;
//        return __hashMap = ToHashMap.toHashMap(_array());
//    }
//
//    //#endregion -------------------- To hash map --------------------
//    //#region -------------------- To hashtable --------------------
//
//    @Override public @Unmodifiable Hashtable<Integer, T> toHashtable() {
//        final var value = __hashtable;
//        if (value != null)
//            return value;
//        return __hashtable = ToHashtable.toHashtable();
//    }
//
//    //#endregion -------------------- To hashtable --------------------
//    //#region -------------------- To identity hash map --------------------
//
//    @Override public @Unmodifiable IdentityHashMap<Integer, T> toIdentityHashMap() {
//        final var value = __identityHashMap;
//        if (value != null)
//            return value;
//        return __identityHashMap = ToIdentityHashMap.toIdentityHashMap(_array());
//    }
//
//    //#endregion -------------------- To identity hash map --------------------
//    //#region -------------------- To linked hash map --------------------
//
//    @Override public @Unmodifiable LinkedHashMap<Integer, T> toLinkedHashMap() {
//        final var value = __linkedHashMap;
//        if (value != null)
//            return value;
//        return __linkedHashMap = ToLinkedHashMap.toLinkedHashMap(_array());
//    }
//
//    //#endregion -------------------- To linked hash map --------------------
//    //#region -------------------- To tree map --------------------
//
//    @Override public @Unmodifiable TreeMap<Integer, T> toTreeMap() {
//        final var value = __treeMap;
//        if (value != null)
//            return value;
//        return __treeMap = ToTreeMap.toTreeMap(_array());
//    }
//
//    //#endregion -------------------- To tree map --------------------
//    //#region -------------------- To weak hash map --------------------
//
//    @Override public @Unmodifiable WeakHashMap<Integer, T> toWeakHashMap() {
//        final var value = __weakHashMap;
//        if (value != null)
//            return value;
//        return __weakHashMap = ToWeakHashMap.toWeakHashMap(_array());
//    }
//
//    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return ToString.toString(_array()); }

    @Override public String toLocaleString(                             ) { return ToLocaleString.toLocaleString(_array()); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return ToLocaleString.toLocaleString(_array(), locale); }

    @Override public String toLowerCaseString() { return ToLowerCaseString.toLowerCaseString(_array()); }

    @Override public String toLocaleLowerCaseString(                             ) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(_array()); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(_array(), locale); }

    @Override public String toUpperCaseString() { return ToUpperCaseString.toUpperCaseString(_array()); }

    @Override public String toLocaleUpperCaseString(                             ) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(_array()); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(_array(), locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix                                                                                                                              ) { return JoinToString.joinToString(_array(), separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated                                                             ) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Function<? super T, String>       transform) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String>       transform) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Supplier<String>                  transform) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String>                  transform) { return JoinToString.joinToString(_array(), separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override public int hashCode() {
        final var value = __hashCode;
        if (value != null)
            return value;
        return __hashCode = HashCodeCreator.getInstance().newHashCode(_array());
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public GenericCollectionHolder<T> clone() { return (GenericCollectionHolder<T>) super.clone(); }

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public GenericCollectionHolder<T> shallowClone() { return clone(); }
//    @Override public GenericCollectionHolder<T> shallowClone() { return new GenericCollectionHolder<>(this); }


    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public GenericCollectionHolder<T> deepClone() {
        return clone();
//        final var cloneInvokator = CloneInvokator.getInstance();
//        final var values = _array();
//        final var size = values.length;
//        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
//
//        var index = -1;
//        while (++index < size)
//            newArray[index] = cloneInvokator.cloneIfCloneable(values[index]);
//
//        return new GenericCollectionHolder<>(newArray);
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
