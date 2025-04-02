package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An [immutable-like][Unmodifiable] behaviour of a [TreeSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableTreeSet<T>
        extends TreeSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -8968907307423958589L;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][Unmodifiable] instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableTreeSet() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableTreeSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to be safe
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<T> values) {
        super(values.comparator());
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the `comparator` received
    public ImmutableTreeSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                            final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the `comparator` received
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                            final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create an [immutable-like][Unmodifiable] instance of [TreeSet]
    /// ordered according to the `comparator` received
    public ImmutableTreeSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values,
                            final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, comparator --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable TreeSet."); }

    /// Fail to add a `value` in the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable TreeSet."); }

    /// Fail to add a `value` in the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable TreeSet."); }

    /// Fail to add the `values` in the current [ImmutableTreeSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable TreeSet."); }


    /// Fail to clear the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable TreeSet."); }


    /// Fail to remove a `value` in the current [ImmutableTreeSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable TreeSet."); }

    /// Fail to remove the first value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable TreeSet."); }

    /// Fail to remove the last value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable TreeSet."); }

    /// Fail to remove the `values` in the current [ImmutableTreeSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable TreeSet."); }

    /// Fail to remove anything to the current [ImmutableTreeSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable TreeSet."); }


    /// Fail to keep the `values` in the current [ImmutableTreeSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable TreeSet."); }


    /// Fail to retrieve and remove the first value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable TreeSet."); }

    /// Fail to retrieve and remove the last value in the current [ImmutableTreeSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable TreeSet."); }

    //#endregion -------------------- Unsupported methods --------------------

}
