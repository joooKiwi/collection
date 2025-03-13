package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public final class HasNull
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasNull() { throw new ImpossibleConstructionException("The utility class “HasNull” cannot be constructed.", HasNull.class); }

    //#region -------------------- Facade methods --------------------

    /// The `collection` has at least one `null`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @return `true` only if one element is `null`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasNull(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;

        var size = collection.size();
        if (size == 0)
            return false;
        return __hasNull(collection, size);
    }

    /// The `collection` has at least one `null`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @return `true` only if one element is `null`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasNull(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return false;
        if (collection.isEmpty())
            return false;
        return __hasNull(collection, collection.size());

    }

    /// The `collection` has at least one `null`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @return `true` only if one element is `null`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FALSE_1)
    public static <T extends @Nullable Object> boolean hasNull(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return false;

        var size = collection.length;
        if (size == 0)
            return false;
        return __hasNull(collection, size);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> boolean __hasNull(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                  final int size) {
        var index = -1;
        while (++index < size)
            if (collection.get(index) == null)
                return true;
        return false;
    }

    private static <T extends @Nullable Object> boolean __hasNull(final T @NotNull @Unmodifiable [] collection,
                                                                  final int size) {
        var index = -1;
        while (++index < size)
            if (collection[index] == null)
                return true;
        return false;
    }

    //#endregion -------------------- Loop methods --------------------

}
