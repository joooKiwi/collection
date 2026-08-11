package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.ImmutableConcurrentNavigableCollection;
import joookiwi.collection.java.extended.UtilityForMap;
import joookiwi.collection.java.extended.set.ImmutableConcurrentNavigableSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableConcurrentNavigableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableNavigableMap<K, V>
        implements ImmutableConcurrentNavigableMap<K, V> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableConcurrentNavigableMap() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableConcurrentNavigableMap<K, V> subMap(final K from, final K to) { return UtilityForMap.asSubdivided(this, _reference(), from, to); }
    @Override public ImmutableConcurrentNavigableMap<K, V> subMap(final K from, final boolean isFromInclusive, final K to, final boolean isToInclusive) { return UtilityForMap.asSubdivided(this, _reference(), from, isFromInclusive, to, isToInclusive); }

    @Override public ImmutableConcurrentNavigableMap<K, V> tailMap(final K from) { return UtilityForMap.asTailSubdivided(this, _reference(), from); }
    @Override public ImmutableConcurrentNavigableMap<K, V> tailMap(final K from, final boolean isInclusive) { return UtilityForMap.asTailSubdivided(this, _reference(), from, isInclusive); }

    @Override public ImmutableConcurrentNavigableMap<K, V> headMap(final K to) { return UtilityForMap.asHeadSubdivided(this, _reference(), to); }
    @Override public ImmutableConcurrentNavigableMap<K, V> headMap(final K to, final boolean isInclusive) { return UtilityForMap.asHeadSubdivided(this, _reference(), to, isInclusive); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableConcurrentNavigableMap<K, V> reversed() { return UtilityForMap.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public ImmutableConcurrentNavigableSet<Entry<K, V>> entrySet() { return UtilityForMap.entries(this, _reference()); }
    @Override public ImmutableConcurrentNavigableSet<joookiwi.collection.java.entry.Entry<K, V>> descendingEntrySet() { return UtilityForMap.descendingEntries(this, _reference()); }

    @Override public ImmutableConcurrentNavigableSet<K> keySet() { return UtilityForMap.keys(this, _reference()); }
    @Override public ImmutableConcurrentNavigableSet<K> descendingKeySet() { return UtilityForMap.descendingKeys(this, _reference()); }

    @Override public ImmutableConcurrentNavigableCollection<V> values() { return UtilityForMap.values(this, _reference()); }
    @Override public ImmutableConcurrentNavigableCollection<V> descendingValues() { return UtilityForMap.descendingValues(this, _reference()); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableConcurrentNavigableMap<K, V> clone() { return (AbstractArrayAsImmutableConcurrentNavigableMap<K, V>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
