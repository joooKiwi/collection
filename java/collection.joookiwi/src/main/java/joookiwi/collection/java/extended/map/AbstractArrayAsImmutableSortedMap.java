package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.ImmutableSortedCollection;
import joookiwi.collection.java.extended.UtilityForMap;
import joookiwi.collection.java.extended.set.ImmutableSortedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableSortedMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableSequencedMap<K, V>
        implements ImmutableSortedMap<K, V> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSortedMap() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public K firstKey() { return UtilityForMap.getFirstKey(_reference()); }

    @Override public K lastKey() { return UtilityForMap.getLastKey(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableSortedMap<K, V> subMap(final K from, final K to) { return UtilityForMap.asSubdivided(this, _reference(), from, to); }

    @Override public ImmutableSortedMap<K, V> tailMap(final K from) { return UtilityForMap.asTailSubdivided(this, _reference(), from); }

    @Override public ImmutableSortedMap<K, V> headMap(final K to) { return UtilityForMap.asHeadSubdivided(this, _reference(), to); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableSortedMap<K, V> reversed() { return UtilityForMap.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public ImmutableSortedSet<Entry<K, V>> entrySet() { return UtilityForMap.entries(this, _reference()); }

    @Override public ImmutableSortedSet<K> keySet() { return UtilityForMap.keys(this, _reference()); }

    @Override public ImmutableSortedCollection<V> values() { return UtilityForMap.values(this, _reference()); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableSortedMap<K, V> clone() { return (AbstractArrayAsImmutableSortedMap<K, V>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
