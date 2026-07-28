package joookiwi.collection.java.extended.iterator;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyByteIterator
        extends EmptyIterator<Byte>
        implements ByteIterator {

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

}
