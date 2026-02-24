package joookiwi.collection.java.method;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.extended.MutableArrayList;
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
public final class MutableArrayListCreator
        extends CreatorUtility {
    //TODO add values + initialCapacity as a possible arguments

    @Contract(ALWAYS_FAIL_0)
    private MutableArrayListCreator() { throw new ImpossibleConstructionException("The utility class “MutableArrayListCreator” cannot be constructed.", MutableArrayListCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList() { return new MutableArrayList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable MinimalistCollectionHolder<? extends T> values) { return ToMutableArrayList.toMutableArrayList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable CollectionHolder<? extends T> values) { return ToMutableArrayList.toMutableArrayList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final T @Nullable @Unmodifiable [] values) { return ToMutableArrayList.toMutableArrayList(values); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new MutableArrayList<>();
        if (values.isEmpty())
            return new MutableArrayList<>();
        return new MutableArrayList<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- initialCapacity --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final byte initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final short initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final int initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final long initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> MutableArrayList<T> MutableArrayList(final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return new MutableArrayList<>();
        return __newInstance(initialCapacity.get());
    }

    //#endregion -------------------- initialCapacity --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> MutableArrayList<T> __newInstance(final byte initialCapacity) {
        if (initialCapacity < 0)
            return new MutableArrayList<>(0);
        return new MutableArrayList<>(initialCapacity);
    }

    private static <T extends @Nullable Object> MutableArrayList<T> __newInstance(final short initialCapacity) {
        if (initialCapacity < 0)
            return new MutableArrayList<>(0);
        return new MutableArrayList<>(initialCapacity);
    }

    private static <T extends @Nullable Object> MutableArrayList<T> __newInstance(final int initialCapacity) {
        if (initialCapacity < 0)
            return new MutableArrayList<>(0);
        return new MutableArrayList<>(initialCapacity);
    }

    private static <T extends @Nullable Object> MutableArrayList<T> __newInstance(final long initialCapacity) {
        if (initialCapacity < 0)
            return new MutableArrayList<>(0);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return new MutableArrayList<>(MAX_INT_VALUE);
        return new MutableArrayList<>((int) initialCapacity);
    }

    //#endregion -------------------- Core methods --------------------

}
