package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An [immutable-like][Unmodifiable] behaviour of a [ConcurrentLinkedDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableConcurrentLinkedDeque<T>
        extends ConcurrentLinkedDeque<T>
        implements BasicStack<T>,
                   Cloneable {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 1019955596194365726L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ConcurrentLinkedDeque]
    public ImmutableConcurrentLinkedDeque() {
        super();
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ConcurrentLinkedDeque]
    public ImmutableConcurrentLinkedDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(new ArrayAsCollection<>(values));
        __isEmpty = (__size = values.length) == 0;
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ConcurrentLinkedDeque]
    public ImmutableConcurrentLinkedDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values);
        __isEmpty = (__size = values.size()) == 0;
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
    @Override public T getFirst() { return super.getFirst(); }

    @Contract(pure = true)
    @Override public T getLast() { return super.getLast(); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public ImmutableConcurrentLinkedDeque<T> clone() { return new ImmutableConcurrentLinkedDeque<>(this); }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the start of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final @Nullable T value) { throw new UnsupportedOperationException("The method “push” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to add a `value` to the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to add the `values` in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable ConcurrentLinkedDeque."); }


    /// Fail to add a `value` to the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “offerFirst” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “offerLast” is not supported in an immutable ConcurrentLinkedDeque."); }


    /// Fail to remove and retrieve the head of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove and retrieve the first value of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove and retrieve the last value of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable ConcurrentLinkedDeque."); }


    /// Fail to clear the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable ConcurrentLinkedDeque."); }


    /// Fail to remove the first value in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedOperationException("The method “pop” is not supported in an immutable ConcurrentLinkedDeque."); }


    /// Fail to remove the head of the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove a `value` in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove the first value in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove the first occurrence found in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeFirstOccurrence” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove the last value in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove the last occurrence found in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeLastOccurrence” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove the `values` in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable ConcurrentLinkedDeque."); }

    /// Fail to remove anything to the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable ConcurrentLinkedDeque."); }


    /// Fail to keep the `values` in the current [ImmutableConcurrentLinkedDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable ConcurrentLinkedDeque."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------
}
