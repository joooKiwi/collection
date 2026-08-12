package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.map.ArrayAsImmutableSequencedMap;
import joookiwi.collection.java.extended.map.EmptySequencedMap;
import joookiwi.collection.java.extended.map.ImmutableSequencedMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToSequencedMap
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToSequencedMap() { throw new ImpossibleConstructionException("The utility class “ToSequencedMap” cannot be constructed.", ToSequencedMap.class); }

    //#region -------------------- Facade methods --------------------

    /// Convert the `collection` to an [ImmutableSequencedMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSequencedMap<Integer, T> toSequencedMap(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptySequencedMap.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptySequencedMap.getInstance();
        return new ArrayAsImmutableSequencedMap<>(_associativeValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableSequencedMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSequencedMap<Integer, T> toSequencedMap(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptySequencedMap.getInstance();
        if (collection.isEmpty())
            return EmptySequencedMap.getInstance();
        return new ArrayAsImmutableSequencedMap<>(_associativeValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableSequencedMap]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableSequencedMap<Integer, T> toSequencedMap(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptySequencedMap.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptySequencedMap.getInstance();
        return new ArrayAsImmutableSequencedMap<>(_associativeValues(collection, size));
    }

    //#endregion -------------------- Facade methods --------------------

}
