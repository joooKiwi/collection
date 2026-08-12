package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.map.ArrayAsImmutableConcurrentNavigableMap;
import joookiwi.collection.java.extended.map.EmptyConcurrentNavigableMap;
import joookiwi.collection.java.extended.map.ImmutableConcurrentNavigableMap;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToConcurrentNavigableMap
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToConcurrentNavigableMap() { throw new ImpossibleConstructionException("The utility class “ToConcurrentNavigableMap” cannot be constructed.", ToConcurrentNavigableMap.class); }

    //#region -------------------- Facade methods --------------------

    /// Convert the `collection` to an [ImmutableConcurrentNavigableMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyConcurrentNavigableMap.getInstance();

        final var size = collection.size();
        if (size == 0)
            return EmptyConcurrentNavigableMap.getInstance();
        return new ArrayAsImmutableConcurrentNavigableMap<>(_associativeValues(collection, size));
    }

    /// Convert the `collection` to an [ImmutableConcurrentNavigableMap]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyConcurrentNavigableMap.getInstance();
        if (collection.isEmpty())
            return EmptyConcurrentNavigableMap.getInstance();
        return new ArrayAsImmutableConcurrentNavigableMap<>(_associativeValues(collection, collection.size()));
    }

    /// Convert the `collection` to an [ImmutableConcurrentNavigableMap]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> ImmutableConcurrentNavigableMap<Integer, T> toConcurrentNavigableMap(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyConcurrentNavigableMap.getInstance();

        final var size = collection.length;
        if (size == 0)
            return EmptyConcurrentNavigableMap.getInstance();
        return new ArrayAsImmutableConcurrentNavigableMap<>(_associativeValues(collection, size));
    }

    //#endregion -------------------- Facade methods --------------------

}
