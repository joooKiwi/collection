package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public class EmptyBooleanIterator
        extends EmptyIterator<Boolean>
        implements PrimitiveIterator<Boolean, BooleanConsumer> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyBooleanIterator instance;

    protected EmptyBooleanIterator() { super(); }

    public static EmptyBooleanIterator getInstance() {
        final var instance = EmptyBooleanIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyBooleanIterator.class) {
            final var instance2 = EmptyBooleanIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyBooleanIterator.instance = new EmptyBooleanIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) public byte nextBoolean() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable BooleanConsumer action) {}

}
