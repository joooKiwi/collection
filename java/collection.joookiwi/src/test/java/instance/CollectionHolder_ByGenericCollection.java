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
import joookiwi.collection.java.GenericCollectionHolder;
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
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
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
import static org.junit.jupiter.api.Assertions.fail;

/// A class to test the functionality of a [GenericCollectionHolder]
///
/// @param <T> The type
@NotNullByDefault
public final class CollectionHolder_ByGenericCollection<T extends @Nullable Object>
        extends AbstractCollectionHolderForTest<T, CollectionHolder_ByGenericCollection<T>> {

    /// Tell that the instance is **not** of the type [MinimalistCollectionHolder] directly
    public static final boolean IS_MINIMALIST = false;
    /// Tell that the instance is **not** based on the extension methods directly
    public static final boolean IS_EXTENSION = false;
    /// The simplified named to be used in the test “ParameterizedTest” or “ParameterizedClass”
    public static final String SIMPLIFIED_NAME = "normal";

    /// The internal instance that is tested
    public final GenericCollectionHolder<T> instance;

    @NotNullByDefault
    static final class CollectionHolder_CountingGetByGenericCollection<T extends @Nullable Object>
            extends GenericCollectionHolder<T> {

        /// The external instance of the [GenericCollectionHolder] for the test
        final CollectionHolder_ByGenericCollection<T> thiz;

        CollectionHolder_CountingGetByGenericCollection(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] reference,
                                                        final CollectionHolder_ByGenericCollection<T> thiz) {
            super(reference);
            this.thiz = thiz;
        }

        @Override public T get(final int index) {
            thiz.amountOfCall++;
            return super.get(index);
        }

    }

    public CollectionHolder_ByGenericCollection(final T @Unmodifiable [] array) {
        super(array);
        instance = new CollectionHolder_CountingGetByGenericCollection<>(array, this);
    }

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return instance.size(); }
    @Override public boolean isEmpty() { return instance.isEmpty(); }
    @Override public boolean isNotEmpty() { return instance.isNotEmpty(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public T get(final int index) { return instance.get(index); }
    @Override public T getFirst() { return instance.getFirst(); }
    @Override public T getLast() { return instance.getLast(); }

    @Override public T getOrElse(final int index, final IntFunction<? extends T> defaultValue) { return instance.getOrElse(index, defaultValue); }
    @Override public T getOrElse(final int index, final Supplier<? extends T>    defaultValue) { return instance.getOrElse(index, defaultValue); }
    @Override public T getFirstOrElse(final Supplier<? extends T> defaultValue) { return instance.getFirstOrElse(defaultValue); }
    @Override public T getLastOrElse(final Supplier<? extends T> defaultValue) { return instance.getLastOrElse(defaultValue); }

    @Override public @Nullable T getOrNull(final int index) { return instance.getOrNull(index); }
    @Override public @Nullable T getFirstOrNull() { return instance.getFirstOrNull(); }
    @Override public @Nullable T getLastOrNull() { return instance.getLastOrNull(); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    @Override public T findFirst(final ObjIntPredicate<? super T> predicate) { return instance.findFirst(predicate); }
    @Override public T findFirst(final Predicate<? super T>       predicate) { return instance.findFirst(predicate); }
    @Override public T findFirst(final BooleanSupplier            predicate) { return instance.findFirst(predicate); }

    @Override public @Nullable T findFirstOrNull(final ObjIntPredicate<? super T> predicate) { return instance.findFirstOrNull(predicate); }
    @Override public @Nullable T findFirstOrNull(final Predicate<? super T>       predicate) { return instance.findFirstOrNull(predicate); }
    @Override public @Nullable T findFirstOrNull(final BooleanSupplier            predicate) { return instance.findFirstOrNull(predicate); }

    @Override public T findFirstIndexed(final IntObjPredicate<? super T> predicate) { return instance.findFirstIndexed(predicate); }
    @Override public T findFirstIndexed(final IntPredicate               predicate) { return instance.findFirstIndexed(predicate); }
    @Override public T findFirstIndexed(final BooleanSupplier            predicate) { return instance.findFirstIndexed(predicate); }

    @Override public @Nullable T findFirstIndexedOrNull(final IntObjPredicate<? super T> predicate) { return instance.findFirstIndexedOrNull(predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final IntPredicate               predicate) { return instance.findFirstIndexedOrNull(predicate); }
    @Override public @Nullable T findFirstIndexedOrNull(final BooleanSupplier            predicate) { return instance.findFirstIndexedOrNull(predicate); }


    @Override public T findLast(final ObjIntPredicate<? super T> predicate) { return instance.findLast(predicate); }
    @Override public T findLast(final Predicate<? super T>       predicate) { return instance.findLast(predicate); }
    @Override public T findLast(final BooleanSupplier            predicate) { return instance.findLast(predicate); }

    @Override public @Nullable T findLastOrNull(final ObjIntPredicate<? super T> predicate) { return instance.findLastOrNull(predicate); }
    @Override public @Nullable T findLastOrNull(final Predicate<? super T>       predicate) { return instance.findLastOrNull(predicate); }
    @Override public @Nullable T findLastOrNull(final BooleanSupplier            predicate) { return instance.findLastOrNull(predicate); }

    @Override public T findLastIndexed(final IntObjPredicate<? super T> predicate) { return instance.findLastIndexed(predicate); }
    @Override public T findLastIndexed(final IntPredicate               predicate) { return instance.findLastIndexed(predicate); }
    @Override public T findLastIndexed(final BooleanSupplier            predicate) { return instance.findLastIndexed(predicate); }

    @Override public @Nullable T findLastIndexedOrNull(final IntObjPredicate<? super T> predicate) { return instance.findLastIndexedOrNull(predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final IntPredicate               predicate) { return instance.findLastIndexedOrNull(predicate); }
    @Override public @Nullable T findLastIndexedOrNull(final BooleanSupplier            predicate) { return instance.findLastIndexedOrNull(predicate); }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    @Override public int firstIndexOf(final T element                                                          ) { return instance.firstIndexOf(element); }
    @Override public int firstIndexOf(final T element, final int               from                            ) { return instance.firstIndexOf(element, from); }
    @Override public int firstIndexOf(final T element, final @Nullable Integer from                            ) { return instance.firstIndexOf(element, from); }
    @Override public int firstIndexOf(final T element, final int               from, final int               to) { return instance.firstIndexOf(element, from, to); }
    @Override public int firstIndexOf(final T element, final int               from, final @Nullable Integer to) { return instance.firstIndexOf(element, from, to); }
    @Override public int firstIndexOf(final T element, final @Nullable Integer from, final int               to) { return instance.firstIndexOf(element, from, to); }
    @Override public int firstIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return instance.firstIndexOf(element, from, to); }

    @Override public @Nullable Integer firstIndexOfOrNull(final T element                                                          ) { return instance.firstIndexOfOrNull(element); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final int               from                            ) { return instance.firstIndexOfOrNull(element, from); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from                            ) { return instance.firstIndexOfOrNull(element, from); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final int               to) { return instance.firstIndexOfOrNull(element, from, to); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return instance.firstIndexOfOrNull(element, from, to); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return instance.firstIndexOfOrNull(element, from, to); }
    @Override public @Nullable Integer firstIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return instance.firstIndexOfOrNull(element, from, to); }


    @Override public int lastIndexOf(final T element                                                          ) { return instance.lastIndexOf(element); }
    @Override public int lastIndexOf(final T element, final int               from                            ) { return instance.lastIndexOf(element, from); }
    @Override public int lastIndexOf(final T element, final @Nullable Integer from                            ) { return instance.lastIndexOf(element, from); }
    @Override public int lastIndexOf(final T element, final int               from, final int               to) { return instance.lastIndexOf(element, from, to); }
    @Override public int lastIndexOf(final T element, final int               from, final @Nullable Integer to) { return instance.lastIndexOf(element, from, to); }
    @Override public int lastIndexOf(final T element, final @Nullable Integer from, final int               to) { return instance.lastIndexOf(element, from, to); }
    @Override public int lastIndexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return instance.lastIndexOf(element, from, to); }

    @Override public @Nullable Integer lastIndexOfOrNull(final T element                                                          ) { return instance.lastIndexOfOrNull(element); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final int               from                            ) { return instance.lastIndexOfOrNull(element, from); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from                            ) { return instance.lastIndexOfOrNull(element, from); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final int               to) { return instance.lastIndexOfOrNull(element, from, to); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return instance.lastIndexOfOrNull(element, from, to); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return instance.lastIndexOfOrNull(element, from, to); }
    @Override public @Nullable Integer lastIndexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return instance.lastIndexOfOrNull(element, from, to); }


    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate                                                          ) { return instance.indexOfFirst(predicate); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate                                                          ) { return instance.indexOfFirst(predicate); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate                                                          ) { return instance.indexOfFirst(predicate); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfFirst(predicate, from); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfFirst(predicate, from); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final int               from                            ) { return instance.indexOfFirst(predicate, from); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return instance.indexOfFirst(predicate, from); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfFirst(predicate, from); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfFirst(predicate, from); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final int               to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirst(predicate, from, to); }
    @Override public int indexOfFirst(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirst(predicate, from, to); }

    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return instance.indexOfFirstOrNull(predicate); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate                                                          ) { return instance.indexOfFirstOrNull(predicate); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate                                                          ) { return instance.indexOfFirstOrNull(predicate); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfFirstOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return instance.indexOfFirstOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfFirstOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstOrNull(predicate, from, to); }

    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return instance.indexOfFirstIndexed(predicate); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate                                                          ) { return instance.indexOfFirstIndexed(predicate); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate                                                          ) { return instance.indexOfFirstIndexed(predicate); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfFirstIndexed(predicate, from); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstIndexed(predicate, from); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final int               from                            ) { return instance.indexOfFirstIndexed(predicate, from); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstIndexed(predicate, from); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfFirstIndexed(predicate, from); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstIndexed(predicate, from); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final int               to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstIndexed(predicate, from, to); }
    @Override public int indexOfFirstIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstIndexed(predicate, from, to); }

    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return instance.indexOfFirstIndexedOrNull(predicate); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate                                                          ) { return instance.indexOfFirstIndexedOrNull(predicate); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return instance.indexOfFirstIndexedOrNull(predicate); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return instance.indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfFirstIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfFirstIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfFirstIndexedOrNull(predicate, from, to); }


    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate                                                          ) { return instance.indexOfLast(predicate); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate                                                          ) { return instance.indexOfLast(predicate); }
    @Override public int indexOfLast(final BooleanSupplier            predicate                                                          ) { return instance.indexOfLast(predicate); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfLast(predicate, from); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfLast(predicate, from); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final int               from                            ) { return instance.indexOfLast(predicate, from); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return instance.indexOfLast(predicate, from); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfLast(predicate, from); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfLast(predicate, from); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final int               from, final int               to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLast(predicate, from, to); }
    @Override public int indexOfLast(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLast(predicate, from, to); }

    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return instance.indexOfLastOrNull(predicate); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate                                                          ) { return instance.indexOfLastOrNull(predicate); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate                                                          ) { return instance.indexOfLastOrNull(predicate); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfLastOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfLastOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return instance.indexOfLastOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return instance.indexOfLastOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfLastOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfLastOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastOrNull(predicate, from, to); }

    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return instance.indexOfLastIndexed(predicate); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate                                                          ) { return instance.indexOfLastIndexed(predicate); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate                                                          ) { return instance.indexOfLastIndexed(predicate); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfLastIndexed(predicate, from); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfLastIndexed(predicate, from); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final int               from                            ) { return instance.indexOfLastIndexed(predicate, from); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return instance.indexOfLastIndexed(predicate, from); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfLastIndexed(predicate, from); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfLastIndexed(predicate, from); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final int               to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastIndexed(predicate, from, to); }
    @Override public int indexOfLastIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastIndexed(predicate, from, to); }

    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return instance.indexOfLastIndexedOrNull(predicate); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate                                                          ) { return instance.indexOfLastIndexedOrNull(predicate); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return instance.indexOfLastIndexedOrNull(predicate); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return instance.indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return instance.indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return instance.indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return instance.indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return instance.indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return instance.indexOfLastIndexedOrNull(predicate, from); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public @Nullable Integer indexOfLastIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return instance.indexOfLastIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    @Override public boolean all(final ObjIntPredicate<? super T> predicate) { return instance.all(predicate); }
    @Override public boolean all(final Predicate<? super T>       predicate) { return instance.all(predicate); }
    @Override public boolean all(final BooleanSupplier            predicate) { return instance.all(predicate); }

    @Override public boolean any(                                                    ) { return instance.any(); }
    @Override public boolean any(final @Nullable ObjIntPredicate<? super T> predicate) { return instance.any(predicate); }
    @Override public boolean any(final @Nullable Predicate<? super T>       predicate) { return instance.any(predicate); }
    @Override public boolean any(final @Nullable BooleanSupplier            predicate) { return instance.any(predicate); }

    @Override public boolean none(                                                    ) { return instance.none(); }
    @Override public boolean none(final @Nullable ObjIntPredicate<? super T> predicate) { return instance.none(predicate); }
    @Override public boolean none(final @Nullable Predicate<? super T>       predicate) { return instance.none(predicate); }
    @Override public boolean none(final @Nullable BooleanSupplier            predicate) { return instance.none(predicate); }


    @Override public boolean hasNull() { return instance.hasNull(); }

    @Override public boolean hasNoNulls() { return instance.hasNoNulls(); }


    @Override public boolean hasDuplicate() { return instance.hasDuplicate(); }

    @Override public boolean hasNoDuplicates() { return instance.hasNoDuplicates(); }


    @Override public boolean has(final T value) { return instance.has(value); }

    @Override public boolean hasNot(final T value) { return instance.hasNot(value); }


    @Override public boolean hasOne(final @Nullable Iterator<? extends T>                            values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable ListIterator<? extends T>                        values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable Spliterator<? extends T>                         values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable Enumeration<? extends T>                         values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable Iterable<? extends T>                            values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends T>                    values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return instance.hasOne(values); }
    @Override public boolean hasOne(final T @Nullable @Unmodifiable []                               values) { return instance.hasOne(values); }

    @Override public boolean hasNotOne(final @Nullable Iterator<? extends T>                            values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable ListIterator<? extends T>                        values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Spliterator<? extends T>                         values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Enumeration<? extends T>                         values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable Iterable<? extends T>                            values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable CollectionHolder<? extends T>                    values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Collection<? extends T>            values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable List<? extends T>                  values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Set<? extends T>                   values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return instance.hasNotOne(values); }
    @Override public boolean hasNotOne(final T @Nullable @Unmodifiable []                               values) { return instance.hasNotOne(values); }


    @Override public boolean hasAll(final @Nullable Iterator<? extends T>                            values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable ListIterator<? extends T>                        values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable Spliterator<? extends T>                         values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable Enumeration<? extends T>                         values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable Iterable<? extends T>                            values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable CollectionHolder<? extends T>                    values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return instance.hasAll(values); }
    @Override public boolean hasAll(final T @Nullable @Unmodifiable []                               values) { return instance.hasAll(values); }

    @Override public boolean hasNotAll(final @Nullable Iterator<? extends T>                            values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable ListIterator<? extends T>                        values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Spliterator<? extends T>                         values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Enumeration<? extends T>                         values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable Iterable<? extends T>                            values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable MinimalistCollectionHolder<? extends T>          values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable CollectionHolder<? extends T>                    values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Collection<? extends T>            values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedCollection<? extends T>   values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable List<? extends T>                  values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Set<? extends T>                   values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SequencedSet<? extends T>          values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable SortedSet<? extends T>             values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable NavigableSet<? extends T>          values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Queue<? extends T>                 values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingQueue<? extends T>         values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable TransferQueue<? extends T>         values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final @Nullable @Unmodifiable BlockingDeque<? extends T>         values) { return instance.hasNotAll(values); }
    @Override public boolean hasNotAll(final T @Nullable @Unmodifiable []                               values) { return instance.hasNotAll(values); }


    @Contract(ALWAYS_THIS_0) @Override public CollectionHolder<@NotNull T> requireNoNulls() {
        if (instance.requireNoNulls() != instance)
            fail("The expected return type for the method “requireNoNulls” was supposed to be the same instance");
        return this;
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    @Override public CollectionHolder<T> filter(final ObjIntPredicate<? super T> predicate) { return instance.filter(predicate); }
    @Override public CollectionHolder<T> filter(final Predicate<? super T>       predicate) { return instance.filter(predicate); }
    @Override public CollectionHolder<T> filter(final BooleanSupplier            predicate) { return instance.filter(predicate); }

    @Override public CollectionHolder<T> filterIndexed(final IntObjPredicate<? super T> predicate) { return instance.filterIndexed(predicate); }
    @Override public CollectionHolder<T> filterIndexed(final IntPredicate               predicate) { return instance.filterIndexed(predicate); }
    @Override public CollectionHolder<T> filterIndexed(final BooleanSupplier            predicate) { return instance.filterIndexed(predicate); }

    @Override public CollectionHolder<T> filterNot(final ObjIntPredicate<? super T> predicate) { return instance.filterNot(predicate); }
    @Override public CollectionHolder<T> filterNot(final Predicate<? super T>       predicate) { return instance.filterNot(predicate); }
    @Override public CollectionHolder<T> filterNot(final BooleanSupplier            predicate) { return instance.filterNot(predicate); }

    @Override public CollectionHolder<T> filterNotIndexed(final IntObjPredicate<? super T> predicate) { return instance.filterNotIndexed(predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final IntPredicate               predicate) { return instance.filterNotIndexed(predicate); }
    @Override public CollectionHolder<T> filterNotIndexed(final BooleanSupplier            predicate) { return instance.filterNotIndexed(predicate); }


    @Override public CollectionHolder<@NotNull T> filterNotNull() { return instance.filterNotNull(); }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    @Override public CollectionHolder<T> slice(                                                        ) { return instance.slice(); }
    @Override public CollectionHolder<T> slice(final int               from                            ) { return instance.slice(from); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from                            ) { return instance.slice(from); }
    @Override public CollectionHolder<T> slice(final int               from, final int               to) { return instance.slice(from, to); }
    @Override public CollectionHolder<T> slice(final int               from, final @Nullable Integer to) { return instance.slice(from, to); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from, final int               to) { return instance.slice(from, to); }
    @Override public CollectionHolder<T> slice(final @Nullable Integer from, final @Nullable Integer to) { return instance.slice(from, to); }

    @Override public CollectionHolder<T> slice(final Iterator<? extends Integer>                                          indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator<? extends Integer, ?>                              indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final PrimitiveIterator.OfInt                                              indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final ListIterator<? extends Integer>                                      indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator<? extends Integer>                                       indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfPrimitive<? extends Integer, ? extends IntConsumer, ?> indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final Spliterator.OfInt                                                    indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final Enumeration<? extends Integer>                                       indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final Iterable<? extends Integer>                                          indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final MinimalistCollectionHolder<? extends Integer>                        indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final CollectionHolder<? extends Integer>                                  indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Collection<? extends Integer>                          indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedCollection<? extends Integer>                 indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable List<? extends Integer>                                indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Set<? extends Integer>                                 indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SequencedSet<? extends Integer>                        indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable SortedSet<? extends Integer>                           indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable NavigableSet<? extends Integer>                        indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Queue<? extends Integer>                               indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingQueue<? extends Integer>                       indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable TransferQueue<? extends Integer>                       indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable Deque<? extends Integer>                               indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final @Unmodifiable BlockingDeque<? extends Integer>                       indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final int @Unmodifiable []                                                 indices) { return instance.slice(indices); }
    @Override public CollectionHolder<T> slice(final Integer @Unmodifiable []                                             indices) { return instance.slice(indices); }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    @Override public CollectionHolder<T> take(final int     n) { return instance.take(n); }
    @Override public CollectionHolder<T> take(final Integer n) { return instance.take(n); }

    @Override public CollectionHolder<T> takeWhile(final ObjIntPredicate<? super T> predicate) { return instance.takeWhile(predicate); }
    @Override public CollectionHolder<T> takeWhile(final Predicate<? super T>       predicate) { return instance.takeWhile(predicate); }
    @Override public CollectionHolder<T> takeWhile(final BooleanSupplier            predicate) { return instance.takeWhile(predicate); }

    @Override public CollectionHolder<T> takeWhileIndexed(final IntObjPredicate<? super T> predicate) { return instance.takeWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(final IntPredicate               predicate) { return instance.takeWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeWhileIndexed(final BooleanSupplier            predicate) { return instance.takeWhileIndexed(predicate); }


    @Override public CollectionHolder<T> takeLast(final int     n) { return instance.takeLast(n); }
    @Override public CollectionHolder<T> takeLast(final Integer n) { return instance.takeLast(n); }


    @Override public CollectionHolder<T> takeLastWhile(final ObjIntPredicate<? super T> predicate) { return instance.takeLastWhile(predicate); }
    @Override public CollectionHolder<T> takeLastWhile(final Predicate<? super T>       predicate) { return instance.takeLastWhile(predicate); }
    @Override public CollectionHolder<T> takeLastWhile(final BooleanSupplier            predicate) { return instance.takeLastWhile(predicate); }

    @Override public CollectionHolder<T> takeLastWhileIndexed(final IntObjPredicate<? super T> predicate) { return instance.takeLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(final IntPredicate               predicate) { return instance.takeLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> takeLastWhileIndexed(final BooleanSupplier            predicate) { return instance.takeLastWhileIndexed(predicate); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    @Override public CollectionHolder<T> drop(final int     n) { return instance.drop(n); }
    @Override public CollectionHolder<T> drop(final Integer n) { return instance.drop(n); }

    @Override public CollectionHolder<T> dropWhile(final ObjIntPredicate<? super T> predicate) { return instance.dropWhile(predicate); }
    @Override public CollectionHolder<T> dropWhile(final Predicate<? super T>       predicate) { return instance.dropWhile(predicate); }
    @Override public CollectionHolder<T> dropWhile(final BooleanSupplier            predicate) { return instance.dropWhile(predicate); }

    @Override public CollectionHolder<T> dropWhileIndexed(final IntObjPredicate<? super T> predicate) { return instance.dropWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(final IntPredicate               predicate) { return instance.dropWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropWhileIndexed(final BooleanSupplier            predicate) { return instance.dropWhileIndexed(predicate); }


    @Override public CollectionHolder<T> dropLast(final int     n) { return instance.dropLast(n); }
    @Override public CollectionHolder<T> dropLast(final Integer n) { return instance.dropLast(n); }


    @Override public CollectionHolder<T> dropLastWhile(final ObjIntPredicate<? super T> predicate) { return instance.dropLastWhile(predicate); }
    @Override public CollectionHolder<T> dropLastWhile(final Predicate<? super T>       predicate) { return instance.dropLastWhile(predicate); }
    @Override public CollectionHolder<T> dropLastWhile(final BooleanSupplier            predicate) { return instance.dropLastWhile(predicate); }

    @Override public CollectionHolder<T> dropLastWhileIndexed(final IntObjPredicate<? super T> predicate) { return instance.dropLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(final IntPredicate               predicate) { return instance.dropLastWhileIndexed(predicate); }
    @Override public CollectionHolder<T> dropLastWhileIndexed(final BooleanSupplier            predicate) { return instance.dropLastWhileIndexed(predicate); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final ObjIntFunction<? super T, ? extends U> transform) { return instance.map(transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Function<? super T, ? extends U>       transform) { return instance.map(transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> map(final Supplier<? extends U>                  transform) { return instance.map(transform); }

    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntObjFunction<? super T, ? extends U> transform) { return instance.mapIndexed(transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final IntFunction<? extends U>               transform) { return instance.mapIndexed(transform); }
    @Override public <U extends @Nullable Object> CollectionHolder<U> mapIndexed(final Supplier<? extends U>                  transform) { return instance.mapIndexed(transform); }


    @Override public <U> CollectionHolder<U> mapNotNull(final ObjIntFunction<? super T, ? extends @Nullable U> transform) { return instance.mapNotNull(transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Function<? super T, ? extends @Nullable U>       transform) { return instance.mapNotNull(transform); }
    @Override public <U> CollectionHolder<U> mapNotNull(final Supplier<? extends @Nullable U>                  transform) { return instance.mapNotNull(transform); }

    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntObjFunction<? super T, ? extends @Nullable U> transform) { return instance.mapNotNullIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final IntFunction<? extends @Nullable U>               transform) { return instance.mapNotNullIndexed(transform); }
    @Override public <U> CollectionHolder<U> mapNotNullIndexed(final Supplier<? extends @Nullable U>                  transform) { return instance.mapNotNullIndexed(transform); }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    @Override public void forEach(final ObjIntConsumer<? super T> action) { instance.forEach(action); }
    @Override public void forEach(final Consumer<? super T>       action) { instance.forEach(action); }
    @Override public void forEach(final Runnable                  action) { instance.forEach(action); }

    @Override public void forEachIndexed(final IntObjConsumer<? super T> action) { instance.forEachIndexed(action); }
    @Override public void forEachIndexed(final IntConsumer               action) { instance.forEachIndexed(action); }
    @Override public void forEachIndexed(final Runnable                  action) { instance.forEachIndexed(action); }


    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_ByGenericCollection<T> onEach(final ObjIntConsumer<? super T> action) {
        if (instance.onEach(action) != instance)
            fail("The expected return type for the method “onEach” was supposed to be the same instance");
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_ByGenericCollection<T> onEach(final Consumer<? super T> action) {
        if (instance.onEach(action) != instance)
            fail("The expected return type for the method “onEach” was supposed to be the same instance");
        return this;
    }


    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_ByGenericCollection<T> onEach(final Runnable action) {
        if (instance.onEach(action) != instance)
            fail("The expected return type for the method “onEach” was supposed to be the same instance");
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_ByGenericCollection<T> onEachIndexed(final IntObjConsumer<? super T> action) {
        if (instance.onEachIndexed(action) != instance)
            fail("The expected return type for the method “onEachIndexed” was supposed to be the same instance");
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_ByGenericCollection<T> onEachIndexed(final IntConsumer action) {
        if (instance.onEachIndexed(action) != instance)
            fail("The expected return type for the method “onEachIndexed” was supposed to be the same instance");
        return this;
    }

    @Contract(ALWAYS_THIS_1) @Override public CollectionHolder_ByGenericCollection<T> onEachIndexed(final Runnable action) {
        if (instance.onEachIndexed(action) != instance)
            fail("The expected return type for the method “onEachIndexed” was supposed to be the same instance");
        return this;
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    @Override public CollectionHolder<T> toReverse(                                                        ) { return instance.toReverse(); }
    @Override public CollectionHolder<T> toReverse(final int               from                            ) { return instance.toReverse(from); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from                            ) { return instance.toReverse(from); }
    @Override public CollectionHolder<T> toReverse(final int               from, final int               to) { return instance.toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final int               from, final @Nullable Integer to) { return instance.toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final int               to) { return instance.toReverse(from, to); }
    @Override public CollectionHolder<T> toReverse(final @Nullable Integer from, final @Nullable Integer to) { return instance.toReverse(from, to); }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    @Override public CollectionIterator<T> toIterator() { return instance.toIterator(); }

    @Override public Spliterator<T> toSpliterator() { return instance.toSpliterator(); }

    //#endregion -------------------- To iterator --------------------

    //#region -------------------- To array --------------------

    @Override public                              T[] toArray(                                                      ) { return instance.toArray(); }
    @Override public <U extends @Nullable Object> U[] toArray(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toArray(transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Function<? super T, ? extends U>       transform) { return instance.toArray(transform); }
    @Override public <U extends @Nullable Object> U[] toArray(final Supplier<? extends U>                  transform) { return instance.toArray(transform); }

    //#endregion -------------------- To array --------------------

    //#region -------------------- To collection --------------------

    @Override public                              ImmutableCollection<T> toCollection(                                                      ) { return instance.toCollection(); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Function<? super T, ? extends U>       transform) { return instance.toCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableCollection<U> toCollection(final Supplier<? extends U>                  transform) { return instance.toCollection(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableCollection<T> toMutableCollection(                                                      ) { return instance.toMutableCollection(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableCollection(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Function<? super T, ? extends U>       transform) { return instance.toMutableCollection(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCollection<U> toMutableCollection(final Supplier<? extends U>                  transform) { return instance.toMutableCollection(transform); }

    //#endregion -------------------- To collection --------------------
    //#region -------------------- To sequenced collection --------------------

    @Override public                              ImmutableSequencedCollection<T> toSequencedCollection(                                                      ) { return instance.toSequencedCollection(); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toSequencedCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Function<? super T, ? extends U>       transform) { return instance.toSequencedCollection(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedCollection<U> toSequencedCollection(final Supplier<? extends U>                  transform) { return instance.toSequencedCollection(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSequencedCollection<T> toMutableSequencedCollection(                                                      ) { return instance.toMutableSequencedCollection(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableSequencedCollection(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Function<? super T, ? extends U>       transform) { return instance.toMutableSequencedCollection(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedCollection<U> toMutableSequencedCollection(final Supplier<? extends U>                  transform) { return instance.toMutableSequencedCollection(transform); }

    //#endregion -------------------- To sequenced collection --------------------

    //#region -------------------- To list --------------------

    @Override public                              ImmutableList<T> toList(                                                      ) { return instance.toList(); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toList(transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Function<? super T, ? extends U>       transform) { return instance.toList(transform); }
    @Override public <U extends @Nullable Object> ImmutableList<U> toList(final Supplier<? extends U>                  transform) { return instance.toList(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableList<T> toMutableList(                                                      ) { return instance.toMutableList(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Function<? super T, ? extends U>       transform) { return instance.toMutableList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableList<U> toMutableList(final Supplier<? extends U>                  transform) { return instance.toMutableList(transform); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- To array list --------------------

    @Override public                              ImmutableArrayList<T> toArrayList(                                                      ) { return instance.toArrayList(); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Function<? super T, ? extends U>       transform) { return instance.toArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableArrayList<U> toArrayList(final Supplier<? extends U>                  transform) { return instance.toArrayList(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableArrayList<T> toMutableArrayList(                                                                                               ) { return instance.toMutableArrayList(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(                                         final Supplier<? extends U>                  transform) { return instance.toMutableArrayList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableArrayList<T> toMutableArrayList(final int               initialCapacity                                                        ) { return instance.toMutableArrayList(initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayList(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayList(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final int               initialCapacity, final Supplier<? extends U>                  transform) { return instance.toMutableArrayList(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableArrayList<T> toMutableArrayList(final @Nullable Integer initialCapacity                                                        ) { return instance.toMutableArrayList(initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayList(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayList(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableArrayList<U> toMutableArrayList(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return instance.toMutableArrayList(initialCapacity, transform); }

    //#endregion -------------------- To array list --------------------
    //#region -------------------- To copy on write array list --------------------

    @Override public                              ImmutableCopyOnWriteArrayList<T> toCopyOnWriteArrayList(                                                      ) { return instance.toCopyOnWriteArrayList(); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toCopyOnWriteArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return instance.toCopyOnWriteArrayList(transform); }
    @Override public <U extends @Nullable Object> ImmutableCopyOnWriteArrayList<U> toCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return instance.toCopyOnWriteArrayList(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableCopyOnWriteArrayList<T> toMutableCopyOnWriteArrayList(                                                      ) { return instance.toMutableCopyOnWriteArrayList(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableCopyOnWriteArrayList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Function<? super T, ? extends U>       transform) { return instance.toMutableCopyOnWriteArrayList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableCopyOnWriteArrayList<U> toMutableCopyOnWriteArrayList(final Supplier<? extends U>                  transform) { return instance.toMutableCopyOnWriteArrayList(transform); }

    //#endregion -------------------- To copy on write array list --------------------
    //#region -------------------- To linked list --------------------

    @Override public                              ImmutableLinkedList<T> toLinkedList(                                                      ) { return instance.toLinkedList(); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toLinkedList(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Function<? super T, ? extends U>       transform) { return instance.toLinkedList(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedList<U> toLinkedList(final Supplier<? extends U>                  transform) { return instance.toLinkedList(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableLinkedList<T> toMutableLinkedList(                                                      ) { return instance.toMutableLinkedList(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedList(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedList<U> toMutableLinkedList(final Supplier<? extends U>                  transform) { return instance.toMutableLinkedList(transform); }

    //#endregion -------------------- To linked list --------------------
    //#region -------------------- To vector --------------------

    @Override public                              ImmutableVector<T> toVector(                                                      ) { return instance.toVector(); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toVector(transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Function<? super T, ? extends U>       transform) { return instance.toVector(transform); }
    @Override public <U extends @Nullable Object> ImmutableVector<U> toVector(final Supplier<? extends U>                  transform) { return instance.toVector(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableVector<T> toMutableVector(                                                                                               ) { return instance.toMutableVector(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableVector(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final Function<? super T, ? extends U>       transform) { return instance.toMutableVector(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(                                         final Supplier<? extends U>                  transform) { return instance.toMutableVector(transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableVector<T> toMutableVector(final int               initialCapacity                                                        ) { return instance.toMutableVector(initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableVector(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableVector(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final int               initialCapacity, final Supplier<? extends U>                  transform) { return instance.toMutableVector(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableVector<T> toMutableVector(final @Nullable Integer initialCapacity                                                        ) { return instance.toMutableVector(initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableVector(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableVector(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableVector<U> toMutableVector(final @Nullable Integer initialCapacity, final Supplier<? extends U>                  transform) { return instance.toMutableVector(initialCapacity, transform); }

    //#endregion -------------------- To vector --------------------

    //#region -------------------- To set --------------------

    @Override public                              ImmutableSet<T> toSet(                                                      ) { return instance.toSet(); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Function<? super T, ? extends U>       transform) { return instance.toSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSet<U> toSet(final Supplier<? extends U>                  transform) { return instance.toSet(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSet<T> toMutableSet(                                                      ) { return instance.toMutableSet(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Function<? super T, ? extends U>       transform) { return instance.toMutableSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSet<U> toMutableSet(final Supplier<? extends U>                  transform) { return instance.toMutableSet(transform); }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To sequenced set --------------------

    @Override public                              ImmutableSequencedSet<T> toSequencedSet(                                                      ) { return instance.toSequencedSet(); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toSequencedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Function<? super T, ? extends U>       transform) { return instance.toSequencedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSequencedSet<U> toSequencedSet(final Supplier<? extends U>                  transform) { return instance.toSequencedSet(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSequencedSet<T> toMutableSequencedSet(                                                      ) { return instance.toMutableSequencedSet(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableSequencedSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Function<? super T, ? extends U>       transform) { return instance.toMutableSequencedSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSequencedSet<U> toMutableSequencedSet(final Supplier<? extends U>                  transform) { return instance.toMutableSequencedSet(transform); }

    //#endregion -------------------- To sequenced set --------------------
    //#region -------------------- To sorted set --------------------

    @Override public                              ImmutableSortedSet<T> toSortedSet(                                                      ) { return instance.toSortedSet(); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toSortedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Function<? super T, ? extends U>       transform) { return instance.toSortedSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableSortedSet<U> toSortedSet(final Supplier<? extends U>                  transform) { return instance.toSortedSet(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableSortedSet<T> toMutableSortedSet(                                                      ) { return instance.toMutableSortedSet(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableSortedSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Function<? super T, ? extends U>       transform) { return instance.toMutableSortedSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableSortedSet<U> toMutableSortedSet(final Supplier<? extends U>                  transform) { return instance.toMutableSortedSet(transform); }

    //#endregion -------------------- To sorted set --------------------
    //#region -------------------- To navigable set --------------------

    @Override public                              ImmutableNavigableSet<T> toNavigableSet(                                                      ) { return instance.toNavigableSet(); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toNavigableSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Function<? super T, ? extends U>       transform) { return instance.toNavigableSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableNavigableSet<U> toNavigableSet(final Supplier<? extends U>                  transform) { return instance.toNavigableSet(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableNavigableSet<T> toMutableNavigableSet(                                                      ) { return instance.toMutableNavigableSet(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableNavigableSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Function<? super T, ? extends U>       transform) { return instance.toMutableNavigableSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableNavigableSet<U> toMutableNavigableSet(final Supplier<? extends U>                  transform) { return instance.toMutableNavigableSet(transform); }

    //#endregion -------------------- To navigable set --------------------
    //#region -------------------- To concurrent skip list set --------------------

                            @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return instance.toConcurrentSkipListSet(transform); }
                            @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return instance.toConcurrentSkipListSet(transform); }
                            @Override public <U extends Comparable<? super U>> ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return instance.toConcurrentSkipListSet(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toConcurrentSkipListSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toConcurrentSkipListSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutableConcurrentSkipListSet<U> toConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toConcurrentSkipListSet(comparator, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableConcurrentSkipListSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Function<? super T, ? extends U>       transform) { return instance.toMutableConcurrentSkipListSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(                                        final Supplier<? extends U>                  transform) { return instance.toMutableConcurrentSkipListSet(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableConcurrentSkipListSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutableConcurrentSkipListSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutableConcurrentSkipListSet<U> toMutableConcurrentSkipListSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutableConcurrentSkipListSet(comparator, transform); }

    //#endregion -------------------- To concurrent skip list set --------------------
    //#region -------------------- To copy on write array set --------------------

    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toCopyOnWriteArraySet(transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return instance.toCopyOnWriteArraySet(transform); }
    @Override public <U> ImmutableCopyOnWriteArraySet<U> toCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return instance.toCopyOnWriteArraySet(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableCopyOnWriteArraySet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Function<? super T, ? extends U>       transform) { return instance.toMutableCopyOnWriteArraySet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableCopyOnWriteArraySet<U> toMutableCopyOnWriteArraySet(final Supplier<? extends U>                  transform) { return instance.toMutableCopyOnWriteArraySet(transform); }

    //#endregion -------------------- To copy on write array set --------------------
    //#region -------------------- To enum set --------------------

    @Contract(ALWAYS_NEW_1) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(                      final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableEnumSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(                      final Function<? super T, ? extends U>       transform) { return instance.toMutableEnumSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(                      final Supplier<? extends U>                  transform) { return instance.toMutableEnumSet(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableEnumSet(clazz, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Function<? super T, ? extends U>       transform) { return instance.toMutableEnumSet(clazz, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Enum<U>> EnumSet<U> toMutableEnumSet(final Class<U> clazz, final Supplier<? extends U>                  transform) { return instance.toMutableEnumSet(clazz, transform); }

    //#endregion -------------------- To enum set --------------------
    //#region -------------------- To hash set --------------------

    @Override public                              ImmutableHashSet<T> toHashSet(                                                                                        ) { return instance.toHashSet(); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final ObjIntFunction<? super T, ? extends U> transform) { return instance.toHashSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final Function<? super T, ? extends U>       transform) { return instance.toHashSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(                                  final Supplier<? extends U>                  transform) { return instance.toHashSet(transform); }
    @Override public                              ImmutableHashSet<T> toHashSet(final float           loadFactor                                                        ) { return instance.toHashSet(loadFactor); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toHashSet(loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final Function<? super T, ? extends U>       transform) { return instance.toHashSet(loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final float           loadFactor, final Supplier<? extends U>                  transform) { return instance.toHashSet(loadFactor, transform); }
    @Override public                              ImmutableHashSet<T> toHashSet(final @Nullable Float loadFactor                                                        ) { return instance.toHashSet(loadFactor); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toHashSet(loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return instance.toHashSet(loadFactor, transform); }
    @Override public <U extends @Nullable Object> ImmutableHashSet<U> toHashSet(final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return instance.toHashSet(loadFactor, transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableHashSet<T> toMutableHashSet(                                                                                                                                 ) { return instance.toMutableHashSet(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(                                                                           final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity                                                                                          ) { return instance.toMutableHashSet(initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity,                                   final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final float           loadFactor                                                        ) { return instance.toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final float           loadFactor, final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor                                                        ) { return instance.toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final int               initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_1) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity                                                                                          ) { return instance.toMutableHashSet(initialCapacity); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity,                                   final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor                                                        ) { return instance.toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final float           loadFactor, final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_2) @Override public                              MutableHashSet<T> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor                                                        ) { return instance.toMutableHashSet(initialCapacity, loadFactor); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Function<? super T, ? extends U>       transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U extends @Nullable Object> MutableHashSet<U> toMutableHashSet(final @Nullable Integer initialCapacity, final @Nullable Float loadFactor, final Supplier<? extends U>                  transform) { return instance.toMutableHashSet(initialCapacity, loadFactor, transform); }

    //#endregion -------------------- To hash set --------------------
    //#region -------------------- To linked hash set --------------------

    @Override public                              ImmutableLinkedHashSet<T> toLinkedHashSet(                                                      ) { return instance.toLinkedHashSet(); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toLinkedHashSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Function<? super T, ? extends U>       transform) { return instance.toLinkedHashSet(transform); }
    @Override public <U extends @Nullable Object> ImmutableLinkedHashSet<U> toLinkedHashSet(final Supplier<? extends U>                  transform) { return instance.toLinkedHashSet(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableLinkedHashSet<T> toMutableLinkedHashSet(                                                      ) { return instance.toMutableLinkedHashSet(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedHashSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedHashSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableLinkedHashSet<U> toMutableLinkedHashSet(final Supplier<? extends U>                  transform) { return instance.toMutableLinkedHashSet(transform); }

    //#endregion -------------------- To linked hash set --------------------
    //#region -------------------- To tree set --------------------

                            @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return instance.toTreeSet(transform); }
                            @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Function<? super T, ? extends U>       transform) { return instance.toTreeSet(transform); }
                            @Override public <U extends @Nullable Comparable<? super U>> ImmutableTreeSet<U> toTreeSet(                                        final Supplier<? extends U>                  transform) { return instance.toTreeSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public                                             ImmutableTreeSet<T> toTreeSet(final Comparator<? super T> comparator                                                        ) { return instance.toTreeSet(comparator); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toTreeSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toTreeSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                ImmutableTreeSet<U> toTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toTreeSet(comparator, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableTreeSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Function<? super T, ? extends U>       transform) { return instance.toMutableTreeSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Comparable<? super U>> MutableTreeSet<U> toMutableTreeSet(                                        final Supplier<? extends U>                  transform) { return instance.toMutableTreeSet(transform); }
    @Contract(ALWAYS_NEW_1) @Override public                                             MutableTreeSet<T> toMutableTreeSet(final Comparator<? super T> comparator                                                        ) { return instance.toMutableTreeSet(comparator); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableTreeSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutableTreeSet(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends @Nullable Object>                MutableTreeSet<U> toMutableTreeSet(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutableTreeSet(comparator, transform); }

    //#endregion -------------------- To tree set --------------------

    //#region -------------------- To queue --------------------

    @Override public                              ImmutableQueue<T> toQueue(                                                      ) { return instance.toQueue(); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toQueue(transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Function<? super T, ? extends U>       transform) { return instance.toQueue(transform); }
    @Override public <U extends @Nullable Object> ImmutableQueue<U> toQueue(final Supplier<? extends U>                  transform) { return instance.toQueue(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableQueue<T> toMutableQueue(                                                      ) { return instance.toMutableQueue(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Function<? super T, ? extends U>       transform) { return instance.toMutableQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableQueue<U> toMutableQueue(final Supplier<? extends U>                  transform) { return instance.toMutableQueue(transform); }

    //#endregion -------------------- To queue --------------------
    //#region -------------------- To blocking queue --------------------

    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toBlockingQueue(transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Function<? super T, ? extends U>       transform) { return instance.toBlockingQueue(transform); }
    @Override public <U> ImmutableBlockingQueue<U> toBlockingQueue(final Supplier<? extends U>                  transform) { return instance.toBlockingQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Function<? super T, ? extends U>       transform) { return instance.toMutableBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingQueue<U> toMutableBlockingQueue(final Supplier<? extends U>                  transform) { return instance.toMutableBlockingQueue(transform); }

    //#endregion -------------------- To blocking queue --------------------
    //#region -------------------- To transfer queue --------------------

    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toTransferQueue(transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Function<? super T, ? extends U>       transform) { return instance.toTransferQueue(transform); }
    @Override public <U> ImmutableTransferQueue<U> toTransferQueue(final Supplier<? extends U>                  transform) { return instance.toTransferQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableTransferQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Function<? super T, ? extends U>       transform) { return instance.toMutableTransferQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableTransferQueue<U> toMutableTransferQueue(final Supplier<? extends U>                  transform) { return instance.toMutableTransferQueue(transform); }

    //#endregion -------------------- To transfer queue --------------------
    //#region -------------------- To array blocking queue --------------------

    @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toArrayBlockingQueue(transform); }
    @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Function<? super T, ? extends U>       transform) { return instance.toArrayBlockingQueue(transform); }
    @Override public <U> ImmutableArrayBlockingQueue<U> toArrayBlockingQueue(final Supplier<? extends U>                  transform) { return instance.toArrayBlockingQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                                               final Supplier<? extends U>                  transform) { return instance.toMutableArrayBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity,                       final Supplier<? extends U>                  transform) { return instance.toMutableArrayBlockingQueue(capacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final boolean isFair, final Supplier<? extends U>                  transform) { return instance.toMutableArrayBlockingQueue(capacity, isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayBlockingQueue(isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayBlockingQueue<U> toMutableArrayBlockingQueue(                                                         final boolean isFair, final Supplier<? extends U>                  transform) { return instance.toMutableArrayBlockingQueue(isFair, transform); }

    //#endregion -------------------- To array blocking queue --------------------
    //#region -------------------- To concurrent linked queue --------------------

    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toConcurrentLinkedQueue(transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return instance.toConcurrentLinkedQueue(transform); }
    @Override public <U> ImmutableConcurrentLinkedQueue<U> toConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return instance.toConcurrentLinkedQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableConcurrentLinkedQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Function<? super T, ? extends U>       transform) { return instance.toMutableConcurrentLinkedQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedQueue<U> toMutableConcurrentLinkedQueue(final Supplier<? extends U>                  transform) { return instance.toMutableConcurrentLinkedQueue(transform); }

    //#endregion -------------------- To concurrent linked queue --------------------
    //#region -------------------- To delay queue --------------------

    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toDelayQueue(transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Function<? super T, ? extends U>       transform) { return instance.toDelayQueue(transform); }
    @Override public <U extends Delayed> ImmutableDelayQueue<U> toDelayQueue(final Supplier<? extends U>                  transform) { return instance.toDelayQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableDelayQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Function<? super T, ? extends U>       transform) { return instance.toMutableDelayQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Delayed> MutableDelayQueue<U> toMutableDelayQueue(final Supplier<? extends U>                  transform) { return instance.toMutableDelayQueue(transform); }

    //#endregion -------------------- To delay queue --------------------
    //#region -------------------- To linked blocking queue --------------------

    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toLinkedBlockingQueue(transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Function<? super T, ? extends U>       transform) { return instance.toLinkedBlockingQueue(transform); }
    @Override public <U> ImmutableLinkedBlockingQueue<U> toLinkedBlockingQueue(final Supplier<? extends U>                  transform) { return instance.toLinkedBlockingQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(                                                         final Supplier<? extends U>                  transform) { return instance.toMutableLinkedBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedBlockingQueue(capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingQueue<U> toMutableLinkedBlockingQueue(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return instance.toMutableLinkedBlockingQueue(capacity, transform); }

    //#endregion -------------------- To linked blocking queue --------------------
    //#region -------------------- To linked transfer queue --------------------

    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toLinkedTransferQueue(transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return instance.toLinkedTransferQueue(transform); }
    @Override public <U> ImmutableLinkedTransferQueue<U> toLinkedTransferQueue(final Supplier<? extends U>                  transform) { return instance.toLinkedTransferQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedTransferQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedTransferQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedTransferQueue<U> toMutableLinkedTransferQueue(final Supplier<? extends U>                  transform) { return instance.toMutableLinkedTransferQueue(transform); }

    //#endregion -------------------- To linked transfer queue --------------------
    //#region -------------------- To priority blocking queue --------------------

                            @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return instance.toPriorityBlockingQueue(transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Function<? super T, ? extends U>       transform) { return instance.toPriorityBlockingQueue(transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(                                        final Supplier<? extends U>                  transform) { return instance.toPriorityBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toPriorityBlockingQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toPriorityBlockingQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityBlockingQueue<U> toPriorityBlockingQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toPriorityBlockingQueue(comparator, transform); }


    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                                                                 final Supplier<? extends U>                  transform) { return instance.toMutablePriorityBlockingQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(                                         final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutablePriorityBlockingQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity,                                         final Supplier<? extends U>                  transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity,                                         final Supplier<? extends U>                  transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityBlockingQueue<U> toMutablePriorityBlockingQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutablePriorityBlockingQueue(initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority blocking queue --------------------
    //#region -------------------- To priority queue --------------------

                            @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final ObjIntFunction<? super T, ? extends U> transform) { return instance.toPriorityQueue(transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Function<? super T, ? extends U>       transform) { return instance.toPriorityQueue(transform); }
                            @Override public <U extends Comparable<? super U>> ImmutablePriorityQueue<U> toPriorityQueue(                                        final Supplier<? extends U>                  transform) { return instance.toPriorityQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toPriorityQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toPriorityQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               ImmutablePriorityQueue<U> toPriorityQueue(final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toPriorityQueue(comparator, transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(                                                                                 final Supplier<? extends U>                  transform) { return instance.toMutablePriorityQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(                                         final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutablePriorityQueue(comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity,                                         final Supplier<? extends U>                  transform) { return instance.toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final int               initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U extends Comparable<? super U>> MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity,                                         final Supplier<? extends U>                  transform) { return instance.toMutablePriorityQueue(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Function<? super T, ? extends U>       transform) { return instance.toMutablePriorityQueue(initialCapacity, comparator, transform); }
    @Contract(ALWAYS_NEW_3) @Override public <U>                               MutablePriorityQueue<U> toMutablePriorityQueue(final @Nullable Integer initialCapacity, final Comparator<? super U> comparator, final Supplier<? extends U>                  transform) { return instance.toMutablePriorityQueue(initialCapacity, comparator, transform); }

    //#endregion -------------------- To priority queue --------------------
    //#region -------------------- To synchronous queue --------------------

    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toSynchronousQueue(transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Function<? super T, ? extends U>       transform) { return instance.toSynchronousQueue(transform); }
    @Override public <U> ImmutableSynchronousQueue<U> toSynchronousQueue(final Supplier<? extends U>                  transform) { return instance.toSynchronousQueue(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableSynchronousQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Function<? super T, ? extends U>       transform) { return instance.toMutableSynchronousQueue(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(                      final Supplier<? extends U>                  transform) { return instance.toMutableSynchronousQueue(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableSynchronousQueue(isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Function<? super T, ? extends U>       transform) { return instance.toMutableSynchronousQueue(isFair, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableSynchronousQueue<U> toMutableSynchronousQueue(final boolean isFair, final Supplier<? extends U>                  transform) { return instance.toMutableSynchronousQueue(isFair, transform); }

    //#endregion -------------------- To synchronous queue --------------------

    //#region -------------------- To deque --------------------

    @Override public                              ImmutableDeque<T> toDeque(                                                      ) { return instance.toDeque(); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toDeque(transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Function<? super T, ? extends U>       transform) { return instance.toDeque(transform); }
    @Override public <U extends @Nullable Object> ImmutableDeque<U> toDeque(final Supplier<? extends U>                  transform) { return instance.toDeque(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableDeque<T> toMutableDeque(                                                      ) { return instance.toMutableDeque(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Function<? super T, ? extends U>       transform) { return instance.toMutableDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableDeque<U> toMutableDeque(final Supplier<? extends U>                  transform) { return instance.toMutableDeque(transform); }

    //#endregion -------------------- To deque --------------------
    //#region -------------------- To blocking deque --------------------

    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toBlockingDeque(transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Function<? super T, ? extends U>       transform) { return instance.toBlockingDeque(transform); }
    @Override public <U> ImmutableBlockingDeque<U> toBlockingDeque(final Supplier<? extends U>                  transform) { return instance.toBlockingDeque(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableBlockingDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Function<? super T, ? extends U>       transform) { return instance.toMutableBlockingDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableBlockingDeque<U> toMutableBlockingDeque(final Supplier<? extends U>                  transform) { return instance.toMutableBlockingDeque(transform); }

    //#endregion -------------------- To blocking deque --------------------
    //#region -------------------- To array deque --------------------

    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toArrayDeque(transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Function<? super T, ? extends U>       transform) { return instance.toArrayDeque(transform); }
    @Override public <U> ImmutableArrayDeque<U> toArrayDeque(final Supplier<? extends U>                  transform) { return instance.toArrayDeque(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(                           final Supplier<? extends U>                  transform) { return instance.toMutableArrayDeque(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableArrayDeque(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableArrayDeque(initialCapacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableArrayDeque<U> toMutableArrayDeque(final int initialCapacity, final Supplier<? extends U>                  transform) { return instance.toMutableArrayDeque(initialCapacity, transform); }

    //#endregion -------------------- To array deque --------------------
    //#region -------------------- To concurrent linked deque --------------------

    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toConcurrentLinkedDeque(transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return instance.toConcurrentLinkedDeque(transform); }
    @Override public <U> ImmutableConcurrentLinkedDeque<U> toConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return instance.toConcurrentLinkedDeque(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableConcurrentLinkedDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Function<? super T, ? extends U>       transform) { return instance.toMutableConcurrentLinkedDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableConcurrentLinkedDeque<U> toMutableConcurrentLinkedDeque(final Supplier<? extends U>                  transform) { return instance.toMutableConcurrentLinkedDeque(transform); }

    //#endregion -------------------- To concurrent linked deque --------------------
    //#region -------------------- To linked blocking deque --------------------

    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toLinkedBlockingDeque(transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Function<? super T, ? extends U>       transform) { return instance.toLinkedBlockingDeque(transform); }
    @Override public <U> ImmutableLinkedBlockingDeque<U> toLinkedBlockingDeque(final Supplier<? extends U>                  transform) { return instance.toLinkedBlockingDeque(transform); }

    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedBlockingDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedBlockingDeque(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(                                                         final Supplier<? extends U>                  transform) { return instance.toMutableLinkedBlockingDeque(transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Function<? super T, ? extends U>       transform) { return instance.toMutableLinkedBlockingDeque(capacity, transform); }
    @Contract(ALWAYS_NEW_2) @Override public <U> MutableLinkedBlockingDeque<U> toMutableLinkedBlockingDeque(final @Range(from = 1, to = MAX_INT_VALUE) int capacity, final Supplier<? extends U>                  transform) { return instance.toMutableLinkedBlockingDeque(capacity, transform); }

    //#endregion -------------------- To linked blocking deque --------------------
    //#region -------------------- To stack --------------------

    @Override public                              ImmutableStack<T> toStack(                                                      ) { return instance.toStack(); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toStack(transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Function<? super T, ? extends U>       transform) { return instance.toStack(transform); }
    @Override public <U extends @Nullable Object> ImmutableStack<U> toStack(final Supplier<? extends U>                  transform) { return instance.toStack(transform); }

    @Contract(ALWAYS_NEW_0) @Override public                              MutableStack<T> toMutableStack(                                                      ) { return instance.toMutableStack(); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final ObjIntFunction<? super T, ? extends U> transform) { return instance.toMutableStack(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Function<? super T, ? extends U>       transform) { return instance.toMutableStack(transform); }
    @Contract(ALWAYS_NEW_1) @Override public <U extends @Nullable Object> MutableStack<U> toMutableStack(final Supplier<? extends U>                  transform) { return instance.toMutableStack(transform); }

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

    @Override public String toString() { return instance.toString(); }

    @Override public String toLocaleString(                             ) { return instance.toLocaleString(); }
    @Override public String toLocaleString(final @Nullable Locale locale) { return instance.toLocaleString(locale); }

    @Override public String toLowerCaseString() { return instance.toLowerCaseString(); }

    @Override public String toLocaleLowerCaseString(                             ) { return instance.toLocaleLowerCaseString(); }
    @Override public String toLocaleLowerCaseString(final @Nullable Locale locale) { return instance.toLocaleLowerCaseString(locale); }

    @Override public String toUpperCaseString() { return instance.toUpperCaseString(); }

    @Override public String toLocaleUpperCaseString(                             ) { return instance.toLocaleUpperCaseString(); }
    @Override public String toLocaleUpperCaseString(final @Nullable Locale locale) { return instance.toLocaleUpperCaseString(locale); }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    //#region -------------------- Join to string ∅ methods --------------------

    @Override public String joinToString() { return instance.joinToString(); }

    //#endregion -------------------- Join to string ∅ methods --------------------
    //#region -------------------- Join to string (separator) methods --------------------

    @Override public String joinToString(@Nullable final String    separator) { return instance.joinToString(separator); }
    @Override public String joinToString(@Nullable final Character separator) { return instance.joinToString(separator); }
    @Override public String joinToString(final char                separator) { return instance.joinToString(separator); }

    //#endregion -------------------- Join to string (separator) methods --------------------
    //#region -------------------- Join to string (separator, prefix) methods --------------------

    @Override public String joinToString(@Nullable final String    separator, @Nullable final String    prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(@Nullable final String    separator, @Nullable final Character prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(@Nullable final String    separator, final char                prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(@Nullable final Character separator, @Nullable final String    prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(@Nullable final Character separator, @Nullable final Character prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(@Nullable final Character separator, final char                prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(final char                separator, @Nullable final String    prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(final char                separator, @Nullable final Character prefix) { return instance.joinToString(separator, prefix); }
    @Override public String joinToString(final char                separator, final char                prefix) { return instance.joinToString(separator, prefix); }

    //#endregion -------------------- Join to string (separator, prefix) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix) { return instance.joinToString(separator, prefix, postfix); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix) { return instance.joinToString(separator, prefix, postfix); }

    //#endregion -------------------- Join to string (separator, prefix, postfix) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit) { return instance.joinToString(separator, prefix, postfix, limit); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit) { return instance.joinToString(separator, prefix, postfix, limit); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated) { return instance.joinToString(separator, prefix, postfix, limit, truncated); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T, int) → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable ObjIntFunction<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T, int) → string) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T) → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Function<? super T, String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform (T) → string) methods --------------------
    //#region -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform () → string) methods --------------------

    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable String    separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final @Nullable Character separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable String    prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final @Nullable Character prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable String    postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final @Nullable Character postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final int               limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable String    truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final @Nullable Character truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }
    @Override public String joinToString(final char                separator, final char                prefix, final char                postfix, final @Nullable Integer limit, final char                truncated, final @Nullable Supplier<String> transform) { return instance.joinToString(separator, prefix, postfix, limit, truncated, transform); }

    //#endregion -------------------- Join to string (separator, prefix, postfix, limit, truncated, transform () → string) methods --------------------

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}
