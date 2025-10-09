package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableVector;
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
public final class MutableVectorCreator
        extends CreatorUtility {

    @Contract(ALWAYS_FAIL_0)
    private MutableVectorCreator() { throw new ImpossibleConstructionException("The utility class “MutableVectorCreator” cannot be constructed.", MutableVectorCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector() { return new MutableVector<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableVector.toMutableVector(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable CollectionHolder<? extends T> values) { return ToMutableVector.toMutableVector(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final T @Nullable @Unmodifiable [] values) { return ToMutableVector.toMutableVector(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableVector<>();
        if (values.isEmpty())
            return new MutableVector<>();
        return new MutableVector<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- initialCapacity --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final byte initialCapacity) { return __newMutableInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final short initialCapacity) { return __newMutableInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final int initialCapacity) { return __newMutableInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final long initialCapacity) { return __newMutableInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableVector<T> MutableVector(final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return new MutableVector<>();
        return __newMutableInstance(initialCapacity.get());
    }

    //#endregion -------------------- initialCapacity --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> MutableVector<T> __newMutableInstance(final byte initialCapacity) {
        if (initialCapacity < 0)
            return new MutableVector<>(0);
        return new MutableVector<>(initialCapacity);
    }
    private static <T extends @Nullable Object> MutableVector<T> __newMutableInstance(final short initialCapacity) {
        if (initialCapacity < 0)
            return new MutableVector<>(0);
        return new MutableVector<>(initialCapacity);
    }
    private static <T extends @Nullable Object> MutableVector<T> __newMutableInstance(final int initialCapacity) {
        if (initialCapacity < 0)
            return new MutableVector<>(0);
        return new MutableVector<>(initialCapacity);
    }
    private static <T extends @Nullable Object> MutableVector<T> __newMutableInstance(final long initialCapacity) {
        if (initialCapacity < 0)
            return new MutableVector<>(0);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return new MutableVector<>(MAX_INT_VALUE);
        return new MutableVector<>((int) initialCapacity);
    }

    //#endregion -------------------- Core methods --------------------

}
