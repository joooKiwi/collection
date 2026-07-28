package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.ImmutableSequencedCollection;
import joookiwi.collection.java.extended.ImmutableSequencedSet;
import joookiwi.collection.java.extended.UtilityForMap;
import joookiwi.collection.java.method.GetFirstOrNull;
import joookiwi.collection.java.method.GetLastOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableSequencedMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableMap<K, V>
        implements ImmutableSequencedMap<K, V> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSequencedMap() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> firstEntry() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    @Override public joookiwi.collection.java.entry.@Nullable Entry<K, V> lastEntry() { return GetLastOrNull.getLastOrNull(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableSequencedMap<K, V> reversed() { return UtilityForMap.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public ImmutableSequencedSet<Entry<K, V>> entrySet() { return UtilityForMap.entries2(_reference()); }

    @Override public ImmutableSequencedSet<Entry<K, V>> sequencedEntrySet() { return entrySet(); }


    @Override public ImmutableSequencedSet<K> keySet() { return UtilityForMap.keys2(_reference()); }

    @Override public ImmutableSequencedSet<K> sequencedKeySet() { return keySet(); }


    @Override public ImmutableSequencedCollection<V> values() { return UtilityForMap.values2(_reference()); }

    @Override public ImmutableSequencedCollection<V> sequencedValues() { return values(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableSequencedMap<K, V> clone() { return (AbstractArrayAsImmutableSequencedMap<K, V>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
