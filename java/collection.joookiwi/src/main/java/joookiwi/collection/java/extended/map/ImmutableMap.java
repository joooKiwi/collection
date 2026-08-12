package joookiwi.collection.java.extended.map;

import java.util.Collection;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import joookiwi.collection.java.entry.Entry;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.ImmutableCollection;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.set.ImmutableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public interface ImmutableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends Map<K, V>,
                Iterable<Entry<? extends K, ? extends V>>,
                Cloneable {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Size methods --------------------

    /// Get the size of the current [instance][ImmutableMap]
    ///
    /// @see Collection#size()
    /// @see Map#size()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/length">Javascript Array.length</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/size">Javascript Set.size</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map/size">Javascript Map.size</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html">Kotlin Collection.size()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html">Kotlin Map.size()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count">C# Count()</a>
    @Override int size();

    /// Tell if the current [instance][ImmutableMap] has no values
    ///
    /// @see Collection#isEmpty()
    /// @see Map#isEmpty()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html">Kotlin isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html">Kotlin Collection.isEmpty()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html">Kotlin Map.isEmpty()</a>
    @Override boolean isEmpty();

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    /// Get the element at the specified `key` in the current [instance][ImmutableMap]
    ///
    /// @param key The key to retrieve a value
    /// @see java.util.Map#get(Object)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/get.html">Kotlin get(key)</a>
    @Override @Nullable V get(@Nullable Object key);

    /// Get the element at the specified `key` in the current [instance][ImmutableMap]
    /// or the `defaultValue` if nothing were found
    ///
    /// @param key          The key to retrieve a value
    /// @param defaultValue The value to use if nothing was found
    /// @see java.util.Map#getOrDefault(Object, V)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/get-or-default.html">Kotlin get(key)</a>
    @Override V getOrDefault(@Nullable Object key, V defaultValue);

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    /// Tell whenever the `value` exist in the current [instance][ImmutableMap]
    ///
    /// @param value The value to compare
    /// @see Collection#contains(Object)
    /// @see Map#containsValue(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes">Javascript ReadonlyArray.includes(value)</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has">Javascript ReadonlySet.has(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/contains.html">Kotlin contains(element)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/contains-value.html">Kotlin Map.containsValue(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains">C# contains(value)</a>
    @Override boolean containsValue(@Nullable Object value);

    /// Tell whenever the `key` exist in the current [instance][ImmutableMap]
    ///
    /// @param key The key to compare
    /// @see Collection#contains(Object)
    /// @see Map#containsKey(Object)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/includes">Javascript ReadonlyArray.includes(value)</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/has">Javascript ReadonlySet.has(value)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/contains.html">Kotlin contains(element)</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/contains-key.html">Kotlin Map.containsKey(element)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains">C# contains(value)</a>
    @Override boolean containsKey(@Nullable Object key);

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @Override void forEach(Consumer<? super joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> action);

    /// Perform a given `action` on each element
    ///
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @Override void forEach(BiConsumer<? super K, ? super V> action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Values methods --------------------

    /// Gives a representation of key/value pair held by the current [instance][ImmutableMap]
    ///
    /// @see java.util.Map#entrySet
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/entries.html">Kotlin Map.entries</a>
    @Override ImmutableSet<Entry<K, V>> entrySet();

    /// Gives all the keys associated to the current [instance][ImmutableMap]
    ///
    /// @see java.util.Map#keySet
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/keys.html">Kotlin Map.keys</a>
    @Override ImmutableSet<K> keySet();

    /// Gives all the values associated to the current [instance][ImmutableMap]
    ///
    /// @see java.util.Map#values
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/values.html">Kotlin Map.values</a>
    @Override ImmutableCollection<V> values();

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override ImmutableIterator<joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> iterator();

    @Override @Unmodifiable Spliterator<joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> spliterator();

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Override int hashCode();

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override boolean equals(@Nullable Object other);

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    ImmutableMap<K, V> clone();

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    /// Convert the current [instance][ImmutableMap] to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @see Object#toString()
    @Override String toString();

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a pair of `key` & value` to the current [instance][ImmutableMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V put(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “put” is not supported in an immutable Map."); }

    /// Fail to add a pair of `key` & value` to the current [instance][ImmutableMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V putIfAbsent(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “putIfAbsent” is not supported in an immutable Map."); }

    /// Fail to add the `values` in the current [instance][ImmutableMap]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void putAll(final @Nullable @Unmodifiable Map<? extends K, ? extends V> values) { throw new UnsupportedMethodException("The method “putAll” is not supported in an immutable Map."); }


    /// Fail to clear the current [instance][ImmutableMap]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable Map."); }


    /// Fail to remove or set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param remapping The (_never used_) remapping function to set or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V compute(final @Nullable K key, final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “compute” is not supported in an immutable Map."); }

    /// Fail to set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key     The (_never used_) key to set a value
    /// @param mapping The (_never used_) remapping function to set
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V computeIfAbsent(final @Nullable K key, final @Nullable Function<? super @Nullable K, ? extends @Nullable V> mapping) { throw new UnsupportedMethodException("The method “computeIfAbsent” is not supported in an immutable Map."); }

    /// Fail to remove or set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param remapping The (_never used_) remapping function to set or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V computeIfPresent(final @Nullable K key, final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “computeIfPresent” is not supported in an immutable Map."); }


    /// Fail to replace or remove the selected `key` associated to the `value`
    /// and then change it via a `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param value     The (_never used_) element to replace
    /// @param remapping The (_never used_) remapping function to replace or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default V merge(final @Nullable K key, final @Nullable V value, final @Nullable BiFunction<? super @Nullable V, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable Map."); }


    /// Fail to remove a `key` in the current [instance][ImmutableMap]
    ///
    /// @param key The (_never used_) key to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default @Nullable V remove(final @Nullable Object key) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Map."); }

    /// Fail to remove a pair of `key` and `value` to the current [instance][ImmutableMap]
    ///
    /// @param key   The (_never used_) key to remove
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default boolean remove(final @Nullable Object key, final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Map."); }


    /// Fail to replace a pair of `key` & `value` in the current [instance][ImmutableMap]
    ///
    /// @param key    The (_never used_) key to find a replacement
    /// @param value The (_never used_) element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V replace(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “replace” is not supported in an immutable Map."); }

    /// Fail to replace the `oldValue` to a `newValue` on the specified `key` in the current [instance][ImmutableMap]
    ///
    /// @param key      The (_never used_) key to find a replacement
    /// @param oldValue The (_never used_) old element to remove
    /// @param newValue The (_never used_) old element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default boolean replace(final @Nullable K key, final @Nullable V oldValue, final @Nullable V newValue) { throw new UnsupportedMethodException("The method “replace” is not supported in an immutable Map."); }

    /// Fail to replace everything from the `function` received in the current [instance][ImmutableMap]
    ///
    /// @param function The (_never used_) function to replace everything
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void replaceAll(final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> function) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable Map."); }

    //#endregion -------------------- Unsupported methods --------------------

}
