package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.method.AsString.asUpperCaseString;

public final class ToUpperCaseString
        extends Utility {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private ToUpperCaseString() { throw new ImpossibleConstructionException("The utility class “ToUpperCaseString” cannot be constructed.", ToUpperCaseString.class); }

    //#region -------------------- Facade method --------------------

    /**
     * Convert the {@code collection} to a {@link String} on every value
     * by calling its "<i>{@link String#toUpperCase()} toUpperCase()}</i>" method
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @see String#toUpperCase()
     */
    @ExtensionFunction
    public static <T> @NotNull String toUpperCaseString(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    /**
     * Convert the {@code collection} to a {@link String} on every value
     * by calling its "<i>{@link String#toUpperCase()} toUpperCase()}</i>" method
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see String#toUpperCase()
     */
    @ExtensionFunction
    public static <T> @NotNull String toUpperCaseString(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, collection.size());
    }

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Loop method --------------------

    private static @NotNull String __toString(@NotNull MinimalistCollectionHolder<?> collection, int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asUpperCaseString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asUpperCaseString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Loop method --------------------

}
