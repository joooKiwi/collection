package joookiwi.collection.java.extended;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SequencedSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import joookiwi.collection.java.helper.HashCodeCreator;
import joookiwi.collection.java.method.ForEach;
import joookiwi.collection.java.method.ToArray;
import joookiwi.collection.java.method.ToString;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.UnknownNullability;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.emptySortedSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.HasAll.hasAll;

/// An implementation of a reversed-order [SequencedSet] similar to the [ArrayAsSequencedSet] in its behaviour.
/// During its creation, it <u>implies</u> that the [REVERSED_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>               The type
/// @param <SOURCE>          The original source of the instance
///                          (generally a [ArrayAsSequencedSet] or [ReversedArrayAsSequencedSet])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsSequencedSet
@NotNullByDefault
public class ReversedArrayAsSequencedSet<T extends @Nullable Object,
        SOURCE extends SequencedSet<? super T>,
        REVERSED_ARRAY extends ReversedArray<? extends T>>
        implements SequencedSet<T>,
        Serializable {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 9114026084459089025L;


    private final SOURCE __source;
    private final REVERSED_ARRAY __reversedArray;

    private boolean __isInitialized = false;
    private T @Nullable [] __reference;

    private int __size = -1;
    private boolean __isEmpty;
    private @Nullable Integer __hashCode;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsSequencedSet(final SOURCE source, final REVERSED_ARRAY reversedArray) {
        __source = source;
        __reversedArray = reversedArray;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The source passed through the constructor
    protected SOURCE _source() { return __source; }

    /// The [ReversedArray] passed through the constructor
    protected REVERSED_ARRAY _reversedArray() { return __reversedArray; }

    /// The internal referenced generated from the [reversed-array][#_reversedArray] [source][ReversedArray#reversedSource]
    protected T[] _reference() {
        final var value = __reference;
        if (value != null)
            return value;

        final var reference = __reference = _reversedArray().reversedSource();
        __isInitialized = true;
        return reference;
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    /// Get the size of the current [ReversedArrayAsSequencedSet]
    @Override public @Range(from = 0, to = MAX_VALUE) int size() {
        if (__isInitialized)
            return __size;
        return __size = _reference().length;
    }

    /// Tell if the current [ReversedArrayAsSequencedSet] has no values
    @Override public boolean isEmpty() {
        if (__isInitialized)
            return __isEmpty;
        return __isEmpty = size() == 0;
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public T getFirst() {
        if (isEmpty())
            throw new NoSuchElementException("No element could be found in an empty SortedSet.");
        return _reference()[0];
    }

    @Override public T getLast() {
        if (isEmpty())
            throw new NoSuchElementException("No element could be found in an empty SortedSet.");
        return _reference()[size() - 1];
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    /// Tell whenever the `value` exist in the current [ReversedArrayAsSequencedSet]
    ///
    /// @param value The value to compare
    @Override public boolean contains(final @Nullable Object value) { return has(_reference(), value); }

    /// Tell that all the `values` are in the current [ReversedArrayAsSequencedSet]
    ///
    /// @param values The values to compare
    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return hasAll(_reference(), values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    @Override public void forEach(final Consumer<? super T> action) { ForEach.forEach(_reference(), action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Override public @UnmodifiableView SequencedSet<T> reversed() {
        if (isEmpty())
            return emptySortedSet();
        return new ReversedArrayAsSequencedSet<>(this, new ReversedArray<>(_reference()));
    }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- To array methods --------------------

    /// Convert the current [ReversedArrayAsSequencedSet] to an `array`
    @Contract(pure = true)
    @Override public @UnknownNullability Object[] toArray() { return ToArray.toArray(_reference()); }

    /// Put the values inside the `newArray`
    ///
    /// @param newArray The source array to put the values
    /// @param <U>      The new type
    @SuppressWarnings("unchecked cast")
    @Contract(value = ALWAYS_1ST_1, mutates = "param1")
    @Override public <U extends @Nullable Object> U[] toArray(final U[] newArray) {
        final var reference = _reference();
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) reference[index];
        return newArray;
    }

    /// Put the values inside a new array produced by the `generator`
    ///
    /// @param generator The given generator
    /// @param <U>       The new type
    @SuppressWarnings("unchecked cast")
    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) {
        final var reference = _reference();
        final var newArray = generator.apply(0);
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) reference[index];
        return newArray;
    }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public Stream<T> stream() { return Arrays.stream(_reference()); }

    @Override public Iterator<T> iterator() { return new ArrayAsIterator<>(_reference()); }

    @Override public Spliterator<T> spliterator() { return Arrays.spliterator(_reference()); }

    @Override public Stream<T> parallelStream() { return StreamSupport.stream(Arrays.spliterator(_reference()), true); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Equals methods --------------------

    @Override public int hashCode() {
        final var value = __hashCode;
        if (value != null)
            return value;
        return __hashCode = HashCodeCreator.getInstance().newHashCode(_reference());
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Set<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Equals methods --------------------
    //#region -------------------- To string methods --------------------

    /// Convert the current [Collection] to a [String] by calling its [toString\(\)][Object#toString()] method
    @Override public String toString() { return ToString.toString(_reference()); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ReversedArrayAsSequencedSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Collection."); }

    /// Fail to add a `value` as the start of the current [ReversedArrayAsSequencedSet]
    ///
    /// @param value the (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` as the end of the current [ReversedArrayAsSequencedSet]
    ///
    /// @param value the (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable SortedSet."); }

    /// Fail to add the `values` in the current [ReversedArrayAsSequencedSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Collection."); }


    /// Fail to clear the current [ReversedArrayAsSequencedSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable Collection."); }


    /// Fail to remove a `value` in the current [ReversedArrayAsSequencedSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove the first value of the current [ReversedArrayAsSequencedSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable SortedSet."); }

    /// Fail to remove the last value of the current [ReversedArrayAsSequencedSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable SortedSet."); }

    /// Fail to remove the `values` in the current [ReversedArrayAsSequencedSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable Collection."); }

    /// Fail to remove anything to the current [ReversedArrayAsSequencedSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable Collection."); }

    /// Fail to keep the `values` in the current [ReversedArrayAsSequencedSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable Collection."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
