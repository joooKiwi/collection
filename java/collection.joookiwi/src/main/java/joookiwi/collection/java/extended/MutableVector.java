package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.IteratorAsMutableIterator;
import joookiwi.collection.java.extended.iterator.ListIteratorAsMutableListIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import joookiwi.collection.java.extended.iterator.MutableListIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_CAPACITY_INCREMENT;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A mutable behaviour of a [Vector]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableVector<T extends @Nullable Object>
        extends Vector<T>
        implements MutableList<T> {

    @Serial private static final long serialVersionUID = 8287843810729153365L;

    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [MutableVector]
    ///
    /// @param <T> The type
    private static final class MutableVectorView<T extends @Nullable Object>
            extends MutableVector<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 8050396669889119948L;

        private final List<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public MutableVectorView(final List<T> reference) {
            super();
            __reference = reference;
        }

        //#endregion -------------------- Constructor --------------------
        //#region -------------------- Methods --------------------

        //#region -------------------- Size methods --------------------

        @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __reference.size(); }

        @Override public boolean isEmpty() { return __reference.isEmpty(); }

        //#endregion -------------------- Size methods --------------------
        //#region -------------------- Get methods --------------------

        @Override public T get(final int index) { return __reference.get(index); }

        @Override public T getFirst() { return __reference.getFirst(); }

        @Override public T getLast() { return __reference.getLast(); }

        //#endregion -------------------- Get methods --------------------
        //#region -------------------- Set methods --------------------

        @Contract(mutates = "this")
        @Override public T set(final int index, final T value) { return __reference.set(index, value); }

        //#endregion -------------------- Set methods --------------------
        //#region -------------------- Add methods --------------------

        @Contract(mutates = "this")
        @Override public boolean add(final T value) { return __reference.add(value); }

        @Contract(mutates = "this")
        @Override public void addFirst(final T value) { __reference.addFirst(value); }

        @Contract(mutates = "this")
        @Override public void addLast(final T value) { __reference.addLast(value); }


        @Contract(mutates = "this")
        @Override public void add(final int index, final T element) { __reference.add(index, element); }


        @Contract(mutates = "this")
        @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return __reference.addAll(values); }

        @Contract(mutates = "this")
        @Override public boolean addAll(final int index, final @Unmodifiable Collection<? extends T> values) { return __reference.addAll(index, values); }

        //#endregion -------------------- Add methods --------------------
        //#region -------------------- Remove methods --------------------

        @Contract(mutates = "this")
        @Override public T remove(final int index) { return __reference.remove(index); }


        @Contract(mutates = "this")
        @Override public T removeFirst() { return __reference.removeFirst(); }

        @Contract(mutates = "this")
        @Override public T removeLast() { return __reference.removeLast(); }


        @Contract(mutates = "this")
        @Override public boolean remove(final @Nullable Object value) { return __reference.remove(value); }


        @Contract(mutates = "this")
        @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return __reference.removeAll(values); }


        @Contract(mutates = "this")
        @Override public boolean removeIf(final Predicate<? super T> filter) { return __reference.removeIf(filter); }

        //#endregion -------------------- Remove methods --------------------
        //#region -------------------- Replace methods --------------------

        @Contract(mutates = "this")
        @Override public void replaceAll(final UnaryOperator<T> operator) { __reference.replaceAll(operator); }

        //#endregion -------------------- Replace methods --------------------
        //#region -------------------- Retain methods --------------------

        @Contract(mutates = "this")
        @Override public boolean retainAll(final Collection<?> values) { return __reference.retainAll(values); }

        //#endregion -------------------- Retain methods --------------------
        //#region -------------------- Clear methods --------------------

        @Contract(mutates = "this")
        @Override public void clear() { __reference.clear(); }

        //#endregion -------------------- Clear methods --------------------
        //#region -------------------- Has methods --------------------

        @Override public boolean contains(final @Nullable Object value) { return __reference.contains(value); }

        @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return __reference.containsAll(values); }

        //#endregion -------------------- Has methods --------------------
        //#region -------------------- Index methods --------------------

        @Override public @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object value) { return __reference.indexOf(value); }

        @Override public @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object value) { return __reference.lastIndexOf(value); }

        //#endregion -------------------- Index methods --------------------
        //#region -------------------- For each methods --------------------

        @Override public void forEach(final Consumer<? super T> action) { __reference.forEach(action); }

        //#endregion -------------------- For each methods --------------------
        //#region -------------------- As subdivided methods --------------------

        @Contract(ALWAYS_NEW_2)
        @Override public MutableVectorView<T> subList(final int from, final int to) { return new MutableVectorView<>(__reference.subList(from, to)); }

        //#endregion -------------------- As subdivided methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableVectorView<T> reversed() { return new MutableVectorView<>(__reference.reversed()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(__reference.iterator()); }

        @Contract(ALWAYS_NEW_0)
        @Override public MutableListIterator<T> listIterator() { return new ListIteratorAsMutableListIterator<>(__reference.listIterator()); }

        @Contract(ALWAYS_NEW_1)
        @Override public MutableListIterator<T> listIterator(final int index) { return new ListIteratorAsMutableListIterator<>(__reference.listIterator(index)); }

        @Contract(ALWAYS_NEW_0)
        @Override public Spliterator<T> spliterator() { return __reference.spliterator(); }

        //#endregion -------------------- Iterator methods --------------------
        //#region -------------------- To array methods --------------------

        @Override public @Nullable Object[] toArray() { return __reference.toArray(); }

        @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return __reference.toArray(newArray); }

        @Contract(ALWAYS_NEW_1)
        @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return __reference.toArray(generator); }

        //#endregion -------------------- To array methods --------------------
        //#region -------------------- Stream methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public Stream<T> stream() { return __reference.stream(); }

        @Contract(ALWAYS_NEW_0)
        @Override public Stream<T> parallelStream() { return __reference.parallelStream(); }

        //#endregion -------------------- Stream methods --------------------
        //#region -------------------- Sort methods --------------------

        @Contract(mutates = "this")
        @Override public void sort(final @Nullable Comparator<? super T> comparator) { __reference.sort(comparator); }

        //#endregion -------------------- Sort methods --------------------
        //#region -------------------- Clone methods --------------------

        @MustBeInvokedByOverriders
        @Contract(ALWAYS_NEW_0)
        @Override public MutableVectorView<T> clone() { return (MutableVectorView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [Vector] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and the capacity increment of `0`
    public MutableVector() { super(DEFAULT_INITIAL_CAPACITY, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_INT_VALUE) byte initialCapacity) { super(initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_INT_VALUE) short initialCapacity) { super(initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_INT_VALUE) int initialCapacity) { super(initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [Vector]
    /// with the initial capacity as the `values.length`
    /// and the capacity increment of `0`
    public MutableVector(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length, DEFAULT_EMPTY_CAPACITY_INCREMENT);
        final var size = elementCount = values.length;
        if (size == 0)
            return;

        final var array = elementData;
        var index = -1;
        while (++index < size)
            array[index] = values[index];
    }

    /// Create a mutable instance of [Vector]
    /// with the initial capacity as <code>values.[size][Collection#size()]</code>
    /// and the capacity increment of `0`
    public MutableVector(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size(), DEFAULT_EMPTY_CAPACITY_INCREMENT);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return super.size(); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int capacity() { return super.capacity(); }

    @Override public boolean isEmpty() { return super.isEmpty(); }


    @Contract(mutates = "this")
    @Override public void setSize(final int newSize) { super.setSize(newSize); }

    @Contract(mutates = "this")
    @Override public void trimToSize() { super.trimToSize(); }

    @Contract(mutates = "this")
    @Override public void ensureCapacity(final int minimum) { super.ensureCapacity(minimum); }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T get(final int index) { return super.get(index); }

    @Override public T elementAt(final int index) { return super.elementAt(index); }


    @Override public T getFirst() { return super.getFirst(); }

    @Override public T firstElement() { return super.firstElement(); }


    @Override public T getLast() { return super.getLast(); }

    @Override public T lastElement() { return super.lastElement(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Set methods --------------------

    @Contract(mutates = "this")
    @Override public T set(final int index, final T value) { return super.set(index, value); }

    @Contract(mutates = "this")
    @Override public void setElementAt(final T value, final int index) { super.setElementAt(value, index); }

    //#endregion -------------------- Set methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override public boolean add(final T value) { return super.add(value); }

    @Contract(mutates = "this")
    @Override public void addElement(final T value) { super.addElement(value); }

    @Contract(mutates = "this")
    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Contract(mutates = "this")
    @Override public void addLast(final T value) { super.addLast(value); }


    @Contract(mutates = "this")
    @Override public void add(final int index, final T element) { super.add(index, element); }

    @Contract(mutates = "this")
    @Override public void insertElementAt(final T value, final int index) { super.insertElementAt(value, index); }


    @Contract(mutates = "this")
    @Override public boolean addAll(final @Unmodifiable Collection<? extends T> values) { return super.addAll(values); }

    @Contract(mutates = "this")
    @Override public boolean addAll(final int index, final @Unmodifiable Collection<? extends T> values) { return super.addAll(index, values); }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override public T remove(final int index) { return super.remove(index); }

    @Contract(mutates = "this")
    @Override public void removeElementAt(final int index) { super.removeElementAt(index); }


    @Contract(mutates = "this")
    @Override public T removeFirst() { return super.removeFirst(); }

    @Contract(mutates = "this")
    @Override public T removeLast() { return super.removeLast(); }


    @Contract(mutates = "this")
    @Override public boolean remove(final @Nullable Object value) { return super.remove(value); }

    @Contract(mutates = "this")
    @Override public boolean removeElement(final @Nullable Object value) { return super.removeElement(value); }


    @Contract(mutates = "this")
    @Override public boolean removeAll(final Collection<? extends @Nullable Object> values) { return super.removeAll(values); }


    @Contract(mutates = "this")
    @Override public boolean removeIf(final Predicate<? super T> filter) { return super.removeIf(filter); }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Replace methods --------------------

    @Contract(mutates = "this")
    @Override public void replaceAll(final UnaryOperator<T> operator) { super.replaceAll(operator); }

    //#endregion -------------------- Replace methods --------------------
    //#region -------------------- Retain methods --------------------

    @Contract(mutates = "this")
    @Override public boolean retainAll(final Collection<?> values) { return super.retainAll(values); }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override public void clear() { super.clear(); }

    @Contract(mutates = "this")
    @Override public void removeAllElements() { super.removeAllElements(); }

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Has methods --------------------

    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Index methods --------------------

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object value) { return super.indexOf(value); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object value, final int index) { return super.indexOf(value, index); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object value) { return super.lastIndexOf(value); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object value, final int index) { return super.lastIndexOf(value, index); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_NEW_2)
    @Override public MutableVector<T> subList(final int from, final int to) { return new MutableVectorView<>(super.subList(from, to)); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableVector<T> reversed() { return new MutableVectorView<>(super.reversed()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public MutableIterator<T> iterator() { return new IteratorAsMutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Enumeration<T> elements() { return super.elements(); }

    @Contract(ALWAYS_NEW_0)
    @Override public MutableListIterator<T> listIterator() { return new ListIteratorAsMutableListIterator<>(super.listIterator()); }

    @Contract(ALWAYS_NEW_1)
    @Override public MutableListIterator<T> listIterator(final int index) { return new ListIteratorAsMutableListIterator<>(super.listIterator(index)); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Override public @Nullable Object[] toArray() { return super.toArray(); }

    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return super.toArray(newArray); }

    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return super.toArray(generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Copy into methods --------------------

    @Contract(mutates = "param1")
    @Override public void copyInto(final Object[] anArray) { super.copyInto(anArray); }

    //#endregion -------------------- Copy into methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { return super.stream(); }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { return super.parallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Sort methods --------------------

    @Contract(mutates = "this")
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { super.sort(comparator); }

    //#endregion -------------------- Sort methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableVector<T> clone() {
        try {
            return (MutableVector<T>) super.clone();
        } catch (InternalError error) {
            if (error.getCause() instanceof CloneNotSupportedException) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
