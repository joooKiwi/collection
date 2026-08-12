package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.map.ArrayAsImmutableSortedMap;
import joookiwi.collection.java.extended.map.EmptySortedMap;
import joookiwi.collection.java.extended.map.ImmutableSortedMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToSortedMap
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToSortedMap() { throw new ImpossibleConstructionException("The utility class “ToSortedMap” cannot be constructed.", ToSortedMap.class); }

    //#region -------------------- Facade methods --------------------

    /// Convert the `collection` to an [ImmutableSortedMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSortedMap<Integer, T> toSortedMap(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptySortedMap.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptySortedMap.getInstance();
        return new ArrayAsImmutableSortedMap<>(_associativeValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableSortedMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSortedMap<Integer, T> toSortedMap(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptySortedMap.getInstance();
        if (collection.isEmpty())
            return EmptySortedMap.getInstance();
        return new ArrayAsImmutableSortedMap<>(_associativeValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableSortedMap]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSortedMap<Integer, T> toSortedMap(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptySortedMap.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptySortedMap.getInstance();
        return new ArrayAsImmutableSortedMap<>(_associativeValues(collection, size));
    }

    //#endregion -------------------- Facade methods --------------------

}
