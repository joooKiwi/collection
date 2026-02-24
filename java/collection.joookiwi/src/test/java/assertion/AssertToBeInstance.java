package assertion;

import java.util.function.Function;
import joookiwi.collection.java.CollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;

import static org.junit.jupiter.api.Assertions.assertSame;

@NotNullByDefault
public final class AssertToBeInstance {

    /// Do a partial test validation that the returned value by the `action` is equals (==) to the `instance`
    ///
    /// @param instance The instance to do an action
    /// @param action   The action to do and return a [CollectionHolder]
    /// @param <T>      The instance type
    public static <T extends CollectionHolder<?>> void assertToBeInstance(final T instance, final Function<T, CollectionHolder<?>> action) {
        assertSame(instance, action.apply(instance), "The instance received was not the returned value of the action.");
    }

}
