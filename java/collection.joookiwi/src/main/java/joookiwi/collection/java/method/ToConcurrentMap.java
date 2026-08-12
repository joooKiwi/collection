package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.map.ArrayAsImmutableConcurrentMap;
import joookiwi.collection.java.extended.map.EmptyConcurrentMap;
import joookiwi.collection.java.extended.map.ImmutableConcurrentMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToConcurrentMap
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToConcurrentMap() { throw new ImpossibleConstructionException("The utility class “ToConcurrentMap” cannot be constructed.", ToConcurrentMap.class); }

    //#region -------------------- Facade methods --------------------

    /// Convert the `collection` to an [ImmutableConcurrentMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableConcurrentMap<Integer, T> toConcurrentMap(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyConcurrentMap.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyConcurrentMap.getInstance();
        return new ArrayAsImmutableConcurrentMap<>(_associativeValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableConcurrentMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableConcurrentMap<Integer, T> toConcurrentMap(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyConcurrentMap.getInstance();
        if (collection.isEmpty())
            return EmptyConcurrentMap.getInstance();
        return new ArrayAsImmutableConcurrentMap<>(_associativeValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableConcurrentMap]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableConcurrentMap<Integer, T> toConcurrentMap(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyConcurrentMap.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyConcurrentMap.getInstance();
        return new ArrayAsImmutableConcurrentMap<>(_associativeValues(collection, size));
    }

    //#endregion -------------------- Facade methods --------------------

}
