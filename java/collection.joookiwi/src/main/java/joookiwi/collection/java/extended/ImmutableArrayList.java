package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;

/// An [immutable-like][Unmodifiable] behaviour of a [ArrayList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableArrayList<T>
        extends ArrayList<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 7943208248572134989L;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ArrayList]
    /// (similar to [java.util.List#of()])
    /// with a capacity of [0][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_INITIAL_CAPACITY]
    public ImmutableArrayList() { super(0); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ArrayList]
    /// (similar to {@link java.util.List#of(Object[])})
    /// with the capacity is the `values.length`
    public ImmutableArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values) {
        super(values.length);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.set(index, values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ArrayList]
    /// (similar to [java.util.List#copyOf(Collection)])
    /// with the capacity is the <code>values.[size][Collection#size()]</code>
    public ImmutableArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values) {
        super(values.size());
        if (values.isEmpty())
            return;
        super.addAll(values); //TODO change to setAll or set(index, value) if it is possible
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to mutate the [size][#size()] of the current [ImmutableArrayList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void trimToSize() { throw new UnsupportedOperationException("The method “trimToSize” is not supported in an immutable ArrayList."); }

    /// Fail to mutate the [size][#size()] of the current [ImmutableArrayList]
    ///
    /// @param minCapacity The (_never used_) desired minimum capacity
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void ensureCapacity(final int minCapacity) { throw new UnsupportedOperationException("The method “ensureCapacity” is not supported in an immutable ArrayList."); }


    /// Fail to set the `value` at the `index` specified
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) value to set
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T set(final int index, final @Nullable T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable ArrayList."); }


    /// Fail to add a `value` to the current [ImmutableArrayList]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ArrayList."); }

    /// Fail to add a `value` to the current [ImmutableArrayList]
    ///
    /// @param index The (_never used_) index
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public void add(final int index, final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ArrayList."); }

    /// Fail to add a `value` to the current [ImmutableArrayList]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable ArrayList."); }

    /// Fail to add a `value` to the current [ImmutableArrayList]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable ArrayList."); }

    /// Fail to add the `values` in the current [ImmutableArrayList]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable ArrayList."); }

    /// Fail to add the `values` in the current [ImmutableArrayList]
    ///
    /// @param index  The (_never used_) starting index
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public boolean addAll(final int index, final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable ArrayList."); }


    /// Fail to clear the current [ImmutableArrayList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable ArrayList."); }


    /// Fail to remove a `value` in the current [ImmutableArrayList]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove a `value` in the current [ImmutableArrayList]
    ///
    /// @param index The (_never used_) index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public T remove(final int index) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable ArrayList."); }

    /// Fail to remove the first value in the current [ImmutableArrayList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable ArrayList."); }

    /// Fail to remove the last value in the current [ImmutableArrayList]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable ArrayList."); }

    /// Fail to remove a value in the current [ImmutableArrayList]
    ///
    /// @param from The (_never used_) starting index
    /// @param to The (_never used_) ending index
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override protected void removeRange(final int from, final int to) { throw new UnsupportedOperationException("The method “removeRange” is not supported in an immutable ArrayList."); }

    /// Fail to remove the `values` in the current [ImmutableArrayList]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable ArrayList."); }

    /// Fail to remove anything to the current [ImmutableArrayList]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable ArrayList."); }

    /// Fail to keep the `values` in the current [ImmutableArrayList]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable ArrayList."); }

    /// Fail to replace any value in the current [ImmutableArrayList]
    ///
    /// @param operator the (_never used_) operator
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void replaceAll(final @Nullable UnaryOperator<T> operator) { throw new UnsupportedOperationException("The method “replaceAll” is not supported in an immutable ArrayList."); }


    /// Fail to sort the current [ImmutableArrayList]
    ///
    /// @param comparator The (_never used_) [comparator][Comparator]
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void sort(final @Nullable Comparator<? super T> comparator) { throw new UnsupportedOperationException("The method “sort” is not supported in an immutable ArrayList."); }

    //#endregion -------------------- Unsupported methods --------------------

}
