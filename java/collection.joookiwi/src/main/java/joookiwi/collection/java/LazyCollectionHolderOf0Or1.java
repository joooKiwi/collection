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
import java.util.Objects;
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
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
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
import joookiwi.collection.java.optional.Optional;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An instance of [CollectionHolder] with only 2 possible inner-collection.
/// The first as [EmptyCollectionHolder] and the second as [CollectionHolderOf1].
/// Plus, the inner-collection is lazily retrieved.
///
/// @param <T> The type
@NotNullByDefault
public class LazyCollectionHolderOf0Or1<T extends @Nullable Object>
        extends AbstractUnimplementedCollectionHolder<T>
        implements ClassWith1Value<T> {

    //#region -------------------- Fields --------------------

    private static final Supplier<?> FAIL_CALLBACK = () -> { throw new RuntimeException("This callback is never supposed to be called normally."); };

    private Supplier<? extends Optional<T>> __latePossibleValue;
    private @Nullable CollectionHolder<T> __innerCollection;
    private @Nullable T __value1;
    private boolean __isValue1Initialized;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public LazyCollectionHolderOf0Or1(final Supplier<? extends Optional<T>> latePossibleValue) {
        super();
        __latePossibleValue = latePossibleValue;
        __isValue1Initialized = false;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The internal possible value passed through the `constructor`
    ///
    /// @return Either [EmptyCollectionHolder] or [CollectionHolderOf1]
    @SuppressWarnings("unchecked cast")
    protected CollectionHolder<T> _innerCollection() {
        final var value = __innerCollection;
        if (value != null)
            return value;

        final var possibleValue = __latePossibleValue.get();
        __latePossibleValue = (Supplier<? extends Optional<T>>) FAIL_CALLBACK; // We do not need the callback anymore once the value has been retrieved
        if (possibleValue.isPresent())
            return __innerCollection = new CollectionHolderOf1<>(possibleValue.get());
        return __innerCollection = EmptyCollectionHolder.getInstance();
    }

    @Override public T value() {
        if (__isValue1Initialized)
            return __value1;

        final var innerCollection = _innerCollection();
        if (innerCollection.isEmpty())
            throw new IndexOutOfBoundsException("The inner collection received in the “" + getClass().getSimpleName() + "” does not have an existing value.", 0);
        __isValue1Initialized = true;
        return __value1 = ((CollectionHolderOf1<T>) innerCollection).value();
    }

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = 1) int size() { return _innerCollection().size(); }

    @Override public boolean isEmpty() { return _innerCollection().isEmpty(); }
    @Override public boolean isNotEmpty() { return _innerCollection().isNotEmpty(); }

    @Override public boolean hasExactly1Element() { return _innerCollection().hasExactly1Element(); }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost1Element() { return true; }

    @Contract(ALWAYS_FALSE_0) @Override public boolean hasAtLeast2Elements() { return false; }
    @Contract(ALWAYS_FALSE_0) @Override public boolean hasExactly2Elements() { return false; }
    @Contract(ALWAYS_TRUE_0) @Override public boolean hasAtMost2Elements() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(final int index) { return _innerCollection().get(index); }

    @Override public T getFirst() { return _innerCollection().getFirst(); }

    @Override public T getLast() { return _innerCollection().getLast(); }


    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return _innerCollection().getOrElse(index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return _innerCollection().getOrElse(index, defaultValue); }

    @Override public T getFirstOrElse(final Supplier<? extends T> defaultValue) { return _innerCollection().getFirstOrElse(defaultValue); }

    @Override public T getLastOrElse(final Supplier<? extends T> defaultValue) { return _innerCollection().getLastOrElse(defaultValue); }


    @Override public @Nullable T getOrNull(final int index) { return _innerCollection().getOrNull(index); }

    @Override public @Nullable T getFirstOrNull() { return _innerCollection().getFirstOrNull(); }

    @Override public @Nullable T getLastOrNull() { return _innerCollection().getLastOrNull(); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return _innerCollection().findFirst(predicate); }
    @Override public T findFirst(final Predicate<? super T> predicate) { return _innerCollection().findFirst(predicate); }
    @Override public T findFirst(final BooleanSupplier predicate) { return _innerCollection().findFirst(predicate); }

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().findFirstIndexed(predicate); }
    @Override public T findFirstIndexed(final IntPredicate predicate) { return _innerCollection().findFirstIndexed(predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return _innerCollection().findFirstIndexed(predicate); }

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return _innerCollection().findFirstOrNull(predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return _innerCollection().findFirstOrNull(predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return _innerCollection().findFirstOrNull(predicate); }

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return _innerCollection().findFirstIndexedOrNull(predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return _innerCollection().findFirstIndexedOrNull(predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return _innerCollection().findFirstIndexedOrNull(predicate); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return _innerCollection().findLast(predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return _innerCollection().findLast(predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return _innerCollection().findLast(predicate); }

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().findLastIndexed(predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return _innerCollection().findLastIndexed(predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return _innerCollection().findLastIndexed(predicate); }

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return _innerCollection().findLastOrNull(predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return _innerCollection().findLastOrNull(predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return _innerCollection().findLastOrNull(predicate); }

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return _innerCollection().findLastIndexedOrNull(predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return _innerCollection().findLastIndexedOrNull(predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return _innerCollection().findLastIndexedOrNull(predicate); }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index --------------------

    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element                                                          ) { return _innerCollection().firstIndexOf(element); }
    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element, final int               from                            ) { return _innerCollection().firstIndexOf(element, from); }
    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element, final @Nullable Integer from                            ) { return _innerCollection().firstIndexOf(element, from); }
    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element, final int               from, final int               to) { return _innerCollection().firstIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element, final int               from, final @Nullable Integer to) { return _innerCollection().firstIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element, final @Nullable Integer from, final int               to) { return _innerCollection().firstIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = 0) int firstIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().firstIndexOf(element, from, to); }

    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element                                                          ) { return _innerCollection().firstIndexOfOrNull(element); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final int               from                            ) { return _innerCollection().firstIndexOfOrNull(element, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from                            ) { return _innerCollection().firstIndexOfOrNull(element, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int               to) { return _innerCollection().firstIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return _innerCollection().firstIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return _innerCollection().firstIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().firstIndexOfOrNull(element, from, to); }

    //#endregion -------------------- First index --------------------
    //#region -------------------- Last index --------------------

    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element                                                          ) { return _innerCollection().lastIndexOf(element); }
    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element, final int               from                            ) { return _innerCollection().lastIndexOf(element, from); }
    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element, final @Nullable Integer from                            ) { return _innerCollection().lastIndexOf(element, from); }
    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element, final int               from, final int               to) { return _innerCollection().lastIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element, final int               from, final @Nullable Integer to) { return _innerCollection().lastIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element, final @Nullable Integer from, final int               to) { return _innerCollection().lastIndexOf(element, from, to); }
    @Override public @Range(from = 0, to = 0) int lastIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().lastIndexOf(element, from, to); }

    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element                                                          ) { return _innerCollection().lastIndexOfOrNull(element); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final int               from                            ) { return _innerCollection().lastIndexOfOrNull(element, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from                            ) { return _innerCollection().lastIndexOfOrNull(element, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int               to) { return _innerCollection().lastIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return _innerCollection().lastIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return _innerCollection().lastIndexOfOrNull(element, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().lastIndexOfOrNull(element, from, to); }

    //#endregion -------------------- Last index --------------------

    //#region -------------------- Index of first --------------------

    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfFirst(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate                                                          ) { return _innerCollection().indexOfFirst(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfFirst(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate, final int               from                            ) { return _innerCollection().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirst(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int               to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirst(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirst(predicate, from, to); }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfFirstOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                                          ) { return _innerCollection().indexOfFirstOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfFirstOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return _innerCollection().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstOrNull(predicate, from, to); }

    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfFirstIndexed(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate                                                          ) { return _innerCollection().indexOfFirstIndexed(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfFirstIndexed(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from                            ) { return _innerCollection().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexed(predicate, from, to); }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                                          ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfFirstIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of last --------------------

    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfLast(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate                                                          ) { return _innerCollection().indexOfLast(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfLast(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate, final int               from                            ) { return _innerCollection().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLast(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int               to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLast(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLast(predicate, from, to); }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfLastOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                                          ) { return _innerCollection().indexOfLastOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfLastOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return _innerCollection().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastOrNull(predicate, from, to); }

    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfLastIndexed(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate                                                          ) { return _innerCollection().indexOfLastIndexed(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfLastIndexed(predicate); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate, final int               from                            ) { return _innerCollection().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastIndexed(predicate, from); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int               to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexed(predicate, from, to); }

    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return _innerCollection().indexOfLastIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                                          ) { return _innerCollection().indexOfLastIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return _innerCollection().indexOfLastIndexedOrNull(predicate); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Range(from = 0, to = 0) @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().indexOfLastIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index of last --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return _innerCollection().all(predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return _innerCollection().all(predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return _innerCollection().all(predicate); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return _innerCollection().any(predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return _innerCollection().any(predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return _innerCollection().any(predicate); }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return _innerCollection().none(predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return _innerCollection().none(predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return _innerCollection().none(predicate); }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    @Override public boolean hasNull() { return _innerCollection().hasNull(); }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Override public boolean hasNoNulls() { return _innerCollection().hasNoNulls(); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Override public boolean hasDuplicate() { return _innerCollection().hasDuplicate(); }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Override public boolean hasNoDuplicates() { return _innerCollection().hasNoDuplicates(); }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    @Override public boolean has(final T value) { return _innerCollection().has(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    @Override public boolean hasNot(final T value) { return _innerCollection().hasNot(value); }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                          values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                      values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                       values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                       values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                          values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>        values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                  values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>          values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                 values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>               values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>               values) { return _innerCollection().hasOne(values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                             values) { return _innerCollection().hasOne(values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                          values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                      values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                       values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                       values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                          values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>        values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                  values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>          values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                 values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>               values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>               values) { return _innerCollection().hasNotOne(values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                             values) { return _innerCollection().hasNotOne(values); }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                          values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                      values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                       values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                       values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                          values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>        values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                  values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>          values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                 values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>               values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>               values) { return _innerCollection().hasAll(values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                             values) { return _innerCollection().hasAll(values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                          values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                      values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                       values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                       values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                          values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>        values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                  values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>          values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T> values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                 values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>        values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>           values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>        values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>               values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>               values) { return _innerCollection().hasNotAll(values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                             values) { return _innerCollection().hasNotAll(values); }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    @Override public CollectionHolder<T> requireNoNulls() {
        if (_innerCollection().hasNull())
            throw new NullPointerException("Forbidden null value. The current collection contains null values.");
        return this;
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return _innerCollection().filter(predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T> predicate) { return _innerCollection().filter(predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier predicate) { return _innerCollection().filter(predicate); }

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().filterIndexed(predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate predicate) { return _innerCollection().filterIndexed(predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier predicate) { return _innerCollection().filterIndexed(predicate); }

    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return _innerCollection().filterNot(predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T> predicate) { return _innerCollection().filterNot(predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier predicate) { return _innerCollection().filterNot(predicate); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().filterNotIndexed(predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate predicate) { return _innerCollection().filterNotIndexed(predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier predicate) { return _innerCollection().filterNotIndexed(predicate); }

    @Override public CollectionHolder<@NotNull T> filterNotNull() { return _innerCollection().filterNotNull(); }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer>                                  indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Collection<? extends Integer>                          indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedCollection<? extends Integer>                 indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return _innerCollection().slice(indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return _innerCollection().slice(indices); }

    @Override public CollectionHolder<T> slice(                                                        ) { return _innerCollection().slice(); }
    @Override public CollectionHolder<T> slice(final int               from                            ) { return _innerCollection().slice(from); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from                            ) { return _innerCollection().slice(from); }
    @Override public CollectionHolder<T> slice(final int               from, final int               to) { return _innerCollection().slice(from, to); }
    @Override public CollectionHolder<T> slice(final int               from, final @Nullable Integer to) { return _innerCollection().slice(from, to); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from, final int               to) { return _innerCollection().slice(from, to); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().slice(from, to); }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(final int     n) { return _innerCollection().drop(n); }
    @Override public CollectionHolder<T> drop(final Integer n) { return _innerCollection().drop(n); }

    @Override public CollectionHolder<T> dropWhile(final ObjIntPredicate<? super T> predicate) { return _innerCollection().dropWhile(predicate); }
    @Override public CollectionHolder<T> dropWhile(final Predicate<? super T>       predicate) { return _innerCollection().dropWhile(predicate); }
    @Override public CollectionHolder<T> dropWhile(final BooleanSupplier            predicate) { return _innerCollection().dropWhile(predicate); }

    @Override public CollectionHolder<T> dropWhileIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().dropWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(final IntPredicate               predicate) { return _innerCollection().dropWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(final BooleanSupplier            predicate) { return _innerCollection().dropWhileIndexed(predicate); }

    @Override public CollectionHolder<T> dropLast(final int     n) { return _innerCollection().dropLast(n); }
    @Override public CollectionHolder<T> dropLast(final Integer n) { return _innerCollection().dropLast(n); }

    @Override public CollectionHolder<T> dropLastWhile(final ObjIntPredicate<? super T> predicate) { return _innerCollection().dropLastWhile(predicate); }
    @Override public CollectionHolder<T> dropLastWhile(final Predicate<? super T>       predicate) { return _innerCollection().dropLastWhile(predicate); }
    @Override public CollectionHolder<T> dropLastWhile(final BooleanSupplier            predicate) { return _innerCollection().dropLastWhile(predicate); }

    @Override public CollectionHolder<T> dropLastWhileIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().dropLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(final IntPredicate               predicate) { return _innerCollection().dropLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(final BooleanSupplier            predicate) { return _innerCollection().dropLastWhileIndexed(predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(final int     n) { return _innerCollection().take(n); }
    @Override public CollectionHolder<T> take(final Integer n) { return _innerCollection().take(n); }

    @Override public CollectionHolder<T> takeWhile(final ObjIntPredicate<? super T> predicate) { return _innerCollection().takeWhile(predicate); }
    @Override public CollectionHolder<T> takeWhile(final Predicate<? super T>       predicate) { return _innerCollection().takeWhile(predicate); }
    @Override public CollectionHolder<T> takeWhile(final BooleanSupplier            predicate) { return _innerCollection().takeWhile(predicate); }

    @Override public CollectionHolder<T> takeWhileIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().takeWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(final IntPredicate               predicate) { return _innerCollection().takeWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(final BooleanSupplier            predicate) { return _innerCollection().takeWhileIndexed(predicate); }

    @Override public CollectionHolder<T> takeLast(final int     n) { return _innerCollection().takeLast(n); }
    @Override public CollectionHolder<T> takeLast(final Integer n) { return _innerCollection().takeLast(n); }

    @Override public CollectionHolder<T> takeLastWhile(final ObjIntPredicate<? super T> predicate) { return _innerCollection().takeLastWhile(predicate); }
    @Override public CollectionHolder<T> takeLastWhile(final Predicate<? super T>       predicate) { return _innerCollection().takeLastWhile(predicate); }
    @Override public CollectionHolder<T> takeLastWhile(final BooleanSupplier            predicate) { return _innerCollection().takeLastWhile(predicate); }

    @Override public CollectionHolder<T> takeLastWhileIndexed(final IntObjPredicate<? super T> predicate) { return _innerCollection().takeLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(final IntPredicate               predicate) { return _innerCollection().takeLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(final BooleanSupplier            predicate) { return _innerCollection().takeLastWhileIndexed(predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Map --------------------

    @Override public <U> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().map(transform); }
    @Override public <U> CollectionHolder<U> map(final Function<? super T, ? extends U>       transform) { return _innerCollection().map(transform); }
    @Override public <U> CollectionHolder<U> map(final Supplier<? extends U>                  transform) { return _innerCollection().map(transform); }

    @Override public <U> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> transform) { return _innerCollection().mapIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               transform) { return _innerCollection().mapIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  transform) { return _innerCollection().mapIndexed(transform); }

    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().mapNotNull(transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends U>       transform) { return _innerCollection().mapNotNull(transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends U>                  transform) { return _innerCollection().mapNotNull(transform); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends U> transform) { return _innerCollection().mapNotNullIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends U>               transform) { return _innerCollection().mapNotNullIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends U>                  transform) { return _innerCollection().mapNotNullIndexed(transform); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { _innerCollection().forEach(action); }
    @Override public void forEach(final Consumer<? super T> action) { _innerCollection().forEach(action); }
    @Override public void forEach(final Runnable action) { _innerCollection().forEach(action); }

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { _innerCollection().forEachIndexed(action); }
    @Override public void forEachIndexed(final IntConsumer action) { _innerCollection().forEachIndexed(action); }
    @Override public void forEachIndexed(final Runnable action) { _innerCollection().forEachIndexed(action); }


    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf0Or1<T> onEach(final ObjIntConsumer<? super T> action) {
        _innerCollection().forEach(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf0Or1<T> onEach(final Consumer<? super T> action) {
        _innerCollection().forEach(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf0Or1<T> onEach(final Runnable action) {
        _innerCollection().forEach(action);
        return this;
    }


    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf0Or1<T> onEachIndexed(final IntObjConsumer<? super T> action) {
        _innerCollection().forEachIndexed(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf0Or1<T> onEachIndexed(final IntConsumer action) {
        _innerCollection().forEachIndexed(action);
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public LazyCollectionHolderOf0Or1<T> onEachIndexed(final Runnable action) {
        _innerCollection().forEachIndexed(action);
        return this;
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    @Override public CollectionHolder<T> toReverse(                                                        ) { return _innerCollection().toReverse(); }
    @Override public CollectionHolder<T> toReverse(final int               from                            ) { return _innerCollection().toReverse(from); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from                            ) { return _innerCollection().toReverse(from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int               to) { return _innerCollection().toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final int               from, final @Nullable Integer to) { return _innerCollection().toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int               to) { return _innerCollection().toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final @Nullable Integer to) { return _innerCollection().toReverse(from, to); }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    @Override public CollectionIterator<T> toIterator() { return _innerCollection().toIterator(); }
    @Override public Spliterator<T> toSpliterator() { return _innerCollection().toSpliterator(); }

    //#endregion -------------------- To iterator --------------------

    //#region -------------------- To array --------------------

    @Override public                              T[] toArray(                                                      ) { return _innerCollection().toArray(); }
    @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toArray(transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return _innerCollection().toArray(transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return _innerCollection().toArray(transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Override public                              ImmutableCollection<T> toCollection(                                                      ) { return _innerCollection().toCollection(); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return _innerCollection().toCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return _innerCollection().toCollection(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return _innerCollection().toMutableCollection(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableCollection(transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Override public                              ImmutableSequencedCollection<T> toSequencedCollection(                                                      ) { return _innerCollection().toSequencedCollection(); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toSequencedCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return _innerCollection().toSequencedCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return _innerCollection().toSequencedCollection(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return _innerCollection().toMutableSequencedCollection(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSequencedCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSequencedCollection(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSequencedCollection(transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Override public                              ImmutableList<T> toList(                                                      ) { return _innerCollection().toList(); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toList(transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toList(transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return _innerCollection().toList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableList<T> toMutableList(                                                      ) { return _innerCollection().toMutableList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableList(transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Override public                              ImmutableArrayList<T> toArrayList(                                                      ) { return _innerCollection().toArrayList(); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return _innerCollection().toArrayList(transform); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                               ) { return _innerCollection().toMutableArrayList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(final int               initialCapacity                                                        ) { return _innerCollection().toMutableArrayList(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableArrayList<T> toMutableArrayList(final @Nullable Integer initialCapacity                                                        ) { return _innerCollection().toMutableArrayList(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayList(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayList(initialCapacity, transform); }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

    @Override public                              ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList(                                                      ) { return _innerCollection().toCopyOnWriteArrayList(); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toCopyOnWriteArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toCopyOnWriteArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return _innerCollection().toCopyOnWriteArrayList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return _innerCollection().toMutableCopyOnWriteArrayList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableCopyOnWriteArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableCopyOnWriteArrayList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableCopyOnWriteArrayList(transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Override public                              ImmutableLinkedList<T> toLinkedList(                                                      ) { return _innerCollection().toLinkedList(); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toLinkedList(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toLinkedList(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return _innerCollection().toLinkedList(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return _innerCollection().toMutableLinkedList(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedList(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedList(transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Override public                              ImmutableVector<T> toVector(                                                      ) { return _innerCollection().toVector(); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toVector(transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return _innerCollection().toVector(transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return _innerCollection().toVector(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableVector<T> toMutableVector(                                                                                               ) { return _innerCollection().toMutableVector(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableVector(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableVector(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutableVector(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableVector<T> toMutableVector(final int               initialCapacity                                                        ) { return _innerCollection().toMutableVector(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableVector<T> toMutableVector(final @Nullable Integer initialCapacity                                                        ) { return _innerCollection().toMutableVector(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableVector(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableVector(initialCapacity, transform); }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

    @Override public                              ImmutableSet<T> toSet(                                                      ) { return _innerCollection().toSet(); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return _innerCollection().toSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return _innerCollection().toMutableSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSet(transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Override public                              ImmutableSequencedSet<T> toSequencedSet(                                                      ) { return _innerCollection().toSequencedSet(); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toSequencedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return _innerCollection().toSequencedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toSequencedSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return _innerCollection().toMutableSequencedSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSequencedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSequencedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSequencedSet(transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Override public                              ImmutableSortedSet<T> toSortedSet(                                                      ) { return _innerCollection().toSortedSet(); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toSortedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return _innerCollection().toSortedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toSortedSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return _innerCollection().toMutableSortedSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSortedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSortedSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSortedSet(transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Override public                              ImmutableNavigableSet<T> toNavigableSet(                                                      ) { return _innerCollection().toNavigableSet(); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toNavigableSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return _innerCollection().toNavigableSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toNavigableSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return _innerCollection().toMutableNavigableSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableNavigableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableNavigableSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableNavigableSet(transform); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

                                                 @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toConcurrentSkipListSet(transform); }
                                                 @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return _innerCollection().toConcurrentSkipListSet(transform); }
                                                 @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return _innerCollection().toConcurrentSkipListSet(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toConcurrentSkipListSet(comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableConcurrentSkipListSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableConcurrentSkipListSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return _innerCollection().toMutableConcurrentSkipListSet(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableConcurrentSkipListSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U                              > MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableConcurrentSkipListSet(comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toCopyOnWriteArraySet(transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toCopyOnWriteArraySet(transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return _innerCollection().toCopyOnWriteArraySet(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableCopyOnWriteArraySet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableCopyOnWriteArraySet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableCopyOnWriteArraySet(transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableEnumSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableEnumSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableEnumSet(transform); }

    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableEnumSet(clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableEnumSet(clazz, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableEnumSet(clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(                                                                                        ) { return _innerCollection().toHashSet(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toHashSet(            transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final Function<? super T, ? extends U>       transform) { return _innerCollection().toHashSet(            transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final Supplier<? extends U>                  transform) { return _innerCollection().toHashSet(            transform); }
    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(final float           loadFactor                                                        ) { return _innerCollection().toHashSet(loadFactor); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final Function<? super T, ? extends U>       transform) { return _innerCollection().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final Supplier<? extends U>                  transform) { return _innerCollection().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public                              ImmutableHashSet<T> toHashSet(final @Nullable Float loadFactor                                                        ) { return _innerCollection().toHashSet(loadFactor); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return _innerCollection().toHashSet(loadFactor, transform); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return _innerCollection().toHashSet(loadFactor, transform); }


    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(                                                                                                                                 ) { return _innerCollection().toMutableHashSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity                                                                                          ) { return _innerCollection().toMutableHashSet(initialCapacity); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity                                                                                          ) { return _innerCollection().toMutableHashSet(initialCapacity); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final float           loadFactor                                                        ) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor                                                        ) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor                                                        ) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor                                                        ) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableHashSet(initialCapacity, loadFactor, transform); }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Override public                              ImmutableLinkedHashSet<T> toLinkedHashSet(                                                      ) { return _innerCollection().toLinkedHashSet(); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toLinkedHashSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toLinkedHashSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return _innerCollection().toLinkedHashSet(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return _innerCollection().toMutableLinkedHashSet(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedHashSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedHashSet(transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toTreeSet(transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return _innerCollection().toTreeSet(transform); }
    @Contract(pure = true)                       @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return _innerCollection().toTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return _innerCollection().toTreeSet(comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toTreeSet(comparator, transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return _innerCollection().toMutableTreeSet(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return _innerCollection().toMutableTreeSet(comparator); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableTreeSet(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends @Nullable Object               > MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableTreeSet(comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Override public                              ImmutableQueue<T> toQueue(                                                      ) { return _innerCollection().toQueue(); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toQueue(transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toQueue(transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toQueue(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return _innerCollection().toMutableQueue(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableQueue(transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toBlockingQueue(transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toBlockingQueue(transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toBlockingQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableBlockingQueue(transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toTransferQueue(transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toTransferQueue(transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toTransferQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableTransferQueue(transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toArrayBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toArrayBlockingQueue(transform); }
    @Contract(pure = true) @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toArrayBlockingQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                  final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                  final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                  final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity,                                 final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity,                                 final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity,                                 final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity,                                 final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity,                                 final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity,                                 final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity, final boolean           isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity, final boolean           isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity, final boolean           isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity, final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity, final @Nullable Boolean isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final int               capacity, final @Nullable Boolean isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final boolean           isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final boolean           isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final boolean           isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final @Nullable Boolean isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Nullable Integer capacity, final @Nullable Boolean isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                  final boolean           isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                  final boolean           isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                  final boolean           isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                  final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                  final @Nullable Boolean isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                  final @Nullable Boolean isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayBlockingQueue(isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toConcurrentLinkedQueue(transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toConcurrentLinkedQueue(transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toConcurrentLinkedQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableConcurrentLinkedQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableConcurrentLinkedQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableConcurrentLinkedQueue(transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toDelayQueue(transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toDelayQueue(transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toDelayQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableDelayQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableDelayQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableDelayQueue(transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toLinkedBlockingQueue(transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toLinkedBlockingQueue(transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toLinkedBlockingQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                  final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                  final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                  final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final int               capacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final int               capacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final int               capacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable Integer capacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable Integer capacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Nullable Integer capacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedBlockingQueue(capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toLinkedTransferQueue(transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toLinkedTransferQueue(transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toLinkedTransferQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedTransferQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedTransferQueue(transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toPriorityBlockingQueue(transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return _innerCollection().toPriorityBlockingQueue(transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return _innerCollection().toPriorityBlockingQueue(transform); }
    @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toPriorityBlockingQueue(comparator, transform); }
    @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toPriorityBlockingQueue(comparator, transform); }
    @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toPriorityBlockingQueue(comparator, transform); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityBlockingQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toPriorityQueue(transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return _innerCollection().toPriorityQueue(transform); }
    @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return _innerCollection().toPriorityQueue(transform); }
    @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toPriorityQueue(comparator, transform); }
    @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toPriorityQueue(comparator, transform); }
    @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toPriorityQueue(comparator, transform); }


    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityQueue(comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(value = ALWAYS_NEW_3, pure = true) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return _innerCollection().toMutablePriorityQueue(initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toSynchronousQueue(transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return _innerCollection().toSynchronousQueue(transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return _innerCollection().toSynchronousQueue(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                                final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSynchronousQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                                final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSynchronousQueue(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                                final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSynchronousQueue(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean           isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean           isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean           isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable Boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable Boolean isFair, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableSynchronousQueue(isFair, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final @Nullable Boolean isFair, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableSynchronousQueue(isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Override public                              ImmutableDeque<T> toDeque(                                                      ) { return _innerCollection().toDeque(); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toDeque(transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toDeque(transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toDeque(transform); }

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return _innerCollection().toMutableDeque(); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableDeque(transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toBlockingDeque(transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toBlockingDeque(transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toBlockingDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableBlockingDeque(transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toArrayDeque(transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toArrayDeque(transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toArrayDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                                         final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                                         final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                                         final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayDeque(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayDeque(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayDeque(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int               initialCapacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayDeque(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableArrayDeque(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableArrayDeque(initialCapacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableArrayDeque(initialCapacity, transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toConcurrentLinkedDeque(transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toConcurrentLinkedDeque(transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toConcurrentLinkedDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableConcurrentLinkedDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableConcurrentLinkedDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableConcurrentLinkedDeque(transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toLinkedBlockingDeque(transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return _innerCollection().toLinkedBlockingDeque(transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return _innerCollection().toLinkedBlockingDeque(transform); }

    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                  final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                  final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_1, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                  final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedBlockingDeque(transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final int               capacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final int               capacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final int               capacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Nullable Integer capacity, final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Nullable Integer capacity, final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(value = ALWAYS_NEW_2, pure = true) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Nullable Integer capacity, final Supplier<? extends U>                  transform) { return _innerCollection().toMutableLinkedBlockingDeque(capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Override public                              ImmutableStack<T> toStack(                                                      ) { return _innerCollection().toStack(); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toStack(transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return _innerCollection().toStack(transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return _innerCollection().toStack(transform); }

    @Override public                              MutableStack<T> toMutableStack(                                                      ) { return _innerCollection().toMutableStack(); }
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return _innerCollection().toMutableStack(transform); }
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return _innerCollection().toMutableStack(transform); }
    @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return _innerCollection().toMutableStack(transform); }

    //#endregion -------------------- To stack --------------------

    //#region -------------------- To map --------------------

    @Override public @Unmodifiable Map<Integer, T> toMap() { throw new RuntimeException("TODO: Implements toMap method"); }

    @Override public Map<Integer, T> toMutableMap() { throw new RuntimeException("TODO: Implements toMutableMap method"); }

    //#endregion -------------------- To map --------------------
    //#region -------------------- To sequenced map --------------------

    @Override public @Unmodifiable SequencedMap<Integer, T> toSequencedMap() { throw new RuntimeException("TODO: Implements toSequencedMap method"); }

    @Override public SequencedMap<Integer, T> toMutableSequencedMap() { throw new RuntimeException("TODO: Implements toMutableSequencedMap method"); }

    //#endregion -------------------- To sequenced map --------------------
    //#region -------------------- To sorted map --------------------

    @Override public @Unmodifiable SortedMap<Integer, T> toSortedMap() { throw new RuntimeException("TODO: Implements toSortedMap method"); }

    @Override public SortedMap<Integer, T> toMutableSortedMap() { throw new RuntimeException("TODO: Implements toMutableSortedMap method"); }

    //#endregion -------------------- To sortedMap --------------------
    //#region -------------------- To navigable map --------------------

    @Override public @Unmodifiable NavigableMap<Integer, T> toNavigableMap() { throw new RuntimeException("TODO: Implements toNavigableMap method"); }

    @Override public NavigableMap<Integer, T> toMutableNavigableMap() { throw new RuntimeException("TODO: Implements toMutableNavigableMap method"); }

    //#endregion -------------------- To navigable map --------------------
    //#region -------------------- To concurrent map --------------------

    @Override public @Unmodifiable ConcurrentMap<Integer, T> toConcurrentMap() { throw new RuntimeException("TODO: Implements toConcurrentMap method"); }

    @Override public ConcurrentMap<Integer, T> toMutableConcurrentMap() { throw new RuntimeException("TODO: Implements toMutableConcurrentMap method"); }

    //#endregion -------------------- To concurrent map --------------------
    //#region -------------------- To concurrent navigable map --------------------

    @Override public @Unmodifiable ConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements toConcurrentNavigableMap method"); }

    @Override public ConcurrentNavigableMap<Integer, T> toMutableConcurrentNavigableMap() { throw new RuntimeException("TODO: Implements toMutableConcurrentNavigableMap method"); }

    //#endregion -------------------- To concurrent navigable map --------------------
    //#region -------------------- To concurrent hash map --------------------

    @Override public @Unmodifiable ConcurrentHashMap<Integer, T> toConcurrentHashMap() { throw new RuntimeException("TODO: Implements toConcurrentHashMap method"); }

    @Override public ConcurrentHashMap<Integer, T> toMutableConcurrentHashMap() { throw new RuntimeException("TODO: Implements toMutableConcurrentHashMap method"); }

    //#endregion -------------------- To concurrent hash map --------------------
    //#region -------------------- To concurrent skip list map --------------------

    @Override public @Unmodifiable ConcurrentSkipListMap<Integer, T> toConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements toConcurrentSkipListMap method"); }

    @Override public ConcurrentSkipListMap<Integer, T> toMutableConcurrentSkipListMap() { throw new RuntimeException("TODO: Implements toMutableConcurrentSkipListMap method"); }

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

    @Override public @Unmodifiable HashMap<Integer, T> toHashMap() { throw new RuntimeException("TODO: Implements toHashMap method"); }

    @Override public HashMap<Integer, T> toMutableHashMap() { throw new RuntimeException("TODO: Implements toMutableHashMap method"); }

    //#endregion -------------------- To hash map --------------------
    //#region -------------------- To hashtable --------------------

    @Override public @Unmodifiable Hashtable<Integer, T> toHashtable() { throw new RuntimeException("TODO: Implements toHashtable method"); }

    @Override public Hashtable<Integer, T> toMutableHashtable() { throw new RuntimeException("TODO: Implements toMutableHashtable method"); }

    //#endregion -------------------- To hashtable --------------------
    //#region -------------------- To identity hash map --------------------

    @Override public @Unmodifiable IdentityHashMap<Integer, T> toIdentityHashMap() { throw new RuntimeException("TODO: Implements toIdentityHashMap method"); }

    @Override public IdentityHashMap<Integer, T> toMutableIdentityHashMap() { throw new RuntimeException("TODO: Implements toMutableIdentityHashMap method"); }

    //#endregion -------------------- To identity hash map --------------------
    //#region -------------------- To linked hash map --------------------

    @Override public @Unmodifiable LinkedHashMap<Integer, T> toLinkedHashMap() { throw new RuntimeException("TODO: Implements toLinkedHashMap method"); }

    @Override public LinkedHashMap<Integer, T> toMutableLinkedHashMap() { throw new RuntimeException("TODO: Implements toMutableLinkedHashMap method"); }

    //#endregion -------------------- To linked hash map --------------------
    //#region -------------------- To tree map --------------------

    @Override public @Unmodifiable TreeMap<Integer, T> toTreeMap() { throw new RuntimeException("TODO: Implements toTreeMap method"); }

    @Override public TreeMap<Integer, T> toMutableTreeMap() { throw new RuntimeException("TODO: Implements toMutableTreeMap method"); }

    //#endregion -------------------- To tree map --------------------
    //#region -------------------- To weak hash map --------------------

    @Override public @Unmodifiable WeakHashMap<Integer, T> toWeakHashMap() { throw new RuntimeException("TODO: Implements toWeakHashMap method"); }

    @Override public WeakHashMap<Integer, T> toMutableWeakHashMap() { throw new RuntimeException("TODO: Implements toMutableWeakHashMap method"); }

    //#endregion -------------------- To weak hash map --------------------

    //#region -------------------- To string --------------------

    @Override public String toString() { return _innerCollection().toString(); }

    @Override public String toLocaleString(                             ) { return _innerCollection().toLocaleString(); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return _innerCollection().toLocaleString(locale); }

    @Override public String toLowerCaseString() { return _innerCollection().toLowerCaseString(); }

    @Override public String toLocaleLowerCaseString(                             ) { return _innerCollection().toLocaleLowerCaseString(); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return _innerCollection().toLocaleLowerCaseString(locale); }

    @Override public String toUpperCaseString() { return _innerCollection().toUpperCaseString(); }

    @Override public String toLocaleUpperCaseString(                             ) { return _innerCollection().toLocaleUpperCaseString(); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return _innerCollection().toLocaleUpperCaseString(locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    //#region -------------------- Join to string ∅ methods --------------------

    @Override public String joinToString() { return _innerCollection().joinToString(); }

    //#endregion -------------------- Join to string ∅ methods --------------------
    //#region -------------------- Join to string (separator) methods --------------------

    @Override public String joinToString(final @Nullable String    separator) { return _innerCollection().joinToString(separator); }
    @Override public String joinToString(final @Nullable Character separator) { return _innerCollection().joinToString(separator); }
    @Override public String joinToString(final char                separator) { return _innerCollection().joinToString(separator); }

    //#endregion -------------------- Join to string (separator) methods --------------------
    //#region -------------------- Join to string (separator, prefix) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix) { return _innerCollection().joinToString(separator, prefix); }
    @Override public String joinToString(final char                separator, final char                prefix) { return _innerCollection().joinToString(separator, prefix); }

    //#endregion -------------------- Join to string (separator, prefix) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix) { return _innerCollection().joinToString(separator, prefix, postfix); }

    //#endregion -------------------- Join to string (separator, prefix, postfix) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return _innerCollection().joinToString(separator, prefix, postfix, limit); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T, int) → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T, int) → string) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T) → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T) → string) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform () → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return _innerCollection().joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform () → string) methods --------------------

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
        if (isEmpty())
            if (other instanceof CollectionHolder<?> otherConverted2)
                return otherConverted2.isEmpty();
            else
                return otherConverted.size() == 0;

        // The other needs to be of size 1 since 0 is no longer possible at this point
        if (other instanceof CollectionHolder<?> otherConverted2)
            if (otherConverted2.hasExactly1Element())
                return Objects.deepEquals(getFirst(), otherConverted2.getFirst());
            else
                return false;
        if (otherConverted.size() == 1)
            return Objects.deepEquals(getFirst(), otherConverted.get(0));
        return false;
    }

    //#endregion -------------------- Equals --------------------

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public LazyCollectionHolderOf0Or1<T> clone() { return (LazyCollectionHolderOf0Or1<T>) super.clone(); }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public LazyCollectionHolderOf0Or1<T> shallowClone() { return clone(); }
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public LazyCollectionHolderOf0Or1<T> deepClone() {
//        final var innerCollection = __innerCollection;
//        if (innerCollection == null)
//            return new LazyCollectionHolderOf0Or1<>(() -> __latePossibleValue.get().clone());
//
//        final var newInstance = new LazyCollectionHolderOf0Or1<T>(() -> { throw new RuntimeException("The Supplier should never be called in normal circumstance."); });
//        newInstance.__innerCollection = innerCollection.deepClone();
//        return newInstance;
//    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
