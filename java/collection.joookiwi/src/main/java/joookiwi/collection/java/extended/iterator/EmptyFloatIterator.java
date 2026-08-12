package joookiwi.collection.java.extended.iterator;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyFloatIterator
        extends EmptyIterator<Float>
        implements FloatIterator {

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

}
