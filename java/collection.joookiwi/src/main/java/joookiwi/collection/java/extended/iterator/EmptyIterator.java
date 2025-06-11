package joookiwi.collection.java.extended.iterator;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;

@NotNullByDefault
public class EmptyIterator<T extends @Nullable Object>
        implements ImmutableListIterator<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyIterator<?> instance;

    protected EmptyIterator() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyIterator<T> getInstance() {
        final var instance = EmptyIterator.instance;
        if (instance != null)
            return (EmptyIterator<T>) instance;
        synchronized (EmptyIterator.class) {
            final var instance2 = EmptyIterator.instance;
            if (instance2 != null)
                return (EmptyIterator<T>) instance2;
            return (EmptyIterator<T>) (EmptyIterator.instance = new EmptyIterator<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Next methods --------------------

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasNext() { return false; }

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int nextIndex() { return 0; }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T next() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasPrevious() { return false; }

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int previousIndex() { return -1; }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T previous() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    //#endregion -------------------- Previous methods --------------------

    //#region -------------------- Loop methods --------------------

    @Contract(pure = true)           public void forEachRemaining(                                                   ) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable ObjIntConsumer<? super T> operation) {}
    @Contract(pure = true) @Override public void forEachRemaining(final @Nullable Consumer<? super T>       operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable Runnable                  operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable Object @Nullable ...        ignored) {}

    //#endregion -------------------- Loop methods --------------------

    //#region -------------------- Unsupported methods --------------------

    @Contract(ALWAYS_FAIL_0)
    @Override public void remove() { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Iterator."); }

    @Contract(ALWAYS_FAIL_1)
    @Override public void set(final T value) { throw new UnsupportedOperationException("The method “set” is not supported in an immutable ListIterator."); }

    @Contract(ALWAYS_FAIL_1)
    @Override public void add(final T value) { throw new UnsupportedOperationException("The method “add” is not supported in an immutable ListIterator."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}
