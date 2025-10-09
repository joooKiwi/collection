package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE_AS_LONG;

@NotNullByDefault
public final class JavaVectorCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private JavaVectorCreator() { throw new ImpossibleConstructionException("The utility class “JavaVectorCreator” cannot be constructed.", JavaVectorCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> Vector<T> JavaVector() { return new Vector<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new Vector<>();

        final var size = values.size();
        if (size == 0)
            return new Vector<>(); // We do not keep the empty array any longer.

        final var newInstance = new Vector<T>(size);
        var index = -1;
        while (++index < size)
            newInstance.set(index, values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable CollectionHolder<T> values) {
        if (values == null)
            return new Vector<>();
        return new Vector<>(values.toCollection());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new Vector<>();

        final var size = values.length;
        if (size == 0)
            return new Vector<>(); // We do not keep the empty array any longer.

        final var newInstance = new Vector<T>(size);
        var index = -1;
        while (++index < size)
            newInstance.set(index, values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new Vector<>();
        if (values.isEmpty())
            return new Vector<>();
        return new Vector<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- initialCapacity --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final byte initialCapacity) { return __newJavaInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final short initialCapacity) { return __newJavaInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final int initialCapacity) { return __newJavaInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final long initialCapacity) { return __newJavaInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> Vector<T> JavaVector(final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return new Vector<>();
        return __newJavaInstance(initialCapacity.get());
    }

    //#endregion -------------------- initialCapacity --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> Vector<T> __newJavaInstance(final byte initialCapacity) {
        if (initialCapacity < 0)
            return new Vector<>(0);
        return new Vector<>(initialCapacity);
    }

    private static <T extends @Nullable Object> Vector<T> __newJavaInstance(final short initialCapacity) {
        if (initialCapacity < 0)
            return new Vector<>(0);
        return new Vector<>(initialCapacity);
    }

    private static <T extends @Nullable Object> Vector<T> __newJavaInstance(final int initialCapacity) {
        if (initialCapacity < 0)
            return new Vector<>(0);
        return new Vector<>(initialCapacity);
    }

    private static <T extends @Nullable Object> Vector<T> __newJavaInstance(final long initialCapacity) {
        if (initialCapacity < 0)
            return new Vector<>(0);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return new Vector<>(MAX_INT_VALUE);
        return new Vector<>((int) initialCapacity);
    }

    //#endregion -------------------- Core methods --------------------

}
