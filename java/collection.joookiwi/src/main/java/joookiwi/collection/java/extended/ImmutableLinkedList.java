package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An [immutable-like][Unmodifiable] behaviour of a [LinkedList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableLinkedList<T extends @Nullable Object>
        extends LinkedList<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 4075097633550903577L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
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
    public ImmutableLinkedList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super();
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(index, values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [LinkedList]
    /// (similar to [java.util.List#copyOf(Collection)])
    public ImmutableLinkedList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
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

    @Contract(pure = true)
    @Override public int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }


    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public ImmutableLinkedList<T> clone() { return new ImmutableLinkedList<>((LinkedList<T>) super.clone()); }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to set the `value` at the `index` specified
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T set(final int index, final @Nullable T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable LinkedList."); }


    /// Fail to add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable LinkedList."); }

    /// Never add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    @Contract(ALWAYS_FALSE_1)
    @Override public boolean offer(final @Nullable T value) { return false; }

    /// Fail to add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final @Nullable T value) { throw new UnsupportedOperationException("The method “push” is not supported in an immutable LinkedList."); }

    /// Fail to add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable LinkedList."); }

    /// Fail to add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable LinkedList."); }

    /// Never add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    @Contract(ALWAYS_FALSE_1)
    @Override public boolean offerFirst(final @Nullable T value) { return false; }

    /// Fail to add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable LinkedList."); }

    /// Never add a `value` to the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to add
    @Contract(ALWAYS_FALSE_1)
    @Override public boolean offerLast(final @Nullable T value) { return false; }

    /// Fail to add the `values` in the current [ImmutableLinkedList]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable LinkedList."); }

    /// Fail to add the `values` in the current [ImmutableLinkedList]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable LinkedList."); }


    /// Fail to clear the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable LinkedList."); }


    /// Fail to remove a `value` in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove a `value` in the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove a `value` in the current [ImmutableLinkedList]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first value in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first `value` in the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeFirstOccurrence” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first value in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedOperationException("The method “pop” is not supported in an immutable LinkedList."); }

    /// Fail to remove and retrieve the first value in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable LinkedList."); }

    /// Fail to remove and retrieve the first value in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable LinkedList."); }

    /// Fail to remove the last value in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable LinkedList."); }

    /// Fail to remove the first `value` in the current [ImmutableLinkedList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeLastOccurrence” is not supported in an immutable LinkedList."); }

    /// Fail to remove and retrieve the last value in the current [ImmutableLinkedList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable LinkedList."); }

    /// Fail to remove a value in the current [ImmutableLinkedList]
    ///
    /// @param from The (_never used_) starting index
    /// @param to The (_never used_) ending index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override protected void removeRange(final int from, final int to) { throw new UnsupportedOperationException("The method “removeRange” is not supported in an immutable LinkedList."); }

    /// Fail to remove the `values` in the current [ImmutableLinkedList]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable LinkedList."); }

    /// Fail to remove anything to the current [ImmutableLinkedList]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable LinkedList."); }

    /// Fail to keep the `values` in the current [ImmutableLinkedList]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable LinkedList."); }

    /// Fail to replace any value in the current [ImmutableLinkedList]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<T> operator) { throw new UnsupportedOperationException("The method “replaceAll” is not supported in an immutable LinkedList."); }


    /// Fail to sort the current [ImmutableLinkedList]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { throw new UnsupportedOperationException("The method “sort” is not supported in an immutable LinkedList."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
