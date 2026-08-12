package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.EmptyNavigableCollection;
import joookiwi.collection.java.extended.set.EmptyNavigableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

@NotNullByDefault
public class EmptyNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends EmptySortedMap<K, V>
        implements ImmutableNavigableMap<K, V> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyNavigableMap<?, ?> instance;

    protected EmptyNavigableMap() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <K extends @Nullable Object, V extends @Nullable Object> EmptyNavigableMap<K, V> getInstance() {
        final var instance = EmptyNavigableMap.instance;
        if (instance != null)
            return (EmptyNavigableMap<K, V>) instance;
        synchronized (EmptyNavigableMap.class) {
            final var instance2 = EmptyNavigableMap.instance;
            if (instance2 != null)
                return (EmptyNavigableMap<K, V>) instance2;
            return (EmptyNavigableMap<K, V>) (EmptyNavigableMap.instance = new EmptyNavigableMap<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(ALWAYS_NULL_0)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> floorEntry(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> floorEntry(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> floorEntry(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> lowerEntry(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> lowerEntry(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> lowerEntry(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> ceilingEntry(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> ceilingEntry(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> ceilingEntry(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> higherEntry(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> higherEntry(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public joookiwi.collection.java.entry.@Nullable Entry<K, V> higherEntry(final @Nullable Object @Nullable ... ignored) { return null; }


    @Contract(ALWAYS_NULL_0)           public @Nullable K floorKey(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public @Nullable K floorKey(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable K floorKey(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0)           public @Nullable K lowerKey(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public @Nullable K lowerKey(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable K lowerKey(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0)           public @Nullable K ceilingKey(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public @Nullable K ceilingKey(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable K ceilingKey(final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_0)           public @Nullable K higherKey(                                            ) { return null; }
    @Contract(ALWAYS_NULL_1) @Override public @Nullable K higherKey(final @Nullable K                        key) { return null; }
    @Contract(ALWAYS_NULL_1)           public @Nullable K higherKey(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyNavigableMap<K, V> reversed(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyNavigableMap<K, V> reversed(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableNavigableMap<K, V> subMap(                                                                                                        ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableNavigableMap<K, V> subMap(final @Nullable K from,                                final @Nullable K to                             ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_4) @Override public ImmutableNavigableMap<K, V> subMap(final @Nullable K from, final boolean fromIsInclusive, final @Nullable K to, final boolean toIsInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableNavigableMap<K, V> subMap(final @Nullable Object @Nullable ...                                                             ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableNavigableMap<K, V> headMap(                                                 ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableNavigableMap<K, V> headMap(final @Nullable K from                           ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableNavigableMap<K, V> headMap(final @Nullable K from, final boolean isInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableNavigableMap<K, V> headMap(final @Nullable Object @Nullable ...      ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public ImmutableNavigableMap<K, V> tailMap(                                               ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableNavigableMap<K, V> tailMap(final @Nullable K to                           ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableNavigableMap<K, V> tailMap(final @Nullable K to, final boolean isInclusive) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableNavigableMap<K, V> tailMap(final @Nullable Object @Nullable ...    ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public EmptyNavigableSet<Entry<K, V>> entrySet(         ) { return EmptyNavigableSet.getInstance(); }
    @Override public EmptyNavigableSet<Entry<K, V>> sequencedEntrySet() { return EmptyNavigableSet.getInstance(); }
    @Override public EmptyNavigableSet<Entry<K, V>> navigableEntrySet() { return EmptyNavigableSet.getInstance(); }

    @Override public EmptyNavigableSet<joookiwi.collection.java.entry.Entry<K, V>> descendingEntrySet() { return EmptyNavigableSet.getInstance(); }

    @Override public EmptyNavigableSet<K> keySet(         ) { return EmptyNavigableSet.getInstance(); }
    @Override public EmptyNavigableSet<K> sequencedKeySet() { return EmptyNavigableSet.getInstance(); }
    @Override public EmptyNavigableSet<K> navigableKeySet() { return EmptyNavigableSet.getInstance(); }

    @Override public EmptyNavigableSet<K> descendingKeySet() { return EmptyNavigableSet.getInstance(); }

    @Override public EmptyNavigableCollection<V> values(         ) { return EmptyNavigableCollection.getInstance(); }
    @Override public EmptyNavigableCollection<V> sequencedValues() { return EmptyNavigableCollection.getInstance(); }
    @Override public EmptyNavigableCollection<V> navigableValues() { return EmptyNavigableCollection.getInstance(); }

    @Override public EmptyNavigableCollection<V> descendingValues() { return EmptyNavigableCollection.getInstance(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyNavigableMap<K, V> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
