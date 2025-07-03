package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.MutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
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

@NotNullByDefault
public interface MutableCollection<T extends @Nullable Object>
        extends Collection<T>,
                Cloneable {

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

    /// Tell whenever the `value` exist in the current [instance][MutableCollection]
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

    /// Tell that all the `values` are in the current [instance][MutableCollection]
    ///
    /// @param values The values to compare
    /// @see Collection#containsAll(Collection)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html">Kotlin containsAll(values)</a>
    @Override boolean containsAll(@Unmodifiable Collection<?> values);

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Add methods --------------------

    @Contract(mutates = "this")
    @Override boolean add(T value);

    @Contract(mutates = "this")
    @Override boolean addAll(Collection<? extends T> values);

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Clear methods --------------------

    @Contract(mutates = "this")
    @Override void clear();

    //#endregion -------------------- Clear methods --------------------
    //#region -------------------- Remove methods --------------------

    @Contract(mutates = "this")
    @Override boolean remove(@Nullable Object value);

    @Contract(mutates = "this")
    @Override boolean removeAll(Collection<? extends @Nullable Object> values);

    /// Removes all the elements that satisfies the given `filter` predicate
    ///
    /// @param filter a predicate which returns `true` for elements to be removed
    @Contract(mutates = "this")
    @Override boolean removeIf(Predicate<? super T> filter);

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Retain methods --------------------

    /// Keep all the similar [objects][Object] in the current [collection][MutableCollection]
    /// that are present in the `values` received
    ///
    /// @param values The values to keep
    @Contract(mutates = "this")
    @Override boolean retainAll(@Unmodifiable Collection<? extends @Nullable Object> values);

    //#endregion -------------------- Retain methods --------------------
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

    @Override MutableIterator<T> iterator();

    @Contract(ALWAYS_NEW_0)
    @Override
    Spliterator<T> spliterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    /// Convert the current [instance][MutableCollection] to an `array`
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
    @Override
    Stream<T> stream();

    @Contract(ALWAYS_NEW_0)
    @Override Stream<T> parallelStream();

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override int hashCode();

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override boolean equals(final @Nullable Object other);

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    MutableCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    /// Convert the current [instance][MutableCollection] to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @see Object#toString()
    @Override String toString();

    //#endregion -------------------- To string methods --------------------

}
