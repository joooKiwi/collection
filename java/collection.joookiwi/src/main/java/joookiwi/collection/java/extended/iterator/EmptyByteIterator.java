package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public class EmptyByteIterator
        extends EmptyIterator<Byte>
        implements PrimitiveIterator<Byte, ByteConsumer> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyByteIterator instance;

    protected EmptyByteIterator() { super(); }

    public static EmptyByteIterator getInstance() {
        final var instance = EmptyByteIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyByteIterator.class) {
            final var instance2 = EmptyByteIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyByteIterator.instance = new EmptyByteIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Contract(value = ALWAYS_FAIL_0, pure = true) public byte nextByte() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable ByteConsumer action) {}

}
