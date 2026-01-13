package test;

import java.lang.reflect.InvocationTargetException;
import java.util.Deque;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static org.junit.jupiter.api.Assertions.fail;

/// An instance that describe the sub-instance class with a meaningful utility method
/// to remove any boilerplate
@NotNullByDefault
public abstract class AbstractJavaDequeTests {

    /// The [Class] of [Deque] that should be used for the tests
    public final Class<Deque<?>> instanceClass;

    protected AbstractJavaDequeTests(final Class<Deque<?>> instanceClass) { this.instanceClass = instanceClass; }

    /// Create a new instance from the field [#instanceClass] with the array received onto the constructor `Object[]`
    ///
    /// @param values The array to create the instance
    /// @param <T>    The instance type
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> Deque<T> newInstance(final T @Unmodifiable [] values) {
        try {
            return (Deque<T>) instanceClass.getConstructor(Object[].class).newInstance((Object) values);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            fail("InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException was thrown on “newInstance”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “newInstance” call if InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException occurred.");
        }
    }

    /// Give `null` to a typed [Deque]
    @Contract(ALWAYS_NULL_0)
    public <T extends @Nullable Object> @Nullable @Unmodifiable Deque<T> nullInstance() { return null; }

}
