package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_OR_ELSE_1ST_1;

@NotNullByDefault
public final class RequireNoNulls
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private RequireNoNulls() { throw new ImpossibleConstructionException("The utility class “RequireNotNull” cannot be constructed.", RequireNoNulls.class); }

    //#region -------------------- Facade methods --------------------

    /// Require that no items are `null` in the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>          The `collection` type
    /// @throws NullPointerException There is a `null` or the `collection` is null
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_1ST_1)
    public static <T> MinimalistCollectionHolder<T> requireNoNulls(final @Nullable MinimalistCollectionHolder<@Nullable T> collection) {
        if (collection == null)
            throw new NullPointerException("Forbidden null value. The current collection cannot be null.");

        final var size = collection.size();
        if (size == 0)
            return collection;

        var index = -1;
        while(++index < size)
            if (collection.get(index) == null)
                throw new NullPointerException("Forbidden null value. The current collection cannot contains a null value.");
        return collection;
    }

    /// Require that no items are `null` in the `collection`
    ///
    /// @param collection   The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>          The `collection` type
    /// @throws NullPointerException There is a `null` or the `collection` is null
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_1ST_1)
    public static <T> CollectionHolder<T> requireNoNulls(final @Nullable CollectionHolder<@Nullable T> collection) {
        if (collection == null)
            throw new NullPointerException("Forbidden null value. The current collection cannot be null.");
        if (collection.isEmpty())
            return collection;

        final var size = collection.size();
        var index = -1;
        while(++index < size)
            if (collection.get(index) == null)
                throw new NullPointerException("Forbidden null value. The current collection cannot contains a null value.");
        return collection;
    }

    /// Require that no items are `null` in the `collection`
    ///
    /// @param collection   The [nullable][Nullable] collection
    /// @param <T>          The `collection` type
    /// @throws NullPointerException There is a `null` or the `collection` is null
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_OR_ELSE_1ST_1)
    public static <T> T[] requireNoNulls(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            throw new NullPointerException("Forbidden null value. The current collection cannot be null.");

        final var size = collection.length;
        if (size == 0)
            return collection;

        var index = -1;
        while(++index < size)
            if (collection[index] == null)
                throw new NullPointerException("Forbidden null value. The current collection cannot contains a null value.");
        return collection;
    }

    //#endregion -------------------- Facade methods --------------------

}
