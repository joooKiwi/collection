package joookiwi.collection.java.extended.iterator;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyDoubleIterator
        extends EmptyIterator<Double>
        implements DoubleIterator {

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

}
