package joookiwi.collection.java.extended.iterator;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyIntIterator
        extends EmptyIterator<Integer>
        implements IntIterator {

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

}
