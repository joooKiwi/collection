package instance;

import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PrimitiveIterator;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
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
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
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
import joookiwi.collection.java.method.FilterNot;
import joookiwi.collection.java.method.FilterNotIndexed;
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
import joookiwi.collection.java.method.HasAll;
import joookiwi.collection.java.method.HasDuplicate;
import joookiwi.collection.java.method.HasNoDuplicates;
import joookiwi.collection.java.method.HasNoNulls;
import joookiwi.collection.java.method.HasNot;
import joookiwi.collection.java.method.HasNotAll;
import joookiwi.collection.java.method.HasNotOne;
import joookiwi.collection.java.method.HasNull;
import joookiwi.collection.java.method.HasOne;
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
import joookiwi.collection.java.method.JoinToString;
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
import joookiwi.collection.java.method.ToSpliterator;
import joookiwi.collection.java.method.ToStack;
import joookiwi.collection.java.method.ToString;
import joookiwi.collection.java.method.ToSynchronousQueue;
import joookiwi.collection.java.method.ToTransferQueue;
import joookiwi.collection.java.method.ToTreeSet;
import joookiwi.collection.java.method.ToUpperCaseString;
import joookiwi.collection.java.method.ToVector;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static org.junit.jupiter.api.Assertions.fail;

/// A class to exclusively test the extension methods for a [CollectionHolder]
///
/// @param <T> The type
@NotNullByDefault
public final class CollectionHolder_FromArrayExtensionFunction<T extends @Nullable Object>
        extends AbstractCollectionHolderForTest<T, CollectionHolder_FromArrayExtensionFunction<T>> {

    /// Tell that the instance is **not** of the type `null`
    public static final boolean IS_NULL = false;
    /// Tell that the instance is **not** of the type [MinimalistCollectionHolder] directly
    public static final boolean IS_MINIMALIST = false;
    /// Tell that the instance is based on the extension methods directly
    public static final boolean IS_EXTENSION = true;
    /// Tell that the instance is a **not** viewer instance
    public static final boolean IS_VIEWER = false;
    /// The simplified named to be used in the test “ParameterizedTest” or “ParameterizedClass”
    public static final String SIMPLIFIED_NAME = "array extension";

    /// The array received in the constructor
    public final T @Unmodifiable [] array;

    public CollectionHolder_FromArrayExtensionFunction(final T @Unmodifiable [] array) {
        super();
        this.array = array;
    }

    //#region -------------------- Test utility methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public int getAmountOfCall() {
        fail("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.");
        throw new RuntimeException("Assertions.fail was expected to throw an exception on “getAmountOfCall” call.");
    }

    //#endregion -------------------- Test utility methods --------------------
    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return array.length; }
    @Override public boolean isEmpty() { return IsEmpty.isEmpty(array); }
    @Override public boolean isNotEmpty() { return IsNotEmpty.isNotEmpty(array); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(final int index) {
        fail("The method “get” was not expected to be called directly.");
        throw new RuntimeException("Assertions.fail was expected to throw an exception on “get” call.");
    }

    @Override public T getFirst() { return GetFirst.getFirst(array); }
    @Override public T getLast() { return GetLast.getLast(array); }

    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return GetOrElse.getOrElse(array, index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return GetOrElse.getOrElse(array, index, defaultValue); }
    @Override public T getFirstOrElse(final Supplier<? extends T> defaultValue) { return GetFirstOrElse.getFirstOrElse(array, defaultValue); }
    @Override public T getLastOrElse(final Supplier<? extends T> defaultValue) { return GetLastOrElse.getLastOrElse(array, defaultValue); }

    @Override public @Nullable T getOrNull(final int index) { return GetOrNull.getOrNull(array, index); }
    @Override public @Nullable T getFirstOrNull() { return GetFirstOrNull.getFirstOrNull(array); }
    @Override public @Nullable T getLastOrNull() { return GetLastOrNull.getLastOrNull(array); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(array, predicate); }
    @Override public T findFirst(final Predicate<? super T>       predicate) { return FindFirst.findFirst(array, predicate); }
    @Override public T findFirst(final BooleanSupplier            predicate) { return FindFirst.findFirst(array, predicate); }

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return FindFirstOrNull.findFirstOrNull(array, predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return FindFirstOrNull.findFirstOrNull(array, predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return FindFirstOrNull.findFirstOrNull(array, predicate); }

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return FindFirstIndexed.findFirstIndexed(array, predicate); }
    @Override public T findFirstIndexed(final IntPredicate               predicate) { return FindFirstIndexed.findFirstIndexed(array, predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return FindFirstIndexed.findFirstIndexed(array, predicate); }

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(array, predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(array, predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return FindFirstIndexedOrNull.findFirstIndexedOrNull(array, predicate); }


    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return FindLast.findLast(array, predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return FindLast.findLast(array, predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return FindLast.findLast(array, predicate); }

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return FindLastOrNull.findLastOrNull(array, predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return FindLastOrNull.findLastOrNull(array, predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return FindLastOrNull.findLastOrNull(array, predicate); }

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return FindLastIndexed.findLastIndexed(array, predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return FindLastIndexed.findLastIndexed(array, predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return FindLastIndexed.findLastIndexed(array, predicate); }

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(array, predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(array, predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return FindLastIndexedOrNull.findLastIndexedOrNull(array, predicate); }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    @Override public int firstIndexOf(final T element                                                          ) { return FirstIndexOf.firstIndexOf(array, element); }
    @Override public int firstIndexOf(final T element, final int               from                            ) { return FirstIndexOf.firstIndexOf(array, element, from); }
    @Override public int firstIndexOf(final T element, final @Nullable Integer from                            ) { return FirstIndexOf.firstIndexOf(array, element, from); }
    @Override public int firstIndexOf(final T element, final int               from, final int               to) { return FirstIndexOf.firstIndexOf(array, element, from, to); }
    @Override public int firstIndexOf(final T element, final int               from, final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(array, element, from, to); }
    @Override public int firstIndexOf(final T element, final @Nullable Integer from, final int               to) { return FirstIndexOf.firstIndexOf(array, element, from, to); }
    @Override public int firstIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return FirstIndexOf.firstIndexOf(array, element, from, to); }

    @Override public @Nullable Integer firstIndexOfOrNull(final T element                                                          ) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final int               from                            ) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element, from); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from                            ) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element, from); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int               to) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element, from, to); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element, from, to); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element, from, to); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(array, element, from, to); }


    @Override public int lastIndexOf(final T element                                                          ) { return LastIndexOf.lastIndexOf(array, element); }
    @Override public int lastIndexOf(final T element, final int               from                            ) { return LastIndexOf.lastIndexOf(array, element, from); }
    @Override public int lastIndexOf(final T element, final @Nullable Integer from                            ) { return LastIndexOf.lastIndexOf(array, element, from); }
    @Override public int lastIndexOf(final T element, final int               from, final int               to) { return LastIndexOf.lastIndexOf(array, element, from, to); }
    @Override public int lastIndexOf(final T element, final int               from, final @Nullable Integer to) { return LastIndexOf.lastIndexOf(array, element, from, to); }
    @Override public int lastIndexOf(final T element, final @Nullable Integer from, final int               to) { return LastIndexOf.lastIndexOf(array, element, from, to); }
    @Override public int lastIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return LastIndexOf.lastIndexOf(array, element, from, to); }

    @Override public @Nullable Integer lastIndexOfOrNull(final T element                                                          ) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final int               from                            ) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element, from); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from                            ) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element, from); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int               to) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element, from, to); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element, from, to); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element, from, to); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return LastIndexOfOrNull.lastIndexOfOrNull(array, element, from, to); }


    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate                                                          ) { return IndexOfFirst.indexOfFirst(array, predicate); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate                                                          ) { return IndexOfFirst.indexOfFirst(array, predicate); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate                                                          ) { return IndexOfFirst.indexOfFirst(array, predicate); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return IndexOfFirst.indexOfFirst(array, predicate, from); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfFirst.indexOfFirst(array, predicate, from); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final int               from                            ) { return IndexOfFirst.indexOfFirst(array, predicate, from); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return IndexOfFirst.indexOfFirst(array, predicate, from); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfFirst.indexOfFirst(array, predicate, from); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfFirst.indexOfFirst(array, predicate, from); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int               to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirst.indexOfFirst(array, predicate, from, to); }

    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                                          ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                                          ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstOrNull.indexOfFirstOrNull(array, predicate, from, to); }

    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate                                                          ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate                                                          ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final int               from                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int               to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstIndexed.indexOfFirstIndexed(array, predicate, from, to); }

    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                                          ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfFirstIndexedOrNull.indexOfFirstIndexedOrNull(array, predicate, from, to); }


    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate                                                          ) { return IndexOfLast.indexOfLast(array, predicate); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate                                                          ) { return IndexOfLast.indexOfLast(array, predicate); }
    @Override public int indexOfLast(final BooleanSupplier            predicate                                                          ) { return IndexOfLast.indexOfLast(array, predicate); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return IndexOfLast.indexOfLast(array, predicate, from); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfLast.indexOfLast(array, predicate, from); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final int               from                            ) { return IndexOfLast.indexOfLast(array, predicate, from); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return IndexOfLast.indexOfLast(array, predicate, from); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfLast.indexOfLast(array, predicate, from); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfLast.indexOfLast(array, predicate, from); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int               to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLast.indexOfLast(array, predicate, from, to); }

    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                                          ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                                          ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastOrNull.indexOfLastOrNull(array, predicate, from, to); }

    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate                                                          ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate                                                          ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final int               from                            ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int               to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastIndexed.indexOfLastIndexed(array, predicate, from, to); }

    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                                          ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return IndexOfLastIndexedOrNull.indexOfLastIndexedOrNull(array, predicate, from, to); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return All.all(array, predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return All.all(array, predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return All.all(array, predicate); }

    @Override public boolean any(                                                    ) { return Any.any(array); }
    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return Any.any(array, predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return Any.any(array, predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return Any.any(array, predicate); }

    @Override public boolean none(                                                    ) { return None.none(array); }
    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return None.none(array, predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return None.none(array, predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return None.none(array, predicate); }


    @Override public boolean hasNull() { return HasNull.hasNull(array); }

    @Override public boolean hasNoNulls() { return HasNoNulls.hasNoNulls(array); }


    @Override public boolean hasDuplicate() { return HasDuplicate.hasDuplicate(array); }

    @Override public boolean hasNoDuplicates() { return HasNoDuplicates.hasNoDuplicates(array); }


    @Override public boolean has(final T value) { return Has.has(array, value); }

    @Override public boolean hasNot(final T value) { return HasNot.hasNot(array, value); }


    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                            values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                        values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                         values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                         values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                            values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasOne.hasOne(array, values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                               values) { return HasOne.hasOne(array, values); }

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                            values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                        values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                         values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                         values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                            values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasNotOne.hasNotOne(array, values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                               values) { return HasNotOne.hasNotOne(array, values); }


    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                            values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                        values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                         values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                         values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                            values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                    values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasAll.hasAll(array, values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                               values) { return HasAll.hasAll(array, values); }

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                            values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                        values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                         values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                         values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                            values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                    values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return HasNotAll.hasNotAll(array, values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                               values) { return HasNotAll.hasNotAll(array, values); }


    @Override public CollectionHolder<@NotNull T> requireNoNulls() {
        final var array = this.array;
        if (RequireNoNulls.requireNoNulls(array) == array)
            return this;
        fail("The method “requireNoNulls” was not expected to be non-empty.");
        throw new RuntimeException("Assertions.fail was expected to throw an exception on “requireNoNulls” failing call.");
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return Filter.filter(array, predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T>       predicate) { return Filter.filter(array, predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier            predicate) { return Filter.filter(array, predicate); }

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return FilterIndexed.filterIndexed(array, predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate               predicate) { return FilterIndexed.filterIndexed(array, predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier            predicate) { return FilterIndexed.filterIndexed(array, predicate); }

    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return FilterNot.filterNot(array, predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T>       predicate) { return FilterNot.filterNot(array, predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier            predicate) { return FilterNot.filterNot(array, predicate); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return FilterNotIndexed.filterNotIndexed(array, predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate               predicate) { return FilterNotIndexed.filterNotIndexed(array, predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier            predicate) { return FilterNotIndexed.filterNotIndexed(array, predicate); }


    @Override public CollectionHolder<@NotNull T> filterNotNull() { return FilterNotNull.filterNotNull(array); }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(                                                        ) { return Slice.slice(array); }
    @Override public CollectionHolder<T> slice(final int               from                            ) { return Slice.slice(array, from); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from                            ) { return Slice.slice(array, from); }
    @Override public CollectionHolder<T> slice(final int               from, final int               to) { return Slice.slice(array, from, to); }
    @Override public CollectionHolder<T> slice(final int               from, final @Nullable Integer to) { return Slice.slice(array, from, to); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from, final int               to) { return Slice.slice(array, from, to); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from, final @Nullable Integer to) { return Slice.slice(array, from, to); }

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer>                                  indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Collection<? extends Integer>                          indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedCollection<? extends Integer>                 indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return Slice.slice(array, indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return Slice.slice(array, indices); }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(final int     n) { return Take.take(array, n); }
    @Override public CollectionHolder<T> take(final Integer n) { return Take.take(array, n); }

    @Override public CollectionHolder<T> takeWhile(final ObjIntPredicate<? super T> predicate) { return TakeWhile.takeWhile(array, predicate); }
    @Override public CollectionHolder<T> takeWhile(final Predicate<? super T>       predicate) { return TakeWhile.takeWhile(array, predicate); }
    @Override public CollectionHolder<T> takeWhile(final BooleanSupplier            predicate) { return TakeWhile.takeWhile(array, predicate); }

    @Override public CollectionHolder<T> takeWhileIndexed(final IntObjPredicate<? super T> predicate) { return TakeWhileIndexed.takeWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(final IntPredicate               predicate) { return TakeWhileIndexed.takeWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(final BooleanSupplier            predicate) { return TakeWhileIndexed.takeWhileIndexed(array, predicate); }


    @Override public CollectionHolder<T> takeLast(final int     n) { return TakeLast.takeLast(array, n); }
    @Override public CollectionHolder<T> takeLast(final Integer n) { return TakeLast.takeLast(array, n); }


    @Override public CollectionHolder<T> takeLastWhile(final ObjIntPredicate<? super T> predicate) { return TakeLastWhile.takeLastWhile(array, predicate); }
    @Override public CollectionHolder<T> takeLastWhile(final Predicate<? super T>       predicate) { return TakeLastWhile.takeLastWhile(array, predicate); }
    @Override public CollectionHolder<T> takeLastWhile(final BooleanSupplier            predicate) { return TakeLastWhile.takeLastWhile(array, predicate); }

    @Override public CollectionHolder<T> takeLastWhileIndexed(final IntObjPredicate<? super T> predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(final IntPredicate               predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(final BooleanSupplier            predicate) { return TakeLastWhileIndexed.takeLastWhileIndexed(array, predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(final int     n) { return Drop.drop(array, n); }
    @Override public CollectionHolder<T> drop(final Integer n) { return Drop.drop(array, n); }

    @Override public CollectionHolder<T> dropWhile(final ObjIntPredicate<? super T> predicate) { return DropWhile.dropWhile(array, predicate); }
    @Override public CollectionHolder<T> dropWhile(final Predicate<? super T>       predicate) { return DropWhile.dropWhile(array, predicate); }
    @Override public CollectionHolder<T> dropWhile(final BooleanSupplier            predicate) { return DropWhile.dropWhile(array, predicate); }

    @Override public CollectionHolder<T> dropWhileIndexed(final IntObjPredicate<? super T> predicate) { return DropWhileIndexed.dropWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(final IntPredicate               predicate) { return DropWhileIndexed.dropWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(final BooleanSupplier            predicate) { return DropWhileIndexed.dropWhileIndexed(array, predicate); }


    @Override public CollectionHolder<T> dropLast(final int     n) { return DropLast.dropLast(array, n); }
    @Override public CollectionHolder<T> dropLast(final Integer n) { return DropLast.dropLast(array, n); }


    @Override public CollectionHolder<T> dropLastWhile(final ObjIntPredicate<? super T> predicate) { return DropLastWhile.dropLastWhile(array, predicate); }
    @Override public CollectionHolder<T> dropLastWhile(final Predicate<? super T>       predicate) { return DropLastWhile.dropLastWhile(array, predicate); }
    @Override public CollectionHolder<T> dropLastWhile(final BooleanSupplier            predicate) { return DropLastWhile.dropLastWhile(array, predicate); }

    @Override public CollectionHolder<T> dropLastWhileIndexed(final IntObjPredicate<? super T> predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(final IntPredicate               predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(array, predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(final BooleanSupplier            predicate) { return DropLastWhileIndexed.dropLastWhileIndexed(array, predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> transform) { return joookiwi.collection.java.method.Map.map(array, transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       transform) { return joookiwi.collection.java.method.Map.map(array, transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  transform) { return joookiwi.collection.java.method.Map.map(array, transform); }

    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> transform) { return MapIndexed.mapIndexed(array, transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               transform) { return MapIndexed.mapIndexed(array, transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  transform) { return MapIndexed.mapIndexed(array, transform); }


    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends @Nullable U> transform) { return MapNotNull.mapNotNull(array, transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends @Nullable U>       transform) { return MapNotNull.mapNotNull(array, transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends @Nullable U>                  transform) { return MapNotNull.mapNotNull(array, transform); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends @Nullable U> transform) { return MapNotNullIndexed.mapNotNullIndexed(array, transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends @Nullable U>               transform) { return MapNotNullIndexed.mapNotNullIndexed(array, transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends @Nullable U>                  transform) { return MapNotNullIndexed.mapNotNullIndexed(array, transform); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { ForEach.forEach(array, action); }
    @Override public void forEach(final Consumer<? super T>       action) { ForEach.forEach(array, action); }
    @Override public void forEach(final Runnable                  action) { ForEach.forEach(array, action); }

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { ForEachIndexed.forEachIndexed(array, action); }
    @Override public void forEachIndexed(final IntConsumer               action) { ForEachIndexed.forEachIndexed(array, action); }
    @Override public void forEachIndexed(final Runnable                  action) { ForEachIndexed.forEachIndexed(array, action); }


    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_FromArrayExtensionFunction<T> onEach(final ObjIntConsumer<? super T> action) {
        OnEach.onEach(array, action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_FromArrayExtensionFunction<T> onEach(final Consumer<? super T> action) {
        OnEach.onEach(array, action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_FromArrayExtensionFunction<T> onEach(final Runnable action) {
        OnEach.onEach(array, action);
        return this;
    }


    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_FromArrayExtensionFunction<T> onEachIndexed(final IntObjConsumer<? super T> action) {
        OnEachIndexed.onEachIndexed(array, action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_FromArrayExtensionFunction<T> onEachIndexed(final IntConsumer action) {
        OnEachIndexed.onEachIndexed(array, action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_FromArrayExtensionFunction<T> onEachIndexed(final Runnable action) {
        OnEachIndexed.onEachIndexed(array, action);
        return this;
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    @Override public CollectionHolder<T> toReverse(                                                        ) { return ToReverse.toReverse(array); }
    @Override public CollectionHolder<T> toReverse(final int               from                            ) { return ToReverse.toReverse(array, from); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from                            ) { return ToReverse.toReverse(array, from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int               to) { return ToReverse.toReverse(array, from, to); }
    @Override public CollectionHolder<T> toReverse(final int               from, final @Nullable Integer to) { return ToReverse.toReverse(array, from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int               to) { return ToReverse.toReverse(array, from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final @Nullable Integer to) { return ToReverse.toReverse(array, from, to); }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    @Override public CollectionIterator<T> toIterator() { return ToIterator.toIterator(array); }

    @Override public Spliterator<T> toSpliterator() { return ToSpliterator.toSpliterator(array); }

    //#endregion -------------------- To iterator --------------------

    //#region -------------------- To array --------------------

    @Override public                              T[] toArray(                                                      ) { return ToArray.toArray(array); }
    @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return ToArray.toArray(array, transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return ToArray.toArray(array, transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return ToArray.toArray(array, transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Override public                              ImmutableCollection<T> toCollection(                                                      ) { return ToCollection.toCollection(array); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToCollection.toCollection(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return ToCollection.toCollection(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return ToCollection.toCollection(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return ToMutableCollection.toMutableCollection(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCollection.toMutableCollection(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return ToMutableCollection.toMutableCollection(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return ToMutableCollection.toMutableCollection(array, transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Override public                              ImmutableSequencedCollection<T> toSequencedCollection(                                                      ) { return ToSequencedCollection.toSequencedCollection(array); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedCollection.toSequencedCollection(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToSequencedCollection.toSequencedCollection(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return ToSequencedCollection.toSequencedCollection(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return ToMutableSequencedCollection.toMutableSequencedCollection(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return ToMutableSequencedCollection.toMutableSequencedCollection(array, transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Override public                              ImmutableList<T> toList(                                                      ) { return ToList.toList(array); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return ToList.toList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return ToList.toList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return ToList.toList(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableList<T> toMutableList(                                                      ) { return ToMutableList.toMutableList(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableList.toMutableList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return ToMutableList.toMutableList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return ToMutableList.toMutableList(array, transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Override public                              ImmutableArrayList<T> toArrayList(                                                      ) { return ToArrayList.toArrayList(array); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayList.toArrayList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return ToArrayList.toArrayList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return ToArrayList.toArrayList(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                               ) { return ToMutableArrayList.toMutableArrayList(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableArrayList<T> toMutableArrayList(final int               initialCapacity                                                        ) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableArrayList<T> toMutableArrayList(final @Nullable Integer initialCapacity                                                        ) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayList.toMutableArrayList(array, initialCapacity, transform); }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

    @Override public                              ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList(                                                      ) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(array); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArrayList.toCopyOnWriteArrayList(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArrayList.toMutableCopyOnWriteArrayList(array, transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Override public                              ImmutableLinkedList<T> toLinkedList(                                                      ) { return ToLinkedList.toLinkedList(array); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedList.toLinkedList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return ToLinkedList.toLinkedList(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return ToLinkedList.toLinkedList(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return ToMutableLinkedList.toMutableLinkedList(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedList.toMutableLinkedList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedList.toMutableLinkedList(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return ToMutableLinkedList.toMutableLinkedList(array, transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Override public                              ImmutableVector<T> toVector(                                                      ) { return ToVector.toVector(array); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return ToVector.toVector(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return ToVector.toVector(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return ToVector.toVector(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableVector<T> toMutableVector(                                                                                               ) { return ToMutableVector.toMutableVector(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableVector<T> toMutableVector(final int               initialCapacity                                                        ) { return ToMutableVector.toMutableVector(array, initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableVector<T> toMutableVector(final @Nullable Integer initialCapacity                                                        ) { return ToMutableVector.toMutableVector(array, initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableVector.toMutableVector(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableVector.toMutableVector(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableVector.toMutableVector(array, initialCapacity, transform); }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

    @Override public                              ImmutableSet<T> toSet(                                                      ) { return ToSet.toSet(array); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSet.toSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return ToSet.toSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return ToSet.toSet(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return ToMutableSet.toMutableSet(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSet.toMutableSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return ToMutableSet.toMutableSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return ToMutableSet.toMutableSet(array, transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Override public                              ImmutableSequencedSet<T> toSequencedSet(                                                      ) { return ToSequencedSet.toSequencedSet(array); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSequencedSet.toSequencedSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return ToSequencedSet.toSequencedSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return ToSequencedSet.toSequencedSet(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return ToMutableSequencedSet.toMutableSequencedSet(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSequencedSet.toMutableSequencedSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSequencedSet.toMutableSequencedSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return ToMutableSequencedSet.toMutableSequencedSet(array, transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Override public                              ImmutableSortedSet<T> toSortedSet(                                                      ) { return ToSortedSet.toSortedSet(array); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToSortedSet.toSortedSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return ToSortedSet.toSortedSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return ToSortedSet.toSortedSet(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return ToMutableSortedSet.toMutableSortedSet(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSortedSet.toMutableSortedSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return ToMutableSortedSet.toMutableSortedSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return ToMutableSortedSet.toMutableSortedSet(array, transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Override public                              ImmutableNavigableSet<T> toNavigableSet(                                                      ) { return ToNavigableSet.toNavigableSet(array); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToNavigableSet.toNavigableSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return ToNavigableSet.toNavigableSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return ToNavigableSet.toNavigableSet(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return ToMutableNavigableSet.toMutableNavigableSet(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableNavigableSet.toMutableNavigableSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return ToMutableNavigableSet.toMutableNavigableSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return ToMutableNavigableSet.toMutableNavigableSet(array, transform); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

                            @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(array, transform); }
                            @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(array, transform); }
                            @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToConcurrentSkipListSet.toConcurrentSkipListSet(array, comparator, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableConcurrentSkipListSet.toMutableConcurrentSkipListSet(array, comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(array, transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(array, transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToCopyOnWriteArraySet.toCopyOnWriteArraySet(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return ToMutableCopyOnWriteArraySet.toMutableCopyOnWriteArraySet(array, transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(ALWAYS_NEW_1) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(                      final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(                      final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(                      final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableEnumSet.toMutableEnumSet(array, clazz, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return ToMutableEnumSet.toMutableEnumSet(array, clazz, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return ToMutableEnumSet.toMutableEnumSet(array, clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Override public                              ImmutableHashSet<T> toHashSet(                                                                                        ) { return ToHashSet.toHashSet(array); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(array, transform); }
    @Override public                              ImmutableHashSet<T> toHashSet(final float           loadFactor                                                        ) { return ToHashSet.toHashSet(array, loadFactor); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(array, loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(array, loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(array, loadFactor, transform); }
    @Override public                              ImmutableHashSet<T> toHashSet(final @Nullable Float loadFactor                                                        ) { return ToHashSet.toHashSet(array, loadFactor); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToHashSet.toHashSet(array, loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return ToHashSet.toHashSet(array, loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return ToHashSet.toHashSet(array, loadFactor, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableHashSet<T> toMutableHashSet(                                                                                                                                 ) { return ToMutableHashSet.toMutableHashSet(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity                                                                                          ) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final float           loadFactor                                                        ) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor                                                        ) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity                                                                                          ) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor                                                        ) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor                                                        ) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return ToMutableHashSet.toMutableHashSet(array, initialCapacity, loadFactor, transform); }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Override public                              ImmutableLinkedHashSet<T> toLinkedHashSet(                                                      ) { return ToLinkedHashSet.toLinkedHashSet(array); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedHashSet.toLinkedHashSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToLinkedHashSet.toLinkedHashSet(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return ToLinkedHashSet.toLinkedHashSet(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return ToMutableLinkedHashSet.toMutableLinkedHashSet(array, transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

                            @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(array, transform); }
                            @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(array, transform); }
                            @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return ToTreeSet.toTreeSet(array, comparator); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToTreeSet.toTreeSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToTreeSet.toTreeSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToTreeSet.toTreeSet(array, comparator, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return ToMutableTreeSet.toMutableTreeSet(array, comparator); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTreeSet.toMutableTreeSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutableTreeSet.toMutableTreeSet(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutableTreeSet.toMutableTreeSet(array, comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Override public                              ImmutableQueue<T> toQueue(                                                      ) { return ToQueue.toQueue(array); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToQueue.toQueue(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return ToQueue.toQueue(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return ToQueue.toQueue(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return ToMutableQueue.toMutableQueue(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableQueue.toMutableQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return ToMutableQueue.toMutableQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return ToMutableQueue.toMutableQueue(array, transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingQueue.toBlockingQueue(array, transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToBlockingQueue.toBlockingQueue(array, transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return ToBlockingQueue.toBlockingQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return ToMutableBlockingQueue.toMutableBlockingQueue(array, transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToTransferQueue.toTransferQueue(array, transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return ToTransferQueue.toTransferQueue(array, transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return ToTransferQueue.toTransferQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableTransferQueue.toMutableTransferQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableTransferQueue.toMutableTransferQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableTransferQueue.toMutableTransferQueue(array, transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(array, transform); }
    @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(array, transform); }
    @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return ToArrayBlockingQueue.toArrayBlockingQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, capacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, capacity, isFair, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, capacity, isFair, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, capacity, isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableArrayBlockingQueue.toMutableArrayBlockingQueue(array, isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(array, transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(array, transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedQueue.toConcurrentLinkedQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedQueue.toMutableConcurrentLinkedQueue(array, transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToDelayQueue.toDelayQueue(array, transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return ToDelayQueue.toDelayQueue(array, transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return ToDelayQueue.toDelayQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDelayQueue.toMutableDelayQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return ToMutableDelayQueue.toMutableDelayQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return ToMutableDelayQueue.toMutableDelayQueue(array, transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(array, transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(array, transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return ToLinkedBlockingQueue.toLinkedBlockingQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(array, capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(array, capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingQueue.toMutableLinkedBlockingQueue(array, capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(array, transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(array, transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToLinkedTransferQueue.toLinkedTransferQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return ToMutableLinkedTransferQueue.toMutableLinkedTransferQueue(array, transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

                            @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(array, transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(array, transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityBlockingQueue.toPriorityBlockingQueue(array, comparator, transform); }


    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityBlockingQueue.toMutablePriorityBlockingQueue(array, initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

                            @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(array, transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(array, transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToPriorityQueue.toPriorityQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToPriorityQueue.toPriorityQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToPriorityQueue.toPriorityQueue(array, comparator, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return ToMutablePriorityQueue.toMutablePriorityQueue(array, initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return ToSynchronousQueue.toSynchronousQueue(array, transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return ToSynchronousQueue.toSynchronousQueue(array, transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return ToSynchronousQueue.toSynchronousQueue(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(array, isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(array, isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return ToMutableSynchronousQueue.toMutableSynchronousQueue(array, isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Override public                              ImmutableDeque<T> toDeque(                                                      ) { return ToDeque.toDeque(array); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToDeque.toDeque(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return ToDeque.toDeque(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return ToDeque.toDeque(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return ToMutableDeque.toMutableDeque(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableDeque.toMutableDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return ToMutableDeque.toMutableDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return ToMutableDeque.toMutableDeque(array, transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToBlockingDeque.toBlockingDeque(array, transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToBlockingDeque.toBlockingDeque(array, transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return ToBlockingDeque.toBlockingDeque(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return ToMutableBlockingDeque.toMutableBlockingDeque(array, transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToArrayDeque.toArrayDeque(array, transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return ToArrayDeque.toArrayDeque(array, transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return ToArrayDeque.toArrayDeque(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayDeque.toMutableArrayDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final Function<? super T, ? extends U>       transform) { return ToMutableArrayDeque.toMutableArrayDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final Supplier<? extends U>                  transform) { return ToMutableArrayDeque.toMutableArrayDeque(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableArrayDeque.toMutableArrayDeque(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return ToMutableArrayDeque.toMutableArrayDeque(array, initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Supplier<? extends U>                  transform) { return ToMutableArrayDeque.toMutableArrayDeque(array, initialCapacity, transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(array, transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(array, transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToConcurrentLinkedDeque.toConcurrentLinkedDeque(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return ToMutableConcurrentLinkedDeque.toMutableConcurrentLinkedDeque(array, transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(array, transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(array, transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return ToLinkedBlockingDeque.toLinkedBlockingDeque(array, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(array, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(array, capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(array, capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return ToMutableLinkedBlockingDeque.toMutableLinkedBlockingDeque(array, capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Override public                              ImmutableStack<T> toStack(                                                      ) { return ToStack.toStack(array); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToStack.toStack(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return ToStack.toStack(array, transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return ToStack.toStack(array, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableStack<T> toMutableStack(                                                      ) { return ToMutableStack.toMutableStack(array); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return ToMutableStack.toMutableStack(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return ToMutableStack.toMutableStack(array, transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return ToMutableStack.toMutableStack(array, transform); }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    public @Unmodifiable Map<Integer, T> toMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public Map<Integer, T> toMutableMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To sequenced map --------------------

    public @Unmodifiable SequencedMap<Integer, T> toSequencedMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public SequencedMap<Integer, T> toMutableSequencedMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To sequenced map --------------------
    //#region -------------------- To sorted map --------------------

    public @Unmodifiable SortedMap<Integer, T> toSortedMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public SortedMap<Integer, T> toMutableSortedMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To sorted map --------------------
    //#region -------------------- To navigable map --------------------

    public @Unmodifiable NavigableMap<Integer, T> toNavigableMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public NavigableMap<Integer, T> toMutableNavigableMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To navigable map --------------------
    //#region -------------------- To concurrent map --------------------

    public @Unmodifiable ConcurrentMap<Integer, T> toConcurrentMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public ConcurrentMap<Integer, T> toMutableConcurrentMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To concurrent map --------------------
    //#region -------------------- To concurrent navigable map --------------------

    public @Unmodifiable ConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public ConcurrentNavigableMap<Integer, T> toMutableConcurrentNavigableMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To concurrent navigable map --------------------
    //#region -------------------- To concurrent hash map --------------------

    public @Unmodifiable ConcurrentHashMap<Integer, T> toConcurrentHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public ConcurrentHashMap<Integer, T> toMutableConcurrentHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To concurrent hash map --------------------
    //#region -------------------- To concurrent skip list map --------------------

    public @Unmodifiable ConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public ConcurrentSkipListMap<Integer, T> toMutableConcurrentSkipListMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To concurrent skip list map --------------------
    //#region -------------------- To enum map --------------------

    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                 transform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, Function<? super T, V>       valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>           keyTransform, Supplier<V>                  valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, Entry<K, V>>                                                       transform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, Function<? super T, V>       valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>                 keyTransform, Supplier<V>                  valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<Entry<K, V>>                                                                  transform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, Function<? super T, V>       valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                            keyTransform, Supplier<V>                  valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(ObjIntFunction<? super T, Entry<K, V>>                                                 transform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(ObjIntFunction<? super T, K>           keyTransform, ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(ObjIntFunction<? super T, K>           keyTransform, Function<? super T, V>       valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(ObjIntFunction<? super T, K>           keyTransform, Supplier<V>                  valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Function<? super T, Entry<K, V>>                                                       transform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Function<? super T, K>                 keyTransform, ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Function<? super T, K>                 keyTransform, Function<? super T, V>       valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Function<? super T, K>                 keyTransform, Supplier<V>                  valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Supplier<Entry<K, V>>                                                                  transform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Supplier<K>                            keyTransform, ObjIntFunction<? super T, V> valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Supplier<K>                            keyTransform, Function<? super T, V>       valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(Supplier<K>                            keyTransform, Supplier<V>                  valueTransform) { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To enum map --------------------
    //#region -------------------- To hash map --------------------

    public @Unmodifiable HashMap<Integer, T> toHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public HashMap<Integer, T> toMutableHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To hash map --------------------
    //#region -------------------- To hashtable --------------------

    public @Unmodifiable Hashtable<Integer, T> toHashtable() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public Hashtable<Integer, T> toMutableHashtable() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To hashtable --------------------
    //#region -------------------- To identity hash map --------------------

    public @Unmodifiable IdentityHashMap<Integer, T> toIdentityHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public IdentityHashMap<Integer, T> toMutableIdentityHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To identity hash map --------------------
    //#region -------------------- To linked hash map --------------------

    public @Unmodifiable LinkedHashMap<Integer, T> toLinkedHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public LinkedHashMap<Integer, T> toMutableLinkedHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To linked hash map --------------------
    //#region -------------------- To tree map --------------------

    public @Unmodifiable TreeMap<Integer, T> toTreeMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public TreeMap<Integer, T> toMutableTreeMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To tree map --------------------
    //#region -------------------- To weak hash map --------------------

    public @Unmodifiable WeakHashMap<Integer, T> toWeakHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }
    public WeakHashMap<Integer, T> toMutableWeakHashMap() { throw new RuntimeException(); /*TODO: implement the map methods*/ }

    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return ToString.toString(array); }

    @Override public String toLocaleString(                             ) { return ToLocaleString.toLocaleString(array); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return ToLocaleString.toLocaleString(array, locale); }

    @Override public String toLowerCaseString() { return ToLowerCaseString.toLowerCaseString(array); }

    @Override public String toLocaleLowerCaseString(                             ) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(array); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return ToLocaleLowerCaseString.toLocaleLowerCaseString(array, locale); }

    @Override public String toUpperCaseString() { return ToUpperCaseString.toUpperCaseString(array); }

    @Override public String toLocaleUpperCaseString(                             ) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(array); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return ToLocaleUpperCaseString.toLocaleUpperCaseString(array, locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    //#region -------------------- Join to string ∅ methods --------------------

    @Override public String joinToString() { return JoinToString.joinToString(array); }

    //#endregion -------------------- Join to string ∅ methods --------------------
    //#region -------------------- Join to string (separator) methods --------------------

    @Override public String joinToString(@Nullable final String    separator) { return JoinToString.joinToString(array, separator); }
    @Override public String joinToString(@Nullable final Character separator) { return JoinToString.joinToString(array, separator); }
    @Override public String joinToString(final char                separator) { return JoinToString.joinToString(array, separator); }

    //#endregion -------------------- Join to string (separator) methods --------------------
    //#region -------------------- Join to string (separator, prefix) methods --------------------

    @Override public String joinToString(@Nullable final String    separator, @Nullable final String    prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(@Nullable final String    separator, @Nullable final Character prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(@Nullable final String    separator, final char                prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(@Nullable final Character separator, @Nullable final String    prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(@Nullable final Character separator, @Nullable final Character prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(@Nullable final Character separator, final char                prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(final char                separator, @Nullable final String    prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(final char                separator, @Nullable final Character prefix) { return JoinToString.joinToString(array, separator, prefix); }
    @Override public String joinToString(final char                separator, final char                prefix) { return JoinToString.joinToString(array, separator, prefix); }

    //#endregion -------------------- Join to string (separator, prefix) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix) { return JoinToString.joinToString(array, separator, prefix, postfix); }

    //#endregion -------------------- Join to string (separator, prefix, postfix) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return JoinToString.joinToString(array, separator, prefix, postfix, limit); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T, int) → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T, int) → string) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T) → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T) → string) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform () → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return JoinToString.joinToString(array, separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform () → string) methods --------------------

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}
