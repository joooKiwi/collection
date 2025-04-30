package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
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

/// An [immutable-like][Unmodifiable] behaviour of a [DelayQueue]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableDelayQueue<T extends Delayed>
        extends DelayQueue<T>
        implements Cloneable {

    //#region -------------------- Fields --------------------

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [DelayQueue]
    public ImmutableDelayQueue() {
        super();
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [DelayQueue]
    /// with only the `values` stored inside
    public ImmutableDelayQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super();
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.offer(values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [DelayQueue]
    /// with only the `values` stored inside
    public ImmutableDelayQueue(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        __size = values.size();
        if (__isEmpty = values.isEmpty())
            return;
        for (final T value : values)
            super.offer(value);
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


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public ImmutableDelayQueue<T> clone() { return new ImmutableDelayQueue<>(this); }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ImmutableDelayQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable DelayQueue."); }

    /// Fail to add the `values` in the current [ImmutableDelayQueue]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable TreeSet."); }

    /// Fail to add a `value` to the current [ImmutableDelayQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable DelayQueue."); }

    /// Fail to add a `value` to the current [ImmutableDelayQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override public boolean offer(final @Nullable T value, final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable DelayQueue."); }

    /// Fail to remove and retrieve the head of the current [ImmutableDelayQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable DelayQueue."); }

    /// Fail to remove and retrieve the head of the current [ImmutableDelayQueue]
    ///
    /// @param timeout The (_never used_) unit of `unit`
    /// @param unit The (_never used_) time unit
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public T poll(final long timeout, final @Nullable TimeUnit unit) { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable DelayQueue."); }

    /// Fail to add a `value` to the current [ImmutableDelayQueue]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void put(final @Nullable T value) { throw new UnsupportedOperationException("The method “put” is not supported in an immutable DelayQueue."); }


    /// Fail to remove and retrieve the head of the current [ImmutableDelayQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T take() { throw new UnsupportedOperationException("The method “take” is not supported in an immutable DelayQueue."); }


    /// Fail to clear the current [ImmutableDelayQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable DelayQueue."); }


    /// Fail to remove the head of the current [ImmutableDelayQueue]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable DelayQueue."); }

    /// Fail to remove a `value` in the current [ImmutableDelayQueue]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable DelayQueue."); }

    /// Fail to remove the `values` in the current [ImmutableDelayQueue]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable DelayQueue."); }

    /// Fail to remove anything to the current [ImmutableDelayQueue]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable DelayQueue."); }


    /// Fail to keep the `values` in the current [ImmutableDelayQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable DelayQueue."); }


    /// Fail to transfer the `values` from the current [ImmutableDelayQueue]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public int drainTo(final @Nullable @Unmodifiable Collection<? super T> values) { throw new UnsupportedOperationException("The method “drainTo” is not supported in an immutable DelayQueue."); }

    /// Fail to transfer the `values` from the current [ImmutableDelayQueue]
    ///
    /// @param values  The (_never used_) values to keep
    /// @param maximum The (_never used_) maximum of elements to transfer
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override public int drainTo(final @Nullable @Unmodifiable Collection<? super T> values, int maximum) { throw new UnsupportedOperationException("The method “drainTo” is not supported in an immutable DelayQueue."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
