package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.exception.UnsupportedMethodException;
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
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [immutable-like][Unmodifiable] behaviour of a [LinkedList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableLinkedList<T extends @Nullable Object>
        extends LinkedList<T>
        implements ImmutableList<T>,
                   ImmutableDeque<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 7552177605042104572L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [ImmutableLinkedList]
    ///
    /// @param <T> The type
    private static final class ImmutableLinkedListView<T extends @Nullable Object>
            extends ImmutableLinkedList<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = -7846316904055013398L;

        private final List<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public ImmutableLinkedListView(final List<T> reference) {
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


        @Contract(pure = true)
        @Override public T element() { return __reference.getFirst(); }


        @Contract(pure = true)
        @Override public @Nullable T peek() {
            if (__reference.isEmpty())
                return null;
            return __reference.getFirst();
        }

        @Contract(pure = true)
        @Override public @Nullable T peekFirst() {
            if (__reference.isEmpty())
                return null;
            return __reference.getFirst();
        }

        @Contract(pure = true)
        @Override public @Nullable T peekLast() {
            if (__reference.isEmpty())
                return null;
            return __reference.getLast();
        }

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
        @Override public ImmutableLinkedListView<T> subList(final int from, final int to) { return new ImmutableLinkedListView<>(__reference.subList(from, to)); }

        //#endregion -------------------- As subdivided methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableLinkedListView<T> reversed() { return new ImmutableLinkedListView<>(__reference.reversed()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(__reference.iterator()); }

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> descendingIterator() { return new IteratorAsImmutableIterator<>(__reference.reversed().iterator()); }

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
        @Override public ImmutableLinkedListView<T> clone() { return (ImmutableLinkedListView<T>) super.clone(); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [LinkedList]
    /// (similar to [java.util.List#of()])
    public ImmutableLinkedList() {
        super();
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [LinkedList]
    /// (similar to {@link java.util.List#of(Object[])})
    public ImmutableLinkedList(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super();
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.set(index, values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [LinkedList]
    /// (similar to [java.util.List#copyOf(Collection)])
    public ImmutableLinkedList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        final var size = __size = values.size();
        if (__isEmpty = size == 0)
            return;

        var index = -1;
        for (final var value : values)
            super.set(++index, value);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T get(final int index) { return super.get(index); }

    @Contract(pure = true)
    @Override public T getFirst() { return super.getFirst(); }

    @Contract(pure = true)
    @Override public T getLast() { return super.getLast(); }


    @Contract(pure = true)
    @Override public T element() { return super.element(); }

    @Contract(pure = true)
    @Override public @Nullable T peek() { return super.peek(); }

    @Contract(pure = true)
    @Override public @Nullable T peekFirst() { return super.peekFirst(); }

    @Contract(pure = true)
    @Override public @Nullable T peekLast() { return super.peekLast(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(pure = true)
    @Override public boolean contains(final @Nullable Object value) { return super.contains(value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Index methods --------------------

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int indexOf(final @Nullable Object value) { return super.indexOf(value); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object value) { return super.lastIndexOf(value); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_NEW_2)
    @Override public ImmutableLinkedList<T> subList(final int from, final int to) { return new ImmutableLinkedListView<>(super.subList(from, to)); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableLinkedList<T> reversed() { return new ImmutableLinkedListView<>(super.reversed()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> descendingIterator() { return new IteratorAsImmutableIterator<>(super.descendingIterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableListIterator<T> listIterator() { return new ListIteratorAsImmutableListIterator<>(super.listIterator()); }

    @Contract(ALWAYS_NEW_1)
    @Override public ImmutableListIterator<T> listIterator(final int index) { return new ListIteratorAsImmutableListIterator<>(super.listIterator(index)); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return super.spliterator(); }

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
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableLinkedList<T> clone() {
        try {
            return (ImmutableLinkedList<T>) super.clone();
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

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to set the `value` at the `index` specified in the current [instance][ImmutableLinkedList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T set(final int index, final @Nullable T value) { throw new UnsupportedMethodException("The method “set” is not supported in an immutable LinkedList."); }


    /// Fail to add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable LinkedList."); }

    /// Fail to add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable LinkedList."); }

    /// Fail to add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable LinkedList."); }

    /// Fail to add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable LinkedList."); }

    /// Fail to add the `values` in the current [instance][ImmutableLinkedList]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable LinkedList."); }

    /// Fail to add the `values` in the current [instance][ImmutableLinkedList]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable LinkedList."); }


    /// Never add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    @Contract(ALWAYS_FALSE_1)
    @Override public boolean offer(final @Nullable T value) { return false; }

    /// Never add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    @Contract(ALWAYS_FALSE_1)
    @Override public boolean offerFirst(final @Nullable T value) { return false; }

    /// Never add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    @Contract(ALWAYS_FALSE_1)
    @Override public boolean offerLast(final @Nullable T value) { return false; }


    /// Fail to add a `value` to the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final @Nullable T value) { throw new UnsupportedMethodException("The method “push” is not supported in an immutable LinkedList."); }


    /// Fail to clear the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable LinkedList."); }


    /// Fail to remove a `value` in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove a `value` in the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove a `value` in the current [instance][ImmutableLinkedList]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first value in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first `value` in the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeFirstOccurrence” is not supported in an immutable LinkedList."); }

    /// Fail to remove the last value in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first `value` in the current [instance][ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedMethodException("The method “removeLastOccurrence” is not supported in an immutable LinkedList."); }

    /// Fail to remove a value in the current [instance][ImmutableLinkedList]
    ///
    /// @param from The (_never used_) starting index
    /// @param to The (_never used_) ending index
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override protected void removeRange(final int from, final int to) { throw new UnsupportedMethodException("The method “removeRange” is not supported in an immutable LinkedList."); }

    /// Fail to remove the `values` in the current [instance][ImmutableLinkedList]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable LinkedList."); }

    /// Fail to remove anything to the current [instance][ImmutableLinkedList]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable LinkedList."); }


    /// Fail to remove the first value in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedMethodException("The method “pop” is not supported in an immutable LinkedList."); }


    /// Fail to remove and retrieve the first value in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedMethodException("The method “poll” is not supported in an immutable LinkedList."); }

    /// Fail to remove and retrieve the first value in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedMethodException("The method “pollFirst” is not supported in an immutable LinkedList."); }

    /// Fail to remove and retrieve the last value in the current [instance][ImmutableLinkedList]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedMethodException("The method “pollLast” is not supported in an immutable LinkedList."); }


    /// Fail to keep the `values` in the current [instance][ImmutableLinkedList]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable LinkedList."); }


    /// Fail to replace any value in the current [instance][ImmutableLinkedList]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<T> operator) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable LinkedList."); }


    /// Fail to sort the current [instance][ImmutableLinkedList]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { throw new UnsupportedMethodException("The method “sort” is not supported in an immutable LinkedList."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
