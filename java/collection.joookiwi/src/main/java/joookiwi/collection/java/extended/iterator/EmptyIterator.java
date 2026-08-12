package joookiwi.collection.java.extended.iterator;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class EmptyIterator<T extends @Nullable Object>
        implements ImmutableListIterator<T>,
                   ImmutableEnumeration<T> {

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

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasMoreElements() { return false; }
    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasNext() { return false; }

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) int nextIndex() { return 0; }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T       nextElement() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T       next()        { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public boolean nextBoolean() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public char    nextChar()    { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public byte    nextByte()    { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public short   nextShort()   { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public int     nextInt()     { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public long    nextLong()    { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public float   nextFloat()   { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public double  nextDouble()  { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    @Contract(value = ALWAYS_FALSE_0, pure = true) @Override public boolean hasPrevious() { return false; }

    @Contract(pure = true) @Override public @Range(from = -1, to = -1) int previousIndex() { return -1; }

    @Contract(value = ALWAYS_FAIL_0, pure = true) @Override public T       previous()        { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public boolean previousBoolean() { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public char    previousChar()    { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public byte    previousByte()    { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public short   previousShort()   { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public int     previousInt()     { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public long    previousLong()    { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public float   previousFloat()   { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }
    @Contract(value = ALWAYS_FAIL_0, pure = true)           public double  previousDouble()  { throw new NoElementFoundInCollectionException("An empty iterator has no value to retrieve."); }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Loop methods --------------------

    @Contract(pure = true)           public void forEachRemaining(                                                             ) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable ObjIntConsumer<? super @Nullable T> operation) {}
    @Contract(pure = true) @Override public void forEachRemaining(final @Nullable Consumer<? super @Nullable T>       operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable BooleanConsumer                     operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable CharConsumer                        operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable ByteConsumer                        operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable IntConsumer                         operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable LongConsumer                        operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable FloatConsumer                       operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable DoubleConsumer                      operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable Runnable                            operation) {}
    @Contract(pure = true)           public void forEachRemaining(final @Nullable Object @Nullable ...                  ignored) {}

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- As iterator --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyIterator<T> asIterator() { return this; }

    //#endregion -------------------- As iterator --------------------

    //#endregion -------------------- Methods --------------------

}
