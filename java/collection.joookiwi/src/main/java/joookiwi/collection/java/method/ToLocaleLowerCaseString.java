package joookiwi.collection.java.method;

import java.util.Locale;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.method.AsString.asLocaleLowerCaseString;

public final class ToLocaleLowerCaseString
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private ToLocaleLowerCaseString() { throw new ImpossibleConstructionException("The utility class “ToLocaleLowerCaseString” cannot be constructed.", ToLocaleLowerCaseString.class); }

    //#region -------------------- Facade method --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[#toLowerCase(Locale)] toLowerCase(Locale)}_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T> @NotNull String toLocaleLowerCaseString(@Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __withNoLocale(collection, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[#toLowerCase(Locale)] toLowerCase(Locale)}_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T> @NotNull String toLocaleLowerCaseString(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __withNoLocale(collection, collection.size());
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- locale --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[#toLowerCase(Locale)] toLowerCase(Locale)}_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param locale     The possible locale to apply on each value
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T> @NotNull String toLocaleLowerCaseString(@Nullable MinimalistCollectionHolder<? extends T> collection, @Nullable Locale locale) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        if (locale == null)
            return __withNoLocale(collection, size);
        return __withLocale(collection, locale, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[#toLowerCase(Locale)] toLowerCase(Locale)}_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param locale     The possible locale to apply on each value
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T> @NotNull String toLocaleLowerCaseString(@Nullable CollectionHolder<? extends T> collection, @Nullable Locale locale) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        if (locale == null)
            return __withNoLocale(collection, collection.size());
        return __withLocale(collection, locale, collection.size());
    }

    //#endregion -------------------- locale --------------------

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Locale method --------------------

    private static @NotNull String __withNoLocale(@NotNull MinimalistCollectionHolder<?> collection, int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asLocaleLowerCaseString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    private static @NotNull String __withLocale(@NotNull MinimalistCollectionHolder<?> collection, @NotNull Locale locale, int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection.get(index), locale)).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asLocaleLowerCaseString(collection.get(index), locale) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Locale method --------------------

}
