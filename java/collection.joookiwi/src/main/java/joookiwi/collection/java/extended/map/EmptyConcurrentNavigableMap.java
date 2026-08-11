package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.EmptyConcurrentNavigableCollection;
import joookiwi.collection.java.extended.set.EmptyConcurrentNavigableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

@NotNullByDefault
public class EmptyConcurrentNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends EmptyNavigableMap<K, V>
        implements ImmutableConcurrentNavigableMap<K, V> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentNavigableMap<?, ?> instance;

    protected EmptyConcurrentNavigableMap() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <K extends @Nullable Object, V extends @Nullable Object> EmptyConcurrentNavigableMap<K, V> getInstance() {
        final var instance = EmptyConcurrentNavigableMap.instance;
        if (instance != null)
            return (EmptyConcurrentNavigableMap<K, V>) instance;
        synchronized (EmptyConcurrentNavigableMap.class) {
            final var instance2 = EmptyConcurrentNavigableMap.instance;
            if (instance2 != null)
                return (EmptyConcurrentNavigableMap<K, V>) instance2;
            return (EmptyConcurrentNavigableMap<K, V>) (EmptyConcurrentNavigableMap.instance = new EmptyConcurrentNavigableMap<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyConcurrentNavigableMap<K, V> reversed(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyConcurrentNavigableMap<K, V> reversed(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableConcurrentNavigableMap<K, V> subMap(                                                                                                        ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableConcurrentNavigableMap<K, V> subMap(final @Nullable K from,                                final @Nullable K to                             ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_4) @Override public ImmutableConcurrentNavigableMap<K, V> subMap(final @Nullable K from, final boolean fromIsInclusive, final @Nullable K to, final boolean toIsInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableMap<K, V> subMap(final @Nullable Object @Nullable ...                                                             ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableConcurrentNavigableMap<K, V> headMap(                                                 ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableMap<K, V> headMap(final @Nullable K from                           ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableConcurrentNavigableMap<K, V> headMap(final @Nullable K from, final boolean isInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableMap<K, V> headMap(final @Nullable Object @Nullable ...      ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableConcurrentNavigableMap<K, V> tailMap(                                               ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableMap<K, V> tailMap(final @Nullable K to                           ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableConcurrentNavigableMap<K, V> tailMap(final @Nullable K to, final boolean isInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableConcurrentNavigableMap<K, V> tailMap(final @Nullable Object @Nullable ...    ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public EmptyConcurrentNavigableSet<Entry<K, V>> entrySet(         ) { return EmptyConcurrentNavigableSet.getInstance(); }
    @Override public EmptyConcurrentNavigableSet<Entry<K, V>> sequencedEntrySet() { return EmptyConcurrentNavigableSet.getInstance(); }
    @Override public EmptyConcurrentNavigableSet<Entry<K, V>> navigableEntrySet() { return EmptyConcurrentNavigableSet.getInstance(); }

    @Override public EmptyConcurrentNavigableSet<joookiwi.collection.java.entry.Entry<K, V>> descendingEntrySet() { return EmptyConcurrentNavigableSet.getInstance(); }

    @Override public EmptyConcurrentNavigableSet<K> keySet(         ) { return EmptyConcurrentNavigableSet.getInstance(); }
    @Override public EmptyConcurrentNavigableSet<K> sequencedKeySet() { return EmptyConcurrentNavigableSet.getInstance(); }
    @Override public EmptyConcurrentNavigableSet<K> navigableKeySet() { return EmptyConcurrentNavigableSet.getInstance(); }

    @Override public EmptyConcurrentNavigableSet<K> descendingKeySet() { return EmptyConcurrentNavigableSet.getInstance(); }

    @Override public EmptyConcurrentNavigableCollection<V> values(         ) { return EmptyConcurrentNavigableCollection.getInstance(); }
    @Override public EmptyConcurrentNavigableCollection<V> sequencedValues() { return EmptyConcurrentNavigableCollection.getInstance(); }
    @Override public EmptyConcurrentNavigableCollection<V> navigableValues() { return EmptyConcurrentNavigableCollection.getInstance(); }

    @Override public EmptyConcurrentNavigableCollection<V> descendingValues() { return EmptyConcurrentNavigableCollection.getInstance(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentNavigableMap<K, V> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
