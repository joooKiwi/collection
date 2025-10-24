package helper;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNullByDefault;

import static org.junit.jupiter.api.Assertions.fail;

@NotNullByDefault
public final class GetField {

    /// Get the static field of the `clazz` received having the specified `name`.
    /// The argument is supposed to be a [String].
    ///
    /// @param clazz The class to retrieve the static field
    /// @param name  The field name
    /// @throws RuntimeException The failed assertion did not throw (it should not happen normally)
    public static String getStaticStringField(final Class<?> clazz, final @NonNls String name) {
        try {
            return clazz.getField(name).get(null).toString();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            fail("IllegalAccessException|NoSuchFieldException was thrown on “getStaticStringField”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “getStaticStringField” call if IllegalAccessException|NoSuchFieldException occurred.");
        }
    }

    /// Get the static field of the `clazz` received having the specified `name`.
    /// The argument is supposed to be a `boolean`.
    ///
    /// @param clazz The class to retrieve the static field
    /// @param name  The field name
    /// @throws RuntimeException The failed assertion did not throw (it should not happen normally)
    public static boolean getStaticBooleanField(final Class<?> clazz, final @NonNls String name) {
        try {
            return clazz.getField(name).getBoolean(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            fail("IllegalAccessException|NoSuchFieldException was thrown on “getStaticBooleanField”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “getStaticBooleanField” call if IllegalAccessException|NoSuchFieldException occurred.");
        }
    }

}
