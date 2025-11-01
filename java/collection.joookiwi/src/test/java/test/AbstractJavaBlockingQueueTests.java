package test;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.BlockingQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static org.junit.jupiter.api.Assertions.fail;

/// An instance that describe the sub-instance class with a meaningful utility method
/// to remove any boilerplate
@NotNullByDefault
public abstract class AbstractJavaBlockingQueueTests {

    /// The [Class] of [BlockingQueue] that should be used for the tests
    public final Class<BlockingQueue<?>> instanceClass;
    public final @Nullable @Unmodifiable BlockingQueue<?> nullValue;

    protected AbstractJavaBlockingQueueTests(final Class<BlockingQueue<?>> instanceClass,
                                             final @Nullable @Unmodifiable BlockingQueue<?> nullValue) {
        this.instanceClass = instanceClass;
        this.nullValue = nullValue;
    }

    /// Create a new instance from the field [#instanceClass] with the array received onto the constructor `Object[]`
    ///
    /// @param values The array to create the instance
    /// @param <T>    The instance type
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> BlockingQueue<T> newInstance(final T @Unmodifiable [] values) {
        try {
            return (BlockingQueue<T>) instanceClass.getConstructor(Object[].class).newInstance((Object) values);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            fail("InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException was thrown on “newInstance”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “newInstance” call if InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException occurred.");
        }
    }

    /// Give the [#nullValue] casted to a typed [BlockingQueue]
    @Contract(ALWAYS_NULL_0)
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> @Nullable @Unmodifiable BlockingQueue<T> nullInstance() { return (BlockingQueue<T>) nullValue; }

}
