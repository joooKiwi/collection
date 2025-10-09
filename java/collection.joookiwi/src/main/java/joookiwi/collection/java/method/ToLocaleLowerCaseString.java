package joookiwi.collection.java.method;

import java.util.Locale;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_POSTFIX;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_PREFIX_STRING;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_JOIN_SEPARATOR;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.method.AsString.asLocaleLowerCaseString;

@NotNullByDefault
public final class ToLocaleLowerCaseString
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private ToLocaleLowerCaseString() { throw new ImpossibleConstructionException("The utility class “ToLocaleLowerCaseString” cannot be constructed.", ToLocaleLowerCaseString.class); }

    //#region -------------------- Facade method --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(locale\)][String#toLowerCase(Locale)]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLocaleLowerCaseString(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __withNoLocale(collection, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(locale\)][String#toLowerCase(Locale)]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLocaleLowerCaseString(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        return __withNoLocale(collection, collection.size());
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(locale\)][String#toLowerCase(Locale)]_" method
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLocaleLowerCaseString(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.length;
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        return __withNoLocale(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- locale --------------------

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(locale\)][String#toLowerCase(Locale)]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param locale     The possible locale to apply on each value
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLocaleLowerCaseString(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                              final @Nullable Locale locale) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.size();
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        if (locale == null)
            return __withNoLocale(collection, size);
        return __withLocale(collection, locale, size);
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(locale\)][String#toLowerCase(Locale)]_" method
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param locale     The possible locale to apply on each value
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLocaleLowerCaseString(final @Nullable CollectionHolder<? extends T> collection,
                                                                              final @Nullable Locale locale) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;
        if (collection.isEmpty())
            return DEFAULT_EMPTY_COLLECTION;
        if (locale == null)
            return __withNoLocale(collection, collection.size());
        return __withLocale(collection, locale, collection.size());
    }

    /// Convert the `collection` to a [String] on every value
    /// by calling its "_[toLowerCase\(locale\)][String#toLowerCase(Locale)]_" method
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param locale     The possible locale to apply on each value
    /// @see String#toLowerCase(Locale)
    @ExtensionFunction
    public static <T extends @Nullable Object> String toLocaleLowerCaseString(final T @Nullable @Unmodifiable [] collection,
                                                                              final @Nullable Locale locale) {
        if (collection == null)
            return DEFAULT_EMPTY_COLLECTION;

        final var size = collection.length;
        if (size == 0)
            return DEFAULT_EMPTY_COLLECTION;
        if (locale == null)
            return __withNoLocale(collection, size);
        return __withLocale(collection, locale, size);
    }

    //#endregion -------------------- locale --------------------

    //#endregion -------------------- Facade method --------------------
    //#region -------------------- Locale method --------------------

    private static <T extends @Nullable Object> String __withNoLocale(final MinimalistCollectionHolder<? extends T> collection,
                                                                      final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection.get(index))).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_PREFIX_STRING + string + asLocaleLowerCaseString(collection.get(index)) + DEFAULT_JOIN_POSTFIX;
    }

    private static <T extends @Nullable Object> String __withNoLocale(final T @Unmodifiable [] collection,
                                                                      final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection[index])).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_PREFIX_STRING + string + asLocaleLowerCaseString(collection[index]) + DEFAULT_JOIN_POSTFIX;
    }


    private static <T extends @Nullable Object> String __withLocale(final MinimalistCollectionHolder<? extends T> collection,
                                                                    final Locale locale,
                                                                    final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection.get(index), locale)).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_PREFIX_STRING + string + asLocaleLowerCaseString(collection.get(index), locale) + DEFAULT_JOIN_POSTFIX;
    }

    private static <T extends @Nullable Object> String __withLocale(final T @Unmodifiable [] collection,
                                                                    final Locale locale,
                                                                    final int size) {
        var string = new StringBuilder();
        var sizeMinus1 = size - 1;
        var index = -1;
        while (++index < sizeMinus1)
            string.append(asLocaleLowerCaseString(collection[index], locale)).append(DEFAULT_JOIN_SEPARATOR);
        return DEFAULT_JOIN_PREFIX_STRING + string + asLocaleLowerCaseString(collection[index], locale) + DEFAULT_JOIN_POSTFIX;
    }

    //#endregion -------------------- Locale method --------------------

}
