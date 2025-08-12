package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.LongConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public class EmptyLongIterator
        extends EmptyIterator<Long>
        implements PrimitiveIterator.OfLong {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyLongIterator instance;

    protected EmptyLongIterator() { super(); }

    public static EmptyLongIterator getInstance() {
        final var instance = EmptyLongIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyLongIterator.class) {
            final var instance2 = EmptyLongIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyLongIterator.instance = new EmptyLongIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public long nextLong() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable LongConsumer action) {}

}
