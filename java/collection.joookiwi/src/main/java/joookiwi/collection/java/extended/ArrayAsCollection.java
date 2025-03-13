package joookiwi.collection.java.extended;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.UnknownNullability;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.HasAll.hasAll;

/// A bare-bone implementation of a [java Collection][Collection]
/// with the [immutability][Unmodifiable] in place.
/// During its creation, it <u>implies</u> that the array received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T> The type
@NotNullByDefault
public class ArrayAsCollection<T extends @Nullable Object>
        implements Collection<T> {

    //#region -------------------- Fields --------------------

    private final T @NotNull [] __reference;

    private final int __size;
    private final boolean __isEmpty;

    private @Nullable Integer __hashCode;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance similar to [java.util.Collections#unmodifiableCollection(Collection)]
    /// but allowing `null` in the `reference`
    ///
    /// @param reference The array to be the internal structure
    public ArrayAsCollection(final T @NotNull @Unmodifiable [] reference) {
        super();
        if (__isEmpty = (__size = (__reference = reference).length) == 0)
            return;
        __hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /// The internal reference passed through the constructor
    protected T @NotNull [] _reference() { return __reference; }

    //#region -------------------- Supported methods --------------------

    /// Get the size of the current [Collection]
    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_VALUE) int size() { return __size; }

    /// Tell if the current [Collection] has no values
    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }


    /// Tell whenever the `value` exist in the current [Collection]
    ///
    /// @param value The value to compare
    @Override public boolean contains(final @Nullable Object value) { return has(_reference(), value); }

    /// Tell that all the `values` are in the current [Collection]
    ///
    /// @param values The values to compare
    @Override public boolean containsAll(final @NotNull @Unmodifiable Collection<?> values) { return hasAll(_reference(), values); }


    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    @Override public void forEach(final @NotNull Consumer<? super T> action) { ForEach.forEach(_reference(), action); }


    /// Convert the current [Collection] to a [String] by calling its [toString\(\)][Object#toString()] method
    @Override public String toString() { return ToString.toString(_reference()); }

    /// Convert the current [Collection] to an `array`
    @Contract(pure = true)
    @Override public @UnknownNullability Object @NotNull [] toArray() { return ToArray.toArray(_reference()); }

    /// Put the values inside the `newArray`
    ///
    /// @param newArray The source array to put the values
    /// @param <U>      The new type
    @SuppressWarnings("unchecked cast")
    @Contract(value = ALWAYS_1ST_1, mutates = "param1")
    @Override public <U extends @Nullable Object> U @NotNull [] toArray(U @NotNull [] newArray) {
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
    @Override public <U extends @Nullable Object> U @NotNull [] toArray(@NotNull IntFunction<U[]> generator) {
        final var reference = _reference();
        final var newArray = generator.apply(0);
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) reference[index];
        return newArray;
    }


    @Override public Stream<T> stream() { return Arrays.stream(_reference()); }

    @Override public @NotNull Iterator<T> iterator() { return new ArrayAsIterator<>(_reference()); }

    @Override public Spliterator<T> spliterator() { return Arrays.spliterator(_reference()); }

    @Override public Stream<T> parallelStream() { return StreamSupport.stream(Arrays.spliterator(_reference()), true); }


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
        if (!(other instanceof Collection<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [ArrayAsCollection]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Collection."); }

    /// Fail to add the `values` in the current [ArrayAsCollection]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Collection."); }


    /// Fail to clear the current [ArrayAsCollection]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable Collection."); }


    /// Fail to remove a `value` in the current [ArrayAsCollection]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove the `values` in the current [ArrayAsCollection]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable Collection."); }

    /// Fail to remove anything to the current [ArrayAsCollection]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable Collection."); }

    /// Fail to keep the `values` in the current [ArrayAsCollection]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable Collection."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
