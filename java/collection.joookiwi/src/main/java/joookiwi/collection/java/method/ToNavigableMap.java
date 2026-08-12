package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.map.ArrayAsImmutableNavigableMap;
import joookiwi.collection.java.extended.map.EmptyNavigableMap;
import joookiwi.collection.java.extended.map.ImmutableNavigableMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToNavigableMap
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToNavigableMap() { throw new ImpossibleConstructionException("The utility class “ToNavigableMap” cannot be constructed.", ToNavigableMap.class); }

    //#region -------------------- Facade methods --------------------

    /// Convert the `collection` to an [ImmutableNavigableMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableNavigableMap<Integer, T> toNavigableMap(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyNavigableMap.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyNavigableMap.getInstance();
        return new ArrayAsImmutableNavigableMap<>(_associativeValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableNavigableMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableNavigableMap<Integer, T> toNavigableMap(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyNavigableMap.getInstance();
        if (collection.isEmpty())
            return EmptyNavigableMap.getInstance();
        return new ArrayAsImmutableNavigableMap<>(_associativeValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableNavigableMap]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableNavigableMap<Integer, T> toNavigableMap(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyNavigableMap.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyNavigableMap.getInstance();
        return new ArrayAsImmutableNavigableMap<>(_associativeValues(collection, size));
    }

    //#endregion -------------------- Facade methods --------------------

}
