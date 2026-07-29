package joookiwi.collection.java.extended.map;

import java.util.Map;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.EmptyCollection;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import joookiwi.collection.java.extended.set.EmptySet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CollectionConstants.emptySpliterator;
import static joookiwi.collection.java.CommonContracts.ALWAYS_2ND_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_2ND_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@Singleton
@NotNullByDefault
public class EmptyMap<K extends @Nullable Object,
        V extends @Nullable Object>
        implements ImmutableMap<K, V> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyMap<?, ?> instance;

    protected EmptyMap() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <K extends @Nullable Object, V extends @Nullable Object> EmptyMap<K, V> getInstance() {
        final var instance = EmptyMap.instance;
        if (instance != null)
            return (EmptyMap<K, V>) instance;
        synchronized (EmptyMap.class) {
            final var instance2 = EmptyMap.instance;
            if (instance2 != null)
                return (EmptyMap<K, V>) instance2;
            return (EmptyMap<K, V>) (EmptyMap.instance = new EmptyMap<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) int size(final @Nullable Object @Nullable ... ignored) { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty(                                            ) { return true; }
    @Contract(value = ALWAYS_TRUE_1, pure = true)           public boolean isEmpty(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get --------------------

    @Contract(ALWAYS_NULL_1) @Override public @Nullable V get(final @Nullable Object                            key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final byte                                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final short                                       key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final int                                         key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final long                                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final float                                       key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final double                                      key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable AtomicInteger                     key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable AtomicLong                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable LongAdder                         key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable LongAccumulator                   key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable DoubleAdder                       key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable DoubleAccumulator                 key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable Number                            key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable AtomicReference<? extends Number> key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable V get(final @Nullable Object @Nullable ...          ignored) { return null; }

    @Contract(ALWAYS_2ND_2) @Override public V getOrDefault(final @Nullable Object                            key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final byte                                        key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final short                                       key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final int                                         key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final long                                        key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final float                                       key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final double                                      key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable AtomicInteger                     key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable AtomicLong                        key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable LongAdder                         key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable LongAccumulator                   key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable DoubleAdder                       key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable DoubleAccumulator                 key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable Number                            key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_2)           public V getOrDefault(final @Nullable AtomicReference<? extends Number> key, final V defaultValue                                              ) { return defaultValue; }
    @Contract(ALWAYS_2ND_3)           public V getOrDefault(final @Nullable Object                            key, final V defaultValue, final @Nullable Object @Nullable ... ignored) { return defaultValue; }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Has methods --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean containsValue(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean containsValue(final @Nullable Object                 value) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean containsValue(final @Nullable Object @Nullable ... ignored) { return false; }

    @Contract(ALWAYS_FALSE_0)           public boolean containsKey(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean containsKey(final @Nullable Object                   key) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean containsKey(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable BiConsumer<? super K, ? super V>                                                 action) {}
    @Override public void forEach(final @Nullable Consumer<? super joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> action) {}
              public void forEach(final @Nullable Runnable                                                                         action) {}
              public void forEach(final @Nullable Object @Nullable ...                                                            ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- Values methods --------------------

    @Override public EmptySet<Entry<K, V>> entrySet() { return EmptySet.getInstance(); }

    @Override public EmptySet<K> keySet() { return EmptySet.getInstance(); }

    @Override public EmptyCollection<V> values() { return EmptyCollection.getInstance(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(pure = true) @Override public EmptyIterator<joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> iterator( ) { return EmptyIterator.getInstance(); }
    @Contract(pure = true) @Override public Spliterator<joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> spliterator() { return emptySpliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int hashCode() { return DEFAULT_EMPTY_HASH_CODE; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Map<?,?>))
            return false;
        return ((Map<?, ?>) other).isEmpty();
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyMap<K, V> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true) @Override public String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
