package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.ImmutableListIterator;
import joookiwi.collection.java.extended.iterator.IteratorAsImmutableIterator;
import joookiwi.collection.java.extended.iterator.ListIteratorAsImmutableListIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [immutable-like][Unmodifiable] behaviour of a [Stack]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableStack<T extends @Nullable Object>
        extends Stack<T>
        implements ImmutableList<T>,
                   BasicStack<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -2440542043666226267L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [ImmutableStack]
    ///
    /// @param <T> The type
    private static final class ImmutableStackView<T extends @Nullable Object>
            extends ImmutableStack<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 206254369087387531L;

        private final List<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public ImmutableStackView(final List<T> reference) {
            super();
            __reference = reference;
        }

        //#endregion -------------------- Constructor --------------------
        //#region -------------------- Methods --------------------

        //#region -------------------- Size methods --------------------

        @Contract(pure = true)
        @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __reference.size(); }

        @Contract(pure = true)
        @Override public boolean isEmpty() { return __reference.isEmpty(); }

        //#endregion -------------------- Size methods --------------------
        //#region -------------------- Get methods --------------------

        @Contract(pure = true)
        @Override public T get(final int index) { return __reference.get(index); }

        @Contract(pure = true)
        @Override public T getFirst() { return __reference.getFirst(); }

        @Contract(pure = true)
        @Override public T getLast() { return __reference.getLast(); }

        //#endregion -------------------- Get methods --------------------
        //#region -------------------- Has methods --------------------

        @Contract(pure = true)
        @Override public boolean contains(final @Nullable Object value) { return __reference.contains(value); }

        @Contract(pure = true)
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
        @Override public ImmutableStackView<T> subList(final int from, final int to) { return new ImmutableStackView<>(__reference.subList(from, to)); }

        //#endregion -------------------- As subdivided methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableStackView<T> reversed() { return new ImmutableStackView<>(__reference.reversed()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(__reference.iterator()); }

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableListIterator<T> listIterator() { return new ListIteratorAsImmutableListIterator<>(__reference.listIterator()); }

        @Contract(ALWAYS_NEW_1)
        @Override public ImmutableListIterator<T> listIterator(final int index) { return new ListIteratorAsImmutableListIterator<>(__reference.listIterator(index)); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Spliterator<T> spliterator() { return __reference.spliterator(); }

        //#endregion -------------------- Iterator methods --------------------
        //#region -------------------- To array methods --------------------

        @Contract(pure = true)
        @Override public @Nullable Object[] toArray() { return __reference.toArray(); }

        @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return __reference.toArray(newArray); }

        @Contract(ALWAYS_NEW_1)
        @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return __reference.toArray(generator); }

        //#endregion -------------------- To array methods --------------------
        //#region -------------------- Stream methods --------------------

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Stream<T> stream() { return __reference.stream(); }

        @Contract(value = ALWAYS_NEW_0, pure = true)
        @Override public Stream<T> parallelStream() { return __reference.parallelStream(); }

        //#endregion -------------------- Stream methods --------------------
        //#region -------------------- Clone methods --------------------

        @MustBeInvokedByOverriders
        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableStackView<T> clone() { return (ImmutableStackView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [Stack]
    public ImmutableStack() {
        super();
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [Stack]
    /// with a capacity as the `values.length` (or `1` if it is empty)
    public ImmutableStack(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super();
        final var size = __size = elementCount = values.length;
        if (__isEmpty = size == 0)
            return;

        final var array = elementData;
        var index = -1;
        while (++index < size)
            array[index] = values[index];
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [Stack]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or `1` if it is empty)
    public ImmutableStack(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        final var size = __size = values.size();
        if (__isEmpty = size == 0)
            return;
        super.addAll(values); //TODO change to setAll or set(index, value) if it is possible
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public int size() { return __size; }

    @Contract(pure = true)
    @Override public int capacity() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    @Contract(pure = true)
    @Override public boolean empty() { return __isEmpty; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public @Nullable T peek() { return super.peek(); }


    @Override public T get(final int index) { return super.get(index); }

    @Override public T elementAt(final int index) { return super.elementAt(index); }


    @Override public T getFirst() { return super.getFirst(); }

    @Override public T firstElement() { return super.firstElement(); }


    @Override public T getLast() { return super.getLast(); }

    @Override public T lastElement() { return super.lastElement(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(pure = true)
    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Index methods --------------------

    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int search(final @Nullable Object value) { return super.search(value); }


    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int indexOf(final @Nullable Object value) { return super.indexOf(value); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int indexOf(final @Nullable Object value, final int index) { return super.indexOf(value, index); }


    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int lastIndexOf(final @Nullable Object value) { return super.lastIndexOf(value); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE - 1) int lastIndexOf(final @Nullable Object value, final int index) { return super.lastIndexOf(value, index); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableListIterator<T> listIterator() { return new ListIteratorAsImmutableListIterator<>(super.listIterator()); }

    @Contract(ALWAYS_NEW_1)
    @Override public ImmutableListIterator<T> listIterator(final int index) { return new ListIteratorAsImmutableListIterator<>(super.listIterator(index)); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

    @Contract(ALWAYS_NEW_0)
    @Override public Enumeration<T> elements() { return super.elements(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Override public @Nullable Object[] toArray() { return super.toArray(); }

    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) { return super.toArray(newArray); }

    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return super.toArray(generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { return super.stream(); }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { return super.parallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Sublist methods --------------------

    @Contract(ALWAYS_NEW_2)
    @Override public ImmutableStack<T> subList(final int fromIndex, final int toIndex) { return new ImmutableStackView<>(super.subList(fromIndex, toIndex)); }

    //#endregion -------------------- Sublist methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableStack<T> reversed() { return new ImmutableStackView<>(super.reversed()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableStack<T> clone() {
        try {
            return (ImmutableStack<T>) super.clone();
        } catch (InternalError error) {
            if (error.getCause() instanceof CloneNotSupportedException)
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- Copy into methods --------------------

    @Override public void copyInto(final Object[] reference) { super.copyInto(reference); }

    //#endregion -------------------- Copy into methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return super.toString(); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to mutate the [size][#size()] of the current [ImmutableStack]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void trimToSize() { throw new UnsupportedOperationException("The method “trimToSize” is not supported in an immutable Stack."); }

    /// Fail to mutate the [size][#size()] of the current [ImmutableStack]
    ///
    /// @param minCapacity The (_never used_) desired minimum capacity
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void ensureCapacity(final int minCapacity) { throw new UnsupportedOperationException("The method “ensureCapacity” is not supported in an immutable Stack."); }


    /// Fail to set the `value` at the `index` specified
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T set(final int index, final @Nullable T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable Stack."); }

    /// Fail to set the `value` at the `index` specified
    ///
    /// @param value The (_never used_) value to set
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void setElementAt(final @Nullable T value, final int index) { throw new UnsupportedOperationException("The method “setElementAt” is not supported in an immutable Stack."); }


    /// Fail to add a `value` to the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T push(final @Nullable T value) { throw new UnsupportedOperationException("The method “push” is not supported in an immutable Stack."); }


    /// Fail to add a `value` to the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Stack."); }

    /// Fail to add a `value` to the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addElement(final @Nullable T value) { throw new UnsupportedOperationException("The method “addElement” is not supported in an immutable Stack."); }

    /// Fail to add a `value` to the current [ImmutableStack]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Stack."); }

    /// Fail to add a `value` to the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to add
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void insertElementAt(final @Nullable T value, final int index) { throw new UnsupportedOperationException("The method “insertElementAt” is not supported in an immutable Stack."); }

    /// Fail to add a `value` to the start of the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable Stack."); }

    /// Fail to add a `value` to the end of the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable Stack."); }

    /// Fail to add the `values` in the current [ImmutableStack]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Stack."); }

    /// Fail to add the `values` in the current [ImmutableStack]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Stack."); }


    /// Fail to clear the current [ImmutableStack]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable Stack."); }

    /// Fail to clear the current [ImmutableStack]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void removeAllElements() { throw new UnsupportedOperationException("The method “removeAllElements” is not supported in an immutable Stack."); }


    /// Fail to change the [size][#size()] of the [ImmutableStack]
    ///
    /// @param newSize The (_never used_) new size
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void setSize(final int newSize) { throw new UnsupportedOperationException("The method “setSize” is not supported in an immutable Stack."); }


    /// Fail to remove the first value in the current [ImmutableStack]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedOperationException("The method “pop” is not supported in an immutable Stack."); }


    /// Fail to remove a `value` in the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Stack."); }

    /// Fail to remove a `value` in the current [ImmutableStack]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeElement(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeElement” is not supported in an immutable Collection."); }

    /// Fail to remove a `value` in the current [ImmutableStack]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Stack."); }

    /// Fail to remove a `value` in the current [ImmutableStack]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void removeElementAt(final int index) { throw new UnsupportedOperationException("The method “removeElementAt” is not supported in an immutable Stack."); }

    /// Fail to remove the first value in the current [ImmutableStack]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable Stack."); }

    /// Fail to remove the last value in the current [ImmutableStack]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable Stack."); }

    /// Fail to remove a value in the current [ImmutableStack]
    ///
    /// @param from The (_never used_) starting index
    /// @param to The (_never used_) ending index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override protected void removeRange(final int from, final int to) { throw new UnsupportedOperationException("The method “removeRange” is not supported in an immutable Stack."); }

    /// Fail to remove the `values` in the current [ImmutableStack]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable Stack."); }

    /// Fail to remove anything to the current [ImmutableStack]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable Stack."); }


    /// Fail to keep the `values` in the current [ImmutableStack]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable Stack."); }


    /// Fail to replace any value in the current [ImmutableStack]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<T> operator) { throw new UnsupportedOperationException("The method “replaceAll” is not supported in an immutable Stack."); }


    /// Fail to sort the current [ImmutableStack]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { throw new UnsupportedOperationException("The method “sort” is not supported in an immutable Stack."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
