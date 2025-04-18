package joookiwi.collection.java.extended;

import joookiwi.collection.java.annotation.Singleton;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import java.io.Serial;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;

import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_COLLECTION;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_HASH_CODE;
import static joookiwi.collection.java.CollectionConstants.emptyEnumeration;
import static joookiwi.collection.java.CollectionConstants.emptyIterator;
import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CollectionConstants.emptyListIterator;
import static joookiwi.collection.java.CollectionConstants.emptyParallelStream;
import static joookiwi.collection.java.CollectionConstants.emptySpliterator;
import static joookiwi.collection.java.CollectionConstants.emptyStream;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A [Singleton] implementation of the [Stack],
/// but in an empty form
///
/// @param <T> The type of the element
/// @see joookiwi.collection.java.CollectionConstants#emptyStack
@Singleton
@NotNullByDefault
public class EmptyStack<T>
        extends ImmutableStack<T>
        implements Cloneable {

    @Serial private static final long serialVersionUID = 4387819917296724707L;

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyStack<?> __instance;

    protected EmptyStack() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyStack<T> getInstance() {
        final var instance = __instance;
        if (instance != null)
            return (EmptyStack<T>) instance;
        synchronized (EmptyStack.class) {
            final var instance2 = __instance;
            if (instance2 != null)
                return (EmptyStack<T>) instance2;
            return (EmptyStack<T>) (__instance = new EmptyStack<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int size() { return 0; }
    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int capacity() { return 0; }

    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean isEmpty() { return true; }
    @Contract(value = ALWAYS_TRUE_0, pure = true) @Override public boolean empty() { return true; }


    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(value = ALWAYS_NULL_0, pure = true)
    @Override public @Nullable T peek() { return null; }

    @Contract(value = ALWAYS_FAIL_1, pure = true) @Override public T get(final int index) { throw new NoSuchElementException("No element could be found in an empty Stack."); }
    @Contract(value = ALWAYS_FAIL_1, pure = true) @Override public T elementAt(final int index) { throw new NoSuchElementException("No element could be found in an empty Stack."); }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getFirst() { throw new NoSuchElementException("No element could be found in an empty Stack."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T firstElement() { throw new NoSuchElementException("No element could be found in an empty Stack."); }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T getLast() { throw new NoSuchElementException("No element could be found in an empty Stack."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T lastElement() { throw new NoSuchElementException("No element could be found in an empty Stack."); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int search(final Object value) { return -1; }

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int indexOf(final @Nullable Object value) { return -1; }
    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int indexOf(final @Nullable Object value, final int index) { return -1; }

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int lastIndexOf(final @Nullable Object value) { return -1; }
    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int lastIndexOf(final @Nullable Object value, final int index) { return -1; }

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

    @Contract(pure = true) @Override public Iterator<T>     iterator(                   ) { return emptyIterator(); }
    @Contract(pure = true) @Override public ListIterator<T> listIterator(               ) { return emptyListIterator(); }
    @Contract(pure = true) @Override public ListIterator<T> listIterator(final int index) { return emptyListIterator(); }
    @Contract(pure = true) @Override public Spliterator<T>  spliterator(                ) { return emptySpliterator(); }
    @Contract(pure = true) @Override public Enumeration<T>  elements(                   ) { return emptyEnumeration(); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true) @Override public     Object[] toArray(                                ) { return new Object[0]; }
    @Contract(value = ALWAYS_1ST_1, pure = true) @Override public <U> U[]      toArray(final U[]                  array) { return array; }
    @Contract(pure = true)                       @Override public <U> U[]      toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(pure = true) @Override public Stream<T> stream() { return emptyStream(); }

    @Contract(pure = true) @Override public Stream<T> parallelStream() { return emptyParallelStream(); }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Sublist methods --------------------

    @Override public @Unmodifiable List<T> subList(final int from, final int to) { return emptyList(); }

    //#endregion -------------------- Sublist methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public @Unmodifiable Stack<T> reversed() { return this; }

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

    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public EmptyStack<T> clone() { return this; }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- Copy into methods --------------------

    @Override public void copyInto(final @Nullable Object @Nullable @Unmodifiable [] reference) {}

    //#endregion -------------------- Copy into methods --------------------
    //#region -------------------- To string methods --------------------

    @Contract(pure = true) @Override public String toString() { return DEFAULT_EMPTY_COLLECTION; }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}
