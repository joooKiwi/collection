package joookiwi.collection.java.extended.iterator;

import java.util.function.LongConsumer;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyLongIterator
        extends EmptyIterator<Long>
        implements LongIterator {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyLongIterator instance;

    protected EmptyLongIterator() { super(); }

    public static EmptyLongIterator getInstance() {
        final var instance = EmptyLongIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyLongIterator.class) {
            final var instance2 = EmptyLongIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyLongIterator.instance = new EmptyLongIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Override public void forEachRemaining(final @Nullable LongConsumer action) {}

}
