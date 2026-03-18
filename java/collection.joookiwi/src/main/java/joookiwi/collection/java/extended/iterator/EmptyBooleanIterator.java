package joookiwi.collection.java.extended.iterator;

import joookiwi.collection.java.callback.additional.BooleanConsumer;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyBooleanIterator
        extends EmptyIterator<Boolean>
        implements BooleanIterator {

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

    @Override public void forEachRemaining(final @Nullable BooleanConsumer action) {}

}
