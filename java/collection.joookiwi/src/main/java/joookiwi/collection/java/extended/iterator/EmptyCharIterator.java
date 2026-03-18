package joookiwi.collection.java.extended.iterator;

import joookiwi.collection.java.callback.additional.CharConsumer;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public class EmptyCharIterator
        extends EmptyIterator<Character>
        implements CharIterator {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyCharIterator instance;

    protected EmptyCharIterator() { super(); }

    public static EmptyCharIterator getInstance() {
        final var instance = EmptyCharIterator.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyCharIterator.class) {
            final var instance2 = EmptyCharIterator.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyCharIterator.instance = new EmptyCharIterator());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    @Override public void forEachRemaining(final @Nullable CharConsumer action) {}

}
