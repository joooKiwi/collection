package joookiwi.collection.java;

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

/// A [CollectionHolder] that hold another [CollectionHolder]
/// (which could be [mutable][MutableCollectionHolder])
/// to only view it
///
/// @implNote It does not change any behaviour from its [reference][#getReference]
/// @see GenericCollectionHolder
/// @see MinimalistCollectionViewer
/// @see EmptyCollectionHolder
@NotNullByDefault
public class CollectionViewer<T extends @Nullable Object,
        REFERENCE extends CollectionHolder<T>>
        extends AbstractCollectionHolder<T> {

    //#region -------------------- Field --------------------

    private final REFERENCE __reference;

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public CollectionViewer(final REFERENCE reference) { this.__reference = reference; }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter method --------------------

    public REFERENCE getReference() { return __reference; }

    //#endregion -------------------- Getter method --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return getReference().size(); }

    @Override public boolean isEmpty() { return getReference().isEmpty(); }
    @Override public boolean isNotEmpty() { return getReference().isNotEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(final int index) { return getReference().get(index); }

    @Override public T getFirst() { return getReference().getFirst(); }

    @Override public T getLast() { return getReference().getLast(); }


    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return getReference().getOrElse(index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return getReference().getOrElse(index, defaultValue); }


    @Override public @Nullable T getOrNull(final int index) { return getReference().getOrNull(index); }

    @Override public @Nullable T getFirstOrNull() { return getReference().getFirstOrNull(); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return getReference().findFirst(predicate); }
    @Override public T findFirst(final Predicate<? super T>       predicate) { return getReference().findFirst(predicate); }
    @Override public T findFirst(final BooleanSupplier            predicate) { return getReference().findFirst(predicate); }

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return getReference().findFirstIndexed(predicate); }
    @Override public T findFirstIndexed(final IntPredicate               predicate) { return getReference().findFirstIndexed(predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return getReference().findFirstIndexed(predicate); }

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return getReference().findFirstOrNull(predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return getReference().findFirstOrNull(predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return getReference().findFirstOrNull(predicate); }

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return getReference().findFirstIndexedOrNull(predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return getReference().findFirstIndexedOrNull(predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return getReference().findFirstIndexedOrNull(predicate); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return getReference().findLast(predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return getReference().findLast(predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return getReference().findLast(predicate); }

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return getReference().findLastIndexed(predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return getReference().findLastIndexed(predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return getReference().findLastIndexed(predicate); }

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return getReference().findLastOrNull(predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return getReference().findLastOrNull(predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return getReference().findLastOrNull(predicate); }

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return getReference().findLastIndexedOrNull(predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return getReference().findLastIndexedOrNull(predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return getReference().findLastIndexedOrNull(predicate); }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element                                            ) { return getReference().firstIndexOf(element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from              ) { return getReference().firstIndexOf(element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final int               from, final int to) { return getReference().firstIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final T element, final @Nullable Integer from, final int to) { return getReference().firstIndexOf(element, from, to); }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element                                            ) { return getReference().firstIndexOfOrNull(element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from              ) { return getReference().firstIndexOfOrNull(element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int to) { return getReference().firstIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return getReference().firstIndexOfOrNull(element, from, to); }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element                                            ) { return getReference().lastIndexOf(element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from              ) { return getReference().lastIndexOf(element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final int               from, final int to) { return getReference().lastIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final T element, final @Nullable Integer from, final int to) { return getReference().lastIndexOf(element, from, to); }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element                                            ) { return getReference().lastIndexOfOrNull(element); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from              ) { return getReference().lastIndexOfOrNull(element, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int to) { return getReference().lastIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int to) { return getReference().lastIndexOfOrNull(element, from, to); }

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate                                            ) { return getReference().indexOfFirst(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate                                            ) { return getReference().indexOfFirst(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate                                            ) { return getReference().indexOfFirst(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from              ) { return getReference().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int to) { return getReference().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirst(predicate, from, to); }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return getReference().indexOfFirstOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                            ) { return getReference().indexOfFirstOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                            ) { return getReference().indexOfFirstOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from              ) { return getReference().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return getReference().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstOrNull(predicate, from, to); }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                            ) { return getReference().indexOfFirstIndexed(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate                                            ) { return getReference().indexOfFirstIndexed(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate                                            ) { return getReference().indexOfFirstIndexed(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from              ) { return getReference().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int to) { return getReference().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstIndexed(predicate, from, to); }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return getReference().indexOfFirstIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                            ) { return getReference().indexOfFirstIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                            ) { return getReference().indexOfFirstIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return getReference().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return getReference().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfFirstIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate                                            ) { return getReference().indexOfLast(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate                                            ) { return getReference().indexOfLast(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate                                            ) { return getReference().indexOfLast(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from              ) { return getReference().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int to) { return getReference().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLast(predicate, from, to); }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                            ) { return getReference().indexOfLastOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                            ) { return getReference().indexOfLastOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                            ) { return getReference().indexOfLastOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from              ) { return getReference().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int to) { return getReference().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastOrNull(predicate, from, to); }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                            ) { return getReference().indexOfLastIndexed(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate                                            ) { return getReference().indexOfLastIndexed(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate                                            ) { return getReference().indexOfLastIndexed(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from              ) { return getReference().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int to) { return getReference().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastIndexed(predicate, from, to); }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                            ) { return getReference().indexOfLastIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                            ) { return getReference().indexOfLastIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                            ) { return getReference().indexOfLastIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from              ) { return getReference().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from              ) { return getReference().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from              ) { return getReference().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int to) { return getReference().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int to) { return getReference().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int to) { return getReference().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int to) { return getReference().indexOfLastIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return getReference().all(predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return getReference().all(predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return getReference().all(predicate); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return getReference().any(predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return getReference().any(predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return getReference().any(predicate); }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return getReference().none(predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return getReference().none(predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return getReference().none(predicate); }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    @Override public boolean hasNull() { return getReference().hasNull(); }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Override public boolean hasNoNulls() { return getReference().hasNoNulls(); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Override public boolean hasDuplicate() { return getReference().hasDuplicate(); }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Override public boolean hasNoDuplicates() { return getReference().hasNoDuplicates(); }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    @Override public boolean has(final T value) { return getReference().has(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    @Override public boolean hasNot(final T value) { return getReference().hasNot(value); }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                            values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                        values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                         values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                         values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                            values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                    values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return getReference().hasOne(values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                               values) { return getReference().hasOne(values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                            values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                        values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                         values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                         values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                            values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return getReference().hasNotOne(values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                               values) { return getReference().hasNotOne(values); }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                            values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                        values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                         values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                         values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                            values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                    values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return getReference().hasAll(values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                               values) { return getReference().hasAll(values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                            values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                        values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                         values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                         values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                            values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                    values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return getReference().hasNotAll(values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                               values) { return getReference().hasNotAll(values); }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<@NotNull T> requireNoNulls() {
        getReference().requireNoNulls();
        return this;
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return getReference().filter(predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T>       predicate) { return getReference().filter(predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier            predicate) { return getReference().filter(predicate); }

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return getReference().filterIndexed(predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate               predicate) { return getReference().filterIndexed(predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier            predicate) { return getReference().filterIndexed(predicate); }


    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return getReference().filterNot(predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T>       predicate) { return getReference().filterNot(predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier            predicate) { return getReference().filterNot(predicate); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return getReference().filterNotIndexed(predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate               predicate) { return getReference().filterNotIndexed(predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier            predicate) { return getReference().filterNotIndexed(predicate); }


    @Override public CollectionHolder<@NotNull T> filterNotNull() { return getReference().filterNotNull(); }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer>                                  indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Collection<? extends Integer>                                        indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final SequencedCollection<? extends Integer>                               indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return getReference().slice(indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return getReference().slice(indices); }

    @Override public CollectionHolder<T> slice(                            ) { return getReference().slice(); }
    @Override public CollectionHolder<T> slice(final int from              ) { return getReference().slice(from); }
    @Override public CollectionHolder<T> slice(final int from, final int to) { return getReference().slice(from, to); }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(int n) { return getReference().take(n); }

    @Override public CollectionHolder<T> takeWhile(ObjIntPredicate<? super T> predicate) { return getReference().takeWhile(predicate); }
    @Override public CollectionHolder<T> takeWhile(Predicate<? super T>       predicate) { return getReference().takeWhile(predicate); }
    @Override public CollectionHolder<T> takeWhile(BooleanSupplier            predicate) { return getReference().takeWhile(predicate); }

    @Override public CollectionHolder<T> takeWhileIndexed(IntObjPredicate<? super T> predicate) { return getReference().takeWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(IntPredicate               predicate) { return getReference().takeWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(BooleanSupplier            predicate) { return getReference().takeWhileIndexed(predicate); }


    @Override public CollectionHolder<T> takeLast(int n) { return getReference().takeLast(n); }

    @Override public CollectionHolder<T> takeLastWhile(ObjIntPredicate<? super T> predicate) { return getReference().takeLastWhile(predicate); }
    @Override public CollectionHolder<T> takeLastWhile(Predicate<? super T>       predicate) { return getReference().takeLastWhile(predicate); }
    @Override public CollectionHolder<T> takeLastWhile(BooleanSupplier            predicate) { return getReference().takeLastWhile(predicate); }

    @Override public CollectionHolder<T> takeLastWhileIndexed(IntObjPredicate<? super T> predicate) { return getReference().takeLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(IntPredicate               predicate) { return getReference().takeLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(BooleanSupplier            predicate) { return getReference().takeLastWhileIndexed(predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(int n) { return getReference().drop(n); }

    @Override public CollectionHolder<T> dropWhile(ObjIntPredicate<? super T> predicate) { return getReference().dropWhile(predicate); }
    @Override public CollectionHolder<T> dropWhile(Predicate<? super T>       predicate) { return getReference().dropWhile(predicate); }
    @Override public CollectionHolder<T> dropWhile(BooleanSupplier            predicate) { return getReference().dropWhile(predicate); }

    @Override public CollectionHolder<T> dropWhileIndexed(IntObjPredicate<? super T> predicate) { return getReference().dropWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(IntPredicate               predicate) { return getReference().dropWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(BooleanSupplier            predicate) { return getReference().dropWhileIndexed(predicate); }


    @Override public CollectionHolder<T> dropLast(int n) { return getReference().dropLast(n); }

    @Override public CollectionHolder<T> dropLastWhile(ObjIntPredicate<? super T> predicate) { return getReference().dropLastWhile(predicate); }
    @Override public CollectionHolder<T> dropLastWhile(Predicate<? super T>       predicate) { return getReference().dropLastWhile(predicate); }
    @Override public CollectionHolder<T> dropLastWhile(BooleanSupplier            predicate) { return getReference().dropLastWhile(predicate); }

    @Override public CollectionHolder<T> dropLastWhileIndexed(IntObjPredicate<? super T> predicate) { return getReference().dropLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(IntPredicate               predicate) { return getReference().dropLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(BooleanSupplier            predicate) { return getReference().dropLastWhileIndexed(predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> action) { return getReference().map(action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       action) { return getReference().map(action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  action) { return getReference().map(action); }

    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> action) { return getReference().mapIndexed(action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               action) { return getReference().mapIndexed(action); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  action) { return getReference().mapIndexed(action); }


    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().mapNotNull(transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends U>       transform) { return getReference().mapNotNull(transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends U>                  transform) { return getReference().mapNotNull(transform); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends U> transform) { return getReference().mapNotNullIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends U>               transform) { return getReference().mapNotNullIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends U>                  transform) { return getReference().mapNotNullIndexed(transform); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { getReference().forEach(action); }
    @Override public void forEach(final Consumer<? super T>       action) { getReference().forEach(action); }
    @Override public void forEach(final Runnable                  action) { getReference().forEach(action); }

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { getReference().forEachIndexed(action); }
    @Override public void forEachIndexed(final IntConsumer               action) { getReference().forEachIndexed(action); }
    @Override public void forEachIndexed(final Runnable                  action) { getReference().forEachIndexed(action); }

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    @Contract(ALWAYS_THIS_1) @Override public CollectionViewer<T, REFERENCE> onEach(ObjIntConsumer<? super T> action) {
        getReference().forEach(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionViewer<T, REFERENCE> onEach(Consumer<? super T> action) {
        getReference().forEach(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionViewer<T, REFERENCE> onEach(Runnable action) {
        getReference().forEach(action);
        return this;
    }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    @Contract(ALWAYS_THIS_1) @Override public CollectionViewer<T, REFERENCE> onEachIndexed(IntObjConsumer<? super T> action) {
        getReference().forEachIndexed(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionViewer<T, REFERENCE> onEachIndexed(IntConsumer action) {
        getReference().forEachIndexed(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionViewer<T, REFERENCE> onEachIndexed(Runnable action) {
        getReference().forEachIndexed(action);
        return this;
    }

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    @Override public CollectionHolder<T> toReverse(                                          ) { return getReference().toReverse(); }
    @Override public CollectionHolder<T> toReverse(final int               from              ) { return getReference().toReverse(from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int to) { return getReference().toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int to) { return getReference().toReverse(from, to); }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To array --------------------

                           @Override public                              T[] toArray(                                                      ) { return getReference().toArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toArray(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return getReference().toArray(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return getReference().toArray(transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

                           @Override public                              ImmutableCollection<T> toCollection(                                                      ) { return getReference().toCollection(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toCollection(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return getReference().toCollection(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return getReference().toCollection(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return getReference().toMutableCollection(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return getReference().toMutableCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return getReference().toMutableCollection(transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

                           @Override public                              ImmutableSequencedCollection<T> toSequencedCollection(                                                      ) { return getReference().toSequencedCollection(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toSequencedCollection(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return getReference().toSequencedCollection(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return getReference().toSequencedCollection(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return getReference().toMutableSequencedCollection(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableSequencedCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return getReference().toMutableSequencedCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return getReference().toMutableSequencedCollection(transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

                           @Override public                              ImmutableList<T> toList(                                                      ) { return getReference().toList(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return getReference().toList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return getReference().toList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableList<T> toMutableList(                                                      ) { return getReference().toMutableList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return getReference().toMutableList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return getReference().toMutableList(transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

                           @Override public                              ImmutableArrayList<T> toArrayList(                                                      ) { return getReference().toArrayList(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toArrayList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return getReference().toArrayList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return getReference().toArrayList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                 ) { return getReference().toMutableArrayList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                           final Supplier<? extends U>                  transform) { return getReference().toMutableArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(final int initialCapacity                                                        ) { return getReference().toMutableArrayList(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int initialCapacity, final Supplier<? extends U>                  transform) { return getReference().toMutableArrayList(initialCapacity, transform); }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

                           @Override public                              ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList(                                                      ) { return getReference().toCopyOnWriteArrayList(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toCopyOnWriteArrayList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return getReference().toCopyOnWriteArrayList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return getReference().toCopyOnWriteArrayList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return getReference().toMutableCopyOnWriteArrayList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableCopyOnWriteArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return getReference().toMutableCopyOnWriteArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return getReference().toMutableCopyOnWriteArrayList(transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

                           @Override public                              ImmutableLinkedList<T> toLinkedList(                                                      ) { return getReference().toLinkedList(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toLinkedList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return getReference().toLinkedList(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return getReference().toLinkedList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return getReference().toMutableLinkedList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedList(transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

                           @Override public                              ImmutableVector<T> toVector(                                                      ) { return getReference().toVector(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toVector(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return getReference().toVector(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return getReference().toVector(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableVector<T> toMutableVector(                                                                                 ) { return getReference().toMutableVector(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableVector(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Function<? super T, ? extends U>       transform) { return getReference().toMutableVector(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                           final Supplier<? extends U>                  transform) { return getReference().toMutableVector(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableVector<T> toMutableVector(final int initialCapacity                                                        ) { return getReference().toMutableVector(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return getReference().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int initialCapacity, final Supplier<? extends U>                  transform) { return getReference().toMutableVector(initialCapacity, transform); }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

                           @Override public                              ImmutableSet<T> toSet(                                                      ) { return getReference().toSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return getReference().toSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return getReference().toSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return getReference().toMutableSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return getReference().toMutableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableSet(transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

                           @Override public                              ImmutableSequencedSet<T> toSequencedSet(                                                      ) { return getReference().toSequencedSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toSequencedSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return getReference().toSequencedSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return getReference().toSequencedSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return getReference().toMutableSequencedSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableSequencedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return getReference().toMutableSequencedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableSequencedSet(transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

                           @Override public                              ImmutableSortedSet<T> toSortedSet(                                                      ) { return getReference().toSortedSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toSortedSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return getReference().toSortedSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return getReference().toSortedSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return getReference().toMutableSortedSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableSortedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return getReference().toMutableSortedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableSortedSet(transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Contract(pure = true) @Override public                              ImmutableNavigableSet<T> toNavigableSet(                                                      ) { return getReference().toNavigableSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toNavigableSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return getReference().toNavigableSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return getReference().toNavigableSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return getReference().toMutableNavigableSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableNavigableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return getReference().toMutableNavigableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableNavigableSet(transform); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toConcurrentSkipListSet(transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Supplier<? extends U>                  transform) { return getReference().toConcurrentSkipListSet(transform); }
    @Contract(pure = true) @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Function<? super T, ? extends U>       transform) { return getReference().toConcurrentSkipListSet(transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toConcurrentSkipListSet(comparator, transform); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableConcurrentSkipListSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableConcurrentSkipListSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Supplier<? extends U>                  transform) { return getReference().toMutableConcurrentSkipListSet(transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toMutableConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toMutableConcurrentSkipListSet(comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toCopyOnWriteArraySet(transform); }
    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return getReference().toCopyOnWriteArraySet(transform); }
    @Contract(pure = true) @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return getReference().toCopyOnWriteArraySet(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableCopyOnWriteArraySet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableCopyOnWriteArraySet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return getReference().toMutableCopyOnWriteArraySet(transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableEnumSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Supplier<? extends U>                  transform) { return getReference().toMutableEnumSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableEnumSet(transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableEnumSet(clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return getReference().toMutableEnumSet(clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return getReference().toMutableEnumSet(clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(                                                                              ) { return getReference().toHashSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toHashSet(            transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Function<? super T, ? extends U>       transform) { return getReference().toHashSet(            transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                        final Supplier<? extends U>                  transform) { return getReference().toHashSet(            transform); }
    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(final float loadFactor                                                        ) { return getReference().toHashSet(loadFactor); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Function<? super T, ? extends U>       transform) { return getReference().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float loadFactor, final Supplier<? extends U>                  transform) { return getReference().toHashSet(loadFactor, transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(                                                      ) { return getReference().toMutableHashSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Supplier<? extends U>                  transform) { return getReference().toMutableHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableHashSet(transform); }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Contract(pure = true) @Override public                              ImmutableLinkedHashSet<T> toLinkedHashSet(                                                      ) { return getReference().toLinkedHashSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toLinkedHashSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return getReference().toLinkedHashSet(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return getReference().toLinkedHashSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return getReference().toMutableLinkedHashSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedHashSet(transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toTreeSet(transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return getReference().toTreeSet(transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return getReference().toTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return getReference().toTreeSet(comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toTreeSet(comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return getReference().toMutableTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return getReference().toMutableTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return getReference().toMutableTreeSet(comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toMutableTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toMutableTreeSet(comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Contract(pure = true) @Override public                              ImmutableQueue<T> toQueue(                                                      ) { return getReference().toQueue(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toQueue(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return getReference().toQueue(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return getReference().toQueue(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return getReference().toMutableQueue(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return getReference().toMutableQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return getReference().toMutableQueue(transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return getReference().toBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return getReference().toBlockingQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return getReference().toMutableBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return getReference().toMutableBlockingQueue(transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toTransferQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return getReference().toTransferQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return getReference().toTransferQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return getReference().toMutableTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return getReference().toMutableTransferQueue(transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toArrayBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return getReference().toArrayBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return getReference().toArrayBlockingQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Supplier<? extends U>                  transform) { return getReference().toMutableArrayBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Supplier<? extends U>                  transform) { return getReference().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Supplier<? extends U>                  transform) { return getReference().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Supplier<? extends U>                  transform) { return getReference().toMutableArrayBlockingQueue(isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toConcurrentLinkedQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return getReference().toConcurrentLinkedQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return getReference().toConcurrentLinkedQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableConcurrentLinkedQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return getReference().toMutableConcurrentLinkedQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return getReference().toMutableConcurrentLinkedQueue(transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toDelayQueue(transform); }
    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return getReference().toDelayQueue(transform); }
    @Contract(pure = true) @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return getReference().toDelayQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableDelayQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return getReference().toMutableDelayQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return getReference().toMutableDelayQueue(transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toLinkedBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return getReference().toLinkedBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return getReference().toLinkedBlockingQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedBlockingQueue(capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toLinkedTransferQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return getReference().toLinkedTransferQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return getReference().toLinkedTransferQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedTransferQueue(transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toPriorityBlockingQueue(transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return getReference().toPriorityBlockingQueue(transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return getReference().toPriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toPriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toPriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toPriorityBlockingQueue(comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                   final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toPriorityQueue(transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return getReference().toPriorityQueue(transform); }
    @Contract(pure = true)                       @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return getReference().toPriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toPriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toPriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toPriorityQueue(comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                   final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                           final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity,                                         final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return getReference().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return getReference().toMutablePriorityQueue(initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toSynchronousQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return getReference().toSynchronousQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return getReference().toSynchronousQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableSynchronousQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Function<? super T, ? extends U>       transform) { return getReference().toMutableSynchronousQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Supplier<? extends U>                  transform) { return getReference().toMutableSynchronousQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return getReference().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return getReference().toMutableSynchronousQueue(isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Contract(pure = true) @Override public                              ImmutableDeque<T> toDeque(                                                      ) { return getReference().toDeque(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toDeque(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return getReference().toDeque(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return getReference().toDeque(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return getReference().toMutableDeque(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return getReference().toMutableDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return getReference().toMutableDeque(transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toBlockingDeque(transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return getReference().toBlockingDeque(transform); }
    @Contract(pure = true) @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return getReference().toBlockingDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return getReference().toMutableBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return getReference().toMutableBlockingDeque(transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toArrayDeque(transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return getReference().toArrayDeque(transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return getReference().toArrayDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableArrayDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Function<? super T, ? extends U>       transform) { return getReference().toMutableArrayDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final Supplier<? extends U>                  transform) { return getReference().toMutableArrayDeque(transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toConcurrentLinkedDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return getReference().toConcurrentLinkedDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return getReference().toConcurrentLinkedDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableConcurrentLinkedDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return getReference().toMutableConcurrentLinkedDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return getReference().toMutableConcurrentLinkedDeque(transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toLinkedBlockingDeque(transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return getReference().toLinkedBlockingDeque(transform); }
    @Contract(pure = true) @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return getReference().toLinkedBlockingDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return getReference().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return getReference().toMutableLinkedBlockingDeque(capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Contract(pure = true) @Override public                              ImmutableStack<T> toStack(                                                      ) { return getReference().toStack(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toStack(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return getReference().toStack(transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return getReference().toStack(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableStack<T> toMutableStack(                                                      ) { return getReference().toMutableStack(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return getReference().toMutableStack(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return getReference().toMutableStack(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return getReference().toMutableStack(transform); }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    @Override public @Unmodifiable Map<Integer, T> toMap() { return getReference().toMap(); }

    @Override public Map<Integer, T> toMutableMap() { return getReference().toMutableMap(); }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To sequenced map --------------------

    @Override public @Unmodifiable SequencedMap<Integer, T> toSequencedMap() { return getReference().toSequencedMap(); }

    @Override public SequencedMap<Integer, T> toMutableSequencedMap() { return getReference().toMutableSequencedMap(); }

    //#endregion -------------------- To sequenced map --------------------
    //#region -------------------- To sorted map --------------------

    @Override public @Unmodifiable SortedMap<Integer, T> toSortedMap() { return getReference().toSortedMap(); }

    @Override public SortedMap<Integer, T> toMutableSortedMap() { return getReference().toMutableSortedMap(); }

    //#endregion -------------------- To sorted map --------------------
    //#region -------------------- To navigable map --------------------

    @Override public @Unmodifiable NavigableMap<Integer, T> toNavigableMap() { return getReference().toNavigableMap(); }

    @Override public NavigableMap<Integer, T> toMutableNavigableMap() { return getReference().toMutableNavigableMap(); }

    //#endregion -------------------- To navigable map --------------------
    //#region -------------------- To concurrent map --------------------

    @Override public @Unmodifiable ConcurrentMap<Integer, T> toConcurrentMap() { return getReference().toConcurrentMap(); }

    @Override public ConcurrentMap<Integer, T> toMutableConcurrentMap() { return getReference().toMutableConcurrentMap(); }

    //#endregion -------------------- To concurrent map --------------------
    //#region -------------------- To concurrent navigable map --------------------

    @Override public @Unmodifiable ConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() { return getReference().toConcurrentNavigableMap(); }

    @Override public ConcurrentNavigableMap<Integer, T> toMutableConcurrentNavigableMap() { return getReference().toMutableConcurrentNavigableMap(); }

    //#endregion -------------------- To concurrent navigable map --------------------
    //#region -------------------- To concurrent hash map --------------------

    @Override public @Unmodifiable ConcurrentHashMap<Integer, T> toConcurrentHashMap() { return getReference().toConcurrentHashMap(); }

    @Override public ConcurrentHashMap<Integer, T> toMutableConcurrentHashMap() { return getReference().toMutableConcurrentHashMap(); }

    //#endregion -------------------- To concurrent hash map --------------------
    //#region -------------------- To concurrent skip list map --------------------

    @Override public @Unmodifiable ConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() { return getReference().toConcurrentSkipListMap(); }

    @Override public ConcurrentSkipListMap<Integer, T> toMutableConcurrentSkipListMap() { return getReference().toMutableConcurrentSkipListMap(); }

    //#endregion -------------------- To concurrent skip list map --------------------
    //#region -------------------- To enum map --------------------

    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                                    transform) { return getReference().toEnumMap(transform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, Entry<K, V>>                                                          transform) { return getReference().toEnumMap(transform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<Entry<K, V>>                                                                     transform) { return getReference().toEnumMap(transform); }

    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>        keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>        keyTransform, final Function<? super T, V>       valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final ObjIntFunction<? super T, K>        keyTransform, final Supplier<V>                  valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>              keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>              keyTransform, final Function<? super T, V>       valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Function<? super T, K>              keyTransform, final Supplier<V>                  valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                         keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                         keyTransform, final Function<? super T, V>       valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> @Unmodifiable EnumMap<K, V> toEnumMap(final Supplier<K>                         keyTransform, final Supplier<V>                  valueTransform) { return getReference().toEnumMap(keyTransform, valueTransform); }

    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, Entry<K, V>>                                             transform) { return getReference().toMutableEnumMap(transform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, Entry<K, V>>                                                   transform) { return getReference().toMutableEnumMap(transform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<Entry<K, V>>                                                              transform) { return getReference().toMutableEnumMap(transform); }

    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K> keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K> keyTransform, final Function<? super T, V>       valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final ObjIntFunction<? super T, K> keyTransform, final Supplier<V>                  valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>       keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>       keyTransform, final Function<? super T, V>       valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Function<? super T, K>       keyTransform, final Supplier<V>                  valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                  keyTransform, final ObjIntFunction<? super T, V> valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                  keyTransform, final Function<? super T, V>       valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }
    @Override public <K extends Enum<K>, V> EnumMap<K, V> toMutableEnumMap(final Supplier<K>                  keyTransform, final Supplier<V>                  valueTransform) { return getReference().toMutableEnumMap(keyTransform, valueTransform); }

    //#endregion -------------------- To enum map --------------------
    //#region -------------------- To hash map --------------------

    @Override public @Unmodifiable HashMap<Integer, T> toHashMap() { return getReference().toHashMap(); }

    @Override public HashMap<Integer, T> toMutableHashMap() { return getReference().toMutableHashMap(); }

    //#endregion -------------------- To hash map --------------------
    //#region -------------------- To hashtable --------------------

    @Override public @Unmodifiable Hashtable<Integer, T> toHashtable() { return getReference().toHashtable(); }

    @Override public Hashtable<Integer, T> toMutableHashtable() { return getReference().toMutableHashtable(); }

    //#endregion -------------------- To hashtable --------------------
    //#region -------------------- To identity hash map --------------------

    @Override public @Unmodifiable IdentityHashMap<Integer, T> toIdentityHashMap() { return getReference().toIdentityHashMap(); }

    @Override public IdentityHashMap<Integer, T> toMutableIdentityHashMap() { return getReference().toMutableIdentityHashMap(); }

    //#endregion -------------------- To identity hash map --------------------
    //#region -------------------- To linked hash map --------------------

    @Override public @Unmodifiable LinkedHashMap<Integer, T> toLinkedHashMap() { return getReference().toLinkedHashMap(); }

    @Override public LinkedHashMap<Integer, T> toMutableLinkedHashMap() { return getReference().toMutableLinkedHashMap(); }

    //#endregion -------------------- To linked hash map --------------------
    //#region -------------------- To tree map --------------------

    @Override public @Unmodifiable TreeMap<Integer, T> toTreeMap() { return getReference().toTreeMap(); }

    @Override public TreeMap<Integer, T> toMutableTreeMap() { return getReference().toMutableTreeMap(); }

    //#endregion -------------------- To tree map --------------------
    //#region -------------------- To weak hash map --------------------

    @Override public @Unmodifiable WeakHashMap<Integer, T> toWeakHashMap() { return getReference().toWeakHashMap(); }

    @Override public WeakHashMap<Integer, T> toMutableWeakHashMap() { return getReference().toMutableWeakHashMap(); }

    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return getReference().toString(); }

    @Override public String toLocaleString(                             ) { return getReference().toLocaleString(); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return getReference().toLocaleString(locale); }

    @Override public String toLowerCaseString() { return getReference().toLowerCaseString(); }

    @Override public String toLocaleLowerCaseString(                             ) { return getReference().toLocaleLowerCaseString(); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return getReference().toLocaleLowerCaseString(locale); }

    @Override public String toUpperCaseString() { return getReference().toUpperCaseString(); }

    @Override public String toLocaleUpperCaseString(                             ) { return getReference().toLocaleUpperCaseString(); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return getReference().toLocaleUpperCaseString(locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix                                                                                                                              ) { return getReference().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated                                                             ) { return getReference().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return getReference().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return getReference().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Function<? super T, String>       transform) { return getReference().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super T, String>       transform) { return getReference().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int               limit, final @Nullable String truncated, final @Nullable Supplier<String>                  transform) { return getReference().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String>                  transform) { return getReference().joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override public int hashCode() { return getReference().hashCode(); }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Override public CollectionViewer<T, REFERENCE> clone() { return (CollectionViewer<T, REFERENCE>) super.clone(); }

    @MustBeInvokedByOverriders
    @Override public CollectionViewer<T, REFERENCE> shallowClone() { return clone(); }
//    @Override public CollectionViewer<T, REFERENCE> shallowClone() { return new CollectionViewer<>(getReference()); }

    @MustBeInvokedByOverriders
    @Override public CollectionViewer<T, CollectionHolder<T>> deepClone() { return (CollectionViewer<T, CollectionHolder<T>>) clone(); }
//    @Override public CollectionViewer<T, CollectionHolder<? extends T>> deepClone() { return new CollectionViewer<>(getReference().deepClone()); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Method --------------------

}
