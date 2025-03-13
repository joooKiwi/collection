package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

import static joookiwi.collection.java.CollectionConstants.*;
import static joookiwi.collection.java.CommonContracts.*;

/// A [Singleton] implementation of the [java.util.concurrent.CopyOnWriteArrayList],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see java.util.Collections#emptyList()
/// @see joookiwi.collection.java.CollectionConstants#emptyCopyOnWriteArrayList
@Singleton
@NotNullByDefault
public class EmptyCopyOnWriteArrayList<T>
        extends ImmutableCopyOnWriteArrayList<T> {

    @Serial private static final long serialVersionUID = 6214178640104982090L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyCopyOnWriteArrayList<?> __instance;

    protected EmptyCopyOnWriteArrayList() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyCopyOnWriteArrayList<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyCopyOnWriteArrayList<T>) instance;
        synchronized (EmptyCopyOnWriteArrayList.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyCopyOnWriteArrayList<T>) instance2;
            return (EmptyCopyOnWriteArrayList<T>) (__instance = new EmptyCopyOnWriteArrayList<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_FAIL_1, pure = true) @Override public T get(int index) { throw new NoSuchElementException("No element could be found in an empty ArrayList."); }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getFirst() { throw new NoSuchElementException("No element could be found in an empty ArrayList."); }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getLast() { throw new NoSuchElementException("No element could be found in an empty ArrayList."); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int indexOf(@Nullable Object value) { return -1; }
    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int indexOf(final @Nullable T value, final int index) { return -1; }

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int lastIndexOf(@Nullable Object value) { return -1; }
    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int lastIndexOf(final @Nullable T value, final int index) { return -1; }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(value = ALWAYS_FALSE_1, pure = true) @Override public boolean contains(final @Nullable Object value) { return false; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean containsAll(final @Nullable @Unmodifiable Collection<?> values) {
        if (values == null)
            return false;
        return values.isEmpty();
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Contract(pure = true) @Override public void forEach(final @Nullable Consumer<? super T> action) {}

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Contract(pure = true) @Override public @NotNull Iterator<T>     iterator(                   ) { return emptyIterator(); }
    @Contract(pure = true) @Override public @NotNull ListIterator<T> listIterator(               ) { return emptyListIterator(); }
    @Contract(pure = true) @Override public @NotNull ListIterator<T> listIterator(final int index) { return emptyListIterator(); }
    @Contract(pure = true) @Override public @NotNull Spliterator<T>  spliterator(                ) { return emptySpliterator(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public     Object @NotNull [] toArray(                                                   ) { return new Object[0]; }
    @Contract(value = ALWAYS_1ST_1, pure = true) @Override public <U> U @NotNull []      toArray(final U @NotNull []                           array) { return array; }
    @Contract(pure = true)                       @Override public <U> U @NotNull []      toArray(final @NotNull IntFunction<U @NotNull []> generator) { return generator.apply(0); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true) @Override public @NotNull Stream<T> stream() { return emptyStream(); }

    @Contract(pure = true) @Override public @NotNull Stream<T> parallelStream() { return emptyParellelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Sublist methods --------------------

    @Override public @NotNull List<T> subList(int fromIndex, int toIndex) { return emptyList(); }

    //#endregion -------------------- Sublist methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public @NotNull @Unmodifiable CopyOnWriteArrayList<T> reversed() { return this; }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- Equals methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int hashCode() { return DEFAULT_EMPTY_HASH_CODE; }

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true) @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof List<?>))
            return false;
        return ((Collection<?>) other).isEmpty();
    }

    //#endregion -------------------- Equals methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyCopyOnWriteArrayList<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true) @Override public String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
