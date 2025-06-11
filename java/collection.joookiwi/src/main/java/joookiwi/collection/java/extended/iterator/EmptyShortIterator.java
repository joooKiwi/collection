package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public class EmptyShortIterator
        extends EmptyIterator<Short>
        implements PrimitiveIterator<Short, ShortConsumer> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyShortIterator instance;

    protected EmptyShortIterator() { super(); }

    public static EmptyShortIterator getInstance() {
        final var instance = EmptyShortIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyShortIterator.class) {
            final var instance2 = EmptyShortIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyShortIterator.instance = new EmptyShortIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) public short nextShort() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable ShortConsumer action) {}

}
