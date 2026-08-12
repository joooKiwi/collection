package joookiwi.collection.java.extended.map;

import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.EmptyConcurrentCollection;
import joookiwi.collection.java.extended.set.EmptyConcurrentSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@Singleton
@NotNullByDefault
public class EmptyConcurrentMap<K extends @Nullable Object,
        V extends @Nullable Object>
        extends EmptyMap<K, V>
        implements ImmutableConcurrentMap<K, V> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyConcurrentMap<?, ?> instance;

    protected EmptyConcurrentMap() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <K extends @Nullable Object, V extends @Nullable Object> EmptyConcurrentMap<K, V> getInstance() {
        final var instance = EmptyConcurrentMap.instance;
        if (instance != null)
            return (EmptyConcurrentMap<K, V>) instance;
        synchronized (EmptyConcurrentMap.class) {
            final var instance2 = EmptyConcurrentMap.instance;
            if (instance2 != null)
                return (EmptyConcurrentMap<K, V>) instance2;
            return (EmptyConcurrentMap<K, V>) (EmptyConcurrentMap.instance = new EmptyConcurrentMap<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Values methods --------------------

    @Override public EmptyConcurrentSet<Entry<K, V>> entrySet() { return EmptyConcurrentSet.getInstance(); }

    @Override public EmptyConcurrentSet<K> keySet() { return EmptyConcurrentSet.getInstance(); }

    @Override public EmptyConcurrentCollection<V> values() { return EmptyConcurrentCollection.getInstance(); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyConcurrentMap<K, V> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
