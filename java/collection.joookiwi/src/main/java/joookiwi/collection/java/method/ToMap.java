package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.map.ArrayAsImmutableMap;
import joookiwi.collection.java.extended.map.EmptyMap;
import joookiwi.collection.java.extended.map.ImmutableMap;
import joookiwi.collection.java.extended.set.ImmutableSortedSet;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;

@NotNullByDefault
public final class ToMap
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToMap() {
        throw new ImpossibleConstructionException("The utility class “ToMap” cannot be constructed.", ToMap.class);
    }

    //#region -------------------- Facade methods --------------------

    /// Convert the `collection` to an [ImmutableMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableMap<Integer, T> toMap(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyMap.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyMap.getInstance();
        return new ArrayAsImmutableMap<>(_associativeValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableMap<Integer, T> toMap(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyMap.getInstance();
        if (collection.isEmpty())
            return EmptyMap.getInstance();
        return new ArrayAsImmutableMap<>(_associativeValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableMap]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableMap<Integer, T> toMap(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyMap.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyMap.getInstance();
        return new ArrayAsImmutableMap<>(_associativeValues(collection, size));
    }

    //#endregion -------------------- Facade methods --------------------

}
