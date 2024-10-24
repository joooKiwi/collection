package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.CommonContracts.*;

/// A [Singleton] implementation of the [java.util.concurrent.CopyOnWriteArraySet],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see Collections#emptySet
/// @see joookiwi.collection.java.CollectionConstants#emptyHashSet
@Singleton
@NotNullByDefault
public class EmptyCopyOnWriteArraySet<T>
        extends ImmutableCopyOnWriteArraySet<T> {

    @Serial private static final long serialVersionUID = -5412334794975800243L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyCopyOnWriteArraySet<?> __instance;

    protected EmptyCopyOnWriteArraySet() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyCopyOnWriteArraySet<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyCopyOnWriteArraySet<T>) instance;
        synchronized (EmptyCopyOnWriteArraySet.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyCopyOnWriteArraySet<T>) instance2;
            return (EmptyCopyOnWriteArraySet<T>) (__instance = new EmptyCopyOnWriteArraySet<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) public @Override @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) public @Override boolean isEmpty() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(value = ALWAYS_FALSE_1, pure = true) public @Override boolean contains(final @Nullable Object value) { return false; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) public @Override boolean containsAll(final @Nullable Collection<?> values) {
        if (values == null)
            return false;
        return values.isEmpty();
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Contract(pure = true) public @Override void forEach(final @Nullable Consumer<? super T> action) {}

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(pure = true) public @Override @NotNull Iterator<T>    iterator(   ) { return emptyIterator(); }
    @Contract(pure = true) public @Override @NotNull Spliterator<T> spliterator() { return emptySpliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true)           public @Override     Object @NotNull [] toArray(                                                   ) { return new Object[0]; }
    @Contract(value = ALWAYS_1ST_PARAMETER_1, pure = true) public @Override <U> U @NotNull []      toArray(final U @NotNull []                           array) { return array; }
    @Contract(pure = true)                                 public @Override <U> U @NotNull []      toArray(final @NotNull IntFunction<U @NotNull []> generator) { return generator.apply(0); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true) public @Override @NotNull Stream<T> stream() { return emptyStream(); }

    @Contract(pure = true) public @Override @NotNull Stream<T> parallelStream() { return emptyParellelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Equals methods --------------------

    @Contract(pure = true) public @Override @Range(from = 0, to = 0) int hashCode() { return DEFAULT_EMPTY_HASH_CODE; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) public @Override boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Set<?>))
            return false;
        return ((Collection<?>) other).isEmpty();
    }

    //#endregion -------------------- Equals methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyCopyOnWriteArraySet<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true) public @Override String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
