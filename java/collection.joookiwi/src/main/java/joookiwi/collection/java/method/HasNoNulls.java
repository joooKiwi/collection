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
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_TRUE_1;

@NotNullByDefault
public final class HasNoNulls
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private HasNoNulls() { throw new ImpossibleConstructionException("The utility class “HasNull” cannot be constructed.", HasNoNulls.class); }

    //#region -------------------- Facade methods --------------------

    /// The `collection` has no `null`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @return `true` no element is `null`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasNoNulls(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;

        final var size = collection.size();
        if (size == 0)
            return true;
        return __validate(collection, size);
    }

    /// The `collection` has no `null`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @return `true` no element is `null`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasNoNulls(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return true;
        if (collection.isEmpty())
            return true;
        return __validate(collection, collection.size());

    }

    /// The `collection` has no `null`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @return `true` no element is `null`
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_TRUE_1)
    public static <T extends @Nullable Object> boolean hasNoNulls(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return true;

        final var size = collection.length;
        if (size == 0)
            return true;
        return __validate(collection, size);
    }

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> boolean __validate(final MinimalistCollectionHolder<? extends T> collection,
                                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (collection.get(index) == null)
                return false;
        return true;
    }

    private static <T extends @Nullable Object> boolean __validate(final T @Unmodifiable [] collection,
                                                                   final int size) {
        var index = -1;
        while (++index < size)
            if (collection[index] == null)
                return false;
        return true;
    }

    //#endregion -------------------- Loop methods --------------------

}
