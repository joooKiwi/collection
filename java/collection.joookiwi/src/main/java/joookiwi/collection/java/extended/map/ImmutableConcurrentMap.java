package joookiwi.collection.java.extended.map;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.extended.ImmutableConcurrentCollection;
import joookiwi.collection.java.extended.set.ImmutableConcurrentSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_3;

@NotNullByDefault
public interface ImmutableConcurrentMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends ImmutableMap<K, V>,
                ConcurrentMap<K, V> {

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    /// Get the element at the specified `key` in the current [instance][ImmutableMap]
    /// or the `defaultValue` if nothing were found
    ///
    /// @param key          The key to retrieve a value
    /// @param defaultValue The value to use if nothing was found
    /// @see java.util.Map#getOrDefault(Object, V)
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/get-or-default.html">Kotlin get(key)</a>
    @Override V getOrDefault(@Nullable Object key, V defaultValue);

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- For each methods --------------------

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

    /// Gives a representation of key/value pair held by the current [instance][ImmutableNavigableMap]
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/entries.html">Kotlin Map.entries</a>
    @Override ImmutableConcurrentSet<Entry<K, V>> entrySet();

    /// Gives all the keys associated to the current [instance][ImmutableNavigableMap]
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/keys.html">Kotlin Map.keys</a>
    @Override ImmutableConcurrentSet<K> keySet();

    /// Gives all the values associated to the current [instance][ImmutableNavigableMap]
    ///
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/values.html">Kotlin Map.values</a>
    @Override ImmutableConcurrentCollection<V> values();

    //#endregion -------------------- Values methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a pair of `key` & value` to the current [instance][ImmutableConcurrentMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V put(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “put” is not supported in an immutable ConcurrentMap."); }

    /// Fail to add a pair of `key` & value` to the current [instance][ImmutableConcurrentMap]
    ///
    /// @param key   The (_never used_) key to add
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V putIfAbsent(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “putIfAbsent” is not supported in an immutable ConcurrentMap."); }

    /// Fail to add the `values` in the current [instance][ImmutableConcurrentMap]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void putAll(final @Nullable @Unmodifiable Map<? extends K, ? extends V> values) { throw new UnsupportedMethodException("The method “putAll” is not supported in an immutable ConcurrentMap."); }


    /// Fail to clear the current [instance][ImmutableConcurrentMap]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override default void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable ConcurrentMap."); }


    /// Fail to remove or set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param remapping The (_never used_) remapping function to set or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V compute(final @Nullable K key, final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “compute” is not supported in an immutable ConcurrentMap."); }

    /// Fail to set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key     The (_never used_) key to set a value
    /// @param mapping The (_never used_) remapping function to set
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V computeIfAbsent(final @Nullable K key, final @Nullable Function<? super @Nullable K, ? extends @Nullable V> mapping) { throw new UnsupportedMethodException("The method “computeIfAbsent” is not supported in an immutable ConcurrentMap."); }

    /// Fail to remove or set on the selected `key` a computed value via the `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param remapping The (_never used_) remapping function to set or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default V computeIfPresent(final @Nullable K key, final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “computeIfPresent” is not supported in an immutable ConcurrentMap."); }


    /// Fail to replace or remove the selected `key` associated to the `value`
    /// and then change it via a `remapping` function
    ///
    /// @param key       The (_never used_) key to find or set a value
    /// @param value     The (_never used_) element to replace
    /// @param remapping The (_never used_) remapping function to replace or remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default V merge(final @Nullable K key, final @Nullable V value, final @Nullable BiFunction<? super @Nullable V, ? super @Nullable V, ? extends @Nullable V> remapping) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable ConcurrentMap."); }


    /// Fail to remove a `key` in the current [instance][ImmutableConcurrentMap]
    ///
    /// @param key The (_never used_) key to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default @Nullable V remove(final @Nullable Object key) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable ConcurrentMap."); }

    /// Fail to remove a pair of `key` and `value` to the current [instance][ImmutableConcurrentMap]
    ///
    /// @param key   The (_never used_) key to remove
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default boolean remove(final @Nullable Object key, final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable ConcurrentMap."); }


    /// Fail to replace a pair of `key` & `value` in the current [instance][ImmutableConcurrentMap]
    ///
    /// @param key    The (_never used_) key to find a replacement
    /// @param value The (_never used_) element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_2)
    @Override default @Nullable V replace(final @Nullable K key, final @Nullable V value) { throw new UnsupportedMethodException("The method “replace” is not supported in an immutable ConcurrentMap."); }

    /// Fail to replace the `oldValue` to a `newValue` on the specified `key` in the current [instance][ImmutableConcurrentMap]
    ///
    /// @param key      The (_never used_) key to find a replacement
    /// @param oldValue The (_never used_) old element to remove
    /// @param newValue The (_never used_) old element to replace
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_3)
    @Override default boolean replace(final @Nullable K key, final @Nullable V oldValue, final @Nullable V newValue) { throw new UnsupportedMethodException("The method “replace” is not supported in an immutable ConcurrentMap."); }

    /// Fail to replace everything from the `function` received in the current [instance][ImmutableConcurrentMap]
    ///
    /// @param function The (_never used_) function to replace everything
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override default void replaceAll(final @Nullable BiFunction<? super @Nullable K, ? super @Nullable V, ? extends @Nullable V> function) { throw new UnsupportedMethodException("The method “replaceAll” is not supported in an immutable ConcurrentMap."); }

    //#endregion -------------------- Unsupported methods --------------------

}
