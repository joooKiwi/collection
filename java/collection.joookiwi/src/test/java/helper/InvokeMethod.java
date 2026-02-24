package helper;

import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static org.junit.jupiter.api.Assertions.fail;

@NotNullByDefault
public final class InvokeMethod {

    public static @Nullable Object invokeMethod(final Object instance, final String name, final Class<?> @Unmodifiable [] types, final @Nullable Object @Unmodifiable [] values) {
        try {
            return instance.getClass().getMethod(name, types).invoke(instance, values);
        } catch (IllegalAccessException e) {
            fail("IllegalAccessException was thrown on “invokeMethod”. The method exist, but it is not accessible.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “invokeMethod” call if IllegalAccessException occurred.");
        } catch (NoSuchMethodException e) {
            fail("NoSuchFieldException was thrown on “invokeMethod”. No method had the definition received.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “invokeMethod” call if NoSuchFieldException occurred.");
        } catch (InvocationTargetException e) {
            fail("InvocationTargetException was thrown on “invokeMethod”. An error occurred on the invoked method.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “invokeMethod” call if InvocationTargetException occurred.");
        }
    }

}
