package joookiwi.collection.java.extended;

import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import joookiwi.collection.java.extended.iterator.ArrayAsImmutableIterator;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
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

import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.HasAll.hasAll;

/// A definition of an [ImmutableCollection] to have a common ancestor.
/// This class is similar to [java.util.AbstractCollection] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsImmutableCollection
@NotNullByDefault
public abstract class AbstractArrayAsImmutableCollection<T extends @Nullable Object>
        implements ImmutableCollection<T> {

    //#region -------------------- Fields --------------------

    protected @Nullable Integer _hashCode;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The reference to do calculation and retrieval
    protected abstract T[] _reference();

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public abstract @Range(from = 0, to = MAX_INT_VALUE) int size();

    @Override public boolean isEmpty() { return size() == 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has methods --------------------

    @Override public boolean contains(final @Nullable Object value) { return has(_reference(), value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return hasAll(_reference(), values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super T> action) { ForEach.forEach(_reference(), action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableIterator<T> iterator() { return new ArrayAsImmutableIterator<>(_reference()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Spliterator<T> spliterator() { return Arrays.spliterator(_reference()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(pure = true)
    @Override public @UnknownNullability Object[] toArray() { return ToArray.toArray(_reference()); }

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
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { return Arrays.stream(_reference()); }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { return StreamSupport.stream(Arrays.spliterator(_reference()), true); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override public int hashCode() {
        final var value = _hashCode;
        if (value != null)
            return value;
        return _hashCode = HashCodeCreator.getInstance().newHashCode(_reference());
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

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public abstract AbstractArrayAsImmutableCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return ToString.toString(_reference()); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
