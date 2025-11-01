package instance;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

@NotNullByDefault
public abstract class AbstractValueCollectionHolderForTest<T extends @Nullable Object,
        CURRENT_INSTANCE extends AbstractValueCollectionHolderForTest<T, CURRENT_INSTANCE>>
        extends AbstractCollectionHolderForTest<T, CURRENT_INSTANCE> {

    /// The array received in the constructor
    public final T @Unmodifiable [] array;

    protected AbstractValueCollectionHolderForTest(final T @Unmodifiable [] array) {
        super();
        this.array = array;
    }

}
