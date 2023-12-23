package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.method.AsString.asLocaleLowerCaseString;

public final class ToLocaleLowerCaseString
        extends Utility {

    @Contract("-> fail")
    private ToLocaleLowerCaseString() { throw new ImpossibleConstructionException("The utility class \"ToToLocaleLowerCaseStringSet\" cannot be constructed.", ToLocaleLowerCaseString.class); }

    //#region -------------------- Facade method --------------------

    /**
     * Convert the {@code collection} to a {@link String} on every value
     * by calling its "<i>{@link String#toLowerCase(Locale)} toLowerCase(Locale)}</i>" method
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see String#toLowerCase(Locale)
     */
    @ExtensionFunction
    public static <T> @NotNull String toLocaleLowerCaseString(@Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __withNoLocale(collection);
    }

    /**
     * Convert the {@code collection} to a {@link String} on every value
     * by calling its "<i>{@link String#toLowerCase(Locale)} toLowerCase(Locale)}</i>" method
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param locale     The possible locale to apply on each value
     * @see String#toLowerCase(Locale)
     */
    @ExtensionFunction
    public static <T> @NotNull String toLocaleLowerCaseString(@Nullable CollectionHolder<? extends T> collection, @Nullable Locale locale) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        if (locale == null)
            return __withNoLocale(collection);
        return __withLocale(collection, locale);
    }

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Locale method --------------------

    private static @NotNull String __withNoLocale(@NotNull CollectionHolder<?> collection) {
        var string = new StringBuilder();
        var sizeMinus1 = collection.size() - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asLocaleLowerCaseString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    private static @NotNull String __withLocale(@NotNull CollectionHolder<?> collection, @NotNull Locale locale) {
        var string = new StringBuilder();
        var sizeMinus1 = collection.size() - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection.get(index), locale)).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_POSTFIX_STRING + string + asLocaleLowerCaseString(collection.get(index), locale) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Locale method --------------------

}
