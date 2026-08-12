package joookiwi.collection.java.optional;

import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@Singleton
@NotNullByDefault
public class EmptyOptional<T extends @Nullable Object>
        extends Optional<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyOptional<?> instance;

    protected EmptyOptional() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyOptional<T> getInstance() {
        final var instance = EmptyOptional.instance;
        if (instance != null)
            return (EmptyOptional<T>) instance;
        synchronized (EmptyOptional.class) {
            final var instance2 = EmptyOptional.instance;
            if (instance2 != null)
                return (EmptyOptional<T>) instance2;
            return (EmptyOptional<T>) (EmptyOptional.instance = new EmptyOptional<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

}
