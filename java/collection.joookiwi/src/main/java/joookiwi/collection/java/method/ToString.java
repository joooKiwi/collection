package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.method.AsString.asString;

@NotNullByDefault
public final class ToString
        extends Utility {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private ToString() { throw new ImpossibleConstructionException("The utility class “ToString” cannot be constructed.", ToString.class); }

    //#region -------------------- Facade method --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @see Object#toString()
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull String toString(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @see Object#toString()
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull String toString(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, collection.size());
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toString\(\)][Object#toString()]_" method
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @see Object#toString()
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull String toString(final T @Nullable [] collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        var size = collection.length;
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Loop method --------------------

    private static @NotNull String __toString(final @NotNull MinimalistCollectionHolder<?> collection,
                                              final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    private static @NotNull String __toString(final @Nullable Object @NotNull [] collection,
                                              final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asString(collection[index])).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asString(collection[index]) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Loop method --------------------

}
