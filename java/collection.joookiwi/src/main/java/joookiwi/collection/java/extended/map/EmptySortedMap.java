package joookiwi.collection.java.extended.map;

import java.util.Comparator;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.extended.EmptySortedCollection;
import joookiwi.collection.java.extended.set.EmptySortedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;

@Singleton
@NotNullByDefault
public class EmptySortedMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends EmptySequencedMap<K, V>
        implements ImmutableSortedMap<K, V> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySortedMap<?, ?> instance;

    protected EmptySortedMap() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <K extends @Nullable Object, V extends @Nullable Object> EmptySortedMap<K, V> getInstance() {
        final var instance = EmptySortedMap.instance;
        if (instance != null)
            return (EmptySortedMap<K, V>) instance;
        synchronized (EmptySortedMap.class) {
            final var instance2 = EmptySortedMap.instance;
            if (instance2 != null)
                return (EmptySortedMap<K, V>) instance2;
            return (EmptySortedMap<K, V>) (EmptySortedMap.instance = new EmptySortedMap<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Get --------------------

    @Contract(ALWAYS_FAIL_0) @Override public K firstKey(                                            ) { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1)           public K firstKey(final @Nullable Object @Nullable ... ignored) { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0) @Override public K lastKey(                                            ) { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1)           public K lastKey(final @Nullable Object @Nullable ... ignored) { throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE); }

    //#endregion -------------------- Get --------------------
    //#region -------------------- As subdivided methods --------------------

    @Contract(ALWAYS_FAIL_0)           public ImmutableSortedMap<K, V> subMap(                                            ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_2) @Override public ImmutableSortedMap<K, V> subMap(final @Nullable K from, final @Nullable K to) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1)           public ImmutableSortedMap<K, V> subMap(final @Nullable Object @Nullable ... ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0)           public ImmutableSortedMap<K, V> headMap(                                            ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableSortedMap<K, V> headMap(final @Nullable K                       from) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1)           public ImmutableSortedMap<K, V> headMap(final @Nullable Object @Nullable ... ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    @Contract(ALWAYS_FAIL_0)           public ImmutableSortedMap<K, V> tailMap(                                            ) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1) @Override public ImmutableSortedMap<K, V> tailMap(final @Nullable K                         to) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }
    @Contract(ALWAYS_FAIL_1)           public ImmutableSortedMap<K, V> tailMap(final @Nullable Object @Nullable ... ignored) { throw new IllegalArgumentException(DEFAULT_MESSAGE); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySortedMap<K, V> reversed(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySortedMap<K, V> reversed(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public EmptySortedSet<Entry<K, V>> entrySet(         ) { return EmptySortedSet.getInstance(); }
    @Override public EmptySortedSet<Entry<K, V>> sequencedEntrySet() { return EmptySortedSet.getInstance(); }

    @Override public EmptySortedSet<K> keySet(         ) { return EmptySortedSet.getInstance(); }
    @Override public EmptySortedSet<K> sequencedKeySet() { return EmptySortedSet.getInstance(); }

    @Override public EmptySortedCollection<V> values(         ) { return EmptySortedCollection.getInstance(); }
    @Override public EmptySortedCollection<V> sequencedValues() { return EmptySortedCollection.getInstance(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true) @Override public @Nullable Comparator<? super K> comparator() { return null; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptySortedMap<K, V> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
