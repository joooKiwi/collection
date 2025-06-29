package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class EmptyBlockingDeque<T>
        extends EmptyDeque<T>
        implements ImmutableBlockingDeque<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyBlockingDeque<?> __instance;

    protected EmptyBlockingDeque() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyBlockingDeque<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyBlockingDeque<T>) instance;
        synchronized (EmptyBlockingDeque.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyBlockingDeque<T>) instance2;
            return (EmptyBlockingDeque<T>) (__instance = new EmptyBlockingDeque<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int remainingCapacity() { return 0; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyBlockingDeque<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}
