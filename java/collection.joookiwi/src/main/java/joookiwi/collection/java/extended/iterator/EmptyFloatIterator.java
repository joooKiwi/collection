package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public class EmptyFloatIterator
        extends EmptyIterator<Float>
        implements PrimitiveIterator<Float, FloatConsumer> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyFloatIterator instance;

    protected EmptyFloatIterator() { super(); }

    public static EmptyFloatIterator getInstance() {
        final var instance = EmptyFloatIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyFloatIterator.class) {
            final var instance2 = EmptyFloatIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyFloatIterator.instance = new EmptyFloatIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) public float nextFloat() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable FloatConsumer action) {}

}
