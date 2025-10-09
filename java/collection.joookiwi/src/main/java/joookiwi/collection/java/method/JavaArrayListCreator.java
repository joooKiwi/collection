package joookiwi.collection.java.method;

import java.util.ArrayList;
import java.util.Collection;
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
public final class JavaArrayListCreator
        extends CreatorUtility {
    //TODO add values + initialCapacity as a possible arguments

    @Contract(ALWAYS_FAIL_0)
    private JavaArrayListCreator() { throw new ImpossibleConstructionException("The utility class “JavaArrayListCreator” cannot be constructed.", JavaArrayListCreator.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    @Contract(ALWAYS_NEW_0)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList() { return new ArrayList<>(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable MinimalistCollectionHolder<? extends T> values) {
        if (values == null)
            return new ArrayList<>();

        final var size = values.size();
        if (size == 0)
            return new ArrayList<>(); // We do not keep the empty array any longer.

        final var newInstance = new ArrayList<T>(size);
        var index = -1;
        while (++index < size)
            newInstance.set(index, values.get(index));
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable CollectionHolder<T> values) {
        if (values == null)
            return new ArrayList<>();
        return new ArrayList<>(values.toCollection());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final T @Nullable @Unmodifiable [] values) {
        if (values == null)
            return new ArrayList<>();

        final var size = values.length;
        if (size == 0)
            return new ArrayList<>(); // We do not keep the empty array any longer.

        final var newInstance = new ArrayList<T>(size);
        var index = -1;
        while (++index < size)
            newInstance.set(index, values[index]);
        return newInstance;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable @Unmodifiable Collection<? extends T> values) {
        if (values == null)
            return new ArrayList<>();
        if (values.isEmpty())
            return new ArrayList<>();
        return new ArrayList<>(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- initial capacity --------------------

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final byte initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final short initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final int initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final long initialCapacity) { return __newInstance(initialCapacity); }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable Byte initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable Short initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable Integer initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable Long initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity);
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable AtomicInteger initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable AtomicLong initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity.get());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable LongAdder initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity.sum());
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> ArrayList<T> JavaArrayList(final @Nullable LongAccumulator initialCapacity) {
        if (initialCapacity == null)
            return new ArrayList<>();
        return __newInstance(initialCapacity.get());
    }

    //#endregion -------------------- initial capacity --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    private static <T extends @Nullable Object> ArrayList<T> __newInstance(final byte initialCapacity) {
        if (initialCapacity < 0)
            return new ArrayList<>(0);
        return new ArrayList<>(initialCapacity);
    }

    private static <T extends @Nullable Object> ArrayList<T> __newInstance(final short initialCapacity) {
        if (initialCapacity < 0)
            return new ArrayList<>(0);
        return new ArrayList<>(initialCapacity);
    }

    private static <T extends @Nullable Object> ArrayList<T> __newInstance(final int initialCapacity) {
        if (initialCapacity < 0)
            return new ArrayList<>(0);
        return new ArrayList<>(initialCapacity);
    }

    private static <T extends @Nullable Object> ArrayList<T> __newInstance(final long initialCapacity) {
        if (initialCapacity < 0)
            return new ArrayList<>(0);
        if (initialCapacity > MAX_INT_VALUE_AS_LONG)
            return new ArrayList<>(MAX_INT_VALUE);
        return new ArrayList<>((int) initialCapacity);
    }

    //#endregion -------------------- Core methods --------------------

}
