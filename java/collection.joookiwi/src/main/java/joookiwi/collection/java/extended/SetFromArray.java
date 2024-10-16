package joookiwi.collection.java.extended;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import joookiwi.collection.java.CollectionConstants;
import joookiwi.collection.java.helper.HashCodeCreator;
import joookiwi.collection.java.method.ForEach;
import joookiwi.collection.java.method.ToArray;
import joookiwi.collection.java.method.ToString;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.*;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.HasAll.hasAll;

/// A bare-bone implementation of a [java Set][Set]
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
public class SetFromArray<T>
        implements Set<T>,
                   RandomAccess {

    //#region -------------------- Fields --------------------

    private final T @NotNull [] __values;

    private final int __size;
    private final boolean __isEmpty;

    private @Nullable Integer __hashCode;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    /// Create an instance similar to {@link java.util.Set#of(Object[])},
    /// but allowing `null` and implying that it has no duplicate in the `values`
    ///
    /// @param values The array to be the internal structure
    public SetFromArray(final T @NotNull @Unmodifiable [] values) {
        super();
        if (__isEmpty = (__size = (__values = values).length) == 0)
            return;
        __hashCode = 0;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    /// Get the size of the current [Set]
    @Contract(pure = true)
    @Override public @Range(from = 0, to = MAX_VALUE) int size() { return __size; }

    /// Tell if the current [Set] has no values
    @Contract(pure = true)
    @Override public boolean isEmpty() { return __isEmpty; }


    /// Tell whenever the `value` exist in the current [Set]
    ///
    /// @param value The value to compare
    @Override public boolean contains(final @Nullable Object value) { return has(__values, value); }

    /// Tell that all the `values` are in the current [Set]
    ///
    /// @param values The values to compare
    @Override public boolean containsAll(final @NotNull @Unmodifiable Collection<?> values) { return hasAll(__values, values); }


    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    @Override public void forEach(final @NotNull Consumer<? super T> action) { ForEach.forEach(__values, action); }


    /// Convert the current [Set] to a [String] by calling its [toString\(\)][Object#toString()] method
    @Override public String toString() { return ToString.toString(__values); }

    /// Convert the current [Set] to an `array`
    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public @NotNull Object @NotNull [] toArray() { return ToArray.toArray(__values); }

    /// Put the values inside the `newArray`
    ///
    /// @param newArray The source array to put the values
    /// @param <U>      The new type
    @SuppressWarnings("unchecked cast")
    @Contract(value = ALWAYS_1ST_PARAMETER_1, mutates = "param1")
    @Override public <U extends @Nullable Object> U @NotNull [] toArray(U @NotNull @Unmodifiable [] newArray) {
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) __values[index];
        return newArray;
    }

    /// Put the values inside a new array produced by the `generator`
    ///
    /// @param generator The given generator
    /// @param <U>       The new type
    @SuppressWarnings("unchecked cast")
    @Contract(ALWAYS_NEW_1)
    @Override public <U extends @Nullable Object> U @NotNull [] toArray(@NotNull IntFunction<U[]> generator) {
        final var newArray = generator.apply(0);
        final var size = newArray.length;
        var index = -1;
        while(++index < size)
            newArray[index] = (U) __values[index];
        return newArray;
    }


    @Override public Stream<T> stream() { return Arrays.stream(__values); }

    @Override public @NotNull Iterator<T> iterator() { return Arrays.stream(__values).iterator(); }

    @Override public Spliterator<T> spliterator() { return Arrays.spliterator(__values); }

    @Override public Stream<T> parallelStream() { return StreamSupport.stream(Arrays.spliterator(__values), true); }


    @Override public int hashCode() {
        final var value = __hashCode;
        if (value != null)
            return value;
        return __hashCode = HashCodeCreator.getInstance().newHashCode(__values);
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof java.util.Set<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [SetFromArray]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Set."); }

    /// Fail to add the `values` in the current [SetFromArray]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Set."); }

    /// Fail to clear the current [SetFromArray]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable Set."); }

    /// Fail to remove a `value` in the current [SetFromArray]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Set."); }

    /// Fail to remove the `values` in the current [SetFromArray]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable Set."); }

    /// Fail to remove anything to the current [SetFromArray]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable Set."); }

    /// Fail to keep the `values` in the current [SetFromArray]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable Set."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
