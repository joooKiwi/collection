package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.entry.Entry;
import joookiwi.collection.java.extended.EmptyCollection;
import joookiwi.collection.java.extended.EmptySequencedCollection;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import joookiwi.collection.java.extended.set.EmptySequencedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

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

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CollectionConstants.emptySpliterator;
import static joookiwi.collection.java.CommonContracts.ALWAYS_2ND_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_2ND_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@Singleton
@NotNullByDefault
public class EmptySequencedMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends EmptyMap<K, V>
        implements ImmutableSequencedMap<K, V> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequencedMap<?, ?> instance;

    protected EmptySequencedMap() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <K extends @Nullable Object, V extends @Nullable Object> EmptySequencedMap<K, V> getInstance() {
        final var instance = EmptySequencedMap.instance;
        if (instance != null)
            return (EmptySequencedMap<K, V>) instance;
        synchronized (EmptySequencedMap.class) {
            final var instance2 = EmptySequencedMap.instance;
            if (instance2 != null)
                return (EmptySequencedMap<K, V>) instance2;
            return (EmptySequencedMap<K, V>) (EmptySequencedMap.instance = new EmptySequencedMap<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Get --------------------

    @Contract(ALWAYS_NULL_0) @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> firstEntry(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> firstEntry(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0) @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> lastEntry(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> lastEntry(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Get --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequencedMap<K, V> reversed(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequencedMap<K, V> reversed(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public EmptySequencedSet<Entry<K, V>> entrySet(         ) { return EmptySequencedSet.getInstance(); }
    @Override public EmptySequencedSet<Entry<K, V>> sequencedEntrySet() { return EmptySequencedSet.getInstance(); }

    @Override public EmptySequencedSet<K> keySet(         ) { return EmptySequencedSet.getInstance(); }
    @Override public EmptySequencedSet<K> sequencedKeySet() { return EmptySequencedSet.getInstance(); }

    @Override public EmptySequencedCollection<V> values(         ) { return EmptySequencedCollection.getInstance(); }
    @Override public EmptySequencedCollection<V> sequencedValues() { return EmptySequencedCollection.getInstance(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySequencedMap<K, V> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
