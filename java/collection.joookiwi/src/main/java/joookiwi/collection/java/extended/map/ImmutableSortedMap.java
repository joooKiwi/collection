package joookiwi.collection.java.extended.map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import joookiwi.collection.java.annotation.Alias;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.ImmutableSortedCollection;
import joookiwi.collection.java.extended.set.ImmutableSortedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;

@NotNullByDefault
public interface ImmutableSortedMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends ImmutableSequencedMap<K, V>,
                SortedMap<K, V> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    /// @throws joookiwi.collection.java.exception.NoElementFoundInCollectionException The current [instance][ImmutableSortedMap] is empty
    @Override K firstKey();

    /// @throws joookiwi.collection.java.exception.NoElementFoundInCollectionException The current [instance][ImmutableSortedMap] is empty
    @Override K lastKey();

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give a reversed-view of the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SequencedCollection#reversed
    /// @see java.util.List#reversed
    /// @see java.util.SequencedSet#reversed
    /// @see java.util.SortedSet#reversed
    /// @see java.util.NavigableSet#reversed
    /// @see java.util.Deque#reversed
    /// @see java.util.SequencedMap#reversed
    /// @see java.util.SortedMap#reversed
    /// @see java.util.NavigableMap#reversed
    /// @see java.util.concurrent.ConcurrentNavigableMap#reversed
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @Override ImmutableSortedMap<K, V> reversed();

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- As subdivided methods --------------------

    // README: By default, “from” is inclusive and “to” is exclusive

    @Override ImmutableSortedMap<K, V> subMap(K from, K to);

    @Override ImmutableSortedMap<K, V> headMap(K to);

    @Override ImmutableSortedMap<K, V> tailMap(K from);

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- Comparator methods --------------------

    /// The comparator to order the elements of this collection
    /// or `null` if it uses the natural ordering
    @Override @Nullable Comparator<? super K> comparator();

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Values methods --------------------

    /// Gives a representation of key/value pair held by the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SequencedMap#entrySet
    /// @see java.util.SequencedMap#sequencedEntrySet
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/entries.html">Kotlin Map.entries</a>
    @Override ImmutableSortedSet<Entry<K, V>> entrySet();

    /// Gives a representation of key/value pair held by the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SortedMap#entrySet
    /// @see java.util.SortedMap#sequencedEntrySet
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/entries.html">Kotlin Map.entries</a>
    @Alias("entrySet")
    @Override default ImmutableSortedSet<Entry<K, V>> sequencedEntrySet() { return entrySet(); }


    /// Gives all the keys associated to the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SortedMap#keySet
    /// @see java.util.SortedMap#sequencedKeySet
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/keys.html">Kotlin Map.keys</a>
    @Override ImmutableSortedSet<K> keySet();

    /// Gives all the keys associated to the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SortedMap#keySet
    /// @see java.util.SortedMap#sequencedKeySet
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/keys.html">Kotlin Map.keys</a>
    @Alias("keySet")
    @Override default ImmutableSortedSet<K> sequencedKeySet() { return keySet(); }


    /// Gives all the values associated to the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SortedMap#values
    /// @see java.util.SortedMap#sequencedValues
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/values.html">Kotlin Map.values</a>
    @Override ImmutableSortedCollection<V> values();

    /// Gives all the values associated to the current [instance][ImmutableSortedMap]
    ///
    /// @see java.util.SortedMap#values
    /// @see java.util.SortedMap#sequencedValues
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/values.html">Kotlin Map.values</a>
    @Alias("values")
    @Override default ImmutableSortedCollection<V> sequencedValues() { return values(); }

    //#endregion -------------------- Values methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a pair of `key` & value` to the current [instance][ImmutableSortedMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V put(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “put” is not supported in an immutable SortedMap."); }

    /// Fail to add at the 1<sup>st</sup> position a pair of `key` & value` to the current [instance][ImmutableSortedMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V putFirst(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “putFirst” is not supported in an immutable SortedMap."); }

    /// Fail to add at the last position a pair of `key` & value` to the current [instance][ImmutableSortedMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V putLast(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “putLast” is not supported in an immutable SortedMap."); }

    /// Fail to add a pair of `key` & value` to the current [instance][ImmutableSortedMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V putIfAbsent(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “putIfAbsent” is not supported in an immutable SortedMap."); }

    /// Fail to add the `values` in the current [instance][ImmutableSortedMap]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void putAll(final @Nullable @Unmodifiable Map<? extends K, ? extends V> values) { throw new UnsupportedMethodException("The method “putAll” is not supported in an immutable SortedMap."); }


    /// Fail to clear the current [instance][ImmutableSortedMap]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable SortedMap."); }


    /// Fail to remove or set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param remapping The (_never used_) remapping function to set or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V compute(final @Nullable K key, final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “compute” is not supported in an immutable SortedMap."); }

    /// Fail to set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key     The (_never used_) key to set a value
    /// @param mapping The (_never used_) remapping function to set
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V computeIfAbsent(final @Nullable K key, final @Nullable Function<? super @Nullable K, ? extends @Nullable V> mapping) { throw new UnsupportedMethodException("The method “computeIfAbsent” is not supported in an immutable SortedMap."); }

    /// Fail to remove or set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param remapping The (_never used_) remapping function to set or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V computeIfPresent(final @Nullable K key, final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “computeIfPresent” is not supported in an immutable SortedMap."); }


    /// Fail to replace or remove the selected `key` associated to the `value`
    /// and then change it via a `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param value     The (_never used_) element to replace
    /// @param remapping The (_never used_) remapping function to replace or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default V merge(final @Nullable K key, final @Nullable V value, final @Nullable BiFunction<? super @Nullable V, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable SortedMap."); }


    /// Fail to remove a `key` in the current [instance][ImmutableSortedMap]
    ///
    /// @param key The (_never used_) key to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default @Nullable V remove(final @Nullable Object key) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable SortedMap."); }

    /// Fail to remove a pair of `key` and `value` to the current [instance][ImmutableSortedMap]
    ///
    /// @param key   The (_never used_) key to remove
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default boolean remove(final @Nullable Object key, final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable SortedMap."); }


    /// Fail to remove and retrieve the first value of the current [instance][ImmutableSortedMap]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default joookiwi.collection.java.entry.Entry<K, V> pollFirstEntry() { throw new UnsupportedMethodException("The method “pollFirstEntry” is not supported in an immutable SortedMap."); }

    /// Fail to remove and retrieve the last value of the current [instance][ImmutableSortedMap]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default joookiwi.collection.java.entry.Entry<K, V> pollLastEntry() { throw new UnsupportedMethodException("The method “pollLastEntry” is not supported in an immutable SortedMap."); }


    /// Fail to replace a pair of `key` & `value` in the current [instance][ImmutableSortedMap]
    ///
    /// @param key    The (_never used_) key to find a replacement
    /// @param value The (_never used_) element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V replace(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “replace” is not supported in an immutable SortedMap."); }

    /// Fail to replace the `oldValue` to a `newValue` on the specified `key` in the current [instance][ImmutableSortedMap]
    ///
    /// @param key      The (_never used_) key to find a replacement
    /// @param oldValue The (_never used_) old element to remove
    /// @param newValue The (_never used_) old element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default boolean replace(final @Nullable K key, final @Nullable V oldValue, final @Nullable V newValue) { throw new UnsupportedMethodException("The method “replace” is not supported in an immutable SortedMap."); }

    /// Fail to replace everything from the `function` received in the current [instance][ImmutableSortedMap]
    ///
    /// @param function The (_never used_) function to replace everything
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void replaceAll(final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> function) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable SortedMap."); }

    //#endregion -------------------- Unsupported methods --------------------

}
