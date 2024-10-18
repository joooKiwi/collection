package joookiwi.collection.java.method;

import java.util.Formatter;
import java.util.Locale;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public final class AsString
        extends Utility {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private AsString() { throw new ImpossibleConstructionException("The utility class “AsString” cannot be constructed.", AsString.class); }

    //#region -------------------- Facade methods --------------------

    /// Convert the `value` to a [String]
    ///
    /// @param value The value to convert
    public static @NotNull String asString(final @Nullable Object value) {
        if (value == null)
            return "null";
        return value.toString();
    }


    /// Convert the `value` to a [String] while handling the [default locale][#getDefault()]
    ///
    /// @param value The value to convert
    public static @NotNull String asLocaleString(final @Nullable Object value) {
        if (value == null)
            return new Formatter(Locale.getDefault()).format("%s", "null").toString();
        return new Formatter(Locale.getDefault()).format("%s", value).toString();
    }

    /// Convert the `value` to a [String] while handling the `locale`
    ///
    /// @param value  The value to convert
    /// @param locale The locale to possibly apply
    public static @NotNull String asLocaleString(final @Nullable Object value, final @Nullable Locale locale) {
        if (locale == null) {
            if (value == null)
                return new Formatter(Locale.getDefault()).format("%s", "null").toString();
            return new Formatter(Locale.getDefault()).format("%s", value).toString();
        }

        if (value == null)
            return new Formatter(locale).format("%s", "null").toString();
        return new Formatter(locale).format("%s", value).toString();
    }


    /// Convert the `value` to a lowercase [String]
    ///
    /// @param value The value to convert
    public static @NotNull String asLowerCaseString(final @Nullable Object value) {
        if (value == null)
            return "null";
        if (value instanceof String)
            return ((String) value).toLowerCase(Locale.ROOT);
        return value.toString().toLowerCase(Locale.ROOT);
    }


    /// Convert the `value` to a lowercase [String] while handling the [default locale][#getDefault()]
    ///
    /// @param value The value to convert
    public static @NotNull String asLocaleLowerCaseString(final @Nullable Object value) {
        var currentLocale = Locale.getDefault();

        if (value == null)
            return new Formatter(currentLocale).format("%s", "null").toString().toLowerCase(currentLocale);
        if (value instanceof String)
            return ((String) value).toLowerCase(currentLocale);
        return new Formatter(currentLocale).format("%s", value).toString().toLowerCase(currentLocale);
    }

    /// Convert the `value` to a lowercase [String] while handling the `locale`
    ///
    /// @param value  The value to convert
    /// @param locale The locale to possibly apply
    public static @NotNull String asLocaleLowerCaseString(final @Nullable Object value, final @Nullable Locale locale) {
        if (locale == null) {
            var currentLocale = Locale.getDefault();

            if (value == null)
                return new Formatter(currentLocale).format("%s", "null").toString().toLowerCase(currentLocale);
            if (value instanceof String)
                return ((String) value).toLowerCase(currentLocale);
            return new Formatter(currentLocale).format("%s", value).toString().toLowerCase(currentLocale);
        }

        if (value == null)
            return new Formatter(locale).format("%s", "null").toString().toLowerCase(locale);
        if (value instanceof String)
            return ((String) value).toLowerCase(locale);
        return new Formatter(locale).format("%s", value).toString().toLowerCase(locale);
    }


    /// Convert the `value` to an uppercase [String]
    ///
    /// @param value The value to convert
    public static @NotNull String asUpperCaseString(final @Nullable Object value) {
        if (value == null)
            return "NULL";
        if (value instanceof String)
            return ((String) value).toUpperCase(Locale.ROOT);
        return value.toString().toUpperCase(Locale.ROOT);
    }


    /// Convert the `value` to an uppercase [String] while handling the [default locale][#getDefault()]
    ///
    /// @param value The value to convert
    public static @NotNull String asLocaleUpperCaseString(final @Nullable Object value) {
        var currentLocale = Locale.getDefault();

        if (value == null)
            return new Formatter(currentLocale).format("%s", "NULL").toString().toUpperCase(currentLocale);
        if (value instanceof String)
            return ((String) value).toUpperCase(currentLocale);
        return new Formatter(currentLocale).format("%s", value).toString().toUpperCase(currentLocale);
    }

    /// Convert the `value` to an uppercase [String] while handling the `locale`
    ///
    /// @param value  The value to convert
    /// @param locale The locale to possibly apply
    public static @NotNull String asLocaleUpperCaseString(final @Nullable Object value, final @Nullable Locale locale) {
        if (locale == null) {
            var currentLocale = Locale.getDefault();

            if (value == null)
                return new Formatter(currentLocale).format("%s", "NULL").toString().toUpperCase(currentLocale);
            if (value instanceof String)
                return ((String) value).toUpperCase(currentLocale);
            return new Formatter(currentLocale).format("%s", value).toString().toUpperCase(currentLocale);
        }

        if (value == null)
            return new Formatter(locale).format("%s", "NULL").toString().toUpperCase(locale);
        if (value instanceof String)
            return ((String) value).toUpperCase(locale);
        return new Formatter(locale).format("%s", value).toString().toUpperCase(locale);
    }

    //#endregion -------------------- Facade methods --------------------

}
