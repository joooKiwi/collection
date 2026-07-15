package joookiwi.collection.java.tuple;

import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;

@Singleton
@NotNullByDefault
public class Empty<T extends @Nullable Object>
        implements Tuple<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable Empty<?> instance;

    protected Empty() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> Empty<T> getInstance() {
        final var instance = Empty.instance;
        if (instance != null)
            return (Empty<T>) instance;
        synchronized (Empty.class) {
            final var instance2 = Empty.instance;
            if (instance2 != null)
                return (Empty<T>) instance2;
            return (Empty<T>) (Empty.instance = new Empty<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }
    @Contract(pure = true) @Override public @Range(from = 0, to = 0) final int length() { return size(); }
    @Contract(pure = true) @Override public @Range(from = 0, to = 0) final int count() { return size(); }


    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean isNotEmpty() { return false; }


    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean hasAtLeast1Element() { return isNotEmpty(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsAtLeast1Element() { return isNotEmpty(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesAtLeast1Element() { return isNotEmpty(); }

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasExactly1Element() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsExactly1Element() { return hasExactly1Element(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesExactly1Element() { return hasExactly1Element(); }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean hasAtMost1Element() { return true; }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean containsAtMost1Element() { return hasAtMost1Element(); }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean includesAtMost1Element() { return hasAtMost1Element(); }


    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasAtLeast2Elements() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsAtLeast2Elements() { return hasAtLeast2Elements(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesAtLeast2Elements() { return hasAtLeast2Elements(); }

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasExactly2Elements() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean containsExactly2Elements() { return hasExactly2Elements(); }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public final boolean includesExactly2Elements() { return hasExactly2Elements(); }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean hasAtMost2Elements() { return true; }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean containsAtMost2Elements() { return hasAtMost2Elements(); }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public final boolean includesAtMost2Elements() { return hasAtMost2Elements(); }

    //#endregion -------------------- Size methods --------------------

    @Override public EmptyCollectionHolder<T> toCollection() { return EmptyCollectionHolder.getInstance(); }

    @Override public String toString() { return "Empty ()"; }

    @Override public Empty<T> clone() { return this; }

}
