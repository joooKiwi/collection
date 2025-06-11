package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.DoubleConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public class EmptyDoubleIterator
        extends EmptyIterator<Double>
        implements PrimitiveIterator.OfDouble {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyDoubleIterator instance;

    protected EmptyDoubleIterator() { super(); }

    public static EmptyDoubleIterator getInstance() {
        final var instance = EmptyDoubleIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyDoubleIterator.class) {
            final var instance2 = EmptyDoubleIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyDoubleIterator.instance = new EmptyDoubleIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public double nextDouble() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable DoubleConsumer action) {}

}
