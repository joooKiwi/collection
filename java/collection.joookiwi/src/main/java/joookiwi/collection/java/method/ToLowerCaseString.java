package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_POSTFIX;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_PREFIX_STRING;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_SEPARATOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.method.AsString.asLowerCaseString;

@NotNullByDefault
@NonNls
public final class ToLowerCaseString
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private ToLowerCaseString() { throw new ImpossibleConstructionException("The utility class “ToLowerCaseString” cannot be constructed.", ToLowerCaseString.class); }

    //#region -------------------- Facade method --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(\)][String#toLowerCase()]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @see String#toLowerCase()
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLowerCaseString(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(\)][String#toLowerCase()]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @see String#toLowerCase()
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLowerCaseString(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, collection.size());
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(\)][String#toLowerCase()]_" method
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @see String#toLowerCase()
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLowerCaseString(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.length;
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __toString(collection, size);
    }

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Loop method --------------------

    private static <T extends @Nullable Object> String __toString(final MinimalistCollectionHolder<? extends T> collection,
                                                                  final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLowerCaseString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_PREFIX_STRING + string + asLowerCaseString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    private static <T extends @Nullable Object> String __toString(final T @Unmodifiable [] collection,
                                                                  final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLowerCaseString(collection[index])).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_PREFIX_STRING + string + asLowerCaseString(collection[index]) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Loop method --------------------

}
