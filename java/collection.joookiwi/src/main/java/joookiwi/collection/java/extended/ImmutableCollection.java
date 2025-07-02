package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.UnknownNullability;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public interface ImmutableCollection<T extends @Nullable Object>
        extends Collection<T>,
                Cloneable {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

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
    @Override @Range(from = 0, to = MAX_INT_VALUE) int size();

    /// Tell if the current [instance][Collection] has no values
    ///
    /// @see Collection#isEmpty()
    /// @see Map#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    @Override boolean isEmpty();

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has methods --------------------

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
    @Override boolean contains(@Nullable Object value);

    /// Tell that all the `values` are in the current [instance][Collection]
    ///
    /// @param values The values to compare
    /// @see Collection#containsAll(Collection)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html">Kotlin containsAll(values)</a>
    @Override boolean containsAll(@Unmodifiable Collection<?> values);

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @Override void forEach(Consumer<? super T> action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override ImmutableIterator<T> iterator();

    @Contract(ALWAYS_NEW_0)
    @Override Spliterator<T> spliterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    /// Convert the current [instance][Collection] to an `array`
    @Contract(pure = true)
    @Override @Nullable Object[] toArray();

    /// Put the values inside the `newArray`
    ///
    /// @param newArray The source array to put the values
    /// @param <U>      The new type
    @Contract(value = ALWAYS_1ST_1, mutates = "param1")
    @Override <U extends @Nullable Object> U[] toArray(U[] newArray);

    /// Put the values inside a new array produced by the `generator`
    ///
    /// @param generator The given generator
    /// @param <U>       The new type
    @Contract(ALWAYS_NEW_1)
    @Override <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override Stream<T> stream();

    @Contract(ALWAYS_NEW_0)
    @Override Stream<T> parallelStream();

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override int hashCode();

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override boolean equals(final @Nullable Object other);

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    ImmutableCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    /// Convert the current [instance][Collection] to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @see Object#toString()
    @Override String toString();

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][Collection]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable Collection."); }

    /// Fail to add the `values` in the current [instance][Collection]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean addAll(final @Nullable @Unmodifiable Collection<? extends @Nullable T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable Collection."); }


    /// Fail to clear the current [instance][Collection]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable Collection."); }


    /// Fail to remove a `value` in the current [instance][Collection]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Collection."); }

    /// Fail to remove the `values` in the current [instance][Collection]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable Collection."); }

    /// Fail to remove anything to the current [instance][Collection]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean removeIf(final @Nullable Predicate<? super @Nullable T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable Collection."); }

    /// Fail to keep the `values` in the current [instance][Collection]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default boolean retainAll(final @Nullable @Unmodifiable Collection<? extends @Nullable Object> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable Collection."); }

    //#endregion -------------------- Unsupported methods --------------------

}
