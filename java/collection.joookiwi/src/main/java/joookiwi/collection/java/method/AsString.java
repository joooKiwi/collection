package joookiwi.collection.java.method;

import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Formatter;
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
        return value.toString();
    }


    /**
     * Convert the {@code value} to a {@link String} while handling the {@link Locale#getDefault() default locale}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLocaleString(@Nullable Object value) {
        if (value == null)
            return new Formatter(Locale.getDefault()).format("%s", "null").toString();
        return new Formatter(Locale.getDefault()).format("%s", value).toString();
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
                return new Formatter(Locale.getDefault()).format("%s", "null").toString();
            return new Formatter(Locale.getDefault()).format("%s", value).toString();
        }

        if (value == null)
            return new Formatter(locale).format("%s", "null").toString();
        return new Formatter(locale).format("%s", value).toString();
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
            return ((String) value).toLowerCase(Locale.ROOT);
        return value.toString().toLowerCase(Locale.ROOT);
    }


    /**
     * Convert the {@code value} to a lowercase {@link String} while handling the {@link Locale#getDefault() default locale}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLocaleLowerCaseString(@Nullable Object value) {
        var currentLocale = Locale.getDefault();

        if (value == null)
            return new Formatter(currentLocale).format("%s", "null").toString().toLowerCase(currentLocale);
        if (value instanceof String)
            return ((String) value).toLowerCase(currentLocale);
        return new Formatter(currentLocale).format("%s", value).toString().toLowerCase(currentLocale);
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


    /**
     * Convert the {@code value} to an uppercase {@link String}
     *
     * @param value The value to convert
     */
    public static @NotNull String asUpperCaseString(@Nullable Object value) {
        if (value == null)
            return "NULL";
        if (value instanceof String)
            return ((String) value).toUpperCase(Locale.ROOT);
        return value.toString().toUpperCase(Locale.ROOT);
    }


    /**
     * Convert the {@code value} to an uppercase {@link String} while handling the {@link Locale#getDefault() default locale}
     *
     * @param value The value to convert
     */
    public static @NotNull String asLocaleUpperCaseString(@Nullable Object value) {
        var currentLocale = Locale.getDefault();

        if (value == null)
            return new Formatter(currentLocale).format("%s", "NULL").toString().toUpperCase(currentLocale);
        if (value instanceof String)
            return ((String) value).toUpperCase(currentLocale);
        return new Formatter(currentLocale).format("%s", value).toString().toUpperCase(currentLocale);
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

}
