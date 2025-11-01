package test;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TransferQueue;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static org.junit.jupiter.api.Assertions.fail;

/// An instance that describe the sub-instance class with a meaningful utility method
/// to remove any boilerplate
@NotNullByDefault
public abstract class AbstractJavaTransferQueueTests {

    /// The [Class] of [TransferQueue] that should be used for the tests
    public final Class<TransferQueue<?>> instanceClass;
    public final @Nullable @Unmodifiable TransferQueue<?> nullValue;

    protected AbstractJavaTransferQueueTests(final Class<TransferQueue<?>> instanceClass,
                                             final @Nullable @Unmodifiable TransferQueue<?> nullValue) {
        this.instanceClass = instanceClass;
        this.nullValue = nullValue;
    }

    /// Create a new instance from the field [#instanceClass] with the array received onto the constructor `Object[]`
    ///
    /// @param values The array to create the instance
    /// @param <T>    The instance type
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> TransferQueue<T> newInstance(final T @Unmodifiable [] values) {
        try {
            return (TransferQueue<T>) instanceClass.getConstructor(Object[].class).newInstance((Object) values);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            fail("InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException was thrown on “newInstance”.", e);
            throw new RuntimeException("Assertions.fail was expected to throw an exception on “newInstance” call if InstantiationException|IllegalAccessException|InvocationTargetException|NoSuchFieldException occurred.");
        }
    }

    /// Give the [#nullValue] casted to a typed [TransferQueue]
    @Contract(ALWAYS_NULL_0)
    @SuppressWarnings("unchecked cast")
    public <T extends @Nullable Object> @Nullable @Unmodifiable TransferQueue<T> nullInstance() { return (TransferQueue<T>) nullValue; }

}
