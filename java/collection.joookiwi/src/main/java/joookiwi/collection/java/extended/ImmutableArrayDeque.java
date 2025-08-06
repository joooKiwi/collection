package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.IteratorAsImmutableIterator;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// An [immutable-like][Unmodifiable] behaviour of a [ArrayDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class ImmutableArrayDeque<T>
        extends ArrayDeque<T>
        implements ImmutableDeque<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -4825193968976311256L;

    private final int __size;
    private final boolean __isEmpty;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Sub class --------------------

    /// A view of a subdivided or reversed [ImmutableArrayDeque]
    ///
    /// @param <T> The type
    @NotNullByDefault
    private static final class ImmutableArrayDequeView<T>
            extends ImmutableArrayDeque<T> {

        //#region -------------------- Fields --------------------

        @Serial private static final long serialVersionUID = 7263046732193222993L;

        private final Deque<T> __reference;

        //#endregion -------------------- Fields --------------------
        //#region -------------------- Constructor --------------------

        public ImmutableArrayDequeView(final Deque<T> reference) {
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
        @Override public T getFirst() { return __reference.getFirst(); }

        @Contract(pure = true)
        @Override public T getLast() { return __reference.getLast(); }


        @Contract(pure = true)
        @Override public T element() { return __reference.element(); }


        @Contract(pure = true)
        @Override public @Nullable T peek() { return __reference.peek(); }

        @Contract(pure = true)
        @Override public @Nullable T peekFirst() { return __reference.peekFirst(); }

        @Contract(pure = true)
        @Override public @Nullable T peekLast() { return __reference.peekLast(); }

        //#endregion -------------------- Get methods --------------------
        //#region -------------------- Has methods --------------------

        @Contract(pure = true)
        @Override public boolean contains(final @Nullable Object value) { return __reference.contains(value); }

        @Contract(pure = true)
        @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return __reference.containsAll(values); }

        //#endregion -------------------- Has methods --------------------
        //#region -------------------- For each methods --------------------

        @Override public void forEach(final Consumer<? super T> action) { __reference.forEach(action); }

        //#endregion -------------------- For each methods --------------------
        //#region -------------------- As reverse methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableArrayDequeView<T> reversed() { return new ImmutableArrayDequeView<>(__reference.reversed()); }

        //#endregion -------------------- As reverse methods --------------------
        //#region -------------------- Iterator methods --------------------

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(__reference.iterator()); }

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableIterator<T> descendingIterator() { return new IteratorAsImmutableIterator<>(__reference.descendingIterator()); }

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

        @Contract(ALWAYS_NEW_0)
        @Override public ImmutableArrayDequeView<T> clone() { return new ImmutableArrayDequeView<>(__reference); }

        //#endregion -------------------- Clone methods --------------------
        //#region -------------------- To string methods --------------------

        @Override public String toString() { return __reference.toString(); }

        //#endregion -------------------- To string methods --------------------

        //#endregion -------------------- Methods --------------------

    }

    //#endregion -------------------- Sub class --------------------
    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ArrayDeque]
    /// with a capacity of 1
    public ImmutableArrayDeque() {
        super(1);
        __size = 0;
        __isEmpty = true;
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ArrayDeque]
    /// with a capacity as the `values.length` (or `1` if it is empty)
    public ImmutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super(values.length);
        final var size = __size = values.length;
        if (__isEmpty = size == 0)
            return;

        var index = -1;
        while (++index < size)
            super.addLast(values[index]);
    }

    /// Create an [immutable-like][org.jetbrains.annotations.Unmodifiable] instance of [ArrayDeque]
    /// with a capacity as the <code>values.[size][Collection#size()]</code> (or `1` if it is empty)
    public ImmutableArrayDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size());
        final var size = __size = values.size();
        if (__isEmpty = size == 0)
            return;

        for (final var value : values)
            super.addLast(value);
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

    @Override public boolean containsAll(final @Unmodifiable Collection<? extends @Nullable Object> values) { return super.containsAll(values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { super.forEach(action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableArrayDeque<T> reversed() { return new ImmutableArrayDequeView<>(super.reversed()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new IteratorAsImmutableIterator<>(super.iterator()); }

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> descendingIterator() { return new IteratorAsImmutableIterator<>(super.descendingIterator()); }

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

    @MustBeInvokedByOverriders
    @Override public ImmutableArrayDeque<T> clone() {
        try {
            return (ImmutableArrayDeque<T>) super.clone();
        } catch (AssertionError error) {
            if (error.getCause() == null) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
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

    /// Fail to add a `value` to the start of the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void push(final @Nullable T value) { throw new UnsupportedOperationException("The method “push” is not supported in an immutable ArrayDeque."); }

    /// Fail to add a `value` to the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ArrayDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable ArrayDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable ArrayDeque."); }

    /// Fail to add the `values` in the current [ImmutableArrayDeque]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable ArrayDeque."); }


    /// Fail to add a `value` to the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offer(final @Nullable T value) { throw new UnsupportedOperationException("The method “offer” is not supported in an immutable ArrayDeque."); }

    /// Fail to add a `value` to the start of the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “offerFirst” is not supported in an immutable ArrayDeque."); }

    /// Fail to add a `value` to the end of the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean offerLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “offerLast” is not supported in an immutable ArrayDeque."); }


    /// Fail to remove and retrieve the head of the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T poll() { throw new UnsupportedOperationException("The method “poll” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove and retrieve the first value of the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove and retrieve the last value of the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable ArrayDeque."); }


    /// Fail to clear the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable ArrayDeque."); }


    /// Fail to remove the first value in the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pop() { throw new UnsupportedOperationException("The method “pop” is not supported in an immutable ArrayDeque."); }


    /// Fail to remove the head of the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T remove() { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove a `value` in the current [ImmutableArrayDeque]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove the first value in the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove the first occurrence found in the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeFirstOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeFirstOccurrence” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove the last value in the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove the last occurrence found in the current [ImmutableArrayDeque]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeLastOccurrence(final @Nullable Object value) { throw new UnsupportedOperationException("The method “removeLastOccurrence” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove the `values` in the current [ImmutableArrayDeque]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable ArrayDeque."); }

    /// Fail to remove anything to the current [ImmutableArrayDeque]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable ArrayDeque."); }


    /// Fail to keep the `values` in the current [ImmutableArrayDeque]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable ArrayDeque."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------
}
