package joookiwi.collection.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.callback.ArraySupplier;
import joookiwi.collection.java.callback.CollectionHolderSupplier;
import joookiwi.collection.java.callback.CollectionIteratorSupplier;
import joookiwi.collection.java.callback.CollectionSupplier;
import joookiwi.collection.java.callback.DequeSupplier;
import joookiwi.collection.java.callback.IterableSupplier;
import joookiwi.collection.java.callback.ListSupplier;
import joookiwi.collection.java.callback.MinimalistCollectionHolderSupplier;
import joookiwi.collection.java.callback.QueueSupplier;
import joookiwi.collection.java.callback.SetSupplier;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.extended.ArrayAsImmutableCollection;
import joookiwi.collection.java.extended.ArrayAsImmutableDeque;
import joookiwi.collection.java.extended.ArrayAsImmutableList;
import joookiwi.collection.java.extended.ArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.ArrayAsImmutableQueue;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedCollection;
import joookiwi.collection.java.extended.ArrayAsImmutableSequencedSet;
import joookiwi.collection.java.extended.ArrayAsImmutableSet;
import joookiwi.collection.java.extended.ArrayAsImmutableSortedSet;
import joookiwi.collection.java.extended.BasicStack;
import joookiwi.collection.java.extended.ImmutableArrayList;
import joookiwi.collection.java.extended.ImmutableCopyOnWriteArrayList;
import joookiwi.collection.java.extended.ImmutableHashSet;
import joookiwi.collection.java.extended.ImmutableLinkedHashSet;
import joookiwi.collection.java.extended.ImmutableLinkedList;
import joookiwi.collection.java.extended.ImmutableStack;
import joookiwi.collection.java.extended.ImmutableTreeSet;
import joookiwi.collection.java.extended.ImmutableVector;
import joookiwi.collection.java.extended.MutableArrayList;
import joookiwi.collection.java.extended.MutableCopyOnWriteArrayList;
import joookiwi.collection.java.extended.MutableHashSet;
import joookiwi.collection.java.extended.MutableLinkedHashSet;
import joookiwi.collection.java.extended.MutableLinkedList;
import joookiwi.collection.java.extended.MutableStack;
import joookiwi.collection.java.extended.MutableTreeSet;
import joookiwi.collection.java.extended.MutableVector;
import joookiwi.collection.java.extended.OrderableCollection;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableDeque;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableList;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableSequencedCollection;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableSequencedSet;
import joookiwi.collection.java.extended.ReversedArrayAsImmutableSortedSet;
import joookiwi.collection.java.extended.SubdividedArrayAsImmutableList;
import joookiwi.collection.java.extended.SubdividedArrayAsImmutableNavigableSet;
import joookiwi.collection.java.extended.SubdividedArrayAsImmutableSortedSet;
import joookiwi.collection.java.helper.ArrayCreator;
import joookiwi.collection.java.iterator.CollectionIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A [MinimalistCollectionHolder] having the values eagerly retrieved.
///
/// Meaning that every value is retrieved during the construction,
/// and will never change after the initialization.
///
/// @param <T> The type
/// @see GenericCollectionHolder
/// @see EmptyCollectionHolder
@NotNullByDefault
public class GenericMinimalistCollectionHolder<T extends @Nullable Object>
        extends AbstractMinimalistCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    private final int __size;
    private final T @Unmodifiable [] __array;

    //#region -------------------- Helper fields --------------------

    private @Nullable ArrayCreator __arrayCreator;

    //#endregion -------------------- Helper fields --------------------

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- Constructor (collection holder) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final CollectionHolderSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) CollectionHolder<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.getFirst());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.getFirst(), reference.getLast());
        else
            __array = _arrayCreator().newArray(reference, size);
    }

    //#endregion -------------------- Constructor (collection holder) --------------------
    //#region -------------------- Constructor (minimalist collection holder) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final MinimalistCollectionHolderSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MinimalistCollectionHolder<? extends T> reference) {
        super();
        final var size = this.__size = reference.size();
        if (size == 0)
            __array = emptyArray();
        else if (size == 1)
            __array = _arrayCreator().newArray(reference.get(0));
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.get(0), reference.get(1));
        else
            __array = _arrayCreator().newArray(reference, size);
    }

    //#endregion -------------------- Constructor (minimalist collection holder) --------------------

    //#region -------------------- Constructor (collection iterator) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final CollectionIteratorSupplier<? extends T> lateReference) { this(lateReference.get()); }

    @Contract(mutates = "param")
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) CollectionIterator<? extends T> reference) {
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = __size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.nextValue());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.nextValue(), reference.nextValue());
        else
            __array = _arrayCreator().newArray(reference, size);
    }

    //#endregion -------------------- Constructor (collection iterator) --------------------

    //#region -------------------- Constructor (iterator) --------------------

    @Contract(mutates = "param")
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Iterator<? extends T> reference) {
        if (!reference.hasNext()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var value1 = reference.next();
        if (!reference.hasNext()) {
            __size = 1;
            __array = _arrayCreator().newArray(value1);
            return;
        }

        final var value2 = reference.next();
        if (!reference.hasNext()) {
            __size = 2;
            __array = _arrayCreator().newArray(value1, value2);
            return;
        }

        __size = (__array = _arrayCreator().newArray(reference, value1, value2)).length;
    }

    //#endregion -------------------- Constructor (iterator) --------------------
    //#region -------------------- Constructor (list iterator) --------------------

    @Contract(mutates = "param")
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ListIterator<? extends T> reference) { this((Iterator<? extends T>) reference); }

    //#endregion -------------------- Constructor (list iterator) --------------------
    //#region -------------------- Constructor (enumeration) --------------------

    @Contract(mutates = "param")
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Enumeration<? extends T> reference) {
        if (!(reference.hasMoreElements())) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var value1 = reference.nextElement();
        if (!reference.hasMoreElements()) {
            __size = 1;
            __array = _arrayCreator().newArray(value1);
            return;
        }

        final var value2 = reference.nextElement();
        if (!reference.hasMoreElements()) {
            __size = 2;
            __array = _arrayCreator().newArray(value1, value2);
            return;
        }

        __size = (__array = _arrayCreator().newArray(reference, value1, value2)).length;
    }

    //#endregion -------------------- Constructor (enumeration) --------------------
    //#region -------------------- Constructor (spliterator) --------------------

    @Contract(mutates = "param")
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Spliterator<? extends T> reference) {
        final AtomicReference<@Nullable T> tempValue = new AtomicReference<>();
        if (!(reference.tryAdvance(tempValue::set))) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var value1 = tempValue.get();
        if (!reference.tryAdvance(tempValue::set)) {
            __size = 1;
            __array = _arrayCreator().newArray(value1);
            return;
        }

        final var value2 = tempValue.get();
        if (!reference.tryAdvance(tempValue::set)) {
            __size = 2;
            __array = _arrayCreator().newArray(value1, value2);
            return;
        }

        __size = (__array = _arrayCreator().newArray(reference, value1, value2, tempValue.get())).length;
    }

    //#endregion -------------------- Constructor (spliterator) --------------------

    //#region -------------------- Constructor (iterable) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final IterableSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) Iterable<? extends T> reference) {
        super();
        final var iterator = reference.iterator();

        if (!(iterator.hasNext())) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var value1 = iterator.next();
        if (!iterator.hasNext()) {
            __size = 1;
            __array = _arrayCreator().newArray(value1);
            return;
        }

        final var value2 = iterator.next();
        if (!iterator.hasNext()) {
            __size = 2;
            __array = _arrayCreator().newArray(value1, value2);
            return;
        }

        __size = (this.__array = _arrayCreator().newArray(iterator, value1, value2)).length;
    }

    //#endregion -------------------- Constructor (iterable) --------------------

    //#region -------------------- Constructor (collection) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final CollectionSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.iterator().next());
        else if (size == 2) {
            final var iterator = reference.iterator();
            __array = _arrayCreator().newArray(iterator.next(), iterator.next());
        }
        else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }

    //#endregion -------------------- Constructor (collection) --------------------
    //#region -------------------- Constructor (orderable collection) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable OrderableCollection<? extends T> reference) { this((Collection<? extends T>) reference); }

    //#endregion -------------------- Constructor (orderable collection) --------------------
    //#region -------------------- Constructor (sequenced collection) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SequencedCollection<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.getFirst());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.getFirst(), reference.getLast());
        else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSequencedCollection<? extends T> reference) { this((SequencedCollection<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableSequencedCollection<? extends T, ?, ?> reference) { this((SequencedCollection<? extends T>) reference); }

    //#endregion -------------------- Constructor (sequenced collection) --------------------

    //#region -------------------- Constructor (list) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ListSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable List<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.getFirst());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.getFirst(), reference.getLast());
        else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) SubdividedArrayAsImmutableList<? extends T, ?, ?> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableList<? extends T, ?, ?> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (list) --------------------
    //#region -------------------- Constructor (array list) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable ArrayList<? extends T> reference) { this((List<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (array list) --------------------
    //#region -------------------- Constructor (copy on white array list) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable CopyOnWriteArrayList<? extends T> reference) { this((List<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableCopyOnWriteArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableCopyOnWriteArrayList<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (copy on write array list) --------------------
    //#region -------------------- Constructor (linked list) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable LinkedList<? extends T> reference) { this((List<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableLinkedList<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableLinkedList<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (linked list) --------------------
    //#region -------------------- Constructor (vector) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Vector<? extends T> reference) { this((List<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableVector<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableVector<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (vector) --------------------

    //#region -------------------- Constructor (set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final SetSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Set<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.iterator().next());
        else if (size == 2) {
            final var iterator = reference.iterator();
            __array = _arrayCreator().newArray(iterator.next(), iterator.next());
        } else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSet<? extends T> reference) { this((Set<? extends T>) reference); }

    //#endregion -------------------- Constructor (set) --------------------
    //#region -------------------- Constructor (sequenced set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SequencedSet<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.getFirst());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.getFirst(), reference.getLast());
        else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSequencedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableSequencedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (sequenced set) --------------------
    //#region -------------------- Constructor (sorted set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableSortedSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) SubdividedArrayAsImmutableSortedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableSortedSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (sorted set) --------------------
    //#region -------------------- Constructor (navigable set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable NavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableNavigableSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) SubdividedArrayAsImmutableNavigableSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableNavigableSet<? extends T, ?, ?> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (navigable set) --------------------
    //#region -------------------- Constructor (hash set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable HashSet<? extends T> reference) { this((Set<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableHashSet<? extends T> reference) { this((Set<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableHashSet<? extends T> reference) { this((Set<? extends T>) reference); }

    //#endregion -------------------- Constructor (hash set) --------------------
    //#region -------------------- Constructor (linked hash set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable LinkedHashSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableLinkedHashSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableLinkedHashSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (linked hash set) --------------------
    //#region -------------------- Constructor (tree set) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable TreeSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableTreeSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableTreeSet<? extends T> reference) { this((SequencedSet<? extends T>) reference); }

    //#endregion -------------------- Constructor (tree set) --------------------

    //#region -------------------- Constructor (queue) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final QueueSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Queue<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.element());
        else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableQueue<? extends T> reference) { this((Queue<? extends T>) reference); }

    //#endregion -------------------- Constructor (queue) --------------------

    //#region -------------------- Constructor (deque) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final DequeSupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Deque<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.getFirst());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.getFirst(), reference.getLast());
        else
            __array = _arrayCreator().newArray(reference, size);
    }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ArrayAsImmutableDeque<? extends T> reference) { this((Deque<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ReversedArrayAsImmutableDeque<? extends T, ?, ?> reference) { this((Deque<? extends T>) reference); }

    //#endregion -------------------- Constructor (deque) --------------------
    //#region -------------------- Constructor (basic stack) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable BasicStack<? extends T> reference) {
        super();
        if (reference.isEmpty()) {
            __size = 0;
            __array = emptyArray();
            return;
        }

        final var size = this.__size = reference.size();
        if (size == 1)
            __array = _arrayCreator().newArray(reference.getFirst());
        else if (size == 2)
            __array = _arrayCreator().newArray(reference.getFirst(), reference.getLast());
        else
            __array = _arrayCreator().newArray(reference, size);
    }

    //#endregion -------------------- Constructor (basic stack) --------------------
    //#region -------------------- Constructor (stack) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Stack<? extends T> reference) { this((List<? extends T>) reference); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) ImmutableStack<? extends T> reference) { this((List<? extends T>) reference); }

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) MutableStack<? extends T> reference) { this((List<? extends T>) reference); }

    //#endregion -------------------- Constructor (stack) --------------------

    //#region -------------------- Constructors (array) --------------------

    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final ArraySupplier<? extends T> lateReference) { this(lateReference.get()); }


    @Contract(pure = true)
    public GenericMinimalistCollectionHolder(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] reference) {
        super();
        final var size = this.__size = reference.length;
        if (size == 0)
            __array = emptyArray();
        else if (size == 1)
            __array = _arrayCreator().newArray(reference[0]);
        else if (size == 2)
            __array = _arrayCreator().newArray(reference[0], reference[1]);
        else
            __array = _arrayCreator().newArray(reference, size);
    }

    //#endregion -------------------- Constructors (array) --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Getter methods --------------------

    /// The `array` stored (from the construction) for the current [collection][GenericMinimalistCollectionHolder]
    @Contract(pure = true)
    protected T @Unmodifiable [] _array() { return __array; }

    /// A helper class to create an array
    protected ArrayCreator _arrayCreator() {
        final var value = __arrayCreator;
        if (value != null)
            return value;
        return __arrayCreator = ArrayCreator.getInstance();
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    @OnlyGivePositiveValue
    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Override public T get(final int index) {
        final var size = size();
        if (size == 0)
            throw new EmptyCollectionException(null, index);
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

    //#endregion -------------------- Methods --------------------

}
