package instance;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static org.junit.jupiter.api.Assertions.fail;

/// A bare-bone implementation of a [CollectionHolderForTest] with `null` being the value
///
/// @param <T>                The type
/// @param <INSTANCE>         The instance type (_can be anything since always `null`_)
/// @param <CURRENT_INSTANCE> The current instance type
@NotNullByDefault
public abstract class AbstractNullCollectionHolderForTest<T extends @Nullable Object,
        INSTANCE,
        CURRENT_INSTANCE extends AbstractNullCollectionHolderForTest<T, INSTANCE, CURRENT_INSTANCE>>
        extends AbstractCollectionHolderForTest<T, CURRENT_INSTANCE> {

    public final @Nullable INSTANCE instance = null;

    protected AbstractNullCollectionHolderForTest() { super(); }

    @Contract(ALWAYS_FAIL_0) @Override public final int getAmountOfCall() { return fail("The getter method “amountOfCall” was not expected to be called on an extension function only test instance."); }

    @Override public final T get(final int index) { return fail("The method “get” was not expected to be called directly."); }

    @Contract(ALWAYS_FAIL_0)
    @Override public final int size() { return fail("The method “size” was not expected to be called directly."); }

}
