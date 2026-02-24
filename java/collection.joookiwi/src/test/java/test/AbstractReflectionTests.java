package test;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/// An instance that hold the values of an [Array][java.lang.reflect.Array] and the associated [Class] type
/// to remove any boilerplate
@NotNullByDefault
public abstract class AbstractReflectionTests {

    public final @Nullable Object @Unmodifiable [] values;
    public final Class<?> @Unmodifiable [] types;

    public AbstractReflectionTests(final @Nullable Object @Unmodifiable [] values, final Class<?> @Unmodifiable [] types) {
        this.values = values;
        this.types = types;
    }

}
