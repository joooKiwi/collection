package joookiwi.collection.java.extended;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
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

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.HasAll.hasAll;

/// A definition of an immutable [Collection] to have a common ancestor.
/// This class is similar to [java.util.AbstractCollection] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsCollection
@NotNullByDefault
public abstract class AbstractArrayAsCollection<T extends @Nullable Object>
        implements Collection<T> {

    //#region -------------------- Fields --------------------

    protected @Nullable Integer _hashCode;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The reference to do calculation and retrieval
    protected abstract T[] _reference();

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    /// Get the size of the current [instance][Collection]
    ///
    /// @see Collection#size()
    /// @see Map#size()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length">Javascript Array.length</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size">Javascript Set.size</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size">Javascript Map.size</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html">Kotlin Collection.size()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html">Kotlin Map.size()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count">C# Count()</a>
    @Override public abstract @Range(from = 0, to = MAX_VALUE) int size();

    /// Tell if the current [instance][Collection] has no values
    ///
    /// @see Collection#isEmpty()
    /// @see Map#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    @Override public abstract boolean isEmpty();


    /// Tell whenever the `value` exist in the current [instance][Collection]
    ///
    /// @param value The value to compare
    /// @see Collection#contains(Object)
    /// @see Map#containsValue(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes">Javascript ReadonlyArray.includes(value)</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has">Javascript ReadonlySet.has(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/contains.html">Kotlin contains(element)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html">Kotlin Map.containsValue(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains">C# contains(value)</a>
    @Override public boolean contains(final @Nullable Object value) { return has(_reference(), value); }

    /// Tell that all the `values` are in the current [instance][Collection]
    ///
    /// @param values The values to compare
    /// @see Collection#containsAll(Collection)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html">Kotlin containsAll(values)</a>
    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return hasAll(_reference(), values); }


    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @Override public void forEach(final Consumer<? super T> action) { ForEach.forEach(_reference(), action); }


    /// Convert the current [instance][Collection] to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @see Object#toString()
    @Override public String toString() { return ToString.toString(_reference()); }


    /// Convert the current [instance][Collection] to an `array`
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


    @Override public Stream<T> stream() { return Arrays.stream(_reference()); }

    @Override public Iterator<T> iterator() { return new ArrayAsIterator<>(_reference()); }

    @Override public Spliterator<T> spliterator() { return Arrays.spliterator(_reference()); }

    @Override public Stream<T> parallelStream() { return StreamSupport.stream(Arrays.spliterator(_reference()), true); }


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

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][Collection]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable Collection."); }

    /// Fail to add the `values` in the current [instance][Collection]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedOperationException("The method “addAll” is not supported in an immutable Collection."); }


    /// Fail to clear the current [instance][Collection]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedOperationException("The method “clear” is not supported in an immutable Collection."); }


    /// Fail to remove a `value` in the current [instance][Collection]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedOperationException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove the `values` in the current [instance][Collection]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “removeAll” is not supported in an immutable Collection."); }

    /// Fail to remove anything to the current [instance][Collection]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedOperationException("The method “removeIf” is not supported in an immutable Collection."); }

    /// Fail to keep the `values` in the current [instance][Collection]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedOperationException("The method “retainAll” is not supported in an immutable Collection."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
