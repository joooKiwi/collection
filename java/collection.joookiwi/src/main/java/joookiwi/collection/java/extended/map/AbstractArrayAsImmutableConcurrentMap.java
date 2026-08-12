package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.extended.ImmutableConcurrentCollection;
import joookiwi.collection.java.extended.ImmutableSequencedCollection;
import joookiwi.collection.java.extended.UtilityForMap;
import joookiwi.collection.java.extended.set.ImmutableConcurrentSet;
import joookiwi.collection.java.extended.set.ImmutableSequencedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableConcurrentMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends AbstractArrayAsImmutableMap<K, V>
        implements ImmutableConcurrentMap<K, V> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableConcurrentMap() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Values methods --------------------

    @Override public ImmutableConcurrentSet<Entry<K, V>> entrySet() { return UtilityForMap.entries(this, _reference()); }

    @Override public ImmutableConcurrentSet<K> keySet() { return UtilityForMap.keys(this, _reference()); }

    @Override public ImmutableConcurrentCollection<V> values() { return UtilityForMap.values(this, _reference()); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableConcurrentMap<K, V> clone() { return (AbstractArrayAsImmutableConcurrentMap<K, V>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
