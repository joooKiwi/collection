package joookiwi.collection.java.method;

import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

public final class AsString
        extends Utility {

    @Contract("-> fail")
    private AsString() { throw new ImpossibleConstructionException("The utility class \"AsString\" cannot be constructed.", AsString.class); }


    /**
     * Convert the {@code value} to a {@link String}
     *
     * @param value The value to convert
     */
    public static @NotNull String asString(@Nullable Object value) {
        if (value == null)
            return "null";
        if (value instanceof String)
            return (String) value;
        return value.toString();
    }


    /**
     * Convert the {@code value} to a {@link String} while handling the {@link Locale#getDefault() default locale}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLocaleString(@Nullable Object value) {
        if (value == null)
            return String.format(Locale.getDefault(), "%s", "null");
        return String.format(Locale.getDefault(), "%s", value);
    }

    /**
     * Convert the {@code value} to a {@link String} while handling the {@code locale}
     *
     * @param value  The value to convert
     * @param locale The locale to possibly apply
     */
    public static @NotNull String asLocaleString(@Nullable Object value, @Nullable Locale locale) {
        if (locale == null) {
            if (value == null)
                return String.format(Locale.getDefault(), "%s", "null");
            return String.format(Locale.getDefault(), "%s", value);
        }

        if (value == null)
            return String.format(locale, "%s", "null");
        return String.format(locale, "%s", value);
    }


    /**
     * Convert the {@code value} to a lowercase {@link String}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLowerCaseString(@Nullable Object value) {
        if (value == null)
            return "null";
        if (value instanceof String)
            return ((String) value).toLowerCase();
        return value.toString().toLowerCase();
    }


    /**
     * Convert the {@code value} to a lowercase {@link String} while handling the {@link Locale#getDefault() default locale}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLocaleLowerCaseString(@Nullable Object value) {
        var currentLocale = Locale.getDefault();

        if (value == null)
            return String.format(currentLocale, "%s", "null").toLowerCase(currentLocale);
        if (value instanceof String)
            return ((String) value).toLowerCase(currentLocale);
        return String.format(currentLocale, "%s", value).toLowerCase(currentLocale);
    }

    /**
     * Convert the {@code value} to a lowercase {@link String} while handling the {@code locale}
     *
     * @param value  The value to convert
     * @param locale The locale to possibly apply
     */
    public static @NotNull String asLocaleLowerCaseString(@Nullable Object value, @Nullable Locale locale) {
        if (locale == null) {
            var currentLocale = Locale.getDefault();

            if (value == null)
                return String.format(currentLocale, "%s", "null").toLowerCase(currentLocale);
            if (value instanceof String)
                return ((String) value).toLowerCase(currentLocale);
            return String.format(currentLocale, "%s", value).toLowerCase(currentLocale);
        }

        if (value == null)
            return String.format(locale, "%s", "null").toLowerCase(locale);
        if (value instanceof String)
            return ((String) value).toLowerCase(locale);
        return String.format(locale, "%s", value).toLowerCase(locale);
    }


    /**
     * Convert the {@code value} to an uppercase {@link String}
     *
     * @param value The value to convert
     */
    public static @NotNull String asUpperCaseString(@Nullable Object value) {
        if (value == null)
            return "NULL";
        if (value instanceof String)
            return ((String) value).toUpperCase();
        return value.toString().toUpperCase();
    }


    /**
     * Convert the {@code value} to an uppercase {@link String} while handling the {@link Locale#getDefault() default locale}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLocaleUpperCaseString(@Nullable Object value) {
        var currentLocale = Locale.getDefault();

        if (value == null)
            return String.format(currentLocale, "%s", "NULL").toUpperCase(currentLocale);
        if (value instanceof String)
            return ((String) value).toUpperCase(currentLocale);
        return String.format(currentLocale, "%s", value).toUpperCase(currentLocale);
    }

    /**
     * Convert the {@code value} to an uppercase {@link String} while handling the {@code locale}
     *
     * @param value  The value to convert
     * @param locale The locale to possibly apply
     */
    public static @NotNull String asLocaleUpperCaseString(@Nullable Object value, @Nullable Locale locale) {
        if (locale == null) {
            var currentLocale = Locale.getDefault();

            if (value == null)
                return String.format(currentLocale, "%s", "NULL").toUpperCase(currentLocale);
            if (value instanceof String)
                return ((String) value).toUpperCase(currentLocale);
            return String.format(currentLocale, "%s", value).toUpperCase(currentLocale);
        }

        if (value == null)
            return String.format(locale, "%s", "NULL").toUpperCase(locale);
        if (value instanceof String)
            return ((String) value).toUpperCase(locale);
        return String.format(locale, "%s", value).toUpperCase(locale);
    }

}
