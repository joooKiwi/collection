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
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.method.AsString.asUpperCaseString;

@NotNullByDefault
public final class ToUpperCaseString
        extends Utility {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private ToUpperCaseString() { throw new ImpossibleConstructionException("The utility class “ToUpperCaseString” cannot be constructed.", ToUpperCaseString.class); }

    //#region -------------------- Facade method --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toUpperCase\(\)][String#toUpperCase()]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @see String#toUpperCase()
    @ExtensionFunction
    public static <T> @NotNull String toUpperCaseString(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toUpperCase\(\)][String#toUpperCase()]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @see String#toUpperCase()
    @ExtensionFunction
    public static <T> @NotNull String toUpperCaseString(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, collection.size());
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toUpperCase\(\)][String#toUpperCase()]_" method
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @see String#toUpperCase()
    @ExtensionFunction
    public static <T> @NotNull String toUpperCaseString(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.length;
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Loop method --------------------

    private static <T> @NotNull String __toString(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                  final int size) {
        final var string = new StringBuilder();
        final var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asUpperCaseString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asUpperCaseString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    private static <T> @NotNull String __toString(final T @NotNull @Unmodifiable [] collection,
                                                  final int size) {
        final var string = new StringBuilder();
        final var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asUpperCaseString(collection[index])).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asUpperCaseString(collection[index]) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Loop method --------------------

}
