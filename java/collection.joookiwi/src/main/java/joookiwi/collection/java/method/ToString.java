package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.method.AsString.asString;

public final class ToString
        extends Utility {

    @Contract("-> fail")
    private ToString() { throw new ImpossibleConstructionException("The utility class \"ToString\" cannot be constructed.", ToString.class); }

    //#region -------------------- Facade method --------------------

    /**
     * Convert the {@code collection} to a {@link String} on every value
     * by calling its "<i>{@link Object#toString()} toString()}</i>" method
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see Object#toString()
     */
    @ExtensionFunction
    public static <T> @NotNull String toString(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;

        var string = new StringBuilder();
        var sizeMinus1 = collection.getSize() - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Facade method --------------------

}
