package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import java.util.function.IntConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public class EmptyIntIterator
        extends EmptyIterator<Integer>
        implements PrimitiveIterator.OfInt {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyIntIterator instance;

    protected EmptyIntIterator() { super(); }

    public static EmptyIntIterator getInstance() {
        final var instance = EmptyIntIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyIntIterator.class) {
            final var instance2 = EmptyIntIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyIntIterator.instance = new EmptyIntIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public int nextInt() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable IntConsumer action) {}

}
