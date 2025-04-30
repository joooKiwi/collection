package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An [immutable-like][Unmodifiable] behaviour of a [LinkedBlockingDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableLinkedBlockingDeque<T>
        extends LinkedBlockingDeque<T>
        implements BasicStack<T>,
                   Cloneable {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 7496993854860900864L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [LinkedBlockingDeque]
    /// with a capacity of 1
    public ImmutableLinkedBlockingDeque() {
        super(1);
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [LinkedBlockingDeque]
    /// with a capacity as the `values.length` (or `1` if it is empty)
    public ImmutableLinkedBlockingDeque(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length == 0 ? 1 : values.length);
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [LinkedBlockingDeque]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or `1` if it is empty)
    public ImmutableLinkedBlockingDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.isEmpty() ? 1 : values.size());
        final var size = __size = values.size();
        if (__isEmpty = size == 0)
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    @Contract(pure = true)
    @Override public int size() { return __size; }

    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }

    @Contract(pure = true)
    @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }


    @Contract(pure = true)
    @Override public T getFirst() { return super.getFirst(); }

    @Contract(pure = true)
    @Override public T getLast() { return super.getLast(); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public ImmutableLinkedBlockingDeque<T> clone() { return new ImmutableLinkedBlockingDeque<>(this); }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the start of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final @Nullable T value) { throw new UnsupportedOperationException("The method “push” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add the `values` in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override public boolean offer(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “offerFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override public boolean offerFirst(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “offerFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “offerLast” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override public boolean offerLast(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “offerLast” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the head of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the head of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T poll(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the first value of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the first value of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T pollFirst(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the last value of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the last value of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T pollLast(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void put(final @Nullable T value) { throw new UnsupportedOperationException("The method “put” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void putFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “putFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void putLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “putLast” is not supported in an immutable LinkedBlockingDeque."); }


    /// Fail to remove and retrieve the head of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T take() { throw new UnsupportedOperationException("The method “take” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the first value of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T takeFirst() { throw new UnsupportedOperationException("The method “takeFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove and retrieve the last value of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T takeLast() { throw new UnsupportedOperationException("The method “takeLast” is not supported in an immutable LinkedBlockingDeque."); }


    /// Fail to clear the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable LinkedBlockingDeque."); }


    /// Fail to remove the first value in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedOperationException("The method “pop” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove the head of the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove a `value` in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove the first value in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove the first occurrence found in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeFirstOccurrence” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove the last value in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove the last occurrence found in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeLastOccurrence” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove the `values` in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to remove anything to the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable LinkedBlockingDeque."); }


    /// Fail to keep the `values` in the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to transfer the `values` from the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public int drainTo(final @Nullable @Unmodifiable Collection<? super T> values) { throw new UnsupportedOperationException("The method “drainTo” is not supported in an immutable LinkedBlockingDeque."); }

    /// Fail to transfer the `values` from the current [ImmutableLinkedBlockingDeque]
    ///
    /// @param values  The (_never used_) values to keep
    /// @param maximum The (_never used_) maximum of elements to transfer
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public int drainTo(final @Nullable @Unmodifiable Collection<? super T> values, int maximum) { throw new UnsupportedOperationException("The method “drainTo” is not supported in an immutable LinkedBlockingDeque."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
