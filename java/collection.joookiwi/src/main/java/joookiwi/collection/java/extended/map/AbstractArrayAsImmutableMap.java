package joookiwi.collection.java.extended.map;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import joookiwi.collection.java.extended.ImmutableCollection;
import joookiwi.collection.java.extended.ImmutableSet;
import joookiwi.collection.java.extended.UtilityForMap;
import joookiwi.collection.java.extended.iterator.ArrayAsImmutableIterator;
import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.helper.HashCodeCreator;
import joookiwi.collection.java.method.ForEach;
import joookiwi.collection.java.method.ToString;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableMap<K extends @Nullable Object,
        V extends @Nullable Object>
        implements ImmutableMap<K, V> {

    //#region -------------------- Fields --------------------

    protected @Nullable Integer _hashCode;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableMap() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /// The reference to do calculation and retrieval
    protected abstract joookiwi.collection.java.entry.Entry<K, V>[] _reference();

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Override public abstract @Range(from = 0, to = MAX_INT_VALUE) int size();

    @Override public boolean isEmpty() { return size() == 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Override public @Nullable V get(final @Nullable Object key) { return UtilityForMap.get(_reference(), key); }

    @Override public V getOrDefault(final @Nullable Object key, final V defaultValue) { return UtilityForMap.getOrDefault(_reference(), key, defaultValue); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Override public boolean containsKey(final @Nullable Object key) { return UtilityForMap.hasKey(_reference(), key); }

    @Override public boolean containsValue(final @Nullable Object value) { return UtilityForMap.hasValue(_reference(), value); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(final Consumer<? super joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> action) { ForEach.forEach(_reference(), action); }

    @Override public void forEach(final BiConsumer<? super K, ? super V> action) { UtilityForMap.forEach(_reference(), action); }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Values methods --------------------

    @Override public ImmutableSet<Entry<K, V>> entrySet() { return UtilityForMap.entries1(_reference()); }

    @Override public ImmutableSet<K> keySet() { return UtilityForMap.keys1(_reference()); }

    @Override public ImmutableCollection<V> values() { return UtilityForMap.values1(_reference()); }

    //#endregion -------------------- Values methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ImmutableIterator<joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> iterator() { return new ArrayAsImmutableIterator<>(_reference()); }

    @Override public @Unmodifiable Spliterator<joookiwi.collection.java.entry.Entry<? extends K, ? extends V>> spliterator() { return Arrays.spliterator(_reference()); }

    //#endregion -------------------- Iterator methods --------------------



    //#region -------------------- Comparison methods --------------------

    @Override public int hashCode() {
        final var value = _hashCode;
        if (value != null)
            return value;
        return _hashCode = HashCodeCreator.getInstance().newHashCode(_reference());
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Map<?, ?> otherConverted))
            return false;

        final var size = size();
        if (size != otherConverted.size())
            return false;

        try {
            final var reference = _reference();
            var index = -1;
            while (++index < size) {
                final var entry = reference[index];
                final var key = entry.getKey();
                final var value = entry.getValue();
                if (value == null)
                    if (!otherConverted.containsKey(key))
                        return false;
                    else if (otherConverted.get(key) != null)
                        return false;
                    else
                        continue;
                if (!Objects.deepEquals(value, otherConverted.get(key)))
                    return false;
            }
        } catch (ClassCastException | NullPointerException _) {
            return false;
        }

        return true;
    }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    public boolean equals(final @Nullable Map<?, ?> other) {
        if (other == null)
            return false;
        if (other == this)
            return true;

        final var size = size();
        if (size != other.size())
            return false;

        try {
            final var reference = _reference();
            var index = -1;
            while (++index < size) {
                final var entry = reference[index];
                final var key = entry.getKey();
                final var value = entry.getValue();
                if (value == null)
                    if (!other.containsKey(key))
                        return false;
                    else if (other.get(key) != null)
                        return false;
                    else
                        continue;
                if (!Objects.deepEquals(value, other.get(key)))
                    return false;
            }
        } catch (ClassCastException | NullPointerException _) {
            return false;
        }

        return true;
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableMap<K, V> clone() {
        try {
            return (AbstractArrayAsImmutableMap<K, V>) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnexpectedCloneableExceptionThrownError(getClass(), exception);
        }
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return ToString.toString(_reference()); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------


}
