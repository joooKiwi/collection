package joookiwi.collection.java;

import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
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
import joookiwi.collection.java.iterator.CollectionIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A definition of a [CollectionHolder] to have a common ancestor.
/// Only the aliases methods have implementation.
/// The rest of the methods should be implemented by the inheritor(s).
///
/// @param <T> The type
/// @apiNote This class is used when not specifically requiring a optimizaton on the methods, just the non-aliased methods calls
/// @see AbstractCollectionHolder
/// @see AbstractCollectionHolderOf1
/// @see AbstractCollectionHolderOf2
/// @see CollectionViewer
/// @see LazyCollectionHolder
/// @see LazyCollectionHolderOf0Or1
/// @see LazyCollectionHolderOf0Or1Or2
/// @see LazyCollectionHolderOf1Or2
@NotNullByDefault
public abstract class AbstractUnimplementedCollectionHolder<T extends @Nullable Object>
        extends AbstractMinimalistCollectionHolder<T>
        implements CollectionHolder<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractUnimplementedCollectionHolder() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int length() { return size(); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int count() { return size(); }

    @Override public final boolean hasAtLeast1Element() { return isNotEmpty(); }
    @Override public final boolean containsAtLeast1Element() { return isNotEmpty(); }
    @Override public final boolean includesAtLeast1Element() { return isNotEmpty(); }

    @Override public final boolean containsExactly1Element() { return hasExactly1Element(); }
    @Override public final boolean includesExactly1Element() { return hasExactly1Element(); }

    @Override public final boolean containsAtMost1Element() { return hasAtMost1Element(); }
    @Override public final boolean includesAtMost1Element() { return hasAtMost1Element(); }

    @Override public final boolean containsAtLeast2Elements() { return hasAtLeast2Elements(); }
    @Override public final boolean includesAtLeast2Elements() { return hasAtLeast2Elements(); }

    @Override public final boolean containsExactly2Elements() { return hasExactly2Elements(); }
    @Override public final boolean includesExactly2Elements() { return hasExactly2Elements(); }

    @Override public final boolean containsAtMost2Elements() { return hasAtMost2Elements(); }
    @Override public final boolean includesAtMost2Elements() { return hasAtMost2Elements(); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    @Override public final T at(final int index) { return get(index); }

    @Override public final T elementAt(final int index) { return get(index); }

    //#endregion -------------------- Get --------------------

    //#region -------------------- Get or else --------------------

    @Override public final T atOrElse(final int index, final IntFunction<? extends T> defaultValue) { return getOrElse(index, defaultValue); }
    @Override public final T atOrElse(final int index, final Supplier<? extends T>    defaultValue) { return getOrElse(index, defaultValue); }

    @Override public final T elementAtOrElse(final int index, final IntFunction<? extends T> defaultValue) { return getOrElse(index, defaultValue); }
    @Override public final T elementAtOrElse(final int index, final Supplier<? extends T>    defaultValue) { return getOrElse(index, defaultValue); }

    //#endregion -------------------- Get or else --------------------

    //#region -------------------- Get or null --------------------

    @Override public final @Nullable T atOrNull(final int index) { return getOrNull(index); }

    @Override public final @Nullable T elementAtOrNull(final int index) { return getOrNull(index); }

    //#endregion -------------------- Get or null --------------------

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

    @Override public final T find(final ObjIntPredicate<? super T> predicate) { return findFirst(predicate); }
    @Override public final T find(final Predicate<? super T>       predicate) { return findFirst(predicate); }
    @Override public final T find(final BooleanSupplier            predicate) { return findFirst(predicate); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first indexed --------------------

    @Override public final T findIndexed(final IntObjPredicate<? super T> predicate) { return findFirstIndexed(predicate); }
    @Override public final T findIndexed(final IntPredicate               predicate) { return findFirstIndexed(predicate); }
    @Override public final T findIndexed(final BooleanSupplier            predicate) { return findFirstIndexed(predicate); }

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first or null --------------------

    @Override public final @Nullable T findOrNull(final ObjIntPredicate<? super T> predicate) { return findFirstOrNull(predicate); }
    @Override public final @Nullable T findOrNull(final Predicate<? super T>       predicate) { return findFirstOrNull(predicate); }
    @Override public final @Nullable T findOrNull(final BooleanSupplier            predicate) { return findFirstOrNull(predicate); }

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed or null --------------------

    @Override public final @Nullable T findIndexedOrNull(final IntObjPredicate<? super T> predicate) { return findFirstIndexedOrNull(predicate); }
    @Override public final @Nullable T findIndexedOrNull(final IntPredicate               predicate) { return findFirstIndexedOrNull(predicate); }
    @Override public final @Nullable T findIndexedOrNull(final BooleanSupplier            predicate) { return findFirstIndexedOrNull(predicate); }

    //#endregion -------------------- Find first indexed or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element                                                          ) { return firstIndexOf(element); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final int               from                            ) { return firstIndexOf(element, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final @Nullable Integer from                            ) { return firstIndexOf(element, from); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final int               from, final int               to) { return firstIndexOf(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final @Nullable Integer from, final int               to) { return firstIndexOf(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final int               from, final @Nullable Integer to) { return firstIndexOf(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final T element, final @Nullable Integer from, final @Nullable Integer to) { return firstIndexOf(element, from, to); }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element                                                          ) { return firstIndexOfOrNull(element); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final int               from                            ) { return firstIndexOfOrNull(element, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final @Nullable Integer from                            ) { return firstIndexOfOrNull(element, from); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final int               from, final int               to) { return firstIndexOfOrNull(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final @Nullable Integer from, final int               to) { return firstIndexOfOrNull(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final int               from, final @Nullable Integer to) { return firstIndexOfOrNull(element, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T element, final @Nullable Integer from, final @Nullable Integer to) { return firstIndexOfOrNull(element, from, to); }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Index of first --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate                                                          ) { return indexOfFirst(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate                                                          ) { return indexOfFirst(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate                                                          ) { return indexOfFirst(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate, final int               from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate, final int               from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndex(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate                                                          ) { return indexOfFirst(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate                                                          ) { return indexOfFirst(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate                                                          ) { return indexOfFirst(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate, final int               from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirst(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate, final int               from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndex(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirst(predicate, from, to); }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return indexOfFirstOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate                                                          ) { return indexOfFirstOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate                                                          ) { return indexOfFirstOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return indexOfFirstOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate                                                          ) { return indexOfFirstOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate                                                          ) { return indexOfFirstOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirstOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstOrNull(predicate, from, to); }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return indexOfFirstIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate                                                          ) { return indexOfFirstIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate                                                          ) { return indexOfFirstIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate, final int               from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate, final int               from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findFirstIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return indexOfFirstIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate                                                          ) { return indexOfFirstIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate                                                          ) { return indexOfFirstIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate, final int               from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate, final int               from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexed(predicate, from, to); }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return indexOfFirstIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate                                                          ) { return indexOfFirstIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return indexOfFirstIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findFirstIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return indexOfFirstIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate                                                          ) { return indexOfFirstIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return indexOfFirstIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfFirstIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfFirstIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate                                                          ) { return indexOfLast(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate                                                          ) { return indexOfLast(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate                                                          ) { return indexOfLast(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return indexOfLast(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate, final int               from                            ) { return indexOfLast(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate, final int               from                            ) { return indexOfLast(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfLast(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return indexOfLast(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfLast(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate, final int               from, final int               to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLast(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndex(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLast(predicate, from, to); }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate                                                          ) { return indexOfLastOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate                                                          ) { return indexOfLastOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate                                                          ) { return indexOfLastOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from                            ) { return indexOfLastOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate, final int               from                            ) { return indexOfLastOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate, final int               from                            ) { return indexOfLastOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfLastOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from                            ) { return indexOfLastOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfLastOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final int               to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate, final int               from, final int               to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate, final int               from, final @Nullable Integer to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final int               to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final ObjIntPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final Predicate<? super T>       predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastOrNull(predicate, from, to); }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate                                                          ) { return indexOfLastIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate                                                          ) { return indexOfLastIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate                                                          ) { return indexOfLastIndexed(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from                            ) { return indexOfLastIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate, final int               from                            ) { return indexOfLastIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate, final int               from                            ) { return indexOfLastIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfLastIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from                            ) { return indexOfLastIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfLastIndexed(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate, final int               from, final int               to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastIndexed(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) int findLastIndexIndexed(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastIndexed(predicate, from, to); }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate                                                          ) { return indexOfLastIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate                                                          ) { return indexOfLastIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate                                                          ) { return indexOfLastIndexedOrNull(predicate); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from                            ) { return indexOfLastIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate, final int               from                            ) { return indexOfLastIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from                            ) { return indexOfLastIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from                            ) { return indexOfLastIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from                            ) { return indexOfLastIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from                            ) { return indexOfLastIndexedOrNull(predicate, from); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final int               to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate, final int               from, final int               to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from, final int               to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final int               from, final @Nullable Integer to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate, final int               from, final @Nullable Integer to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate, final int               from, final @Nullable Integer to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final int               to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final int               to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final int               to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntObjPredicate<? super T> predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final IntPredicate               predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastIndexedOrNull(predicate, from, to); }
    @Override public final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer findLastIndexIndexedOrNull(final BooleanSupplier            predicate, final @Nullable Integer from, final @Nullable Integer to) { return indexOfLastIndexedOrNull(predicate, from, to); }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    @Override public final boolean every(final ObjIntPredicate<? super T> predicate) { return all(predicate); }
    @Override public final boolean every(final Predicate<? super T>       predicate) { return all(predicate); }
    @Override public final boolean every(final BooleanSupplier            predicate) { return all(predicate); }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    @Override public final boolean any() { return isNotEmpty(); }

    @Override public final boolean some() { return isNotEmpty(); }

    @Override public final boolean some(final @Nullable ObjIntPredicate<? super T> predicate) { return any(predicate); }
    @Override public final boolean some(final @Nullable Predicate<? super T>       predicate) { return any(predicate); }
    @Override public final boolean some(final @Nullable BooleanSupplier            predicate) { return any(predicate); }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    @Override public final boolean none() { return isEmpty(); }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    @Override public final boolean includesNull() { return hasNull(); }

    @Override public final boolean containsNull() { return hasNull(); }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    @Override public final boolean includesNoNulls() { return hasNoNulls(); }

    @Override public final boolean containsNoNulls() { return hasNoNulls(); }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    @Override public final boolean includesDuplicate() { return hasDuplicate(); }

    @Override public final boolean containsDuplicate() { return hasDuplicate(); }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    @Override public final boolean includesNoDuplicates() { return hasNoDuplicates(); }

    @Override public final boolean containsNoDuplicates() { return hasNoDuplicates(); }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    @Override public final boolean includes(final T value) { return has(value); }

    @Override public final boolean contains(final T value) { return  has(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    @Override public final boolean includesNot(final T value) { return hasNot(value); }

    @Override public final boolean containsNot(final T value) { return  hasNot(value); }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

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
    @Override public final boolean includesOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasOne(values); }
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
    @Override public final boolean containsOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasOne(values); }
    @Override public final boolean containsOne(final T @Nullable @Unmodifiable []                               values) { return hasOne(values); }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

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
    @Override public final boolean includesNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotOne(values); }
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
    @Override public final boolean containsNotOne(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotOne(values); }
    @Override public final boolean containsNotOne(final T @Nullable @Unmodifiable []                               values) { return hasNotOne(values); }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

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
    @Override public final boolean includesAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasAll(values); }
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
    @Override public final boolean containsAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasAll(values); }
    @Override public final boolean containsAll(final T @Nullable @Unmodifiable []                               values) { return hasAll(values); }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

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
    @Override public final boolean includesNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotAll(values); }
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
    @Override public final boolean containsNotAll(final @Nullable @Unmodifiable Deque<? extends T>                 values) { return hasNotAll(values); }
    @Override public final boolean containsNotAll(final T @Nullable @Unmodifiable []                               values) { return hasNotAll(values); }

    //#endregion -------------------- Has not all --------------------

    //#endregion -------------------- Validation methods --------------------
//    //#region -------------------- Accumulation methods --------------------
//
//    //#region -------------------- Reduce --------------------
//
//    @Override public final <R extends @Nullable Object> R reduce(final ObjIntAccumulator<? super T, R> operation, final R initial) { return fold(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduce(final ObjAccumulator<? super T, R>    operation, final R initial) { return fold(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduce(final UnaryOperator<R>                operation, final R initial) { return fold(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduce(final Supplier<? extends R>           operation, final R initial) { return fold(initial, operation); }
//
//    //#endregion -------------------- Reduce --------------------
//    //#region -------------------- Reduce indexed --------------------
//
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final IntObjAccumulator<? super T, R> operation, final R initial) { return foldIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final IntAccumulator<R>               operation, final R initial) { return foldIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final UnaryOperator<R>                operation, final R initial) { return foldIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceIndexed(final Supplier<? extends R>           operation, final R initial) { return foldIndexed(initial, operation); }
//
//    //#endregion -------------------- Reduce indexed --------------------
//
//    //#region -------------------- Reduce right --------------------
//
//    @Override public final <R extends @Nullable Object> R reduceRight(final ObjIntAccumulator<? super T, R> operation, final R initial) { return foldRight(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRight(final ObjAccumulator<? super T, R>    operation, final R initial) { return foldRight(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRight(final UnaryOperator<R>                operation, final R initial) { return foldRight(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRight(final Supplier<? extends R>           operation, final R initial) { return foldRight(initial, operation); }
//
//    //#endregion -------------------- Reduce right --------------------
//    //#region -------------------- Reduce right indexed --------------------
//
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final IntObjAccumulator<? super T, R> operation, final R initial) { return foldRightIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final IntAccumulator<R>               operation, final R initial) { return foldRightIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final UnaryOperator<R>                operation, final R initial) { return foldRightIndexed(initial, operation); }
//    @Override public final <R extends @Nullable Object> R reduceRightIndexed(final Supplier<? extends R>           operation, final R initial) { return foldRightIndexed(initial, operation); }
//
//    //#endregion -------------------- Reduce right indexed --------------------
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

    //#region -------------------- Take --------------------

    @Override public final CollectionHolder<T> limit(int     n) { return take(n); }
    @Override public final CollectionHolder<T> limit(Integer n) { return take(n); }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    @Override public final CollectionHolder<T> limitWhile(ObjIntPredicate<? super T> predicate) { return takeWhile(predicate); }
    @Override public final CollectionHolder<T> limitWhile(Predicate<? super T>       predicate) { return takeWhile(predicate); }
    @Override public final CollectionHolder<T> limitWhile(BooleanSupplier            predicate) { return takeWhile(predicate); }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    @Override public final CollectionHolder<T> limitWhileIndexed(IntObjPredicate<? super T> predicate) { return takeWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitWhileIndexed(IntPredicate               predicate) { return takeWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitWhileIndexed(BooleanSupplier            predicate) { return takeWhileIndexed(predicate); }

    //#endregion -------------------- Take while indexed --------------------
    //#region -------------------- Take last --------------------

    @Override public final CollectionHolder<T> limitLast(int     n) { return takeLast(n); }
    @Override public final CollectionHolder<T> limitLast(Integer n) { return takeLast(n); }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    @Override public final CollectionHolder<T> limitLastWhile(ObjIntPredicate<? super T> predicate) { return takeLastWhile(predicate); }
    @Override public final CollectionHolder<T> limitLastWhile(Predicate<? super T>       predicate) { return takeLastWhile(predicate); }
    @Override public final CollectionHolder<T> limitLastWhile(BooleanSupplier            predicate) { return takeLastWhile(predicate); }

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    @Override public final CollectionHolder<T> limitLastWhileIndexed(IntObjPredicate<? super T> predicate) { return takeLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitLastWhileIndexed(IntPredicate               predicate) { return takeLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> limitLastWhileIndexed(BooleanSupplier            predicate) { return takeLastWhileIndexed(predicate); }

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    @Override public final CollectionHolder<T> skip(int     n) { return drop(n); }
    @Override public final CollectionHolder<T> skip(Integer n) { return drop(n); }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    @Override public final CollectionHolder<T> skipWhile(ObjIntPredicate<? super T> predicate) { return dropWhile(predicate); }
    @Override public final CollectionHolder<T> skipWhile(Predicate<? super T>       predicate) { return dropWhile(predicate); }
    @Override public final CollectionHolder<T> skipWhile(BooleanSupplier            predicate) { return dropWhile(predicate); }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    @Override public final CollectionHolder<T> skipWhileIndexed(IntObjPredicate<? super T> predicate) { return dropWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipWhileIndexed(IntPredicate               predicate) { return dropWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipWhileIndexed(BooleanSupplier            predicate) { return dropWhileIndexed(predicate); }

    //#endregion -------------------- Drop while indexed --------------------
    //#region -------------------- Drop last --------------------

    @Override public final CollectionHolder<T> skipLast(int     n) { return dropLast(n); }
    @Override public final CollectionHolder<T> skipLast(Integer n) { return dropLast(n); }

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop while --------------------

    @Override public final CollectionHolder<T> skipLastWhile(ObjIntPredicate<? super T> predicate) { return dropLastWhile(predicate); }
    @Override public final CollectionHolder<T> skipLastWhile(Predicate<? super T>       predicate) { return dropLastWhile(predicate); }
    @Override public final CollectionHolder<T> skipLastWhile(BooleanSupplier            predicate) { return dropLastWhile(predicate); }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    @Override public final CollectionHolder<T> skipLastWhileIndexed(IntObjPredicate<? super T> predicate) { return dropLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipLastWhileIndexed(IntPredicate               predicate) { return dropLastWhileIndexed(predicate); }
    @Override public final CollectionHolder<T> skipLastWhileIndexed(BooleanSupplier            predicate) { return dropLastWhileIndexed(predicate); }

    //#endregion -------------------- Drop while indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- On each --------------------

    @Contract(ALWAYS_THIS_1) @Override public abstract AbstractUnimplementedCollectionHolder<T> onEach(final ObjIntConsumer<? super T> action);
    @Contract(ALWAYS_THIS_1) @Override public abstract AbstractUnimplementedCollectionHolder<T> onEach(final Consumer<? super T>       action);
    @Contract(ALWAYS_THIS_1) @Override public abstract AbstractUnimplementedCollectionHolder<T> onEach(final Runnable                  action);

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    @Contract(ALWAYS_THIS_1) @Override public abstract AbstractUnimplementedCollectionHolder<T> onEachIndexed(final IntObjConsumer<? super T> action);
    @Contract(ALWAYS_THIS_1) @Override public abstract AbstractUnimplementedCollectionHolder<T> onEachIndexed(final IntConsumer               action);
    @Contract(ALWAYS_THIS_1) @Override public abstract AbstractUnimplementedCollectionHolder<T> onEachIndexed(final Runnable                  action);

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

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

    //#region -------------------- To string --------------------

    @Override public abstract String toString();

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

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
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractUnimplementedCollectionHolder<T> clone() {
        try {
            return (AbstractUnimplementedCollectionHolder<T>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new InternalError("The “clone” method was not expected to be thrown in “" + getClass().getSimpleName() + "”.", exception);
        }
    }

//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public abstract AbstractUnimplementedCollectionHolder<T> shallowClone();
//
//    @MustBeInvokedByOverriders
//    @Contract(ALWAYS_NEW_0)
//    @Override public abstract AbstractUnimplementedCollectionHolder<T> deepClone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
