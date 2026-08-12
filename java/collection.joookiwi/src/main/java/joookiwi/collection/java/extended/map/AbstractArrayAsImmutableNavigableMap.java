package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.ImmutableNavigableCollection;
import joookiwi.collection.java.extended.UtilityForMap;
import joookiwi.collection.java.extended.set.ImmutableNavigableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableSortedMap<K, V>
        implements ImmutableNavigableMap<K, V> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableNavigableMap() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> floorEntry(final K key) { return UtilityForMap.getFirstOrNullUnderOrEqual(this, _reference(), key); }
    @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> lowerEntry(final K key) { return UtilityForMap.getFirstOrNullUnder(this, _reference(), key); }
    @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> ceilingEntry(final K key) { return UtilityForMap.getFirstOrNullOverOrEqual(this, _reference(), key); }
    @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> higherEntry(final K key) { return UtilityForMap.getFirstOrNullOver(this, _reference(), key); }

    @Override public @Nullable K floorKey(final K key) { return UtilityForMap.getFirstKeyOrNullUnderOrEqual(this, _reference(), key); }
    @Override public @Nullable K lowerKey(final K key) { return UtilityForMap.getFirstKeyOrNullUnder(this, _reference(), key); }
    @Override public @Nullable K ceilingKey(final K key) { return UtilityForMap.getFirstKeyOrNullOverOrEqual(this, _reference(), key); }
    @Override public @Nullable K higherKey(final K key) { return UtilityForMap.getFirstKeyOrNullOver(this, _reference(), key); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableNavigableMap<K, V> subMap(final K from, final K to) { return UtilityForMap.asSubdivided(this, _reference(), from, to); }
    @Override public ImmutableNavigableMap<K, V> subMap(final K from, final boolean isFromInclusive, final K to, final boolean isToInclusive) { return UtilityForMap.asSubdivided(this, _reference(), from, isFromInclusive, to, isToInclusive); }

    @Override public ImmutableNavigableMap<K, V> tailMap(final K from) { return UtilityForMap.asTailSubdivided(this, _reference(), from); }
    @Override public ImmutableNavigableMap<K, V> tailMap(final K from, final boolean isInclusive) { return UtilityForMap.asTailSubdivided(this, _reference(), from, isInclusive); }

    @Override public ImmutableNavigableMap<K, V> headMap(final K to) { return UtilityForMap.asHeadSubdivided(this, _reference(), to); }
    @Override public ImmutableNavigableMap<K, V> headMap(final K to, final boolean isInclusive) { return UtilityForMap.asHeadSubdivided(this, _reference(), to, isInclusive); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableNavigableMap<K, V> reversed() { return UtilityForMap.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public ImmutableNavigableSet<Entry<K, V>> entrySet() { return UtilityForMap.entries(this, _reference()); }
    @Override public ImmutableNavigableSet<joookiwi.collection.java.entry.Entry<K, V>> descendingEntrySet() { return UtilityForMap.descendingEntries(this, _reference()); }

    @Override public ImmutableNavigableSet<K> keySet() { return UtilityForMap.keys(this, _reference()); }
    @Override public ImmutableNavigableSet<K> descendingKeySet() { return UtilityForMap.descendingKeys(this, _reference()); }

    @Override public ImmutableNavigableCollection<V> values() { return UtilityForMap.values(this, _reference()); }
    @Override public ImmutableNavigableCollection<V> descendingValues() { return UtilityForMap.descendingValues(this, _reference()); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableNavigableMap<K, V> clone() { return (AbstractArrayAsImmutableNavigableMap<K, V>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
