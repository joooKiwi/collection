package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.Stack;
import java.util.Vector;
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
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An [immutable-like][Unmodifiable] behaviour of a [Stack]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableStack<T extends @Nullable Object>
        extends Stack<T>
        implements BasicStack<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -4687075000330419307L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
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

    @Contract(pure = true)
    @Override public int size() { return __size; }

    @Contract(pure = true)
    @Override public int capacity() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    @Contract(pure = true)
    @Override public boolean empty() { return __isEmpty; }


    @Override public T getFirst() { return super.getFirst(); }

    @Override public T getLast() { return super.getLast(); }


    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public synchronized ImmutableStack<T> clone() { return new ImmutableStack<>((Vector<T>) super.clone()); }

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
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Stack."); }

    /// Fail to add the `values` in the current [ImmutableStack]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Stack."); }


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
