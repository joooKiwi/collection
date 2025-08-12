package joookiwi.collection.java.extended.iterator;

import java.util.PrimitiveIterator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public class EmptyCharIterator
        extends EmptyIterator<Character>
        implements PrimitiveIterator<Character, CharConsumer> {

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

    @Contract(value = ALWAYS_FAIL_0, pure = true) public char nextChar() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    @Override public void forEachRemaining(final @Nullable CharConsumer action) {}

}
