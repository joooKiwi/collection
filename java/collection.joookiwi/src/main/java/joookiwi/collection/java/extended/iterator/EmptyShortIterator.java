package joookiwi.collection.java.extended.iterator;

import joookiwi.collection.java.callback.additional.ShortConsumer;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyShortIterator
        extends EmptyIterator<Short>
        implements ShortIterator {

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

    @Override public void forEachRemaining(final @Nullable ShortConsumer action) {}

}
